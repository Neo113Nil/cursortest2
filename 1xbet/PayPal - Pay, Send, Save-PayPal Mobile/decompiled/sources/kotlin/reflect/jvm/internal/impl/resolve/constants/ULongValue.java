package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class ULongValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.UnsignedValueConstant<java.lang.Long> {
    public ULongValue(long j) {
        super(java.lang.Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.uLong);
        return (findClassAcrossModuleDependencies == null || (defaultType = findClassAcrossModuleDependencies.getDefaultType()) == null) ? kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : defaultType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getValue().longValue());
        sb.append(".toULong()");
        return sb.toString();
    }
}
