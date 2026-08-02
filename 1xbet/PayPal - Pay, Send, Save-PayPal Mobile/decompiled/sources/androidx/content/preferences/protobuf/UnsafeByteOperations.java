package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static androidx.content.preferences.protobuf.ByteString unsafeWrap(byte[] bArr) {
        return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoSizes(bArr);
    }

    public static androidx.content.preferences.protobuf.ByteString unsafeWrap(byte[] bArr, int i, int i2) {
        return androidx.content.preferences.protobuf.ByteString.getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
    }

    public static androidx.content.preferences.protobuf.ByteString unsafeWrap(java.nio.ByteBuffer byteBuffer) {
        return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(byteBuffer);
    }

    public static void unsafeWriteTo(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
        byteString.getHighResolutionOutputSizeshNQ4ISI(byteOutput);
    }
}
