package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<androidx.paging.LoadType, androidx.paging.LoadState, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        ((androidx.paging.PagedList.LoadStateManager) this.receiver).setState(loadType, loadState);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        getHighSpeedVideoFpsRangesFor(loadType, loadState);
        return kotlin.Unit.INSTANCE;
    }

    AsyncPagedListDiffer$loadStateListener$1(java.lang.Object obj) {
        super(2, obj, androidx.paging.PagedList.LoadStateManager.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }
}
