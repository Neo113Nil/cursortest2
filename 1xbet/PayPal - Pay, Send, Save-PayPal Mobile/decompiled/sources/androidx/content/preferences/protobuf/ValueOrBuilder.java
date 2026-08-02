package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public interface ValueOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
    boolean getBoolValue();

    androidx.datastore.preferences.protobuf.Value.KindCase getKindCase();

    androidx.content.preferences.protobuf.ListValue getListValue();

    androidx.content.preferences.protobuf.NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    java.lang.String getStringValue();

    androidx.content.preferences.protobuf.ByteString getStringValueBytes();

    androidx.content.preferences.protobuf.Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
