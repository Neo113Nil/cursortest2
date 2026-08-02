package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class KClassValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value> {
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Companion(null);

    public static abstract class Value {

        public static final class NormalClass extends kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value {
            private final kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue Camera2StreamConfigurationMap;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLiteralValue, "");
                this.Camera2StreamConfigurationMap = classLiteralValue;
            }

            public final kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue getValue() {
                return this.Camera2StreamConfigurationMap;
            }

            public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
                return this.Camera2StreamConfigurationMap.getClassId();
            }

            public final int getArrayDimensions() {
                return this.Camera2StreamConfigurationMap.getArrayNestedness();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NormalClass(value=");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.Camera2StreamConfigurationMap.hashCode();
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) obj).Camera2StreamConfigurationMap);
            }
        }

        private Value() {
        }

        public static final class LocalClass extends kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value {
            private final kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
                this.Camera2StreamConfigurationMap = kotlinType;
            }

            public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                return this.Camera2StreamConfigurationMap;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalClass(type=");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.Camera2StreamConfigurationMap.hashCode();
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) obj).Camera2StreamConfigurationMap);
            }
        }

        public /* synthetic */ Value(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value) {
        super(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
        this(new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass(classLiteralValue));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLiteralValue, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i) {
        this(new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(classId, i));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes empty = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor kClass = moduleDescriptor.getBuiltIns().getKClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kClass, "");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(empty, kClass, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(getArgumentType(moduleDescriptor))));
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getArgumentType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value = getValue();
        if (value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) {
            return ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) getValue()).getType();
        }
        if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue value2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) getValue()).getValue();
        kotlin.reflect.jvm.internal.impl.name.ClassId component1 = value2.component1();
        int component2 = value2.component2();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, component1);
        if (findClassAcrossModuleDependencies == null) {
            return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, component1.toString(), java.lang.String.valueOf(component2));
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsWithStarProjections = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        for (int i = 0; i < component2; i++) {
            replaceArgumentsWithStarProjections = moduleDescriptor.getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, replaceArgumentsWithStarProjections);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaceArgumentsWithStarProjections, "");
        }
        return replaceArgumentsWithStarProjections;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> create(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = kotlinType;
            int i = 0;
            while (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(kotlinType2)) {
                kotlinType2 = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.single((java.util.List) kotlinType2.getArguments())).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kotlinType2, "");
                i++;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType2.getConstructor().mo23898getDeclarationDescriptor();
            if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(mo23898getDeclarationDescriptor);
                return classId == null ? new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass(kotlinType)) : new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(classId, i);
            }
            if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any.toSafe()), 0);
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
