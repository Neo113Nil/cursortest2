package com.google.re2j;

/* loaded from: classes9.dex */
final class Inst {
    public static final int ALT = 1;
    public static final int ALT_MATCH = 2;
    public static final int CAPTURE = 3;
    public static final int EMPTY_WIDTH = 4;
    public static final int FAIL = 5;
    public static final int MATCH = 6;
    public static final int NOP = 7;
    public static final int RUNE = 8;
    public static final int RUNE1 = 9;
    public static final int RUNE_ANY = 10;
    public static final int RUNE_ANY_NOT_NL = 11;
    int arg;
    int op;
    int out;
    int[] runes;

    static boolean isRuneOp(int i) {
        return 8 <= i && i <= 11;
    }

    Inst(int i) {
        this.op = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        r0 = r1.length / 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        if (r1 >= r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
    
        r4 = ((r0 - r1) / 2) + r1;
        r5 = r8.runes;
        r6 = r4 * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r5[r6] > r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        if (r9 > r5[r6 + 1]) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
    
        r1 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean matchRune(int i) {
        int[] iArr = this.runes;
        if (iArr.length == 1) {
            int i2 = iArr[0];
            if (i == i2) {
                return true;
            }
            if ((this.arg & 1) != 0) {
                for (int simpleFold = com.google.re2j.Unicode.simpleFold(i2); simpleFold != i2; simpleFold = com.google.re2j.Unicode.simpleFold(simpleFold)) {
                    if (i == simpleFold) {
                        return true;
                    }
                }
            }
            return false;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.runes;
            if (i3 >= iArr2.length || i3 > 8) {
                break;
            }
            if (i < iArr2[i3]) {
                return false;
            }
            if (i <= iArr2[i3 + 1]) {
                return true;
            }
            i3 += 2;
        }
    }

    public final java.lang.String toString() {
        switch (this.op) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("alt -> ");
                sb.append(this.out);
                sb.append(", ");
                sb.append(this.arg);
                return sb.toString();
            case 2:
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("altmatch -> ");
                sb2.append(this.out);
                sb2.append(", ");
                sb2.append(this.arg);
                return sb2.toString();
            case 3:
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cap ");
                sb3.append(this.arg);
                sb3.append(" -> ");
                sb3.append(this.out);
                return sb3.toString();
            case 4:
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("empty ");
                sb4.append(this.arg);
                sb4.append(" -> ");
                sb4.append(this.out);
                return sb4.toString();
            case 5:
                return "fail";
            case 6:
                return "match";
            case 7:
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("nop -> ");
                sb5.append(this.out);
                return sb5.toString();
            case 8:
                if (this.runes == null) {
                    return "rune <null>";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rune ");
                sb6.append(escapeRunes(this.runes));
                sb6.append((this.arg & 1) != 0 ? "/i" : "");
                sb6.append(" -> ");
                sb6.append(this.out);
                return sb6.toString();
            case 9:
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("rune1 ");
                sb7.append(escapeRunes(this.runes));
                sb7.append(" -> ");
                sb7.append(this.out);
                return sb7.toString();
            case 10:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("any -> ");
                sb8.append(this.out);
                return sb8.toString();
            case 11:
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("anynotnl -> ");
                sb9.append(this.out);
                return sb9.toString();
            default:
                throw new java.lang.IllegalStateException("unhandled case in Inst.toString");
        }
    }

    private static java.lang.String escapeRunes(int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('\"');
        for (int i : iArr) {
            com.google.re2j.Utils.escapeRune(sb, i);
        }
        sb.append('\"');
        return sb.toString();
    }
}
