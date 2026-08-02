package com.plaid.internal.core.protos.income_verification_manager;

/* loaded from: classes16.dex */
public final class External$DocumentUploadFilePreference extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference, com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.a> implements com.plaid.internal.core.protos.income_verification_manager.c {
    private static final com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> PARSER = null;
    public static final int UPLOAD_FILE_TYPE_FIELD_NUMBER = 1;
    private int uploadFileType_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference, com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.a> implements com.plaid.internal.core.protos.income_verification_manager.c {
        public a() {
            super(com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference external$DocumentUploadFilePreference = new com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference();
        DEFAULT_INSTANCE = external$DocumentUploadFilePreference;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.class, external$DocumentUploadFilePreference);
    }

    private External$DocumentUploadFilePreference() {
    }

    private void clearUploadFileType() {
        this.uploadFileType_ = 0;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setUploadFileType(com.plaid.internal.core.protos.income_verification_manager.d dVar) {
        this.uploadFileType_ = dVar.getNumber();
    }

    private void setUploadFileTypeValue(int i) {
        this.uploadFileType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.income_verification_manager.a.f6031a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference();
            case 2:
                return new com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"uploadFileType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.class) {
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

    public final com.plaid.internal.core.protos.income_verification_manager.d getUploadFileType() {
        com.plaid.internal.core.protos.income_verification_manager.d forNumber = com.plaid.internal.core.protos.income_verification_manager.d.forNumber(this.uploadFileType_);
        return forNumber == null ? com.plaid.internal.core.protos.income_verification_manager.d.UNRECOGNIZED : forNumber;
    }

    public final int getUploadFileTypeValue() {
        return this.uploadFileType_;
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.a newBuilder(com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        return DEFAULT_INSTANCE.createBuilder(external$DocumentUploadFilePreference);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
