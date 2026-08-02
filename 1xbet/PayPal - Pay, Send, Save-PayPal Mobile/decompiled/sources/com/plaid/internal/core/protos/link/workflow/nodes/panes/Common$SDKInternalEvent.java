package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SDKInternalEvent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent DEFAULT_INSTANCE;
    public static final int HIDE_SDK_MODAL_FIELD_NUMBER = 6;
    public static final int OPEN_IOS_SDK_OAUTH_POPUP_FIELD_NUMBER = 8;
    public static final int OPEN_URL_FIELD_NUMBER = 4;
    public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent> PARSER = null;
    public static final int REQUEST_SILENT_NETWORK_AUTH_FIELD_NUMBER = 7;
    public static final int SHOW_SDK_MODAL_FIELD_NUMBER = 5;
    public static final int START_LINK_FIELD_NUMBER = 2;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
    private java.lang.Object eventType_;
    private int eventTypeCase_ = 0;
    private java.lang.String webviewRedirectUri_ = "";

    public static final class OpenIosSdkOAuthPopup extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.OpenIosSdkOAuthPopup.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup DEFAULT_INSTANCE;
        public static final int IOS_SDK_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
        public static final int LOGIN_URI_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup> PARSER;
        private int iosSdkPopupBehavior_;
        private java.lang.String loginUri_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.OpenIosSdkOAuthPopup.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup openIosSdkOAuthPopup = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup();
            DEFAULT_INSTANCE = openIosSdkOAuthPopup;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.class, openIosSdkOAuthPopup);
        }

        private OpenIosSdkOAuthPopup() {
        }

        private void clearIosSdkPopupBehavior() {
            this.iosSdkPopupBehavior_ = 0;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.OpenIosSdkOAuthPopup.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIosSdkPopupBehavior(com.plaid.internal.core.protos.link.workflow.primitives.n nVar) {
            this.iosSdkPopupBehavior_ = nVar.getNumber();
        }

        private void setIosSdkPopupBehaviorValue(int i) {
            this.iosSdkPopupBehavior_ = i;
        }

        private void setLoginUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.OpenIosSdkOAuthPopup.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new java.lang.Object[]{"iosSdkPopupBehavior_", "loginUri_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.n getIosSdkPopupBehavior() {
            com.plaid.internal.core.protos.link.workflow.primitives.n forNumber = com.plaid.internal.core.protos.link.workflow.primitives.n.forNumber(this.iosSdkPopupBehavior_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.n.UNRECOGNIZED : forNumber;
        }

        public final int getIosSdkPopupBehaviorValue() {
            return this.iosSdkPopupBehavior_;
        }

        public final java.lang.String getLoginUri() {
            return this.loginUri_;
        }

        public final com.google.protobuf.ByteString getLoginUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.loginUri_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.OpenIosSdkOAuthPopup.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup openIosSdkOAuthPopup) {
            return DEFAULT_INSTANCE.createBuilder(openIosSdkOAuthPopup);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setLoginUri(java.lang.String str) {
            this.loginUri_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RequestSilentNetworkAuth extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth> PARSER = null;
        public static final int PROVE_FIELD_NUMBER = 3;
        public static final int TWILIO_FIELD_NUMBER = 2;
        public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
        private java.lang.Object vendorSpecificFields_;
        private int vendorSpecificFieldsCase_ = 0;
        private java.lang.String verificationId_ = "";

        public static final class Prove extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove prove = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove();
                DEFAULT_INSTANCE = prove;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.class, prove);
            }

            private Prove() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.class) {
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove prove) {
                return DEFAULT_INSTANCE.createBuilder(prove);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Twilio extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio> PARSER = null;
            public static final int REDIRECT_URI_FIELD_NUMBER = 1;
            private java.lang.String redirectUri_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio twilio = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio();
                DEFAULT_INSTANCE = twilio;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.class, twilio);
            }

            private Twilio() {
            }

            private void clearRedirectUri() {
                this.redirectUri_ = getDefaultInstance().getRedirectUri();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRedirectUriBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.redirectUri_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"redirectUri_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.class) {
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

            public final java.lang.String getRedirectUri() {
                return this.redirectUri_;
            }

            public final com.google.protobuf.ByteString getRedirectUriBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.redirectUri_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio twilio) {
                return DEFAULT_INSTANCE.createBuilder(twilio);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setRedirectUri(java.lang.String str) {
                this.redirectUri_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            TWILIO(2),
            PROVE(3),
            VENDORSPECIFICFIELDS_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6152a;

            b(int i) {
                this.f6152a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.b forNumber(int i) {
                if (i == 0) {
                    return VENDORSPECIFICFIELDS_NOT_SET;
                }
                if (i == 2) {
                    return TWILIO;
                }
                if (i != 3) {
                    return null;
                }
                return PROVE;
            }

            public final int getNumber() {
                return this.f6152a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth();
            DEFAULT_INSTANCE = requestSilentNetworkAuth;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.class, requestSilentNetworkAuth);
        }

        private RequestSilentNetworkAuth() {
        }

        private void clearProve() {
            if (this.vendorSpecificFieldsCase_ == 3) {
                this.vendorSpecificFieldsCase_ = 0;
                this.vendorSpecificFields_ = null;
            }
        }

        private void clearTwilio() {
            if (this.vendorSpecificFieldsCase_ == 2) {
                this.vendorSpecificFieldsCase_ = 0;
                this.vendorSpecificFields_ = null;
            }
        }

        private void clearVendorSpecificFields() {
            this.vendorSpecificFieldsCase_ = 0;
            this.vendorSpecificFields_ = null;
        }

        private void clearVerificationId() {
            this.verificationId_ = getDefaultInstance().getVerificationId();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setVerificationIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.verificationId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"vendorSpecificFields_", "vendorSpecificFieldsCase_", "verificationId_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove getProve() {
            return this.vendorSpecificFieldsCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) this.vendorSpecificFields_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio getTwilio() {
            return this.vendorSpecificFieldsCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) this.vendorSpecificFields_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.b getVendorSpecificFieldsCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.b.forNumber(this.vendorSpecificFieldsCase_);
        }

        public final java.lang.String getVerificationId() {
            return this.verificationId_;
        }

        public final com.google.protobuf.ByteString getVerificationIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.verificationId_);
        }

        public final boolean hasProve() {
            return this.vendorSpecificFieldsCase_ == 3;
        }

        public final boolean hasTwilio() {
            return this.vendorSpecificFieldsCase_ == 2;
        }

        private void mergeProve(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove prove) {
            if (this.vendorSpecificFieldsCase_ != 3 || this.vendorSpecificFields_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.getDefaultInstance()) {
                this.vendorSpecificFields_ = prove;
            } else {
                this.vendorSpecificFields_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove) this.vendorSpecificFields_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove.a) prove).buildPartial();
            }
            this.vendorSpecificFieldsCase_ = 3;
        }

        private void mergeTwilio(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio twilio) {
            if (this.vendorSpecificFieldsCase_ != 2 || this.vendorSpecificFields_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.getDefaultInstance()) {
                this.vendorSpecificFields_ = twilio;
            } else {
                this.vendorSpecificFields_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio) this.vendorSpecificFields_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio.a) twilio).buildPartial();
            }
            this.vendorSpecificFieldsCase_ = 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
            return DEFAULT_INSTANCE.createBuilder(requestSilentNetworkAuth);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setProve(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Prove prove) {
            this.vendorSpecificFields_ = prove;
            this.vendorSpecificFieldsCase_ = 3;
        }

        private void setTwilio(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.Twilio twilio) {
            this.vendorSpecificFields_ = twilio;
            this.vendorSpecificFieldsCase_ = 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setVerificationId(java.lang.String str) {
            this.verificationId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDKModal extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ACCORDION_FIELD_NUMBER = 5;
        public static final int COBRANDED_LOGO_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 4;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal> PARSER = null;
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 3;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion accordion_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString content_;
        private int headerImageCase_ = 0;
        private java.lang.Object headerImage_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent primaryButton_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            IMAGE(1),
            COBRANDED_LOGO(2),
            HEADERIMAGE_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6153a;

            b(int i) {
                this.f6153a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.b forNumber(int i) {
                if (i == 0) {
                    return HEADERIMAGE_NOT_SET;
                }
                if (i == 1) {
                    return IMAGE;
                }
                if (i != 2) {
                    return null;
                }
                return COBRANDED_LOGO;
            }

            public final int getNumber() {
                return this.f6153a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal sDKModal = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal();
            DEFAULT_INSTANCE = sDKModal;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.class, sDKModal);
        }

        private SDKModal() {
        }

        private void clearAccordion() {
            this.accordion_ = null;
            this.bitField0_ &= -5;
        }

        private void clearCobrandedLogo() {
            if (this.headerImageCase_ == 2) {
                this.headerImageCase_ = 0;
                this.headerImage_ = null;
            }
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHeaderImage() {
            this.headerImageCase_ = 0;
            this.headerImage_ = null;
        }

        private void clearImage() {
            if (this.headerImageCase_ == 1) {
                this.headerImageCase_ = 0;
                this.headerImage_ = null;
            }
        }

        private void clearPrimaryButton() {
            this.primaryButton_ = null;
            this.bitField0_ &= -9;
        }

        private void clearTitle() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new java.lang.Object[]{"headerImage_", "headerImageCase_", "bitField0_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.class, "title_", "content_", "accordion_", "primaryButton_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion getAccordion() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion common$Accordion = this.accordion_;
            return common$Accordion == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.getDefaultInstance() : common$Accordion;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getCobrandedLogo() {
            return this.headerImageCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.headerImage_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.content_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.b getHeaderImageCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.b.forNumber(this.headerImageCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getImage() {
            return this.headerImageCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.headerImage_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getPrimaryButton() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.primaryButton_;
            return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final boolean hasAccordion() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasCobrandedLogo() {
            return this.headerImageCase_ == 2;
        }

        public final boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasImage() {
            return this.headerImageCase_ == 1;
        }

        public final boolean hasPrimaryButton() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion common$Accordion) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion common$Accordion2 = this.accordion_;
            if (common$Accordion2 == null || common$Accordion2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.getDefaultInstance()) {
                this.accordion_ = common$Accordion;
            } else {
                this.accordion_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.newBuilder(this.accordion_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.a) common$Accordion).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeCobrandedLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            if (this.headerImageCase_ != 2 || this.headerImage_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance()) {
                this.headerImage_ = common$CobrandedHeaderAsset;
            } else {
                this.headerImage_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.headerImage_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a) common$CobrandedHeaderAsset).buildPartial();
            }
            this.headerImageCase_ = 2;
        }

        private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.content_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.content_ = common$LocalizedString;
            } else {
                this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            if (this.headerImageCase_ != 1 || this.headerImage_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerImage_ = common$RenderedAssetAppearance;
            } else {
                this.headerImage_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.headerImage_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.headerImageCase_ = 1;
        }

        private void mergePrimaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.primaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
                this.primaryButton_ = common$ButtonContent;
            } else {
                this.primaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.primaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.title_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.title_ = common$LocalizedString;
            } else {
                this.title_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal sDKModal) {
            return DEFAULT_INSTANCE.createBuilder(sDKModal);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion common$Accordion) {
            this.accordion_ = common$Accordion;
            this.bitField0_ |= 4;
        }

        private void setCobrandedLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            this.headerImage_ = common$CobrandedHeaderAsset;
            this.headerImageCase_ = 2;
        }

        private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.content_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        private void setImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.headerImage_ = common$RenderedAssetAppearance;
            this.headerImageCase_ = 1;
        }

        private void setPrimaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
            this.primaryButton_ = common$ButtonContent;
            this.bitField0_ |= 8;
        }

        private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.title_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartLink extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.StartLink.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink DEFAULT_INSTANCE;
        public static final int LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink> PARSER;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration linkTokenConfiguration_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.StartLink.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink startLink = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink();
            DEFAULT_INSTANCE = startLink;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.class, startLink);
        }

        private StartLink() {
        }

        private void clearLinkTokenConfiguration() {
            this.linkTokenConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.StartLink.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.StartLink.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "linkTokenConfiguration_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration getLinkTokenConfiguration() {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration = this.linkTokenConfiguration_;
            return configuration$LinkTokenConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.getDefaultInstance() : configuration$LinkTokenConfiguration;
        }

        public final boolean hasLinkTokenConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration2 = this.linkTokenConfiguration_;
            if (configuration$LinkTokenConfiguration2 == null || configuration$LinkTokenConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.getDefaultInstance()) {
                this.linkTokenConfiguration_ = configuration$LinkTokenConfiguration;
            } else {
                this.linkTokenConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.newBuilder(this.linkTokenConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a) configuration$LinkTokenConfiguration).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.StartLink.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink startLink) {
            return DEFAULT_INSTANCE.createBuilder(startLink);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
            this.linkTokenConfiguration_ = configuration$LinkTokenConfiguration;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        OUT_OF_PROCESS_IOS_POPUP(1),
        START_LINK(2),
        OPEN_URL(4),
        SHOW_SDK_MODAL(5),
        HIDE_SDK_MODAL(6),
        REQUEST_SILENT_NETWORK_AUTH(7),
        OPEN_IOS_SDK_OAUTH_POPUP(8),
        EVENTTYPE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6154a;

        b(int i) {
            this.f6154a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.b forNumber(int i) {
            switch (i) {
                case 0:
                    return EVENTTYPE_NOT_SET;
                case 1:
                    return OUT_OF_PROCESS_IOS_POPUP;
                case 2:
                    return START_LINK;
                case 3:
                default:
                    return null;
                case 4:
                    return OPEN_URL;
                case 5:
                    return SHOW_SDK_MODAL;
                case 6:
                    return HIDE_SDK_MODAL;
                case 7:
                    return REQUEST_SILENT_NETWORK_AUTH;
                case 8:
                    return OPEN_IOS_SDK_OAUTH_POPUP;
            }
        }

        public final int getNumber() {
            return this.f6154a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent common$SDKInternalEvent = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent();
        DEFAULT_INSTANCE = common$SDKInternalEvent;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.class, common$SDKInternalEvent);
    }

    private Common$SDKInternalEvent() {
    }

    private void clearEventType() {
        this.eventTypeCase_ = 0;
        this.eventType_ = null;
    }

    private void clearHideSdkModal() {
        if (this.eventTypeCase_ == 6) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearOpenIosSdkOauthPopup() {
        if (this.eventTypeCase_ == 8) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearOpenUrl() {
        if (this.eventTypeCase_ == 4) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearOutOfProcessIosPopup() {
        if (this.eventTypeCase_ == 1) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearRequestSilentNetworkAuth() {
        if (this.eventTypeCase_ == 7) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearShowSdkModal() {
        if (this.eventTypeCase_ == 5) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearStartLink() {
        if (this.eventTypeCase_ == 2) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHideSdkModal(boolean z) {
        this.eventTypeCase_ = 6;
        this.eventType_ = java.lang.Boolean.valueOf(z);
    }

    private void setOpenUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.eventType_ = byteString.toStringUtf8();
        this.eventTypeCase_ = 4;
    }

    private void setWebviewRedirectUriBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȼ\u0000\u0005<\u0000\u0006:\u0000\u0007<\u0000\b<\u0000", new java.lang.Object[]{"eventType_", "eventTypeCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.class, "webviewRedirectUri_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.b getEventTypeCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.b.forNumber(this.eventTypeCase_);
    }

    public final boolean getHideSdkModal() {
        if (this.eventTypeCase_ == 6) {
            return ((java.lang.Boolean) this.eventType_).booleanValue();
        }
        return false;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup getOpenIosSdkOauthPopup() {
        return this.eventTypeCase_ == 8 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) this.eventType_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup getOutOfProcessIosPopup() {
        return this.eventTypeCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) this.eventType_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth getRequestSilentNetworkAuth() {
        return this.eventTypeCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) this.eventType_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal getShowSdkModal() {
        return this.eventTypeCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) this.eventType_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink getStartLink() {
        return this.eventTypeCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) this.eventType_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.getDefaultInstance();
    }

    public final java.lang.String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public final com.google.protobuf.ByteString getWebviewRedirectUriBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public final boolean hasHideSdkModal() {
        return this.eventTypeCase_ == 6;
    }

    public final boolean hasOpenIosSdkOauthPopup() {
        return this.eventTypeCase_ == 8;
    }

    public final boolean hasOpenUrl() {
        return this.eventTypeCase_ == 4;
    }

    public final boolean hasOutOfProcessIosPopup() {
        return this.eventTypeCase_ == 1;
    }

    public final boolean hasRequestSilentNetworkAuth() {
        return this.eventTypeCase_ == 7;
    }

    public final boolean hasShowSdkModal() {
        return this.eventTypeCase_ == 5;
    }

    public final boolean hasStartLink() {
        return this.eventTypeCase_ == 2;
    }

    private void mergeOpenIosSdkOauthPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup openIosSdkOAuthPopup) {
        if (this.eventTypeCase_ != 8 || this.eventType_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.getDefaultInstance()) {
            this.eventType_ = openIosSdkOAuthPopup;
        } else {
            this.eventType_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup) this.eventType_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.OpenIosSdkOAuthPopup.a) openIosSdkOAuthPopup).buildPartial();
        }
        this.eventTypeCase_ = 8;
    }

    private void mergeOutOfProcessIosPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
        if (this.eventTypeCase_ != 1 || this.eventType_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.getDefaultInstance()) {
            this.eventType_ = outOfProcessIOSPopup;
        } else {
            this.eventType_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) this.eventType_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a) outOfProcessIOSPopup).buildPartial();
        }
        this.eventTypeCase_ = 1;
    }

    private void mergeRequestSilentNetworkAuth(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        if (this.eventTypeCase_ != 7 || this.eventType_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.getDefaultInstance()) {
            this.eventType_ = requestSilentNetworkAuth;
        } else {
            this.eventType_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth) this.eventType_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.RequestSilentNetworkAuth.a) requestSilentNetworkAuth).buildPartial();
        }
        this.eventTypeCase_ = 7;
    }

    private void mergeShowSdkModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal sDKModal) {
        if (this.eventTypeCase_ != 5 || this.eventType_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.getDefaultInstance()) {
            this.eventType_ = sDKModal;
        } else {
            this.eventType_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal) this.eventType_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.SDKModal.a) sDKModal).buildPartial();
        }
        this.eventTypeCase_ = 5;
    }

    private void mergeStartLink(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink startLink) {
        if (this.eventTypeCase_ != 2 || this.eventType_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.getDefaultInstance()) {
            this.eventType_ = startLink;
        } else {
            this.eventType_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink) this.eventType_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKInternalEvent.StartLink.a) startLink).buildPartial();
        }
        this.eventTypeCase_ = 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent common$SDKInternalEvent) {
        return DEFAULT_INSTANCE.createBuilder(common$SDKInternalEvent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setOpenIosSdkOauthPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.OpenIosSdkOAuthPopup openIosSdkOAuthPopup) {
        this.eventType_ = openIosSdkOAuthPopup;
        this.eventTypeCase_ = 8;
    }

    private void setOpenUrl(java.lang.String str) {
        this.eventTypeCase_ = 4;
        this.eventType_ = str;
    }

    private void setOutOfProcessIosPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
        this.eventType_ = outOfProcessIOSPopup;
        this.eventTypeCase_ = 1;
    }

    private void setRequestSilentNetworkAuth(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        this.eventType_ = requestSilentNetworkAuth;
        this.eventTypeCase_ = 7;
    }

    private void setShowSdkModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.SDKModal sDKModal) {
        this.eventType_ = sDKModal;
        this.eventTypeCase_ = 5;
    }

    private void setStartLink(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.StartLink startLink) {
        this.eventType_ = startLink;
        this.eventTypeCase_ = 2;
    }

    public final java.lang.String getOpenUrl() {
        return this.eventTypeCase_ == 4 ? (java.lang.String) this.eventType_ : "";
    }

    public final com.google.protobuf.ByteString getOpenUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.eventTypeCase_ == 4 ? (java.lang.String) this.eventType_ : "");
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setWebviewRedirectUri(java.lang.String str) {
        this.webviewRedirectUri_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
