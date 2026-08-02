package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public enum NullValue implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.content.preferences.protobuf.NullValue> getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.content.preferences.protobuf.NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public /* synthetic */ androidx.content.preferences.protobuf.NullValue findValueByNumber(int i) {
            return androidx.content.preferences.protobuf.NullValue.forNumber(i);
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
    public static androidx.content.preferences.protobuf.NullValue valueOf(int i) {
        return forNumber(i);
    }

    public static androidx.content.preferences.protobuf.NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.content.preferences.protobuf.NullValue> internalGetValueMap() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return androidx.datastore.preferences.protobuf.NullValue.NullValueVerifier.Camera2StreamConfigurationMap;
    }

    static final class NullValueVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
        static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier Camera2StreamConfigurationMap = new androidx.datastore.preferences.protobuf.NullValue.NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return androidx.content.preferences.protobuf.NullValue.forNumber(i) != null;
        }
    }

    NullValue(int i) {
        this.getHighSpeedVideoSizes = i;
    }
}
