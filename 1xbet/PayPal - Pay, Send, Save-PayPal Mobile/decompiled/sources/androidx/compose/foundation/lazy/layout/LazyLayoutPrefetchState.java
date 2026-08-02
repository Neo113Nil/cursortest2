package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0003DEFB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B2\b\u0017\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0002\u0010\u000bB&\b\u0016\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0002\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0000¢\u0006\u0004\b!\u0010\"R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R)\u0010+\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u00101\u001a\u0004\u0018\u0001008\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u0003\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\"\u0010A\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010="}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "Lkotlin/ExtensionFunctionType;", "onNestedPrefetch", "(Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "", "index", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrecomposition", "(I)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "isHighPriority", "schedulePrecomposition$foundation", "(IZ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchResultScope;", "onItemPremeasured", "schedulePrecompositionAndPremeasure-VKLhPVY", "(IJLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrecompositionAndPremeasure", "schedulePrecompositionAndPremeasure-_EkL_-Y$foundation", "(IJZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "collectNestedPrefetchRequests$foundation", "()Ljava/util/List;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "getPrefetchScheduler$foundation", "()Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "setPrefetchScheduler$foundation", "(Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "getPrefetchScheduler$foundation$annotations", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "prefetchHandleProvider", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "getPrefetchHandleProvider$foundation", "()Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "setPrefetchHandleProvider$foundation", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;)V", "getPrefetchHandleProvider$foundation$annotations", "realizedNestedPrefetchCount", com.visa.cbp.getEncExpo.warmup, "getRealizedNestedPrefetchCount$foundation", "()I", "setRealizedNestedPrefetchCount$foundation", "(I)V", "idealNestedPrefetchCount", "getIdealNestedPrefetchCount$foundation", "setIdealNestedPrefetchCount$foundation", "lastNumberOfNestedPrefetchItems", "getLastNumberOfNestedPrefetchItems$foundation", "setLastNumberOfNestedPrefetchItems$foundation", "PrefetchHandle", "PrefetchResultScope", "NestedPrefetchScopeImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.NestedPrefetchScope, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.PrefetchMetrics getHighSpeedVideoFpsRanges;
    private int idealNestedPrefetchCount;
    private int lastNumberOfNestedPrefetchItems;
    private androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider;
    private androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler;
    private int realizedNestedPrefetchCount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "markAsUrgent", "Landroidx/compose/foundation/lazy/layout/DummyHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0001\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchResultScope;", "", "", "placeableIndex", "Landroidx/compose/ui/unit/IntSize;", "getSize-YEO4UFw", "(I)J", "getSize", "getPlaceablesCount", "()I", "placeablesCount", "getIndex", "index", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PrefetchResultScope {
        /* renamed from: getIndex */
        int getGetHighResolutionOutputSizeshNQ4ISI();

        int getPlaceablesCount();

        /* renamed from: getSize-YEO4UFw, reason: not valid java name */
        long mo1866getSizeYEO4UFw(int placeableIndex);
    }

    public static /* synthetic */ void getPrefetchHandleProvider$foundation$annotations() {
    }

    public static /* synthetic */ void getPrefetchScheduler$foundation$annotations() {
    }

    public LazyLayoutPrefetchState() {
        this.getHighSpeedVideoFpsRanges = new androidx.compose.foundation.lazy.layout.PrefetchMetrics();
        this.realizedNestedPrefetchCount = -1;
        this.idealNestedPrefetchCount = -1;
    }

    public /* synthetic */ LazyLayoutPrefetchState(androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : prefetchScheduler, (i & 2) != 0 ? null : function1);
    }

    @kotlin.Deprecated(message = "Please use overload without Prefetch Scheduler.")
    public LazyLayoutPrefetchState(androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.NestedPrefetchScope, kotlin.Unit> function1) {
        this();
        this.prefetchScheduler = prefetchScheduler;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    public LazyLayoutPrefetchState(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.NestedPrefetchScope, kotlin.Unit> function1) {
        this();
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    public /* synthetic */ LazyLayoutPrefetchState(kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* renamed from: getPrefetchScheduler$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.PrefetchScheduler getPrefetchScheduler() {
        return this.prefetchScheduler;
    }

    public final void setPrefetchScheduler$foundation(androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler) {
        this.prefetchScheduler = prefetchScheduler;
    }

    /* renamed from: getPrefetchHandleProvider$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.PrefetchHandleProvider getPrefetchHandleProvider() {
        return this.prefetchHandleProvider;
    }

    public final void setPrefetchHandleProvider$foundation(androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    /* renamed from: getRealizedNestedPrefetchCount$foundation, reason: from getter */
    public final int getRealizedNestedPrefetchCount() {
        return this.realizedNestedPrefetchCount;
    }

    public final void setRealizedNestedPrefetchCount$foundation(int i) {
        this.realizedNestedPrefetchCount = i;
    }

    /* renamed from: getIdealNestedPrefetchCount$foundation, reason: from getter */
    public final int getIdealNestedPrefetchCount() {
        return this.idealNestedPrefetchCount;
    }

    public final void setIdealNestedPrefetchCount$foundation(int i) {
        this.idealNestedPrefetchCount = i;
    }

    /* renamed from: getLastNumberOfNestedPrefetchItems$foundation, reason: from getter */
    public final int getLastNumberOfNestedPrefetchItems() {
        return this.lastNumberOfNestedPrefetchItems;
    }

    public final void setLastNumberOfNestedPrefetchItems$foundation(int i) {
        this.lastNumberOfNestedPrefetchItems = i;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrecomposition(int index) {
        return schedulePrecomposition$foundation(index, true);
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrecomposition$foundation(int index, boolean isHighPriority) {
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrecomposition;
        androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (schedulePrecomposition = prefetchHandleProvider.schedulePrecomposition(index, isHighPriority, this.getHighSpeedVideoFpsRanges)) == null) ? androidx.compose.foundation.lazy.layout.DummyHandle.INSTANCE : schedulePrecomposition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle m1861schedulePrecompositionAndPremeasureVKLhPVY$default(androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, int i, long j, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return lazyLayoutPrefetchState.m1863schedulePrecompositionAndPremeasureVKLhPVY(i, j, function1);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY, reason: not valid java name */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle m1863schedulePrecompositionAndPremeasureVKLhPVY(int index, long constraints, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> onItemPremeasured) {
        return m1864schedulePrecompositionAndPremeasure_EkL_Y$foundation(index, constraints, true, onItemPremeasured);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle m1862schedulePrecompositionAndPremeasure_EkL_Y$foundation$default(androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, int i, long j, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return lazyLayoutPrefetchState.m1864schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, j, z, function1);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation, reason: not valid java name */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle m1864schedulePrecompositionAndPremeasure_EkL_Y$foundation(int index, long constraints, boolean isHighPriority, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> onItemPremeasured) {
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle m1880schedulePremeasurem8Kt_7k;
        androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (m1880schedulePremeasurem8Kt_7k = prefetchHandleProvider.m1880schedulePremeasurem8Kt_7k(index, constraints, this.getHighSpeedVideoFpsRanges, isHighPriority, onItemPremeasured)) == null) ? androidx.compose.foundation.lazy.layout.DummyHandle.INSTANCE : m1880schedulePremeasurem8Kt_7k;
    }

    public final java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest> collectNestedPrefetchRequests$foundation() {
        kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.NestedPrefetchScope, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (function1 == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.NestedPrefetchScopeImpl(this.realizedNestedPrefetchCount);
        function1.invoke(nestedPrefetchScopeImpl);
        java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest> highSpeedVideoFpsRangesFor = nestedPrefetchScopeImpl.getHighSpeedVideoFpsRangesFor();
        this.lastNumberOfNestedPrefetchItems = highSpeedVideoFpsRangesFor.size();
        return highSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$NestedPrefetchScopeImpl;", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;I)V", "", "schedulePrecomposition", "(I)V", "Landroidx/compose/ui/unit/Constraints;", "p1", "schedulePrecompositionAndPremeasure-0kLqBqw", "(IJ)V", "schedulePrecompositionAndPremeasure", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getNestedPrefetchItemCount", "()I", "getHighResolutionOutputSizeshNQ4ISI", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "getHighSpeedVideoFpsRangesFor", "()Ljava/util/List;", "", "getHighSpeedVideoSizes", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class NestedPrefetchScopeImpl implements androidx.compose.foundation.lazy.layout.NestedPrefetchScope {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

        public NestedPrefetchScopeImpl(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: getNestedPrefetchItemCount, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest> getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public final void schedulePrecomposition(int p0) {
            androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.add(prefetchHandleProvider.createNestedPrefetchRequest(p0, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this.getHighSpeedVideoFpsRanges));
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw, reason: not valid java name */
        public final void mo1865schedulePrecompositionAndPremeasure0kLqBqw(int p0, long p1) {
            androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.add(prefetchHandleProvider.m1879createNestedPrefetchRequestVKLhPVY(p0, p1, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this.getHighSpeedVideoFpsRanges));
        }
    }
}
