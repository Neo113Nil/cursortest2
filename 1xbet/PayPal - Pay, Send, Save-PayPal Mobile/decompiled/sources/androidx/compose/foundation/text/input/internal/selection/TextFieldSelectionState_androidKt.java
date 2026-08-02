package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aB\u0010\u000f\u001a\u00020\f*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "state", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "addBasicTextFieldTextContextMenuComponents", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerInputScope", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "", "requestFocus", "showKeyboard", "detectTextFieldTapGestures", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "textFieldSelectionGestures", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    public static final androidx.compose.ui.Modifier addBasicTextFieldTextContextMenuComponents(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final kotlinx.coroutines.CoroutineScope coroutineScope) {
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$AWqy7kt5ciCYEJTAF7HYklUjyLI(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, coroutineScope, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj, (android.content.Context) obj2);
            }
        });
    }

    public static final java.lang.Object detectTextFieldTapGestures(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object defaultDetectTextFieldTapGestures = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures(textFieldSelectionState, pointerInputScope, mutableInteractionSource, function0, function02, continuation);
        return defaultDetectTextFieldTapGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? defaultDetectTextFieldTapGestures : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object textFieldSelectionGestures(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object defaultTextFieldSelectionGestures = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.defaultTextFieldSelectionGestures(pointerInputScope, mouseSelectionObserver, textDragObserver, continuation);
        return defaultTextFieldSelectionGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? defaultTextFieldSelectionGestures : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$6BJ4w7nwkNmVQs4tOIxXCQPa3KE(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        return !textFieldSelectionState.getTextToolbarShown();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AWqy7kt5ciCYEJTAF7HYklUjyLI(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, final android.content.Context context) {
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m2387addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, textFieldSelectionState.getEditable$foundation(), textFieldSelectionState.getTextFieldState().getVisualText().getText(), androidx.compose.ui.text.TextRange.m8027boximpl(textFieldSelectionState.getTextFieldState().getVisualText().getSelection()), textFieldSelectionState.getPlatformSelectionBehaviors(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$QjMD9UYeuM0bb8t1s8lbZuYXGq4(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, coroutineScope, context, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BZNkuoe1I482AwWvGucJQItVe5c(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.selectAll();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QjMD9UYeuM0bb8t1s8lbZuYXGq4(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final kotlinx.coroutines.CoroutineScope coroutineScope, android.content.Context context, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems = androidx.compose.foundation.text.TextContextMenuItems.Cut;
        boolean canShowCutMenuItem = textFieldSelectionState.canShowCutMenuItem();
        final kotlin.jvm.functions.Function0 function0 = null;
        final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState, null);
        final kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$cTsbEQwvVih0Y0hC5nt3eMrKRbY(kotlinx.coroutines.CoroutineScope.this, textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1);
            }
        };
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, canShowCutMenuItem, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$sBcQ4L6CkbdBQQ6OzyyueGe1uiA(kotlin.jvm.functions.Function0.this, function0, textFieldSelectionState, textToolbarState, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems2 = androidx.compose.foundation.text.TextContextMenuItems.Copy;
        boolean canShowCopyMenuItem = textFieldSelectionState.canShowCopyMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2(textFieldSelectionState, null);
        final kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$cTsbEQwvVih0Y0hC5nt3eMrKRbY(kotlinx.coroutines.CoroutineScope.this, textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2);
            }
        };
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems2, canShowCopyMenuItem, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$sBcQ4L6CkbdBQQ6OzyyueGe1uiA(kotlin.jvm.functions.Function0.this, function0, textFieldSelectionState, textToolbarState2, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems3 = androidx.compose.foundation.text.TextContextMenuItems.Paste;
        boolean canShowPasteMenuItem = textFieldSelectionState.canShowPasteMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3(textFieldSelectionState, null);
        final kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$cTsbEQwvVih0Y0hC5nt3eMrKRbY(kotlinx.coroutines.CoroutineScope.this, textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3);
            }
        };
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState3 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems3, canShowPasteMenuItem, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$sBcQ4L6CkbdBQQ6OzyyueGe1uiA(kotlin.jvm.functions.Function0.this, function0, textFieldSelectionState, textToolbarState3, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems4 = androidx.compose.foundation.text.TextContextMenuItems.SelectAll;
        boolean canShowSelectAllMenuItem = textFieldSelectionState.canShowSelectAllMenuItem();
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState4 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection;
        final kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$6BJ4w7nwkNmVQs4tOIxXCQPa3KE(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this));
            }
        };
        final kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$BZNkuoe1I482AwWvGucJQItVe5c(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
            }
        };
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems4, canShowSelectAllMenuItem, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$sBcQ4L6CkbdBQQ6OzyyueGe1uiA(kotlin.jvm.functions.Function0.this, function05, textFieldSelectionState, textToolbarState4, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems5 = androidx.compose.foundation.text.TextContextMenuItems.Autofill;
        boolean canShowAutofillMenuItem = textFieldSelectionState.canShowAutofillMenuItem();
        final kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.m2317$r8$lambda$cGN7QolM5hM3lJYwCh6vGOeuOQ(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
            }
        };
        final androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState5 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None;
        androidx.compose.foundation.text.ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems5, canShowAutofillMenuItem, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.$r8$lambda$sBcQ4L6CkbdBQQ6OzyyueGe1uiA(kotlin.jvm.functions.Function0.this, function0, textFieldSelectionState, textToolbarState5, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
            }
        });
        textContextMenuBuilderScope.separator();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cGN7QolM-5hM3lJYwCh6vGOeuOQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2317$r8$lambda$cGN7QolM5hM3lJYwCh6vGOeuOQ(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.autofill();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cTsbEQwvVih0Y0hC5nt3eMrKRbY(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(function1, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sBcQ4L6CkbdBQQ6OzyyueGe1uiA(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState, androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession) {
        function0.invoke();
        if (function02 == null || ((java.lang.Boolean) function02.invoke()).booleanValue()) {
            textContextMenuSession.close();
        }
        textFieldSelectionState.updateTextToolbarState(textToolbarState);
        return kotlin.Unit.INSTANCE;
    }
}
