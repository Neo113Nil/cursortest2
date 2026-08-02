package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$RenderedAsset extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ASSET_FIELD_NUMBER = 8;
    public static final int BYTES_FIELD_NUMBER = 6;
    public static final int CLIENT_CUSTOMIZATIONS_FIELD_NUMBER = 9;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 3;
    public static final int EXPIRY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_TEMPLATE_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset> PARSER = null;
    public static final int URL_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations_;
    private java.lang.Object content_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions_;
    private com.google.protobuf.Timestamp expiry_;
    private boolean isTemplate_;
    private int contentCase_ = 0;
    private java.lang.String id_ = "";

    public static final class ClientCustomizations extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.ClientCustomizations.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations> PARSER;
        private java.lang.String color_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.ClientCustomizations.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations();
            DEFAULT_INSTANCE = clientCustomizations;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations.class, clientCustomizations);
        }

        private ClientCustomizations() {
        }

        private void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.ClientCustomizations.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setColorBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.ClientCustomizations.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"color_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations.class) {
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

        public final java.lang.String getColor() {
            return this.color_;
        }

        public final com.google.protobuf.ByteString getColorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.color_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.ClientCustomizations.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations) {
            return DEFAULT_INSTANCE.createBuilder(clientCustomizations);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setColor(java.lang.String str) {
            this.color_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Dimensions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.Dimensions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.Dimensions.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions();
            DEFAULT_INSTANCE = dimensions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions.class, dimensions);
        }

        private Dimensions() {
        }

        private void clearHeight() {
            this.height_ = 0;
        }

        private void clearWidth() {
            this.width_ = 0;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.Dimensions.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setHeight(int i) {
            this.height_ = i;
        }

        private void setWidth(int i) {
            this.width_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.Dimensions.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new java.lang.Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions.class) {
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

        public final int getHeight() {
            return this.height_;
        }

        public final int getWidth() {
            return this.width_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.Dimensions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions) {
            return DEFAULT_INSTANCE.createBuilder(dimensions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        URL(5),
        BYTES(6),
        ASSET(8),
        CONTENT_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6148a;

        b(int i) {
            this.f6148a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.b forNumber(int i) {
            if (i == 0) {
                return CONTENT_NOT_SET;
            }
            if (i == 8) {
                return ASSET;
            }
            if (i == 5) {
                return URL;
            }
            if (i != 6) {
                return null;
            }
            return BYTES;
        }

        public final int getNumber() {
            return this.f6148a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset();
        DEFAULT_INSTANCE = common$RenderedAsset;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.class, common$RenderedAsset);
    }

    private Common$RenderedAsset() {
    }

    private void clearAsset() {
        if (this.contentCase_ == 8) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    private void clearBytes() {
        if (this.contentCase_ == 6) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    private void clearClientCustomizations() {
        this.clientCustomizations_ = null;
        this.bitField0_ &= -5;
    }

    private void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    private void clearDimensions() {
        this.dimensions_ = null;
        this.bitField0_ &= -3;
    }

    private void clearExpiry() {
        this.expiry_ = null;
        this.bitField0_ &= -2;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIsTemplate() {
        this.isTemplate_ = false;
    }

    private void clearUrl() {
        if (this.contentCase_ == 5) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAsset(com.plaid.internal.EnumC0527g enumC0527g) {
        this.content_ = java.lang.Integer.valueOf(enumC0527g.getNumber());
        this.contentCase_ = 8;
    }

    private void setAssetValue(int i) {
        this.contentCase_ = 8;
        this.content_ = java.lang.Integer.valueOf(i);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setIsTemplate(boolean z) {
        this.isTemplate_ = z;
    }

    private void setUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
        this.contentCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005Ȼ\u0000\u0006=\u0000\b?\u0000\tဉ\u0002", new java.lang.Object[]{"content_", "contentCase_", "bitField0_", "id_", "expiry_", "dimensions_", "isTemplate_", "clientCustomizations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.class) {
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

    public final com.plaid.internal.EnumC0527g getAsset() {
        if (this.contentCase_ != 8) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_UNKNOWN;
        }
        com.plaid.internal.EnumC0527g forNumber = com.plaid.internal.EnumC0527g.forNumber(((java.lang.Integer) this.content_).intValue());
        return forNumber == null ? com.plaid.internal.EnumC0527g.UNRECOGNIZED : forNumber;
    }

    public final int getAssetValue() {
        if (this.contentCase_ == 8) {
            return ((java.lang.Integer) this.content_).intValue();
        }
        return 0;
    }

    public final com.google.protobuf.ByteString getBytes() {
        return this.contentCase_ == 6 ? (com.google.protobuf.ByteString) this.content_ : com.google.protobuf.ByteString.EMPTY;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations getClientCustomizations() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations = this.clientCustomizations_;
        return clientCustomizations == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations.getDefaultInstance() : clientCustomizations;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.b getContentCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.b.forNumber(this.contentCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions getDimensions() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions = this.dimensions_;
        return dimensions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions.getDefaultInstance() : dimensions;
    }

    public final com.google.protobuf.Timestamp getExpiry() {
        com.google.protobuf.Timestamp timestamp = this.expiry_;
        return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final boolean getIsTemplate() {
        return this.isTemplate_;
    }

    public final boolean hasAsset() {
        return this.contentCase_ == 8;
    }

    public final boolean hasBytes() {
        return this.contentCase_ == 6;
    }

    public final boolean hasClientCustomizations() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasDimensions() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasExpiry() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasUrl() {
        return this.contentCase_ == 5;
    }

    private void mergeClientCustomizations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations2 = this.clientCustomizations_;
        if (clientCustomizations2 == null || clientCustomizations2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations.getDefaultInstance()) {
            this.clientCustomizations_ = clientCustomizations;
        } else {
            this.clientCustomizations_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations.newBuilder(this.clientCustomizations_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.ClientCustomizations.a) clientCustomizations).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeDimensions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions2 = this.dimensions_;
        if (dimensions2 == null || dimensions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions.getDefaultInstance()) {
            this.dimensions_ = dimensions;
        } else {
            this.dimensions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions.newBuilder(this.dimensions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.RenderedAsset.Dimensions.a) dimensions).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeExpiry(com.google.protobuf.Timestamp timestamp) {
        com.google.protobuf.Timestamp timestamp2 = this.expiry_;
        if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
            this.expiry_ = timestamp;
        } else {
            this.expiry_ = com.google.protobuf.Timestamp.newBuilder(this.expiry_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedAsset);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setBytes(com.google.protobuf.ByteString byteString) {
        this.contentCase_ = 6;
        this.content_ = byteString;
    }

    private void setClientCustomizations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.ClientCustomizations clientCustomizations) {
        this.clientCustomizations_ = clientCustomizations;
        this.bitField0_ |= 4;
    }

    private void setDimensions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.Dimensions dimensions) {
        this.dimensions_ = dimensions;
        this.bitField0_ |= 2;
    }

    private void setExpiry(com.google.protobuf.Timestamp timestamp) {
        this.expiry_ = timestamp;
        this.bitField0_ |= 1;
    }

    private void setUrl(java.lang.String str) {
        this.contentCase_ = 5;
        this.content_ = str;
    }

    public final java.lang.String getUrl() {
        return this.contentCase_ == 5 ? (java.lang.String) this.content_ : "";
    }

    public final com.google.protobuf.ByteString getUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.contentCase_ == 5 ? (java.lang.String) this.content_ : "");
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
