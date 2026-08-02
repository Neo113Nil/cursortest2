package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$OAuthGuidance extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance DEFAULT_INSTANCE;
    public static final int GUIDANCE_CHECKLIST_ITEMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance> PARSER;
    private int bitField0_;
    private java.lang.String color_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> guidanceChecklistItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString name_;

    private void addGuidanceChecklistItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.add(i, common$AttributedLocalizedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addGuidanceChecklistItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.add(common$AttributedLocalizedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance common$OAuthGuidance) {
        return DEFAULT_INSTANCE.createBuilder(common$OAuthGuidance);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getName() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.name_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l> getGuidanceChecklistItemsOrBuilderList() {
        return this.guidanceChecklistItems_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l getGuidanceChecklistItemsOrBuilder(int i) {
        return this.guidanceChecklistItems_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> getGuidanceChecklistItemsList() {
        return this.guidanceChecklistItems_;
    }

    public final int getGuidanceChecklistItemsCount() {
        return this.guidanceChecklistItems_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getGuidanceChecklistItems(int i) {
        return this.guidanceChecklistItems_.get(i);
    }

    public final com.google.protobuf.ByteString getColorBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.color_);
    }

    public final java.lang.String getColor() {
        return this.color_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b", new java.lang.Object[]{"bitField0_", "name_", "color_", "guidanceChecklistItems_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.class) {
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

    private void setName(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.name_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setGuidanceChecklistItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.set(i, common$AttributedLocalizedString);
    }

    private void setColorBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.color_ = byteString.toStringUtf8();
    }

    private void setColor(java.lang.String str) {
        this.color_ = str;
    }

    private void removeGuidanceChecklistItems(int i) {
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeName(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.name_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.name_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.name_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureGuidanceChecklistItemsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> protobufList = this.guidanceChecklistItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.guidanceChecklistItems_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearName() {
        this.name_ = null;
        this.bitField0_ &= -2;
    }

    private void clearGuidanceChecklistItems() {
        this.guidanceChecklistItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearColor() {
        this.color_ = getDefaultInstance().getColor();
    }

    private void addAllGuidanceChecklistItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> iterable) {
        ensureGuidanceChecklistItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.guidanceChecklistItems_);
    }

    private Common$OAuthGuidance() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance common$OAuthGuidance = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance();
        DEFAULT_INSTANCE = common$OAuthGuidance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.class, common$OAuthGuidance);
    }
}
