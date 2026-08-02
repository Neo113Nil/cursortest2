package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/paging/InitialPagedList;", "", "K", "V", "Landroidx/paging/ContiguousPagedList;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$Config;", "config", "initialLastKey", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InitialPagedList<K, V> extends androidx.paging.ContiguousPagedList<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialPagedList(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, androidx.paging.PagedList.Config config, K k) {
        super(new androidx.paging.LegacyPagingSource(coroutineDispatcher, new androidx.paging.InitialDataSource()), coroutineScope, coroutineDispatcher, coroutineDispatcher2, null, config, androidx.paging.PagingSource.LoadResult.Page.INSTANCE.empty$paging_common(), k);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
    }
}
