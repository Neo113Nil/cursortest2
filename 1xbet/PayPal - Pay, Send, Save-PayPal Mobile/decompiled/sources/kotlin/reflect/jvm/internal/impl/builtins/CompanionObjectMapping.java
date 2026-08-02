package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public final class CompanionObjectMapping {
    public static final kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping();
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getHighSpeedVideoFpsRanges;

    private CompanionObjectMapping() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getClassIds() {
        return getHighSpeedVideoFpsRanges;
    }

    static {
        java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> set = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.NUMBER_TYPES;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.getPrimitiveFqName((kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) it.next()));
        }
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) arrayList, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.string.toSafe()), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames._boolean.toSafe()), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames._enum.toSafe());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
        java.util.Iterator it2 = plus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.topLevel((kotlin.reflect.jvm.internal.impl.name.FqName) it2.next()));
        }
        getHighSpeedVideoFpsRanges = linkedHashSet;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> allClassesWithIntrinsicCompanions() {
        return getHighSpeedVideoFpsRanges;
    }
}
