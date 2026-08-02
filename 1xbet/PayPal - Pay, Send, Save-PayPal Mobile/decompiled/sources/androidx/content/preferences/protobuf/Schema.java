package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
interface Schema<T> {
    T Camera2StreamConfigurationMap();

    void Camera2StreamConfigurationMap(T t, androidx.content.preferences.protobuf.Reader reader, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    void Camera2StreamConfigurationMap(T t, T t2);

    boolean Camera2StreamConfigurationMap(T t);

    void getHighResolutionOutputSizeshNQ4ISI(T t, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException;

    void getHighSpeedVideoFpsRanges(T t);

    int getHighSpeedVideoFpsRangesFor(T t);

    void getHighSpeedVideoFpsRangesFor(T t, byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException;

    boolean getHighSpeedVideoFpsRangesFor(T t, T t2);

    int getHighSpeedVideoSizes(T t);
}
