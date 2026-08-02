package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public final class JavaAnnotationTargetMapper {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper();
    private static final java.util.Map<java.lang.String, java.util.EnumSet<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget>> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("PACKAGE", java.util.EnumSet.noneOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.class)), kotlin.TuplesKt.to("TYPE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.CLASS, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FILE)), kotlin.TuplesKt.to("ANNOTATION_TYPE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.ANNOTATION_CLASS)), kotlin.TuplesKt.to("TYPE_PARAMETER", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.TYPE_PARAMETER)), kotlin.TuplesKt.to("FIELD", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FIELD)), kotlin.TuplesKt.to("LOCAL_VARIABLE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.LOCAL_VARIABLE)), kotlin.TuplesKt.to("PARAMETER", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.VALUE_PARAMETER)), kotlin.TuplesKt.to("CONSTRUCTOR", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.CONSTRUCTOR)), kotlin.TuplesKt.to("METHOD", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FUNCTION, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.PROPERTY_GETTER, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.PROPERTY_SETTER)), kotlin.TuplesKt.to("TYPE_USE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.TYPE)));
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention> getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("RUNTIME", kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.RUNTIME), kotlin.TuplesKt.to("CLASS", kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.BINARY), kotlin.TuplesKt.to("SOURCE", kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.SOURCE));

    private JavaAnnotationTargetMapper() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> mapJavaTargetArgumentByName(java.lang.String str) {
        java.util.EnumSet<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> enumSet = getHighSpeedVideoSizes.get(str);
        return enumSet != null ? enumSet : kotlin.collections.SetsKt.emptySet();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            kotlin.reflect.jvm.internal.impl.name.Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            kotlin.collections.CollectionsKt.addAll(arrayList2, javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget : arrayList3) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.annotationTarget);
            kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlinTarget.name());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
            arrayList4.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, identifier));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(arrayList4, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj2) {
                return kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) obj2);
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument javaAnnotationArgument) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue enumValue = null;
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument ? (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument != null) {
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention> map = getHighSpeedVideoFpsRangesFor;
            kotlin.reflect.jvm.internal.impl.name.Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention kotlinRetention = map.get(entryName != null ? entryName.asString() : null);
            if (kotlinRetention != null) {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.annotationRetention);
                kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlinRetention.name());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                enumValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, identifier);
            }
        }
        return enumValue;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor annotationParameterByName = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), moduleDescriptor.getBuiltIns().getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.target));
        return (annotationParameterByName == null || (type = annotationParameterByName.getType()) == null) ? kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new java.lang.String[0]) : type;
    }
}
