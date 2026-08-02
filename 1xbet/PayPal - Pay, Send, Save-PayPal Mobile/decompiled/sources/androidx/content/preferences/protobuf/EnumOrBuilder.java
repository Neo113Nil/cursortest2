package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public interface EnumOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
    java.lang.String getEdition();

    androidx.content.preferences.protobuf.ByteString getEditionBytes();

    androidx.content.preferences.protobuf.EnumValue getEnumvalue(int i);

    int getEnumvalueCount();

    java.util.List<androidx.content.preferences.protobuf.EnumValue> getEnumvalueList();

    java.lang.String getName();

    androidx.content.preferences.protobuf.ByteString getNameBytes();

    androidx.content.preferences.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList();

    androidx.content.preferences.protobuf.SourceContext getSourceContext();

    androidx.content.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
