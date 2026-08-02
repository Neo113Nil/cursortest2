package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$AttributedString extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.b> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACTIONS_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString DEFAULT_INSTANCE;
    public static final int HTML_ESCAPED_TRANSLATION_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString> PARSER = null;
    public static final int TEMPLATED_KEY_FIELD_NUMBER = 3;
    private java.lang.Object keyOrTranslation_;
    private int keyOrTranslationCase_ = 0;
    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> actions_ = com.google.protobuf.MapFieldLite.emptyMapField();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> f6113a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance());
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        KEY(1),
        HTML_ESCAPED_TRANSLATION(2),
        TEMPLATED_KEY(3),
        KEYORTRANSLATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6114a;

        c(int i) {
            this.f6114a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.c forNumber(int i) {
            if (i == 0) {
                return KEYORTRANSLATION_NOT_SET;
            }
            if (i == 1) {
                return KEY;
            }
            if (i == 2) {
                return HTML_ESCAPED_TRANSLATION;
            }
            if (i != 3) {
                return null;
            }
            return TEMPLATED_KEY;
        }

        public final int getNumber() {
            return this.f6114a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString common$AttributedString = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString();
        DEFAULT_INSTANCE = common$AttributedString;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.class, common$AttributedString);
    }

    private Common$AttributedString() {
    }

    private void clearHtmlEscapedTranslation() {
        if (this.keyOrTranslationCase_ == 2) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    private void clearKey() {
        if (this.keyOrTranslationCase_ == 1) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    private void clearKeyOrTranslation() {
        this.keyOrTranslationCase_ = 0;
        this.keyOrTranslation_ = null;
    }

    private void clearTemplatedKey() {
        if (this.keyOrTranslationCase_ == 3) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> getMutableActionsMap() {
        return internalGetMutableActions();
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> internalGetActions() {
        return this.actions_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> internalGetMutableActions() {
        if (!this.actions_.isMutable()) {
            this.actions_ = this.actions_.mutableCopy();
        }
        return this.actions_;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHtmlEscapedTranslationBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 2;
    }

    private void setKeyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000\u00042", new java.lang.Object[]{"keyOrTranslation_", "keyOrTranslationCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.class, "actions_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.a.f6113a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.class) {
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

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> getActions() {
        return getActionsMap();
    }

    public final int getActionsCount() {
        return internalGetActions().size();
    }

    public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> getActionsMap() {
        return java.util.Collections.unmodifiableMap(internalGetActions());
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.c getKeyOrTranslationCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.c.forNumber(this.keyOrTranslationCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey getTemplatedKey() {
        return this.keyOrTranslationCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) this.keyOrTranslation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.getDefaultInstance();
    }

    public final boolean hasHtmlEscapedTranslation() {
        return this.keyOrTranslationCase_ == 2;
    }

    public final boolean hasKey() {
        return this.keyOrTranslationCase_ == 1;
    }

    public final boolean hasTemplatedKey() {
        return this.keyOrTranslationCase_ == 3;
    }

    private void mergeTemplatedKey(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey common$TemplatedKey) {
        if (this.keyOrTranslationCase_ != 3 || this.keyOrTranslation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.getDefaultInstance()) {
            this.keyOrTranslation_ = common$TemplatedKey;
        } else {
            this.keyOrTranslation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) this.keyOrTranslation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a) common$TemplatedKey).buildPartial();
        }
        this.keyOrTranslationCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString common$AttributedString) {
        return DEFAULT_INSTANCE.createBuilder(common$AttributedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setHtmlEscapedTranslation(java.lang.String str) {
        this.keyOrTranslationCase_ = 2;
        this.keyOrTranslation_ = str;
    }

    private void setKey(java.lang.String str) {
        this.keyOrTranslationCase_ = 1;
        this.keyOrTranslation_ = str;
    }

    private void setTemplatedKey(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey common$TemplatedKey) {
        this.keyOrTranslation_ = common$TemplatedKey;
        this.keyOrTranslationCase_ = 3;
    }

    public final boolean containsActions(java.lang.String str) {
        return internalGetActions().containsKey(str);
    }

    public final java.lang.String getHtmlEscapedTranslation() {
        return this.keyOrTranslationCase_ == 2 ? (java.lang.String) this.keyOrTranslation_ : "";
    }

    public final com.google.protobuf.ByteString getHtmlEscapedTranslationBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 2 ? (java.lang.String) this.keyOrTranslation_ : "");
    }

    public final java.lang.String getKey() {
        return this.keyOrTranslationCase_ == 1 ? (java.lang.String) this.keyOrTranslation_ : "";
    }

    public final com.google.protobuf.ByteString getKeyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 1 ? (java.lang.String) this.keyOrTranslation_ : "");
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getActionsOrDefault(java.lang.String str, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> internalGetActions = internalGetActions();
        return internalGetActions.containsKey(str) ? internalGetActions.get(str) : common$LocalAction;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getActionsOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> internalGetActions = internalGetActions();
        if (internalGetActions.containsKey(str)) {
            return internalGetActions.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
