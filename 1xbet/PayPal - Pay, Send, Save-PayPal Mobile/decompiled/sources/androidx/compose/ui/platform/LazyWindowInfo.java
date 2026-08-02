package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R+\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#"}, d2 = {"Landroidx/compose/ui/platform/LazyWindowInfo;", "Landroidx/compose/ui/platform/WindowInfo;", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/DerivedSize;", "calculateContainerSize", "", "updateContainerSizeIfObserved", "(Lkotlin/jvm/functions/Function0;)V", "onInitializeContainerSize", "setOnInitializeContainerSize", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "", "<set-?>", "isWindowFocused$delegate", "isWindowFocused", "()Z", "setWindowFocused", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getKeyboardModifiers-k7X9c1A", "()I", "setKeyboardModifiers-5xRPYO0", "(I)V", "keyboardModifiers", "Landroidx/compose/ui/unit/IntSize;", "getContainerSize-YbymL2g", "()J", "containerSize", "Landroidx/compose/ui/unit/DpSize;", "getContainerDpSize-MYxV2XQ", "containerDpSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyWindowInfo implements androidx.compose.ui.platform.WindowInfo {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableState<androidx.compose.ui.platform.DerivedSize> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<androidx.compose.ui.platform.DerivedSize> Camera2StreamConfigurationMap;

    /* renamed from: isWindowFocused$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isWindowFocused = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public final boolean isWindowFocused() {
        return ((java.lang.Boolean) this.isWindowFocused.getValue()).booleanValue();
    }

    public final void setWindowFocused(boolean z) {
        this.isWindowFocused.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int mo7768getKeyboardModifiersk7X9c1A() {
        return androidx.compose.ui.platform.WindowInfoImpl.INSTANCE.getGlobalKeyboardModifiers$ui().getValue().getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public final void m7769setKeyboardModifiers5xRPYO0(int i) {
        androidx.compose.ui.platform.WindowInfoImpl.INSTANCE.getGlobalKeyboardModifiers$ui().setValue(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m7290boximpl(i));
    }

    public final void updateContainerSizeIfObserved(kotlin.jvm.functions.Function0<androidx.compose.ui.platform.DerivedSize> calculateContainerSize) {
        androidx.compose.runtime.MutableState mutableState = this.getHighSpeedVideoSizes;
        if (mutableState != null) {
            mutableState.setValue(calculateContainerSize.invoke());
        }
    }

    public final void setOnInitializeContainerSize(kotlin.jvm.functions.Function0<androidx.compose.ui.platform.DerivedSize> onInitializeContainerSize) {
        if (this.getHighSpeedVideoSizes == null) {
            this.Camera2StreamConfigurationMap = onInitializeContainerSize;
        }
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public final long mo7767getContainerSizeYbymL2g() {
        androidx.compose.ui.platform.DerivedSize zero;
        if (this.getHighSpeedVideoSizes == null) {
            kotlin.jvm.functions.Function0<androidx.compose.ui.platform.DerivedSize> function0 = this.Camera2StreamConfigurationMap;
            if (function0 == null || (zero = function0.invoke()) == null) {
                zero = androidx.compose.ui.platform.DerivedSize.INSTANCE.getZero();
            }
            this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zero, null, 2, null);
            this.Camera2StreamConfigurationMap = null;
        }
        androidx.compose.runtime.MutableState<androidx.compose.ui.platform.DerivedSize> mutableState = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableState);
        return mutableState.getValue().getPxSize();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ, reason: not valid java name */
    public final long mo7766getContainerDpSizeMYxV2XQ() {
        androidx.compose.ui.platform.DerivedSize zero;
        if (this.getHighSpeedVideoSizes == null) {
            kotlin.jvm.functions.Function0<androidx.compose.ui.platform.DerivedSize> function0 = this.Camera2StreamConfigurationMap;
            if (function0 == null || (zero = function0.invoke()) == null) {
                zero = androidx.compose.ui.platform.DerivedSize.INSTANCE.getZero();
            }
            this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zero, null, 2, null);
            this.Camera2StreamConfigurationMap = null;
        }
        androidx.compose.runtime.MutableState<androidx.compose.ui.platform.DerivedSize> mutableState = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableState);
        return mutableState.getValue().getDpSize();
    }
}
