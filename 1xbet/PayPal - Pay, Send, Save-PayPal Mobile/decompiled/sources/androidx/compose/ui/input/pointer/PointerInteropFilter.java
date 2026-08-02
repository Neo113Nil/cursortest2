package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "Lkotlin/jvm/functions/Function1;", "getOnTouchEvent", "()Lkotlin/jvm/functions/Function1;", "setOnTouchEvent", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "requestDisallowInterceptTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "getRequestDisallowInterceptTouchEvent", "()Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "setRequestDisallowInterceptTouchEvent", "(Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;)V", "disallowIntercept", "Z", "getDisallowIntercept$ui", "()Z", "setDisallowIntercept$ui", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter$annotations", "DispatchToViewState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerInteropFilter implements androidx.compose.ui.input.pointer.PointerInputModifier {
    public static final int $stable = 0;
    private boolean disallowIntercept;
    public kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> onTouchEvent;
    private final androidx.compose.ui.input.pointer.PointerInputFilter pointerInputFilter = new androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1(this);
    private androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    public static /* synthetic */ void getPointerInputFilter$annotations() {
    }

    public final kotlin.jvm.functions.Function1<android.view.MotionEvent, java.lang.Boolean> getOnTouchEvent() {
        kotlin.jvm.functions.Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setOnTouchEvent(kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> function1) {
        this.onTouchEvent = function1;
    }

    public final androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setRequestDisallowInterceptTouchEvent(androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui(this);
        }
    }

    /* renamed from: getDisallowIntercept$ui, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    public final void setDisallowIntercept$ui(boolean z) {
        this.disallowIntercept = z;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DispatchToViewState {
        private static final /* synthetic */ androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState[] Camera2StreamConfigurationMap;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        public static final androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState getHighSpeedVideoFpsRanges = new androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState("Unknown", 0);
        public static final androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState getHighSpeedVideoSizes = new androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState("Dispatching", 1);
        public static final androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState("NotDispatching", 2);

        private DispatchToViewState(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            Camera2StreamConfigurationMap = highSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
        }

        public static androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState[] values() {
            return (androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState[]) Camera2StreamConfigurationMap.clone();
        }

        public static androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState valueOf(java.lang.String str) {
            return (androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState) java.lang.Enum.valueOf(androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.class, str);
        }

        private static final /* synthetic */ androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState[] getHighSpeedVideoFpsRanges() {
            return new androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState[]{getHighSpeedVideoFpsRanges, getHighSpeedVideoSizes, getHighResolutionOutputSizeshNQ4ISI};
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public final androidx.compose.ui.input.pointer.PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }
}
