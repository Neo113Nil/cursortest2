package com.bytedance.sdk.component.sf.pcc.sf;

import com.google.common.base.Ascii;
import com.ironsource.U3;
import io.ktor.util.date.GMTDateParser;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class oo implements Serializable, Comparable<oo> {
    final byte[] oo;
    transient int vj;
    transient String wh;
    static final char[] pcc = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    public static final Charset sf = Charset.forName("UTF-8");
    public static final oo gm = pcc(new byte[0]);

    oo(byte[] bArr) {
        this.oo = bArr;
    }

    public static oo pcc(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new oo((byte[]) bArr.clone());
    }

    public String pcc() {
        String str = this.wh;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.oo, sf);
        this.wh = str2;
        return str2;
    }

    public String sf() {
        byte[] bArr = this.oo;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = pcc;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public oo pcc(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.oo;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.oo.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new oo(bArr2);
    }

    public byte pcc(int i) {
        return this.oo[i];
    }

    public int gm() {
        return this.oo.length;
    }

    public byte[] oo() {
        return (byte[]) this.oo.clone();
    }

    public boolean pcc(int i, oo ooVar, int i2, int i3) {
        return ooVar.pcc(i2, this.oo, i, i3);
    }

    public boolean pcc(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.oo;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && vy.pcc(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo) {
            oo ooVar = (oo) obj;
            int gm2 = ooVar.gm();
            byte[] bArr = this.oo;
            if (gm2 == bArr.length && ooVar.pcc(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.vj;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.oo);
        this.vj = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(oo ooVar) {
        int gm2 = gm();
        int gm3 = ooVar.gm();
        int min = Math.min(gm2, gm3);
        for (int i = 0; i < min; i++) {
            int pcc2 = pcc(i) & 255;
            int pcc3 = ooVar.pcc(i) & 255;
            if (pcc2 != pcc3) {
                return pcc2 < pcc3 ? -1 : 1;
            }
        }
        if (gm2 == gm3) {
            return 0;
        }
        return gm2 < gm3 ? -1 : 1;
    }

    public String toString() {
        if (this.oo.length == 0) {
            return "[size=0]";
        }
        String pcc2 = pcc();
        int pcc3 = pcc(pcc2, 64);
        if (pcc3 == -1) {
            if (this.oo.length > 64) {
                return "[size=" + this.oo.length + " hex=" + pcc(0, 64).sf() + "…]";
            }
            return "[hex=" + sf() + U3.j.e;
        }
        String replace = pcc2.substring(0, pcc3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return pcc3 < pcc2.length() ? "[size=" + this.oo.length + " text=" + replace + "…]" : "[text=" + replace + U3.j.e;
    }

    static int pcc(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
