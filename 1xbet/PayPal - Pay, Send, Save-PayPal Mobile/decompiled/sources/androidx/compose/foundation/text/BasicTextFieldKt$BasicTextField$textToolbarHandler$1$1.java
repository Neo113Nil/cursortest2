package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "showTextToolbar", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hideTextToolbar", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler {
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.platform.TextToolbar getHighSpeedVideoFpsRangesFor;

    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(androidx.compose.ui.platform.TextToolbar textToolbar, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.getHighSpeedVideoFpsRangesFor = textToolbar;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object showTextToolbar(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;
        int i;
        androidx.compose.ui.geometry.Rect rect2;
        androidx.compose.ui.platform.TextToolbar textToolbar;
        final kotlinx.coroutines.CoroutineScope coroutineScope;
        if (continuation instanceof androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) {
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 = (androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) continuation;
            if ((basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.platform.TextToolbar textToolbar2 = this.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = this.getHighSpeedVideoFpsRanges;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighResolutionOutputSizeshNQ4ISI = rect;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRanges = textToolbar2;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoSizes = coroutineScope2;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.Camera2StreamConfigurationMap = textFieldSelectionState;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (textFieldSelectionState.updateClipboardEntry(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rect2 = rect;
                    textToolbar = textToolbar2;
                    coroutineScope = coroutineScope2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    textFieldSelectionState = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.Camera2StreamConfigurationMap;
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoSizes;
                    androidx.compose.ui.platform.TextToolbar textToolbar3 = (androidx.compose.ui.platform.TextToolbar) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRanges;
                    androidx.compose.ui.geometry.Rect rect3 = (androidx.compose.ui.geometry.Rect) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    rect2 = rect3;
                    textToolbar = textToolbar3;
                }
                boolean canShowCopyMenuItem = textFieldSelectionState.canShowCopyMenuItem();
                final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = canShowCopyMenuItem ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$1$1(textFieldSelectionState, null), 1, null);
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(textToolbarState);
                    }
                };
                boolean canShowPasteMenuItem = textFieldSelectionState.canShowPasteMenuItem();
                final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = canShowPasteMenuItem ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$2
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1(textFieldSelectionState, null), 1, null);
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(textToolbarState2);
                    }
                };
                boolean canShowCutMenuItem = textFieldSelectionState.canShowCutMenuItem();
                final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState3 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = canShowCutMenuItem ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$3
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$3$1(textFieldSelectionState, null), 1, null);
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(textToolbarState3);
                    }
                };
                boolean canShowSelectAllMenuItem = textFieldSelectionState.canShowSelectAllMenuItem();
                final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState4 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection;
                kotlin.jvm.functions.Function0<kotlin.Unit> function04 = canShowSelectAllMenuItem ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$4
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        textFieldSelectionState.selectAll();
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(textToolbarState4);
                    }
                };
                boolean canShowAutofillMenuItem = textFieldSelectionState.canShowAutofillMenuItem();
                final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState5 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
                textToolbar.showMenu(rect2, function0, function02, function03, function04, canShowAutofillMenuItem ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$5
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        textFieldSelectionState.autofill();
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(textToolbarState5);
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
        }
        basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(this, continuation);
        java.lang.Object obj2 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        boolean canShowCopyMenuItem2 = textFieldSelectionState.canShowCopyMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState6 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        if (canShowCopyMenuItem2) {
        }
        boolean canShowPasteMenuItem2 = textFieldSelectionState.canShowPasteMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState22 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        if (canShowPasteMenuItem2) {
        }
        boolean canShowCutMenuItem2 = textFieldSelectionState.canShowCutMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState32 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        if (canShowCutMenuItem2) {
        }
        boolean canShowSelectAllMenuItem2 = textFieldSelectionState.canShowSelectAllMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState42 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection;
        if (canShowSelectAllMenuItem2) {
        }
        boolean canShowAutofillMenuItem2 = textFieldSelectionState.canShowAutofillMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState52 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        textToolbar.showMenu(rect2, function0, function02, function03, function04, canShowAutofillMenuItem2 ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$5
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textFieldSelectionState.autofill();
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(textToolbarState52);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public final void hideTextToolbar() {
        if (this.getHighSpeedVideoFpsRangesFor.getStatus() == androidx.compose.ui.platform.TextToolbarStatus.Shown) {
            this.getHighSpeedVideoFpsRangesFor.hide();
        }
    }
}
