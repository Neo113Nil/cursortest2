package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class KotlinTypeRefinerKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.types.checker.Ref<kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport>> getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<>("KotlinTypeRefiner");

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.types.checker.Ref<kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport>> getREFINER_CAPABILITY() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> refineTypes(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it.next()));
        }
        return arrayList;
    }
}
