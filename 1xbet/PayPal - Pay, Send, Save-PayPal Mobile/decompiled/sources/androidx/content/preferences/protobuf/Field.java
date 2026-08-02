package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Field extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Field, androidx.datastore.preferences.protobuf.Field.Builder> implements androidx.content.preferences.protobuf.FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final androidx.content.preferences.protobuf.Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private java.lang.String name_ = "";
    private java.lang.String typeUrl_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String jsonName_ = "";
    private java.lang.String defaultValue_ = "";

    private Field() {
    }

    public enum Kind implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Kind> getHighSpeedVideoSizes = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Kind>() { // from class: androidx.datastore.preferences.protobuf.Field.Kind.1
            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
            public /* synthetic */ androidx.datastore.preferences.protobuf.Field.Kind findValueByNumber(int i) {
                return androidx.datastore.preferences.protobuf.Field.Kind.forNumber(i);
            }
        };
        private final int getHighSpeedVideoFpsRanges;

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.getHighSpeedVideoFpsRanges;
        }

        @java.lang.Deprecated
        public static androidx.datastore.preferences.protobuf.Field.Kind valueOf(int i) {
            return forNumber(i);
        }

        public static androidx.datastore.preferences.protobuf.Field.Kind forNumber(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Kind> internalGetValueMap() {
            return getHighSpeedVideoSizes;
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return androidx.datastore.preferences.protobuf.Field.Kind.KindVerifier.getHighSpeedVideoFpsRangesFor;
        }

        static final class KindVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
            static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.Field.Kind.KindVerifier();

            private KindVerifier() {
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return androidx.datastore.preferences.protobuf.Field.Kind.forNumber(i) != null;
            }
        }

        Kind(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    public enum Cardinality implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Cardinality> getHighResolutionOutputSizeshNQ4ISI = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Cardinality>() { // from class: androidx.datastore.preferences.protobuf.Field.Cardinality.1
            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
            public /* synthetic */ androidx.datastore.preferences.protobuf.Field.Cardinality findValueByNumber(int i) {
                return androidx.datastore.preferences.protobuf.Field.Cardinality.forNumber(i);
            }
        };
        private final int getHighSpeedVideoSizes;

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.getHighSpeedVideoSizes;
        }

        @java.lang.Deprecated
        public static androidx.datastore.preferences.protobuf.Field.Cardinality valueOf(int i) {
            return forNumber(i);
        }

        public static androidx.datastore.preferences.protobuf.Field.Cardinality forNumber(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Cardinality> internalGetValueMap() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return androidx.datastore.preferences.protobuf.Field.Cardinality.CardinalityVerifier.Camera2StreamConfigurationMap;
        }

        static final class CardinalityVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
            static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier Camera2StreamConfigurationMap = new androidx.datastore.preferences.protobuf.Field.Cardinality.CardinalityVerifier();

            private CardinalityVerifier() {
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return androidx.datastore.preferences.protobuf.Field.Cardinality.forNumber(i) != null;
            }
        }

        Cardinality(int i) {
            this.getHighSpeedVideoSizes = i;
        }
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final int getKindValue() {
        return this.kind_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.datastore.preferences.protobuf.Field.Kind getKind() {
        androidx.datastore.preferences.protobuf.Field.Kind forNumber = androidx.datastore.preferences.protobuf.Field.Kind.forNumber(this.kind_);
        return forNumber == null ? androidx.datastore.preferences.protobuf.Field.Kind.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.datastore.preferences.protobuf.Field.Cardinality getCardinality() {
        androidx.datastore.preferences.protobuf.Field.Cardinality forNumber = androidx.datastore.preferences.protobuf.Field.Cardinality.forNumber(this.cardinality_);
        return forNumber == null ? androidx.datastore.preferences.protobuf.Field.Cardinality.UNRECOGNIZED : forNumber;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final java.lang.String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getTypeUrlBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.typeUrl_);
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final boolean getPacked() {
        return this.packed_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.content.preferences.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final androidx.content.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final java.lang.String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getJsonNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.jsonName_);
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final java.lang.String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.content.preferences.protobuf.FieldOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getDefaultValueBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.defaultValue_);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Field parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Field) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Field parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Field) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Field parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Field) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Field.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Field.Builder newBuilder(androidx.content.preferences.protobuf.Field field) {
        return DEFAULT_INSTANCE.createBuilder(field);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Field, androidx.datastore.preferences.protobuf.Field.Builder> implements androidx.content.preferences.protobuf.FieldOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Field.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final int getKindValue() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getKindValue();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setKindValue(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).kind_ = i;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.datastore.preferences.protobuf.Field.Kind getKind() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getKind();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setKind(androidx.datastore.preferences.protobuf.Field.Kind kind) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance, kind);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearKind() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).kind_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final int getCardinalityValue() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getCardinalityValue();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setCardinalityValue(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).cardinality_ = i;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.datastore.preferences.protobuf.Field.Cardinality getCardinality() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getCardinality();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setCardinality(androidx.datastore.preferences.protobuf.Field.Cardinality cardinality) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Field) this.instance, cardinality);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearCardinality() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).cardinality_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final int getNumber() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getNumber();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setNumber(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).number_ = i;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearNumber() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).number_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Field) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Field) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final java.lang.String getTypeUrl() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getTypeUrl();
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getTypeUrlBytes() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getTypeUrlBytes();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).typeUrl_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearTypeUrl() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Field) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setTypeUrlBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Field) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final int getOneofIndex() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getOneofIndex();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setOneofIndex(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).oneofIndex_ = i;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearOneofIndex() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).oneofIndex_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final boolean getPacked() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getPacked();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setPacked(boolean z) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).packed_ = z;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearPacked() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).packed_ = false;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Field) this.instance).getOptionsList());
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final int getOptionsCount() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getOptionsCount();
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.content.preferences.protobuf.Option getOptions(int i) {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getOptions(i);
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder addOptions(androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder addOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Field) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder addOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Field) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder addAllOptions(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Field) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearOptions() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder removeOptions(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Field) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final java.lang.String getJsonName() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getJsonName();
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getJsonNameBytes() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getJsonNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setJsonName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).jsonName_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearJsonName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getOutputMinFrameDuration((androidx.content.preferences.protobuf.Field) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setJsonNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final java.lang.String getDefaultValue() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getDefaultValue();
        }

        @Override // androidx.content.preferences.protobuf.FieldOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getDefaultValueBytes() {
            return ((androidx.content.preferences.protobuf.Field) this.instance).getDefaultValueBytes();
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setDefaultValue(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Field) this.instance).defaultValue_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder clearDefaultValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.getInputSizeshNQ4ISI((androidx.content.preferences.protobuf.Field) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Field.Builder setDefaultValueBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Field.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Field) this.instance, byteString);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Field$1, reason: invalid class name */
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
        switch (androidx.content.preferences.protobuf.Field.AnonymousClass1.getHighSpeedVideoFpsRanges[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Field();
            case 2:
                return new androidx.datastore.preferences.protobuf.Field.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new java.lang.Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", androidx.content.preferences.protobuf.Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Field> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Field.class) {
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
        androidx.content.preferences.protobuf.Field field = new androidx.content.preferences.protobuf.Field();
        DEFAULT_INSTANCE = field;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Field.class, field);
    }

    public static androidx.content.preferences.protobuf.Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Field field) {
        field.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Field field, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        field.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Field field) {
        field.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Field field, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        field.typeUrl_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Field field, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = field.options_;
        if (!protobufList.isModifiable()) {
            field.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        field.options_.set(i, option);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Field field, androidx.datastore.preferences.protobuf.Field.Kind kind) {
        field.kind_ = kind.getNumber();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Field field, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = field.options_;
        if (!protobufList.isModifiable()) {
            field.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        field.options_.add(option);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Field field, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = field.options_;
        if (!protobufList.isModifiable()) {
            field.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        field.options_.add(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Field field, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = field.options_;
        if (!protobufList.isModifiable()) {
            field.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, field.options_);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Field field) {
        field.options_ = emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Field field, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = field.options_;
        if (!protobufList.isModifiable()) {
            field.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        field.options_.remove(i);
    }

    static /* synthetic */ void getOutputMinFrameDuration(androidx.content.preferences.protobuf.Field field) {
        field.jsonName_ = getDefaultInstance().getJsonName();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Field field, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        field.jsonName_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.Field field) {
        field.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Field field, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        field.defaultValue_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Field field, androidx.datastore.preferences.protobuf.Field.Cardinality cardinality) {
        field.cardinality_ = cardinality.getNumber();
    }
}
