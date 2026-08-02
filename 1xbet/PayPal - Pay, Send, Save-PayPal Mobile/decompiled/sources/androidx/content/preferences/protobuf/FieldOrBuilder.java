package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public interface FieldOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
    androidx.datastore.preferences.protobuf.Field.Cardinality getCardinality();

    int getCardinalityValue();

    java.lang.String getDefaultValue();

    androidx.content.preferences.protobuf.ByteString getDefaultValueBytes();

    java.lang.String getJsonName();

    androidx.content.preferences.protobuf.ByteString getJsonNameBytes();

    androidx.datastore.preferences.protobuf.Field.Kind getKind();

    int getKindValue();

    java.lang.String getName();

    androidx.content.preferences.protobuf.ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    androidx.content.preferences.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList();

    boolean getPacked();

    java.lang.String getTypeUrl();

    androidx.content.preferences.protobuf.ByteString getTypeUrlBytes();
}
