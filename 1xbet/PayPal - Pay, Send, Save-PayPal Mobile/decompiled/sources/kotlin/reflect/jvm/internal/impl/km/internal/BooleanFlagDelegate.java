package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class BooleanFlagDelegate<Node> {
    private final int Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> getHighSpeedVideoSizes;

    public BooleanFlagDelegate(kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> kMutableProperty1, kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        this.getHighSpeedVideoSizes = kMutableProperty1;
        this.getHighSpeedVideoFpsRangesFor = flagImpl;
        if (flagImpl.getBitWidth$kotlin_metadata() != 1 || flagImpl.getValue$kotlin_metadata() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            sb.append(flagImpl);
            sb.append(" was passed");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.Camera2StreamConfigurationMap = 1 << flagImpl.getOffset$kotlin_metadata();
    }

    public final boolean getValue(Node node, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return this.getHighSpeedVideoFpsRangesFor.invoke(this.getHighSpeedVideoSizes.get(node).intValue());
    }

    public final void setValue(Node node, kotlin.reflect.KProperty<?> kProperty, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        int intValue = this.getHighSpeedVideoSizes.get(node).intValue();
        this.getHighSpeedVideoSizes.set(node, java.lang.Integer.valueOf(z ? intValue | this.Camera2StreamConfigurationMap : intValue & (~this.Camera2StreamConfigurationMap)));
    }
}
