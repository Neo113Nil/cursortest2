package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public interface JavaAnnotation extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> getArguments();

    kotlin.reflect.jvm.internal.impl.name.ClassId getClassId();

    boolean isFreshlySupportedTypeUseAnnotation();

    boolean isIdeExternalAnnotation();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass resolve();
}
