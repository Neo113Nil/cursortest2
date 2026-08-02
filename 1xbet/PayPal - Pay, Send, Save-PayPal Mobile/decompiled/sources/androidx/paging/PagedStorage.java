package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b \b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001\\B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\rB\u0017\b\u0012\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0006\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\b2\u0010\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001e\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010 \u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b(\u0010\"J'\u0010)\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b/\u0010.J%\u00101\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u0010*J/\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b3\u00104J/\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b5\u00104J-\u00106\u001a\u00020\u00172\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b6\u00107J-\u00108\u001a\u00020\u00172\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b8\u00107J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010=R\u0014\u0010@\u001a\u00028\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00028\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R$\u0010C\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010G\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bI\u0010FR\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010L\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010FR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010DR$\u0010S\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bT\u0010FR\u0016\u0010W\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010?R\u0016\u0010Y\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010?R\u0014\u0010[\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010F"}, d2 = {"Landroidx/paging/PagedStorage;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/PlaceholderPaddedList;", "<init>", "()V", "", "leadingNulls", "Landroidx/paging/PagingSource$LoadResult$Page;", "page", "trailingNulls", "(ILandroidx/paging/PagingSource$LoadResult$Page;I)V", "p0", "(Landroidx/paging/PagedStorage;)V", "snapshot", "()Landroidx/paging/PagedStorage;", "p1", "p2", "p3", "", "p4", "", "getHighSpeedVideoSizes", "(ILandroidx/paging/PagingSource$LoadResult$Page;IIZ)V", "positionOffset", "Landroidx/paging/PagedStorage$Callback;", com.sun.jna.Callback.METHOD_NAME, "counted", "init", "(ILandroidx/paging/PagingSource$LoadResult$Page;IILandroidx/paging/PagedStorage$Callback;Z)V", "index", "getItem", "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingState;", "getRefreshKeyInfo", "(Landroidx/paging/PagedList$Config;)Landroidx/paging/PagingState;", "get", "Camera2StreamConfigurationMap", "(III)Z", "maxSize", "requiredRemaining", "needsTrimFromFront", "(II)Z", "needsTrimFromEnd", "countToBeAdded", "shouldPreTrimNewPage", "insertNulls", "trimFromFront$paging_common", "(ZIILandroidx/paging/PagedStorage$Callback;)Z", "trimFromEnd$paging_common", "prependPage$paging_common", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedStorage$Callback;)V", "appendPage$paging_common", "", "toString", "()Ljava/lang/String;", "", "Ljava/util/List;", "getFirstLoadedItem$paging_common", "()Ljava/lang/Object;", "firstLoadedItem", "getLastLoadedItem$paging_common", "lastLoadedItem", "placeholdersBefore", com.visa.cbp.getEncExpo.warmup, "getPlaceholdersBefore", "()I", "placeholdersAfter", "getPlaceholdersAfter", "getPositionOffset", "getHighSpeedVideoFpsRangesFor", "Z", "dataCount", "getDataCount", "getHighResolutionOutputSizeshNQ4ISI", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getLastLoadAroundIndex", "setLastLoadAroundIndex", "(I)V", "lastLoadAroundIndex", "getMiddleOfLoadedRange", "middleOfLoadedRange", "getPrevKey", "prevKey", "getNextKey", "nextKey", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Callback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagedStorage<T> extends java.util.AbstractList<T> implements androidx.paging.LegacyPageFetcher.KeyProvider<java.lang.Object>, androidx.paging.PlaceholderPaddedList<T> {
    private int dataCount;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private final java.util.List<androidx.paging.PagingSource.LoadResult.Page<?, T>> getHighSpeedVideoSizes;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private int positionOffset;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "onInitialized", "(I)V", "leadingNulls", "changed", "added", "onPagePrepended", "(III)V", "endPosition", "onPageAppended", "startOfDrops", "onPagesRemoved", "(II)V", "onPagesSwappedToPlaceholder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface Callback {
        void onInitialized(int count);

        void onPageAppended(int endPosition, int changed, int added);

        void onPagePrepended(int leadingNulls, int changed, int added);

        void onPagesRemoved(int startOfDrops, int count);

        void onPagesSwappedToPlaceholder(int startOfDrops, int count);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return (T) removeAt(i);
    }

    public final java.lang.Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    public final T getFirstLoadedItem$paging_common() {
        return (T) kotlin.collections.CollectionsKt.first(((androidx.paging.PagingSource.LoadResult.Page) kotlin.collections.CollectionsKt.first((java.util.List) this.getHighSpeedVideoSizes)).getData());
    }

    public final T getLastLoadedItem$paging_common() {
        return (T) kotlin.collections.CollectionsKt.last(((androidx.paging.PagingSource.LoadResult.Page) kotlin.collections.CollectionsKt.last((java.util.List) this.getHighSpeedVideoSizes)).getData());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final int getPositionOffset() {
        return this.positionOffset;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final int getDataCount() {
        return this.dataCount;
    }

    public final int getLastLoadAroundIndex() {
        return getPlaceholdersBefore() + this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setLastLoadAroundIndex(int i) {
        this.getHighSpeedVideoFpsRangesFor = kotlin.ranges.RangesKt.coerceIn(i - getPlaceholdersBefore(), 0, getDataCount() - 1);
    }

    public final int getMiddleOfLoadedRange() {
        return getPlaceholdersBefore() + (getDataCount() / 2);
    }

    public PagedStorage() {
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagedStorage(int i, androidx.paging.PagingSource.LoadResult.Page<?, T> page, int i2) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        getHighSpeedVideoSizes(i, page, i2, 0, true);
    }

    private PagedStorage(androidx.paging.PagedStorage<T> pagedStorage) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = arrayList;
        this.Camera2StreamConfigurationMap = true;
        arrayList.addAll(pagedStorage.getHighSpeedVideoSizes);
        this.placeholdersBefore = pagedStorage.getPlaceholdersBefore();
        this.placeholdersAfter = pagedStorage.getPlaceholdersAfter();
        this.positionOffset = pagedStorage.positionOffset;
        this.Camera2StreamConfigurationMap = pagedStorage.Camera2StreamConfigurationMap;
        this.dataCount = pagedStorage.getDataCount();
        this.getHighSpeedVideoFpsRangesFor = pagedStorage.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.paging.PagedStorage<T> snapshot() {
        return new androidx.paging.PagedStorage<>(this);
    }

    private final void getHighSpeedVideoSizes(int p0, androidx.paging.PagingSource.LoadResult.Page<?, T> p1, int p2, int p3, boolean p4) {
        this.placeholdersBefore = p0;
        this.getHighSpeedVideoSizes.clear();
        this.getHighSpeedVideoSizes.add(p1);
        this.placeholdersAfter = p2;
        this.positionOffset = p3;
        this.dataCount = p1.getData().size();
        this.Camera2StreamConfigurationMap = p4;
        this.getHighSpeedVideoFpsRangesFor = p1.getData().size() / 2;
    }

    public static /* synthetic */ void init$default(androidx.paging.PagedStorage pagedStorage, int i, androidx.paging.PagingSource.LoadResult.Page page, int i2, int i3, androidx.paging.PagedStorage.Callback callback, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 32) != 0) {
            z = true;
        }
        pagedStorage.init(i, page, i2, i3, callback, z);
    }

    public final void init(int leadingNulls, androidx.paging.PagingSource.LoadResult.Page<?, T> page, int trailingNulls, int positionOffset, androidx.paging.PagedStorage.Callback callback, boolean counted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        getHighSpeedVideoSizes(leadingNulls, page, trailingNulls, positionOffset, counted);
        callback.onInitialized(size());
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public final java.lang.Object getPrevKey() {
        if (!this.Camera2StreamConfigurationMap || getPlaceholdersBefore() + this.positionOffset > 0) {
            return ((androidx.paging.PagingSource.LoadResult.Page) kotlin.collections.CollectionsKt.first((java.util.List) this.getHighSpeedVideoSizes)).getPrevKey();
        }
        return null;
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public final java.lang.Object getNextKey() {
        if (!this.Camera2StreamConfigurationMap || getPlaceholdersAfter() > 0) {
            return ((androidx.paging.PagingSource.LoadResult.Page) kotlin.collections.CollectionsKt.last((java.util.List) this.getHighSpeedVideoSizes)).getNextKey();
        }
        return null;
    }

    public final androidx.paging.PagingState<?, T> getRefreshKeyInfo(androidx.paging.PagedList.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            return null;
        }
        java.util.List list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
        int lastLoadAroundIndex = getLastLoadAroundIndex();
        return new androidx.paging.PagingState<>(list, java.lang.Integer.valueOf(lastLoadAroundIndex), new androidx.paging.PagingConfig(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, null), getPlaceholdersBefore());
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int index) {
        int placeholdersBefore = index - getPlaceholdersBefore();
        if (index < 0 || index >= size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
            sb.append(index);
            sb.append(", Size: ");
            sb.append(size());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (placeholdersBefore < 0 || placeholdersBefore >= getDataCount()) {
            return null;
        }
        return getItem(placeholdersBefore);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final int getSize() {
        return getPlaceholdersBefore() + getDataCount() + getPlaceholdersAfter();
    }

    private final boolean Camera2StreamConfigurationMap(int p0, int p1, int p2) {
        return getDataCount() > p0 && this.getHighSpeedVideoSizes.size() > 2 && getDataCount() - this.getHighSpeedVideoSizes.get(p2).getData().size() >= p1;
    }

    public final boolean needsTrimFromFront(int maxSize, int requiredRemaining) {
        return Camera2StreamConfigurationMap(maxSize, requiredRemaining, 0);
    }

    public final boolean needsTrimFromEnd(int maxSize, int requiredRemaining) {
        return Camera2StreamConfigurationMap(maxSize, requiredRemaining, this.getHighSpeedVideoSizes.size() - 1);
    }

    public final boolean shouldPreTrimNewPage(int maxSize, int requiredRemaining, int countToBeAdded) {
        return getDataCount() + countToBeAdded > maxSize && this.getHighSpeedVideoSizes.size() > 1 && getDataCount() >= requiredRemaining;
    }

    public final boolean trimFromFront$paging_common(boolean insertNulls, int maxSize, int requiredRemaining, androidx.paging.PagedStorage.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        int i = 0;
        while (needsTrimFromFront(maxSize, requiredRemaining)) {
            int size = this.getHighSpeedVideoSizes.remove(0).getData().size();
            i += size;
            this.dataCount = getDataCount() - size;
        }
        this.getHighSpeedVideoFpsRangesFor = kotlin.ranges.RangesKt.coerceAtLeast(this.getHighSpeedVideoFpsRangesFor - i, 0);
        if (i > 0) {
            if (insertNulls) {
                int placeholdersBefore = getPlaceholdersBefore();
                this.placeholdersBefore = getPlaceholdersBefore() + i;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i);
            } else {
                this.positionOffset += i;
                callback.onPagesRemoved(getPlaceholdersBefore(), i);
            }
        }
        return i > 0;
    }

    public final boolean trimFromEnd$paging_common(boolean insertNulls, int maxSize, int requiredRemaining, androidx.paging.PagedStorage.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        int i = 0;
        while (needsTrimFromEnd(maxSize, requiredRemaining)) {
            java.util.List<androidx.paging.PagingSource.LoadResult.Page<?, T>> list = this.getHighSpeedVideoSizes;
            int size = list.remove(list.size() - 1).getData().size();
            i += size;
            this.dataCount = getDataCount() - size;
        }
        this.getHighSpeedVideoFpsRangesFor = kotlin.ranges.RangesKt.coerceAtMost(this.getHighSpeedVideoFpsRangesFor, getDataCount() - 1);
        if (i > 0) {
            int placeholdersBefore = getPlaceholdersBefore() + getDataCount();
            if (insertNulls) {
                this.placeholdersAfter = getPlaceholdersAfter() + i;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i);
            } else {
                callback.onPagesRemoved(placeholdersBefore, i);
            }
        }
        return i > 0;
    }

    public static /* synthetic */ void prependPage$paging_common$default(androidx.paging.PagedStorage pagedStorage, androidx.paging.PagingSource.LoadResult.Page page, androidx.paging.PagedStorage.Callback callback, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callback = null;
        }
        pagedStorage.prependPage$paging_common(page, callback);
    }

    public final void prependPage$paging_common(androidx.paging.PagingSource.LoadResult.Page<?, T> page, androidx.paging.PagedStorage.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        int size = page.getData().size();
        if (size != 0) {
            this.getHighSpeedVideoSizes.add(0, page);
            this.dataCount = getDataCount() + size;
            int min = java.lang.Math.min(getPlaceholdersBefore(), size);
            int i = size - min;
            if (min != 0) {
                this.placeholdersBefore = getPlaceholdersBefore() - min;
            }
            this.positionOffset -= i;
            if (callback != null) {
                callback.onPagePrepended(getPlaceholdersBefore(), min, i);
            }
        }
    }

    public static /* synthetic */ void appendPage$paging_common$default(androidx.paging.PagedStorage pagedStorage, androidx.paging.PagingSource.LoadResult.Page page, androidx.paging.PagedStorage.Callback callback, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callback = null;
        }
        pagedStorage.appendPage$paging_common(page, callback);
    }

    public final void appendPage$paging_common(androidx.paging.PagingSource.LoadResult.Page<?, T> page, androidx.paging.PagedStorage.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        int size = page.getData().size();
        if (size != 0) {
            this.getHighSpeedVideoSizes.add(page);
            this.dataCount = getDataCount() + size;
            int min = java.lang.Math.min(getPlaceholdersAfter(), size);
            if (min != 0) {
                this.placeholdersAfter = getPlaceholdersAfter() - min;
            }
            if (callback != null) {
                callback.onPageAppended((getPlaceholdersBefore() + getDataCount()) - size, min, size - min);
            }
        }
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("leading ");
        sb.append(getPlaceholdersBefore());
        sb.append(", dataCount ");
        sb.append(getDataCount());
        sb.append(", trailing ");
        sb.append(getPlaceholdersAfter());
        sb.append(' ');
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.getHighSpeedVideoSizes, " ", null, null, 0, null, null, 62, null));
        return sb.toString();
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final T getItem(int index) {
        int size = this.getHighSpeedVideoSizes.size();
        int i = 0;
        while (i < size) {
            int size2 = this.getHighSpeedVideoSizes.get(i).getData().size();
            if (size2 > index) {
                break;
            }
            index -= size2;
            i++;
        }
        return this.getHighSpeedVideoSizes.get(i).getData().get(index);
    }
}
