package androidx.compose.ui.input;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "Landroidx/compose/ui/input/InputMode;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "inputMode", "requestInputMode-iuPiT84", "(I)Z", "requestInputMode", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "<set-?>", "inputMode$delegate", "Landroidx/compose/runtime/MutableState;", "getInputMode-aOaMEAU", "()I", "setInputMode-iuPiT84", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements androidx.compose.ui.input.InputModeManager {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.InputMode, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: inputMode$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState inputMode;

    /* JADX WARN: Multi-variable type inference failed */
    private InputModeManagerImpl(int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.InputMode, java.lang.Boolean> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.inputMode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.input.InputMode.m6738boximpl(i), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public final int mo6747getInputModeaOaMEAU() {
        return ((androidx.compose.ui.input.InputMode) this.inputMode.getValue()).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public final void m6749setInputModeiuPiT84(int i) {
        this.inputMode.setValue(androidx.compose.ui.input.InputMode.m6738boximpl(i));
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public final boolean mo6748requestInputModeiuPiT84(int inputMode) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(androidx.compose.ui.input.InputMode.m6738boximpl(inputMode)).booleanValue();
    }

    public /* synthetic */ InputModeManagerImpl(int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }
}
