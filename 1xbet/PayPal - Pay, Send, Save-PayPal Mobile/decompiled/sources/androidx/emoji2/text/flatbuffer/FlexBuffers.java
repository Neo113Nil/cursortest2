package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class FlexBuffers {
    private static final androidx.emoji2.text.flatbuffer.ReadBuf Camera2StreamConfigurationMap = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    static int Camera2StreamConfigurationMap(int i) {
        return i - 10;
    }

    static boolean getHighSpeedVideoFpsRanges(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    static int getHighSpeedVideoFpsRangesFor(int i, int i2) {
        if (i2 == 0) {
            return i + 10;
        }
        if (i2 == 2) {
            return i + 15;
        }
        if (i2 == 3) {
            return i + 18;
        }
        if (i2 != 4) {
            return 0;
        }
        return i + 21;
    }

    static boolean getHighSpeedVideoFpsRangesFor(int i) {
        return i <= 3 || i == 26;
    }

    static boolean getHighSpeedVideoSizes(int i) {
        return (i > 0 && i <= 4) || i == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getHighSpeedVideoSizesFor(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.Camera2StreamConfigurationMap(readBuf.get(i));
        }
        if (i2 == 2) {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.getHighResolutionOutputSizeshNQ4ISI(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.getHighSpeedVideoSizes(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getOutputFormats(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i3 = readBuf.getInt(i);
        }
        return i3;
    }

    @java.lang.Deprecated
    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(java.nio.ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf(byteBuffer));
    }

    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(androidx.emoji2.text.flatbuffer.ReadBuf readBuf) {
        int limit = readBuf.limit();
        byte b = readBuf.get(limit - 1);
        int i = limit - 2;
        return new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(readBuf, i - b, b, androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.Camera2StreamConfigurationMap(readBuf.get(i)));
    }

    public static class Reference {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Reference Camera2StreamConfigurationMap = new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap, 0, 1, 0);
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private androidx.emoji2.text.flatbuffer.ReadBuf getHighSpeedVideoSizes;
        private int getOutputMinFrameDuration;

        Reference(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        Reference(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.getHighSpeedVideoSizes = readBuf;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            this.getOutputMinFrameDuration = i4;
        }

        public int getType() {
            return this.getOutputMinFrameDuration;
        }

        public boolean isNull() {
            return this.getOutputMinFrameDuration == 0;
        }

        public boolean isBoolean() {
            return this.getOutputMinFrameDuration == 26;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isFloat() {
            int i = this.getOutputMinFrameDuration;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.getOutputMinFrameDuration;
            return i == 1 || i == 6;
        }

        public boolean isUInt() {
            int i = this.getOutputMinFrameDuration;
            return i == 2 || i == 7;
        }

        public boolean isString() {
            return this.getOutputMinFrameDuration == 5;
        }

        public boolean isKey() {
            return this.getOutputMinFrameDuration == 4;
        }

        public boolean isVector() {
            int i = this.getOutputMinFrameDuration;
            return i == 10 || i == 9;
        }

        public boolean isTypedVector() {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration);
        }

        public boolean isMap() {
            return this.getOutputMinFrameDuration == 9;
        }

        public boolean isBlob() {
            return this.getOutputMinFrameDuration == 25;
        }

        public int asInt() {
            int i = this.getOutputMinFrameDuration;
            if (i == 1) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 2) {
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 3) {
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 5) {
                return java.lang.Integer.parseInt(asString());
            }
            if (i == 6) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 7) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.getHighSpeedVideoSizes;
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf2, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRanges);
            }
            if (i == 8) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.getHighSpeedVideoSizes;
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }

        public long asUInt() {
            int i = this.getOutputMinFrameDuration;
            if (i == 2) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 1) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getOutputFormats(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 3) {
                return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 5) {
                return java.lang.Long.parseLong(asString());
            }
            if (i == 6) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getOutputFormats(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 7) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.getHighSpeedVideoSizes;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf2, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i != 8) {
                return 0L;
            }
            androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.getHighSpeedVideoSizes;
            return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRanges);
        }

        public long asLong() {
            int i = this.getOutputMinFrameDuration;
            if (i == 1) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getOutputFormats(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 2) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 3) {
                return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 5) {
                try {
                    return java.lang.Long.parseLong(asString());
                } catch (java.lang.NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getOutputFormats(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 7) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.getHighSpeedVideoSizes;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf2, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRanges);
            }
            if (i == 8) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.getHighSpeedVideoSizes;
                return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }

        public double asFloat() {
            int i = this.getOutputMinFrameDuration;
            if (i == 3) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        return java.lang.Double.parseDouble(asString());
                    }
                    if (i == 6) {
                        androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                        return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (i == 7) {
                        androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.getHighSpeedVideoSizes;
                        return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf2, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (i == 8) {
                        androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.getHighSpeedVideoSizes;
                        return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (i == 10) {
                        return asVector().size();
                    }
                    if (i != 26) {
                        return 0.0d;
                    }
                }
                return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key asKey() {
            if (isKey()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Key(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Key.empty();
        }

        public java.lang.String asString() {
            if (isString()) {
                int highSpeedVideoFpsRangesFor = androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                return this.getHighSpeedVideoSizes.getString(highSpeedVideoFpsRangesFor, (int) androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizesFor(readBuf, highSpeedVideoFpsRangesFor - i, i));
            }
            if (isKey()) {
                int highSpeedVideoFpsRangesFor2 = androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                int i2 = highSpeedVideoFpsRangesFor2;
                while (this.getHighSpeedVideoSizes.get(i2) != 0) {
                    i2++;
                }
                return this.getHighSpeedVideoSizes.getString(highSpeedVideoFpsRangesFor2, i2 - highSpeedVideoFpsRangesFor2);
            }
            return "";
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Map asMap() {
            if (isMap()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Map(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Map.empty();
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector asVector() {
            if (isVector()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Vector(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            int i = this.getOutputMinFrameDuration;
            if (i == 15) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.getHighSpeedVideoSizes;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf2, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI, 4);
            }
            if (androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRanges(i)) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.getHighSpeedVideoSizes;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI, androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap(this.getOutputMinFrameDuration));
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.empty();
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Blob asBlob() {
            if (isBlob() || isString()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.getHighSpeedVideoSizes;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Blob(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(readBuf, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.empty();
        }

        public boolean asBoolean() {
            return isBoolean() ? this.getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRangesFor) != 0 : asUInt() != 0;
        }

        public java.lang.String toString() {
            return getHighSpeedVideoFpsRangesFor(new java.lang.StringBuilder(128)).toString();
        }

        final java.lang.StringBuilder getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb) {
            int i = this.getOutputMinFrameDuration;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        androidx.emoji2.text.flatbuffer.FlexBuffers.Key asKey = asKey();
                        sb.append('\"');
                        java.lang.StringBuilder key = asKey.toString(sb);
                        key.append('\"');
                        return key;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("not_implemented:");
                        sb2.append(this.getOutputMinFrameDuration);
                        throw new androidx.emoji2.text.flatbuffer.FlexBuffers.FlexBufferException(sb2.toString());
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    static abstract class Object {
        int Camera2StreamConfigurationMap;
        androidx.emoji2.text.flatbuffer.ReadBuf getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        public abstract java.lang.StringBuilder toString(java.lang.StringBuilder sb);

        Object(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = readBuf;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = i2;
        }

        public java.lang.String toString() {
            return toString(new java.lang.StringBuilder(128)).toString();
        }
    }

    static abstract class Sized extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        protected final int size;

        Sized(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    public static class Blob extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        static final androidx.emoji2.text.flatbuffer.FlexBuffers.Blob getHighSpeedVideoFpsRangesFor = new androidx.emoji2.text.flatbuffer.FlexBuffers.Blob(androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        Blob(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Blob empty() {
            return getHighSpeedVideoFpsRangesFor;
        }

        public java.nio.ByteBuffer data() {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.getHighSpeedVideoFpsRanges.data());
            wrap.position(this.getHighSpeedVideoSizes);
            wrap.limit(this.getHighSpeedVideoSizes + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.getHighSpeedVideoFpsRanges.get(this.getHighSpeedVideoSizes + i);
            }
            return bArr;
        }

        public byte get(int i) {
            return this.getHighSpeedVideoFpsRanges.get(this.getHighSpeedVideoSizes + i);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges.getString(this.getHighSpeedVideoSizes, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append('\"');
            sb.append(this.getHighSpeedVideoFpsRanges.getString(this.getHighSpeedVideoSizes, size()));
            sb.append('\"');
            return sb;
        }
    }

    public static class Key extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Key getHighSpeedVideoFpsRangesFor = new androidx.emoji2.text.flatbuffer.FlexBuffers.Key(androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap, 0, 0);

        Key(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Key empty() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
            int i = this.getHighSpeedVideoSizes;
            while (this.getHighSpeedVideoFpsRanges.get(i) != 0) {
                i++;
            }
            return this.getHighSpeedVideoFpsRanges.getString(this.getHighSpeedVideoSizes, i - this.getHighSpeedVideoSizes);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.emoji2.text.flatbuffer.FlexBuffers.Key)) {
                return false;
            }
            androidx.emoji2.text.flatbuffer.FlexBuffers.Key key = (androidx.emoji2.text.flatbuffer.FlexBuffers.Key) obj;
            return key.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes && key.Camera2StreamConfigurationMap == this.Camera2StreamConfigurationMap;
        }

        public int hashCode() {
            return this.getHighSpeedVideoSizes ^ this.Camera2StreamConfigurationMap;
        }
    }

    public static class Map extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Map getHighResolutionOutputSizeshNQ4ISI = new androidx.emoji2.text.flatbuffer.FlexBuffers.Map(androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap, 1, 1);

        Map(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Map empty() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(java.lang.String str) {
            return get(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(byte[] bArr) {
            int i;
            byte b;
            byte b2;
            androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keys = keys();
            int size = keys.size();
            int size2 = keys.size() - 1;
            int i2 = 0;
            while (true) {
                if (i2 > size2) {
                    i = -(i2 + 1);
                    break;
                }
                i = (i2 + size2) >>> 1;
                androidx.emoji2.text.flatbuffer.FlexBuffers.Key key = keys.get(i);
                int i3 = key.getHighSpeedVideoSizes;
                int i4 = 0;
                do {
                    b = key.getHighSpeedVideoFpsRanges.get(i3);
                    b2 = bArr[i4];
                    if (b == 0) {
                        break;
                    }
                    i3++;
                    i4++;
                    if (i4 == bArr.length) {
                        break;
                    }
                } while (b == b2);
                int i5 = b - b2;
                if (i5 >= 0) {
                    if (i5 <= 0) {
                        break;
                    }
                    size2 = i - 1;
                } else {
                    i2 = i + 1;
                }
            }
            if (i < 0 || i >= size) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.Camera2StreamConfigurationMap;
            }
            return get(i);
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keys() {
            int i = this.getHighSpeedVideoSizes - (this.Camera2StreamConfigurationMap * 3);
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector(new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(this.getHighSpeedVideoFpsRanges, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, i, this.Camera2StreamConfigurationMap), androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, i + this.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap), 4));
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector values() {
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Vector(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append("{ ");
            androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keys = keys();
            int size = size();
            androidx.emoji2.text.flatbuffer.FlexBuffers.Vector values = values();
            for (int i = 0; i < size; i++) {
                sb.append('\"');
                sb.append(keys.get(i).toString());
                sb.append("\" : ");
                sb.append(values.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }
    }

    public static class Vector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Vector getHighSpeedVideoFpsRangesFor = new androidx.emoji2.text.flatbuffer.FlexBuffers.Vector(androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ java.lang.String toString() {
            return super.toString();
        }

        Vector(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Vector empty() {
            return getHighSpeedVideoFpsRangesFor;
        }

        public boolean isEmpty() {
            return this == getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).getHighSpeedVideoFpsRangesFor(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.Camera2StreamConfigurationMap;
            }
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes + (i * this.Camera2StreamConfigurationMap), this.Camera2StreamConfigurationMap, androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.get((int) (this.getHighSpeedVideoSizes + (size * this.Camera2StreamConfigurationMap) + j))));
        }
    }

    public static class TypedVector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector getHighSpeedVideoFpsRangesFor = new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(androidx.emoji2.text.flatbuffer.FlexBuffers.Camera2StreamConfigurationMap, 1, 1, 1);
        private final int getHighResolutionOutputSizeshNQ4ISI;

        TypedVector(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector empty() {
            return getHighSpeedVideoFpsRangesFor;
        }

        public boolean isEmptyVector() {
            return this == getHighSpeedVideoFpsRangesFor;
        }

        public int getElemType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int i) {
            if (i >= size()) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.Camera2StreamConfigurationMap;
            }
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes + (i * this.Camera2StreamConfigurationMap), this.Camera2StreamConfigurationMap, 1, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static class KeyVector {
        private final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector getHighSpeedVideoSizes;

        KeyVector(androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector typedVector) {
            this.getHighSpeedVideoSizes = typedVector;
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key get(int i) {
            if (i >= size()) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Key.getHighSpeedVideoFpsRangesFor;
            }
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Key(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges, androidx.emoji2.text.flatbuffer.FlexBuffers.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getHighSpeedVideoSizes + (i * this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap), this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap), 1);
        }

        public int size() {
            return this.getHighSpeedVideoSizes.size();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
                this.getHighSpeedVideoSizes.get(i).getHighSpeedVideoFpsRangesFor(sb);
                if (i != this.getHighSpeedVideoSizes.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class FlexBufferException extends java.lang.RuntimeException {
        FlexBufferException(java.lang.String str) {
            super(str);
        }
    }

    static class Unsigned {
        static int Camera2StreamConfigurationMap(byte b) {
            return b & 255;
        }

        static int getHighResolutionOutputSizeshNQ4ISI(short s) {
            return s & kotlin.UShort.MAX_VALUE;
        }

        static long getHighSpeedVideoSizes(int i) {
            return i & 4294967295L;
        }

        Unsigned() {
        }
    }

    static /* synthetic */ int getHighSpeedVideoSizes(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        return (int) getOutputFormats(readBuf, i, i2);
    }

    static /* synthetic */ int getHighSpeedVideoFpsRangesFor(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        return (int) (i - getHighSpeedVideoSizesFor(readBuf, i, i2));
    }

    static /* synthetic */ double getHighSpeedVideoFpsRanges(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }
}
