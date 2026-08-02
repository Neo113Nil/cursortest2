package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public interface StructOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
    boolean containsFields(java.lang.String str);

    @java.lang.Deprecated
    java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> getFields();

    int getFieldsCount();

    java.util.Map<java.lang.String, androidx.content.preferences.protobuf.Value> getFieldsMap();

    androidx.content.preferences.protobuf.Value getFieldsOrDefault(java.lang.String str, androidx.content.preferences.protobuf.Value value);

    androidx.content.preferences.protobuf.Value getFieldsOrThrow(java.lang.String str);
}
