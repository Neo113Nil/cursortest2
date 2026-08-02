package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class EmbeddedComponentCommon$EmbeddedComponentDecorator extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ASSET_OVERLAP_WITH_PLAID_LOGO_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator DEFAULT_INSTANCE;
    public static final int LABELED_ASSET_FIELD_NUMBER = 2;
    public static final int OVERLAPPING_ASSETS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator> PARSER = null;
    public static final int PLAID_LOGO_FIELD_NUMBER = 3;
    private int decoratorCase_ = 0;
    private java.lang.Object decorator_;

    public static final class AssetOverlapWithPlaidLogo extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo> PARSER;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance asset_;
        private int bitField0_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo();
            DEFAULT_INSTANCE = assetOverlapWithPlaidLogo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.class, assetOverlapWithPlaidLogo);
        }

        private AssetOverlapWithPlaidLogo() {
        }

        private void clearAsset() {
            this.asset_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.e0.f6296a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "asset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.asset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final boolean hasAsset() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.asset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.asset_ = common$RenderedAssetAppearance;
            } else {
                this.asset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.asset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo) {
            return DEFAULT_INSTANCE.createBuilder(assetOverlapWithPlaidLogo);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.asset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LabeledAsset extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.LabeledAsset.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset> PARSER;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance asset_;
        private int bitField0_;
        private java.lang.String label_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.LabeledAsset.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset labeledAsset = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset();
            DEFAULT_INSTANCE = labeledAsset;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.class, labeledAsset);
        }

        private LabeledAsset() {
        }

        private void clearAsset() {
            this.asset_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLabel() {
            this.label_ = getDefaultInstance().getLabel();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.LabeledAsset.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLabelBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.label_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.e0.f6296a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.LabeledAsset.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "label_", "asset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.asset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final java.lang.String getLabel() {
            return this.label_;
        }

        public final com.google.protobuf.ByteString getLabelBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.label_);
        }

        public final boolean hasAsset() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.asset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.asset_ = common$RenderedAssetAppearance;
            } else {
                this.asset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.asset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.LabeledAsset.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset labeledAsset) {
            return DEFAULT_INSTANCE.createBuilder(labeledAsset);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.asset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setLabel(java.lang.String str) {
            this.label_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OverlappingAssets extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.OverlappingAssets.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ASSETS_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> assets_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.OverlappingAssets.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets overlappingAssets = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets();
            DEFAULT_INSTANCE = overlappingAssets;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.class, overlappingAssets);
        }

        private OverlappingAssets() {
        }

        private void addAllAssets(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> iterable) {
            ensureAssetsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.assets_);
        }

        private void clearAssets() {
            this.assets_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAssetsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> protobufList = this.assets_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.assets_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.OverlappingAssets.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAssets(int i) {
            ensureAssetsIsMutable();
            this.assets_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.e0.f6296a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.OverlappingAssets.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"assets_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getAssets(int i) {
            return this.assets_.get(i);
        }

        public final int getAssetsCount() {
            return this.assets_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> getAssetsList() {
            return this.assets_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.K getAssetsOrBuilder(int i) {
            return this.assets_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.K> getAssetsOrBuilderList() {
            return this.assets_;
        }

        private void addAssets(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            ensureAssetsIsMutable();
            this.assets_.add(common$RenderedAssetAppearance);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.OverlappingAssets.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets overlappingAssets) {
            return DEFAULT_INSTANCE.createBuilder(overlappingAssets);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAssets(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            ensureAssetsIsMutable();
            this.assets_.set(i, common$RenderedAssetAppearance);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addAssets(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            ensureAssetsIsMutable();
            this.assets_.add(i, common$RenderedAssetAppearance);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PlaidLogo extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.PlaidLogo.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.PlaidLogo.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo plaidLogo = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo();
            DEFAULT_INSTANCE = plaidLogo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.class, plaidLogo);
        }

        private PlaidLogo() {
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.PlaidLogo.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.e0.f6296a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.PlaidLogo.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.PlaidLogo.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo plaidLogo) {
            return DEFAULT_INSTANCE.createBuilder(plaidLogo);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        OVERLAPPING_ASSETS(1),
        LABELED_ASSET(2),
        PLAID_LOGO(3),
        ASSET_OVERLAP_WITH_PLAID_LOGO(4),
        DECORATOR_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6193a;

        b(int i) {
            this.f6193a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.b forNumber(int i) {
            if (i == 0) {
                return DECORATOR_NOT_SET;
            }
            if (i == 1) {
                return OVERLAPPING_ASSETS;
            }
            if (i == 2) {
                return LABELED_ASSET;
            }
            if (i == 3) {
                return PLAID_LOGO;
            }
            if (i != 4) {
                return null;
            }
            return ASSET_OVERLAP_WITH_PLAID_LOGO;
        }

        public final int getNumber() {
            return this.f6193a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator embeddedComponentCommon$EmbeddedComponentDecorator = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator();
        DEFAULT_INSTANCE = embeddedComponentCommon$EmbeddedComponentDecorator;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.class, embeddedComponentCommon$EmbeddedComponentDecorator);
    }

    private EmbeddedComponentCommon$EmbeddedComponentDecorator() {
    }

    private void clearAssetOverlapWithPlaidLogo() {
        if (this.decoratorCase_ == 4) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    private void clearDecorator() {
        this.decoratorCase_ = 0;
        this.decorator_ = null;
    }

    private void clearLabeledAsset() {
        if (this.decoratorCase_ == 2) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    private void clearOverlappingAssets() {
        if (this.decoratorCase_ == 1) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    private void clearPlaidLogo() {
        if (this.decoratorCase_ == 3) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.e0.f6296a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"decorator_", "decoratorCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo getAssetOverlapWithPlaidLogo() {
        return this.decoratorCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) this.decorator_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.b getDecoratorCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.b.forNumber(this.decoratorCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset getLabeledAsset() {
        return this.decoratorCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) this.decorator_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets getOverlappingAssets() {
        return this.decoratorCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) this.decorator_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo getPlaidLogo() {
        return this.decoratorCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) this.decorator_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.getDefaultInstance();
    }

    public final boolean hasAssetOverlapWithPlaidLogo() {
        return this.decoratorCase_ == 4;
    }

    public final boolean hasLabeledAsset() {
        return this.decoratorCase_ == 2;
    }

    public final boolean hasOverlappingAssets() {
        return this.decoratorCase_ == 1;
    }

    public final boolean hasPlaidLogo() {
        return this.decoratorCase_ == 3;
    }

    private void mergeAssetOverlapWithPlaidLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo) {
        if (this.decoratorCase_ != 4 || this.decorator_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.getDefaultInstance()) {
            this.decorator_ = assetOverlapWithPlaidLogo;
        } else {
            this.decorator_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo) this.decorator_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo.a) assetOverlapWithPlaidLogo).buildPartial();
        }
        this.decoratorCase_ = 4;
    }

    private void mergeLabeledAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset labeledAsset) {
        if (this.decoratorCase_ != 2 || this.decorator_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.getDefaultInstance()) {
            this.decorator_ = labeledAsset;
        } else {
            this.decorator_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset) this.decorator_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.LabeledAsset.a) labeledAsset).buildPartial();
        }
        this.decoratorCase_ = 2;
    }

    private void mergeOverlappingAssets(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets overlappingAssets) {
        if (this.decoratorCase_ != 1 || this.decorator_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.getDefaultInstance()) {
            this.decorator_ = overlappingAssets;
        } else {
            this.decorator_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets) this.decorator_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.OverlappingAssets.a) overlappingAssets).buildPartial();
        }
        this.decoratorCase_ = 1;
    }

    private void mergePlaidLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo plaidLogo) {
        if (this.decoratorCase_ != 3 || this.decorator_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.getDefaultInstance()) {
            this.decorator_ = plaidLogo;
        } else {
            this.decorator_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo) this.decorator_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon.EmbeddedComponentDecorator.PlaidLogo.a) plaidLogo).buildPartial();
        }
        this.decoratorCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator embeddedComponentCommon$EmbeddedComponentDecorator) {
        return DEFAULT_INSTANCE.createBuilder(embeddedComponentCommon$EmbeddedComponentDecorator);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAssetOverlapWithPlaidLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo) {
        this.decorator_ = assetOverlapWithPlaidLogo;
        this.decoratorCase_ = 4;
    }

    private void setLabeledAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.LabeledAsset labeledAsset) {
        this.decorator_ = labeledAsset;
        this.decoratorCase_ = 2;
    }

    private void setOverlappingAssets(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.OverlappingAssets overlappingAssets) {
        this.decorator_ = overlappingAssets;
        this.decoratorCase_ = 1;
    }

    private void setPlaidLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator.PlaidLogo plaidLogo) {
        this.decorator_ = plaidLogo;
        this.decoratorCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.EmbeddedComponentCommon$EmbeddedComponentDecorator) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
