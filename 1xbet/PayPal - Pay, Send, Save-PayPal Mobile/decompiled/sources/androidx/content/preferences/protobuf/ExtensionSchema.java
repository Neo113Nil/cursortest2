package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
abstract class ExtensionSchema<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
    abstract void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Writer writer, java.util.Map.Entry<?, ?> entry) throws java.io.IOException;

    abstract void Camera2StreamConfigurationMap(java.lang.Object obj);

    abstract int getHighResolutionOutputSizeshNQ4ISI(java.util.Map.Entry<?, ?> entry);

    abstract androidx.content.preferences.protobuf.FieldSet<T> getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj);

    abstract boolean getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.MessageLite messageLite);

    abstract java.lang.Object getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.MessageLite messageLite, int i);

    abstract void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ByteString byteString, java.lang.Object obj, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.FieldSet<T> fieldSet) throws java.io.IOException;

    abstract androidx.content.preferences.protobuf.FieldSet<T> getHighSpeedVideoFpsRangesFor(java.lang.Object obj);

    abstract <UT, UB> UB getHighSpeedVideoFpsRangesFor(java.lang.Object obj, androidx.content.preferences.protobuf.Reader reader, java.lang.Object obj2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.FieldSet<T> fieldSet, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException;

    abstract void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Reader reader, java.lang.Object obj, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.FieldSet<T> fieldSet) throws java.io.IOException;

    ExtensionSchema() {
    }
}
