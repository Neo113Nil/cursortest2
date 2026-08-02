package com.plaid.internal.core.protos.webauthn;

/* loaded from: classes16.dex */
public final class Webauthn$PublicKeyCredential extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential, com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ASSERTION_RESPONSE_FIELD_NUMBER = 4;
    public static final int ATTESTATION_RESPONSE_FIELD_NUMBER = 3;
    public static final int AUTHENTICATOR_ATTACHMENT_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential> PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 2;
    public static final int TRANSPORTS_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 5;
    private java.lang.Object response_;
    private int responseCase_ = 0;
    private java.lang.String id_ = "";
    private com.google.protobuf.ByteString rawId_ = com.google.protobuf.ByteString.EMPTY;
    private java.lang.String type_ = "";
    private java.lang.String authenticatorAttachment_ = "";
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> transports_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class AuthenticatorAssertionResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse, com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAssertionResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int AUTHENTICATOR_DATA_FIELD_NUMBER = 1;
        public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 3;
        public static final int USER_HANDLE_FIELD_NUMBER = 4;
        private com.google.protobuf.ByteString authenticatorData_;
        private com.google.protobuf.ByteString clientDataJson_;
        private com.google.protobuf.ByteString signature_;
        private com.google.protobuf.ByteString userHandle_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse, com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAssertionResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse authenticatorAssertionResponse = new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse();
            DEFAULT_INSTANCE = authenticatorAssertionResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.class, authenticatorAssertionResponse);
        }

        private AuthenticatorAssertionResponse() {
            com.google.protobuf.ByteString byteString = com.google.protobuf.ByteString.EMPTY;
            this.authenticatorData_ = byteString;
            this.clientDataJson_ = byteString;
            this.signature_ = byteString;
            this.userHandle_ = byteString;
        }

        private void clearAuthenticatorData() {
            this.authenticatorData_ = getDefaultInstance().getAuthenticatorData();
        }

        private void clearClientDataJson() {
            this.clientDataJson_ = getDefaultInstance().getClientDataJson();
        }

        private void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        private void clearUserHandle() {
            this.userHandle_ = getDefaultInstance().getUserHandle();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAssertionResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.webauthn.a.f6388a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse();
                case 2:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAssertionResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n", new java.lang.Object[]{"authenticatorData_", "clientDataJson_", "signature_", "userHandle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.class) {
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

        public final com.google.protobuf.ByteString getAuthenticatorData() {
            return this.authenticatorData_;
        }

        public final com.google.protobuf.ByteString getClientDataJson() {
            return this.clientDataJson_;
        }

        public final com.google.protobuf.ByteString getSignature() {
            return this.signature_;
        }

        public final com.google.protobuf.ByteString getUserHandle() {
            return this.userHandle_;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAssertionResponse.a newBuilder(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse authenticatorAssertionResponse) {
            return DEFAULT_INSTANCE.createBuilder(authenticatorAssertionResponse);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAuthenticatorData(com.google.protobuf.ByteString byteString) {
            this.authenticatorData_ = byteString;
        }

        private void setClientDataJson(com.google.protobuf.ByteString byteString) {
            this.clientDataJson_ = byteString;
        }

        private void setSignature(com.google.protobuf.ByteString byteString) {
            this.signature_ = byteString;
        }

        private void setUserHandle(com.google.protobuf.ByteString byteString) {
            this.userHandle_ = byteString;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AuthenticatorAttestationResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse, com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAttestationResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ATTESTATION_OBJECT_FIELD_NUMBER = 1;
        public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse> PARSER;
        private com.google.protobuf.ByteString attestationObject_;
        private com.google.protobuf.ByteString clientDataJson_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse, com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAttestationResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse authenticatorAttestationResponse = new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse();
            DEFAULT_INSTANCE = authenticatorAttestationResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.class, authenticatorAttestationResponse);
        }

        private AuthenticatorAttestationResponse() {
            com.google.protobuf.ByteString byteString = com.google.protobuf.ByteString.EMPTY;
            this.attestationObject_ = byteString;
            this.clientDataJson_ = byteString;
        }

        private void clearAttestationObject() {
            this.attestationObject_ = getDefaultInstance().getAttestationObject();
        }

        private void clearClientDataJson() {
            this.clientDataJson_ = getDefaultInstance().getClientDataJson();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAttestationResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.webauthn.a.f6388a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse();
                case 2:
                    return new com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAttestationResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new java.lang.Object[]{"attestationObject_", "clientDataJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.class) {
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

        public final com.google.protobuf.ByteString getAttestationObject() {
            return this.attestationObject_;
        }

        public final com.google.protobuf.ByteString getClientDataJson() {
            return this.clientDataJson_;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAttestationResponse.a newBuilder(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse authenticatorAttestationResponse) {
            return DEFAULT_INSTANCE.createBuilder(authenticatorAttestationResponse);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAttestationObject(com.google.protobuf.ByteString byteString) {
            this.attestationObject_ = byteString;
        }

        private void setClientDataJson(com.google.protobuf.ByteString byteString) {
            this.clientDataJson_ = byteString;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential, com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        ATTESTATION_RESPONSE(3),
        ASSERTION_RESPONSE(4),
        RESPONSE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6386a;

        b(int i) {
            this.f6386a = i;
        }

        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.b forNumber(int i) {
            if (i == 0) {
                return RESPONSE_NOT_SET;
            }
            if (i == 3) {
                return ATTESTATION_RESPONSE;
            }
            if (i != 4) {
                return null;
            }
            return ASSERTION_RESPONSE;
        }

        public final int getNumber() {
            return this.f6386a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential webauthn$PublicKeyCredential = new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential();
        DEFAULT_INSTANCE = webauthn$PublicKeyCredential;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.class, webauthn$PublicKeyCredential);
    }

    private Webauthn$PublicKeyCredential() {
    }

    private void addAllTransports(java.lang.Iterable<java.lang.String> iterable) {
        ensureTransportsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.transports_);
    }

    private void addTransportsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureTransportsIsMutable();
        this.transports_.add(byteString.toStringUtf8());
    }

    private void clearAssertionResponse() {
        if (this.responseCase_ == 4) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearAttestationResponse() {
        if (this.responseCase_ == 3) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearAuthenticatorAttachment() {
        this.authenticatorAttachment_ = getDefaultInstance().getAuthenticatorAttachment();
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearRawId() {
        this.rawId_ = getDefaultInstance().getRawId();
    }

    private void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    private void clearTransports() {
        this.transports_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureTransportsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.transports_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.transports_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAuthenticatorAttachmentBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.authenticatorAttachment_ = byteString.toStringUtf8();
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setTypeBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.webauthn.a.f6388a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential();
            case 2:
                return new com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003<\u0000\u0004<\u0000\u0005Ȉ\u0006Ȉ\u0007Ț", new java.lang.Object[]{"response_", "responseCase_", "id_", "rawId_", com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.class, com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.class, "type_", "authenticatorAttachment_", "transports_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.class) {
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

    public final com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse getAssertionResponse() {
        return this.responseCase_ == 4 ? (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) this.response_ : com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse getAttestationResponse() {
        return this.responseCase_ == 3 ? (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) this.response_ : com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.getDefaultInstance();
    }

    public final java.lang.String getAuthenticatorAttachment() {
        return this.authenticatorAttachment_;
    }

    public final com.google.protobuf.ByteString getAuthenticatorAttachmentBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.authenticatorAttachment_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.google.protobuf.ByteString getRawId() {
        return this.rawId_;
    }

    public final com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.b getResponseCase() {
        return com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.b.forNumber(this.responseCase_);
    }

    public final java.lang.String getTransports(int i) {
        return this.transports_.get(i);
    }

    public final com.google.protobuf.ByteString getTransportsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.transports_.get(i));
    }

    public final int getTransportsCount() {
        return this.transports_.size();
    }

    public final java.util.List<java.lang.String> getTransportsList() {
        return this.transports_;
    }

    public final java.lang.String getType() {
        return this.type_;
    }

    public final com.google.protobuf.ByteString getTypeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.type_);
    }

    public final boolean hasAssertionResponse() {
        return this.responseCase_ == 4;
    }

    public final boolean hasAttestationResponse() {
        return this.responseCase_ == 3;
    }

    private void addTransports(java.lang.String str) {
        ensureTransportsIsMutable();
        this.transports_.add(str);
    }

    private void mergeAssertionResponse(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse authenticatorAssertionResponse) {
        if (this.responseCase_ != 4 || this.response_ == com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.getDefaultInstance()) {
            this.response_ = authenticatorAssertionResponse;
        } else {
            this.response_ = com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse.newBuilder((com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse) this.response_).mergeFrom((com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAssertionResponse.a) authenticatorAssertionResponse).buildPartial();
        }
        this.responseCase_ = 4;
    }

    private void mergeAttestationResponse(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse authenticatorAttestationResponse) {
        if (this.responseCase_ != 3 || this.response_ == com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.getDefaultInstance()) {
            this.response_ = authenticatorAttestationResponse;
        } else {
            this.response_ = com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse.newBuilder((com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse) this.response_).mergeFrom((com.plaid.internal.core.protos.webauthn.Webauthn.PublicKeyCredential.AuthenticatorAttestationResponse.a) authenticatorAttestationResponse).buildPartial();
        }
        this.responseCase_ = 3;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.a newBuilder(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential webauthn$PublicKeyCredential) {
        return DEFAULT_INSTANCE.createBuilder(webauthn$PublicKeyCredential);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAssertionResponse(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAssertionResponse authenticatorAssertionResponse) {
        this.response_ = authenticatorAssertionResponse;
        this.responseCase_ = 4;
    }

    private void setAttestationResponse(com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential.AuthenticatorAttestationResponse authenticatorAttestationResponse) {
        this.response_ = authenticatorAttestationResponse;
        this.responseCase_ = 3;
    }

    private void setTransports(int i, java.lang.String str) {
        ensureTransportsIsMutable();
        this.transports_.set(i, str);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setAuthenticatorAttachment(java.lang.String str) {
        this.authenticatorAttachment_ = str;
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setRawId(com.google.protobuf.ByteString byteString) {
        this.rawId_ = byteString;
    }

    private void setType(java.lang.String str) {
        this.type_ = str;
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
