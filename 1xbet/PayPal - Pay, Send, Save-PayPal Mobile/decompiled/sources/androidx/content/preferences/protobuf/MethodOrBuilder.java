package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public interface MethodOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
    java.lang.String getName();

    androidx.content.preferences.protobuf.ByteString getNameBytes();

    androidx.content.preferences.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList();

    boolean getRequestStreaming();

    java.lang.String getRequestTypeUrl();

    androidx.content.preferences.protobuf.ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    java.lang.String getResponseTypeUrl();

    androidx.content.preferences.protobuf.ByteString getResponseTypeUrlBytes();

    androidx.content.preferences.protobuf.Syntax getSyntax();

    int getSyntaxValue();
}
