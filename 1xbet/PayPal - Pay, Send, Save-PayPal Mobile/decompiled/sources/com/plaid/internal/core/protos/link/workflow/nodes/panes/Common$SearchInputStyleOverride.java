package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SearchInputStyleOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACTIVE_BORDER_COLOR_FIELD_NUMBER = 2;
    public static final int BORDER_RADIUS_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride> PARSER;
    private com.google.protobuf.StringValue activeBorderColor_;
    private int bitField0_;
    private com.google.protobuf.Int64Value borderRadius_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride common$SearchInputStyleOverride = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride();
        DEFAULT_INSTANCE = common$SearchInputStyleOverride;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.class, common$SearchInputStyleOverride);
    }

    private Common$SearchInputStyleOverride() {
    }

    private void clearActiveBorderColor() {
        this.activeBorderColor_ = null;
        this.bitField0_ &= -3;
    }

    private void clearBorderRadius() {
        this.borderRadius_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "borderRadius_", "activeBorderColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.class) {
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

    public final com.google.protobuf.StringValue getActiveBorderColor() {
        com.google.protobuf.StringValue stringValue = this.activeBorderColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.Int64Value getBorderRadius() {
        com.google.protobuf.Int64Value int64Value = this.borderRadius_;
        return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
    }

    public final boolean hasActiveBorderColor() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasBorderRadius() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeActiveBorderColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.activeBorderColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.activeBorderColor_ = stringValue;
        } else {
            this.activeBorderColor_ = com.google.protobuf.StringValue.newBuilder(this.activeBorderColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeBorderRadius(com.google.protobuf.Int64Value int64Value) {
        com.google.protobuf.Int64Value int64Value2 = this.borderRadius_;
        if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
            this.borderRadius_ = int64Value;
        } else {
            this.borderRadius_ = com.google.protobuf.Int64Value.newBuilder(this.borderRadius_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride common$SearchInputStyleOverride) {
        return DEFAULT_INSTANCE.createBuilder(common$SearchInputStyleOverride);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setActiveBorderColor(com.google.protobuf.StringValue stringValue) {
        this.activeBorderColor_ = stringValue;
        this.bitField0_ |= 2;
    }

    private void setBorderRadius(com.google.protobuf.Int64Value int64Value) {
        this.borderRadius_ = int64Value;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
