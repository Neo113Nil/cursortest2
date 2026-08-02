package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public final class WireFormat {
    static final int Camera2StreamConfigurationMap = 16;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int getHighResolutionOutputSizeshNQ4ISI = 11;
    static final int getHighSpeedVideoFpsRanges = 26;
    static final int getHighSpeedVideoFpsRangesFor = 12;

    static int Camera2StreamConfigurationMap(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public static int getTagWireType(int i) {
        return i & 7;
    }

    private WireFormat() {
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(java.lang.Float.valueOf(0.0f)),
        DOUBLE(java.lang.Double.valueOf(0.0d)),
        BOOLEAN(java.lang.Boolean.FALSE),
        STRING(""),
        BYTE_STRING(androidx.content.preferences.protobuf.ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final java.lang.Object getHighSpeedVideoSizes;

        JavaType(java.lang.Object obj) {
            this.getHighSpeedVideoSizes = obj;
        }
    }

    public enum FieldType {
        DOUBLE(androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE, 1),
        FLOAT(androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT, 5),
        INT64(androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 0),
        UINT64(androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 0),
        INT32(androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 0),
        FIXED64(androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 1),
        FIXED32(androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 5),
        BOOL(androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN, 0),
        STRING { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.1
            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        GROUP { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.2
            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        MESSAGE { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.3
            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        BYTES { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.4
            @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        UINT32(androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 0),
        ENUM(androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM, 0),
        SFIXED32(androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 5),
        SFIXED64(androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 1),
        SINT32(androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 0),
        SINT64(androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 0);

        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.datastore.preferences.protobuf.WireFormat.JavaType getHighSpeedVideoFpsRangesFor;

        public boolean isPackable() {
            return true;
        }

        /* synthetic */ FieldType(androidx.datastore.preferences.protobuf.WireFormat.JavaType javaType, int i, byte b) {
            this(javaType, i);
        }

        FieldType(androidx.datastore.preferences.protobuf.WireFormat.JavaType javaType, int i) {
            this.getHighSpeedVideoFpsRangesFor = javaType;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public androidx.datastore.preferences.protobuf.WireFormat.JavaType getJavaType() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public int getWireType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* loaded from: classes7.dex */
    enum Utf8Validation {
        LOOSE { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            final java.lang.Object getHighSpeedVideoSizes(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return codedInputStream.readString();
            }
        },
        STRICT { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            final java.lang.Object getHighSpeedVideoSizes(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return codedInputStream.readStringRequireUtf8();
            }
        },
        LAZY { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            final java.lang.Object getHighSpeedVideoSizes(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return codedInputStream.readBytes();
            }
        };

        abstract java.lang.Object getHighSpeedVideoSizes(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException;

        /* synthetic */ Utf8Validation(byte b) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation utf8Validation) throws java.io.IOException {
        switch (androidx.content.preferences.protobuf.WireFormat.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(codedInputStream.readDouble());
            case 2:
                return java.lang.Float.valueOf(codedInputStream.readFloat());
            case 3:
                return java.lang.Long.valueOf(codedInputStream.readInt64());
            case 4:
                return java.lang.Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return java.lang.Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return java.lang.Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return java.lang.Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return java.lang.Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readBytes();
            case 10:
                return java.lang.Integer.valueOf(codedInputStream.readUInt32());
            case 11:
                return java.lang.Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                return java.lang.Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                return java.lang.Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                return java.lang.Long.valueOf(codedInputStream.readSInt64());
            case 15:
                return utf8Validation.getHighSpeedVideoSizes(codedInputStream);
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
