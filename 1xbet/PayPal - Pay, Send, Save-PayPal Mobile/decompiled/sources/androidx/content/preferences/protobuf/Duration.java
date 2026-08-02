package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Duration extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Duration, androidx.datastore.preferences.protobuf.Duration.Builder> implements androidx.content.preferences.protobuf.DurationOrBuilder {
    private static final androidx.content.preferences.protobuf.Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    private Duration() {
    }

    @Override // androidx.content.preferences.protobuf.DurationOrBuilder
    public final long getSeconds() {
        return this.seconds_;
    }

    @Override // androidx.content.preferences.protobuf.DurationOrBuilder
    public final int getNanos() {
        return this.nanos_;
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Duration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Duration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Duration parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Duration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Duration parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Duration) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Duration.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Duration.Builder newBuilder(androidx.content.preferences.protobuf.Duration duration) {
        return DEFAULT_INSTANCE.createBuilder(duration);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Duration, androidx.datastore.preferences.protobuf.Duration.Builder> implements androidx.content.preferences.protobuf.DurationOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Duration.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.DurationOrBuilder
        public final long getSeconds() {
            return ((androidx.content.preferences.protobuf.Duration) this.instance).getSeconds();
        }

        public final androidx.datastore.preferences.protobuf.Duration.Builder setSeconds(long j) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Duration) this.instance).seconds_ = j;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Duration.Builder clearSeconds() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Duration) this.instance).seconds_ = 0L;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.DurationOrBuilder
        public final int getNanos() {
            return ((androidx.content.preferences.protobuf.Duration) this.instance).getNanos();
        }

        public final androidx.datastore.preferences.protobuf.Duration.Builder setNanos(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Duration) this.instance).nanos_ = i;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Duration.Builder clearNanos() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Duration) this.instance).nanos_ = 0;
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Duration$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.Duration.AnonymousClass1.getHighSpeedVideoSizes[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Duration();
            case 2:
                return new androidx.datastore.preferences.protobuf.Duration.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Duration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Duration.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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
        androidx.content.preferences.protobuf.Duration duration = new androidx.content.preferences.protobuf.Duration();
        DEFAULT_INSTANCE = duration;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Duration.class, duration);
    }

    public static androidx.content.preferences.protobuf.Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Duration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
