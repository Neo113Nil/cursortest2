package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaAnnotationAsAnnotationArgument extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument {
    private final java.lang.annotation.Annotation getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaAnnotationAsAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.annotation.Annotation annotation) {
        super(name2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        this.getHighSpeedVideoSizes = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation getAnnotation() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation(this.getHighSpeedVideoSizes);
    }
}
