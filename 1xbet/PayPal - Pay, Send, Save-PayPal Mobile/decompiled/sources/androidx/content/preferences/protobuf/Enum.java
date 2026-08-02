package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Enum extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Enum, androidx.datastore.preferences.protobuf.Enum.Builder> implements androidx.content.preferences.protobuf.EnumOrBuilder {
    private static final androidx.content.preferences.protobuf.Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private androidx.content.preferences.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.EnumValue> enumvalue_ = emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String edition_ = "";

    private Enum() {
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final androidx.content.preferences.protobuf.EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public final androidx.content.preferences.protobuf.EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final androidx.content.preferences.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final androidx.content.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final androidx.content.preferences.protobuf.SourceContext getSourceContext() {
        androidx.content.preferences.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? androidx.content.preferences.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final androidx.content.preferences.protobuf.Syntax getSyntax() {
        androidx.content.preferences.protobuf.Syntax forNumber = androidx.content.preferences.protobuf.Syntax.forNumber(this.syntax_);
        return forNumber == null ? androidx.content.preferences.protobuf.Syntax.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final java.lang.String getEdition() {
        return this.edition_;
    }

    @Override // androidx.content.preferences.protobuf.EnumOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getEditionBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.edition_);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Enum parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Enum parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Enum parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Enum) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Enum.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Enum.Builder newBuilder(androidx.content.preferences.protobuf.Enum r1) {
        return DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Enum, androidx.datastore.preferences.protobuf.Enum.Builder> implements androidx.content.preferences.protobuf.EnumOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Enum.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Enum) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Enum) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Enum) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.EnumValue> getEnumvalueList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Enum) this.instance).getEnumvalueList());
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final int getEnumvalueCount() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getEnumvalueCount();
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final androidx.content.preferences.protobuf.EnumValue getEnumvalue(int i) {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getEnumvalue(i);
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setEnumvalue(int i, androidx.content.preferences.protobuf.EnumValue enumValue) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Enum) this.instance, i, enumValue);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setEnumvalue(int i, androidx.datastore.preferences.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Enum) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(androidx.content.preferences.protobuf.EnumValue enumValue) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, enumValue);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(int i, androidx.content.preferences.protobuf.EnumValue enumValue) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, i, enumValue);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(androidx.datastore.preferences.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(int i, androidx.datastore.preferences.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addAllEnumvalue(java.lang.Iterable<? extends androidx.content.preferences.protobuf.EnumValue> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder clearEnumvalue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getInputSizeshNQ4ISI((androidx.content.preferences.protobuf.Enum) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder removeEnumvalue(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Enum) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Enum) this.instance).getOptionsList());
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final int getOptionsCount() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getOptionsCount();
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final androidx.content.preferences.protobuf.Option getOptions(int i) {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getOptions(i);
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addOptions(androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Enum) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Enum) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder addAllOptions(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Enum) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder clearOptions() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Enum) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder removeOptions(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Enum) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final boolean hasSourceContext() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).hasSourceContext();
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final androidx.content.preferences.protobuf.SourceContext getSourceContext() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getSourceContext();
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setSourceContext(androidx.content.preferences.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Enum) this.instance, sourceContext);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Enum) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder mergeSourceContext(androidx.content.preferences.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, sourceContext);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder clearSourceContext() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Enum) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final int getSyntaxValue() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getSyntaxValue();
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Enum) this.instance).syntax_ = i;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final androidx.content.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getSyntax();
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setSyntax(androidx.content.preferences.protobuf.Syntax syntax) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, syntax);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Enum) this.instance).syntax_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final java.lang.String getEdition() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getEdition();
        }

        @Override // androidx.content.preferences.protobuf.EnumOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getEditionBytes() {
            return ((androidx.content.preferences.protobuf.Enum) this.instance).getEditionBytes();
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setEdition(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Enum) this.instance).edition_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder clearEdition() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Enum.Builder setEditionBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Enum.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Enum) this.instance, byteString);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Enum$1, reason: invalid class name */
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
        switch (androidx.content.preferences.protobuf.Enum.AnonymousClass1.Camera2StreamConfigurationMap[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Enum();
            case 2:
                return new androidx.datastore.preferences.protobuf.Enum.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new java.lang.Object[]{"bitField0_", "name_", "enumvalue_", androidx.content.preferences.protobuf.EnumValue.class, "options_", androidx.content.preferences.protobuf.Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Enum> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Enum.class) {
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
        androidx.content.preferences.protobuf.Enum r0 = new androidx.content.preferences.protobuf.Enum();
        DEFAULT_INSTANCE = r0;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Enum.class, r0);
    }

    public static androidx.content.preferences.protobuf.Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r2, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = r2.options_;
        if (!protobufList.isModifiable()) {
            r2.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.options_.set(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r2, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = r2.options_;
        if (!protobufList.isModifiable()) {
            r2.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.options_.add(option);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Enum r2, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = r2.options_;
        if (!protobufList.isModifiable()) {
            r2.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.options_.add(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Enum r2, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = r2.options_;
        if (!protobufList.isModifiable()) {
            r2.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, r2.options_);
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Enum r1) {
        r1.options_ = emptyProtobufList();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Enum r2, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = r2.options_;
        if (!protobufList.isModifiable()) {
            r2.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.options_.remove(i);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Enum r0, androidx.content.preferences.protobuf.SourceContext sourceContext) {
        r0.sourceContext_ = sourceContext;
        r0.bitField0_ |= 1;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r2, androidx.content.preferences.protobuf.SourceContext sourceContext) {
        androidx.content.preferences.protobuf.SourceContext sourceContext2 = r2.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != androidx.content.preferences.protobuf.SourceContext.getDefaultInstance()) {
            r2.sourceContext_ = androidx.content.preferences.protobuf.SourceContext.newBuilder(r2.sourceContext_).mergeFrom((androidx.datastore.preferences.protobuf.SourceContext.Builder) sourceContext).buildPartial();
        } else {
            r2.sourceContext_ = sourceContext;
        }
        r2.bitField0_ |= 1;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Enum r1) {
        r1.sourceContext_ = null;
        r1.bitField0_ &= -2;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Enum r1) {
        r1.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r0, androidx.content.preferences.protobuf.Syntax syntax) {
        r0.syntax_ = syntax.getNumber();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r1) {
        r1.edition_ = getDefaultInstance().getEdition();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r0, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        r0.edition_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Enum r0, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        r0.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Enum r2, int i, androidx.content.preferences.protobuf.EnumValue enumValue) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.EnumValue> protobufList = r2.enumvalue_;
        if (!protobufList.isModifiable()) {
            r2.enumvalue_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.enumvalue_.set(i, enumValue);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r2, androidx.content.preferences.protobuf.EnumValue enumValue) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.EnumValue> protobufList = r2.enumvalue_;
        if (!protobufList.isModifiable()) {
            r2.enumvalue_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.enumvalue_.add(enumValue);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r2, int i, androidx.content.preferences.protobuf.EnumValue enumValue) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.EnumValue> protobufList = r2.enumvalue_;
        if (!protobufList.isModifiable()) {
            r2.enumvalue_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.enumvalue_.add(i, enumValue);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Enum r2, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.EnumValue> protobufList = r2.enumvalue_;
        if (!protobufList.isModifiable()) {
            r2.enumvalue_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, r2.enumvalue_);
    }

    static /* synthetic */ void getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.Enum r1) {
        r1.enumvalue_ = emptyProtobufList();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Enum r2, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.EnumValue> protobufList = r2.enumvalue_;
        if (!protobufList.isModifiable()) {
            r2.enumvalue_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        r2.enumvalue_.remove(i);
    }
}
