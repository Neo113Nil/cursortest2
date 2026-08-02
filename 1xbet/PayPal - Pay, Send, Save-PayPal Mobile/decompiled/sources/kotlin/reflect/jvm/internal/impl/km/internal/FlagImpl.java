package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class FlagImpl {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public FlagImpl(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = i3;
    }

    public final int getBitWidth$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getOffset$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getValue$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<?> flagField, int i) {
        this(flagField.offset, flagField.bitWidth, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagField, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField) {
        this(booleanFlagField, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanFlagField, "");
    }

    public final int plus$kotlin_metadata(int i) {
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        return (i & (~(((1 << i2) - 1) << i3))) + (this.getHighSpeedVideoFpsRanges << i3);
    }

    public final boolean invoke(int i) {
        return ((i >>> this.getHighSpeedVideoFpsRangesFor) & ((1 << this.Camera2StreamConfigurationMap) - 1)) == this.getHighSpeedVideoFpsRanges;
    }
}
