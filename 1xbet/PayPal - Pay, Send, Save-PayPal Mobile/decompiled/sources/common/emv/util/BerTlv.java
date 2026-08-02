package common.emv.util;

/* loaded from: classes17.dex */
public class BerTlv {

    /* renamed from: a, reason: collision with root package name */
    public final common.emv.util.Tag f6717a;
    public byte[] b;

    public static common.emv.util.BerTlv create(java.nio.ByteBuffer byteBuffer, boolean z) {
        zb.g.a aVar;
        try {
            common.emv.util.Tag create = common.emv.util.Tag.create(byteBuffer);
            int decodeLength = decodeLength(byteBuffer);
            byte[] bArr = new byte[decodeLength];
            if (z && decodeLength + byteBuffer.position() > byteBuffer.array().length) {
                zb.g a2 = zb.g.a(create.toHexValue());
                if (a2 != null) {
                    zb.g[] values = zb.g.values();
                    for (int i = 0; i < 52; i++) {
                        zb.g gVar = values[i];
                        if (gVar.equals(a2)) {
                            aVar = gVar.e0;
                            break;
                        }
                    }
                }
                aVar = zb.g.a.Mandatory;
                if (aVar == zb.g.a.Mandatory) {
                    bArr = new byte[byteBuffer.array().length - byteBuffer.position()];
                }
            }
            byteBuffer.get(bArr);
            return new common.emv.util.BerTlv(create, bArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BerTlv [Tag=");
        sb.append(this.f6717a.toHexValue());
        sb.append(", Length=");
        sb.append(this.b.length);
        sb.append(", Value=");
        sb.append(getValueAsHexString());
        sb.append("]");
        return sb.toString();
    }

    public byte[] toByteArray() {
        byte[] bytes = this.f6717a.getBytes();
        byte[] lengthBytes = getLengthBytes();
        byte[] bArr = this.b;
        byte[] bArr2 = new byte[bytes.length + lengthBytes.length + bArr.length];
        java.lang.System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        java.lang.System.arraycopy(lengthBytes, 0, bArr2, bytes.length, lengthBytes.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, bytes.length + lengthBytes.length, bArr.length);
        return bArr2;
    }

    public void setValue(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.b = bArr;
    }

    public int hashCode() {
        int i = 1675794009;
        for (byte b : this.f6717a.getBytes()) {
            i = (i * 31) + b;
        }
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public java.lang.String getValueAsHexString() {
        char[] cArr = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[this.b.length * 2];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                return new java.lang.String(cArr2);
            }
            byte b = bArr[i2];
            cArr2[i] = cArr[(b >> 4) & 15];
            cArr2[i + 1] = cArr[b & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
    }

    public byte[] getValue() {
        return this.b;
    }

    public common.emv.util.Tag getTag() {
        return this.f6717a;
    }

    public byte[] getLengthBytes() {
        byte[] bArr = this.b;
        return encodeLength(bArr == null ? 0 : bArr.length);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof common.emv.util.Tag)) {
            return false;
        }
        common.emv.util.BerTlv berTlv = (common.emv.util.BerTlv) obj;
        if (!this.f6717a.equals(berTlv.getTag()) || this.b.length != berTlv.b.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != berTlv.b[i]) {
                return false;
            }
            i++;
        }
    }

    public static byte[] mapToByteArray(java.util.Map<common.emv.util.Tag, byte[]> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (common.emv.util.Tag tag : map.keySet()) {
            byte[] bytes = tag.getBytes();
            byte[] bArr = map.get(tag);
            byte[] encodeLength = encodeLength(bArr.length);
            arrayList.add(bytes);
            arrayList.add(encodeLength);
            arrayList.add(bArr);
            i += bytes.length + encodeLength.length + bArr.length;
        }
        byte[] bArr2 = new byte[i];
        java.util.Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public static byte[] listToByteArray(java.util.List<common.emv.util.BerTlv> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<common.emv.util.BerTlv> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            byte[] byteArray = it.next().toByteArray();
            arrayList.add(byteArray);
            i += byteArray.length;
        }
        byte[] bArr = new byte[i];
        java.util.Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            java.lang.System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static java.util.List<common.emv.util.BerTlv> findTlvsForTagFromList(java.util.List<common.emv.util.BerTlv> list, common.emv.util.Tag tag) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (common.emv.util.BerTlv berTlv : list) {
            if (berTlv.getTag().equals(tag)) {
                arrayList.add(berTlv);
            }
        }
        return arrayList;
    }

    public static common.emv.util.BerTlv findLastTlvForTagFromList(java.util.List<common.emv.util.BerTlv> list, common.emv.util.Tag tag) {
        java.util.List<common.emv.util.BerTlv> findTlvsForTagFromList = findTlvsForTagFromList(list, tag);
        if (findTlvsForTagFromList == null || findTlvsForTagFromList.size() <= 0) {
            return null;
        }
        return findTlvsForTagFromList.get(findTlvsForTagFromList.size() - 1);
    }

    public static common.emv.util.BerTlv find(byte[] bArr, common.emv.util.Tag tag) {
        return find(java.nio.ByteBuffer.wrap(bArr), tag);
    }

    public static common.emv.util.BerTlv find(byte[] bArr, int i) {
        return find(java.nio.ByteBuffer.wrap(bArr), i);
    }

    public static common.emv.util.BerTlv find(java.nio.ByteBuffer byteBuffer, common.emv.util.Tag tag) {
        while (byteBuffer.hasRemaining()) {
            common.emv.util.BerTlv create = create(byteBuffer);
            if (create.getTag().equals(tag)) {
                return create;
            }
        }
        return null;
    }

    public static common.emv.util.BerTlv find(java.nio.ByteBuffer byteBuffer, int i) {
        return find(byteBuffer, new common.emv.util.Tag(i));
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
        if ((b & 128) == 0) {
            return b & 255;
        }
        int i = b & Byte.MAX_VALUE;
        if (i > 3) {
            throw new java.lang.IllegalArgumentException();
        }
        int i2 = 0;
        while (i > 0) {
            i2 = (i2 << 8) + (byteBuffer.get() & 255);
            i--;
        }
        return i2;
    }

    public static java.util.Map<common.emv.util.Tag, byte[]> createMap(byte[] bArr, boolean z) {
        return createMap(java.nio.ByteBuffer.wrap(bArr), z);
    }

    public static java.util.Map<common.emv.util.Tag, byte[]> createMap(byte[] bArr) {
        return createMap(bArr, false);
    }

    public static java.util.Map<common.emv.util.Tag, byte[]> createMap(java.nio.ByteBuffer byteBuffer, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            common.emv.util.BerTlv create = create(byteBuffer, z);
            if (create != null) {
                hashMap.put(create.getTag(), create.getValue());
            } else if (!z) {
                hashMap.clear();
                return hashMap;
            }
        }
        return hashMap;
    }

    public static java.util.Map<common.emv.util.Tag, byte[]> createMap(java.nio.ByteBuffer byteBuffer) {
        return createMap(byteBuffer, false);
    }

    public static java.util.List<common.emv.util.BerTlv> createList(byte[] bArr, boolean z) {
        return createList(java.nio.ByteBuffer.wrap(bArr), z);
    }

    public static java.util.List<common.emv.util.BerTlv> createList(byte[] bArr) {
        return createList(bArr, false);
    }

    public static java.util.List<common.emv.util.BerTlv> createList(java.nio.ByteBuffer byteBuffer, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            common.emv.util.BerTlv create = create(byteBuffer, z);
            if (create != null) {
                arrayList.add(create);
            } else if (!z) {
                arrayList.clear();
                return arrayList;
            }
        }
        return arrayList;
    }

    public static java.util.List<common.emv.util.BerTlv> createList(java.nio.ByteBuffer byteBuffer) {
        return createList(byteBuffer, false);
    }

    public static common.emv.util.BerTlv create(byte[] bArr, int i, int i2) {
        return create(java.nio.ByteBuffer.wrap(bArr, i, i2));
    }

    public static common.emv.util.BerTlv create(byte[] bArr) {
        return create(java.nio.ByteBuffer.wrap(bArr, 0, bArr.length));
    }

    public static common.emv.util.BerTlv create(java.nio.ByteBuffer byteBuffer) {
        return create(byteBuffer, false);
    }

    public static common.emv.util.BerTlv create(common.emv.util.Tag tag, byte[] bArr) {
        return new common.emv.util.BerTlv(tag, bArr);
    }

    public static common.emv.util.BerTlv create(common.emv.util.Tag tag, java.util.List<common.emv.util.BerTlv> list) {
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
        return new common.emv.util.BerTlv(tag, bArr2);
    }

    public BerTlv(common.emv.util.Tag tag, byte[] bArr) {
        if (tag == null) {
            throw new java.lang.IllegalArgumentException("The argument 'tag' can not be null");
        }
        this.f6717a = tag;
        this.b = bArr == null ? new byte[0] : bArr;
    }

    public BerTlv(int i, byte[] bArr) {
        this(new common.emv.util.Tag(i), bArr);
    }
}
