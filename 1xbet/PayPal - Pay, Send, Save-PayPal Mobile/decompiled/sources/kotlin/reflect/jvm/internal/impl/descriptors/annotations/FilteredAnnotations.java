package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public final class FilteredAnnotations implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations {
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = annotations;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean> function1) {
        this(annotations, false, function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        if (this.getHighSpeedVideoFpsRanges.invoke(fqName).booleanValue()) {
            return this.getHighSpeedVideoSizes.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        if (this.getHighSpeedVideoFpsRanges.invoke(fqName).booleanValue()) {
            return this.getHighSpeedVideoSizes.mo23890findAnnotation(fqName);
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor : annotations) {
            if (getHighSpeedVideoFpsRanges(annotationDescriptor)) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        boolean z;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.getHighSpeedVideoSizes;
        if (!(annotations instanceof java.util.Collection) || !((java.util.Collection) annotations).isEmpty()) {
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                if (getHighSpeedVideoFpsRanges(it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return this.Camera2StreamConfigurationMap ? !z : z;
    }

    private final boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = annotationDescriptor.getFqName();
        return fqName != null && this.getHighSpeedVideoFpsRanges.invoke(fqName).booleanValue();
    }
}
