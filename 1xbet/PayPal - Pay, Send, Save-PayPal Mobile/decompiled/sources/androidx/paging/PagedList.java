package androidx.paging;

@kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u0000 q*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006qrstuvBA\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0013H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H&¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010!J\u0017\u0010)\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010%J\u001a\u0010.\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u001fJ\u0013\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001¢\u0006\u0004\b2\u00103J'\u00105\u001a\u00020\u00192\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b5\u0010\u001cJ'\u00106\u001a\u00020\u00192\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b6\u0010\u001cJ'\u00109\u001a\u00020\u00192\u000e\u00107\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001012\u0006\u0010\u001a\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:J\u0015\u00109\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u000208¢\u0006\u0004\b9\u0010;J\u0015\u0010<\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u000208¢\u0006\u0004\b<\u0010;J\u001f\u0010?\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0013H\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0013¢\u0006\u0004\bA\u0010@J\u001d\u0010B\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0013¢\u0006\u0004\bB\u0010@R$\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010KR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bP\u0010QR$\u0010(\u001a\u0004\u0018\u00010'8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010*R\u001a\u0010V\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010\u0015R \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080Z0Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R2\u0010^\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00160Z0Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010`\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0015R$\u0010e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000a8GX\u0087\u0004¢\u0006\f\u0012\u0004\bd\u0010!\u001a\u0004\bb\u0010cR\u0016\u0010h\u001a\u0004\u0018\u00010\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020i8'X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0011\u0010m\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bl\u0010\u0015R\u0014\u0010n\u001a\u00020i8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010kR\u0011\u0010p\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bo\u0010\u0015"}, d2 = {"Landroidx/paging/PagedList;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/PagingSource;", "pagingSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "Landroidx/paging/PagedStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedStorage;Landroidx/paging/PagedList$Config;)V", "Landroidx/paging/PlaceholderPaddedList;", "getPlaceholderPaddedList", "()Landroidx/paging/PlaceholderPaddedList;", "", "lastLoad", "()I", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", com.sun.jna.Callback.METHOD_NAME, "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "index", "loadAroundInternal", "(I)V", "detach", "()V", "loadType", "loadState", "setInitialLoadState", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "retry", "Ljava/lang/Runnable;", "refreshRetryCallback", "setRetryCallback", "(Ljava/lang/Runnable;)V", "type", "state", "dispatchStateChangeAsync$paging_common", "get", "(I)Ljava/lang/Object;", "loadAround", "", "snapshot", "()Ljava/util/List;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addWeakLoadStateListener", "removeWeakLoadStateListener", "previousSnapshot", "Landroidx/paging/PagedList$Callback;", "addWeakCallback", "(Ljava/util/List;Landroidx/paging/PagedList$Callback;)V", "(Landroidx/paging/PagedList$Callback;)V", "removeWeakCallback", com.daon.sdk.face.license.License.FEATURE_POSITION, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "notifyInserted$paging_common", "(II)V", "notifyChanged", "notifyRemoved", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$paging_common", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getNotifyDispatcher$paging_common", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/paging/PagedStorage;", "getStorage$paging_common", "()Landroidx/paging/PagedStorage;", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "Ljava/lang/Runnable;", "getRefreshRetryCallback$paging_common", "()Ljava/lang/Runnable;", "setRefreshRetryCallback$paging_common", "requiredRemainder", com.visa.cbp.getEncExpo.warmup, "getRequiredRemainder$paging_common", "", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/paging/DataSource;", "getDataSource", "()Landroidx/paging/DataSource;", "getDataSource$annotations", "dataSource", "getLastKey", "()Ljava/lang/Object;", "lastKey", "", "isDetached", "()Z", "getLoadedCount", "loadedCount", "isImmutable", "getPositionOffset", "positionOffset", "Companion", "Builder", "Callback", "Config", "BoundaryCallback", "LoadStateManager"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagedList<T> extends java.util.AbstractList<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.paging.PagedList.Companion INSTANCE = new androidx.paging.PagedList.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<java.lang.ref.WeakReference<androidx.paging.PagedList.Callback>> getHighSpeedVideoFpsRangesFor;
    private final androidx.paging.PagedList.Config config;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final java.util.List<java.lang.ref.WeakReference<kotlin.jvm.functions.Function2<androidx.paging.LoadType, androidx.paging.LoadState, kotlin.Unit>>> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineDispatcher notifyDispatcher;
    private final androidx.paging.PagingSource<?, T> pagingSource;
    private java.lang.Runnable refreshRetryCallback;
    private final int requiredRemainder;
    private final androidx.paging.PagedStorage<T> storage;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\t"}, d2 = {"Landroidx/paging/PagedList$Callback;", "", "<init>", "()V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "onChanged", "(II)V", "onInserted", "onRemoved"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Callback {
        public abstract void onChanged(int position, int count);

        public abstract void onInserted(int position, int count);

        public abstract void onRemoved(int position, int count);
    }

    @kotlin.Deprecated(message = "DataSource is deprecated and has been replaced by PagingSource. PagedList offers indirect ways of controlling fetch ('loadAround()', 'retry()') so that you should not need to access the DataSource/PagingSource.")
    public static /* synthetic */ void getDataSource$annotations() {
    }

    public abstract void detach();

    public abstract void dispatchCurrentLoadState(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> callback);

    public abstract java.lang.Object getLastKey();

    /* renamed from: isDetached */
    public abstract boolean getIsDetached();

    public abstract void loadAroundInternal(int index);

    public void retry() {
    }

    public PagedList(androidx.paging.PagingSource<?, T> pagingSource, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, androidx.paging.PagedStorage<T> pagedStorage, androidx.paging.PagedList.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagedStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.pagingSource = pagingSource;
        this.coroutineScope = coroutineScope;
        this.notifyDispatcher = coroutineDispatcher;
        this.storage = pagedStorage;
        this.config = config;
        this.requiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return (T) removeAt(i);
    }

    public java.lang.Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    public androidx.paging.PagingSource<?, T> getPagingSource() {
        return this.pagingSource;
    }

    /* renamed from: getCoroutineScope$paging_common, reason: from getter */
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: getNotifyDispatcher$paging_common, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getNotifyDispatcher() {
        return this.notifyDispatcher;
    }

    public final androidx.paging.PagedStorage<T> getStorage$paging_common() {
        return this.storage;
    }

    public final androidx.paging.PagedList.Config getConfig() {
        return this.config;
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\b\b\u0001\u0010\u0004*\u00020\u0001\"\b\b\u0002\u0010\u0005*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/paging/PagedList$Companion;", "", "<init>", "()V", "K", "T", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$Config;", "config", "key", "Landroidx/paging/PagedList;", "create", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;", "", "currentSize", "snapshotSize", "Landroidx/paging/PagedList$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "dispatchNaiveUpdatesSinceSnapshot$paging_common", "(IILandroidx/paging/PagedList$Callback;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final <K, T> androidx.paging.PagedList<T> create(androidx.paging.PagingSource<K, T> pagingSource, androidx.paging.PagingSource.LoadResult.Page<K, T> initialPage, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher notifyDispatcher, kotlinx.coroutines.CoroutineDispatcher fetchDispatcher, androidx.paging.PagedList.BoundaryCallback<T> boundaryCallback, androidx.paging.PagedList.Config config, K key) {
            androidx.paging.PagingSource.LoadResult.Page<K, T> page;
            java.lang.Object runBlocking$default;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyDispatcher, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchDispatcher, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            if (initialPage == null) {
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new androidx.paging.PagedList$Companion$create$resolvedInitialPage$1(pagingSource, new androidx.paging.PagingSource.LoadParams.Refresh(key, config.initialLoadSizeHint, config.enablePlaceholders), null), 1, null);
                page = (androidx.paging.PagingSource.LoadResult.Page) runBlocking$default;
            } else {
                page = initialPage;
            }
            return new androidx.paging.ContiguousPagedList(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, boundaryCallback, config, page, key);
        }

        public final void dispatchNaiveUpdatesSinceSnapshot$paging_common(int currentSize, int snapshotSize, androidx.paging.PagedList.Callback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            if (snapshotSize < currentSize) {
                if (snapshotSize > 0) {
                    callback.onChanged(0, snapshotSize);
                }
                int i = currentSize - snapshotSize;
                if (i > 0) {
                    callback.onInserted(snapshotSize, i);
                    return;
                }
                return;
            }
            if (currentSize > 0) {
                callback.onChanged(0, currentSize);
            }
            int i2 = snapshotSize - currentSize;
            if (i2 != 0) {
                callback.onRemoved(currentSize, i2);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB9\b\u0016\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0011B9\b\u0016\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0012J!\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ)\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010#¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00020*¢\u0006\u0004\b+\u0010,R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00104\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00105R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010-\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010:R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"Landroidx/paging/PagedList$Builder;", "", "Key", "Value", "Landroidx/paging/DataSource;", "dataSource", "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource;I)V", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedList$Config;)V", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;I)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/paging/PagedList$Builder;", "Ljava/util/concurrent/Executor;", "notifyExecutor", "setNotifyExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/paging/PagedList$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "setNotifyDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/paging/PagedList$Builder;", "fetchExecutor", "setFetchExecutor", "fetchDispatcher", "setFetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/PagedList$Builder;", "initialKey", "setInitialKey", "(Ljava/lang/Object;)Landroidx/paging/PagedList$Builder;", "Landroidx/paging/PagedList;", "build", "()Landroidx/paging/PagedList;", "getInputFormats", "Landroidx/paging/PagingSource;", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/DataSource;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Landroidx/paging/PagingSource$LoadResult$Page;", "getHighSpeedVideoFpsRanges", "Landroidx/paging/PagedList$Config;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/paging/PagedList$BoundaryCallback;", "getOutputMinFrameDuration", "Ljava/lang/Object;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData, which no longer supports constructing snapshots of loaded data manually.", replaceWith = @kotlin.ReplaceWith(expression = "Pager.flow", imports = {"androidx.paging.Pager"}))
    public static final class Builder<Key, Value> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.paging.PagedList.Config Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.paging.PagedList.BoundaryCallback<Value> getOutputMinFrameDuration;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.paging.DataSource<Key, Value> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private kotlinx.coroutines.CoroutineDispatcher getInputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private final androidx.paging.PagingSource<Key, Value> getHighSpeedVideoFpsRangesFor;
        private kotlinx.coroutines.CoroutineDispatcher getInputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final androidx.paging.PagingSource.LoadResult.Page<Key, Value> getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private Key getHighSpeedVideoSizesFor;

        public Builder(androidx.paging.DataSource<Key, Value> dataSource, androidx.paging.PagedList.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.getHighSpeedVideoSizes = kotlinx.coroutines.GlobalScope.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = dataSource;
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.paging.DataSource<Key, Value> dataSource, int i) {
            this(dataSource, androidx.paging.PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "");
        }

        public Builder(androidx.paging.PagingSource<Key, Value> pagingSource, androidx.paging.PagingSource.LoadResult.Page<Key, Value> page, androidx.paging.PagedList.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.getHighSpeedVideoSizes = kotlinx.coroutines.GlobalScope.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = pagingSource;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = page;
            this.Camera2StreamConfigurationMap = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.paging.PagingSource<Key, Value> pagingSource, androidx.paging.PagingSource.LoadResult.Page<Key, Value> page, int i) {
            this(pagingSource, page, androidx.paging.PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        }

        public final androidx.paging.PagedList.Builder<Key, Value> setCoroutineScope(kotlinx.coroutines.CoroutineScope coroutineScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
            this.getHighSpeedVideoSizes = coroutineScope;
            return this;
        }

        @kotlin.Deprecated(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.ReplaceWith(expression = "setNotifyDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        public final androidx.paging.PagedList.Builder<Key, Value> setNotifyExecutor(java.util.concurrent.Executor notifyExecutor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyExecutor, "");
            this.getInputSizeshNQ4ISI = kotlinx.coroutines.ExecutorsKt.from(notifyExecutor);
            return this;
        }

        public final androidx.paging.PagedList.Builder<Key, Value> setNotifyDispatcher(kotlinx.coroutines.CoroutineDispatcher notifyDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyDispatcher, "");
            this.getInputSizeshNQ4ISI = notifyDispatcher;
            return this;
        }

        @kotlin.Deprecated(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.ReplaceWith(expression = "setFetchDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        public final androidx.paging.PagedList.Builder<Key, Value> setFetchExecutor(java.util.concurrent.Executor fetchExecutor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchExecutor, "");
            this.getInputFormats = kotlinx.coroutines.ExecutorsKt.from(fetchExecutor);
            return this;
        }

        public final androidx.paging.PagedList.Builder<Key, Value> setFetchDispatcher(kotlinx.coroutines.CoroutineDispatcher fetchDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchDispatcher, "");
            this.getInputFormats = fetchDispatcher;
            return this;
        }

        public final androidx.paging.PagedList.Builder<Key, Value> setBoundaryCallback(androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback) {
            this.getOutputMinFrameDuration = boundaryCallback;
            return this;
        }

        public final androidx.paging.PagedList.Builder<Key, Value> setInitialKey(Key initialKey) {
            this.getHighSpeedVideoSizesFor = initialKey;
            return this;
        }

        public final androidx.paging.PagedList<Value> build() {
            androidx.paging.PagingSource<Key, Value> pagingSource;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getInputFormats;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = kotlinx.coroutines.Dispatchers.getIO();
            }
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            androidx.paging.PagingSource<Key, Value> pagingSource2 = this.getHighSpeedVideoFpsRangesFor;
            if (pagingSource2 == null) {
                androidx.paging.DataSource<Key, Value> dataSource = this.getHighResolutionOutputSizeshNQ4ISI;
                pagingSource = dataSource != null ? new androidx.paging.LegacyPagingSource(coroutineDispatcher2, dataSource) : null;
            } else {
                pagingSource = pagingSource2;
            }
            if (pagingSource instanceof androidx.paging.LegacyPagingSource) {
                ((androidx.paging.LegacyPagingSource) pagingSource).setPageSize(this.Camera2StreamConfigurationMap.pageSize);
            }
            if (pagingSource == null) {
                throw new java.lang.IllegalStateException("PagedList cannot be built without a PagingSource or DataSource".toString());
            }
            androidx.paging.PagedList.Companion companion = androidx.paging.PagedList.INSTANCE;
            androidx.paging.PagingSource.LoadResult.Page<Key, Value> page = this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoSizes;
            kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher = this.getInputSizeshNQ4ISI;
            if (mainCoroutineDispatcher == null) {
                mainCoroutineDispatcher = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
            }
            return companion.create(pagingSource, page, coroutineScope, mainCoroutineDispatcher, coroutineDispatcher2, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u000b"}, d2 = {"Landroidx/paging/PagedList$Config;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSizeHint", "maxSize", "<init>", "(IIZII)V", com.visa.cbp.getEncExpo.warmup, "Z", "Companion", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.paging.PagedList.Config.Companion INSTANCE = new androidx.paging.PagedList.Config.Companion(null);
        public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
        public final boolean enablePlaceholders;
        public final int initialLoadSizeHint;
        public final int maxSize;
        public final int pageSize;
        public final int prefetchDistance;

        public Config(int i, int i2, boolean z, int i3, int i4) {
            this.pageSize = i;
            this.prefetchDistance = i2;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = i3;
            this.maxSize = i4;
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016"}, d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "<init>", "()V", "", "pageSize", "setPageSize", "(I)Landroidx/paging/PagedList$Config$Builder;", "prefetchDistance", "setPrefetchDistance", "", "enablePlaceholders", "setEnablePlaceholders", "(Z)Landroidx/paging/PagedList$Config$Builder;", "initialLoadSizeHint", "setInitialLoadSizeHint", "maxSize", "setMaxSize", "Landroidx/paging/PagedList$Config;", "build", "()Landroidx/paging/PagedList$Config;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
            public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private int getHighResolutionOutputSizeshNQ4ISI = -1;
            private int Camera2StreamConfigurationMap = -1;

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private int getHighSpeedVideoFpsRanges = -1;

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private boolean getHighSpeedVideoSizes = true;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private int getHighSpeedVideoFpsRangesFor = Integer.MAX_VALUE;

            public final androidx.paging.PagedList.Config.Builder setPageSize(int pageSize) {
                if (pageSize <= 0) {
                    throw new java.lang.IllegalArgumentException("Page size must be a positive number");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = pageSize;
                return this;
            }

            public final androidx.paging.PagedList.Config.Builder setPrefetchDistance(int prefetchDistance) {
                this.Camera2StreamConfigurationMap = prefetchDistance;
                return this;
            }

            public final androidx.paging.PagedList.Config.Builder setEnablePlaceholders(boolean enablePlaceholders) {
                this.getHighSpeedVideoSizes = enablePlaceholders;
                return this;
            }

            public final androidx.paging.PagedList.Config.Builder setInitialLoadSizeHint(int initialLoadSizeHint) {
                this.getHighSpeedVideoFpsRanges = initialLoadSizeHint;
                return this;
            }

            public final androidx.paging.PagedList.Config.Builder setMaxSize(int maxSize) {
                this.getHighSpeedVideoFpsRangesFor = maxSize;
                return this;
            }

            public final androidx.paging.PagedList.Config build() {
                if (this.Camera2StreamConfigurationMap < 0) {
                    this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
                }
                if (this.getHighSpeedVideoFpsRanges < 0) {
                    this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI * 3;
                }
                boolean z = this.getHighSpeedVideoSizes;
                if (!z && this.Camera2StreamConfigurationMap == 0) {
                    throw new java.lang.IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == Integer.MAX_VALUE || i >= this.getHighResolutionOutputSizeshNQ4ISI + (this.Camera2StreamConfigurationMap * 2)) {
                    return new androidx.paging.PagedList.Config(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, z, this.getHighSpeedVideoFpsRanges, i);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(", prefetchDist=");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(", maxSize=");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003"}, d2 = {"Landroidx/paging/PagedList$Config$Companion;", "", "<init>", "()V", "", "MAX_SIZE_UNBOUNDED", com.visa.cbp.getEncExpo.warmup, "getMAX_SIZE_UNBOUNDED$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
            }

            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015"}, d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "<init>", "()V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/LoadState;", "state", "", "setState", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "onStateChanged", "Lkotlin/Function2;", com.sun.jna.Callback.METHOD_NAME, "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "refreshState", "Landroidx/paging/LoadState;", "getRefreshState", "()Landroidx/paging/LoadState;", "setRefreshState", "(Landroidx/paging/LoadState;)V", "startState", "getStartState", "setStartState", "endState", "getEndState", "setEndState"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadStateManager {
        private androidx.paging.LoadState refreshState = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
        private androidx.paging.LoadState startState = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
        private androidx.paging.LoadState endState = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();

        public abstract void onStateChanged(androidx.paging.LoadType type, androidx.paging.LoadState state);

        public final androidx.paging.LoadState getRefreshState() {
            return this.refreshState;
        }

        public final void setRefreshState(androidx.paging.LoadState loadState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
            this.refreshState = loadState;
        }

        public final androidx.paging.LoadState getStartState() {
            return this.startState;
        }

        public final void setStartState(androidx.paging.LoadState loadState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
            this.startState = loadState;
        }

        public final androidx.paging.LoadState getEndState() {
            return this.endState;
        }

        public final void setEndState(androidx.paging.LoadState loadState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
            this.endState = loadState;
        }

        public final void setState(androidx.paging.LoadType type, androidx.paging.LoadState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            int i = androidx.paging.PagedList.LoadStateManager.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.endState, state)) {
                        return;
                    } else {
                        this.endState = state;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(this.startState, state)) {
                    return;
                } else {
                    this.startState = state;
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(this.refreshState, state)) {
                return;
            } else {
                this.refreshState = state;
            }
            onStateChanged(type, state);
        }

        public final void dispatchCurrentLoadState(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            callback.invoke(androidx.paging.LoadType.REFRESH, this.refreshState);
            callback.invoke(androidx.paging.LoadType.PREPEND, this.startState);
            callback.invoke(androidx.paging.LoadType.APPEND, this.endState);
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.paging.LoadType.values().length];
                try {
                    iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.paging.LoadType.APPEND.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public final androidx.paging.PlaceholderPaddedList<T> getPlaceholderPaddedList() {
        return this.storage;
    }

    /* renamed from: getRefreshRetryCallback$paging_common, reason: from getter */
    public final java.lang.Runnable getRefreshRetryCallback() {
        return this.refreshRetryCallback;
    }

    public final void setRefreshRetryCallback$paging_common(java.lang.Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    public final int lastLoad() {
        return this.storage.getLastLoadAroundIndex();
    }

    /* renamed from: getRequiredRemainder$paging_common, reason: from getter */
    public final int getRequiredRemainder() {
        return this.requiredRemainder;
    }

    public int getSize() {
        return this.storage.size();
    }

    public final androidx.paging.DataSource<?, T> getDataSource() {
        androidx.paging.PagingSource<?, T> pagingSource = getPagingSource();
        if (pagingSource instanceof androidx.paging.LegacyPagingSource) {
            androidx.paging.DataSource<?, T> dataSource$paging_common = ((androidx.paging.LegacyPagingSource) pagingSource).getDataSource$paging_common();
            kotlin.jvm.internal.Intrinsics.checkNotNull(dataSource$paging_common, "");
            return dataSource$paging_common;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempt to access dataSource on a PagedList that was instantiated with a ");
        sb.append(pagingSource.getClass().getSimpleName());
        sb.append(" instead of a DataSource");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final int getLoadedCount() {
        return this.storage.getDataCount();
    }

    /* renamed from: isImmutable */
    public boolean getIsImmutable() {
        return getIsDetached();
    }

    public final int getPositionOffset() {
        return this.storage.getPositionOffset();
    }

    public final void setRetryCallback(java.lang.Runnable refreshRetryCallback) {
        this.refreshRetryCallback = refreshRetryCallback;
    }

    public final void dispatchStateChangeAsync$paging_common(androidx.paging.LoadType type, androidx.paging.LoadState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.notifyDispatcher, null, new androidx.paging.PagedList$dispatchStateChangeAsync$1(this, type, state, null), 2, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        return this.storage.get(index);
    }

    public final void loadAround(int index) {
        if (index < 0 || index >= size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
            sb.append(index);
            sb.append(", Size: ");
            sb.append(size());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        this.storage.setLastLoadAroundIndex(index);
        loadAroundInternal(index);
    }

    public final java.util.List<T> snapshot() {
        return getIsImmutable() ? this : new androidx.paging.SnapshotPagedList(this);
    }

    public final void addWeakLoadStateListener(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagedList$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.paging.PagedList.m9261$r8$lambda$VDlqjGe8S_ibL9I0PKDkBPGzdc((java.lang.ref.WeakReference) obj));
            }
        });
        this.getHighSpeedVideoFpsRanges.add(new java.lang.ref.WeakReference<>(listener));
        dispatchCurrentLoadState(listener);
    }

    public final void removeWeakLoadStateListener(final kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagedList$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.paging.PagedList.$r8$lambda$RTWIj9qz8IYIGYci1cp_c3Ehi1Y(kotlin.jvm.functions.Function2.this, (java.lang.ref.WeakReference) obj));
            }
        });
    }

    @kotlin.Deprecated(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    public final void addWeakCallback(java.util.List<? extends T> previousSnapshot, androidx.paging.PagedList.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        if (previousSnapshot != null && previousSnapshot != this) {
            INSTANCE.dispatchNaiveUpdatesSinceSnapshot$paging_common(size(), previousSnapshot.size(), callback);
        }
        addWeakCallback(callback);
    }

    public final void addWeakCallback(androidx.paging.PagedList.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagedList$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.paging.PagedList.$r8$lambda$9IAm2_YGagiANiKuG0lfUU3WY4s((java.lang.ref.WeakReference) obj));
            }
        });
        this.getHighSpeedVideoFpsRangesFor.add(new java.lang.ref.WeakReference<>(callback));
    }

    public final void removeWeakCallback(final androidx.paging.PagedList.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagedList$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.paging.PagedList.m9260$r8$lambda$EBBTSczhIt6awnEt5m03ryNx6E(androidx.paging.PagedList.Callback.this, (java.lang.ref.WeakReference) obj));
            }
        });
    }

    public final void notifyInserted$paging_common(int position, int count) {
        if (count != 0) {
            java.util.Iterator<T> it = kotlin.collections.CollectionsKt.reversed(this.getHighSpeedVideoFpsRangesFor).iterator();
            while (it.hasNext()) {
                androidx.paging.PagedList.Callback callback = (androidx.paging.PagedList.Callback) ((java.lang.ref.WeakReference) it.next()).get();
                if (callback != null) {
                    callback.onInserted(position, count);
                }
            }
        }
    }

    public final void notifyChanged(int position, int count) {
        if (count != 0) {
            java.util.Iterator<T> it = kotlin.collections.CollectionsKt.reversed(this.getHighSpeedVideoFpsRangesFor).iterator();
            while (it.hasNext()) {
                androidx.paging.PagedList.Callback callback = (androidx.paging.PagedList.Callback) ((java.lang.ref.WeakReference) it.next()).get();
                if (callback != null) {
                    callback.onChanged(position, count);
                }
            }
        }
    }

    public final void notifyRemoved(int position, int count) {
        if (count != 0) {
            java.util.Iterator<T> it = kotlin.collections.CollectionsKt.reversed(this.getHighSpeedVideoFpsRangesFor).iterator();
            while (it.hasNext()) {
                androidx.paging.PagedList.Callback callback = (androidx.paging.PagedList.Callback) ((java.lang.ref.WeakReference) it.next()).get();
                if (callback != null) {
                    callback.onRemoved(position, count);
                }
            }
        }
    }

    public static /* synthetic */ boolean $r8$lambda$9IAm2_YGagiANiKuG0lfUU3WY4s(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null;
    }

    /* renamed from: $r8$lambda$E-BBTSczhIt6awnEt5m03ryNx6E, reason: not valid java name */
    public static /* synthetic */ boolean m9260$r8$lambda$EBBTSczhIt6awnEt5m03ryNx6E(androidx.paging.PagedList.Callback callback, java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null || weakReference.get() == callback;
    }

    public static /* synthetic */ boolean $r8$lambda$RTWIj9qz8IYIGYci1cp_c3Ehi1Y(kotlin.jvm.functions.Function2 function2, java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null || weakReference.get() == function2;
    }

    /* renamed from: $r8$lambda$VD-lqjGe8S_ibL9I0PKDkBPGzdc, reason: not valid java name */
    public static /* synthetic */ boolean m9261$r8$lambda$VDlqjGe8S_ibL9I0PKDkBPGzdc(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null;
    }

    public void setInitialLoadState(androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\t"}, d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "", "T", "<init>", "()V", "", "onZeroItemsLoaded", "itemAtFront", "onItemAtFrontLoaded", "(Ljava/lang/Object;)V", "itemAtEnd", "onItemAtEndLoaded"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BoundaryCallback<T> {
        public void onZeroItemsLoaded() {
        }

        public void onItemAtFrontLoaded(T itemAtFront) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemAtFront, "");
        }

        public void onItemAtEndLoaded(T itemAtEnd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemAtEnd, "");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final <K, T> androidx.paging.PagedList<T> create(androidx.paging.PagingSource<K, T> pagingSource, androidx.paging.PagingSource.LoadResult.Page<K, T> page, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, androidx.paging.PagedList.BoundaryCallback<T> boundaryCallback, androidx.paging.PagedList.Config config, K k) {
        return INSTANCE.create(pagingSource, page, coroutineScope, coroutineDispatcher, coroutineDispatcher2, boundaryCallback, config, k);
    }
}
