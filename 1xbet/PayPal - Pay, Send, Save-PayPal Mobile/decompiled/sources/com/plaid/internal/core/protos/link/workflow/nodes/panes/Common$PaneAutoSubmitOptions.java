package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$PaneAutoSubmitOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int AUTO_SUBMIT_ACTION_FIELD_NUMBER = 1;
    public static final int AUTO_SUBMIT_DELAY_MS_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions> PARSER;
    private int autoSubmitAction_;
    private int autoSubmitDelayMs_;

    public enum a implements com.google.protobuf.Internal.EnumLite {
        AUTO_SUBMIT_UNKNOWN(0),
        AUTO_SUBMIT_PRIMARY_BUTTON_TAP(1),
        AUTO_SUBMIT_SECONDARY_BUTTON_TAP(2),
        AUTO_SUBMIT_TERTIARY_BUTTON_TAP(3),
        AUTO_SUBMIT_EXIT(4),
        UNRECOGNIZED(-1);

        public static final int AUTO_SUBMIT_EXIT_VALUE = 4;
        public static final int AUTO_SUBMIT_PRIMARY_BUTTON_TAP_VALUE = 1;
        public static final int AUTO_SUBMIT_SECONDARY_BUTTON_TAP_VALUE = 2;
        public static final int AUTO_SUBMIT_TERTIARY_BUTTON_TAP_VALUE = 3;
        public static final int AUTO_SUBMIT_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a.C0179a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a.C0179a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6141a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions$a$a, reason: collision with other inner class name */
        public final class C0179a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneAutoSubmitOptions.a.b f6142a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneAutoSubmitOptions.a.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a.forNumber(i) != null;
            }
        }

        a(int i) {
            this.f6141a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a forNumber(int i) {
            if (i == 0) {
                return AUTO_SUBMIT_UNKNOWN;
            }
            if (i == 1) {
                return AUTO_SUBMIT_PRIMARY_BUTTON_TAP;
            }
            if (i == 2) {
                return AUTO_SUBMIT_SECONDARY_BUTTON_TAP;
            }
            if (i == 3) {
                return AUTO_SUBMIT_TERTIARY_BUTTON_TAP;
            }
            if (i != 4) {
                return null;
            }
            return AUTO_SUBMIT_EXIT;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneAutoSubmitOptions.a.b.f6142a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6141a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions();
        DEFAULT_INSTANCE = common$PaneAutoSubmitOptions;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.class, common$PaneAutoSubmitOptions);
    }

    private Common$PaneAutoSubmitOptions() {
    }

    private void clearAutoSubmitAction() {
        this.autoSubmitAction_ = 0;
    }

    private void clearAutoSubmitDelayMs() {
        this.autoSubmitDelayMs_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutoSubmitAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a aVar) {
        this.autoSubmitAction_ = aVar.getNumber();
    }

    private void setAutoSubmitActionValue(int i) {
        this.autoSubmitAction_ = i;
    }

    private void setAutoSubmitDelayMs(int i) {
        this.autoSubmitDelayMs_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new java.lang.Object[]{"autoSubmitAction_", "autoSubmitDelayMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a getAutoSubmitAction() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a.forNumber(this.autoSubmitAction_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.a.UNRECOGNIZED : forNumber;
    }

    public final int getAutoSubmitActionValue() {
        return this.autoSubmitAction_;
    }

    public final int getAutoSubmitDelayMs() {
        return this.autoSubmitDelayMs_;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneAutoSubmitOptions);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
