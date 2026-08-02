package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public interface EnumOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    java.lang.String getEdition();

    com.google.crypto.tink.shaded.protobuf.ByteString getEditionBytes();

    com.google.crypto.tink.shaded.protobuf.EnumValue getEnumvalue(int i);

    int getEnumvalueCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.EnumValue> getEnumvalueList();

    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext();

    com.google.crypto.tink.shaded.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
