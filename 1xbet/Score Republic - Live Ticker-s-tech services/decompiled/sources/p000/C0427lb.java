package p000;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: lb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0427lb {

    /* JADX INFO: renamed from: d */
    public static final C0353jb f4748d = new C0353jb("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: e */
    public static final C0353jb f4749e = new C0353jb("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: f */
    public static final C0317ib f4750f;

    /* JADX INFO: renamed from: a */
    public final C0280hb f4751a;

    /* JADX INFO: renamed from: b */
    public final Character f4752b;

    /* JADX INFO: renamed from: c */
    public volatile C0427lb f4753c;

    static {
        new C0427lb("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C0427lb("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f4750f = new C0317ib(new C0280hb("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public C0427lb(C0280hb c0280hb, Character ch) {
        boolean z;
        c0280hb.getClass();
        this.f4751a = c0280hb;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c0280hb.f3148g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        a90.m121e(ch, "Padding character %s was already in alphabet", z);
        this.f4752b = ch;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3196a(String str) {
        try {
            CharSequence charSequenceM3199g = m3199g(str);
            int length = (int) (((((long) this.f4751a.f3145d) * ((long) charSequenceM3199g.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo2583b = mo2583b(bArr, charSequenceM3199g);
            if (iMo2583b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo2583b];
            System.arraycopy(bArr, 0, bArr2, 0, iMo2583b);
            return bArr2;
        } catch (C0390kb e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo2583b(byte[] bArr, CharSequence charSequence) throws C0390kb {
        CharSequence charSequenceM3199g = m3199g(charSequence);
        int length = charSequenceM3199g.length();
        C0280hb c0280hb = this.f4751a;
        boolean[] zArr = c0280hb.f3149h;
        int i = c0280hb.f3145d;
        int i2 = c0280hb.f3146e;
        if (!zArr[length % i2]) {
            throw new C0390kb("Invalid input length " + charSequenceM3199g.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceM3199g.length(); i4 += i2) {
            long jM2248a = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM2248a <<= i;
                if (i4 + i6 < charSequenceM3199g.length()) {
                    jM2248a |= (long) c0280hb.m2248a(charSequenceM3199g.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c0280hb.f3147f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM2248a >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final String m3197c(byte[] bArr) {
        int length = bArr.length;
        a90.m130n(0, length, bArr.length);
        C0280hb c0280hb = this.f4751a;
        int i = c0280hb.f3146e;
        int i2 = c0280hb.f3147f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(hn0.m2315i(length, i2) * i);
        try {
            mo2584e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3198d(StringBuilder sb, byte[] bArr, int i, int i2) {
        a90.m130n(i, i + i2, bArr.length);
        C0280hb c0280hb = this.f4751a;
        int i3 = c0280hb.f3147f;
        int i4 = c0280hb.f3145d;
        int i5 = 0;
        a90.m123g(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c0280hb.f3143b[((int) (j >>> (i7 - i5))) & c0280hb.f3144c]);
            i5 += i4;
        }
        Character ch = this.f4752b;
        if (ch != null) {
            while (i5 < c0280hb.f3147f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo2584e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        a90.m130n(0, i, bArr.length);
        while (i2 < i) {
            C0280hb c0280hb = this.f4751a;
            m3198d(sb, bArr, i2, Math.min(c0280hb.f3147f, i - i2));
            i2 += c0280hb.f3147f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0427lb) {
            C0427lb c0427lb = (C0427lb) obj;
            if (this.f4751a.equals(c0427lb.f4751a) && Objects.equals(this.f4752b, c0427lb.f4752b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C0427lb mo2585f(C0280hb c0280hb, Character ch) {
        return new C0427lb(c0280hb, ch);
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m3199g(CharSequence charSequence) {
        Character ch = this.f4752b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b1 A[EDGE_INSN: B:47:0x00b1->B:49:0x00b7 BREAK  A[LOOP:0: B:5:0x000b->B:48:0x00b3]] */
    /* JADX INFO: renamed from: h */
    public final C0427lb m3200h() {
        int i;
        boolean z;
        C0427lb c0427lbMo2585f = this.f4753c;
        if (c0427lbMo2585f == null) {
            C0280hb c0280hb = this.f4751a;
            char[] cArr = c0280hb.f3143b;
            for (char c : cArr) {
                if (c >= 'a' && c <= 'z') {
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i2];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    a90.m132p("Cannot call upperCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c3 = cArr[i3];
                        if (c3 >= 'a' && c3 <= 'z') {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i3] = c3;
                    }
                    C0280hb c0280hb2 = new C0280hb(AbstractC0024an.m285h(new StringBuilder(), c0280hb.f3142a, ".upperCase()"), cArr2);
                    if (!c0280hb.f3150i) {
                        c0280hb = c0280hb2;
                        break;
                    }
                    byte[] bArr = c0280hb2.f3148g;
                    if (!c0280hb2.f3150i) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i4 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i4];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i4;
                                if (!(b2 == -1)) {
                                    C0270h1.m2191g(o80.m3651s("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i4] = b;
                            }
                        }
                        c0280hb = new C0280hb(AbstractC0024an.m285h(new StringBuilder(), c0280hb2.f3142a, ".ignoreCase()"), c0280hb2.f3143b, bArrCopyOf, true);
                        break;
                    }
                    c0280hb = c0280hb2;
                    break;
                }
            }
            c0427lbMo2585f = c0280hb == this.f4751a ? this : mo2585f(c0280hb, this.f4752b);
            this.f4753c = c0427lbMo2585f;
        }
        return c0427lbMo2585f;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f4752b) ^ this.f4751a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C0280hb c0280hb = this.f4751a;
        sb.append(c0280hb);
        if (8 % c0280hb.f3145d != 0) {
            Character ch = this.f4752b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public C0427lb(String str, String str2) {
        this(new C0280hb(str, str2.toCharArray()), (Character) '=');
    }
}
