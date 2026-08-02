package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class EnumFlagDelegate<Node, E extends java.lang.Enum<E>> {
    private final kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> Camera2StreamConfigurationMap;
    private final kotlin.enums.EnumEntries<E> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<? extends kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite> getHighSpeedVideoSizes;

    public EnumFlagDelegate(kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> kMutableProperty1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<? extends kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite> flagField, kotlin.enums.EnumEntries<E> enumEntries, java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumEntries, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = kMutableProperty1;
        this.getHighSpeedVideoSizes = flagField;
        this.getHighResolutionOutputSizeshNQ4ISI = enumEntries;
        this.getHighSpeedVideoFpsRanges = list;
    }

    public final E getValue(Node node, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return (E) this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoSizes.get(this.Camera2StreamConfigurationMap.get(node).intValue()).getNumber());
    }

    public final void setValue(Node node, kotlin.reflect.KProperty<?> kProperty, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        this.Camera2StreamConfigurationMap.set(node, java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.get(e.ordinal()).plus$kotlin_metadata(this.Camera2StreamConfigurationMap.get(node).intValue())));
    }
}
