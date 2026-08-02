package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class Pager$flow$1<Key, Value> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>> continuation) {
        return ((androidx.paging.SuspendingPagingSourceFactory) this.receiver).create(continuation);
    }

    Pager$flow$1(java.lang.Object obj) {
        super(1, obj, androidx.paging.SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
