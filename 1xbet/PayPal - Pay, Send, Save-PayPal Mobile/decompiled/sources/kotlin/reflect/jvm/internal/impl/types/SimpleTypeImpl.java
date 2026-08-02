package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
final class SimpleTypeImpl extends kotlin.reflect.jvm.internal.impl.types.SimpleType {
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTypeImpl(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, ? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = typeConstructor;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = memberScope;
        this.getHighSpeedVideoSizes = function1;
        if (!(getMemberScope() instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorScope) || (getMemberScope() instanceof kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SimpleTypeImpl should not be created for error type: ");
        sb.append(getMemberScope());
        sb.append('\n');
        sb.append(getConstructor());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        if (typeAttributes.isEmpty()) {
            return this;
        }
        return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithAttributes(this, typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        if (z) {
            return new kotlin.reflect.jvm.internal.impl.types.NullableSimpleType(this);
        }
        return new kotlin.reflect.jvm.internal.impl.types.NotNullSimpleType(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.types.SimpleType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType invoke = this.getHighSpeedVideoSizes.invoke(kotlinTypeRefiner);
        return invoke == null ? this : invoke;
    }
}
