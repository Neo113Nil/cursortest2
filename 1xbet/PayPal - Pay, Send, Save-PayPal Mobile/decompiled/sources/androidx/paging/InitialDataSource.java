package androidx.paging;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"Landroidx/paging/InitialDataSource;", "", "K", "V", "Landroidx/paging/PageKeyedDataSource;", "<init>", "()V", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", com.sun.jna.Callback.METHOD_NAME, "", "loadInitial", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V", "loadAfter"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitialDataSource<K, V> extends androidx.paging.PageKeyedDataSource<K, V> {
    @Override // androidx.paging.PageKeyedDataSource
    public final void loadInitial(androidx.paging.PageKeyedDataSource.LoadInitialParams<K> params, androidx.paging.PageKeyedDataSource.LoadInitialCallback<K, V> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        callback.onResult(kotlin.collections.CollectionsKt.emptyList(), 0, 0, null, null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void loadBefore(androidx.paging.PageKeyedDataSource.LoadParams<K> params, androidx.paging.PageKeyedDataSource.LoadCallback<K, V> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        callback.onResult(kotlin.collections.CollectionsKt.emptyList(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public final void loadAfter(androidx.paging.PageKeyedDataSource.LoadParams<K> params, androidx.paging.PageKeyedDataSource.LoadCallback<K, V> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        callback.onResult(kotlin.collections.CollectionsKt.emptyList(), null);
    }
}
