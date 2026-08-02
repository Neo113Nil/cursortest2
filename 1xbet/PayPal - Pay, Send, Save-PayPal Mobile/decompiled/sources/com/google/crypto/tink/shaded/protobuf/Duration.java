package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class Duration extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Duration, com.google.crypto.tink.shaded.protobuf.Duration.Builder> implements com.google.crypto.tink.shaded.protobuf.DurationOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    private Duration() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.DurationOrBuilder
    public final long getSeconds() {
        return this.seconds_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long j) {
        this.seconds_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.DurationOrBuilder
    public final int getNanos() {
        return this.nanos_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Duration) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Duration duration) {
        return DEFAULT_INSTANCE.createBuilder(duration);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Duration, com.google.crypto.tink.shaded.protobuf.Duration.Builder> implements com.google.crypto.tink.shaded.protobuf.DurationOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Duration.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.Duration.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.DurationOrBuilder
        public final long getSeconds() {
            return ((com.google.crypto.tink.shaded.protobuf.Duration) this.instance).getSeconds();
        }

        public final com.google.crypto.tink.shaded.protobuf.Duration.Builder setSeconds(long j) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Duration) this.instance).setSeconds(j);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Duration.Builder clearSeconds() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Duration) this.instance).clearSeconds();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.DurationOrBuilder
        public final int getNanos() {
            return ((com.google.crypto.tink.shaded.protobuf.Duration) this.instance).getNanos();
        }

        public final com.google.crypto.tink.shaded.protobuf.Duration.Builder setNanos(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Duration) this.instance).setNanos(i);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Duration.Builder clearNanos() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Duration) this.instance).clearNanos();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Duration$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.shaded.protobuf.Duration.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.Duration.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.Duration();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.Duration.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Duration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.Duration.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    static {
        com.google.crypto.tink.shaded.protobuf.Duration duration = new com.google.crypto.tink.shaded.protobuf.Duration();
        DEFAULT_INSTANCE = duration;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.Duration.class, duration);
    }

    public static com.google.crypto.tink.shaded.protobuf.Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Duration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
