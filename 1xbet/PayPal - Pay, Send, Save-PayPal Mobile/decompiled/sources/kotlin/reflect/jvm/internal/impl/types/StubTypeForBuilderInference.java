package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class StubTypeForBuilderInference extends kotlin.reflect.jvm.internal.impl.types.AbstractStubType implements kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor newTypeVariableConstructor, boolean z, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        super(newTypeVariableConstructor, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newTypeVariableConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        this.Camera2StreamConfigurationMap = typeConstructor;
        this.getHighSpeedVideoFpsRangesFor = newTypeVariableConstructor.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    public final kotlin.reflect.jvm.internal.impl.types.AbstractStubType materialize(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference(getOriginalTypeVariable(), z, getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Stub (BI): ");
        sb.append(getOriginalTypeVariable());
        sb.append(isMarkedNullable() ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION : "");
        return sb.toString();
    }
}
