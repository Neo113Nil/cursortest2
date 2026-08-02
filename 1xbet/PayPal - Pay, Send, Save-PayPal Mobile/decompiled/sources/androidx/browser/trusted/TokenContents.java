package androidx.browser.trusted;

/* loaded from: classes6.dex */
final class TokenContents {
    java.lang.String Camera2StreamConfigurationMap;
    java.util.List<byte[]> getHighSpeedVideoFpsRanges;
    final byte[] getHighSpeedVideoSizes;

    static androidx.browser.trusted.TokenContents Camera2StreamConfigurationMap(byte[] bArr) {
        return new androidx.browser.trusted.TokenContents(bArr);
    }

    private TokenContents(byte[] bArr) {
        this.getHighSpeedVideoSizes = bArr;
    }

    static androidx.browser.trusted.TokenContents getHighSpeedVideoFpsRangesFor(java.lang.String str, java.util.List<byte[]> list) throws java.io.IOException {
        return new androidx.browser.trusted.TokenContents(getHighSpeedVideoFpsRanges(str, list), str, list);
    }

    private TokenContents(byte[] bArr, java.lang.String str, java.util.List<byte[]> list) {
        this.getHighSpeedVideoSizes = bArr;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.getHighSpeedVideoFpsRanges.add(java.util.Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.getHighSpeedVideoSizes, ((androidx.browser.trusted.TokenContents) obj).getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.getHighSpeedVideoSizes);
    }

    private static byte[] getHighSpeedVideoFpsRanges(java.lang.String str, java.util.List<byte[]> list) throws java.io.IOException {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.browser.trusted.TokenContents$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.browser.trusted.TokenContents.getHighSpeedVideoFpsRangesFor((byte[]) obj, (byte[]) obj2);
            }
        });
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    final void getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap == null) {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(this.getHighSpeedVideoSizes));
            this.Camera2StreamConfigurationMap = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (dataInputStream.read(bArr) != readInt2) {
                    throw new java.lang.IllegalStateException("Could not read fingerprint");
                }
                this.getHighSpeedVideoFpsRanges.add(bArr);
            }
        }
    }

    public static /* synthetic */ int getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2) {
            if (bArr == null) {
                return -1;
            }
            if (bArr2 == null) {
                return 1;
            }
            for (int i = 0; i < java.lang.Math.min(bArr.length, bArr2.length); i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
        }
        return 0;
    }
}
