package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$AttributedLocalizedString extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l {
    public static final int ACTIONS_FIELD_NUMBER = 2;
    public static final int ASSETS_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString DEFAULT_INSTANCE;
    public static final int LOCALIZED_STRING_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> PARSER;
    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> actions_ = com.google.protobuf.MapFieldLite.emptyMapField();
    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> assets_ = com.google.protobuf.MapFieldLite.emptyMapField();
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString localizedString_;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> f6111a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance());
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> f6112a = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance());
    }

    public static final class c extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l {
        public c() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString();
        DEFAULT_INSTANCE = common$AttributedLocalizedString;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class, common$AttributedLocalizedString);
    }

    private Common$AttributedLocalizedString() {
    }

    private void clearLocalizedString() {
        this.localizedString_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> getMutableActionsMap() {
        return internalGetMutableActions();
    }

    private java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> getMutableAssetsMap() {
        return internalGetMutableAssets();
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> internalGetActions() {
        return this.actions_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> internalGetAssets() {
        return this.assets_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> internalGetMutableActions() {
        if (!this.actions_.isMutable()) {
            this.actions_ = this.actions_.mutableCopy();
        }
        return this.actions_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> internalGetMutableAssets() {
        if (!this.assets_.isMutable()) {
            this.assets_ = this.assets_.mutableCopy();
        }
        return this.assets_;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001ဉ\u0000\u00022\u00032", new java.lang.Object[]{"bitField0_", "localizedString_", "actions_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.a.f6111a, "assets_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.b.f6112a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class) {
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

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> getAssets() {
        return getAssetsMap();
    }

    public final int getAssetsCount() {
        return internalGetAssets().size();
    }

    public final java.util.Map<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> getAssetsMap() {
        return java.util.Collections.unmodifiableMap(internalGetAssets());
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getLocalizedString() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.localizedString_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean hasLocalizedString() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeLocalizedString(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.localizedString_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.localizedString_ = common$LocalizedString;
        } else {
            this.localizedString_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.localizedString_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        return DEFAULT_INSTANCE.createBuilder(common$AttributedLocalizedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setLocalizedString(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.localizedString_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public final boolean containsActions(java.lang.String str) {
        return internalGetActions().containsKey(str);
    }

    public final boolean containsAssets(java.lang.String str) {
        return internalGetAssets().containsKey(str);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getAssetsOrDefault(java.lang.String str, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> internalGetAssets = internalGetAssets();
        return internalGetAssets.containsKey(str) ? internalGetAssets.get(str) : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getAssetsOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> internalGetAssets = internalGetAssets();
        if (internalGetAssets.containsKey(str)) {
            return internalGetAssets.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
