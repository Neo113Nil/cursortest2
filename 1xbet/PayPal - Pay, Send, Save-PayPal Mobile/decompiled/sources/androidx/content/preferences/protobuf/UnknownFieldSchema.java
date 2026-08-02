package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
abstract class UnknownFieldSchema<T, B> {
    private static volatile int Camera2StreamConfigurationMap = 100;

    abstract int Camera2StreamConfigurationMap(T t);

    abstract T Camera2StreamConfigurationMap(T t, T t2);

    abstract void Camera2StreamConfigurationMap(B b, int i, int i2);

    abstract int getHighResolutionOutputSizeshNQ4ISI(T t);

    abstract B getHighResolutionOutputSizeshNQ4ISI();

    abstract void getHighResolutionOutputSizeshNQ4ISI(B b, int i, androidx.content.preferences.protobuf.ByteString byteString);

    abstract void getHighResolutionOutputSizeshNQ4ISI(T t, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException;

    abstract void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, B b);

    abstract void getHighSpeedVideoFpsRanges(java.lang.Object obj);

    abstract void getHighSpeedVideoFpsRanges(B b, int i, long j);

    abstract void getHighSpeedVideoFpsRanges(B b, int i, T t);

    abstract B getHighSpeedVideoFpsRangesFor(java.lang.Object obj);

    abstract void getHighSpeedVideoFpsRangesFor(B b, int i, long j);

    abstract void getHighSpeedVideoFpsRangesFor(T t, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException;

    abstract T getHighSpeedVideoSizes(java.lang.Object obj);

    abstract void getHighSpeedVideoSizes(java.lang.Object obj, T t);

    abstract T getInputSizeshNQ4ISI(B b);

    UnknownFieldSchema() {
    }

    final boolean Camera2StreamConfigurationMap(B b, androidx.content.preferences.protobuf.Reader reader, int i) throws java.io.IOException {
        int highResolutionOutputSizeshNQ4ISI = reader.getHighResolutionOutputSizeshNQ4ISI();
        int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(highResolutionOutputSizeshNQ4ISI);
        int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(highResolutionOutputSizeshNQ4ISI);
        if (tagWireType == 0) {
            getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<T, B>) b, tagFieldNumber, reader.getOutputStallDuration());
            return true;
        }
        if (tagWireType == 1) {
            getHighSpeedVideoFpsRangesFor(b, tagFieldNumber, reader.getInputSizeshNQ4ISI());
            return true;
        }
        if (tagWireType == 2) {
            getHighResolutionOutputSizeshNQ4ISI(b, tagFieldNumber, reader.Camera2StreamConfigurationMap());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema<T, B>) b, tagFieldNumber, reader.getInputFormats());
                return true;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        B highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
        int Camera2StreamConfigurationMap2 = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(tagFieldNumber, 4);
        int i2 = i + 1;
        if (i2 >= Camera2StreamConfigurationMap) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputFormats();
        }
        while (reader.getHighSpeedVideoFpsRangesFor() != Integer.MAX_VALUE && Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema<T, B>) highResolutionOutputSizeshNQ4ISI2, reader, i2)) {
        }
        if (Camera2StreamConfigurationMap2 != reader.getHighResolutionOutputSizeshNQ4ISI()) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
        }
        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.UnknownFieldSchema<T, B>) b, tagFieldNumber, (int) getInputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2));
        return true;
    }
}
