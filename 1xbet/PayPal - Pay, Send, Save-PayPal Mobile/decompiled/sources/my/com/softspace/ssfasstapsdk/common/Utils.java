package my.com.softspace.ssfasstapsdk.common;

/* loaded from: classes17.dex */
public class Utils {

    public static class Constants {
        public static final java.lang.String ONLINE_HOST_MSG_GROUPING = "00E0";
    }

    static /* synthetic */ byte[] getHighSpeedVideoSizes(byte[] bArr) {
        return bArr;
    }

    public static java.util.Map<java.lang.String, byte[]> parsePlainTLVToMap(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        parseTLVStringMap(bArr, hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (bArr != null && bArr.length > 0) {
            java.lang.String str = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= bArr.length) {
                    break;
                }
                if (!z) {
                    z = true;
                    byte[] bArr3 = {bArr[i], bArr[i + 1]};
                    i += 2;
                    str = my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr3, true);
                } else {
                    int parseInt = java.lang.Integer.parseInt(java.lang.String.format("%02x00", java.lang.Byte.valueOf(bArr[i])), 16);
                    int parseInt2 = java.lang.Integer.parseInt(java.lang.String.format("%02x", java.lang.Byte.valueOf(bArr[i + 1])), 16);
                    int i2 = i + 2;
                    int i3 = parseInt + parseInt2 + i2;
                    byte[] createByteBuffer = my.com.softspace.reader.internal.kernelconfig.HexUtil.createByteBuffer(bArr, i2, i3);
                    if (str.equalsIgnoreCase(my.com.softspace.ssfasstapsdk.common.Utils.Constants.ONLINE_HOST_MSG_GROUPING)) {
                        bArr2 = createByteBuffer;
                        break;
                    }
                    i = i3;
                    z = false;
                }
            }
        }
        if (bArr2 == null || bArr2.length <= 0) {
            return hashMap;
        }
        parseTLVStringMap(bArr2, hashMap2);
        final java.util.HashMap hashMap3 = new java.util.HashMap(hashMap);
        hashMap2.forEach(new java.util.function.BiConsumer() { // from class: my.com.softspace.ssfasstapsdk.common.Utils$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                hashMap3.merge((java.lang.String) obj, (byte[]) obj2, new java.util.function.BiFunction() { // from class: my.com.softspace.ssfasstapsdk.common.Utils$$ExternalSyntheticLambda1
                    @Override // java.util.function.BiFunction
                    public final java.lang.Object apply(java.lang.Object obj3, java.lang.Object obj4) {
                        return my.com.softspace.ssfasstapsdk.common.Utils.getHighSpeedVideoSizes((byte[]) obj3);
                    }
                });
            }
        });
        hashMap3.remove(my.com.softspace.ssfasstapsdk.common.Utils.Constants.ONLINE_HOST_MSG_GROUPING);
        java.util.Arrays.fill(bArr2, (byte) 0);
        hashMap2.clear();
        hashMap.clear();
        return hashMap3;
    }

    public static void parseTLVStringMap(byte[] bArr, java.util.Map<java.lang.String, byte[]> map) {
        parseTLVStringMap(bArr, map, false);
    }

    public static void parseTLVStringMap(byte[] bArr, java.util.Map<java.lang.String, byte[]> map, boolean z) {
        if (map == null || bArr == null || bArr.length <= 0) {
            return;
        }
        if (!z) {
            java.lang.String str = null;
            int i = 0;
            boolean z2 = false;
            while (i < bArr.length) {
                if (!z2) {
                    byte[] bArr2 = {bArr[i], bArr[i + 1]};
                    i += 2;
                    z2 = true;
                    str = my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr2, true);
                } else {
                    int parseInt = java.lang.Integer.parseInt(java.lang.String.format("%02x00", java.lang.Byte.valueOf(bArr[i])), 16);
                    int parseInt2 = java.lang.Integer.parseInt(java.lang.String.format("%02x", java.lang.Byte.valueOf(bArr[i + 1])), 16);
                    int i2 = i + 2;
                    int i3 = parseInt + parseInt2 + i2;
                    map.put(str, my.com.softspace.reader.internal.kernelconfig.HexUtil.createByteBuffer(bArr, i2, i3));
                    i = i3;
                    z2 = false;
                }
            }
            return;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        while (wrap.hasRemaining()) {
            my.com.softspace.reader.internal.kernelconfig.BerTlv create = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(wrap);
            map.put(create.getTag().toHexValue(), create.getValue());
        }
    }
}
