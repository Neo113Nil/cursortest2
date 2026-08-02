package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes5.dex */
public final class LazyJavaAnnotationsKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations resolveAnnotations(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner javaAnnotationOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotationOwner, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(lazyJavaResolverContext, javaAnnotationOwner, false, 4, null);
    }
}
