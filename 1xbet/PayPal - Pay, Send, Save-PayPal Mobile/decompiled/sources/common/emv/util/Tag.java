package common.emv.util;

/* loaded from: classes17.dex */
public class Tag {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6720a;

    public enum TagClass {
        UNIVERSAL,
        APPLICATION,
        CONTEXT_SPECIFIC,
        PRIVATE
    }

    public enum TagType {
        PRIMITIVE,
        CONSTRUCTED
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag [");
        sb.append(toHexValue());
        sb.append(", Type=");
        sb.append(getTagType());
        sb.append(", Class=");
        sb.append(getTagClass());
        sb.append("]");
        return sb.toString();
    }

    public int toIntValue() {
        int i = 0;
        for (byte b : this.f6720a) {
            i = (i << 8) + (b & 255);
        }
        return i;
    }

    public java.lang.String toHexValue() {
        return java.lang.Integer.toHexString(toIntValue()).toUpperCase();
    }

    public boolean isPrimitive() {
        return !isConstructed();
    }

    public boolean isConstructed() {
        return (this.f6720a[0] & 32) != 0;
    }

    public int hashCode() {
        int i = -560171054;
        for (byte b : this.f6720a) {
            i = (i * 31) + b;
        }
        return i;
    }

    public common.emv.util.Tag.TagType getTagType() {
        return isConstructed() ? common.emv.util.Tag.TagType.CONSTRUCTED : common.emv.util.Tag.TagType.PRIMITIVE;
    }

    public common.emv.util.Tag.TagClass getTagClass() {
        byte b = (byte) ((this.f6720a[0] >>> 6) & 3);
        if (b == 0) {
            return common.emv.util.Tag.TagClass.UNIVERSAL;
        }
        if (b == 1) {
            return common.emv.util.Tag.TagClass.APPLICATION;
        }
        if (b == 2) {
            return common.emv.util.Tag.TagClass.CONTEXT_SPECIFIC;
        }
        if (b == 3) {
            return common.emv.util.Tag.TagClass.PRIVATE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag has invalid class type: ");
        sb.append(java.lang.Integer.toHexString(b));
        throw new java.lang.RuntimeException(sb.toString());
    }

    public byte[] getBytes() {
        return this.f6720a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof common.emv.util.Tag)) {
            return false;
        }
        common.emv.util.Tag tag = (common.emv.util.Tag) obj;
        if (this.f6720a.length != tag.f6720a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f6720a;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != tag.f6720a[i]) {
                return false;
            }
            i++;
        }
    }

    public final void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Tag must be constructed with a non-empty byte array");
        }
        if (bArr.length == 1) {
            if ((bArr[0] & com.google.common.base.Ascii.US) == 31) {
                throw new java.lang.IllegalArgumentException("If first 5 bits are set tag must not be only one byte long");
            }
        } else if (bArr.length > 2) {
            for (int i = 1; i < bArr.length - 1; i++) {
                if ((bArr[i] & Byte.MIN_VALUE) != -128) {
                    throw new java.lang.IllegalArgumentException("For multibyte tag bit 8 of the internal bytes must be 1");
                }
            }
        }
    }

    public static common.emv.util.Tag create(java.nio.ByteBuffer byteBuffer) {
        int i = 1;
        if ((byteBuffer.get() & com.google.common.base.Ascii.US) == 31) {
            int i2 = 1;
            do {
                i2++;
            } while ((byteBuffer.get() & 128) == 128);
            i = i2;
        }
        byte[] bArr = new byte[i];
        byteBuffer.position(byteBuffer.position() - i);
        byteBuffer.get(bArr, 0, i);
        return new common.emv.util.Tag(bArr);
    }

    public static byte[] a(int i) {
        byte b = (byte) (i >> 24);
        byte b2 = (byte) (i >> 16);
        byte b3 = (byte) (i >> 8);
        byte b4 = (byte) i;
        if (b != 0) {
            return new byte[]{b, b2, b3, b4};
        }
        if (b2 != 0) {
            return new byte[]{b2, b3, b4};
        }
        if (b3 != 0) {
            return new byte[]{b3, b4};
        }
        if (b4 != 0) {
            return new byte[]{b4};
        }
        throw new java.lang.IllegalArgumentException("The argument 'tag' can not be null");
    }

    public Tag(byte[] bArr) {
        a(bArr);
        this.f6720a = bArr;
    }

    public Tag(int i) {
        this(a(i));
    }
}
