package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class FieldMask extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.FieldMask, androidx.datastore.preferences.protobuf.FieldMask.Builder> implements androidx.content.preferences.protobuf.FieldMaskOrBuilder {
    private static final androidx.content.preferences.protobuf.FieldMask DEFAULT_INSTANCE;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> paths_ = androidx.content.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();

    private FieldMask() {
    }

    @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
    public final java.util.List<java.lang.String> getPathsList() {
        return this.paths_;
    }

    @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
    public final int getPathsCount() {
        return this.paths_.size();
    }

    @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
    public final java.lang.String getPaths(int i) {
        return this.paths_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getPathsBytes(int i) {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.paths_.get(i));
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.FieldMask parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.FieldMask) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.FieldMask.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.FieldMask.Builder newBuilder(androidx.content.preferences.protobuf.FieldMask fieldMask) {
        return DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.FieldMask, androidx.datastore.preferences.protobuf.FieldMask.Builder> implements androidx.content.preferences.protobuf.FieldMaskOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.FieldMask.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
        public final java.util.List<java.lang.String> getPathsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.FieldMask) this.instance).getPathsList());
        }

        @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
        public final int getPathsCount() {
            return ((androidx.content.preferences.protobuf.FieldMask) this.instance).getPathsCount();
        }

        @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
        public final java.lang.String getPaths(int i) {
            return ((androidx.content.preferences.protobuf.FieldMask) this.instance).getPaths(i);
        }

        @Override // androidx.content.preferences.protobuf.FieldMaskOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getPathsBytes(int i) {
            return ((androidx.content.preferences.protobuf.FieldMask) this.instance).getPathsBytes(i);
        }

        public final androidx.datastore.preferences.protobuf.FieldMask.Builder setPaths(int i, java.lang.String str) {
            copyOnWrite();
            androidx.content.preferences.protobuf.FieldMask.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.FieldMask) this.instance, i, str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldMask.Builder addPaths(java.lang.String str) {
            copyOnWrite();
            androidx.content.preferences.protobuf.FieldMask.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.FieldMask) this.instance, str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldMask.Builder addAllPaths(java.lang.Iterable<java.lang.String> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.FieldMask.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldMask) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldMask.Builder clearPaths() {
            copyOnWrite();
            androidx.content.preferences.protobuf.FieldMask.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.FieldMask) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldMask.Builder addPathsBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.FieldMask.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.FieldMask) this.instance, byteString);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldMask$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.FieldMask.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.FieldMask();
            case 2:
                return new androidx.datastore.preferences.protobuf.FieldMask.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new java.lang.Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.FieldMask> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.FieldMask.class) {
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
        androidx.content.preferences.protobuf.FieldMask fieldMask = new androidx.content.preferences.protobuf.FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.FieldMask.class, fieldMask);
    }

    public static androidx.content.preferences.protobuf.FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.FieldMask fieldMask, int i, java.lang.String str) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = fieldMask.paths_;
        if (!protobufList.isModifiable()) {
            fieldMask.paths_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        fieldMask.paths_.set(i, str);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.FieldMask fieldMask, java.lang.String str) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = fieldMask.paths_;
        if (!protobufList.isModifiable()) {
            fieldMask.paths_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        fieldMask.paths_.add(str);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.FieldMask fieldMask, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = fieldMask.paths_;
        if (!protobufList.isModifiable()) {
            fieldMask.paths_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, fieldMask.paths_);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.FieldMask fieldMask) {
        fieldMask.paths_ = androidx.content.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.FieldMask fieldMask, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = fieldMask.paths_;
        if (!protobufList.isModifiable()) {
            fieldMask.paths_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        fieldMask.paths_.add(byteString.toStringUtf8());
    }
}
