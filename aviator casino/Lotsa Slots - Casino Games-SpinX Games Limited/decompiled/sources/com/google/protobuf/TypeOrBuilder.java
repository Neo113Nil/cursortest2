package com.google.protobuf;

/* loaded from: classes4.dex */
public interface TypeOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    java.lang.String getEdition();

    com.google.protobuf.ByteString getEditionBytes();

    com.google.protobuf.Field getFields(int index);

    int getFieldsCount();

    java.util.List<com.google.protobuf.Field> getFieldsList();

    java.lang.String getName();

    com.google.protobuf.ByteString getNameBytes();

    java.lang.String getOneofs(int index);

    com.google.protobuf.ByteString getOneofsBytes(int index);

    int getOneofsCount();

    java.util.List<java.lang.String> getOneofsList();

    com.google.protobuf.Option getOptions(int index);

    int getOptionsCount();

    java.util.List<com.google.protobuf.Option> getOptionsList();

    com.google.protobuf.SourceContext getSourceContext();

    com.google.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
