package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public final class WireFormat {
    static final int Camera2StreamConfigurationMap = 16;
    static final int getHighResolutionOutputSizeshNQ4ISI = 26;
    static final int getHighSpeedVideoFpsRanges = 12;
    static final int getHighSpeedVideoFpsRangesFor = 11;

    static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i & 7;
    }

    static int getHighSpeedVideoFpsRangesFor(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(java.lang.Float.valueOf(0.0f)),
        DOUBLE(java.lang.Double.valueOf(0.0d)),
        BOOLEAN(java.lang.Boolean.FALSE),
        STRING(""),
        BYTE_STRING(kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        JavaType(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }
    }

    public enum FieldType {
        DOUBLE(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE, 1),
        FLOAT(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT, 5),
        INT64(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 0),
        UINT64(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 0),
        INT32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 0),
        FIXED64(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 1),
        FIXED32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 5),
        BOOL(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN, 0),
        STRING { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        GROUP { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.2
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        MESSAGE { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.3
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        BYTES { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.4
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        },
        UINT32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 0),
        ENUM(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM, 0),
        SFIXED32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 5),
        SFIXED64(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 1),
        SINT32(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 0),
        SINT64(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 0);

        private final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        public boolean isPackable() {
            return true;
        }

        /* synthetic */ FieldType(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType javaType, int i, byte b) {
            this(javaType, i);
        }

        FieldType(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType javaType, int i) {
            this.Camera2StreamConfigurationMap = javaType;
            this.getHighSpeedVideoSizes = i;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getJavaType() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getWireType() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
