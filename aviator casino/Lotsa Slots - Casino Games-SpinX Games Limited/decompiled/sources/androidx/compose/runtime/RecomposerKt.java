package androidx.compose.runtime;

/* compiled from: Recomposer.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0006\u001aR\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062<\u0010\u0007\u001a8\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0002\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014*\u0014\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00160\u00152\u0006\u0010\u0017\u001a\u0002H\u00132\u0006\u0010\u0018\u001a\u0002H\u0014H\u0000¢\u0006\u0002\u0010\u0019\u001a9\u0010\u001a\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014*\u0014\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00160\u00152\u0006\u0010\u0017\u001a\u0002H\u0013H\u0000¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"FramePending", "", "ProduceAnotherFrame", "RecomposerCompoundHashKey", "", "withRunningRecomposer", "R", "block", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/ParameterName;", "name", "recomposer", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMultiValue", "", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", com.ironsource.X3.i.W, "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;
    private static final java.lang.Object ProduceAnotherFrame = new java.lang.Object();
    private static final java.lang.Object FramePending = new java.lang.Object();

    public static final <R> java.lang.Object withRunningRecomposer(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.Recomposer, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2(function3, null), continuation);
    }

    public static final <K, V> V removeLastMultiValue(java.util.Map<K, java.util.List<V>> map, K k) {
        java.util.List<V> list = map.get(k);
        if (list == null) {
            return null;
        }
        V v = (V) kotlin.collections.CollectionsKt.removeFirst(list);
        if (!list.isEmpty()) {
            return v;
        }
        map.remove(k);
        return v;
    }

    public static final <K, V> boolean addMultiValue(java.util.Map<K, java.util.List<V>> map, K k, V v) {
        java.util.ArrayList arrayList = map.get(k);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map.put(k, arrayList);
        }
        return arrayList.add(v);
    }
}
