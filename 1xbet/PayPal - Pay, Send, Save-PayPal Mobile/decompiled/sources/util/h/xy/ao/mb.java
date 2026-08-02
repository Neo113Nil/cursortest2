package util.h.xy.ao;

/* loaded from: classes5.dex */
public final class mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[][] m25035(byte[] bArr, java.util.List<java.lang.String> list) throws java.io.IOException {
        byte[][] bArr2 = new byte[list.size()][];
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(byteArrayInputStream, util.h.xy.al.ra.f459));
        try {
            jsonReader.beginObject();
            int i = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = ((i ^ 53) + ((i & 53) << 1)) % 128;
            while (jsonReader.hasNext()) {
                int i2 = getHighSpeedVideoFpsRanges;
                int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    jsonReader.nextName();
                    jsonReader.peek();
                    throw new java.lang.NullPointerException();
                }
                java.lang.String nextName = jsonReader.nextName();
                android.util.JsonToken peek = jsonReader.peek();
                if (peek == android.util.JsonToken.STRING || peek == android.util.JsonToken.NUMBER) {
                    int indexOf = list.indexOf(nextName);
                    if (indexOf >= 0) {
                        int i4 = getHighSpeedVideoFpsRanges;
                        int i5 = ((i4 | 53) << 1) - (i4 ^ 53);
                        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                        if (i5 % 2 == 0) {
                            bArr2[indexOf] = jsonReader.nextString().getBytes();
                            throw null;
                        }
                        bArr2[indexOf] = jsonReader.nextString().getBytes();
                    } else {
                        jsonReader.skipValue();
                    }
                    int i6 = getHighResolutionOutputSizeshNQ4ISI;
                    int i7 = (i6 ^ 99) + ((i6 & 99) << 1);
                    getHighSpeedVideoFpsRanges = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    int i9 = getHighSpeedVideoFpsRanges;
                    getHighResolutionOutputSizeshNQ4ISI = ((i9 ^ 55) + ((i9 & 55) << 1)) % 128;
                    jsonReader.skipValue();
                    int i10 = getHighResolutionOutputSizeshNQ4ISI;
                    int i11 = (i10 & 87) + (i10 | 87);
                    getHighSpeedVideoFpsRanges = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 2 / 4;
                    }
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            byteArrayInputStream.close();
            int i13 = getHighResolutionOutputSizeshNQ4ISI + 47;
            getHighSpeedVideoFpsRanges = i13 % 128;
            if (i13 % 2 == 0) {
                return bArr2;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            jsonReader.close();
            byteArrayInputStream.close();
            throw th;
        }
    }
}
