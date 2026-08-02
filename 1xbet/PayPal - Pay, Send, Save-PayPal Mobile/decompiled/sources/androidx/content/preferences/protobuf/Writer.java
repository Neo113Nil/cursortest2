package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    void Camera2StreamConfigurationMap(int i, int i2) throws java.io.IOException;

    void Camera2StreamConfigurationMap(int i, long j) throws java.io.IOException;

    <K, V> void Camera2StreamConfigurationMap(int i, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException;

    void Camera2StreamConfigurationMap(int i, java.util.List<androidx.content.preferences.protobuf.ByteString> list) throws java.io.IOException;

    void Camera2StreamConfigurationMap(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException;

    void Camera2StreamConfigurationMap(int i, boolean z) throws java.io.IOException;

    androidx.datastore.preferences.protobuf.Writer.FieldOrder getHighResolutionOutputSizeshNQ4ISI();

    void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) throws java.io.IOException;

    void getHighResolutionOutputSizeshNQ4ISI(int i, long j) throws java.io.IOException;

    void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.String> list) throws java.io.IOException;

    void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException;

    void getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(int i, long j) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.ByteString byteString) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(int i, java.lang.String str) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void getHighSpeedVideoFpsRangesFor(int i, double d) throws java.io.IOException;

    void getHighSpeedVideoFpsRangesFor(int i, int i2) throws java.io.IOException;

    void getHighSpeedVideoFpsRangesFor(int i, long j) throws java.io.IOException;

    void getHighSpeedVideoFpsRangesFor(int i, java.lang.Object obj) throws java.io.IOException;

    void getHighSpeedVideoFpsRangesFor(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException;

    void getHighSpeedVideoSizes(int i, float f) throws java.io.IOException;

    void getHighSpeedVideoSizes(int i, int i2) throws java.io.IOException;

    void getHighSpeedVideoSizes(int i, long j) throws java.io.IOException;

    @java.lang.Deprecated
    void getHighSpeedVideoSizes(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException;

    @java.lang.Deprecated
    void getHighSpeedVideoSizes(int i, java.util.List<?> list, androidx.content.preferences.protobuf.Schema schema) throws java.io.IOException;

    void getHighSpeedVideoSizes(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void getHighSpeedVideoSizesFor(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    @java.lang.Deprecated
    void getInputFormats(int i) throws java.io.IOException;

    void getInputFormats(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void getInputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void getOutputFormats(int i, int i2) throws java.io.IOException;

    void getOutputFormats(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException;

    @java.lang.Deprecated
    void getOutputMinFrameDuration(int i) throws java.io.IOException;

    void getOutputMinFrameDuration(int i, int i2) throws java.io.IOException;

    void getOutputMinFrameDuration(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void getOutputMinFrameDurationlomOqCM(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void getOutputSizes(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void getOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void getOutputStallDuration(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;
}
