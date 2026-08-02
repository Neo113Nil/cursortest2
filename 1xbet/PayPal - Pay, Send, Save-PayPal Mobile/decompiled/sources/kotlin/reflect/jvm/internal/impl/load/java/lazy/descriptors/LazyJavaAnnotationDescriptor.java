package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class LazyJavaAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation getOutputMinFrameDuration;

    public LazyJavaAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotation, "");
        this.Camera2StreamConfigurationMap = lazyJavaResolverContext;
        this.getOutputMinFrameDuration = javaAnnotation;
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getInputSizeshNQ4ISI = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getHighSpeedVideoSizesFor = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        this.getOutputFormats = javaAnnotation.isIdeExternalAnnotation();
        this.getHighSpeedVideoSizes = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z;
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i & 4) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.FqName) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRangesFor, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement getSource() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[2]);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument) {
            return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.createConstantValue$default(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE, ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            kotlin.reflect.jvm.internal.impl.name.ClassId enumClassId = javaEnumValueAnnotationArgument.getEnumClassId();
            kotlin.reflect.jvm.internal.impl.name.Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            if (enumClassId == null || entryName == null) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(enumClassId, entryName);
        }
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument javaArrayAnnotationArgument = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) javaAnnotationArgument;
            kotlin.reflect.jvm.internal.impl.name.Name name2 = javaArrayAnnotationArgument.getName();
            if (name2 == null) {
                name2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
            return Camera2StreamConfigurationMap(name2, javaArrayAnnotationArgument.getElements());
        }
        if (!(javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument)) {
            if (!(javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument)) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Companion.create(this.Camera2StreamConfigurationMap.getTypeResolver().transformJavaType(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 7, null)));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation(), false, 4, null));
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> list) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(getType())) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(this);
        kotlin.jvm.internal.Intrinsics.checkNotNull(annotationClass);
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor annotationParameterByName = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(name2, annotationClass);
        if (annotationParameterByName == null || (simpleType = annotationParameterByName.getType()) == null) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = this.Camera2StreamConfigurationMap.getComponents().getModule().getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new java.lang.String[0]));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayType, "");
            simpleType = arrayType;
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument) it.next());
            if (highSpeedVideoFpsRangesFor == null) {
                highSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue();
            }
            arrayList.add(highSpeedVideoFpsRangesFor);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createArrayValue(arrayList, simpleType);
    }

    public final java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.renderAnnotation$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public final boolean isIdeExternalAnnotation() {
        return this.getOutputFormats;
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.getHighSpeedVideoSizes;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = lazyJavaAnnotationDescriptor.getOutputMinFrameDuration.getClassId();
        if (classId != null) {
            return classId.asSingleFqName();
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
        if (fqName == null) {
            return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, lazyJavaAnnotationDescriptor.getOutputMinFrameDuration.toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.mapJavaToKotlin$default(kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaAnnotationDescriptor.Camera2StreamConfigurationMap.getModule().getBuiltIns(), null, 4, null);
        if (mapJavaToKotlin$default == null) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass resolve = lazyJavaAnnotationDescriptor.getOutputMinFrameDuration.resolve();
            mapJavaToKotlin$default = resolve != null ? lazyJavaAnnotationDescriptor.Camera2StreamConfigurationMap.getComponents().getModuleClassResolver().resolveClass(resolve) : null;
            if (mapJavaToKotlin$default == null) {
                mapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(lazyJavaAnnotationDescriptor.Camera2StreamConfigurationMap.getModule(), kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(fqName), lazyJavaAnnotationDescriptor.Camera2StreamConfigurationMap.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
            }
        }
        return mapJavaToKotlin$default.getDefaultType();
    }

    static /* synthetic */ java.util.Map getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.getOutputMinFrameDuration.getArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument javaAnnotationArgument : arguments) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = javaAnnotationArgument.getName();
            if (name2 == null) {
                name2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> highSpeedVideoFpsRangesFor = lazyJavaAnnotationDescriptor.getHighSpeedVideoFpsRangesFor(javaAnnotationArgument);
            kotlin.Pair pair = highSpeedVideoFpsRangesFor != null ? kotlin.TuplesKt.to(name2, highSpeedVideoFpsRangesFor) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }
}
