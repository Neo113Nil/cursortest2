package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class SilentNetworkAuth$LinkSNAProveFinishResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse, com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse> PARSER;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse, com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse silentNetworkAuth$LinkSNAProveFinishResponse = new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNAProveFinishResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.class, silentNetworkAuth$LinkSNAProveFinishResponse);
    }

    private SilentNetworkAuth$LinkSNAProveFinishResponse() {
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.e.f6083a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse.a newBuilder(com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse silentNetworkAuth$LinkSNAProveFinishResponse) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNAProveFinishResponse);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
