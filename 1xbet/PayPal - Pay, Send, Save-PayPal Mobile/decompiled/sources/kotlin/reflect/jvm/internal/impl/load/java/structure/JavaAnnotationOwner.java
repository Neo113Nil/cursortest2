package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public interface JavaAnnotationOwner extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotations();

    boolean isDeprecatedInJavaDoc();
}
