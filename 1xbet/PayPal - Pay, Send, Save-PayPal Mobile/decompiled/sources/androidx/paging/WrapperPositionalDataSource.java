package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR/\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/paging/WrapperPositionalDataSource;", "", "A", "B", "Landroidx/paging/PositionalDataSource;", "source", "Landroidx/arch/core/util/Function;", "", "listFunction", "<init>", "(Landroidx/paging/PositionalDataSource;Landroidx/arch/core/util/Function;)V", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "params", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", com.sun.jna.Callback.METHOD_NAME, "loadInitial", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "loadRange", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Landroidx/paging/PositionalDataSource$LoadRangeCallback;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/PositionalDataSource;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/arch/core/util/Function;", "getListFunction", "()Landroidx/arch/core/util/Function;", "", "isInvalid", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WrapperPositionalDataSource<A, B> extends androidx.paging.PositionalDataSource<B> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.paging.PositionalDataSource<A> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.arch.core.util.Function<java.util.List<A>, java.util.List<B>> listFunction;

    public WrapperPositionalDataSource(androidx.paging.PositionalDataSource<A> positionalDataSource, androidx.arch.core.util.Function<java.util.List<A>, java.util.List<B>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positionalDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        this.getHighResolutionOutputSizeshNQ4ISI = positionalDataSource;
        this.listFunction = function;
    }

    public final androidx.arch.core.util.Function<java.util.List<A>, java.util.List<B>> getListFunction() {
        return this.listFunction;
    }

    @Override // androidx.paging.DataSource
    public final boolean isInvalid() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isInvalid();
    }

    @Override // androidx.paging.DataSource
    public final void addInvalidatedCallback(androidx.paging.DataSource.InvalidatedCallback onInvalidatedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidatedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.addInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public final void removeInvalidatedCallback(androidx.paging.DataSource.InvalidatedCallback onInvalidatedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidatedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.removeInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public final void invalidate() {
        this.getHighResolutionOutputSizeshNQ4ISI.invalidate();
    }

    @Override // androidx.paging.PositionalDataSource
    public final void loadInitial(androidx.paging.PositionalDataSource.LoadInitialParams params, final androidx.paging.PositionalDataSource.LoadInitialCallback<B> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.loadInitial(params, new androidx.paging.PositionalDataSource.LoadInitialCallback<A>() { // from class: androidx.paging.WrapperPositionalDataSource$loadInitial$1
            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends A> data, int position, int totalCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                callback.onResult(androidx.paging.DataSource.INSTANCE.convert$paging_common(this.getListFunction(), data), position, totalCount);
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends A> data, int position) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                callback.onResult(androidx.paging.DataSource.INSTANCE.convert$paging_common(this.getListFunction(), data), position);
            }
        });
    }

    @Override // androidx.paging.PositionalDataSource
    public final void loadRange(androidx.paging.PositionalDataSource.LoadRangeParams params, final androidx.paging.PositionalDataSource.LoadRangeCallback<B> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.loadRange(params, new androidx.paging.PositionalDataSource.LoadRangeCallback<A>() { // from class: androidx.paging.WrapperPositionalDataSource$loadRange$1
            @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
            public final void onResult(java.util.List<? extends A> data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                callback.onResult(androidx.paging.DataSource.INSTANCE.convert$paging_common(this.getListFunction(), data));
            }
        });
    }
}
