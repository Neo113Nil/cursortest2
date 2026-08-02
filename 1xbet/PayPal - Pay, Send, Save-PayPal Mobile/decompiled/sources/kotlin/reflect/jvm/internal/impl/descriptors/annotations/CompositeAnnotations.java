package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public final class CompositeAnnotations implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations... annotationsArr) {
        this((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations>) kotlin.collections.ArraysKt.toList(annotationsArr));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationsArr, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> list = this.Camera2StreamConfigurationMap;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.Iterator it = kotlin.collections.CollectionsKt.asSequence(this.Camera2StreamConfigurationMap).iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation(final kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(this.Camera2StreamConfigurationMap), new kotlin.jvm.functions.Function1(fqName) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = fqName;
            }
        }));
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
        return kotlin.sequences.SequencesKt.flatMap(kotlin.collections.CollectionsKt.asSequence(this.Camera2StreamConfigurationMap), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) obj);
            }
        }).iterator();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return annotations.mo23890findAnnotation(fqName);
    }

    static /* synthetic */ kotlin.sequences.Sequence getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return kotlin.collections.CollectionsKt.asSequence(annotations);
    }
}
