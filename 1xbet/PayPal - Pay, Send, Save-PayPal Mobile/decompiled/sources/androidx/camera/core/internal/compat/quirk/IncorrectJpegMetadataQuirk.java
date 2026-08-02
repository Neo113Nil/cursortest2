package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public final class IncorrectJpegMetadataQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.HashSet(java.util.Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    public final byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy) {
        byte b;
        int i = 0;
        java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        int capacity = buffer.capacity();
        byte[] bArr = new byte[capacity];
        buffer.rewind();
        buffer.get(bArr);
        int i2 = 2;
        for (int i3 = 2; i3 + 4 <= capacity && (b = bArr[i3]) == -1; i3 += (((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255)) + 2) {
            if (b == -1 && bArr[i3 + 1] == -38) {
                break;
            }
        }
        while (true) {
            int i4 = i2 + 1;
            if (i4 > capacity) {
                i = -1;
                break;
            }
            if (bArr[i2] == -1 && bArr[i4] == -40) {
                i = i2;
                break;
            }
            i2 = i4;
        }
        if (i == -1) {
            return bArr;
        }
        return java.util.Arrays.copyOfRange(bArr, i, buffer.limit());
    }

    static boolean getHighSpeedVideoSizes() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && getHighSpeedVideoFpsRangesFor.contains(android.os.Build.DEVICE.toUpperCase(java.util.Locale.US));
    }
}
