package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class TrustedAuth$InstitutionConfig extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig, com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig DEFAULT_INSTANCE;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig> PARSER = null;
    public static final int PASSWORD_LABEL_FIELD_NUMBER = 6;
    public static final int RENDERED_INSTITUTION_FIELD_NUMBER = 8;
    public static final int RESET_PASSWORD_BUTTON_URL_FIELD_NUMBER = 7;
    public static final int USERNAME_LABEL_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution renderedInstitution_;
    private java.lang.String institutionId_ = "";
    private java.lang.String usernameLabel_ = "";
    private java.lang.String passwordLabel_ = "";
    private java.lang.String resetPasswordButtonUrl_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig, com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig = new com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig();
        DEFAULT_INSTANCE = trustedAuth$InstitutionConfig;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.class, trustedAuth$InstitutionConfig);
    }

    private TrustedAuth$InstitutionConfig() {
    }

    private void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    private void clearPasswordLabel() {
        this.passwordLabel_ = getDefaultInstance().getPasswordLabel();
    }

    private void clearRenderedInstitution() {
        this.renderedInstitution_ = null;
        this.bitField0_ &= -2;
    }

    private void clearResetPasswordButtonUrl() {
        this.resetPasswordButtonUrl_ = getDefaultInstance().getResetPasswordButtonUrl();
    }

    private void clearUsernameLabel() {
        this.usernameLabel_ = getDefaultInstance().getUsernameLabel();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    private void setPasswordLabelBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.passwordLabel_ = byteString.toStringUtf8();
    }

    private void setResetPasswordButtonUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.resetPasswordButtonUrl_ = byteString.toStringUtf8();
    }

    private void setUsernameLabelBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.usernameLabel_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.f.f6084a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig();
            case 2:
                return new com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000", new java.lang.Object[]{"bitField0_", "institutionId_", "usernameLabel_", "passwordLabel_", "resetPasswordButtonUrl_", "renderedInstitution_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.class) {
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

    public final java.lang.String getInstitutionId() {
        return this.institutionId_;
    }

    public final com.google.protobuf.ByteString getInstitutionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
    }

    public final java.lang.String getPasswordLabel() {
        return this.passwordLabel_;
    }

    public final com.google.protobuf.ByteString getPasswordLabelBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.passwordLabel_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution getRenderedInstitution() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution = this.renderedInstitution_;
        return common$RenderedInstitution == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
    }

    public final java.lang.String getResetPasswordButtonUrl() {
        return this.resetPasswordButtonUrl_;
    }

    public final com.google.protobuf.ByteString getResetPasswordButtonUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.resetPasswordButtonUrl_);
    }

    public final java.lang.String getUsernameLabel() {
        return this.usernameLabel_;
    }

    public final com.google.protobuf.ByteString getUsernameLabelBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.usernameLabel_);
    }

    public final boolean hasRenderedInstitution() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeRenderedInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution2 = this.renderedInstitution_;
        if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance()) {
            this.renderedInstitution_ = common$RenderedInstitution;
        } else {
            this.renderedInstitution_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.newBuilder(this.renderedInstitution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.a) common$RenderedInstitution).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig.a newBuilder(com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$InstitutionConfig);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setRenderedInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
        this.renderedInstitution_ = common$RenderedInstitution;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setInstitutionId(java.lang.String str) {
        this.institutionId_ = str;
    }

    private void setPasswordLabel(java.lang.String str) {
        this.passwordLabel_ = str;
    }

    private void setResetPasswordButtonUrl(java.lang.String str) {
        this.resetPasswordButtonUrl_ = str;
    }

    private void setUsernameLabel(java.lang.String str) {
        this.usernameLabel_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
