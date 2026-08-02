package androidx.paging;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u00060\u0010R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/paging/HintHandler;", "", "<init>", "()V", "Landroidx/paging/LoadType;", "loadType", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/ViewportHint;", "hintFor", "(Landroidx/paging/LoadType;)Lkotlinx/coroutines/flow/Flow;", "viewportHint", "", "forceSetHint", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V", "processHint", "(Landroidx/paging/ViewportHint;)V", "Landroidx/paging/HintHandler$State;", "getHighSpeedVideoSizes", "Landroidx/paging/HintHandler$State;", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/ViewportHint$Access;", "getLastAccessHint", "()Landroidx/paging/ViewportHint$Access;", "lastAccessHint", "State", "HintFlow"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HintHandler {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.paging.HintHandler.State getHighSpeedVideoFpsRangesFor = new androidx.paging.HintHandler.State();

    public final androidx.paging.ViewportHint.Access getLastAccessHint() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.ViewportHint> hintFor(androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        int i = androidx.paging.HintHandler.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        }
        if (i != 2) {
            throw new java.lang.IllegalArgumentException("invalid load type for hints");
        }
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
    }

    public final void forceSetHint(final androidx.paging.LoadType loadType, final androidx.paging.ViewportHint viewportHint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewportHint, "");
        if (loadType != androidx.paging.LoadType.PREPEND && loadType != androidx.paging.LoadType.APPEND) {
            throw new java.lang.IllegalArgumentException("invalid load type for reset: ".concat(java.lang.String.valueOf(loadType)).toString());
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(null, new kotlin.jvm.functions.Function2() { // from class: androidx.paging.HintHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.HintHandler.$r8$lambda$u9b_9KHCNn8DEEaKGcOb9IIxXyI(androidx.paging.LoadType.this, viewportHint, (androidx.paging.HintHandler.HintFlow) obj, (androidx.paging.HintHandler.HintFlow) obj2);
            }
        });
    }

    public final void processHint(final androidx.paging.ViewportHint viewportHint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewportHint, "");
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(viewportHint instanceof androidx.paging.ViewportHint.Access ? (androidx.paging.ViewportHint.Access) viewportHint : null, new kotlin.jvm.functions.Function2() { // from class: androidx.paging.HintHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.paging.HintHandler.m9256$r8$lambda$L1tAnRFlg1qZLTd8gY46iqZu30(androidx.paging.ViewportHint.this, (androidx.paging.HintHandler.HintFlow) obj, (androidx.paging.HintHandler.HintFlow) obj2);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042*\u0010\u000b\u001a&\u0012\r\u0012\u000b0\u0007R\u00020\b¢\u0006\u0002\b\t\u0012\r\u0012\u000b0\u0007R\u00020\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u00060\u0007R\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0018\u0010\u0011\u001a\u00060\u0007R\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0010\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/paging/HintHandler$State;", "", "<init>", "(Landroidx/paging/HintHandler;)V", "Landroidx/paging/ViewportHint$Access;", "p0", "Lkotlin/Function2;", "Landroidx/paging/HintHandler$HintFlow;", "Landroidx/paging/HintHandler;", "Lkotlin/ParameterName;", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroidx/paging/ViewportHint$Access;Lkotlin/jvm/functions/Function2;)V", "Landroidx/paging/HintHandler$HintFlow;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/paging/ViewportHint$Access;", "getHighSpeedVideoFpsRanges", "Landroidx/paging/internal/SynchronizedLock;", "Landroidx/paging/internal/SynchronizedLock;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class State {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        androidx.paging.ViewportHint.Access getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final androidx.paging.HintHandler.HintFlow getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.paging.internal.SynchronizedLock getHighResolutionOutputSizeshNQ4ISI = new androidx.paging.internal.SynchronizedLock();

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final androidx.paging.HintHandler.HintFlow Camera2StreamConfigurationMap;

        public State() {
            this.Camera2StreamConfigurationMap = androidx.paging.HintHandler.this.new HintFlow();
            this.getHighSpeedVideoSizes = androidx.paging.HintHandler.this.new HintFlow();
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.paging.ViewportHint.Access p0, kotlin.jvm.functions.Function2<? super androidx.paging.HintHandler.HintFlow, ? super androidx.paging.HintHandler.HintFlow, kotlin.Unit> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (p0 != null) {
                    this.getHighSpeedVideoFpsRanges = p0;
                }
                p1.invoke(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007@GX\u0086\f¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/paging/HintHandler$HintFlow;", "", "<init>", "(Landroidx/paging/HintHandler;)V", "Landroidx/paging/ViewportHint;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/ViewportHint;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class HintFlow {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        androidx.paging.ViewportHint getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final kotlinx.coroutines.flow.MutableSharedFlow<androidx.paging.ViewportHint> Camera2StreamConfigurationMap = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, 2, null);

        public HintFlow() {
        }
    }

    /* renamed from: $r8$lambda$L1tAnRF-lg1qZLTd8gY46iqZu30, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9256$r8$lambda$L1tAnRFlg1qZLTd8gY46iqZu30(androidx.paging.ViewportHint viewportHint, androidx.paging.HintHandler.HintFlow hintFlow, androidx.paging.HintHandler.HintFlow hintFlow2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hintFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hintFlow2, "");
        if (androidx.paging.HintHandlerKt.shouldPrioritizeOver(viewportHint, hintFlow.getHighSpeedVideoSizes, androidx.paging.LoadType.PREPEND)) {
            hintFlow.getHighSpeedVideoSizes = viewportHint;
            if (viewportHint != null) {
                hintFlow.Camera2StreamConfigurationMap.tryEmit(viewportHint);
            }
        }
        if (androidx.paging.HintHandlerKt.shouldPrioritizeOver(viewportHint, hintFlow2.getHighSpeedVideoSizes, androidx.paging.LoadType.APPEND)) {
            hintFlow2.getHighSpeedVideoSizes = viewportHint;
            if (viewportHint != null) {
                hintFlow2.Camera2StreamConfigurationMap.tryEmit(viewportHint);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u9b_9KHCNn8DEEaKGcOb9IIxXyI(androidx.paging.LoadType loadType, androidx.paging.ViewportHint viewportHint, androidx.paging.HintHandler.HintFlow hintFlow, androidx.paging.HintHandler.HintFlow hintFlow2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hintFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hintFlow2, "");
        if (loadType == androidx.paging.LoadType.PREPEND) {
            hintFlow.getHighSpeedVideoSizes = viewportHint;
            if (viewportHint != null) {
                hintFlow.Camera2StreamConfigurationMap.tryEmit(viewportHint);
            }
        } else {
            hintFlow2.getHighSpeedVideoSizes = viewportHint;
            if (viewportHint != null) {
                hintFlow2.Camera2StreamConfigurationMap.tryEmit(viewportHint);
            }
        }
        return kotlin.Unit.INSTANCE;
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
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
