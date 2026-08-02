package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@¢\u0006\u0004\b\t\u0010\n\u001a$\u0010\u000f\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010\u001a<\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001aY\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b\u001f*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0002\b\u001fH\u0000¢\u0006\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerInputScope", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "", "requestFocus", "showKeyboard", "defaultDetectTextFieldTapGestures", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "defaultTextFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "desiredState", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "menuItem", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLandroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "itemsAvailability", "Lkotlin/Function2;", "Landroidx/compose/foundation/text/TextContextMenuItems;", "Lkotlin/ExtensionFunctionType;", "onMenuItemClicked", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "contextMenuBuilder", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldSelectionStateKt {
    public static final /* synthetic */ void access$logDebug(kotlin.jvm.functions.Function0 function0) {
    }

    public static final java.lang.Object defaultDetectTextFieldTapGestures(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object detectTapAndPress = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(mutableInteractionSource, textFieldSelectionState, null), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.m2315$r8$lambda$MuMWyFwnTnPoV8Kp02OgPpJ44(kotlin.jvm.functions.Function0.this, textFieldSelectionState, function02, (androidx.compose.ui.geometry.Offset) obj);
            }
        }, continuation);
        return detectTapAndPress == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapAndPress : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object defaultTextFieldSelectionGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitSelectionGestures = androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, mouseSelectionObserver, textDragObserver, continuation);
        return awaitSelectionGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitSelectionGestures : kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> menuItem(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (z) {
            return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$menuItem$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function0.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }
            };
        }
        return null;
    }

    public static final kotlin.jvm.functions.Function1<androidx.compose.foundation.contextmenu.ContextMenuScope, kotlin.Unit> contextMenuBuilder(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, final androidx.compose.runtime.State<androidx.compose.foundation.text.MenuItemsAvailability> state, final kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, ? super androidx.compose.foundation.text.TextContextMenuItems, kotlin.Unit> function2) {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.$r8$lambda$nFZ5mRVHKANjZK1ynHBhRfukDyI(androidx.compose.runtime.State.this, contextMenuState, function2, textFieldSelectionState, (androidx.compose.foundation.contextmenu.ContextMenuScope) obj);
            }
        };
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope, final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, final kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, ? super androidx.compose.foundation.text.TextContextMenuItems, kotlin.Unit> function2, final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems, boolean z) {
        if (z) {
            androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$contextMenuBuilder$lambda$0$textFieldItem$$inlined$TextItem$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function2.invoke(textFieldSelectionState, textContextMenuItems);
                    androidx.compose.foundation.contextmenu.ContextMenuStateKt.close(androidx.compose.foundation.contextmenu.ContextMenuState.this);
                }
            }, 14, null);
        }
    }

    /* renamed from: $r8$lambda$MuMW-yFwnTnPoV8-Kp02OgPpJ44, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2315$r8$lambda$MuMWyFwnTnPoV8Kp02OgPpJ44(kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.geometry.Offset offset) {
        new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.$r8$lambda$mR94iEHvLYyBaaoGuAdILS_n8bA();
            }
        };
        function0.invoke();
        if (textFieldSelectionState.getEnabled() && textFieldSelectionState.getIsFocused()) {
            if (!textFieldSelectionState.getReadOnly()) {
                function02.invoke();
                if (textFieldSelectionState.getTextFieldState().getVisualText().length() > 0) {
                    textFieldSelectionState.setShowCursorHandle(true);
                }
            }
            textFieldSelectionState.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None);
            textFieldSelectionState.m2308placeCursorAtNearestOffsetk4lQ0M(androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2264fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.getTextLayoutState(), textFieldSelectionState.getTextLayoutState().m2257coercedInVisibleBoundsOfInputTextMKHz9U$foundation(offset.m5762unboximpl())));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$mR94iEHvLYyBaaoGuAdILS_n8bA() {
        return "onTapTextField";
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nFZ5mRVHKANjZK1ynHBhRfukDyI(androidx.compose.runtime.State state, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope) {
        int m2090unboximpl = ((androidx.compose.foundation.text.MenuItemsAvailability) state.getValue()).m2090unboximpl();
        getHighSpeedVideoSizes(contextMenuScope, contextMenuState, function2, textFieldSelectionState, androidx.compose.foundation.text.TextContextMenuItems.Cut, androidx.compose.foundation.text.MenuItemsAvailability.m2085getCanCutimpl(m2090unboximpl));
        getHighSpeedVideoSizes(contextMenuScope, contextMenuState, function2, textFieldSelectionState, androidx.compose.foundation.text.TextContextMenuItems.Copy, androidx.compose.foundation.text.MenuItemsAvailability.m2084getCanCopyimpl(m2090unboximpl));
        getHighSpeedVideoSizes(contextMenuScope, contextMenuState, function2, textFieldSelectionState, androidx.compose.foundation.text.TextContextMenuItems.Paste, androidx.compose.foundation.text.MenuItemsAvailability.m2086getCanPasteimpl(m2090unboximpl));
        getHighSpeedVideoSizes(contextMenuScope, contextMenuState, function2, textFieldSelectionState, androidx.compose.foundation.text.TextContextMenuItems.SelectAll, androidx.compose.foundation.text.MenuItemsAvailability.m2087getCanSelectAllimpl(m2090unboximpl));
        if (androidx.compose.foundation.internal.PlatformUtils_androidKt.isAutofillAvailable()) {
            getHighSpeedVideoSizes(contextMenuScope, contextMenuState, function2, textFieldSelectionState, androidx.compose.foundation.text.TextContextMenuItems.Autofill, androidx.compose.foundation.text.MenuItemsAvailability.m2083getCanAutofillimpl(m2090unboximpl));
        }
        return kotlin.Unit.INSTANCE;
    }
}
