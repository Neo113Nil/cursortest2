package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class TypeEnhancementUtilsKt {
    private static final <T> T getHighSpeedVideoFpsRanges(java.util.Set<? extends T> set, T t, T t2, T t3, boolean z) {
        java.util.Set<? extends T> set2;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(t4, t) && kotlin.jvm.internal.Intrinsics.areEqual(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null && (set2 = kotlin.collections.CollectionsKt.toSet(kotlin.collections.SetsKt.plus(set, t3))) != null) {
            set = set2;
        }
        return (T) kotlin.collections.CollectionsKt.singleOrNull(set);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> collection, boolean z, boolean z2, boolean z3) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier2;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeQualifiers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) it.next();
            nullabilityQualifier = javaTypeQualifiers2.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers2.getNullability();
            if (nullabilityQualifier != null) {
                arrayList.add(nullabilityQualifier);
            }
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability = javaTypeQualifiers.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers.getNullability();
        if (nullability == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY) {
            nullabilityQualifier2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            nullabilityQualifier2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) getHighSpeedVideoFpsRanges(set, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, nullability, z);
        }
        if (nullabilityQualifier2 == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability2 = ((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability2 != null) {
                    arrayList2.add(nullability2);
                }
            }
            java.util.Set set2 = kotlin.collections.CollectionsKt.toSet(arrayList2);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability3 = javaTypeQualifiers.getNullability();
            if (nullability3 == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY) {
                nullabilityQualifier3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
            } else {
                nullabilityQualifier3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) getHighSpeedVideoFpsRanges(set2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, nullability3, z);
            }
        } else {
            nullabilityQualifier3 = nullabilityQualifier2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutability = ((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) getHighSpeedVideoFpsRanges(kotlin.collections.CollectionsKt.toSet(arrayList3), kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z);
        if (nullabilityQualifier3 != null && !z3 && (!z2 || nullabilityQualifier3 != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier = nullabilityQualifier3;
        }
        boolean z4 = false;
        boolean z5 = nullabilityQualifier != null && nullabilityQualifier2 == null;
        if (nullabilityQualifier == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) {
            if (javaTypeQualifiers.isNullabilityQualifierForWarning() != z5 || !javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection2.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers3 : collection2) {
                        if (javaTypeQualifiers3.isNullabilityQualifierForWarning() != z5 || !javaTypeQualifiers3.getDefinitelyNotNull()) {
                        }
                    }
                }
            }
            z4 = true;
            break;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z4, z5);
    }

    public static final boolean hasEnhancedNullability(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
        return typeSystemCommonBackendContext.hasAnnotation(kotlinTypeMarker, fqName);
    }
}
