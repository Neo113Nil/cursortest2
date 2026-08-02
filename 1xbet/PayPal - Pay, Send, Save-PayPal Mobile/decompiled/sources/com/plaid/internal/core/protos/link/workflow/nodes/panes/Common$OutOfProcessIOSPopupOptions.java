package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$OutOfProcessIOSPopupOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions DEFAULT_INSTANCE;
    public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions> PARSER;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIosPopup_;

    public static final class OutOfProcessIOSPopup extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup DEFAULT_INSTANCE;
        public static final int LEGACY_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
        public static final int LOGIN_URI_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup> PARSER = null;
        public static final int POPUP_BEHAVIOR_FIELD_NUMBER = 3;
        private int legacyPopupBehavior_;
        private java.lang.String loginUri_ = "";
        private int popupBehavior_;

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
            return DEFAULT_INSTANCE.createBuilder(outOfProcessIOSPopup);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final int getPopupBehaviorValue() {
            return this.popupBehavior_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 getPopupBehavior() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.a0.forNumber(this.popupBehavior_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.a0.UNRECOGNIZED : forNumber;
        }

        public final com.google.protobuf.ByteString getLoginUriBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.loginUri_);
        }

        public final java.lang.String getLoginUri() {
            return this.loginUri_;
        }

        public final int getLegacyPopupBehaviorValue() {
            return this.legacyPopupBehavior_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b getLegacyPopupBehavior() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.forNumber(this.legacyPopupBehavior_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.UNRECOGNIZED : forNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f", new java.lang.Object[]{"legacyPopupBehavior_", "loginUri_", "popupBehavior_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.class) {
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

        private void setPopupBehaviorValue(int i) {
            this.popupBehavior_ = i;
        }

        private void setPopupBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 a0Var) {
            this.popupBehavior_ = a0Var.getNumber();
        }

        private void setLoginUriBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        private void setLoginUri(java.lang.String str) {
            this.loginUri_ = str;
        }

        private void setLegacyPopupBehaviorValue(int i) {
            this.legacyPopupBehavior_ = i;
        }

        private void setLegacyPopupBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b bVar) {
            this.legacyPopupBehavior_ = bVar.getNumber();
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearPopupBehavior() {
            this.popupBehavior_ = 0;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        private void clearLegacyPopupBehavior() {
            this.legacyPopupBehavior_ = 0;
        }

        private OutOfProcessIOSPopup() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup();
            DEFAULT_INSTANCE = outOfProcessIOSPopup;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.class, outOfProcessIOSPopup);
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$OutOfProcessIOSPopupOptions);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasOutOfProcessIosPopup() {
        return (this.bitField0_ & 1) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup getOutOfProcessIosPopup() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup = this.outOfProcessIosPopup_;
        return outOfProcessIOSPopup == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.getDefaultInstance() : outOfProcessIOSPopup;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "outOfProcessIosPopup_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.class) {
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

    private void setOutOfProcessIosPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
        this.outOfProcessIosPopup_ = outOfProcessIOSPopup;
        this.bitField0_ |= 1;
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN(0),
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION(2),
        UNRECOGNIZED(-1);

        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION_VALUE = 2;
        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6139a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6139a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$b$b, reason: collision with other inner class name */
        public static final class C0178b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.C0178b f6140a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.C0178b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b.C0178b.f6140a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.b forNumber(int i) {
            if (i == 0) {
                return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN;
            }
            if (i == 1) {
                return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER;
            }
            if (i != 2) {
                return null;
            }
            return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION;
        }

        b(int i) {
            this.f6139a = i;
        }
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeOutOfProcessIosPopup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup2 = this.outOfProcessIosPopup_;
        if (outOfProcessIOSPopup2 != null && outOfProcessIOSPopup2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.getDefaultInstance()) {
            outOfProcessIOSPopup = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.newBuilder(this.outOfProcessIosPopup_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.a) outOfProcessIOSPopup).buildPartial();
        }
        this.outOfProcessIosPopup_ = outOfProcessIOSPopup;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearOutOfProcessIosPopup() {
        this.outOfProcessIosPopup_ = null;
        this.bitField0_ &= -2;
    }

    private Common$OutOfProcessIOSPopupOptions() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions();
        DEFAULT_INSTANCE = common$OutOfProcessIOSPopupOptions;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions.class, common$OutOfProcessIOSPopupOptions);
    }
}
