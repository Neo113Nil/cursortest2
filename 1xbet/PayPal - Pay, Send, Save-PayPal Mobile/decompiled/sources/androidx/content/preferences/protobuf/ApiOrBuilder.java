package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public interface ApiOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
    androidx.content.preferences.protobuf.Method getMethods(int i);

    int getMethodsCount();

    java.util.List<androidx.content.preferences.protobuf.Method> getMethodsList();

    androidx.content.preferences.protobuf.Mixin getMixins(int i);

    int getMixinsCount();

    java.util.List<androidx.content.preferences.protobuf.Mixin> getMixinsList();

    java.lang.String getName();

    androidx.content.preferences.protobuf.ByteString getNameBytes();

    androidx.content.preferences.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList();

    androidx.content.preferences.protobuf.SourceContext getSourceContext();

    androidx.content.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    java.lang.String getVersion();

    androidx.content.preferences.protobuf.ByteString getVersionBytes();

    boolean hasSourceContext();
}
