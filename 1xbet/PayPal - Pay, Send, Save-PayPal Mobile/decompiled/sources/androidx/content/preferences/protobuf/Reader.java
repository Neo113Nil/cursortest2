package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
interface Reader {
    androidx.content.preferences.protobuf.ByteString Camera2StreamConfigurationMap() throws java.io.IOException;

    void Camera2StreamConfigurationMap(java.util.List<androidx.content.preferences.protobuf.ByteString> list) throws java.io.IOException;

    @java.lang.Deprecated
    <T> void Camera2StreamConfigurationMap(java.util.List<T> list, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    boolean CoroutineDebuggingKt() throws java.io.IOException;

    int getHighResolutionOutputSizeshNQ4ISI();

    void getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.Boolean> list) throws java.io.IOException;

    <T> void getHighSpeedVideoFpsRanges(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    boolean getHighSpeedVideoFpsRanges() throws java.io.IOException;

    int getHighSpeedVideoFpsRangesFor() throws java.io.IOException;

    <T> T getHighSpeedVideoFpsRangesFor(java.lang.Class<T> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    void getHighSpeedVideoFpsRangesFor(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    <T> void getHighSpeedVideoFpsRangesFor(java.util.List<T> list, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    double getHighSpeedVideoSizes() throws java.io.IOException;

    @java.lang.Deprecated
    <T> T getHighSpeedVideoSizes(java.lang.Class<T> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    <T> void getHighSpeedVideoSizes(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    void getHighSpeedVideoSizes(java.util.List<java.lang.Double> list) throws java.io.IOException;

    <K, V> void getHighSpeedVideoSizes(java.util.Map<K, V> map, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    float getHighSpeedVideoSizesFor() throws java.io.IOException;

    void getHighSpeedVideoSizesFor(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    int getInputFormats() throws java.io.IOException;

    void getInputFormats(java.util.List<java.lang.Long> list) throws java.io.IOException;

    long getInputSizeshNQ4ISI() throws java.io.IOException;

    void getInputSizeshNQ4ISI(java.util.List<java.lang.Float> list) throws java.io.IOException;

    int getOutputFormats() throws java.io.IOException;

    void getOutputFormats(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    int getOutputMinFrameDuration() throws java.io.IOException;

    void getOutputMinFrameDuration(java.util.List<java.lang.Long> list) throws java.io.IOException;

    int getOutputMinFrameDurationlomOqCM() throws java.io.IOException;

    void getOutputMinFrameDurationlomOqCM(java.util.List<java.lang.String> list) throws java.io.IOException;

    long getOutputSizes() throws java.io.IOException;

    void getOutputSizes(java.util.List<java.lang.Long> list) throws java.io.IOException;

    long getOutputSizeshNQ4ISI() throws java.io.IOException;

    void getOutputSizeshNQ4ISI(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    long getOutputStallDuration() throws java.io.IOException;

    void getOutputStallDuration(java.util.List<java.lang.Long> list) throws java.io.IOException;

    int getOutputStallDurationlomOqCM() throws java.io.IOException;

    void getOutputStallDurationlomOqCM(java.util.List<java.lang.String> list) throws java.io.IOException;

    long getValidOutputFormatsForInputhNQ4ISI() throws java.io.IOException;

    java.lang.String isOutputSupportedFor() throws java.io.IOException;

    void isOutputSupportedFor(java.util.List<java.lang.Long> list) throws java.io.IOException;

    java.lang.String isOutputSupportedForhNQ4ISI() throws java.io.IOException;

    void toString(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    int unwrapAs() throws java.io.IOException;
}
