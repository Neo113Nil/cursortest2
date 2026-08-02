package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
public class Tag {
    private final byte[] getHighSpeedVideoFpsRangesFor;

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

    public Tag(byte[] bArr) {
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
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    public my.com.softspace.reader.internal.kernelconfig.Tag.TagClass getTagClass() {
        byte b = (byte) ((this.getHighSpeedVideoFpsRangesFor[0] >>> 6) & 3);
        if (b == 0) {
            return my.com.softspace.reader.internal.kernelconfig.Tag.TagClass.UNIVERSAL;
        }
        if (b == 1) {
            return my.com.softspace.reader.internal.kernelconfig.Tag.TagClass.APPLICATION;
        }
        if (b == 2) {
            return my.com.softspace.reader.internal.kernelconfig.Tag.TagClass.CONTEXT_SPECIFIC;
        }
        if (b == 3) {
            return my.com.softspace.reader.internal.kernelconfig.Tag.TagClass.PRIVATE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag has invalid class type: ");
        sb.append(java.lang.Integer.toHexString(b));
        throw new java.lang.RuntimeException(sb.toString());
    }

    public my.com.softspace.reader.internal.kernelconfig.Tag.TagType getTagType() {
        if (isConstructed()) {
            return my.com.softspace.reader.internal.kernelconfig.Tag.TagType.CONSTRUCTED;
        }
        return my.com.softspace.reader.internal.kernelconfig.Tag.TagType.PRIMITIVE;
    }

    public byte[] getBytes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int toIntValue() {
        int i = 0;
        for (byte b : this.getHighSpeedVideoFpsRangesFor) {
            i = (i << 8) + (b & 255);
        }
        return i;
    }

    public java.lang.String toHexValue() {
        return java.lang.Integer.toHexString(toIntValue()).toUpperCase();
    }

    public boolean isConstructed() {
        return (this.getHighSpeedVideoFpsRangesFor[0] & 32) != 0;
    }

    public boolean isPrimitive() {
        return !isConstructed();
    }

    public static my.com.softspace.reader.internal.kernelconfig.Tag create(java.nio.ByteBuffer byteBuffer) {
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
        return new my.com.softspace.reader.internal.kernelconfig.Tag(bArr);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof my.com.softspace.reader.internal.kernelconfig.Tag)) {
            return false;
        }
        my.com.softspace.reader.internal.kernelconfig.Tag tag = (my.com.softspace.reader.internal.kernelconfig.Tag) obj;
        if (this.getHighSpeedVideoFpsRangesFor.length != tag.getHighSpeedVideoFpsRangesFor.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != tag.getHighSpeedVideoFpsRangesFor[i]) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int hashCode = "my.com.softspace.reader.internal.kernelconfig.Tag".hashCode() + 1;
        for (byte b : this.getHighSpeedVideoFpsRangesFor) {
            hashCode = (hashCode * 31) + b;
        }
        return hashCode;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Tag(int i) {
        this(r7);
        byte[] bArr;
        byte b = (byte) (i >> 24);
        byte b2 = (byte) (i >> 16);
        byte b3 = (byte) (i >> 8);
        byte b4 = (byte) i;
        if (b != 0) {
            bArr = new byte[]{b, b2, b3, b4};
        } else if (b2 != 0) {
            bArr = new byte[]{b2, b3, b4};
        } else if (b3 != 0) {
            bArr = new byte[]{b3, b4};
        } else if (b4 != 0) {
            bArr = new byte[]{b4};
        } else {
            throw new java.lang.IllegalArgumentException("The argument 'tag' can not be null");
        }
    }
}
