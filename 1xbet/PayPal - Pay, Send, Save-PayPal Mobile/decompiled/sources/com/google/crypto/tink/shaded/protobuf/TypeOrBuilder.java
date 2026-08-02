package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public interface TypeOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    java.lang.String getEdition();

    com.google.crypto.tink.shaded.protobuf.ByteString getEditionBytes();

    com.google.crypto.tink.shaded.protobuf.Field getFields(int i);

    int getFieldsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Field> getFieldsList();

    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    java.lang.String getOneofs(int i);

    com.google.crypto.tink.shaded.protobuf.ByteString getOneofsBytes(int i);

    int getOneofsCount();

    java.util.List<java.lang.String> getOneofsList();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext();

    com.google.crypto.tink.shaded.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
