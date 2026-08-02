package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class NotNullTypeParameterImpl extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType implements kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean isTypeParameter() {
        return true;
    }

    public NotNullTypeParameterImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        this.getHighSpeedVideoFpsRanges = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType substitutionResult(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType = unwrap;
        if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(unwrappedType) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unwrappedType)) {
            return unwrappedType;
        }
        if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
            if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap;
            kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound = flexibleType.getLowerBound();
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl makeNullableAsSpecified = lowerBound.makeNullableAsSpecified(false);
            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(lowerBound)) {
                makeNullableAsSpecified = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl(makeNullableAsSpecified);
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound = flexibleType.getUpperBound();
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl makeNullableAsSpecified2 = upperBound.makeNullableAsSpecified(false);
            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(upperBound)) {
                makeNullableAsSpecified2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl(makeNullableAsSpecified2);
            }
            return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(makeNullableAsSpecified, makeNullableAsSpecified2), kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.getEnhancement(unwrappedType));
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl makeNullableAsSpecified3 = simpleType.makeNullableAsSpecified(false);
        if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(simpleType)) {
            makeNullableAsSpecified3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl(makeNullableAsSpecified3);
        }
        return makeNullableAsSpecified3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl(getDelegate().replaceAttributes(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl(simpleType);
    }
}
