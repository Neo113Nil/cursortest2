package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001RB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R,\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110.8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101R$\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00105R\u0016\u00108\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00103R$\u0010=\u001a\u00020\n2\u0006\u00109\u001a\u00020\n8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b:\u00105\"\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00103R$\u0010A\u001a\u00020\n2\u0006\u00109\u001a\u00020\n8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b?\u00105\"\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u00103R\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u00103R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010GR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0H8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010N\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020M8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "", "Key", "Value", "Landroidx/paging/PagingConfig;", "p0", "<init>", "(Landroidx/paging/PagingConfig;)V", "Landroidx/paging/LoadType;", "loadType", "", "generationId$paging_common", "(Landroidx/paging/LoadType;)I", "Lkotlinx/coroutines/flow/Flow;", "consumePrependGenerationIdAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "consumeAppendGenerationIdAsFlow", "Landroidx/paging/PagingSource$LoadResult$Page;", "Landroidx/paging/PageEvent;", "toPageEvent$paging_common", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;", "loadId", "page", "", "insert", "(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z", "Landroidx/paging/PageEvent$Drop;", "event", "", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(Landroidx/paging/PageEvent$Drop;)V", "Landroidx/paging/ViewportHint;", "hint", "dropEventOrNull", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/ViewportHint$Access;", "viewportHint", "Landroidx/paging/PagingState;", "currentPagingState$paging_common", "(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;", "getOutputMinFrameDuration", "Landroidx/paging/PagingConfig;", "getHighSpeedVideoSizes", "", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "", "pages", "getPages$paging_common", "()Ljava/util/List;", "initialPageIndex", com.visa.cbp.getEncExpo.warmup, "getInitialPageIndex$paging_common", "()I", "getStorageCount$paging_common", "storageCount", "getHighSpeedVideoFpsRangesFor", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getPlaceholdersBefore$paging_common", "setPlaceholdersBefore$paging_common", "(I)V", "placeholdersBefore", "Camera2StreamConfigurationMap", "getPlaceholdersAfter$paging_common", "setPlaceholdersAfter$paging_common", "placeholdersAfter", "getInputFormats", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/channels/Channel;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "", "failedHintsByLoadType", "Ljava/util/Map;", "getFailedHintsByLoadType$paging_common", "()Ljava/util/Map;", "Landroidx/paging/MutableLoadStateCollection;", "sourceLoadStates", "Landroidx/paging/MutableLoadStateCollection;", "getSourceLoadStates$paging_common", "()Landroidx/paging/MutableLoadStateCollection;", "Holder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PageFetcherSnapshotState<Key, Value> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;
    private final java.util.Map<androidx.paging.LoadType, androidx.paging.ViewportHint> failedHintsByLoadType;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<java.lang.Integer> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.paging.PagingSource.LoadResult.Page<Key, Value>> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.channels.Channel<java.lang.Integer> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.paging.PagingConfig getHighSpeedVideoSizes;
    private int initialPageIndex;
    private final java.util.List<androidx.paging.PagingSource.LoadResult.Page<Key, Value>> pages;
    private androidx.paging.MutableLoadStateCollection sourceLoadStates;

    private PageFetcherSnapshotState(androidx.paging.PagingConfig pagingConfig) {
        this.getHighSpeedVideoSizes = pagingConfig;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = arrayList;
        this.pages = arrayList;
        this.getInputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
        this.getOutputMinFrameDuration = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
        this.failedHintsByLoadType = new java.util.LinkedHashMap();
        androidx.paging.MutableLoadStateCollection mutableLoadStateCollection = new androidx.paging.MutableLoadStateCollection();
        mutableLoadStateCollection.set(androidx.paging.LoadType.REFRESH, androidx.paging.LoadState.Loading.INSTANCE);
        this.sourceLoadStates = mutableLoadStateCollection;
    }

    public final java.util.List<androidx.paging.PagingSource.LoadResult.Page<Key, Value>> getPages$paging_common() {
        return this.pages;
    }

    /* renamed from: getInitialPageIndex$paging_common, reason: from getter */
    public final int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final int getStorageCount$paging_common() {
        java.util.Iterator<T> it = this.pages.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((androidx.paging.PagingSource.LoadResult.Page) it.next()).getData().size();
        }
        return i;
    }

    public final int getPlaceholdersBefore$paging_common() {
        if (this.getHighSpeedVideoSizes.enablePlaceholders) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return 0;
    }

    public final void setPlaceholdersBefore$paging_common(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final int getPlaceholdersAfter$paging_common() {
        if (this.getHighSpeedVideoSizes.enablePlaceholders) {
            return this.Camera2StreamConfigurationMap;
        }
        return 0;
    }

    public final void setPlaceholdersAfter$paging_common(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.Camera2StreamConfigurationMap = i;
    }

    public final int generationId$paging_common(androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        int i = androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new java.lang.IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i == 2) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.util.Map<androidx.paging.LoadType, androidx.paging.ViewportHint> getFailedHintsByLoadType$paging_common() {
        return this.failedHintsByLoadType;
    }

    /* renamed from: getSourceLoadStates$paging_common, reason: from getter */
    public final androidx.paging.MutableLoadStateCollection getSourceLoadStates() {
        return this.sourceLoadStates;
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> consumePrependGenerationIdAsFlow() {
        return kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.consumeAsFlow(this.getInputSizeshNQ4ISI), new androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(this, null));
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> consumeAppendGenerationIdAsFlow() {
        return kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.consumeAsFlow(this.getOutputMinFrameDuration), new androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this, null));
    }

    public final androidx.paging.PageEvent<Value> toPageEvent$paging_common(androidx.paging.PagingSource.LoadResult.Page<Key, Value> page, androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        int i = androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                i2 = 0 - this.initialPageIndex;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i2 = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new androidx.paging.TransformablePage(i2, page.getData()));
        int i3 = androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i3 == 1) {
            return androidx.paging.PageEvent.Insert.INSTANCE.Refresh(listOf, getPlaceholdersBefore$paging_common(), getPlaceholdersAfter$paging_common(), this.sourceLoadStates.snapshot(), null);
        }
        if (i3 == 2) {
            return androidx.paging.PageEvent.Insert.INSTANCE.Prepend(listOf, getPlaceholdersBefore$paging_common(), this.sourceLoadStates.snapshot(), null);
        }
        if (i3 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return androidx.paging.PageEvent.Insert.INSTANCE.Append(listOf, getPlaceholdersAfter$paging_common(), this.sourceLoadStates.snapshot(), null);
    }

    public final boolean insert(int loadId, androidx.paging.LoadType loadType, androidx.paging.PagingSource.LoadResult.Page<Key, Value> page) {
        int itemsBefore;
        int itemsAfter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        int i = androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (this.pages.isEmpty()) {
                    throw new java.lang.IllegalStateException("should've received an init before append".toString());
                }
                if (loadId != this.getHighSpeedVideoSizesFor) {
                    return false;
                }
                this.getHighSpeedVideoFpsRanges.add(page);
                if (page.getItemsAfter() == Integer.MIN_VALUE) {
                    itemsAfter = kotlin.ranges.RangesKt.coerceAtLeast(getPlaceholdersAfter$paging_common() - page.getData().size(), 0);
                } else {
                    itemsAfter = page.getItemsAfter();
                }
                setPlaceholdersAfter$paging_common(itemsAfter);
                this.failedHintsByLoadType.remove(androidx.paging.LoadType.APPEND);
            } else {
                if (this.pages.isEmpty()) {
                    throw new java.lang.IllegalStateException("should've received an init before prepend".toString());
                }
                if (loadId != this.getHighResolutionOutputSizeshNQ4ISI) {
                    return false;
                }
                this.getHighSpeedVideoFpsRanges.add(0, page);
                this.initialPageIndex++;
                if (page.getItemsBefore() == Integer.MIN_VALUE) {
                    itemsBefore = kotlin.ranges.RangesKt.coerceAtLeast(getPlaceholdersBefore$paging_common() - page.getData().size(), 0);
                } else {
                    itemsBefore = page.getItemsBefore();
                }
                setPlaceholdersBefore$paging_common(itemsBefore);
                this.failedHintsByLoadType.remove(androidx.paging.LoadType.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new java.lang.IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (loadId != 0) {
                throw new java.lang.IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this.getHighSpeedVideoFpsRanges.add(page);
            this.initialPageIndex = 0;
            setPlaceholdersAfter$paging_common(page.getItemsAfter());
            setPlaceholdersBefore$paging_common(page.getItemsBefore());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return true;
    }

    public final void drop(androidx.paging.PageEvent.Drop<Value> event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event.getPageCount() > this.pages.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid drop count. have ");
            sb.append(this.pages.size());
            sb.append(" but wanted to drop ");
            sb.append(event.getPageCount());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.failedHintsByLoadType.remove(event.getLoadType());
        this.sourceLoadStates.set(event.getLoadType(), androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
        int i = androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[event.getLoadType().ordinal()];
        if (i == 2) {
            int pageCount = event.getPageCount();
            for (int i2 = 0; i2 < pageCount; i2++) {
                this.getHighSpeedVideoFpsRanges.remove(0);
            }
            this.initialPageIndex -= event.getPageCount();
            setPlaceholdersBefore$paging_common(event.getPlaceholdersRemaining());
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            this.getInputSizeshNQ4ISI.mo9266trySendJP2dKIU(java.lang.Integer.valueOf(i3));
            return;
        }
        if (i == 3) {
            int pageCount2 = event.getPageCount();
            for (int i4 = 0; i4 < pageCount2; i4++) {
                this.getHighSpeedVideoFpsRanges.remove(this.pages.size() - 1);
            }
            setPlaceholdersAfter$paging_common(event.getPlaceholdersRemaining());
            int i5 = this.getHighSpeedVideoSizesFor + 1;
            this.getHighSpeedVideoSizesFor = i5;
            this.getOutputMinFrameDuration.mo9266trySendJP2dKIU(java.lang.Integer.valueOf(i5));
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot drop ");
        sb2.append(event.getLoadType());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public final androidx.paging.PageEvent.Drop<Value> dropEventOrNull(androidx.paging.LoadType loadType, androidx.paging.ViewportHint hint) {
        int lastIndex;
        int lastIndex2;
        int size;
        int presentedItemsAfter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hint, "");
        if (this.getHighSpeedVideoSizes.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || getStorageCount$paging_common() <= this.getHighSpeedVideoSizes.maxSize) {
            return null;
        }
        if (loadType == androidx.paging.LoadType.REFRESH) {
            throw new java.lang.IllegalArgumentException("Drop LoadType must be PREPEND or APPEND, but got ".concat(java.lang.String.valueOf(loadType)).toString());
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.pages.size() && getStorageCount$paging_common() - i3 > this.getHighSpeedVideoSizes.maxSize) {
            if (androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 2) {
                size = this.pages.get(i2).getData().size();
            } else {
                java.util.List<androidx.paging.PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
                size = list.get(kotlin.collections.CollectionsKt.getLastIndex(list) - i2).getData().size();
            }
            if (androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 2) {
                presentedItemsAfter = hint.getPresentedItemsBefore();
            } else {
                presentedItemsAfter = hint.getPresentedItemsAfter();
            }
            if ((presentedItemsAfter - i3) - size < this.getHighSpeedVideoSizes.prefetchDistance) {
                break;
            }
            i3 += size;
            i2++;
        }
        if (i2 == 0) {
            return null;
        }
        if (androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 2) {
            lastIndex = -this.initialPageIndex;
        } else {
            lastIndex = (kotlin.collections.CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex) - (i2 - 1);
        }
        if (androidx.paging.PageFetcherSnapshotState.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 2) {
            lastIndex2 = (i2 - 1) - this.initialPageIndex;
        } else {
            lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex;
        }
        if (this.getHighSpeedVideoSizes.enablePlaceholders) {
            i = (loadType == androidx.paging.LoadType.PREPEND ? getPlaceholdersBefore$paging_common() : getPlaceholdersAfter$paging_common()) + i3;
        }
        return new androidx.paging.PageEvent.Drop<>(loadType, lastIndex, lastIndex2, i);
    }

    public final androidx.paging.PagingState<Key, Value> currentPagingState$paging_common(androidx.paging.ViewportHint.Access viewportHint) {
        java.lang.Integer num;
        int size;
        java.util.List list = kotlin.collections.CollectionsKt.toList(this.pages);
        if (viewportHint != null) {
            int placeholdersBefore$paging_common = getPlaceholdersBefore$paging_common();
            int i = -this.initialPageIndex;
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.pages);
            int i2 = this.initialPageIndex;
            int pageOffset = viewportHint.getPageOffset();
            for (int i3 = i; i3 < pageOffset; i3++) {
                if (i3 > lastIndex - i2) {
                    size = this.getHighSpeedVideoSizes.pageSize;
                } else {
                    size = this.pages.get(this.initialPageIndex + i3).getData().size();
                }
                placeholdersBefore$paging_common += size;
            }
            int indexInPage = placeholdersBefore$paging_common + viewportHint.getIndexInPage();
            if (viewportHint.getPageOffset() < i) {
                indexInPage -= this.getHighSpeedVideoSizes.pageSize;
            }
            num = java.lang.Integer.valueOf(indexInPage);
        } else {
            num = null;
        }
        return new androidx.paging.PagingState<>(list, num, this.getHighSpeedVideoSizes, getPlaceholdersBefore$paging_common());
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\r\u001a\u00028\u0004\"\u0004\b\u0004\u0010\b2#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00040\tH\u0086H¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "", "Key", "Value", "Landroidx/paging/PagingConfig;", "config", "<init>", "(Landroidx/paging/PagingConfig;)V", "T", "Lkotlin/Function1;", "Landroidx/paging/PageFetcherSnapshotState;", "Lkotlin/ParameterName;", "block", "withLock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/PagingConfig;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "Landroidx/paging/PageFetcherSnapshotState;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Holder<Key, Value> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.paging.PageFetcherSnapshotState<Key, Value> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.paging.PagingConfig Camera2StreamConfigurationMap;

        public Holder(androidx.paging.PagingConfig pagingConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingConfig, "");
            this.Camera2StreamConfigurationMap = pagingConfig;
            this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
            this.getHighSpeedVideoFpsRanges = new androidx.paging.PageFetcherSnapshotState<>(pagingConfig, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> java.lang.Object withLock(kotlin.jvm.functions.Function1<? super androidx.paging.PageFetcherSnapshotState<Key, Value>, ? extends T> function1, kotlin.coroutines.Continuation<? super T> continuation) {
            androidx.paging.PageFetcherSnapshotState$Holder$withLock$1 pageFetcherSnapshotState$Holder$withLock$1;
            int i;
            kotlinx.coroutines.sync.Mutex mutex;
            try {
                if (continuation instanceof androidx.paging.PageFetcherSnapshotState$Holder$withLock$1) {
                    pageFetcherSnapshotState$Holder$withLock$1 = (androidx.paging.PageFetcherSnapshotState$Holder$withLock$1) continuation;
                    if ((pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoSizes -= 2147483648;
                        java.lang.Object obj = pageFetcherSnapshotState$Holder$withLock$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoSizes;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = this.getHighSpeedVideoFpsRangesFor;
                            pageFetcherSnapshotState$Holder$withLock$1.Camera2StreamConfigurationMap = function1;
                            pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoFpsRanges = mutex;
                            pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoSizes = 1;
                            if (mutex.lock(null, pageFetcherSnapshotState$Holder$withLock$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.functions.Function1<? super androidx.paging.PageFetcherSnapshotState<Key, Value>, ? extends T> function12 = (kotlin.jvm.functions.Function1) pageFetcherSnapshotState$Holder$withLock$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex2;
                            function1 = function12;
                        }
                        return function1.invoke(this.getHighSpeedVideoFpsRanges);
                    }
                }
                return function1.invoke(this.getHighSpeedVideoFpsRanges);
            } finally {
                mutex.unlock(null);
            }
            pageFetcherSnapshotState$Holder$withLock$1 = new androidx.paging.PageFetcherSnapshotState$Holder$withLock$1(this, continuation);
            java.lang.Object obj2 = pageFetcherSnapshotState$Holder$withLock$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageFetcherSnapshotState$Holder$withLock$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
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

    public /* synthetic */ PageFetcherSnapshotState(androidx.paging.PagingConfig pagingConfig, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pagingConfig);
    }
}
