package androidx.paging;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"", "Key", "Value", "Landroidx/paging/DataSource;", "dataSource", "Landroidx/paging/PagedList$Config;", "config", "Ljava/util/concurrent/Executor;", "notifyExecutor", "fetchExecutor", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "initialKey", "Landroidx/paging/PagedList;", "PagedList", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/paging/PagedList$BoundaryCallback;Ljava/lang/Object;)Landroidx/paging/PagedList;", "key", "Landroidx/paging/PagingSource$LoadParams;", "toRefreshLoadParams", "(Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagedListKt {
    @kotlin.Deprecated(message = "DataSource is deprecated and has been replaced by PagingSource")
    public static final /* synthetic */ androidx.paging.PagedList PagedList(androidx.paging.DataSource dataSource, androidx.paging.PagedList.Config config, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, androidx.paging.PagedList.BoundaryCallback boundaryCallback, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        return new androidx.paging.PagedList.Builder(dataSource, config).setNotifyExecutor(executor).setFetchExecutor(executor2).setBoundaryCallback(boundaryCallback).setInitialKey(obj).build();
    }

    public static final <Key> androidx.paging.PagingSource.LoadParams<Key> toRefreshLoadParams(androidx.paging.PagedList.Config config, Key key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return new androidx.paging.PagingSource.LoadParams.Refresh(key, config.initialLoadSizeHint, config.enablePlaceholders);
    }
}
