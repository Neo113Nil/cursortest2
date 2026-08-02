package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¥\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000422\u0010\f\u001a.\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2(\u0010\u000e\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Landroidx/compose/runtime/tooling/CompositionData;", "Lkotlin/Function1;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "", "prepareResult", "Lkotlin/Function4;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/ui/tooling/data/SourceContext;", "", "createNode", "Lkotlin/Function3;", "createResult", "Landroidx/compose/ui/tooling/data/ContextCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "makeTree", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionDataTreeKt {
    public static /* synthetic */ java.util.List makeTree$default(java.util.Set set, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function3, androidx.compose.ui.tooling.data.ContextCache contextCache, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            contextCache = new androidx.compose.ui.tooling.data.ContextCache();
        }
        return makeTree(set, function1, function4, function3, contextCache);
    }

    public static final <T, R> java.util.List<R> makeTree(java.util.Set<? extends androidx.compose.runtime.tooling.CompositionData> set, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.tooling.CompositionInstance, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super androidx.compose.runtime.tooling.CompositionGroup, ? super androidx.compose.ui.tooling.data.SourceContext, ? super java.util.List<? extends T>, ? super java.util.List<? extends R>, ? extends T> function4, kotlin.jvm.functions.Function3<? super androidx.compose.runtime.tooling.CompositionInstance, ? super T, ? super java.util.List<? extends androidx.compose.runtime.tooling.CompositionInstance>, ? extends R> function3, androidx.compose.ui.tooling.data.ContextCache contextCache) {
        androidx.compose.ui.tooling.data.CompositionDataTree compositionDataTree = new androidx.compose.ui.tooling.data.CompositionDataTree(set, function1, function4, function3, contextCache);
        java.util.Set<androidx.compose.runtime.tooling.CompositionInstance> set2 = compositionDataTree.getInputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            java.lang.Object highSpeedVideoFpsRanges = compositionDataTree.getHighSpeedVideoFpsRanges((androidx.compose.runtime.tooling.CompositionInstance) it.next());
            if (highSpeedVideoFpsRanges != null) {
                arrayList.add(highSpeedVideoFpsRanges);
            }
        }
        return arrayList;
    }
}
