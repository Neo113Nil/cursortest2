package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class ReflectAnnotationSource implements kotlin.reflect.jvm.internal.impl.descriptors.SourceElement {
    private final java.lang.annotation.Annotation getHighSpeedVideoFpsRangesFor;

    public ReflectAnnotationSource(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        this.getHighSpeedVideoFpsRangesFor = annotation;
    }

    public final java.lang.annotation.Annotation getAnnotation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceFile, "");
        return sourceFile;
    }
}
