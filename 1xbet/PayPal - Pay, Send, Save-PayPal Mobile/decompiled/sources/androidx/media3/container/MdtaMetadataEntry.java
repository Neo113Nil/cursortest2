package androidx.media3.container;

/* loaded from: classes7.dex */
public final class MdtaMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public static final byte AUXILIARY_TRACKS_SAMPLES_INTERLEAVED = 1;
    public static final byte AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED = 0;
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final java.lang.String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_INTERLEAVED = "auxiliary.tracks.interleaved";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_LENGTH = "auxiliary.tracks.length";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_MAP = "auxiliary.tracks.map";
    public static final java.lang.String KEY_AUXILIARY_TRACKS_OFFSET = "auxiliary.tracks.offset";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final java.lang.String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(java.lang.String str, byte[] bArr, int i) {
        this(str, bArr, 0, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public MdtaMetadataEntry(java.lang.String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals(KEY_ANDROID_CAPTURE_FPS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals(KEY_AUXILIARY_TRACKS_INTERLEAVED)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals(KEY_AUXILIARY_TRACKS_LENGTH)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals(KEY_AUXILIARY_TRACKS_OFFSET)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals(KEY_AUXILIARY_TRACKS_MAP)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            com.google.common.base.Preconditions.checkArgument(i2 == 23 && bArr.length == 4);
        } else if (c == 1) {
            if (i2 != 75 || bArr.length != 1 || ((b = bArr[0]) != 0 && b != 1)) {
                r4 = false;
            }
            com.google.common.base.Preconditions.checkArgument(r4);
        } else if (c == 2 || c == 3) {
            com.google.common.base.Preconditions.checkArgument(i2 == 78 && bArr.length == 8);
        } else if (c == 4) {
            com.google.common.base.Preconditions.checkArgument(i2 == 0);
        }
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    public final java.util.List<java.lang.Integer> getAuxiliaryTrackTypesFromMap() {
        com.google.common.base.Preconditions.checkState(this.key.equals(KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte b = this.value[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(java.lang.Integer.valueOf(this.value[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = (androidx.media3.container.MdtaMetadataEntry) obj;
        return this.key.equals(mdtaMetadataEntry.key) && java.util.Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator;
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode();
        return ((((((hashCode + 527) * 31) + java.util.Arrays.hashCode(this.value)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        int i = this.typeIndicator;
        if (i == 0) {
            if (this.key.equals(KEY_AUXILIARY_TRACKS_MAP)) {
                java.util.List<java.lang.Integer> auxiliaryTrackTypesFromMap = getAuxiliaryTrackTypesFromMap();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("track types = ");
                com.google.common.base.Joiner.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).appendTo(sb, (java.lang.Iterable<?>) auxiliaryTrackTypesFromMap);
                obj = sb.toString();
            }
            obj = androidx.media3.common.util.Util.toHexString(this.value);
        } else if (i == 1) {
            obj = androidx.media3.common.util.Util.fromUtf8Bytes(this.value);
        } else if (i == 23) {
            obj = java.lang.String.valueOf(java.lang.Float.intBitsToFloat(com.google.common.primitives.Ints.fromByteArray(this.value)));
        } else if (i == 67) {
            obj = java.lang.String.valueOf(com.google.common.primitives.Ints.fromByteArray(this.value));
        } else if (i == 75) {
            obj = java.lang.String.valueOf(java.lang.Byte.toUnsignedInt(this.value[0]));
        } else {
            if (i == 78) {
                obj = java.lang.String.valueOf(new androidx.media3.common.util.ParsableByteArray(this.value).readUnsignedLongToLong());
            }
            obj = androidx.media3.common.util.Util.toHexString(this.value);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mdta: key=");
        sb2.append(this.key);
        sb2.append(", value=");
        sb2.append(obj);
        return sb2.toString();
    }
}
