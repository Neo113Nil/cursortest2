package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public final class ReflectionTypes {
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup getOutputFormats;
    private final kotlin.Lazy getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses getOutputStallDurationlomOqCM;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};
    public static final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion(null);

    public ReflectionTypes(final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        this.getOutputStallDurationlomOqCM = notFoundClasses;
        this.getOutputMinFrameDuration = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(moduleDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope;
                memberScope = this.getHighSpeedVideoSizes.getPackage(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
                return memberScope;
            }

            {
                this.getHighSpeedVideoSizes = moduleDescriptor;
            }
        });
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.getInputFormats = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.getHighSpeedVideoSizesFor = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.getOutputFormats = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(2);
        this.getInputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(3);
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(1);
        this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(2);
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup(3);
    }

    static final class ClassLookup {
        final int getHighSpeedVideoSizes;

        public ClassLookup(int i) {
            this.getHighSpeedVideoSizes = i;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getKClass() {
        kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.ClassLookup classLookup = this.Camera2StreamConfigurationMap;
        kotlin.reflect.KProperty<java.lang.Object> kProperty = getHighSpeedVideoFpsRanges[0];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return access$find(this, kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.capitalizeAsciiOnly(kProperty.getGetHighSpeedVideoFpsRanges()), classLookup.getHighSpeedVideoSizes);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType createKPropertyStarType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.kProperty);
            if (findClassAcrossModuleDependencies == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.types.TypeAttributes empty = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = findClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
            java.lang.Object single = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) parameters);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(single, "");
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(empty, findClassAcrossModuleDependencies, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) single)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor access$find(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes reflectionTypes, java.lang.String str, int i) {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) reflectionTypes.getOutputMinFrameDuration.getValue()).mo23899getContributedClassifier(identifier, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier : null;
        return classDescriptor == null ? reflectionTypes.getOutputStallDurationlomOqCM.getClass(new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.KOTLIN_REFLECT_FQ_NAME, identifier), kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(i))) : classDescriptor;
    }
}
