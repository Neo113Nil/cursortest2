package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Type extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Type, androidx.datastore.preferences.protobuf.Type.Builder> implements androidx.content.preferences.protobuf.TypeOrBuilder {
    private static final androidx.content.preferences.protobuf.Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private androidx.content.preferences.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Field> fields_ = emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> oneofs_ = androidx.content.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String edition_ = "";

    private Type() {
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Field> getFieldsList() {
        return this.fields_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.Field getFields(int i) {
        return this.fields_.get(i);
    }

    public final androidx.content.preferences.protobuf.FieldOrBuilder getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final java.util.List<java.lang.String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final java.lang.String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getOneofsBytes(int i) {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.oneofs_.get(i));
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final androidx.content.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.SourceContext getSourceContext() {
        androidx.content.preferences.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? androidx.content.preferences.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.Syntax getSyntax() {
        androidx.content.preferences.protobuf.Syntax forNumber = androidx.content.preferences.protobuf.Syntax.forNumber(this.syntax_);
        return forNumber == null ? androidx.content.preferences.protobuf.Syntax.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final java.lang.String getEdition() {
        return this.edition_;
    }

    @Override // androidx.content.preferences.protobuf.TypeOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getEditionBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.edition_);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Type parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Type parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Type parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Type) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Type.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Type.Builder newBuilder(androidx.content.preferences.protobuf.Type type) {
        return DEFAULT_INSTANCE.createBuilder(type);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Type, androidx.datastore.preferences.protobuf.Type.Builder> implements androidx.content.preferences.protobuf.TypeOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Type.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Type) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Type) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Type) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Field> getFieldsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Type) this.instance).getFieldsList());
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final int getFieldsCount() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getFieldsCount();
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.Field getFields(int i) {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getFields(i);
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setFields(int i, androidx.content.preferences.protobuf.Field field) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, i, field);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setFields(int i, androidx.datastore.preferences.protobuf.Field.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addFields(androidx.content.preferences.protobuf.Field field) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, field);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addFields(int i, androidx.content.preferences.protobuf.Field field) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, i, field);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addFields(androidx.datastore.preferences.protobuf.Field.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addFields(int i, androidx.datastore.preferences.protobuf.Field.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addAllFields(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Field> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Type) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearFields() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoSizesFor((androidx.content.preferences.protobuf.Type) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder removeFields(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Type) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final java.util.List<java.lang.String> getOneofsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Type) this.instance).getOneofsList());
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final int getOneofsCount() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getOneofsCount();
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final java.lang.String getOneofs(int i) {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getOneofs(i);
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getOneofsBytes(int i) {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getOneofsBytes(i);
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setOneofs(int i, java.lang.String str) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Type) this.instance, i, str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addOneofs(java.lang.String str) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addAllOneofs(java.lang.Iterable<java.lang.String> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Type) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearOneofs() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Type) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addOneofsBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Type) this.instance).getOptionsList());
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final int getOptionsCount() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getOptionsCount();
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.Option getOptions(int i) {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getOptions(i);
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addOptions(androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Type) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Type) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder addAllOptions(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Type) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearOptions() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder removeOptions(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final boolean hasSourceContext() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).hasSourceContext();
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.SourceContext getSourceContext() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getSourceContext();
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setSourceContext(androidx.content.preferences.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, sourceContext);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Type) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder mergeSourceContext(androidx.content.preferences.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance, sourceContext);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearSourceContext() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Type) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final int getSyntaxValue() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getSyntaxValue();
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Type) this.instance).syntax_ = i;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getSyntax();
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setSyntax(androidx.content.preferences.protobuf.Syntax syntax) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Type) this.instance, syntax);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Type) this.instance).syntax_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final java.lang.String getEdition() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getEdition();
        }

        @Override // androidx.content.preferences.protobuf.TypeOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getEditionBytes() {
            return ((androidx.content.preferences.protobuf.Type) this.instance).getEditionBytes();
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setEdition(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Type) this.instance).edition_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder clearEdition() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getOutputFormats((androidx.content.preferences.protobuf.Type) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Type.Builder setEditionBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Type.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Type) this.instance, byteString);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Type$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.Type.AnonymousClass1.getHighSpeedVideoFpsRanges[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Type();
            case 2:
                return new androidx.datastore.preferences.protobuf.Type.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new java.lang.Object[]{"bitField0_", "name_", "fields_", androidx.content.preferences.protobuf.Field.class, "oneofs_", "options_", androidx.content.preferences.protobuf.Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Type> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Type.class) {
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
        androidx.content.preferences.protobuf.Type type = new androidx.content.preferences.protobuf.Type();
        DEFAULT_INSTANCE = type;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Type.class, type);
    }

    public static androidx.content.preferences.protobuf.Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Type type, int i, java.lang.String str) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = type.oneofs_;
        if (!protobufList.isModifiable()) {
            type.oneofs_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.oneofs_.set(i, str);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Type type, java.lang.String str) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = type.oneofs_;
        if (!protobufList.isModifiable()) {
            type.oneofs_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.oneofs_.add(str);
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Type type, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = type.oneofs_;
        if (!protobufList.isModifiable()) {
            type.oneofs_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, type.oneofs_);
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Type type) {
        type.oneofs_ = androidx.content.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = type.oneofs_;
        if (!protobufList.isModifiable()) {
            type.oneofs_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.oneofs_.add(byteString.toStringUtf8());
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Type type, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = type.options_;
        if (!protobufList.isModifiable()) {
            type.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.options_.set(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = type.options_;
        if (!protobufList.isModifiable()) {
            type.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.options_.add(option);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Type type, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = type.options_;
        if (!protobufList.isModifiable()) {
            type.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.options_.add(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Type type, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = type.options_;
        if (!protobufList.isModifiable()) {
            type.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, type.options_);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Type type) {
        type.options_ = emptyProtobufList();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Type type) {
        type.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Type type, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = type.options_;
        if (!protobufList.isModifiable()) {
            type.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.options_.remove(i);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.SourceContext sourceContext) {
        type.sourceContext_ = sourceContext;
        type.bitField0_ |= 1;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.SourceContext sourceContext) {
        androidx.content.preferences.protobuf.SourceContext sourceContext2 = type.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != androidx.content.preferences.protobuf.SourceContext.getDefaultInstance()) {
            type.sourceContext_ = androidx.content.preferences.protobuf.SourceContext.newBuilder(type.sourceContext_).mergeFrom((androidx.datastore.preferences.protobuf.SourceContext.Builder) sourceContext).buildPartial();
        } else {
            type.sourceContext_ = sourceContext;
        }
        type.bitField0_ |= 1;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Type type) {
        type.sourceContext_ = null;
        type.bitField0_ &= -2;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.Syntax syntax) {
        type.syntax_ = syntax.getNumber();
    }

    static /* synthetic */ void getOutputFormats(androidx.content.preferences.protobuf.Type type) {
        type.edition_ = getDefaultInstance().getEdition();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        type.edition_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        type.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Type type, int i, androidx.content.preferences.protobuf.Field field) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Field> protobufList = type.fields_;
        if (!protobufList.isModifiable()) {
            type.fields_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.fields_.set(i, field);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Type type, androidx.content.preferences.protobuf.Field field) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Field> protobufList = type.fields_;
        if (!protobufList.isModifiable()) {
            type.fields_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.fields_.add(field);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Type type, int i, androidx.content.preferences.protobuf.Field field) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Field> protobufList = type.fields_;
        if (!protobufList.isModifiable()) {
            type.fields_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.fields_.add(i, field);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Type type, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Field> protobufList = type.fields_;
        if (!protobufList.isModifiable()) {
            type.fields_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, type.fields_);
    }

    static /* synthetic */ void getHighSpeedVideoSizesFor(androidx.content.preferences.protobuf.Type type) {
        type.fields_ = emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Type type, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Field> protobufList = type.fields_;
        if (!protobufList.isModifiable()) {
            type.fields_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        type.fields_.remove(i);
    }
}
