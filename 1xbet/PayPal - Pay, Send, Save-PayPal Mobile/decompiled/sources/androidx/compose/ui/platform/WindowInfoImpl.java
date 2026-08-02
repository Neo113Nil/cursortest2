package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R+\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d"}, d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/platform/WindowInfo;", "<init>", "()V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/DpSize;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "", "<set-?>", "isWindowFocused$delegate", "isWindowFocused", "()Z", "setWindowFocused", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getKeyboardModifiers-k7X9c1A", "()I", "setKeyboardModifiers-5xRPYO0", "(I)V", "keyboardModifiers", "getContainerSize-YbymL2g", "()J", "setContainerSize-ozmzZPI", "(J)V", "containerSize", "getContainerDpSize-MYxV2XQ", "setContainerDpSize-EaSLcWc", "containerDpSize", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowInfoImpl implements androidx.compose.ui.platform.WindowInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.WindowInfoImpl.Companion INSTANCE = new androidx.compose.ui.platform.WindowInfoImpl.Companion(null);
    private static final androidx.compose.runtime.MutableState<androidx.compose.ui.input.pointer.PointerKeyboardModifiers> GlobalKeyboardModifiers = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m7290boximpl(androidx.compose.ui.input.pointer.PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()), null, 2, null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.DpSize> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.DpSize.m8687boximpl(androidx.compose.ui.unit.DpSize.INSTANCE.m8709getZeroMYxV2XQ()), null, 2, null);

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
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public final int mo7768getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public final void m7783setKeyboardModifiers5xRPYO0(int i) {
        GlobalKeyboardModifiers.setValue(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m7290boximpl(i));
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public final long mo7767getContainerSizeYbymL2g() {
        return this.getHighSpeedVideoSizes.getValue().m8776unboximpl();
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public final void m7782setContainerSizeozmzZPI(long j) {
        this.getHighSpeedVideoSizes.setValue(androidx.compose.ui.unit.IntSize.m8764boximpl(j));
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ */
    public final long mo7766getContainerDpSizeMYxV2XQ() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getGetHighSpeedVideoSizes();
    }

    /* renamed from: setContainerDpSize-EaSLcWc, reason: not valid java name */
    public final void m7781setContainerDpSizeEaSLcWc(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(androidx.compose.ui.unit.DpSize.m8687boximpl(j));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "GlobalKeyboardModifiers", "Landroidx/compose/runtime/MutableState;", "getGlobalKeyboardModifiers$ui", "()Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.MutableState<androidx.compose.ui.input.pointer.PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui() {
            return androidx.compose.ui.platform.WindowInfoImpl.GlobalKeyboardModifiers;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
