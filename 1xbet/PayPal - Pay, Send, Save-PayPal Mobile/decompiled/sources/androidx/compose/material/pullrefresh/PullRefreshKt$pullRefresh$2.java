package androidx.compose.material.pullrefresh;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class PullRefreshKt$pullRefresh$2 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        java.lang.Object boxFloat;
        boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(((androidx.compose.material.pullrefresh.PullRefreshState) this.receiver).onRelease$material(f.floatValue()));
        return boxFloat;
    }

    PullRefreshKt$pullRefresh$2(java.lang.Object obj) {
        super(2, obj, androidx.compose.material.pullrefresh.PullRefreshState.class, "onRelease", "onRelease$material(F)F", 4);
    }
}
