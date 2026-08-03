package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ek extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1984 = 82;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1985 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1986 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.lang.String f1987;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f1988;

    public ek(com.ironsource.adqualitysdk.sdk.i.ef efVar, java.lang.String str) {
        this.f1988 = efVar;
        this.f1987 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(r4.getClass().getDeclaredField(r3.f1987).get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if ((r4 instanceof com.ironsource.adqualitysdk.sdk.i.cl) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if ((r4 instanceof com.ironsource.adqualitysdk.sdk.i.cl) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r5 = new com.ironsource.adqualitysdk.sdk.i.ea(((com.ironsource.adqualitysdk.sdk.i.cl) r4).m7206(r3.f1987));
        r4 = com.ironsource.adqualitysdk.sdk.i.ek.f1986 + 61;
        com.ironsource.adqualitysdk.sdk.i.ek.f1985 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        throw null;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        java.lang.Object m7681;
        int i = 2 % 2;
        int i2 = f1986 + 79;
        f1985 = i2 % 128;
        if (i2 % 2 != 0) {
            m7681 = this.f1988.m7718(eeVar, clVar).m7681();
            int i3 = 68 / 0;
        } else {
            m7681 = this.f1988.m7718(eeVar, clVar).m7681();
        }
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f1988.toString());
        sb.append(m7725((android.os.Process.myPid() >> 22) + 1, false, android.widget.ExpandableListView.getPackedPositionType(0L) + 128, "\u0000", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
        sb.append(this.f1987);
        java.lang.String obj = sb.toString();
        int i2 = f1986 + 111;
        f1985 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f1986 + 25;
        f1985 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.ironsource.adqualitysdk.sdk.i.ek ekVar = (com.ironsource.adqualitysdk.sdk.i.ek) obj;
            com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1988;
            if (efVar == null ? ekVar.f1988 != null : !efVar.equals(ekVar.f1988)) {
                return false;
            }
            java.lang.String str = this.f1987;
            if (str != null) {
                int i3 = f1986 + 59;
                f1985 = i3 % 128;
                int i4 = i3 % 2;
                return str.equals(ekVar.f1987);
            }
            if (ekVar.f1987 == null) {
                return true;
            }
            int i5 = f1985 + 7;
            f1986 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f1985;
        int i4 = i3 + 83;
        f1986 = i4 % 128;
        java.lang.Object obj = null;
        if (i4 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1988;
        int i5 = 0;
        if (efVar != null) {
            int i6 = i3 + 121;
            f1986 = i6 % 128;
            if (i6 % 2 == 0) {
                i = efVar.hashCode();
                int i7 = 92 / 0;
            } else {
                i = efVar.hashCode();
            }
        } else {
            i = 0;
        }
        int i8 = i * 31;
        java.lang.String str = this.f1987;
        if (str != null) {
            int i9 = f1985 + 113;
            f1986 = i9 % 128;
            if (i9 % 2 == 0) {
                str.hashCode();
                super.hashCode();
                throw null;
            }
            i5 = str.hashCode();
            int i10 = f1985 + 57;
            f1986 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 3;
            }
        }
        return i8 + i5;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7725(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f1984);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
