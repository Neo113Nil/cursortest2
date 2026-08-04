package F3;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f2737c = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f2739b;

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public e(a aVar, Character ch) {
        boolean z4;
        aVar.getClass();
        this.f2738a = aVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = aVar.f2734g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = true;
        }
        p113p3.f.h(z4, "Padding character %s was already in alphabet", ch);
        this.f2739b = ch;
    }

    public final byte[] a(String str) {
        try {
            CharSequence charSequenceF = f(str);
            int length = (int) (((((long) this.f2738a.f2731d) * ((long) charSequenceF.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceF);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (d e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws d {
        int i7;
        int i8;
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        a aVar = this.f2738a;
        if (!aVar.f2735h[length % aVar.f2732e]) {
            throw new d("Invalid input length " + charSequenceF.length());
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < charSequenceF.length()) {
            long jA = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i7 = aVar.f2731d;
                i8 = aVar.f2732e;
                if (i11 >= i8) {
                    break;
                }
                jA <<= i7;
                if (i9 + i11 < charSequenceF.length()) {
                    jA |= (long) aVar.a(charSequenceF.charAt(i12 + i9));
                    i12++;
                }
                i11++;
            }
            int i13 = aVar.f2733f;
            int i14 = (i13 * 8) - (i12 * i7);
            int i15 = (i13 - 1) * 8;
            while (i15 >= i14) {
                bArr[i10] = (byte) ((jA >>> i15) & 255);
                i15 -= 8;
                i10++;
            }
            i9 += i8;
        }
        return i10;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        p113p3.f.o(0, length, bArr.length);
        a aVar = this.f2738a;
        StringBuilder sb = new StringBuilder(p097n3.a.r(length, aVar.f2733f, RoundingMode.CEILING) * aVar.f2732e);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i7, int i8) {
        p113p3.f.o(i7, i7 + i8, bArr.length);
        a aVar = this.f2738a;
        int i9 = 0;
        p113p3.f.e(i8 <= aVar.f2733f);
        long j = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j = (j | ((long) (bArr[i7 + i10] & 255))) << 8;
        }
        int i11 = aVar.f2731d;
        int i12 = ((i8 + 1) * 8) - i11;
        while (i9 < i8 * 8) {
            sb.append(aVar.f2729b[((int) (j >>> (i12 - i9))) & aVar.f2730c]);
            i9 += i11;
        }
        Character ch = this.f2739b;
        if (ch != null) {
            while (i9 < aVar.f2733f * 8) {
                sb.append(ch.charValue());
                i9 += i11;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i7) {
        int i8 = 0;
        p113p3.f.o(0, i7, bArr.length);
        while (i8 < i7) {
            a aVar = this.f2738a;
            d(sb, bArr, i8, Math.min(aVar.f2733f, i7 - i8));
            i8 += aVar.f2733f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2738a.equals(eVar.f2738a) && Objects.equals(this.f2739b, eVar.f2739b);
    }

    public final CharSequence f(CharSequence charSequence) {
        Character ch = this.f2739b;
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

    public final int hashCode() {
        return this.f2738a.hashCode() ^ Objects.hashCode(this.f2739b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        a aVar = this.f2738a;
        sb.append(aVar);
        if (8 % aVar.f2731d != 0) {
            Character ch = this.f2739b;
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

    public e(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
