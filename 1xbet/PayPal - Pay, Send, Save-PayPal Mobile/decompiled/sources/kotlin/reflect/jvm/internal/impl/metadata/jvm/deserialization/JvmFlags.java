package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public final class JvmFlags {
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField getHighSpeedVideoFpsRanges;
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags();
    private static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();

    private JvmFlags() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFirst = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
        getHighSpeedVideoFpsRanges = booleanFirst;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFirst);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
