package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\t\u0010\r"}, d2 = {"", "T", "Lkotlin/reflect/KAnnotatedElement;", "findAnnotation", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "", "hasAnnotation", "(Lkotlin/reflect/KAnnotatedElement;)Z", "", "findAnnotations", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/util/List;", "Lkotlin/reflect/KClass;", "klass", "(Lkotlin/reflect/KAnnotatedElement;Lkotlin/reflect/KClass;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KAnnotatedElements {
    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> T findAnnotation(kotlin.reflect.KAnnotatedElement kAnnotatedElement) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kAnnotatedElement, "");
        java.util.Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (((java.lang.annotation.Annotation) obj) instanceof java.lang.annotation.Annotation) {
                break;
            }
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T?");
        return (T) obj;
    }

    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> java.util.List<T> findAnnotations(kotlin.reflect.KAnnotatedElement kAnnotatedElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kAnnotatedElement, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return findAnnotations(kAnnotatedElement, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.annotation.Annotation.class));
    }

    public static final <T extends java.lang.annotation.Annotation> java.util.List<T> findAnnotations(kotlin.reflect.KAnnotatedElement kAnnotatedElement, kotlin.reflect.KClass<T> kClass) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kAnnotatedElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.util.List<T> filterIsInstance = kotlin.collections.CollectionsKt.filterIsInstance(kAnnotatedElement.getAnnotations(), kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
        if (!filterIsInstance.isEmpty()) {
            return filterIsInstance;
        }
        java.lang.Class<? extends java.lang.annotation.Annotation> highSpeedVideoFpsRangesFor = kotlin.reflect.full.Java8RepeatableContainerLoader.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
        if (highSpeedVideoFpsRangesFor != null) {
            java.util.Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass((java.lang.annotation.Annotation) obj)), highSpeedVideoFpsRangesFor)) {
                    break;
                }
            }
            java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) obj;
            if (annotation != null) {
                java.lang.Object invoke = annotation.getClass().getMethod(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, new java.lang.Class[0]).invoke(annotation, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                return kotlin.collections.ArraysKt.asList((java.lang.annotation.Annotation[]) invoke);
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> boolean hasAnnotation(kotlin.reflect.KAnnotatedElement kAnnotatedElement) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kAnnotatedElement, "");
        java.util.Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (((java.lang.annotation.Annotation) obj) instanceof java.lang.annotation.Annotation) {
                break;
            }
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T?");
        return ((java.lang.annotation.Annotation) obj) != null;
    }
}
