package androidx.compose.runtime;

/* compiled from: Composition.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a$\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a$\u0010\u0014\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001a\u0010\u0015\u001a\u00020\u00162\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001aI\u0010\u0017\u001a\u00020\u0018\"\b\b\u0000\u0010\u0019*\u00020\u0006\"\b\b\u0001\u0010\u001a*\u00020\u0006*\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\u001c0\u001b2\u0006\u0010\u001d\u001a\u0002H\u00192\u0006\u0010\u001e\u001a\u0002H\u001aH\u0002¢\u0006\u0002\u0010\u001f\u001a'\u0010 \u001a\u0004\u0018\u0001H!\"\u0004\b\u0000\u0010!*\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H!0\u0001H\u0000¢\u0006\u0002\u0010\"\u001a7\u0010#\u001a\u00020\u0018\"\u0004\b\u0000\u0010$*\u0012\u0012\u0004\u0012\u0002H$0%j\b\u0012\u0004\u0012\u0002H$`&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020)0(H\u0082\b\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0007\u001a\u00020\b*\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006*"}, d2 = {"CompositionImplServiceKey", "Landroidx/compose/runtime/CompositionServiceKey;", "Landroidx/compose/runtime/CompositionImpl;", "getCompositionImplServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "PendingApplyNoModifications", "", "recomposeCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/ControlledComposition;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "Composition", "Landroidx/compose/runtime/Composition;", "applier", "Landroidx/compose/runtime/Applier;", "parent", "Landroidx/compose/runtime/CompositionContext;", "ControlledComposition", "ReusableComposition", "Landroidx/compose/runtime/ReusableComposition;", "addValue", "", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", com.ironsource.X3.i.W, "value", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Ljava/lang/Object;Ljava/lang/Object;)V", "getCompositionService", "T", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "removeValueIf", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "predicate", "Lkotlin/Function1;", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionKt {
    private static final java.lang.Object PendingApplyNoModifications = new java.lang.Object();
    private static final androidx.compose.runtime.CompositionServiceKey<androidx.compose.runtime.CompositionImpl> CompositionImplServiceKey = new androidx.compose.runtime.CompositionServiceKey<androidx.compose.runtime.CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(androidx.compose.runtime.ControlledComposition controlledComposition) {
    }

    public static final <T> T getCompositionService(androidx.compose.runtime.Composition composition, androidx.compose.runtime.CompositionServiceKey<T> compositionServiceKey) {
        androidx.compose.runtime.CompositionServices compositionServices = composition instanceof androidx.compose.runtime.CompositionServices ? (androidx.compose.runtime.CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    public static final kotlin.coroutines.CoroutineContext getRecomposeCoroutineContext(androidx.compose.runtime.ControlledComposition controlledComposition) {
        kotlin.coroutines.CoroutineContext recomposeContext;
        androidx.compose.runtime.CompositionImpl compositionImpl = controlledComposition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    public static final androidx.compose.runtime.Composition Composition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final androidx.compose.runtime.ReusableComposition ReusableComposition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final androidx.compose.runtime.ControlledComposition ControlledComposition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final androidx.compose.runtime.Composition Composition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final androidx.compose.runtime.ControlledComposition ControlledComposition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final androidx.compose.runtime.CompositionServiceKey<androidx.compose.runtime.CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void addValue(androidx.compose.runtime.collection.IdentityArrayMap<K, androidx.compose.runtime.collection.IdentityArraySet<V>> identityArrayMap, K k, V v) {
        if (identityArrayMap.contains(k)) {
            androidx.compose.runtime.collection.IdentityArraySet<V> identityArraySet = identityArrayMap.get(k);
            if (identityArraySet != null) {
                identityArraySet.add(v);
                return;
            }
            return;
        }
        androidx.compose.runtime.collection.IdentityArraySet<V> identityArraySet2 = new androidx.compose.runtime.collection.IdentityArraySet<>();
        identityArraySet2.add(v);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        identityArrayMap.set(k, identityArraySet2);
    }

    private static final <E> void removeValueIf(java.util.HashSet<E> hashSet, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1) {
        java.util.Iterator<E> it = hashSet.iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }
}
