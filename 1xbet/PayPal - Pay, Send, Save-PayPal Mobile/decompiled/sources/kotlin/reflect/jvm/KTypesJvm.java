package kotlin.reflect.jvm;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\"\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\b"}, d2 = {"Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "getJvmErasure", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "jvmErasure", "Lkotlin/reflect/KClassifier;", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KTypesJvm {
    public static /* synthetic */ void getJvmErasure$annotations(kotlin.reflect.KType kType) {
    }

    public static final kotlin.reflect.KClass<?> getJvmErasure(kotlin.reflect.KType kType) {
        kotlin.reflect.KClass<?> jvmErasure;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        if (classifier == null || (jvmErasure = getJvmErasure(classifier)) == null) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot calculate JVM erasure for type: ".concat(java.lang.String.valueOf(kType)));
        }
        return jvmErasure;
    }

    public static final kotlin.reflect.KClass<?> getJvmErasure(kotlin.reflect.KClassifier kClassifier) {
        java.lang.Object obj;
        kotlin.reflect.KClass<?> jvmErasure;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        if (kClassifier instanceof kotlin.reflect.KClass) {
            return (kotlin.reflect.KClass) kClassifier;
        }
        if (kClassifier instanceof kotlin.reflect.KTypeParameter) {
            java.util.List<kotlin.reflect.KType> upperBounds = ((kotlin.reflect.KTypeParameter) kClassifier).getUpperBounds();
            java.util.Iterator<T> it = upperBounds.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                kotlin.reflect.KClassifier classifier = ((kotlin.reflect.KType) next).getClassifier();
                kotlin.reflect.jvm.internal.KClassImpl kClassImpl = classifier instanceof kotlin.reflect.jvm.internal.KClassImpl ? (kotlin.reflect.jvm.internal.KClassImpl) classifier : null;
                if (kClassImpl != null && kClassImpl.getClassKind$kotlin_reflection() != kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE && kClassImpl.getClassKind$kotlin_reflection() != kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS) {
                    obj = next;
                    break;
                }
            }
            kotlin.reflect.KType kType = (kotlin.reflect.KType) obj;
            if (kType == null) {
                kType = (kotlin.reflect.KType) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) upperBounds);
            }
            return (kType == null || (jvmErasure = getJvmErasure(kType)) == null) ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class) : jvmErasure;
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot calculate JVM erasure for type: ".concat(java.lang.String.valueOf(kClassifier)));
    }
}
