package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
public class BerTlvTemplate {
    private final java.lang.Integer getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.Integer, my.com.softspace.reader.internal.kernelconfig.BerTlv> getHighSpeedVideoSizes;

    public BerTlvTemplate(int i) {
        this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    public BerTlvTemplate(int i, java.util.Map<java.lang.Integer, my.com.softspace.reader.internal.kernelconfig.BerTlv> map) {
        this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
        this.getHighSpeedVideoSizes = map;
    }

    public my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate put(int i, byte[] bArr) {
        this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i), my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(i), bArr));
        return this;
    }

    public my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate put(my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv) {
        this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(berTlv.getTag().toIntValue()), berTlv);
        return this;
    }

    public java.lang.String getValueAsHexString(int i) {
        java.util.Map<java.lang.Integer, my.com.softspace.reader.internal.kernelconfig.BerTlv> map = this.getHighSpeedVideoSizes;
        if (map == null || map.size() == 0 || this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i)) == null || this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i)).getValueAsHexString() == null) {
            return "";
        }
        return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i)).getValueAsHexString();
    }

    public byte[] getValue(int i) {
        java.util.Map<java.lang.Integer, my.com.softspace.reader.internal.kernelconfig.BerTlv> map = this.getHighSpeedVideoSizes;
        if (map == null || map.size() == 0 || this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i)) == null || this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i)).getValue() == null) {
            return null;
        }
        return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i)).getValue();
    }

    public byte[] toByteArray() throws java.io.IOException {
        java.util.Map<java.lang.Integer, my.com.softspace.reader.internal.kernelconfig.BerTlv> map = this.getHighSpeedVideoSizes;
        if (map == null || map.size() == 0) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.Iterator<java.lang.Integer> it = this.getHighSpeedVideoSizes.keySet().iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(this.getHighSpeedVideoSizes.get(it.next()).toByteArray());
        }
        return my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(this.getHighSpeedVideoFpsRangesFor.intValue()), byteArrayOutputStream.toByteArray()).toByteArray();
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate create(byte[] bArr) {
        my.com.softspace.reader.internal.kernelconfig.BerTlv create = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(bArr);
        int intValue = create.getTag().toIntValue();
        java.util.Map<my.com.softspace.reader.internal.kernelconfig.Tag, byte[]> createMap = my.com.softspace.reader.internal.kernelconfig.BerTlv.createMap(create.getValue());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (my.com.softspace.reader.internal.kernelconfig.Tag tag : createMap.keySet()) {
            linkedHashMap.put(java.lang.Integer.valueOf(tag.toIntValue()), createMap.get(tag));
        }
        return new my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate(intValue, linkedHashMap);
    }

    public static my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate create(int i, byte[] bArr) {
        java.util.LinkedHashMap linkedHashMap;
        if (bArr != null) {
            java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList = my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(bArr);
            linkedHashMap = new java.util.LinkedHashMap();
            for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : createList) {
                linkedHashMap.put(java.lang.Integer.valueOf(berTlv.getTag().toIntValue()), berTlv);
            }
        } else {
            linkedHashMap = null;
        }
        return new my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate(i, linkedHashMap);
    }
}
