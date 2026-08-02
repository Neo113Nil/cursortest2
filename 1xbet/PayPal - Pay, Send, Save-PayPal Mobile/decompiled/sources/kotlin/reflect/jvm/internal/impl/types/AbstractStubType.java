package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class AbstractStubType extends kotlin.reflect.jvm.internal.impl.types.SimpleType {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractStubType.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.AbstractStubType.Companion(null);
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRanges;

    public abstract kotlin.reflect.jvm.internal.impl.types.AbstractStubType materialize(boolean z);

    public AbstractStubType(kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor newTypeVariableConstructor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newTypeVariableConstructor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = newTypeVariableConstructor;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.STUB_TYPE_SCOPE, newTypeVariableConstructor.toString());
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor getOriginalTypeVariable() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : materialize(z);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.AbstractStubType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }
}
