package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Mobile$MobileSDKPloggerLog extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog, com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog DEFAULT_INSTANCE;
    public static final int LOG_LEVEL_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int MOBILE_SDK_SESSION_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog> PARSER;
    private int bitField0_;
    private int logLevel_;
    private com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSdkSession_;
    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> params_ = com.google.protobuf.MapFieldLite.emptyMapField();
    private java.lang.String message_ = "";

    public static final class MobileSDKSession extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession, com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CLIENT_TYPE_FIELD_NUMBER = 5;
        private static final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession DEFAULT_INSTANCE;
        public static final int LINK_OPEN_ID_FIELD_NUMBER = 1;
        public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 2;
        public static final int LINK_TOKEN_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession> PARSER;
        private int clientType_;
        private java.lang.String linkOpenId_ = "";
        private java.lang.String linkSessionId_ = "";
        private java.lang.String linkPersistentId_ = "";
        private java.lang.String linkToken_ = "";

        public enum b implements com.google.protobuf.Internal.EnumLite {
            CLIENT_TYPE_UNKNOWN(0),
            CLIENT_TYPE_ANDROID(1),
            CLIENT_TYPE_IOS(2),
            CLIENT_TYPE_WEB(3),
            CLIENT_TYPE_REACTNATIVEANDROID(4),
            CLIENT_TYPE_REACTNATIVEIOS(5),
            CLIENT_TYPE_LINK_WEB_SDK(6),
            CLIENT_TYPE_FLUTTERIOS(7),
            CLIENT_TYPE_FLUTTERANDROID(8),
            CLIENT_TYPE_HOSTED_LINK(9),
            UNRECOGNIZED(-1);

            public static final int CLIENT_TYPE_ANDROID_VALUE = 1;
            public static final int CLIENT_TYPE_FLUTTERANDROID_VALUE = 8;
            public static final int CLIENT_TYPE_FLUTTERIOS_VALUE = 7;
            public static final int CLIENT_TYPE_HOSTED_LINK_VALUE = 9;
            public static final int CLIENT_TYPE_IOS_VALUE = 2;
            public static final int CLIENT_TYPE_LINK_WEB_SDK_VALUE = 6;
            public static final int CLIENT_TYPE_REACTNATIVEANDROID_VALUE = 4;
            public static final int CLIENT_TYPE_REACTNATIVEIOS_VALUE = 5;
            public static final int CLIENT_TYPE_UNKNOWN_VALUE = 0;
            public static final int CLIENT_TYPE_WEB_VALUE = 3;
            public static final com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.a b = new com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6056a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog$MobileSDKSession$b$b, reason: collision with other inner class name */
            public static final class C0166b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.C0166b f6057a = new com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.C0166b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f6056a = i;
            }

            public static com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b forNumber(int i) {
                switch (i) {
                    case 0:
                        return CLIENT_TYPE_UNKNOWN;
                    case 1:
                        return CLIENT_TYPE_ANDROID;
                    case 2:
                        return CLIENT_TYPE_IOS;
                    case 3:
                        return CLIENT_TYPE_WEB;
                    case 4:
                        return CLIENT_TYPE_REACTNATIVEANDROID;
                    case 5:
                        return CLIENT_TYPE_REACTNATIVEIOS;
                    case 6:
                        return CLIENT_TYPE_LINK_WEB_SDK;
                    case 7:
                        return CLIENT_TYPE_FLUTTERIOS;
                    case 8:
                        return CLIENT_TYPE_FLUTTERANDROID;
                    case 9:
                        return CLIENT_TYPE_HOSTED_LINK;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.C0166b.f6057a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6056a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession = new com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession();
            DEFAULT_INSTANCE = mobileSDKSession;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.class, mobileSDKSession);
        }

        private MobileSDKSession() {
        }

        private void clearClientType() {
            this.clientType_ = 0;
        }

        private void clearLinkOpenId() {
            this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
        }

        private void clearLinkPersistentId() {
            this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearLinkToken() {
            this.linkToken_ = getDefaultInstance().getLinkToken();
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientType(com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b bVar) {
            this.clientType_ = bVar.getNumber();
        }

        private void setClientTypeValue(int i) {
            this.clientType_ = i;
        }

        private void setLinkOpenIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkOpenId_ = byteString.toStringUtf8();
        }

        private void setLinkPersistentIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkPersistentId_ = byteString.toStringUtf8();
        }

        private void setLinkSessionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setLinkTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.d.f6082a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new java.lang.Object[]{"linkOpenId_", "linkSessionId_", "linkPersistentId_", "linkToken_", "clientType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.class) {
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

        public final com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b getClientType() {
            com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b forNumber = com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.forNumber(this.clientType_);
            return forNumber == null ? com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.UNRECOGNIZED : forNumber;
        }

        public final int getClientTypeValue() {
            return this.clientType_;
        }

        public final java.lang.String getLinkOpenId() {
            return this.linkOpenId_;
        }

        public final com.google.protobuf.ByteString getLinkOpenIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkOpenId_);
        }

        public final java.lang.String getLinkPersistentId() {
            return this.linkPersistentId_;
        }

        public final com.google.protobuf.ByteString getLinkPersistentIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkPersistentId_);
        }

        public final java.lang.String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public final com.google.protobuf.ByteString getLinkSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public final java.lang.String getLinkToken() {
            return this.linkToken_;
        }

        public final com.google.protobuf.ByteString getLinkTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkToken_);
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession, com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.DEFAULT_INSTANCE);
            }

            public final void a(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) this.instance).setLinkOpenId(str);
            }

            public final void b(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) this.instance).setLinkPersistentId(str);
            }

            public final void c(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) this.instance).setLinkSessionId(str);
            }

            public final void d(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) this.instance).setLinkToken(str);
            }

            public final void a(com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b bVar) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) this.instance).setClientType(bVar);
            }
        }

        public static com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a newBuilder(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession) {
            return DEFAULT_INSTANCE.createBuilder(mobileSDKSession);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkOpenId(java.lang.String str) {
            this.linkOpenId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkPersistentId(java.lang.String str) {
            this.linkPersistentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkSessionId(java.lang.String str) {
            this.linkSessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkToken(java.lang.String str) {
            this.linkToken_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        MOBILE_SDK_LOG_LEVEL_UNKNOWN(0),
        MOBILE_SDK_LOG_LEVEL_DEBUG(1),
        MOBILE_SDK_LOG_LEVEL_INFO(2),
        MOBILE_SDK_LOG_LEVEL_WARN(3),
        MOBILE_SDK_LOG_LEVEL_ERROR(4),
        UNRECOGNIZED(-1);

        public static final int MOBILE_SDK_LOG_LEVEL_DEBUG_VALUE = 1;
        public static final int MOBILE_SDK_LOG_LEVEL_ERROR_VALUE = 4;
        public static final int MOBILE_SDK_LOG_LEVEL_INFO_VALUE = 2;
        public static final int MOBILE_SDK_LOG_LEVEL_UNKNOWN_VALUE = 0;
        public static final int MOBILE_SDK_LOG_LEVEL_WARN_VALUE = 3;
        public static final com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.b.a b = new com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6058a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog$b$b, reason: collision with other inner class name */
        public static final class C0167b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.C0167b f6059a = new com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.C0167b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6058a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b forNumber(int i) {
            if (i == 0) {
                return MOBILE_SDK_LOG_LEVEL_UNKNOWN;
            }
            if (i == 1) {
                return MOBILE_SDK_LOG_LEVEL_DEBUG;
            }
            if (i == 2) {
                return MOBILE_SDK_LOG_LEVEL_INFO;
            }
            if (i == 3) {
                return MOBILE_SDK_LOG_LEVEL_WARN;
            }
            if (i != 4) {
                return null;
            }
            return MOBILE_SDK_LOG_LEVEL_ERROR;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.C0167b.f6059a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6058a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.String> f6060a;

        static {
            com.google.protobuf.WireFormat.FieldType fieldType = com.google.protobuf.WireFormat.FieldType.STRING;
            f6060a = com.google.protobuf.MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog mobile$MobileSDKPloggerLog = new com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog();
        DEFAULT_INSTANCE = mobile$MobileSDKPloggerLog;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.class, mobile$MobileSDKPloggerLog);
    }

    private Mobile$MobileSDKPloggerLog() {
    }

    private void clearLogLevel() {
        this.logLevel_ = 0;
    }

    private void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    private void clearMobileSdkSession() {
        this.mobileSdkSession_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> getMutableParamsMap() {
        return internalGetMutableParams();
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableParams() {
        if (!this.params_.isMutable()) {
            this.params_ = this.params_.mutableCopy();
        }
        return this.params_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetParams() {
        return this.params_;
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogLevel(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b bVar) {
        this.logLevel_ = bVar.getNumber();
    }

    private void setLogLevelValue(int i) {
        this.logLevel_ = i;
    }

    private void setMessageBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.d.f6082a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u00042", new java.lang.Object[]{"bitField0_", "logLevel_", "message_", "mobileSdkSession_", "params_", com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.c.f6060a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.class) {
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

    public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b getLogLevel() {
        com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b forNumber = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.forNumber(this.logLevel_);
        return forNumber == null ? com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.UNRECOGNIZED : forNumber;
    }

    public final int getLogLevelValue() {
        return this.logLevel_;
    }

    public final java.lang.String getMessage() {
        return this.message_;
    }

    public final com.google.protobuf.ByteString getMessageBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.message_);
    }

    public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession getMobileSdkSession() {
        com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession = this.mobileSdkSession_;
        return mobileSDKSession == null ? com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.getDefaultInstance() : mobileSDKSession;
    }

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return getParamsMap();
    }

    public final int getParamsCount() {
        return internalGetParams().size();
    }

    public final java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
        return java.util.Collections.unmodifiableMap(internalGetParams());
    }

    public final boolean hasMobileSdkSession() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog, com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a a(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b bVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) this.instance).setLogLevel(bVar);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) this.instance).setMessage(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a a(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) this.instance).setMobileSdkSession(mobileSDKSession);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a a(java.util.Map<java.lang.String, java.lang.String> map) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) this.instance).getMutableParamsMap().putAll(map);
            return this;
        }
    }

    private void mergeMobileSdkSession(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession) {
        com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession2 = this.mobileSdkSession_;
        if (mobileSDKSession2 == null || mobileSDKSession2 == com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.getDefaultInstance()) {
            this.mobileSdkSession_ = mobileSDKSession;
        } else {
            this.mobileSdkSession_ = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.newBuilder(this.mobileSdkSession_).mergeFrom((com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a) mobileSDKSession).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a newBuilder(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog mobile$MobileSDKPloggerLog) {
        return DEFAULT_INSTANCE.createBuilder(mobile$MobileSDKPloggerLog);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileSdkSession(com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession mobileSDKSession) {
        this.mobileSdkSession_ = mobileSDKSession;
        this.bitField0_ |= 1;
    }

    public final boolean containsParams(java.lang.String str) {
        return internalGetParams().containsKey(str);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(java.lang.String str) {
        this.message_ = str;
    }

    public final java.lang.String getParamsOrDefault(java.lang.String str, java.lang.String str2) {
        com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetParams = internalGetParams();
        return internalGetParams.containsKey(str) ? internalGetParams.get(str) : str2;
    }

    public final java.lang.String getParamsOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetParams = internalGetParams();
        if (internalGetParams.containsKey(str)) {
            return internalGetParams.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
