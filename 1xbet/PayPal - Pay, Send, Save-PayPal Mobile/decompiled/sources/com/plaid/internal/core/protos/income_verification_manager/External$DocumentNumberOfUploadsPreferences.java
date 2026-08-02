package com.plaid.internal.core.protos.income_verification_manager;

/* loaded from: classes16.dex */
public final class External$DocumentNumberOfUploadsPreferences extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences, com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences DEFAULT_INSTANCE;
    public static final int MAX_UPLOADS_FIELD_NUMBER = 1;
    public static final int MIN_UPLOADS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences> PARSER;
    private int maxUploads_;
    private int minUploads_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences, com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences = new com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences();
        DEFAULT_INSTANCE = external$DocumentNumberOfUploadsPreferences;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.class, external$DocumentNumberOfUploadsPreferences);
    }

    private External$DocumentNumberOfUploadsPreferences() {
    }

    private void clearMaxUploads() {
        this.maxUploads_ = 0;
    }

    private void clearMinUploads() {
        this.minUploads_ = 0;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMaxUploads(int i) {
        this.maxUploads_ = i;
    }

    private void setMinUploads(int i) {
        this.minUploads_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.income_verification_manager.a.f6031a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences();
            case 2:
                return new com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new java.lang.Object[]{"maxUploads_", "minUploads_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.class) {
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

    public final int getMaxUploads() {
        return this.maxUploads_;
    }

    public final int getMinUploads() {
        return this.minUploads_;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.a newBuilder(com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences) {
        return DEFAULT_INSTANCE.createBuilder(external$DocumentNumberOfUploadsPreferences);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
