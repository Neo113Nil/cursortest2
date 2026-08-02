package com.plaid.internal.core.protos.webauthn;

/* loaded from: classes16.dex */
public final class Webauthn$WebAuthnOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions, com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int AUTHENTICATE_OPTIONS_FIELD_NUMBER = 2;
    public static final int CREATE_OPTIONS_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions> PARSER;
    private int optionsCase_ = 0;
    private java.lang.Object options_;

    public static final class AuthenticateOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions, com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.AuthenticateOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ATTESTATION_FIELD_NUMBER = 2;
        public static final int CHALLENGE_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions> PARSER = null;
        public static final int TIMEOUT_FIELD_NUMBER = 3;
        private int timeout_;
        private java.lang.String challenge_ = "";
        private java.lang.String attestation_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions, com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.AuthenticateOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions authenticateOptions = new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions();
            DEFAULT_INSTANCE = authenticateOptions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.class, authenticateOptions);
        }

        private AuthenticateOptions() {
        }

        private void clearAttestation() {
            this.attestation_ = getDefaultInstance().getAttestation();
        }

        private void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        private void clearTimeout() {
            this.timeout_ = 0;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.AuthenticateOptions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAttestationBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.attestation_ = byteString.toStringUtf8();
        }

        private void setChallengeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.challenge_ = byteString.toStringUtf8();
        }

        private void setTimeout(int i) {
            this.timeout_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.webauthn.a.f6388a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions();
                case 2:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.AuthenticateOptions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new java.lang.Object[]{"challenge_", "attestation_", "timeout_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.class) {
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

        public final java.lang.String getAttestation() {
            return this.attestation_;
        }

        public final com.google.protobuf.ByteString getAttestationBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.attestation_);
        }

        public final java.lang.String getChallenge() {
            return this.challenge_;
        }

        public final com.google.protobuf.ByteString getChallengeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.challenge_);
        }

        public final int getTimeout() {
            return this.timeout_;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.AuthenticateOptions.a newBuilder(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions authenticateOptions) {
            return DEFAULT_INSTANCE.createBuilder(authenticateOptions);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAttestation(java.lang.String str) {
            this.attestation_ = str;
        }

        private void setChallenge(java.lang.String str) {
            this.challenge_ = str;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CreateOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions, com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.CreateOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ATTESTATION_FIELD_NUMBER = 4;
        public static final int AUTHENTICATOR_ATTACHMENT_FIELD_NUMBER = 5;
        public static final int CHALLENGE_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions> PARSER = null;
        public static final int PASSKEY_USER_ID_FIELD_NUMBER = 2;
        public static final int RESIDENT_KEY_FIELD_NUMBER = 6;
        public static final int TIMEOUT_FIELD_NUMBER = 7;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private int timeout_;
        private java.lang.String challenge_ = "";
        private java.lang.String passkeyUserId_ = "";
        private java.lang.String username_ = "";
        private java.lang.String attestation_ = "";
        private java.lang.String authenticatorAttachment_ = "";
        private java.lang.String residentKey_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions, com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.CreateOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions createOptions = new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions();
            DEFAULT_INSTANCE = createOptions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.class, createOptions);
        }

        private CreateOptions() {
        }

        private void clearAttestation() {
            this.attestation_ = getDefaultInstance().getAttestation();
        }

        private void clearAuthenticatorAttachment() {
            this.authenticatorAttachment_ = getDefaultInstance().getAuthenticatorAttachment();
        }

        private void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        private void clearPasskeyUserId() {
            this.passkeyUserId_ = getDefaultInstance().getPasskeyUserId();
        }

        private void clearResidentKey() {
            this.residentKey_ = getDefaultInstance().getResidentKey();
        }

        private void clearTimeout() {
            this.timeout_ = 0;
        }

        private void clearUsername() {
            this.username_ = getDefaultInstance().getUsername();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.CreateOptions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAttestationBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.attestation_ = byteString.toStringUtf8();
        }

        private void setAuthenticatorAttachmentBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.authenticatorAttachment_ = byteString.toStringUtf8();
        }

        private void setChallengeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.challenge_ = byteString.toStringUtf8();
        }

        private void setPasskeyUserIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.passkeyUserId_ = byteString.toStringUtf8();
        }

        private void setResidentKeyBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.residentKey_ = byteString.toStringUtf8();
        }

        private void setTimeout(int i) {
            this.timeout_ = i;
        }

        private void setUsernameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.username_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.webauthn.a.f6388a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions();
                case 2:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.CreateOptions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0004", new java.lang.Object[]{"challenge_", "passkeyUserId_", "username_", "attestation_", "authenticatorAttachment_", "residentKey_", "timeout_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.class) {
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

        public final java.lang.String getAttestation() {
            return this.attestation_;
        }

        public final com.google.protobuf.ByteString getAttestationBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.attestation_);
        }

        public final java.lang.String getAuthenticatorAttachment() {
            return this.authenticatorAttachment_;
        }

        public final com.google.protobuf.ByteString getAuthenticatorAttachmentBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.authenticatorAttachment_);
        }

        public final java.lang.String getChallenge() {
            return this.challenge_;
        }

        public final com.google.protobuf.ByteString getChallengeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.challenge_);
        }

        public final java.lang.String getPasskeyUserId() {
            return this.passkeyUserId_;
        }

        public final com.google.protobuf.ByteString getPasskeyUserIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.passkeyUserId_);
        }

        public final java.lang.String getResidentKey() {
            return this.residentKey_;
        }

        public final com.google.protobuf.ByteString getResidentKeyBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.residentKey_);
        }

        public final int getTimeout() {
            return this.timeout_;
        }

        public final java.lang.String getUsername() {
            return this.username_;
        }

        public final com.google.protobuf.ByteString getUsernameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.username_);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.CreateOptions.a newBuilder(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions createOptions) {
            return DEFAULT_INSTANCE.createBuilder(createOptions);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAttestation(java.lang.String str) {
            this.attestation_ = str;
        }

        private void setAuthenticatorAttachment(java.lang.String str) {
            this.authenticatorAttachment_ = str;
        }

        private void setChallenge(java.lang.String str) {
            this.challenge_ = str;
        }

        private void setPasskeyUserId(java.lang.String str) {
            this.passkeyUserId_ = str;
        }

        private void setResidentKey(java.lang.String str) {
            this.residentKey_ = str;
        }

        private void setUsername(java.lang.String str) {
            this.username_ = str;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions, com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        CREATE_OPTIONS(1),
        AUTHENTICATE_OPTIONS(2),
        OPTIONS_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6387a;

        b(int i) {
            this.f6387a = i;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.b forNumber(int i) {
            if (i == 0) {
                return OPTIONS_NOT_SET;
            }
            if (i == 1) {
                return CREATE_OPTIONS;
            }
            if (i != 2) {
                return null;
            }
            return AUTHENTICATE_OPTIONS;
        }

        public final int getNumber() {
            return this.f6387a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions webauthn$WebAuthnOptions = new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions();
        DEFAULT_INSTANCE = webauthn$WebAuthnOptions;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.class, webauthn$WebAuthnOptions);
    }

    private Webauthn$WebAuthnOptions() {
    }

    private void clearAuthenticateOptions() {
        if (this.optionsCase_ == 2) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    private void clearCreateOptions() {
        if (this.optionsCase_ == 1) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    private void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.webauthn.a.f6388a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions();
            case 2:
                return new com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"options_", "optionsCase_", com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.class, com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.class) {
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

    public final com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions getAuthenticateOptions() {
        return this.optionsCase_ == 2 ? (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) this.options_ : com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions getCreateOptions() {
        return this.optionsCase_ == 1 ? (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) this.options_ : com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.b getOptionsCase() {
        return com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.b.forNumber(this.optionsCase_);
    }

    public final boolean hasAuthenticateOptions() {
        return this.optionsCase_ == 2;
    }

    public final boolean hasCreateOptions() {
        return this.optionsCase_ == 1;
    }

    private void mergeAuthenticateOptions(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions authenticateOptions) {
        if (this.optionsCase_ != 2 || this.options_ == com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.getDefaultInstance()) {
            this.options_ = authenticateOptions;
        } else {
            this.options_ = com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions.newBuilder((com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions) this.options_).mergeFrom((com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.AuthenticateOptions.a) authenticateOptions).buildPartial();
        }
        this.optionsCase_ = 2;
    }

    private void mergeCreateOptions(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions createOptions) {
        if (this.optionsCase_ != 1 || this.options_ == com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.getDefaultInstance()) {
            this.options_ = createOptions;
        } else {
            this.options_ = com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions.newBuilder((com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions) this.options_).mergeFrom((com.plaid.internal.core.protos.webauthn.Webauthn.WebAuthnOptions.CreateOptions.a) createOptions).buildPartial();
        }
        this.optionsCase_ = 1;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.a newBuilder(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions webauthn$WebAuthnOptions) {
        return DEFAULT_INSTANCE.createBuilder(webauthn$WebAuthnOptions);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAuthenticateOptions(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.AuthenticateOptions authenticateOptions) {
        this.options_ = authenticateOptions;
        this.optionsCase_ = 2;
    }

    private void setCreateOptions(com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions.CreateOptions createOptions) {
        this.options_ = createOptions;
        this.optionsCase_ = 1;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
