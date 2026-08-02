package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$TemplatedKey extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey> PARSER = null;
    public static final int REPLACEMENTS_FIELD_NUMBER = 2;
    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> replacements_ = com.google.protobuf.MapFieldLite.emptyMapField();
    private java.lang.String key_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final com.google.protobuf.MapEntryLite<java.lang.String, java.lang.String> f6159a;

        static {
            com.google.protobuf.WireFormat.FieldType fieldType = com.google.protobuf.WireFormat.FieldType.STRING;
            f6159a = com.google.protobuf.MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey common$TemplatedKey = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey();
        DEFAULT_INSTANCE = common$TemplatedKey;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.class, common$TemplatedKey);
    }

    private Common$TemplatedKey() {
    }

    private void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private java.util.Map<java.lang.String, java.lang.String> getMutableReplacementsMap() {
        return internalGetMutableReplacements();
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetMutableReplacements() {
        if (!this.replacements_.isMutable()) {
            this.replacements_ = this.replacements_.mutableCopy();
        }
        return this.replacements_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetReplacements() {
        return this.replacements_;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKeyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new java.lang.Object[]{"key_", "replacements_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.b.f6159a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.class) {
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

    public final java.lang.String getKey() {
        return this.key_;
    }

    public final com.google.protobuf.ByteString getKeyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.key_);
    }

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, java.lang.String> getReplacements() {
        return getReplacementsMap();
    }

    public final int getReplacementsCount() {
        return internalGetReplacements().size();
    }

    public final java.util.Map<java.lang.String, java.lang.String> getReplacementsMap() {
        return java.util.Collections.unmodifiableMap(internalGetReplacements());
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey common$TemplatedKey) {
        return DEFAULT_INSTANCE.createBuilder(common$TemplatedKey);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public final boolean containsReplacements(java.lang.String str) {
        return internalGetReplacements().containsKey(str);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setKey(java.lang.String str) {
        this.key_ = str;
    }

    public final java.lang.String getReplacementsOrDefault(java.lang.String str, java.lang.String str2) {
        com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetReplacements = internalGetReplacements();
        return internalGetReplacements.containsKey(str) ? internalGetReplacements.get(str) : str2;
    }

    public final java.lang.String getReplacementsOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String> internalGetReplacements = internalGetReplacements();
        if (internalGetReplacements.containsKey(str)) {
            return internalGetReplacements.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
