package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u00016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u0013*\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R(\u00100\u001a\u00020\f8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b0\u0010/\u0012\u0004\b5\u0010\u0015\u001a\u0004\b1\u00102\"\u0004\b3\u00104"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "executor", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "", "index", "", "isHighPriority", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrecomposition", "(IZLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "onDisposed", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchResultScope;", "Lkotlin/ExtensionFunctionType;", "onItemPremeasured", "schedulePremeasure-m8Kt_7k", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePremeasure", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "request", "executeWithPriority", "(Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;Landroidx/compose/foundation/lazy/layout/PrefetchRequest;Z)V", "createNestedPrefetchRequest-VKLhPVY", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "createNestedPrefetchRequest", "(ILandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Camera2StreamConfigurationMap", "Z", "shouldPauseBetweenPrecompositionAndPremeasure", "getShouldPauseBetweenPrecompositionAndPremeasure$foundation", "()Z", "setShouldPauseBetweenPrecompositionAndPremeasure$foundation", "(Z)V", "getShouldPauseBetweenPrecompositionAndPremeasure$foundation$annotations", "HandleAndRequestImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrefetchHandleProvider {
    public static final int $stable = 8;
    private boolean Camera2StreamConfigurationMap = true;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.SubcomposeLayoutState getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.PrefetchScheduler getHighResolutionOutputSizeshNQ4ISI;
    private boolean shouldPauseBetweenPrecompositionAndPremeasure;

    public static /* synthetic */ void getShouldPauseBetweenPrecompositionAndPremeasure$foundation$annotations() {
    }

    public PrefetchHandleProvider(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory, androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState, androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler) {
        this.getHighSpeedVideoFpsRanges = lazyLayoutItemContentFactory;
        this.getHighSpeedVideoFpsRangesFor = subcomposeLayoutState;
        this.getHighResolutionOutputSizeshNQ4ISI = prefetchScheduler;
    }

    /* renamed from: getShouldPauseBetweenPrecompositionAndPremeasure$foundation, reason: from getter */
    public final boolean getShouldPauseBetweenPrecompositionAndPremeasure() {
        return this.shouldPauseBetweenPrecompositionAndPremeasure;
    }

    public final void setShouldPauseBetweenPrecompositionAndPremeasure$foundation(boolean z) {
        this.shouldPauseBetweenPrecompositionAndPremeasure = z;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrecomposition(int index, boolean isHighPriority, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics) {
        androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = new androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl(index, prefetchMetrics, prefetchScheduler instanceof androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler ? (androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler) prefetchScheduler : null, null);
        executeWithPriority(this.getHighResolutionOutputSizeshNQ4ISI, handleAndRequestImpl, isHighPriority);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", index);
        return handleAndRequestImpl;
    }

    public final void onDisposed() {
        this.Camera2StreamConfigurationMap = false;
    }

    /* renamed from: schedulePremeasure-m8Kt_7k, reason: not valid java name */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle m1880schedulePremeasurem8Kt_7k(int index, long constraints, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics, boolean isHighPriority, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> onItemPremeasured) {
        androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = new androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl(this, index, constraints, prefetchMetrics, prefetchScheduler instanceof androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler ? (androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler) prefetchScheduler : null, onItemPremeasured, null);
        executeWithPriority(this.getHighResolutionOutputSizeshNQ4ISI, handleAndRequestImpl, isHighPriority);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", index);
        return handleAndRequestImpl;
    }

    public final void executeWithPriority(androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler, androidx.compose.foundation.lazy.layout.PrefetchRequest prefetchRequest, boolean z) {
        if (!(prefetchScheduler instanceof androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler)) {
            prefetchScheduler.schedulePrefetch(prefetchRequest);
        } else if (z) {
            ((androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler) prefetchScheduler).scheduleHighPriorityPrefetch(prefetchRequest);
        } else {
            ((androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler) prefetchScheduler).scheduleLowPriorityPrefetch(prefetchRequest);
        }
    }

    /* renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final androidx.compose.foundation.lazy.layout.PrefetchRequest m1879createNestedPrefetchRequestVKLhPVY(int index, long constraints, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics) {
        androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler = this.getHighResolutionOutputSizeshNQ4ISI;
        return new androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl(this, index, constraints, prefetchMetrics, prefetchScheduler instanceof androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler ? (androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler) prefetchScheduler : null, null, null);
    }

    public final androidx.compose.foundation.lazy.layout.PrefetchRequest createNestedPrefetchRequest(int index, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics) {
        androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler = this.getHighResolutionOutputSizeshNQ4ISI;
        return new androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl(index, prefetchMetrics, prefetchScheduler instanceof androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler ? (androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler) prefetchScheduler : null, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001PB<\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fBF\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0013\u0010!\u001a\u00020\u001b*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u0013\u0010#\u001a\u00020\u001b*\u00020 H\u0002¢\u0006\u0004\b#\u0010\"J-\u0010&\u001a\u00020\u000b*\u00020 2\u0006\u0010\u0005\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010$2\u0006\u0010\t\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J!\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b#\u0010(J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ\u0019\u0010&\u001a\f\u0018\u00010)R\u00060\u0000R\u00020*H\u0002¢\u0006\u0004\b&\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b0\u00101R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u00105R'\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010#\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010CR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u00106\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010FR\u0016\u0010?\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010CR \u0010I\u001a\f\u0018\u00010)R\u00060\u0000R\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010G\u001a\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010JR\u0014\u0010L\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00101R\u0016\u00108\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010MR\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u00103\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010C"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchResultScope;", "", "p0", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "p1", "Landroidx/compose/foundation/lazy/layout/PriorityPrefetchScheduler;", "p2", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "p3", "<init>", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;ILandroidx/compose/foundation/lazy/layout/PrefetchMetrics;Landroidx/compose/foundation/lazy/layout/PriorityPrefetchScheduler;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Constraints;", "p4", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;Landroidx/compose/foundation/lazy/layout/PriorityPrefetchScheduler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "markAsUrgent", "Landroidx/compose/ui/unit/IntSize;", "getSize-YEO4UFw", "(I)J", "getSize", "", "", "getHighSpeedVideoSizes", "(JJ)Z", "Camera2StreamConfigurationMap", "(J)V", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "execute", "(Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;)Z", "getHighSpeedVideoFpsRangesFor", "", "Landroidx/compose/foundation/lazy/layout/Averages;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/Averages;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "()Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "getHighResolutionOutputSizeshNQ4ISI", "unwrapAs", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "Landroidx/compose/foundation/lazy/layout/PriorityPrefetchScheduler;", "getOutputMinFrameDurationlomOqCM", "Lkotlin/jvm/functions/Function1;", "isOutputSupportedForhNQ4ISI", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "getOutputStallDuration", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PausedPrecomposition;", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PausedPrecomposition;", "getOutputFormats", "getInputSizeshNQ4ISI", "Z", "getInputFormats", "getOutputMinFrameDuration", "Ljava/lang/Object;", "getOutputSizes", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "getOutputSizeshNQ4ISI", "()Z", "getPlaceablesCount", "getValidOutputFormatsForInputhNQ4ISI", "J", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "isOutputSupportedFor", "NestedPrefetchController"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class HandleAndRequestImpl implements androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle, androidx.compose.foundation.lazy.layout.PrefetchRequest, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getOutputStallDurationlomOqCM;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private long isOutputSupportedForhNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private long toString;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private java.lang.Object getOutputMinFrameDurationlomOqCM;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private boolean getOutputMinFrameDuration;
        private boolean getInputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private boolean getInputFormats;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private boolean getOutputStallDuration;

        /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> getHighSpeedVideoSizes;

        /* renamed from: getOutputSizes, reason: from kotlin metadata */
        private androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController getOutputSizeshNQ4ISI;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean unwrapAs;

        /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
        private androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle getHighSpeedVideoSizesFor;

        /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
        private androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition getOutputFormats;

        /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
        private long isOutputSupportedFor;

        /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
        private androidx.compose.ui.unit.Constraints getHighSpeedVideoFpsRangesFor;

        /* renamed from: toString, reason: from kotlin metadata */
        private final androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler Camera2StreamConfigurationMap;

        /* renamed from: unwrapAs, reason: from kotlin metadata */
        private final androidx.compose.foundation.lazy.layout.PrefetchMetrics getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        public HandleAndRequestImpl(int i, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics, androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler priorityPrefetchScheduler, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> function1) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = prefetchMetrics;
            this.Camera2StreamConfigurationMap = priorityPrefetchScheduler;
            this.getHighSpeedVideoSizes = function1;
            this.isOutputSupportedFor = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        /* renamed from: getIndex, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        private HandleAndRequestImpl(androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider, int i, long j, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics, androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler priorityPrefetchScheduler, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> function1) {
            this(i, prefetchMetrics, priorityPrefetchScheduler, function1);
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Constraints.m8542boximpl(j);
        }

        private final boolean getHighResolutionOutputSizeshNQ4ISI() {
            androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
            return this.getOutputMinFrameDuration || ((pausedPrecomposition = this.getOutputFormats) != null && pausedPrecomposition.isComplete());
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void cancel() {
            if (this.getInputFormats) {
                return;
            }
            this.getInputFormats = true;
            getHighSpeedVideoSizes();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void markAsUrgent() {
            this.getOutputStallDuration = true;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        public final int getPlaceablesCount() {
            androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.getHighSpeedVideoSizesFor;
            if (precomposedSlotHandle != null) {
                return precomposedSlotHandle.getPlaceablesCount();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        /* renamed from: getSize-YEO4UFw */
        public final long mo1866getSizeYEO4UFw(int p0) {
            androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.getHighSpeedVideoSizesFor;
            return precomposedSlotHandle != null ? precomposedSlotHandle.mo7377getSizeYEO4UFw(p0) : androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        }

        private final boolean getHighSpeedVideoSizes(long p0, long p1) {
            if (this.getOutputStallDuration) {
                p1 = 0;
            }
            return p0 > p1;
        }

        private final void Camera2StreamConfigurationMap(long p0) {
            this.isOutputSupportedForhNQ4ISI = p0;
            this.isOutputSupportedFor = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
            this.toString = 0L;
            androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", p0);
        }

        private final void Camera2StreamConfigurationMap() {
            long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
            long m23955getInWholeNanosecondsimpl = kotlin.time.Duration.m23955getInWholeNanosecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24039minus6eNON_k(m24028markNowz9LOYto, this.isOutputSupportedFor));
            this.toString = m23955getInWholeNanosecondsimpl;
            long j = this.isOutputSupportedForhNQ4ISI - m23955getInWholeNanosecondsimpl;
            this.isOutputSupportedForhNQ4ISI = j;
            this.isOutputSupportedFor = m24028markNowz9LOYto;
            androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", j);
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public final boolean execute(androidx.compose.foundation.lazy.layout.PrefetchRequestScope prefetchRequestScope) {
            boolean highSpeedVideoFpsRangesFor;
            if (!androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.this.Camera2StreamConfigurationMap) {
                return false;
            }
            if (!this.getOutputStallDuration) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(prefetchRequestScope);
            } else {
                android.os.Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(prefetchRequestScope);
                } finally {
                    android.os.Trace.endSection();
                }
            }
            androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", -1L);
            return highSpeedVideoFpsRangesFor;
        }

        private final void getHighSpeedVideoSizes() {
            androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.getOutputFormats;
            if (pausedPrecomposition != null) {
                pausedPrecomposition.cancel();
            }
            this.getOutputFormats = null;
            androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.getHighSpeedVideoSizesFor;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputSizeshNQ4ISI = null;
        }

        private final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.PrefetchRequestScope prefetchRequestScope) {
            androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", getGetHighResolutionOutputSizeshNQ4ISI());
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider invoke = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.this.getHighSpeedVideoFpsRanges.getItemProvider().invoke();
            if (!this.getInputFormats) {
                int itemCount = invoke.getItemCount();
                int getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
                if (getHighResolutionOutputSizeshNQ4ISI >= 0 && getHighResolutionOutputSizeshNQ4ISI < itemCount) {
                    java.lang.Object key = invoke.getKey(getGetHighResolutionOutputSizeshNQ4ISI());
                    java.lang.Object obj = this.getOutputMinFrameDurationlomOqCM;
                    if (obj != null && !kotlin.jvm.internal.Intrinsics.areEqual(key, obj)) {
                        getHighSpeedVideoSizes();
                        return false;
                    }
                    java.lang.Object contentType = invoke.getContentType(getGetHighResolutionOutputSizeshNQ4ISI());
                    androidx.compose.foundation.lazy.layout.Averages average = this.getHighSpeedVideoFpsRanges.getAverage(contentType);
                    boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                    Camera2StreamConfigurationMap(prefetchRequestScope.availableTimeNanos());
                    if (!getHighResolutionOutputSizeshNQ4ISI()) {
                        if (androidx.compose.foundation.ComposeFoundationFlags.isPausableCompositionInPrefetchEnabled) {
                            if (getHighSpeedVideoSizes(this.isOutputSupportedForhNQ4ISI, average.getResumeTimeNanos() + average.getPauseTimeNanos())) {
                                android.os.Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    getHighSpeedVideoFpsRanges(key, contentType, average);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                } finally {
                                }
                            }
                        } else if (getHighSpeedVideoSizes(this.isOutputSupportedForhNQ4ISI, average.getCompositionTimeNanos())) {
                            android.os.Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                getHighSpeedVideoFpsRangesFor(key, contentType);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                android.os.Trace.endSection();
                                Camera2StreamConfigurationMap();
                                average.saveCompositionTimeNanos(this.toString);
                            } finally {
                            }
                        }
                        if (!getHighResolutionOutputSizeshNQ4ISI()) {
                            return true;
                        }
                    }
                    if (this.getOutputFormats != null) {
                        if (!getHighSpeedVideoSizes(this.isOutputSupportedForhNQ4ISI, average.getApplyTimeNanos())) {
                            return true;
                        }
                        android.os.Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            getHighSpeedVideoFpsRangesFor();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            android.os.Trace.endSection();
                            Camera2StreamConfigurationMap();
                            average.saveApplyTimeNanos(this.toString);
                        } finally {
                        }
                    }
                    if (!this.getOutputStallDurationlomOqCM) {
                        if (this.isOutputSupportedForhNQ4ISI <= 0) {
                            return true;
                        }
                        android.os.Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();
                            this.getOutputStallDurationlomOqCM = true;
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        } finally {
                        }
                    }
                    androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController nestedPrefetchController = this.getOutputSizeshNQ4ISI;
                    if (nestedPrefetchController != null && nestedPrefetchController.getHighResolutionOutputSizeshNQ4ISI(prefetchRequestScope, average.getNestedPrefetchCount(), this.getOutputStallDuration)) {
                        return true;
                    }
                    androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController nestedPrefetchController2 = this.getOutputSizeshNQ4ISI;
                    if (nestedPrefetchController2 != null && nestedPrefetchController2.getCamera2StreamConfigurationMap()) {
                        Camera2StreamConfigurationMap();
                        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", getGetHighResolutionOutputSizeshNQ4ISI());
                        androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController nestedPrefetchController3 = this.getOutputSizeshNQ4ISI;
                        if (nestedPrefetchController3 != null) {
                            nestedPrefetchController3.getHighSpeedVideoFpsRangesFor();
                        }
                    }
                    androidx.compose.ui.unit.Constraints constraints = this.getHighSpeedVideoFpsRangesFor;
                    if (!this.getInputSizeshNQ4ISI && constraints != null) {
                        if ((androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.this.getShouldPauseBetweenPrecompositionAndPremeasure() && !highResolutionOutputSizeshNQ4ISI) || !getHighSpeedVideoSizes(this.isOutputSupportedForhNQ4ISI, average.getMeasureTimeNanos())) {
                            return true;
                        }
                        android.os.Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            getHighSpeedVideoSizes(constraints.getGetHighSpeedVideoFpsRangesFor());
                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                            android.os.Trace.endSection();
                            Camera2StreamConfigurationMap();
                            average.saveMeasureTimeNanos(this.toString);
                            kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
                            if (function1 != null) {
                                function1.invoke(this);
                            }
                        } finally {
                        }
                    }
                    androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController nestedPrefetchController4 = this.getOutputSizeshNQ4ISI;
                    if (this.getInputSizeshNQ4ISI && this.getOutputStallDurationlomOqCM && nestedPrefetchController4 != null) {
                        int Camera2StreamConfigurationMap = nestedPrefetchController4.Camera2StreamConfigurationMap();
                        average.saveNestedPrefetchCount(Camera2StreamConfigurationMap);
                        if (nestedPrefetchController4.getHighSpeedVideoSizes() < Camera2StreamConfigurationMap) {
                            average.clearMeasureTime();
                        }
                    }
                    return false;
                }
            }
            getHighSpeedVideoSizes();
            return false;
        }

        private final void getHighSpeedVideoFpsRanges(java.lang.Object p0, java.lang.Object p1, final androidx.compose.foundation.lazy.layout.Averages p2) {
            androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.getOutputFormats;
            if (pausedPrecomposition == null) {
                androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.this;
                pausedPrecomposition = prefetchHandleProvider.getHighSpeedVideoFpsRangesFor.createPausedPrecomposition(p0, prefetchHandleProvider.getHighSpeedVideoFpsRanges.getContent(getGetHighResolutionOutputSizeshNQ4ISI(), p0, p1));
                this.getOutputFormats = pausedPrecomposition;
                this.getOutputMinFrameDurationlomOqCM = p0;
            }
            this.unwrapAs = false;
            while (!pausedPrecomposition.isComplete() && !this.unwrapAs) {
                pausedPrecomposition.resume(new androidx.compose.runtime.ShouldPauseCallback() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$$ExternalSyntheticLambda1
                    @Override // androidx.compose.runtime.ShouldPauseCallback
                    public final boolean shouldPause() {
                        boolean highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.this, p2);
                        return highSpeedVideoFpsRangesFor;
                    }
                });
            }
            Camera2StreamConfigurationMap();
            if (this.unwrapAs) {
                p2.savePauseTimeNanos(this.toString);
            } else {
                p2.saveResumeTimeNanos(this.toString);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl, androidx.compose.foundation.lazy.layout.Averages averages) {
            if (!handleAndRequestImpl.unwrapAs) {
                handleAndRequestImpl.Camera2StreamConfigurationMap();
                averages.saveResumeTimeNanos(handleAndRequestImpl.toString);
                handleAndRequestImpl.unwrapAs = !handleAndRequestImpl.getHighSpeedVideoSizes(handleAndRequestImpl.isOutputSupportedForhNQ4ISI, averages.getResumeTimeNanos() + averages.getPauseTimeNanos());
            }
            return handleAndRequestImpl.unwrapAs;
        }

        private final void getHighSpeedVideoFpsRangesFor(java.lang.Object p0, java.lang.Object p1) {
            if (this.getHighSpeedVideoSizesFor != null) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Request was already composed!");
            }
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.this.getHighSpeedVideoFpsRanges.getContent(getGetHighResolutionOutputSizeshNQ4ISI(), p0, p1);
            this.getOutputMinFrameDurationlomOqCM = p0;
            this.getHighSpeedVideoSizesFor = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.this.getHighSpeedVideoFpsRangesFor.precompose(p0, content);
            this.getOutputMinFrameDuration = true;
        }

        private final void getHighSpeedVideoFpsRangesFor() {
            androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.getOutputFormats;
            if (pausedPrecomposition == null) {
                throw new java.lang.IllegalArgumentException("Nothing to apply!".toString());
            }
            this.getHighSpeedVideoSizesFor = pausedPrecomposition.apply();
            this.getOutputFormats = null;
            this.getOutputMinFrameDuration = true;
        }

        private final void getHighSpeedVideoSizes(long p0) {
            if (this.getInputFormats) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.getInputSizeshNQ4ISI) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
            }
            this.getInputSizeshNQ4ISI = true;
            androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.getHighSpeedVideoSizesFor;
            if (precomposedSlotHandle != null) {
                int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
                for (int i = 0; i < placeablesCount; i++) {
                    precomposedSlotHandle.mo7378premeasure0kLqBqw(i, p0);
                }
                return;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("performComposition() must be called before performMeasure()");
            throw new kotlin.KotlinNothingValueException();
        }

        private final androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController getHighSpeedVideoFpsRanges() {
            androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.getHighSpeedVideoSizesFor;
            if (precomposedSlotHandle != null) {
                final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, (androidx.compose.ui.node.TraversableNode) obj);
                        return Camera2StreamConfigurationMap;
                    }
                });
                java.util.List list = (java.util.List) objectRef.element;
                if (list != null) {
                    return new androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController(list);
                }
                return null;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
            throw new kotlin.KotlinNothingValueException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.ui.node.TraversableNode traversableNode) {
            T t;
            kotlin.jvm.internal.Intrinsics.checkNotNull(traversableNode, "");
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getHighSpeedVideoFpsRanges = ((androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode) traversableNode).getGetHighSpeedVideoFpsRanges();
            java.util.List list = (java.util.List) objectRef.element;
            if (list != null) {
                list.add(getHighSpeedVideoFpsRanges);
                t = list;
            } else {
                t = kotlin.collections.CollectionsKt.mutableListOf(getHighSpeedVideoFpsRanges);
            }
            objectRef.element = t;
            return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(getGetHighResolutionOutputSizeshNQ4ISI());
            sb.append(", constraints = ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", isComposed = ");
            sb.append(getHighResolutionOutputSizeshNQ4ISI());
            sb.append(", isMeasured = ");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(", isCanceled = ");
            sb.append(this.getInputFormats);
            sb.append(" }");
            return sb.toString();
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\"\u0010\r\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u0015\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;Ljava/util/List;)V", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;IZ)Z", "Camera2StreamConfigurationMap", "()I", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "Ljava/util/List;", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "[Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Z", "()Z", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        final class NestedPrefetchController {
            private boolean Camera2StreamConfigurationMap;

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest>[] getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoFpsRanges;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private int getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
            private final java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> getHighResolutionOutputSizeshNQ4ISI;

            public NestedPrefetchController(java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> list) {
                this.getHighResolutionOutputSizeshNQ4ISI = list;
                this.getHighSpeedVideoFpsRangesFor = new java.util.List[list.size()];
                if (list.isEmpty()) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
            public final boolean getCamera2StreamConfigurationMap() {
                return this.Camera2StreamConfigurationMap;
            }

            public final void getHighSpeedVideoFpsRangesFor() {
                this.Camera2StreamConfigurationMap = false;
            }

            public final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.PrefetchRequestScope prefetchRequestScope, int i, boolean z) {
                if (this.getHighSpeedVideoSizes >= this.getHighResolutionOutputSizeshNQ4ISI.size()) {
                    return false;
                }
                if (androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.this.getInputFormats) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Should not execute nested prefetch on canceled request");
                }
                android.os.Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                try {
                    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> list = this.getHighResolutionOutputSizeshNQ4ISI;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).setRealizedNestedPrefetchCount$foundation(i);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    android.os.Trace.endSection();
                    android.os.Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.getHighSpeedVideoSizes < this.getHighResolutionOutputSizeshNQ4ISI.size()) {
                        try {
                            if (this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoSizes] == null) {
                                if (prefetchRequestScope.availableTimeNanos() <= 0) {
                                    return true;
                                }
                                java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest>[] listArr = this.getHighSpeedVideoFpsRangesFor;
                                int i3 = this.getHighSpeedVideoSizes;
                                listArr[i3] = this.getHighResolutionOutputSizeshNQ4ISI.get(i3).collectNestedPrefetchRequests$foundation();
                            }
                            java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest> list2 = this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoSizes];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                            while (this.getHighSpeedVideoFpsRanges < list2.size()) {
                                androidx.compose.foundation.lazy.layout.PrefetchRequest prefetchRequest = list2.get(this.getHighSpeedVideoFpsRanges);
                                if (z) {
                                    androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = prefetchRequest instanceof androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl ? (androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl) prefetchRequest : null;
                                    if (handleAndRequestImpl != null) {
                                        handleAndRequestImpl.markAsUrgent();
                                    }
                                }
                                this.Camera2StreamConfigurationMap = true;
                                if (prefetchRequest.execute(prefetchRequestScope)) {
                                    return true;
                                }
                                this.getHighSpeedVideoFpsRanges++;
                            }
                            this.getHighSpeedVideoFpsRanges = 0;
                            this.getHighSpeedVideoSizes++;
                        } finally {
                        }
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    return false;
                } finally {
                }
            }

            public final int Camera2StreamConfigurationMap() {
                java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> list = this.getHighResolutionOutputSizeshNQ4ISI;
                int size = list.size();
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    i = java.lang.Math.min(i, list.get(i2).getIdealNestedPrefetchCount());
                }
                if (i == Integer.MAX_VALUE) {
                    return 0;
                }
                return i;
            }

            public final int getHighSpeedVideoSizes() {
                java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> list = this.getHighResolutionOutputSizeshNQ4ISI;
                int size = list.size();
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    i = java.lang.Math.min(i, list.get(i2).getLastNumberOfNestedPrefetchItems());
                }
                if (i == Integer.MAX_VALUE) {
                    return 0;
                }
                return i;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider, int i, long j, androidx.compose.foundation.lazy.layout.PrefetchMetrics prefetchMetrics, androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler priorityPrefetchScheduler, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(prefetchHandleProvider, i, j, prefetchMetrics, priorityPrefetchScheduler, function1);
        }
    }
}
