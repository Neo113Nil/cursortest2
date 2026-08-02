package androidx.paging;

@kotlin.Deprecated(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @kotlin.ReplaceWith(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002jkB#\b\u0017\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0015\u0010\u0019JM\u0010!\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b!\u0010\"J9\u0010&\u001a\u00020\u00142\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b*\u0010+J7\u0010*\u001a\u00020\u00142(\u0010-\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00140,¢\u0006\u0004\b*\u0010.J\u001d\u0010/\u001a\u00020\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b/\u0010+J7\u0010/\u001a\u00020\u00142(\u0010-\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00140,¢\u0006\u0004\b/\u0010.J)\u00102\u001a\u00020\u00142\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00140,H\u0016¢\u0006\u0004\b2\u0010.J)\u00103\u001a\u00020\u00142\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00140,H\u0016¢\u0006\u0004\b3\u0010.R\"\u00104\u001a\u00020\t8\u0001@\u0001X\u0080.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\"\u0010@\u001a\u00020?8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER,\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0F8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010>\u001a\u0004\bI\u0010JR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010MR(\u0010O\u001a\u00020\u000e8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010>\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010N\u001a\u00020V8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010XR0\u0010[\u001a\u001e\u0012\t\u0012\u000700¢\u0006\u0002\bZ\u0012\t\u0012\u000701¢\u0006\u0002\bZ\u0012\u0004\u0012\u00020\u00140Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R2\u0010^\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00140,0]8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010W\u001a\u00020b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010cR\u0014\u0010e\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010RR\"\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128WX\u0096\u0004¢\u0006\f\u0012\u0004\bh\u0010>\u001a\u0004\bf\u0010g"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/ListUpdateCallback;", "listUpdateCallback", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "", "index", "getItem", "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList;", "pagedList", "", "submitList", "(Landroidx/paging/PagedList;)V", "Ljava/lang/Runnable;", "commitCallback", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "newList", "diffSnapshot", "Landroidx/paging/PlaceholderPaddedDiffResult;", "diffResult", "Landroidx/paging/RecordingCallback;", "recordingCallback", "lastAccessIndex", "latchPagedList$paging_runtime", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/PlaceholderPaddedDiffResult;Landroidx/paging/RecordingCallback;ILjava/lang/Runnable;)V", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addPagedListListener", "(Landroidx/paging/AsyncPagedListDiffer$PagedListListener;)V", "Lkotlin/Function2;", com.sun.jna.Callback.METHOD_NAME, "(Lkotlin/jvm/functions/Function2;)V", "removePagedListListener", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "addLoadStateListener", "removeLoadStateListener", "updateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getUpdateCallback$paging_runtime", "()Landroidx/recyclerview/widget/ListUpdateCallback;", "setUpdateCallback$paging_runtime", "(Landroidx/recyclerview/widget/ListUpdateCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime", "()Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime$annotations", "()V", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime$annotations", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/PagedList;", "getHighSpeedVideoFpsRangesFor", "maxScheduledGeneration", com.visa.cbp.getEncExpo.warmup, "getMaxScheduledGeneration$paging_runtime", "()I", "setMaxScheduledGeneration$paging_runtime", "(I)V", "getMaxScheduledGeneration$paging_runtime$annotations", "Landroidx/paging/PagedList$LoadStateManager;", "getHighSpeedVideoFpsRanges", "Landroidx/paging/PagedList$LoadStateManager;", "Lkotlin/reflect/KFunction2;", "Lkotlin/ParameterName;", "Camera2StreamConfigurationMap", "Lkotlin/reflect/KFunction;", "", "loadStateListeners", "Ljava/util/List;", "getLoadStateListeners$paging_runtime", "()Ljava/util/List;", "Landroidx/paging/PagedList$Callback;", "Landroidx/paging/PagedList$Callback;", "getItemCount", "itemCount", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "currentList", "PagedListListener", "OnCurrentListChangedWrapper"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class AsyncPagedListDiffer<T> {
    private final kotlin.reflect.KFunction<kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.recyclerview.widget.AsyncDifferConfig<T> config;
    private androidx.paging.PagedList<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.paging.PagedList.LoadStateManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.paging.PagedList<T> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.paging.PagedList.Callback getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.paging.AsyncPagedListDiffer.PagedListListener<T>> listeners;
    private final java.util.List<kotlin.jvm.functions.Function2<androidx.paging.LoadType, androidx.paging.LoadState, kotlin.Unit>> loadStateListeners;
    private java.util.concurrent.Executor mainThreadExecutor;
    private int maxScheduledGeneration;
    public androidx.recyclerview.widget.ListUpdateCallback updateCallback;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "", "T", "Landroidx/paging/PagedList;", "previousList", "currentList", "", "onCurrentListChanged", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
    public interface PagedListListener<T> {
        void onCurrentListChanged(androidx.paging.PagedList<T> previousList, androidx.paging.PagedList<T> currentList);
    }

    public static /* synthetic */ void getConfig$paging_runtime$annotations() {
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getListeners$paging_runtime$annotations() {
    }

    public static /* synthetic */ void getMaxScheduledGeneration$paging_runtime$annotations() {
    }

    public final androidx.recyclerview.widget.ListUpdateCallback getUpdateCallback$paging_runtime() {
        androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback != null) {
            return listUpdateCallback;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setUpdateCallback$paging_runtime(androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        this.updateCallback = listUpdateCallback;
    }

    public final androidx.recyclerview.widget.AsyncDifferConfig<T> getConfig$paging_runtime() {
        return this.config;
    }

    /* renamed from: getMainThreadExecutor$paging_runtime, reason: from getter */
    public final java.util.concurrent.Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }

    public final void setMainThreadExecutor$paging_runtime(java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.mainThreadExecutor = executor;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<androidx.paging.AsyncPagedListDiffer.PagedListListener<T>> getListeners$paging_runtime() {
        return this.listeners;
    }

    /* renamed from: getMaxScheduledGeneration$paging_runtime, reason: from getter */
    public final int getMaxScheduledGeneration() {
        return this.maxScheduledGeneration;
    }

    public final void setMaxScheduledGeneration$paging_runtime(int i) {
        this.maxScheduledGeneration = i;
    }

    public final java.util.List<kotlin.jvm.functions.Function2<androidx.paging.LoadType, androidx.paging.LoadState, kotlin.Unit>> getLoadStateListeners$paging_runtime() {
        return this.loadStateListeners;
    }

    public int getItemCount() {
        androidx.paging.PagedList<T> currentList = getCurrentList();
        if (currentList != null) {
            return currentList.size();
        }
        return 0;
    }

    public androidx.paging.PagedList<T> getCurrentList() {
        androidx.paging.PagedList<T> pagedList = this.getHighSpeedVideoSizes;
        return pagedList == null ? this.getHighResolutionOutputSizeshNQ4ISI : pagedList;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B1\u0012(\u0010\u0007\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR<\u0010\u0011\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$OnCurrentListChangedWrapper;", "", "T", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "Lkotlin/Function2;", "Landroidx/paging/PagedList;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "p1", "onCurrentListChanged", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes", "()Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class OnCurrentListChangedWrapper<T> implements androidx.paging.AsyncPagedListDiffer.PagedListListener<T> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function2<androidx.paging.PagedList<T>, androidx.paging.PagedList<T>, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        public OnCurrentListChangedWrapper(kotlin.jvm.functions.Function2<? super androidx.paging.PagedList<T>, ? super androidx.paging.PagedList<T>, kotlin.Unit> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            this.getHighSpeedVideoFpsRangesFor = function2;
        }

        public final kotlin.jvm.functions.Function2<androidx.paging.PagedList<T>, androidx.paging.PagedList<T>, kotlin.Unit> getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
        public final void onCurrentListChanged(androidx.paging.PagedList<T> p0, androidx.paging.PagedList<T> p1) {
            this.getHighSpeedVideoFpsRangesFor.invoke(p0, p1);
        }
    }

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        java.util.concurrent.Executor mainThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getMainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        androidx.paging.PagedList.LoadStateManager loadStateManager = new androidx.paging.PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ androidx.paging.AsyncPagedListDiffer<T> Camera2StreamConfigurationMap;

            {
                this.Camera2StreamConfigurationMap = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public final void onStateChanged(androidx.paging.LoadType type, androidx.paging.LoadState state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.getLoadStateListeners$paging_runtime().iterator();
                while (it.hasNext()) {
                    ((kotlin.jvm.functions.Function2) it.next()).invoke(type, state);
                }
            }
        };
        this.getHighSpeedVideoFpsRangesFor = loadStateManager;
        this.Camera2StreamConfigurationMap = new androidx.paging.AsyncPagedListDiffer$loadStateListener$1(loadStateManager);
        this.loadStateListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.getHighSpeedVideoFpsRanges = new androidx.paging.PagedList.Callback(this) { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            final /* synthetic */ androidx.paging.AsyncPagedListDiffer<T> getHighSpeedVideoFpsRanges;

            {
                this.getHighSpeedVideoFpsRanges = this;
            }

            @Override // androidx.paging.PagedList.Callback
            public final void onInserted(int position, int count) {
                this.getHighSpeedVideoFpsRanges.getUpdateCallback$paging_runtime().onInserted(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public final void onRemoved(int position, int count) {
                this.getHighSpeedVideoFpsRanges.getUpdateCallback$paging_runtime().onRemoved(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public final void onChanged(int position, int count) {
                this.getHighSpeedVideoFpsRanges.getUpdateCallback$paging_runtime().onChanged(position, count, null);
            }
        };
        setUpdateCallback$paging_runtime(new androidx.recyclerview.widget.AdapterListUpdateCallback(adapter));
        androidx.recyclerview.widget.AsyncDifferConfig<T> build = new androidx.recyclerview.widget.AsyncDifferConfig.Builder(itemCallback).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        this.config = build;
    }

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                config.diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, androidx.recyclerview.widget.AsyncDifferConfig<T> asyncDifferConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncDifferConfig, "");
        java.util.concurrent.Executor mainThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getMainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        androidx.paging.PagedList.LoadStateManager loadStateManager = new androidx.paging.PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ androidx.paging.AsyncPagedListDiffer<T> Camera2StreamConfigurationMap;

            {
                this.Camera2StreamConfigurationMap = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public final void onStateChanged(androidx.paging.LoadType type, androidx.paging.LoadState state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.getLoadStateListeners$paging_runtime().iterator();
                while (it.hasNext()) {
                    ((kotlin.jvm.functions.Function2) it.next()).invoke(type, state);
                }
            }
        };
        this.getHighSpeedVideoFpsRangesFor = loadStateManager;
        this.Camera2StreamConfigurationMap = new androidx.paging.AsyncPagedListDiffer$loadStateListener$1(loadStateManager);
        this.loadStateListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.getHighSpeedVideoFpsRanges = new androidx.paging.PagedList.Callback(this) { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            final /* synthetic */ androidx.paging.AsyncPagedListDiffer<T> getHighSpeedVideoFpsRanges;

            {
                this.getHighSpeedVideoFpsRanges = this;
            }

            @Override // androidx.paging.PagedList.Callback
            public final void onInserted(int position, int count) {
                this.getHighSpeedVideoFpsRanges.getUpdateCallback$paging_runtime().onInserted(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public final void onRemoved(int position, int count) {
                this.getHighSpeedVideoFpsRanges.getUpdateCallback$paging_runtime().onRemoved(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public final void onChanged(int position, int count) {
                this.getHighSpeedVideoFpsRanges.getUpdateCallback$paging_runtime().onChanged(position, count, null);
            }
        };
        setUpdateCallback$paging_runtime(listUpdateCallback);
        this.config = asyncDifferConfig;
    }

    public T getItem(int index) {
        androidx.paging.PagedList<T> pagedList = this.getHighSpeedVideoSizes;
        androidx.paging.PagedList<T> pagedList2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pagedList != null) {
            return pagedList.get(index);
        }
        if (pagedList2 != null) {
            pagedList2.loadAround(index);
            return pagedList2.get(index);
        }
        throw new java.lang.IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    public void submitList(androidx.paging.PagedList<T> pagedList) {
        submitList(pagedList, null);
    }

    public void submitList(final androidx.paging.PagedList<T> pagedList, final java.lang.Runnable commitCallback) {
        final int i = this.maxScheduledGeneration + 1;
        this.maxScheduledGeneration = i;
        androidx.paging.PagedList<T> pagedList2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pagedList == pagedList2) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        if (pagedList2 != null && (pagedList instanceof androidx.paging.InitialPagedList)) {
            pagedList2.removeWeakCallback(this.getHighSpeedVideoFpsRanges);
            pagedList2.removeWeakLoadStateListener((kotlin.jvm.functions.Function2) this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor.setState(androidx.paging.LoadType.REFRESH, androidx.paging.LoadState.Loading.INSTANCE);
            this.getHighSpeedVideoFpsRangesFor.setState(androidx.paging.LoadType.PREPEND, new androidx.paging.LoadState.NotLoading(false));
            this.getHighSpeedVideoFpsRangesFor.setState(androidx.paging.LoadType.APPEND, new androidx.paging.LoadState.NotLoading(false));
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        androidx.paging.PagedList<T> currentList = getCurrentList();
        if (pagedList == null) {
            int itemCount = getItemCount();
            if (pagedList2 != null) {
                pagedList2.removeWeakCallback(this.getHighSpeedVideoFpsRanges);
                pagedList2.removeWeakLoadStateListener((kotlin.jvm.functions.Function2) this.Camera2StreamConfigurationMap);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            } else if (this.getHighSpeedVideoSizes != null) {
                this.getHighSpeedVideoSizes = null;
            }
            getUpdateCallback$paging_runtime().onRemoved(0, itemCount);
            getHighSpeedVideoSizes(currentList, null, commitCallback);
            return;
        }
        if (getCurrentList() == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = pagedList;
            pagedList.addWeakLoadStateListener((kotlin.jvm.functions.Function2) this.Camera2StreamConfigurationMap);
            pagedList.addWeakCallback(this.getHighSpeedVideoFpsRanges);
            getUpdateCallback$paging_runtime().onInserted(0, pagedList.size());
            getHighSpeedVideoSizes(null, pagedList, commitCallback);
            return;
        }
        androidx.paging.PagedList<T> pagedList3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pagedList3 != null) {
            pagedList3.removeWeakCallback(this.getHighSpeedVideoFpsRanges);
            pagedList3.removeWeakLoadStateListener((kotlin.jvm.functions.Function2) this.Camera2StreamConfigurationMap);
            java.util.List<T> snapshot = pagedList3.snapshot();
            kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot, "");
            this.getHighSpeedVideoSizes = (androidx.paging.PagedList) snapshot;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        final androidx.paging.PagedList<T> pagedList4 = this.getHighSpeedVideoSizes;
        if (pagedList4 == null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException("must be in snapshot state to diff");
        }
        java.util.List<T> snapshot2 = pagedList.snapshot();
        kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot2, "");
        final androidx.paging.PagedList pagedList5 = (androidx.paging.PagedList) snapshot2;
        final androidx.paging.RecordingCallback recordingCallback = new androidx.paging.RecordingCallback();
        pagedList.addWeakCallback(recordingCallback);
        this.config.getBackgroundThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.paging.AsyncPagedListDiffer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.paging.AsyncPagedListDiffer.$r8$lambda$ARgiDPqBQphB_6NYobq82FYcQ_w(androidx.paging.PagedList.this, pagedList5, this, i, pagedList, recordingCallback, commitCallback);
            }
        });
    }

    public final void latchPagedList$paging_runtime(androidx.paging.PagedList<T> newList, androidx.paging.PagedList<T> diffSnapshot, androidx.paging.PlaceholderPaddedDiffResult diffResult, androidx.paging.RecordingCallback recordingCallback, int lastAccessIndex, java.lang.Runnable commitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffSnapshot, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordingCallback, "");
        androidx.paging.PagedList<T> pagedList = this.getHighSpeedVideoSizes;
        if (pagedList == null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException("must be in snapshot state to apply diff");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = newList;
        newList.addWeakLoadStateListener((kotlin.jvm.functions.Function2) this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizes = null;
        androidx.paging.PlaceholderPaddedListDiffHelperKt.dispatchDiff(pagedList.getPlaceholderPaddedList(), getUpdateCallback$paging_runtime(), diffSnapshot.getPlaceholderPaddedList(), diffResult);
        recordingCallback.dispatchRecordingTo(this.getHighSpeedVideoFpsRanges);
        newList.addWeakCallback(this.getHighSpeedVideoFpsRanges);
        if (!newList.isEmpty()) {
            newList.loadAround(kotlin.ranges.RangesKt.coerceIn(androidx.paging.PlaceholderPaddedListDiffHelperKt.transformAnchorIndex(pagedList.getPlaceholderPaddedList(), diffResult, diffSnapshot.getPlaceholderPaddedList(), lastAccessIndex), 0, newList.size() - 1));
        }
        getHighSpeedVideoSizes(pagedList, this.getHighResolutionOutputSizeshNQ4ISI, commitCallback);
    }

    private final void getHighSpeedVideoSizes(androidx.paging.PagedList<T> p0, androidx.paging.PagedList<T> p1, java.lang.Runnable p2) {
        java.util.Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((androidx.paging.AsyncPagedListDiffer.PagedListListener) it.next()).onCurrentListChanged(p0, p1);
        }
        if (p2 != null) {
            p2.run();
        }
    }

    public void addPagedListListener(androidx.paging.AsyncPagedListDiffer.PagedListListener<T> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.listeners.add(listener);
    }

    public final void addPagedListListener(kotlin.jvm.functions.Function2<? super androidx.paging.PagedList<T>, ? super androidx.paging.PagedList<T>, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.listeners.add(new androidx.paging.AsyncPagedListDiffer.OnCurrentListChangedWrapper(callback));
    }

    public void removePagedListListener(androidx.paging.AsyncPagedListDiffer.PagedListListener<T> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.listeners.remove(listener);
    }

    public final void removePagedListListener(final kotlin.jvm.functions.Function2<? super androidx.paging.PagedList<T>, ? super androidx.paging.PagedList<T>, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.listeners, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.AsyncPagedListDiffer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.paging.AsyncPagedListDiffer.$r8$lambda$UQStsLO4VsuQ0WxxpBiQdMN0l7A(kotlin.jvm.functions.Function2.this, (androidx.paging.AsyncPagedListDiffer.PagedListListener) obj));
            }
        });
    }

    public void addLoadStateListener(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        androidx.paging.PagedList<T> pagedList = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pagedList != null) {
            pagedList.addWeakLoadStateListener(listener);
        } else {
            this.getHighSpeedVideoFpsRangesFor.dispatchCurrentLoadState(listener);
        }
        this.loadStateListeners.add(listener);
    }

    public void removeLoadStateListener(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.loadStateListeners.remove(listener);
        androidx.paging.PagedList<T> pagedList = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pagedList != null) {
            pagedList.removeWeakLoadStateListener(listener);
        }
    }

    public static /* synthetic */ void $r8$lambda$ARgiDPqBQphB_6NYobq82FYcQ_w(final androidx.paging.PagedList pagedList, final androidx.paging.PagedList pagedList2, final androidx.paging.AsyncPagedListDiffer asyncPagedListDiffer, final int i, final androidx.paging.PagedList pagedList3, final androidx.paging.RecordingCallback recordingCallback, final java.lang.Runnable runnable) {
        androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList = pagedList.getPlaceholderPaddedList();
        androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList2 = pagedList2.getPlaceholderPaddedList();
        androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback = asyncPagedListDiffer.config.getDiffCallback();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(diffCallback, "");
        final androidx.paging.PlaceholderPaddedDiffResult computeDiff = androidx.paging.PlaceholderPaddedListDiffHelperKt.computeDiff(placeholderPaddedList, placeholderPaddedList2, diffCallback);
        asyncPagedListDiffer.mainThreadExecutor.execute(new java.lang.Runnable() { // from class: androidx.paging.AsyncPagedListDiffer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.paging.AsyncPagedListDiffer.$r8$lambda$iZbNCPF3aDXJgTEIAQ6rYV76C0Q(androidx.paging.AsyncPagedListDiffer.this, i, pagedList3, pagedList2, computeDiff, recordingCallback, pagedList, runnable);
            }
        });
    }

    public static /* synthetic */ boolean $r8$lambda$UQStsLO4VsuQ0WxxpBiQdMN0l7A(kotlin.jvm.functions.Function2 function2, androidx.paging.AsyncPagedListDiffer.PagedListListener pagedListListener) {
        return (pagedListListener instanceof androidx.paging.AsyncPagedListDiffer.OnCurrentListChangedWrapper) && ((androidx.paging.AsyncPagedListDiffer.OnCurrentListChangedWrapper) pagedListListener).getHighSpeedVideoSizes() == function2;
    }

    public static /* synthetic */ void $r8$lambda$iZbNCPF3aDXJgTEIAQ6rYV76C0Q(androidx.paging.AsyncPagedListDiffer asyncPagedListDiffer, int i, androidx.paging.PagedList pagedList, androidx.paging.PagedList pagedList2, androidx.paging.PlaceholderPaddedDiffResult placeholderPaddedDiffResult, androidx.paging.RecordingCallback recordingCallback, androidx.paging.PagedList pagedList3, java.lang.Runnable runnable) {
        if (asyncPagedListDiffer.maxScheduledGeneration == i) {
            asyncPagedListDiffer.latchPagedList$paging_runtime(pagedList, pagedList2, placeholderPaddedDiffResult, recordingCallback, pagedList3.lastLoad(), runnable);
        }
    }
}
