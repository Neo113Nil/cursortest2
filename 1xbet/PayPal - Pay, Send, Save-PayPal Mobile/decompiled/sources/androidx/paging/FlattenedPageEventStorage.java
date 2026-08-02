package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d"}, d2 = {"Landroidx/paging/FlattenedPageEventStorage;", "", "T", "<init>", "()V", "Landroidx/paging/PageEvent;", "event", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/paging/PageEvent;)V", "", "getAsEvents", "()Ljava/util/List;", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/ArrayDeque;", "Landroidx/paging/TransformablePage;", "Lkotlin/collections/ArrayDeque;", "Camera2StreamConfigurationMap", "Landroidx/paging/MutableLoadStateCollection;", "getInputSizeshNQ4ISI", "Landroidx/paging/MutableLoadStateCollection;", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/LoadStates;", "Landroidx/paging/LoadStates;", "", "Z", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlattenedPageEventStorage<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.paging.LoadStates getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.collections.ArrayDeque<androidx.paging.TransformablePage<T>> Camera2StreamConfigurationMap = new kotlin.collections.ArrayDeque<>();

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.MutableLoadStateCollection getHighSpeedVideoFpsRangesFor = new androidx.paging.MutableLoadStateCollection();

    public final void add(androidx.paging.PageEvent<T> event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration = true;
        int i = 0;
        if (!(event instanceof androidx.paging.PageEvent.Insert)) {
            if (!(event instanceof androidx.paging.PageEvent.Drop)) {
                if (!(event instanceof androidx.paging.PageEvent.LoadStateUpdate)) {
                    if (!(event instanceof androidx.paging.PageEvent.StaticList)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    androidx.paging.PageEvent.StaticList staticList = (androidx.paging.PageEvent.StaticList) event;
                    if (staticList.getSourceLoadStates() != null) {
                        this.getHighSpeedVideoFpsRangesFor.set(staticList.getSourceLoadStates());
                    }
                    if (staticList.getMediatorLoadStates() != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = staticList.getMediatorLoadStates();
                    }
                    this.Camera2StreamConfigurationMap.clear();
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.Camera2StreamConfigurationMap.add(new androidx.paging.TransformablePage<>(0, staticList.getData()));
                    return;
                }
                androidx.paging.PageEvent.LoadStateUpdate loadStateUpdate = (androidx.paging.PageEvent.LoadStateUpdate) event;
                this.getHighSpeedVideoFpsRangesFor.set(loadStateUpdate.getSource());
                this.getHighResolutionOutputSizeshNQ4ISI = loadStateUpdate.getMediator();
                return;
            }
            androidx.paging.PageEvent.Drop drop = (androidx.paging.PageEvent.Drop) event;
            this.getHighSpeedVideoFpsRangesFor.set(drop.getLoadType(), androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
            int i2 = androidx.paging.FlattenedPageEventStorage.WhenMappings.$EnumSwitchMapping$0[drop.getLoadType().ordinal()];
            if (i2 == 1) {
                this.getHighSpeedVideoFpsRanges = drop.getPlaceholdersRemaining();
                int pageCount = drop.getPageCount();
                while (i < pageCount) {
                    this.Camera2StreamConfigurationMap.removeFirst();
                    i++;
                }
                return;
            }
            if (i2 == 2) {
                this.getHighSpeedVideoSizes = drop.getPlaceholdersRemaining();
                int pageCount2 = drop.getPageCount();
                while (i < pageCount2) {
                    this.Camera2StreamConfigurationMap.removeLast();
                    i++;
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("Page drop type must be prepend or append");
        }
        androidx.paging.PageEvent.Insert insert = (androidx.paging.PageEvent.Insert) event;
        this.getHighSpeedVideoFpsRangesFor.set(insert.getSourceLoadStates());
        this.getHighResolutionOutputSizeshNQ4ISI = insert.getMediatorLoadStates();
        int i3 = androidx.paging.FlattenedPageEventStorage.WhenMappings.$EnumSwitchMapping$0[insert.getLoadType().ordinal()];
        if (i3 == 1) {
            this.getHighSpeedVideoFpsRanges = insert.getPlaceholdersBefore();
            java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.downTo(insert.getPages().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.Camera2StreamConfigurationMap.addFirst(insert.getPages().get(((kotlin.collections.IntIterator) it).nextInt()));
            }
            return;
        }
        if (i3 == 2) {
            this.getHighSpeedVideoSizes = insert.getPlaceholdersAfter();
            this.Camera2StreamConfigurationMap.addAll(insert.getPages());
        } else {
            if (i3 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap.clear();
            this.getHighSpeedVideoSizes = insert.getPlaceholdersAfter();
            this.getHighSpeedVideoFpsRanges = insert.getPlaceholdersBefore();
            this.Camera2StreamConfigurationMap.addAll(insert.getPages());
        }
    }

    public final java.util.List<androidx.paging.PageEvent<T>> getAsEvents() {
        if (!this.getOutputMinFrameDuration) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.paging.LoadStates snapshot = this.getHighSpeedVideoFpsRangesFor.snapshot();
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            arrayList.add(androidx.paging.PageEvent.Insert.INSTANCE.Refresh(kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, snapshot, this.getHighResolutionOutputSizeshNQ4ISI));
            return arrayList;
        }
        arrayList.add(new androidx.paging.PageEvent.LoadStateUpdate(snapshot, this.getHighResolutionOutputSizeshNQ4ISI));
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.LoadType.values().length];
            try {
                iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.LoadType.APPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
