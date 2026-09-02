package s1;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public class h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f6619d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e, reason: collision with root package name */
    public static final h f6620e = f(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6621a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f6622b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f6623c;

    public h(byte[] bArr) {
        this.f6621a = bArr;
    }

    public static void a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (b(str.charAt(i3 + 1)) + (b(str.charAt(i3)) << 4));
        }
        f(bArr);
    }

    public static int b(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static h c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        h hVar = new h(str.getBytes(v.f6657a));
        hVar.f6623c = str;
        return hVar;
    }

    public static h f(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int i2 = i();
        int i3 = hVar.i();
        int min = Math.min(i2, i3);
        for (int i4 = 0; i4 < min; i4++) {
            int d2 = d(i4) & 255;
            int d3 = hVar.d(i4) & 255;
            if (d2 == d3) {
            }
        }
        if (i2 == i3) {
            return 0;
        }
    }

    public byte d(int i2) {
        return this.f6621a[i2];
    }

    public String e() {
        byte[] bArr = this.f6621a;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f6619d;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int i2 = hVar.i();
            byte[] bArr = this.f6621a;
            if (i2 == bArr.length && hVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f6621a;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
                Charset charset = v.f6657a;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr2[i5 + i2] == bArr[i5 + i3]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean h(h hVar, int i2) {
        return hVar.g(0, this.f6621a, 0, i2);
    }

    public int hashCode() {
        int i2 = this.f6622b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f6621a);
        this.f6622b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.f6621a.length;
    }

    public h j() {
        byte[] bArr = this.f6621a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new h(bArr2);
    }

    public h k() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f6621a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new h(bArr2);
            }
            i2++;
        }
    }

    public String l() {
        String str = this.f6623c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f6621a, v.f6657a);
        this.f6623c = str2;
        return str2;
    }

    public void m(e eVar) {
        byte[] bArr = this.f6621a;
        eVar.s(bArr.length, bArr);
    }

    public String toString() {
        byte[] bArr = this.f6621a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String l2 = l();
        int length = l2.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = l2.length();
                break;
            }
            if (i3 == 64) {
                break;
            }
            int codePointAt = l2.codePointAt(i2);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i3++;
                i2 += Character.charCount(codePointAt);
            }
        }
        i2 = -1;
        if (i2 != -1) {
            String replace = l2.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i2 >= l2.length()) {
                return AbstractC0819i.a("[text=", replace, "]");
            }
            return "[size=" + bArr.length + " text=" + replace + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + "]";
        }
        return "[size=" + bArr.length + " hex=" + j().e() + "…]";
    }
}
