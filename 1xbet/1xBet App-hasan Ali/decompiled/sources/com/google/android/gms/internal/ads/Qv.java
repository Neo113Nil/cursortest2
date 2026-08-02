package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public class Qv {

    /* renamed from: d, reason: collision with root package name */
    public static final Nv f11286d;

    /* renamed from: a, reason: collision with root package name */
    public final Mv f11287a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f11288b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Qv f11289c;

    static {
        new Ov("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new Ov("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new Qv("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new Qv("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f11286d = new Nv(new Mv("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Qv(Mv mv, Character ch) {
        boolean z3;
        this.f11287a = mv;
        if (ch != null) {
            byte[] bArr = mv.f10748g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z3 = false;
                if (z3) {
                    throw new IllegalArgumentException(AbstractC0952et.F("Padding character %s was already in alphabet", ch));
                }
                this.f11288b = ch;
                return;
            }
        }
        z3 = true;
        if (z3) {
        }
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e3 = e(charSequence);
        int length = e3.length();
        Mv mv = this.f11287a;
        boolean[] zArr = mv.f10749h;
        int i5 = mv.f10747e;
        if (!zArr[length % i5]) {
            throw new Pv(AbstractC2107A.q("Invalid input length ", e3.length()));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < e3.length(); i7 += i5) {
            long j5 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i = mv.f10746d;
                if (i8 >= i5) {
                    break;
                }
                j5 <<= i;
                if (i7 + i8 < e3.length()) {
                    j5 |= mv.a(e3.charAt(i9 + i7));
                    i9++;
                }
                i8++;
            }
            int i10 = i9 * i;
            int i11 = mv.f;
            int i12 = (i11 - 1) * 8;
            while (i12 >= (i11 * 8) - i10) {
                bArr[i6] = (byte) ((j5 >>> i12) & 255);
                i12 -= 8;
                i6++;
            }
        }
        return i6;
    }

    public Qv b(Mv mv, Character ch) {
        return new Qv(mv, ch);
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i5 = 0;
        AbstractC1400ot.g0(0, i, bArr.length);
        while (i5 < i) {
            Mv mv = this.f11287a;
            f(sb, bArr, i5, Math.min(mv.f, i - i5));
            i5 += mv.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Qv d() {
        Mv mv;
        boolean z3;
        Qv qv = this.f11289c;
        if (qv != null) {
            return qv;
        }
        Mv mv2 = this.f11287a;
        int i = 0;
        while (true) {
            char[] cArr = mv2.f10744b;
            if (i >= cArr.length) {
                mv = mv2;
                break;
            }
            if (AbstractC0952et.W(cArr[i])) {
                int i5 = 0;
                while (true) {
                    if (i5 >= cArr.length) {
                        z3 = false;
                        break;
                    }
                    char c5 = cArr[i5];
                    if (c5 >= 'a' && c5 <= 'z') {
                        z3 = true;
                        break;
                    }
                    i5++;
                }
                AbstractC1400ot.i0("Cannot call lowerCase() on a mixed-case alphabet", !z3);
                char[] cArr2 = new char[cArr.length];
                for (int i6 = 0; i6 < cArr.length; i6++) {
                    char c6 = cArr[i6];
                    if (AbstractC0952et.W(c6)) {
                        c6 ^= 32;
                    }
                    cArr2[i6] = (char) c6;
                }
                mv = new Mv(mv2.f10743a.concat(".lowerCase()"), cArr2);
                if (mv2.i && !mv.i) {
                    byte[] bArr = mv.f10748g;
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    for (int i7 = 65; i7 <= 90; i7++) {
                        int i8 = i7 | 32;
                        byte b3 = bArr[i7];
                        byte b5 = bArr[i8];
                        if (b3 == -1) {
                            copyOf[i7] = b5;
                        } else {
                            char c7 = (char) i7;
                            char c8 = (char) i8;
                            if (b5 != -1) {
                                throw new IllegalStateException(AbstractC0952et.F("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c7), Character.valueOf(c8)));
                            }
                            copyOf[i8] = b3;
                        }
                    }
                    mv = new Mv(mv.f10743a.concat(".ignoreCase()"), mv.f10744b, copyOf, true);
                }
            } else {
                i++;
            }
        }
        Qv b6 = mv == mv2 ? this : b(mv, this.f11288b);
        this.f11289c = b6;
        return b6;
    }

    public final CharSequence e(CharSequence charSequence) {
        if (this.f11288b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Qv) {
            Qv qv = (Qv) obj;
            if (this.f11287a.equals(qv.f11287a) && Objects.equals(this.f11288b, qv.f11288b)) {
                return true;
            }
        }
        return false;
    }

    public final void f(StringBuilder sb, byte[] bArr, int i, int i5) {
        int i6;
        AbstractC1400ot.g0(i, i + i5, bArr.length);
        Mv mv = this.f11287a;
        int i7 = 0;
        AbstractC1400ot.W(i5 <= mv.f);
        long j5 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            j5 = (j5 | (bArr[i + i8] & 255)) << 8;
        }
        int i9 = (i5 + 1) * 8;
        while (true) {
            int i10 = i5 * 8;
            i6 = mv.f10746d;
            if (i7 >= i10) {
                break;
            }
            sb.append(mv.f10744b[((int) (j5 >>> ((i9 - i6) - i7))) & mv.f10745c]);
            i7 += i6;
        }
        if (this.f11288b != null) {
            while (i7 < mv.f * 8) {
                sb.append('=');
                i7 += i6;
            }
        }
    }

    public final String g(int i, byte[] bArr) {
        AbstractC1400ot.g0(0, i, bArr.length);
        Mv mv = this.f11287a;
        int i5 = mv.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(mv.f10747e * AbstractC0952et.y(i, i5));
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f11287a.f10746d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int a5 = a(bArr, e(str));
            if (a5 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[a5];
            System.arraycopy(bArr, 0, bArr2, 0, a5);
            return bArr2;
        } catch (Pv e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final int hashCode() {
        return this.f11287a.hashCode() ^ Objects.hashCode(this.f11288b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        Mv mv = this.f11287a;
        sb.append(mv);
        if (8 % mv.f10746d != 0) {
            Character ch = this.f11288b;
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

    public Qv(String str, String str2) {
        this(new Mv(str, str2.toCharArray()), (Character) '=');
    }
}
