package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class AnnotationTypeQualifierResolver extends kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final boolean isK2() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationTypeQualifierResolver(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getMetaAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        return (annotationClass == null || (annotations = annotationClass.getAnnotations()) == null) ? kotlin.collections.CollectionsKt.emptyList() : annotations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final java.lang.Object getKey(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNull(annotationClass);
        return annotationClass;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final kotlin.reflect.jvm.internal.impl.name.FqName getFqName(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        return annotationDescriptor.getFqName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final java.lang.Iterable<java.lang.String> enumArguments(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, boolean z) {
        java.util.List<java.lang.String> highSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> entry : allValueArguments.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.Name key = entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> value = entry.getValue();
            if (!z || kotlin.jvm.internal.Intrinsics.areEqual(key, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(value);
            } else {
                highSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, highSpeedVideoFpsRanges);
        }
        return arrayList;
    }

    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue) {
        if (!(constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue)) {
            return constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue ? kotlin.collections.CollectionsKt.listOf(((kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) constantValue).getEnumEntryName().getIdentifier()) : kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> value = ((kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>) it.next()));
        }
        return arrayList;
    }
}
