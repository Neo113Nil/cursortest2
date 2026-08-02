package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Touchable extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 2;
    public static final int COMPONENT_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable> PARSER;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction actionOverride_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent component_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable common$Touchable) {
        return DEFAULT_INSTANCE.createBuilder(common$Touchable);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasComponent() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasActionOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getComponent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent = this.component_;
        return common$FlexibleComponent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.getDefaultInstance() : common$FlexibleComponent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getActionOverride() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "component_", "actionOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.class) {
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

    private void setComponent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        this.component_ = common$FlexibleComponent;
        this.bitField0_ |= 1;
    }

    private void setActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeComponent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent2 = this.component_;
        if (common$FlexibleComponent2 != null && common$FlexibleComponent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.getDefaultInstance()) {
            common$FlexibleComponent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.newBuilder(this.component_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.a) common$FlexibleComponent).buildPartial();
        }
        this.component_ = common$FlexibleComponent;
        this.bitField0_ |= 1;
    }

    private void mergeActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 != null && common$LocalAction2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            common$LocalAction = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearComponent() {
        this.component_ = null;
        this.bitField0_ &= -2;
    }

    private void clearActionOverride() {
        this.actionOverride_ = null;
        this.bitField0_ &= -3;
    }

    private Common$Touchable() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable common$Touchable = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable();
        DEFAULT_INSTANCE = common$Touchable;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.class, common$Touchable);
    }
}
