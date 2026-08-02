package androidx.compose.material.pullrefresh;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a]\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b0\u00072'\u0010\u000e\u001a#\b\u0001\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "", "enabled", "pullRefresh", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onPull", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "onRelease", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullRefreshKt {
    public static /* synthetic */ androidx.compose.ui.Modifier pullRefresh$default(androidx.compose.ui.Modifier modifier, androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return pullRefresh(modifier, pullRefreshState, z);
    }

    public static final androidx.compose.ui.Modifier pullRefresh(androidx.compose.ui.Modifier modifier, androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, boolean z) {
        return pullRefresh(modifier, new androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$1(pullRefreshState), new androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$2(pullRefreshState), z);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier pullRefresh$default(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pullRefresh(modifier, function1, function2, z);
    }

    public static final androidx.compose.ui.Modifier pullRefresh(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super java.lang.Float>, ? extends java.lang.Object> function2, boolean z) {
        return androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(modifier, new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection(function1, function2, z), null, 2, null);
    }
}
