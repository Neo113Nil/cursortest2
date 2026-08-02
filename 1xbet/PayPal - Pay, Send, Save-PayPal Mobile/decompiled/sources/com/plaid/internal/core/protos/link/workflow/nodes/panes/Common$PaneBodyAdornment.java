package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$PaneBodyAdornment extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment DEFAULT_INSTANCE;
    public static final int FIRST_LINE_CONTENT_FIELD_NUMBER = 1;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int OVERLAPPING_ICONS_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment> PARSER = null;
    public static final int SECOND_LINE_CONTENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent firstLineContent_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent secondLineContent_;

    public static final class OverlappingIcons extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneBodyAdornment.OverlappingIcons.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons DEFAULT_INSTANCE;
        public static final int ICONS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> icons_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        private void addIcons(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            ensureIconsIsMutable();
            this.icons_.add(i, common$RenderedAssetAppearance);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneBodyAdornment.OverlappingIcons.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addIcons(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            ensureIconsIsMutable();
            this.icons_.add(common$RenderedAssetAppearance);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneBodyAdornment.OverlappingIcons.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons) {
            return DEFAULT_INSTANCE.createBuilder(overlappingIcons);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.K> getIconsOrBuilderList() {
            return this.icons_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.K getIconsOrBuilder(int i) {
            return this.icons_.get(i);
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> getIconsList() {
            return this.icons_;
        }

        public final int getIconsCount() {
            return this.icons_.size();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcons(int i) {
            return this.icons_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneBodyAdornment.OverlappingIcons.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"icons_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons.class) {
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

        private void setIcons(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            ensureIconsIsMutable();
            this.icons_.set(i, common$RenderedAssetAppearance);
        }

        private void removeIcons(int i) {
            ensureIconsIsMutable();
            this.icons_.remove(i);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void ensureIconsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> protobufList = this.icons_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.icons_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void clearIcons() {
            this.icons_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllIcons(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> iterable) {
            ensureIconsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.icons_);
        }

        private OverlappingIcons() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneBodyAdornment.OverlappingIcons.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons();
            DEFAULT_INSTANCE = overlappingIcons;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons.class, overlappingIcons);
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneBodyAdornment);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasSecondLineContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasOverlappingIcons() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasFirstLineContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasButton() {
        return (this.bitField0_ & 8) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getSecondLineContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.secondLineContent_;
        return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons getOverlappingIcons() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons = this.overlappingIcons_;
        return overlappingIcons == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons.getDefaultInstance() : overlappingIcons;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getFirstLineContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.firstLineContent_;
        return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new java.lang.Object[]{"bitField0_", "firstLineContent_", "secondLineContent_", "icon_", "button_", "overlappingIcons_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.class) {
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

    private void setSecondLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    private void setOverlappingIcons(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons) {
        this.overlappingIcons_ = overlappingIcons;
        this.bitField0_ |= 16;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 4;
    }

    private void setFirstLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 1;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeSecondLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.secondLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.secondLineContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    private void mergeOverlappingIcons(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons overlappingIcons2 = this.overlappingIcons_;
        if (overlappingIcons2 != null && overlappingIcons2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons.getDefaultInstance()) {
            overlappingIcons = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.OverlappingIcons.newBuilder(this.overlappingIcons_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneBodyAdornment.OverlappingIcons.a) overlappingIcons).buildPartial();
        }
        this.overlappingIcons_ = overlappingIcons;
        this.bitField0_ |= 16;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 4;
    }

    private void mergeFirstLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.firstLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.firstLineContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 1;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearSecondLineContent() {
        this.secondLineContent_ = null;
        this.bitField0_ &= -3;
    }

    private void clearOverlappingIcons() {
        this.overlappingIcons_ = null;
        this.bitField0_ &= -17;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -5;
    }

    private void clearFirstLineContent() {
        this.firstLineContent_ = null;
        this.bitField0_ &= -2;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -9;
    }

    private Common$PaneBodyAdornment() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment common$PaneBodyAdornment = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment();
        DEFAULT_INSTANCE = common$PaneBodyAdornment;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment.class, common$PaneBodyAdornment);
    }
}
