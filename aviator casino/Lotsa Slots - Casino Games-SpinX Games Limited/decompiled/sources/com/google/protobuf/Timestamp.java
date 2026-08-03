package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Timestamp extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder> implements com.google.protobuf.TimestampOrBuilder {
    private static final com.google.protobuf.Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    private Timestamp() {
    }

    @Override // com.google.protobuf.TimestampOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long value) {
        this.seconds_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    @Override // com.google.protobuf.TimestampOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int value) {
        this.nanos_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public static com.google.protobuf.Timestamp parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Timestamp parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Timestamp parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Timestamp parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Timestamp parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Timestamp parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Timestamp parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Timestamp parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Timestamp parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Timestamp) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Timestamp parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Timestamp) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Timestamp parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Timestamp parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Timestamp) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Timestamp.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Timestamp.Builder newBuilder(com.google.protobuf.Timestamp prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder> implements com.google.protobuf.TimestampOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Timestamp.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Timestamp.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.TimestampOrBuilder
        public long getSeconds() {
            return ((com.google.protobuf.Timestamp) this.instance).getSeconds();
        }

        public com.google.protobuf.Timestamp.Builder setSeconds(long value) {
            copyOnWrite();
            ((com.google.protobuf.Timestamp) this.instance).setSeconds(value);
            return this;
        }

        public com.google.protobuf.Timestamp.Builder clearSeconds() {
            copyOnWrite();
            ((com.google.protobuf.Timestamp) this.instance).clearSeconds();
            return this;
        }

        @Override // com.google.protobuf.TimestampOrBuilder
        public int getNanos() {
            return ((com.google.protobuf.Timestamp) this.instance).getNanos();
        }

        public com.google.protobuf.Timestamp.Builder setNanos(int value) {
            copyOnWrite();
            ((com.google.protobuf.Timestamp) this.instance).setNanos(value);
            return this;
        }

        public com.google.protobuf.Timestamp.Builder clearNanos() {
            copyOnWrite();
            ((com.google.protobuf.Timestamp) this.instance).clearNanos();
            return this;
        }
    }

    /* renamed from: com.google.protobuf.Timestamp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
        com.google.protobuf.Timestamp.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Timestamp.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.Timestamp();
            case 2:
                return new com.google.protobuf.Timestamp.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Timestamp> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.Timestamp.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
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

    static {
        com.google.protobuf.Timestamp timestamp = new com.google.protobuf.Timestamp();
        DEFAULT_INSTANCE = timestamp;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Timestamp.class, timestamp);
    }

    public static com.google.protobuf.Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Timestamp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
