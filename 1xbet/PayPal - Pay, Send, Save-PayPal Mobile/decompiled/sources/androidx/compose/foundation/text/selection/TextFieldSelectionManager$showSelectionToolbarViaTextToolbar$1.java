package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", f = "TextFieldSelectionManager.kt", i = {}, l = {1078}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.updateClipboardEntry$foundation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = textFieldSelectionManager.canShowCopyMenuItem$foundation() ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
                }
            } : null;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = textFieldSelectionManager.canShowCutMenuItem$foundation() ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
                }
            } : null;
            kotlin.jvm.functions.Function0<kotlin.Unit> function03 = textFieldSelectionManager.canShowPasteMenuItem$foundation() ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
                }
            } : null;
            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = textFieldSelectionManager.canShowSelectAllMenuItem$foundation() ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.getHighSpeedVideoSizes(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
                }
            } : null;
            kotlin.jvm.functions.Function0<kotlin.Unit> function05 = textFieldSelectionManager.canShowAutofillMenuItem$foundation() ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
                }
            } : null;
            androidx.compose.ui.platform.TextToolbar textToolbar = textFieldSelectionManager.getTextToolbar();
            if (textToolbar != null) {
                highSpeedVideoFpsRangesFor = textFieldSelectionManager.getHighSpeedVideoFpsRangesFor();
                textToolbar.showMenu(highSpeedVideoFpsRangesFor, function0, function03, function02, function04, function05);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        kotlinx.coroutines.CoroutineScope coroutineScope = textFieldSelectionManager.getCoroutineScope();
        if (coroutineScope != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(textFieldSelectionManager, null), 1, null);
        }
        textFieldSelectionManager.hideSelectionToolbar$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        kotlinx.coroutines.CoroutineScope coroutineScope = textFieldSelectionManager.getCoroutineScope();
        if (coroutineScope != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1(textFieldSelectionManager, null), 1, null);
        }
        textFieldSelectionManager.hideSelectionToolbar$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        kotlinx.coroutines.CoroutineScope coroutineScope = textFieldSelectionManager.getCoroutineScope();
        if (coroutineScope != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1(textFieldSelectionManager, null), 1, null);
        }
        textFieldSelectionManager.hideSelectionToolbar$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.autofill$foundation();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.selectAll$foundation();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldSelectionManager;
    }
}
