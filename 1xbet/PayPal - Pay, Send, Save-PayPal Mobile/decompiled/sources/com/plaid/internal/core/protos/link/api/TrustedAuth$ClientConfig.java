package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class TrustedAuth$ClientConfig extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig, com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CREDENTIAL_PANE_RESET_PASSWORD_COPY_FIELD_NUMBER = 3;
    public static final int CREDENTIAL_PANE_SUBMIT_BUTTON_COPY_FIELD_NUMBER = 1;
    public static final int CREDENTIAL_PANE_TITLE_COPY_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig> PARSER;
    private java.lang.String credentialPaneSubmitButtonCopy_ = "";
    private java.lang.String credentialPaneTitleCopy_ = "";
    private java.lang.String credentialPaneResetPasswordCopy_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig, com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig trustedAuth$ClientConfig = new com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig();
        DEFAULT_INSTANCE = trustedAuth$ClientConfig;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.class, trustedAuth$ClientConfig);
    }

    private TrustedAuth$ClientConfig() {
    }

    private void clearCredentialPaneResetPasswordCopy() {
        this.credentialPaneResetPasswordCopy_ = getDefaultInstance().getCredentialPaneResetPasswordCopy();
    }

    private void clearCredentialPaneSubmitButtonCopy() {
        this.credentialPaneSubmitButtonCopy_ = getDefaultInstance().getCredentialPaneSubmitButtonCopy();
    }

    private void clearCredentialPaneTitleCopy() {
        this.credentialPaneTitleCopy_ = getDefaultInstance().getCredentialPaneTitleCopy();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCredentialPaneResetPasswordCopyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.credentialPaneResetPasswordCopy_ = byteString.toStringUtf8();
    }

    private void setCredentialPaneSubmitButtonCopyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.credentialPaneSubmitButtonCopy_ = byteString.toStringUtf8();
    }

    private void setCredentialPaneTitleCopyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.credentialPaneTitleCopy_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.f.f6084a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig();
            case 2:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new java.lang.Object[]{"credentialPaneSubmitButtonCopy_", "credentialPaneTitleCopy_", "credentialPaneResetPasswordCopy_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.class) {
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

    public final java.lang.String getCredentialPaneResetPasswordCopy() {
        return this.credentialPaneResetPasswordCopy_;
    }

    public final com.google.protobuf.ByteString getCredentialPaneResetPasswordCopyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.credentialPaneResetPasswordCopy_);
    }

    public final java.lang.String getCredentialPaneSubmitButtonCopy() {
        return this.credentialPaneSubmitButtonCopy_;
    }

    public final com.google.protobuf.ByteString getCredentialPaneSubmitButtonCopyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.credentialPaneSubmitButtonCopy_);
    }

    public final java.lang.String getCredentialPaneTitleCopy() {
        return this.credentialPaneTitleCopy_;
    }

    public final com.google.protobuf.ByteString getCredentialPaneTitleCopyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.credentialPaneTitleCopy_);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig.a newBuilder(com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig trustedAuth$ClientConfig) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$ClientConfig);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setCredentialPaneResetPasswordCopy(java.lang.String str) {
        this.credentialPaneResetPasswordCopy_ = str;
    }

    private void setCredentialPaneSubmitButtonCopy(java.lang.String str) {
        this.credentialPaneSubmitButtonCopy_ = str;
    }

    private void setCredentialPaneTitleCopy(java.lang.String str) {
        this.credentialPaneTitleCopy_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
