package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$LocalizedString extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.C {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> PARSER = null;
    public static final int TEMPLATED_KEY_FIELD_NUMBER = 3;
    public static final int TRANSLATION_FIELD_NUMBER = 2;
    private int keyOrTranslationCase_ = 0;
    private java.lang.Object keyOrTranslation_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.C {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        KEY(1),
        TRANSLATION(2),
        TEMPLATED_KEY(3),
        KEYORTRANSLATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6136a;

        b(int i) {
            this.f6136a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.b forNumber(int i) {
            if (i == 0) {
                return KEYORTRANSLATION_NOT_SET;
            }
            if (i == 1) {
                return KEY;
            }
            if (i == 2) {
                return TRANSLATION;
            }
            if (i != 3) {
                return null;
            }
            return TEMPLATED_KEY;
        }

        public final int getNumber() {
            return this.f6136a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString();
        DEFAULT_INSTANCE = common$LocalizedString;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class, common$LocalizedString);
    }

    private Common$LocalizedString() {
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

    private void clearTranslation() {
        if (this.keyOrTranslationCase_ == 2) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKeyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 1;
    }

    private void setTranslationBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000", new java.lang.Object[]{"keyOrTranslation_", "keyOrTranslationCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.b getKeyOrTranslationCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.b.forNumber(this.keyOrTranslationCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey getTemplatedKey() {
        return this.keyOrTranslationCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) this.keyOrTranslation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.getDefaultInstance();
    }

    public final boolean hasKey() {
        return this.keyOrTranslationCase_ == 1;
    }

    public final boolean hasTemplatedKey() {
        return this.keyOrTranslationCase_ == 3;
    }

    public final boolean hasTranslation() {
        return this.keyOrTranslationCase_ == 2;
    }

    private void mergeTemplatedKey(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey common$TemplatedKey) {
        if (this.keyOrTranslationCase_ != 3 || this.keyOrTranslation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.getDefaultInstance()) {
            this.keyOrTranslation_ = common$TemplatedKey;
        } else {
            this.keyOrTranslation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey) this.keyOrTranslation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey.a) common$TemplatedKey).buildPartial();
        }
        this.keyOrTranslationCase_ = 3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        return DEFAULT_INSTANCE.createBuilder(common$LocalizedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setKey(java.lang.String str) {
        this.keyOrTranslationCase_ = 1;
        this.keyOrTranslation_ = str;
    }

    private void setTemplatedKey(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey common$TemplatedKey) {
        this.keyOrTranslation_ = common$TemplatedKey;
        this.keyOrTranslationCase_ = 3;
    }

    private void setTranslation(java.lang.String str) {
        this.keyOrTranslationCase_ = 2;
        this.keyOrTranslation_ = str;
    }

    public final java.lang.String getKey() {
        return this.keyOrTranslationCase_ == 1 ? (java.lang.String) this.keyOrTranslation_ : "";
    }

    public final com.google.protobuf.ByteString getKeyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 1 ? (java.lang.String) this.keyOrTranslation_ : "");
    }

    public final java.lang.String getTranslation() {
        return this.keyOrTranslationCase_ == 2 ? (java.lang.String) this.keyOrTranslation_ : "";
    }

    public final com.google.protobuf.ByteString getTranslationBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 2 ? (java.lang.String) this.keyOrTranslation_ : "");
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
