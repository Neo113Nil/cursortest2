package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class InlineClassRepresentation<Type extends kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> extends kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<Type> {
    private final Type getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(kotlin.reflect.jvm.internal.impl.name.Name name2, Type type) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoFpsRangesFor = name2;
        this.getHighResolutionOutputSizeshNQ4ISI = type;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getUnderlyingPropertyName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final Type getUnderlyingType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public final boolean containsPropertyWithName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, name2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InlineClassRepresentation(underlyingPropertyName=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", underlyingType=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }
}
