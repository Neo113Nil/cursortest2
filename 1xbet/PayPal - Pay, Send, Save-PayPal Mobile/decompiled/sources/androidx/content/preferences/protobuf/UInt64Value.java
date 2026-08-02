package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class UInt64Value extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.UInt64Value, androidx.datastore.preferences.protobuf.UInt64Value.Builder> implements androidx.content.preferences.protobuf.UInt64ValueOrBuilder {
    private static final androidx.content.preferences.protobuf.UInt64Value DEFAULT_INSTANCE;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.UInt64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    private UInt64Value() {
    }

    @Override // androidx.content.preferences.protobuf.UInt64ValueOrBuilder
    public final long getValue() {
        return this.value_;
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.UInt64Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.UInt64Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.UInt64Value parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.UInt64Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.UInt64Value.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.UInt64Value.Builder newBuilder(androidx.content.preferences.protobuf.UInt64Value uInt64Value) {
        return DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.UInt64Value, androidx.datastore.preferences.protobuf.UInt64Value.Builder> implements androidx.content.preferences.protobuf.UInt64ValueOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.UInt64Value.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.UInt64ValueOrBuilder
        public final long getValue() {
            return ((androidx.content.preferences.protobuf.UInt64Value) this.instance).getValue();
        }

        public final androidx.datastore.preferences.protobuf.UInt64Value.Builder setValue(long j) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.UInt64Value) this.instance).value_ = j;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.UInt64Value.Builder clearValue() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.UInt64Value) this.instance).value_ = 0L;
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.UInt64Value$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.UInt64Value.AnonymousClass1.Camera2StreamConfigurationMap[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.UInt64Value();
            case 2:
                return new androidx.datastore.preferences.protobuf.UInt64Value.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new java.lang.Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.UInt64Value> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.UInt64Value.class) {
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
        androidx.content.preferences.protobuf.UInt64Value uInt64Value = new androidx.content.preferences.protobuf.UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.UInt64Value.class, uInt64Value);
    }

    public static androidx.content.preferences.protobuf.UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.UInt64Value of(long j) {
        return newBuilder().setValue(j).build();
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.UInt64Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
