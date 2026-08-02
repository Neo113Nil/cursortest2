package androidx.paging;

@kotlin.Deprecated(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @kotlin.ReplaceWith(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0014\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0017¢\u0006\u0004\b\u001c\u0010\u0011J/\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ)\u0010#\u001a\u00020\u000f2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\u001fH\u0016¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\u00020\u000f2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\u001fH\u0016¢\u0006\u0004\b%\u0010$J\u0019\u0010)\u001a\u00020(2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020(2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b,\u0010*J%\u0010-\u001a\u00020(2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b-\u0010.R&\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R6\u00106\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b:\u00105\u001a\u0004\b8\u00109"}, d2 = {"Landroidx/paging/PagedListAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "Landroidx/paging/PagedList;", "pagedList", "", "submitList", "(Landroidx/paging/PagedList;)V", "Ljava/lang/Runnable;", "commitCallback", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "getItem", "(I)Ljava/lang/Object;", "getItemCount", "()I", "currentList", "onCurrentListChanged", "previousList", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLoadStateListener", "(Lkotlin/jvm/functions/Function2;)V", "removeLoadStateListener", "Landroidx/paging/LoadStateAdapter;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "Landroidx/paging/AsyncPagedListDiffer;", "differ", "Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime", "()Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime$annotations", "()V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagedListAdapter<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    private final kotlin.jvm.functions.Function2<androidx.paging.PagedList<T>, androidx.paging.PagedList<T>, kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.paging.AsyncPagedListDiffer<T> differ;

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime$annotations() {
    }

    @kotlin.Deprecated(message = "Use the two argument variant instead.", replaceWith = @kotlin.ReplaceWith(expression = "onCurrentListChanged(previousList, currentList)", imports = {}))
    public void onCurrentListChanged(androidx.paging.PagedList<T> currentList) {
    }

    public void onCurrentListChanged(androidx.paging.PagedList<T> previousList, androidx.paging.PagedList<T> currentList) {
    }

    public final androidx.paging.AsyncPagedListDiffer<T> getDiffer$paging_runtime() {
        return this.differ;
    }

    public androidx.paging.PagedList<T> getCurrentList() {
        return this.differ.getCurrentList();
    }

    protected PagedListAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.functions.Function2<androidx.paging.PagedList<T>, androidx.paging.PagedList<T>, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.paging.PagedListAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.PagedListAdapter.$r8$lambda$unm449QEx3DjpGzuY1m8vtI27Qg(androidx.paging.PagedListAdapter.this, (androidx.paging.PagedList) obj, (androidx.paging.PagedList) obj2);
            }
        };
        this.Camera2StreamConfigurationMap = function2;
        androidx.paging.AsyncPagedListDiffer<T> asyncPagedListDiffer = new androidx.paging.AsyncPagedListDiffer<>(this, itemCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(function2);
    }

    protected PagedListAdapter(androidx.recyclerview.widget.AsyncDifferConfig<T> asyncDifferConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncDifferConfig, "");
        kotlin.jvm.functions.Function2<androidx.paging.PagedList<T>, androidx.paging.PagedList<T>, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.paging.PagedListAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.PagedListAdapter.$r8$lambda$unm449QEx3DjpGzuY1m8vtI27Qg(androidx.paging.PagedListAdapter.this, (androidx.paging.PagedList) obj, (androidx.paging.PagedList) obj2);
            }
        };
        this.Camera2StreamConfigurationMap = function2;
        androidx.paging.AsyncPagedListDiffer<T> asyncPagedListDiffer = new androidx.paging.AsyncPagedListDiffer<>(new androidx.recyclerview.widget.AdapterListUpdateCallback(this), asyncDifferConfig);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(function2);
    }

    public void submitList(androidx.paging.PagedList<T> pagedList) {
        this.differ.submitList(pagedList);
    }

    public void submitList(androidx.paging.PagedList<T> pagedList, java.lang.Runnable commitCallback) {
        this.differ.submitList(pagedList, commitCallback);
    }

    protected T getItem(int position) {
        return this.differ.getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.getItemCount();
    }

    public void addLoadStateListener(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.differ.addLoadStateListener(listener);
    }

    public void removeLoadStateListener(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.differ.removeLoadStateListener(listener);
    }

    public final androidx.recyclerview.widget.ConcatAdapter withLoadStateHeader(final androidx.paging.LoadStateAdapter<?> header) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        addLoadStateListener(new kotlin.jvm.functions.Function2() { // from class: androidx.paging.PagedListAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.PagedListAdapter.$r8$lambda$re45SHHzPDRZYTNwgk5ZqsloJVc(androidx.paging.LoadStateAdapter.this, (androidx.paging.LoadType) obj, (androidx.paging.LoadState) obj2);
            }
        });
        return new androidx.recyclerview.widget.ConcatAdapter((androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>[]) new androidx.recyclerview.widget.RecyclerView.Adapter[]{header, this});
    }

    public final androidx.recyclerview.widget.ConcatAdapter withLoadStateFooter(final androidx.paging.LoadStateAdapter<?> footer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footer, "");
        addLoadStateListener(new kotlin.jvm.functions.Function2() { // from class: androidx.paging.PagedListAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.PagedListAdapter.$r8$lambda$gul4QpMlBAPhI4dK2_1YUDaXju8(androidx.paging.LoadStateAdapter.this, (androidx.paging.LoadType) obj, (androidx.paging.LoadState) obj2);
            }
        });
        return new androidx.recyclerview.widget.ConcatAdapter((androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>[]) new androidx.recyclerview.widget.RecyclerView.Adapter[]{this, footer});
    }

    public final androidx.recyclerview.widget.ConcatAdapter withLoadStateHeaderAndFooter(final androidx.paging.LoadStateAdapter<?> header, final androidx.paging.LoadStateAdapter<?> footer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footer, "");
        addLoadStateListener(new kotlin.jvm.functions.Function2() { // from class: androidx.paging.PagedListAdapter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.PagedListAdapter.$r8$lambda$RYr_JqXejaBNyeP1Lc_EhL8M01U(androidx.paging.LoadStateAdapter.this, footer, (androidx.paging.LoadType) obj, (androidx.paging.LoadState) obj2);
            }
        });
        return new androidx.recyclerview.widget.ConcatAdapter((androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>[]) new androidx.recyclerview.widget.RecyclerView.Adapter[]{header, this, footer});
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RYr_JqXejaBNyeP1Lc_EhL8M01U(androidx.paging.LoadStateAdapter loadStateAdapter, androidx.paging.LoadStateAdapter loadStateAdapter2, androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        if (loadType == androidx.paging.LoadType.PREPEND) {
            loadStateAdapter.setLoadState(loadState);
        } else if (loadType == androidx.paging.LoadType.APPEND) {
            loadStateAdapter2.setLoadState(loadState);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gul4QpMlBAPhI4dK2_1YUDaXju8(androidx.paging.LoadStateAdapter loadStateAdapter, androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        if (loadType == androidx.paging.LoadType.APPEND) {
            loadStateAdapter.setLoadState(loadState);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$re45SHHzPDRZYTNwgk5ZqsloJVc(androidx.paging.LoadStateAdapter loadStateAdapter, androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        if (loadType == androidx.paging.LoadType.PREPEND) {
            loadStateAdapter.setLoadState(loadState);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$unm449QEx3DjpGzuY1m8vtI27Qg(androidx.paging.PagedListAdapter pagedListAdapter, androidx.paging.PagedList pagedList, androidx.paging.PagedList pagedList2) {
        pagedListAdapter.onCurrentListChanged(pagedList2);
        pagedListAdapter.onCurrentListChanged(pagedList, pagedList2);
        return kotlin.Unit.INSTANCE;
    }
}
