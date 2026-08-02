package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class EnumValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<kotlin.Pair<? extends kotlin.reflect.jvm.internal.impl.name.ClassId, ? extends kotlin.reflect.jvm.internal.impl.name.Name>> {
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        super(kotlin.TuplesKt.to(classId, name2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = classId;
        this.getHighSpeedVideoFpsRanges = name2;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getEnumEntryName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, this.getHighResolutionOutputSizeshNQ4ISI);
        if (findClassAcrossModuleDependencies != null) {
            if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumClass(findClassAcrossModuleDependencies)) {
                findClassAcrossModuleDependencies = null;
            }
            if (findClassAcrossModuleDependencies != null && (defaultType = findClassAcrossModuleDependencies.getDefaultType()) != null) {
                return defaultType;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_ENUM_TYPE;
        java.lang.String obj = this.getHighResolutionOutputSizeshNQ4ISI.toString();
        java.lang.String obj2 = this.getHighSpeedVideoFpsRanges.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(errorTypeKind, obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getShortClassName());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }
}
