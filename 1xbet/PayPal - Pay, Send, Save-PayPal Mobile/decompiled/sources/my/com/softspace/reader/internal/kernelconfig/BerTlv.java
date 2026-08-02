package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
public class BerTlv {
    private byte[] getHighSpeedVideoFpsRanges;
    private final my.com.softspace.reader.internal.kernelconfig.Tag getHighSpeedVideoFpsRangesFor;

    public BerTlv(my.com.softspace.reader.internal.kernelconfig.Tag tag, byte[] bArr) {
        if (tag == null) {
            throw new java.lang.IllegalArgumentException("The argument 'tag' can not be null");
        }
        this.getHighSpeedVideoFpsRangesFor = tag;
        this.getHighSpeedVideoFpsRanges = bArr == null ? new byte[0] : bArr;
    }

    public BerTlv(int i, byte[] bArr) {
        this(new my.com.softspace.reader.internal.kernelconfig.Tag(i), bArr);
    }

    public my.com.softspace.reader.internal.kernelconfig.Tag getTag() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getLengthBytes() {
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (bArr == null) {
            return encodeLength(0);
        }
        return encodeLength(bArr.length);
    }

    public byte[] getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setValue(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    public java.lang.String getValueAsHexString() {
        char[] cArr = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[this.getHighSpeedVideoFpsRanges.length * 2];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (i2 < bArr.length) {
                byte b = bArr[i2];
                cArr2[i] = cArr[(b >> 4) & 15];
                cArr2[i + 1] = cArr[b & com.google.common.base.Ascii.SI];
                i2++;
                i += 2;
            } else {
                return new java.lang.String(cArr2);
            }
        }
    }

    public byte[] toByteArray() {
        byte[] bytes = this.getHighSpeedVideoFpsRangesFor.getBytes();
        byte[] lengthBytes = getLengthBytes();
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        byte[] bArr2 = new byte[bytes.length + lengthBytes.length + bArr.length];
        java.lang.System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        java.lang.System.arraycopy(lengthBytes, 0, bArr2, bytes.length, lengthBytes.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, bytes.length + lengthBytes.length, bArr.length);
        return bArr2;
    }

    public static byte[] encodeLength(int i) {
        int i2;
        if (i == 0) {
            return new byte[]{0};
        }
        if (i <= 127) {
            return new byte[]{(byte) i};
        }
        int i3 = 0;
        while (true) {
            i2 = i3 + 1;
            if (((8388607 << (i2 * 8)) & i) <= 0) {
                break;
            }
            i3 = i2;
        }
        byte[] bArr = new byte[i3 + 2];
        bArr[0] = (byte) (i3 + 129);
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i2 - i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    public static int decodeLength(java.nio.ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        if ((b & 128) != 0) {
            i = 0;
            for (int i2 = b & Byte.MAX_VALUE; i2 > 0; i2--) {
                i = (i << 8) + (byteBuffer.get() & 255);
            }
        }
        return i;
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv create(my.com.softspace.reader.internal.kernelconfig.Tag tag, byte[] bArr) {
        return new my.com.softspace.reader.internal.kernelconfig.BerTlv(tag, bArr);
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv create(my.com.softspace.reader.internal.kernelconfig.Tag tag, java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list) {
        int size = list.size();
        byte[][] bArr = new byte[size][];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            byte[] byteArray = list.get(i2).toByteArray();
            bArr[i2] = byteArray;
            i += byteArray.length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            byte[] bArr3 = bArr[i4];
            java.lang.System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr[i4].length;
        }
        return new my.com.softspace.reader.internal.kernelconfig.BerTlv(tag, bArr2);
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv create(java.nio.ByteBuffer byteBuffer) {
        my.com.softspace.reader.internal.kernelconfig.Tag create = my.com.softspace.reader.internal.kernelconfig.Tag.create(byteBuffer);
        byte[] bArr = new byte[decodeLength(byteBuffer)];
        byteBuffer.get(bArr);
        return new my.com.softspace.reader.internal.kernelconfig.BerTlv(create, bArr);
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv create(byte[] bArr, int i, int i2) {
        return create(java.nio.ByteBuffer.wrap(bArr, i, i2));
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv create(byte[] bArr) {
        return create(java.nio.ByteBuffer.wrap(bArr, 0, bArr.length));
    }

    public static java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList(java.nio.ByteBuffer byteBuffer) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (byteBuffer.hasRemaining()) {
            arrayList.add(create(byteBuffer));
        }
        return arrayList;
    }

    public static java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList(byte[] bArr) {
        return createList(java.nio.ByteBuffer.wrap(bArr));
    }

    public static java.util.Map<my.com.softspace.reader.internal.kernelconfig.Tag, byte[]> createMap(java.nio.ByteBuffer byteBuffer) {
        java.util.HashMap hashMap = new java.util.HashMap();
        while (byteBuffer.hasRemaining()) {
            my.com.softspace.reader.internal.kernelconfig.BerTlv create = create(byteBuffer);
            hashMap.put(create.getTag(), create.getValue());
        }
        return hashMap;
    }

    public static java.util.Map<my.com.softspace.reader.internal.kernelconfig.Tag, byte[]> createMap(byte[] bArr) {
        return createMap(java.nio.ByteBuffer.wrap(bArr));
    }

    public static byte[] listToByteArray(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list) {
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        java.util.Iterator<my.com.softspace.reader.internal.kernelconfig.BerTlv> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            byte[] byteArray = it.next().toByteArray();
            arrayList.add(byteArray);
            i += byteArray.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : arrayList) {
            java.lang.System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] mapToByteArray(java.util.Map<my.com.softspace.reader.internal.kernelconfig.Tag, byte[]> map) {
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        int i = 0;
        for (my.com.softspace.reader.internal.kernelconfig.Tag tag : map.keySet()) {
            byte[] bytes = tag.getBytes();
            byte[] bArr = map.get(tag);
            byte[] encodeLength = encodeLength(bArr.length);
            arrayList.add(bytes);
            arrayList.add(encodeLength);
            arrayList.add(bArr);
            i += bytes.length + encodeLength.length + bArr.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : arrayList) {
            java.lang.System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv find(java.nio.ByteBuffer byteBuffer, my.com.softspace.reader.internal.kernelconfig.Tag tag) {
        while (byteBuffer.hasRemaining()) {
            my.com.softspace.reader.internal.kernelconfig.BerTlv create = create(byteBuffer);
            if (create.getTag().equals(tag)) {
                return create;
            }
        }
        return null;
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv find(java.nio.ByteBuffer byteBuffer, int i) {
        return find(byteBuffer, new my.com.softspace.reader.internal.kernelconfig.Tag(i));
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv find(byte[] bArr, my.com.softspace.reader.internal.kernelconfig.Tag tag) {
        return find(java.nio.ByteBuffer.wrap(bArr), tag);
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv find(byte[] bArr, int i) {
        return find(java.nio.ByteBuffer.wrap(bArr), i);
    }

    public static java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> findTlvsForTagFromList(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list, my.com.softspace.reader.internal.kernelconfig.Tag tag) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : list) {
            if (berTlv.getTag().equals(tag)) {
                arrayList.add(berTlv);
            }
        }
        return arrayList;
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlv findLastTlvForTagFromList(java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> list, my.com.softspace.reader.internal.kernelconfig.Tag tag) {
        java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> findTlvsForTagFromList = findTlvsForTagFromList(list, tag);
        if (findTlvsForTagFromList == null || findTlvsForTagFromList.size() <= 0) {
            return null;
        }
        return findTlvsForTagFromList.get(findTlvsForTagFromList.size() - 1);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof my.com.softspace.reader.internal.kernelconfig.Tag)) {
            return false;
        }
        my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv = (my.com.softspace.reader.internal.kernelconfig.BerTlv) obj;
        if (!this.getHighSpeedVideoFpsRangesFor.equals(berTlv.getTag()) || this.getHighSpeedVideoFpsRanges.length != berTlv.getHighSpeedVideoFpsRanges.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != berTlv.getHighSpeedVideoFpsRanges[i]) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int hashCode = "my.com.softspace.reader.internal.kernelconfig.BerTlv".hashCode() + 1;
        for (byte b : this.getHighSpeedVideoFpsRangesFor.getBytes()) {
            hashCode = (hashCode * 31) + b;
        }
        for (byte b2 : this.getHighSpeedVideoFpsRanges) {
            hashCode = (hashCode * 31) + b2;
        }
        return hashCode;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BerTlv [Tag=");
        sb.append(this.getHighSpeedVideoFpsRangesFor.toHexValue());
        sb.append(", Length=");
        sb.append(this.getHighSpeedVideoFpsRanges.length);
        sb.append(", Value=");
        sb.append(getValueAsHexString());
        sb.append("]");
        return sb.toString();
    }
}
