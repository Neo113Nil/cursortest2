package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
final class EnhancedTypeAnnotations implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations {
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return false;
    }

    public EnhancedTypeAnnotations(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        this.getHighSpeedVideoFpsRanges = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(fqName, this.getHighSpeedVideoFpsRanges) ? kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotationDescriptor.getHighSpeedVideoFpsRanges : null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final /* bridge */ boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
        return kotlin.collections.CollectionsKt.emptyList().iterator();
    }
}
