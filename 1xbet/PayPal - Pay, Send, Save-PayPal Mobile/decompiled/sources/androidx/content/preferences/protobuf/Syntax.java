package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public enum Syntax implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.content.preferences.protobuf.Syntax> getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.content.preferences.protobuf.Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public /* synthetic */ androidx.content.preferences.protobuf.Syntax findValueByNumber(int i) {
            return androidx.content.preferences.protobuf.Syntax.forNumber(i);
        }
    };
    private final int getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @java.lang.Deprecated
    public static androidx.content.preferences.protobuf.Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static androidx.content.preferences.protobuf.Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i == 1) {
            return SYNTAX_PROTO3;
        }
        if (i != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.content.preferences.protobuf.Syntax> internalGetValueMap() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return androidx.datastore.preferences.protobuf.Syntax.SyntaxVerifier.Camera2StreamConfigurationMap;
    }

    static final class SyntaxVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
        static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier Camera2StreamConfigurationMap = new androidx.datastore.preferences.protobuf.Syntax.SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return androidx.content.preferences.protobuf.Syntax.forNumber(i) != null;
        }
    }

    Syntax(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
