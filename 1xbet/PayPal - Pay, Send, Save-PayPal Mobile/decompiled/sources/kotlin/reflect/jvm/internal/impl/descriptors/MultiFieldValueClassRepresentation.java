package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class MultiFieldValueClassRepresentation<Type extends kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> extends kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<Type> {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, Type> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.Name, Type>> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(java.util.List<? extends kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.Name, ? extends Type>> list) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.toMap(getUnderlyingPropertyNamesToTypes());
    }

    public final java.util.List<kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public final boolean containsPropertyWithName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(name2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=");
        sb.append(getUnderlyingPropertyNamesToTypes());
        sb.append(')');
        return sb.toString();
    }
}
