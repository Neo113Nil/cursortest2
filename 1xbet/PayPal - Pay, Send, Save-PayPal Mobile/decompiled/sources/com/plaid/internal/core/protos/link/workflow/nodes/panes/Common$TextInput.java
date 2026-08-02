package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$TextInput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int AUTOCOMPLETE_TYPE_FIELD_NUMBER = 11;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 16;
    public static final int ENCRYPTION_FIELD_NUMBER = 8;
    public static final int HINT_FIELD_NUMBER = 13;
    public static final int ICON_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INPUT_MODE_TYPE_FIELD_NUMBER = 14;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 4;
    public static final int PREFILLED_TEXT_FIELD_NUMBER = 7;
    public static final int PREFILL_OPTIONS_FIELD_NUMBER = 15;
    public static final int PREFIX_ICON_FIELD_NUMBER = 12;
    public static final int SECURE_FIELD_NUMBER = 5;
    public static final int SECURE_OPTIONS_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 6;
    private int autocompleteType_;
    private int bitField0_;
    private boolean disabled_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata encryption_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString hint_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private java.lang.String id_ = "";
    private int inputModeType_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString label_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString placeholder_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString prefilledText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance prefixIcon_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions_;
    private boolean secure_;
    private int type_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation validation_;

    public static final class PrefillOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CLEAR_ON_FOCUS_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions> PARSER;
        private boolean clearOnFocus_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions();
            DEFAULT_INSTANCE = prefillOptions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.class, prefillOptions);
        }

        private PrefillOptions() {
        }

        private void clearClearOnFocus() {
            this.clearOnFocus_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClearOnFocus(boolean z) {
            this.clearOnFocus_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"clearOnFocus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.class) {
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

        public final boolean getClearOnFocus() {
            return this.clearOnFocus_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions) {
            return DEFAULT_INSTANCE.createBuilder(prefillOptions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SecureOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.SecureOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions DEFAULT_INSTANCE;
        public static final int ENABLE_MASKING_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions> PARSER = null;
        public static final int TOGGLE_MASKING_FIELD_NUMBER = 1;
        private boolean enableMasking_;
        private boolean toggleMasking_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.SecureOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions();
            DEFAULT_INSTANCE = secureOptions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions.class, secureOptions);
        }

        private SecureOptions() {
        }

        private void clearEnableMasking() {
            this.enableMasking_ = false;
        }

        private void clearToggleMasking() {
            this.toggleMasking_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.SecureOptions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEnableMasking(boolean z) {
            this.enableMasking_ = z;
        }

        private void setToggleMasking(boolean z) {
            this.toggleMasking_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.SecureOptions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new java.lang.Object[]{"toggleMasking_", "enableMasking_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions.class) {
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

        public final boolean getEnableMasking() {
            return this.enableMasking_;
        }

        public final boolean getToggleMasking() {
            return this.toggleMasking_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.SecureOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions) {
            return DEFAULT_INSTANCE.createBuilder(secureOptions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum a implements com.google.protobuf.Internal.EnumLite {
        AUTOCOMPLETE_UNKNOWN(0),
        AUTOCOMPLETE_ONE_TIME_CODE(1),
        AUTOCOMPLETE_PHONE_WITHOUT_COUNTRY_CODE(2),
        AUTOCOMPLETE_PHONE(3),
        AUTOCOMPLETE_EMAIL(4),
        UNRECOGNIZED(-1);

        public static final int AUTOCOMPLETE_EMAIL_VALUE = 4;
        public static final int AUTOCOMPLETE_ONE_TIME_CODE_VALUE = 1;
        public static final int AUTOCOMPLETE_PHONE_VALUE = 3;
        public static final int AUTOCOMPLETE_PHONE_WITHOUT_COUNTRY_CODE_VALUE = 2;
        public static final int AUTOCOMPLETE_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a.C0186a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a.C0186a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6172a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$a$a, reason: collision with other inner class name */
        public final class C0186a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.a.b f6173a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.a.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a.forNumber(i) != null;
            }
        }

        a(int i) {
            this.f6172a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a forNumber(int i) {
            if (i == 0) {
                return AUTOCOMPLETE_UNKNOWN;
            }
            if (i == 1) {
                return AUTOCOMPLETE_ONE_TIME_CODE;
            }
            if (i == 2) {
                return AUTOCOMPLETE_PHONE_WITHOUT_COUNTRY_CODE;
            }
            if (i == 3) {
                return AUTOCOMPLETE_PHONE;
            }
            if (i != 4) {
                return null;
            }
            return AUTOCOMPLETE_EMAIL;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.a.b.f6173a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6172a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.DEFAULT_INSTANCE);
        }
    }

    public enum c implements com.google.protobuf.Internal.EnumLite {
        INPUT_MODE_TYPE_UNKNOWN(0),
        INPUT_MODE_TYPE_NONE(1),
        INPUT_MODE_TYPE_TEXT(2),
        INPUT_MODE_TYPE_DECIMAL(3),
        INPUT_MODE_TYPE_NUMERIC(4),
        INPUT_MODE_TYPE_TELEPHONE(5),
        INPUT_MODE_TYPE_SEARCH(6),
        INPUT_MODE_TYPE_EMAIL(7),
        INPUT_MODE_TYPE_URL(8),
        UNRECOGNIZED(-1);

        public static final int INPUT_MODE_TYPE_DECIMAL_VALUE = 3;
        public static final int INPUT_MODE_TYPE_EMAIL_VALUE = 7;
        public static final int INPUT_MODE_TYPE_NONE_VALUE = 1;
        public static final int INPUT_MODE_TYPE_NUMERIC_VALUE = 4;
        public static final int INPUT_MODE_TYPE_SEARCH_VALUE = 6;
        public static final int INPUT_MODE_TYPE_TELEPHONE_VALUE = 5;
        public static final int INPUT_MODE_TYPE_TEXT_VALUE = 2;
        public static final int INPUT_MODE_TYPE_UNKNOWN_VALUE = 0;
        public static final int INPUT_MODE_TYPE_URL_VALUE = 8;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.c.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6174a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.c.b f6175a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.c.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c.forNumber(i) != null;
            }
        }

        c(int i) {
            this.f6174a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c forNumber(int i) {
            switch (i) {
                case 0:
                    return INPUT_MODE_TYPE_UNKNOWN;
                case 1:
                    return INPUT_MODE_TYPE_NONE;
                case 2:
                    return INPUT_MODE_TYPE_TEXT;
                case 3:
                    return INPUT_MODE_TYPE_DECIMAL;
                case 4:
                    return INPUT_MODE_TYPE_NUMERIC;
                case 5:
                    return INPUT_MODE_TYPE_TELEPHONE;
                case 6:
                    return INPUT_MODE_TYPE_SEARCH;
                case 7:
                    return INPUT_MODE_TYPE_EMAIL;
                case 8:
                    return INPUT_MODE_TYPE_URL;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.c.b.f6175a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6174a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput();
        DEFAULT_INSTANCE = common$TextInput;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.class, common$TextInput);
    }

    private Common$TextInput() {
    }

    private void clearAutocompleteType() {
        this.autocompleteType_ = 0;
    }

    private void clearDisabled() {
        this.disabled_ = false;
    }

    private void clearEncryption() {
        this.encryption_ = null;
        this.bitField0_ &= -65;
    }

    private void clearHint() {
        this.hint_ = null;
        this.bitField0_ &= -513;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -129;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearInputModeType() {
        this.inputModeType_ = 0;
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPlaceholder() {
        this.placeholder_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPrefillOptions() {
        this.prefillOptions_ = null;
        this.bitField0_ &= -33;
    }

    private void clearPrefilledText() {
        this.prefilledText_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPrefixIcon() {
        this.prefixIcon_ = null;
        this.bitField0_ &= -257;
    }

    private void clearSecure() {
        this.secure_ = false;
    }

    private void clearSecureOptions() {
        this.secureOptions_ = null;
        this.bitField0_ &= -5;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -9;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutocompleteType(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a aVar) {
        this.autocompleteType_ = aVar.getNumber();
    }

    private void setAutocompleteTypeValue(int i) {
        this.autocompleteType_ = i;
    }

    private void setDisabled(boolean z) {
        this.disabled_ = z;
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setInputModeType(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c cVar) {
        this.inputModeType_ = cVar.getNumber();
    }

    private void setInputModeTypeValue(int i) {
        this.inputModeType_ = i;
    }

    private void setSecure(boolean z) {
        this.secure_ = z;
    }

    private void setType(com.plaid.internal.core.protos.link.workflow.nodes.panes.V v) {
        this.type_ = v.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0006\tဉ\u0007\nဉ\u0002\u000b\f\fဉ\b\rဉ\t\u000e\f\u000fဉ\u0005\u0010\u0007", new java.lang.Object[]{"bitField0_", "id_", "type_", "label_", "placeholder_", "secure_", "validation_", "prefilledText_", "encryption_", "icon_", "secureOptions_", "autocompleteType_", "prefixIcon_", "hint_", "inputModeType_", "prefillOptions_", "disabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a getAutocompleteType() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a.forNumber(this.autocompleteType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.a.UNRECOGNIZED : forNumber;
    }

    public final int getAutocompleteTypeValue() {
        return this.autocompleteType_;
    }

    public final boolean getDisabled() {
        return this.disabled_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata getEncryption() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = this.encryption_;
        return common$SDKEncryptionMetadata == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.getDefaultInstance() : common$SDKEncryptionMetadata;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getHint() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.hint_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c getInputModeType() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c.forNumber(this.inputModeType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.c.UNRECOGNIZED : forNumber;
    }

    public final int getInputModeTypeValue() {
        return this.inputModeType_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getLabel() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.label_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPlaceholder() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.placeholder_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions getPrefillOptions() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions = this.prefillOptions_;
        return prefillOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.getDefaultInstance() : prefillOptions;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPrefilledText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.prefilledText_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getPrefixIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.prefixIcon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final boolean getSecure() {
        return this.secure_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions getSecureOptions() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions = this.secureOptions_;
        return secureOptions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions.getDefaultInstance() : secureOptions;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.V getType() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.V forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.V.forNumber(this.type_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.V.UNRECOGNIZED : forNumber;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation getValidation() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public final boolean hasEncryption() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasHint() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPlaceholder() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasPrefillOptions() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasPrefilledText() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasPrefixIcon() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasSecureOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasValidation() {
        return (this.bitField0_ & 8) != 0;
    }

    private void mergeEncryption(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata common$SDKEncryptionMetadata2 = this.encryption_;
        if (common$SDKEncryptionMetadata2 == null || common$SDKEncryptionMetadata2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.getDefaultInstance()) {
            this.encryption_ = common$SDKEncryptionMetadata;
        } else {
            this.encryption_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.newBuilder(this.encryption_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.a) common$SDKEncryptionMetadata).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeHint(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.hint_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            this.hint_ = common$AttributedLocalizedString;
        } else {
            this.hint_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.hint_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.label_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.label_ = common$LocalizedString;
        } else {
            this.label_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.label_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePlaceholder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.placeholder_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.placeholder_ = common$LocalizedString;
        } else {
            this.placeholder_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.placeholder_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergePrefillOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions2 = this.prefillOptions_;
        if (prefillOptions2 == null || prefillOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.getDefaultInstance()) {
            this.prefillOptions_ = prefillOptions;
        } else {
            this.prefillOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions.newBuilder(this.prefillOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.PrefillOptions.a) prefillOptions).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergePrefilledText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.prefilledText_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.prefilledText_ = common$LocalizedString;
        } else {
            this.prefilledText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.prefilledText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergePrefixIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.prefixIcon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.prefixIcon_ = common$RenderedAssetAppearance;
        } else {
            this.prefixIcon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.prefixIcon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    private void mergeSecureOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions2 = this.secureOptions_;
        if (secureOptions2 == null || secureOptions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions.getDefaultInstance()) {
            this.secureOptions_ = secureOptions;
        } else {
            this.secureOptions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions.newBuilder(this.secureOptions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInput.SecureOptions.a) secureOptions).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeValidation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 == null || common$TextInputValidation2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.getDefaultInstance()) {
            this.validation_ = common$TextInputValidation;
        } else {
            this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.newBuilder(this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a) common$TextInputValidation).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput) {
        return DEFAULT_INSTANCE.createBuilder(common$TextInput);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEncryption(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        this.encryption_ = common$SDKEncryptionMetadata;
        this.bitField0_ |= 64;
    }

    private void setHint(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.hint_ = common$AttributedLocalizedString;
        this.bitField0_ |= 512;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 128;
    }

    private void setLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setPlaceholder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.placeholder_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setPrefillOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.PrefillOptions prefillOptions) {
        this.prefillOptions_ = prefillOptions;
        this.bitField0_ |= 32;
    }

    private void setPrefilledText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.prefilledText_ = common$LocalizedString;
        this.bitField0_ |= 16;
    }

    private void setPrefixIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.prefixIcon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 256;
    }

    private void setSecureOptions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.SecureOptions secureOptions) {
        this.secureOptions_ = secureOptions;
        this.bitField0_ |= 4;
    }

    private void setValidation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 8;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
