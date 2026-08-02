package androidx.compose.material.pullrefresh;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class PullRefreshKt$pullRefresh$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
        return java.lang.Float.valueOf(((androidx.compose.material.pullrefresh.PullRefreshState) this.receiver).onPull$material(f.floatValue()));
    }

    PullRefreshKt$pullRefresh$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.material.pullrefresh.PullRefreshState.class, "onPull", "onPull$material(F)F", 0);
    }
}
