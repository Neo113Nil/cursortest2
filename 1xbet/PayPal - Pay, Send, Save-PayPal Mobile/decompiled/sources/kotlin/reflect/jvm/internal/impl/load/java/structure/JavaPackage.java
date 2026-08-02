package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes3.dex */
public interface JavaPackage extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass> getClasses(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage> getSubPackages();
}
