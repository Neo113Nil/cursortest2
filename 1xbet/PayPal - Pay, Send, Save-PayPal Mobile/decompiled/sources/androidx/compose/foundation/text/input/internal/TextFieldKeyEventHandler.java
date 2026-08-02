package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u001e\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010("}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "clipboardKeyCommandsHandler", "editable", "singleLine", "Lkotlin/Function0;", "onSubmit", "onKeyEvent-8zsqlwg", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/platform/SoftwareKeyboardController;ZZLkotlin/jvm/functions/Function0;)Z", "onKeyEvent", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/KeyMapping;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/KeyMapping;", "Landroidx/collection/MutableLongSet;", "Landroidx/collection/MutableLongSet;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.MutableLongSet getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState Camera2StreamConfigurationMap = new androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.DeadKeyCombiner getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.DeadKeyCombiner();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.KeyMapping getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo2205onPreKeyEventMyFupTE(android.view.KeyEvent event, androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController keyboardController) {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textFieldState.getVisualText().getSelection()) || !androidx.compose.foundation.text.KeyEventHelpers_androidKt.m2053cancelsTextSelectionZmokQxo(event)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0196  */
    /* renamed from: onKeyEvent-8zsqlwg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2204onKeyEvent8zsqlwg(android.view.KeyEvent event, androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> clipboardKeyCommandsHandler, androidx.compose.ui.platform.SoftwareKeyboardController keyboardController, boolean editable, boolean singleLine, kotlin.jvm.functions.Function0<java.lang.Boolean> onSubmit) {
        float f;
        androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity;
        androidx.compose.ui.geometry.Rect rect;
        java.lang.Integer m2051consumeZmokQxo;
        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
        boolean z = false;
        if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7087getKeyUpCS__XNY())) {
            androidx.collection.MutableLongSet mutableLongSet = this.getHighSpeedVideoFpsRangesFor;
            if (mutableLongSet == null || !mutableLongSet.contains(m7089getKeyZmokQxo)) {
                return false;
            }
            androidx.collection.MutableLongSet mutableLongSet2 = this.getHighSpeedVideoFpsRangesFor;
            if (mutableLongSet2 != null) {
                mutableLongSet2.remove(m7089getKeyZmokQxo);
            }
            return true;
        }
        if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7088getUnknownCS__XNY()) && !androidx.compose.foundation.text.TextFieldKeyInput_androidKt.m2125isTypedEventZmokQxo(event)) {
            return false;
        }
        if (androidx.compose.foundation.text.TextFieldKeyInput_androidKt.m2125isTypedEventZmokQxo(event) && (m2051consumeZmokQxo = this.getHighSpeedVideoFpsRanges.m2051consumeZmokQxo(event)) != null) {
            java.lang.String obj = androidx.compose.foundation.text.StringHelpers_jvmKt.appendCodePointX(new java.lang.StringBuilder(2), m2051consumeZmokQxo.intValue()).toString();
            if (editable) {
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(textFieldState, obj, true, null, !androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2253isFromSoftKeyboardZmokQxo(event), 4, null);
                this.Camera2StreamConfigurationMap.resetCachedX();
                z = true;
            }
        } else {
            androidx.compose.foundation.text.KeyCommand mo2054mapZmokQxo = this.getHighResolutionOutputSizeshNQ4ISI.mo2054mapZmokQxo(event);
            if (mo2054mapZmokQxo != null && (!mo2054mapZmokQxo.getEditsText() || editable)) {
                androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
                if (textLayoutNodeCoordinates != null) {
                    if (!textLayoutNodeCoordinates.isAttached()) {
                        textLayoutNodeCoordinates = null;
                    }
                    if (textLayoutNodeCoordinates != null) {
                        androidx.compose.ui.layout.LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
                        if (decoratorNodeCoordinates != null) {
                            if (!decoratorNodeCoordinates.isAttached()) {
                                decoratorNodeCoordinates = null;
                            }
                            if (decoratorNodeCoordinates != null) {
                                rect = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                                if (rect != null) {
                                    f = java.lang.Float.intBitsToFloat((int) (rect.m5785getSizeNHjbRc() & 4294967295L));
                                    androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext selectionMovementDeletionContext = new androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext(textFieldState, layoutResult, androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2253isFromSoftKeyboardZmokQxo(event), f, this.Camera2StreamConfigurationMap);
                                    switch (androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.WhenMappings.$EnumSwitchMapping$0[mo2054mapZmokQxo.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                            clipboardKeyCommandsHandler.invoke(mo2054mapZmokQxo);
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled && (mo2054mapZmokQxo == androidx.compose.foundation.text.KeyCommand.UP || mo2054mapZmokQxo == androidx.compose.foundation.text.KeyCommand.DOWN || mo2054mapZmokQxo == androidx.compose.foundation.text.KeyCommand.LEFT_CHAR || mo2054mapZmokQxo == androidx.compose.foundation.text.KeyCommand.RIGHT_CHAR)) {
                                                z = !androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getInitialValue().getSelection(), selectionMovementDeletionContext.getSelection());
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                                textFieldState.m2275selectCharsIn5zctL8(selectionMovementDeletionContext.getSelection());
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null && (wedgeAffinity = selectionMovementDeletionContext.getWedgeAffinity()) != null) {
                                                if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textFieldState.getUntransformedText().getSelection())) {
                                                    textFieldState.setSelectionWedgeAffinity(new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(wedgeAffinity));
                                                    break;
                                                } else {
                                                    textFieldState.setSelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity.copy$default(selectionMovementDeletionContext.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            selectionMovementDeletionContext.collapseLeftOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                                    return androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.m2251$r8$lambda$evVnmB1Pdz9qgtwvfTEY9l9cN4((androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext) obj2);
                                                }
                                            });
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                                z = !androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getInitialValue().getSelection(), selectionMovementDeletionContext.getSelection());
                                                break;
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                                if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textFieldState.getUntransformedText().getSelection())) {
                                                }
                                                break;
                                            }
                                            break;
                                        case 5:
                                            selectionMovementDeletionContext.collapseRightOr(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                                    return androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.$r8$lambda$cL2zOB6bDyBxmVpH7EzkneDMfC4((androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext) obj2);
                                                }
                                            });
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 6:
                                            selectionMovementDeletionContext.moveCursorLeftByWord();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 7:
                                            selectionMovementDeletionContext.moveCursorRightByWord();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 8:
                                            selectionMovementDeletionContext.moveCursorPrevByParagraph();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 9:
                                            selectionMovementDeletionContext.moveCursorNextByParagraph();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 10:
                                            selectionMovementDeletionContext.moveCursorUpByLine();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 11:
                                            selectionMovementDeletionContext.moveCursorDownByLine();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 12:
                                            selectionMovementDeletionContext.moveCursorUpByPage();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 13:
                                            selectionMovementDeletionContext.moveCursorDownByPage();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 14:
                                            selectionMovementDeletionContext.moveCursorToLineStart();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 15:
                                            selectionMovementDeletionContext.moveCursorToLineEnd();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 16:
                                            selectionMovementDeletionContext.moveCursorToLineLeftSide();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 17:
                                            selectionMovementDeletionContext.moveCursorToLineRightSide();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 18:
                                            selectionMovementDeletionContext.moveCursorToHome();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 19:
                                            selectionMovementDeletionContext.moveCursorToEnd();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 20:
                                            selectionMovementDeletionContext.moveCursorPrevByCodePointOrEmoji().deleteMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 21:
                                            selectionMovementDeletionContext.moveCursorNextByChar().deleteMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 22:
                                            selectionMovementDeletionContext.moveCursorPrevByWord().deleteMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 23:
                                            selectionMovementDeletionContext.moveCursorNextByWord().deleteMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 24:
                                            selectionMovementDeletionContext.moveCursorToLineStart().deleteMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 25:
                                            selectionMovementDeletionContext.moveCursorToLineEnd().deleteMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 26:
                                            if (!singleLine) {
                                                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(textFieldState, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, true, null, !androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2253isFromSoftKeyboardZmokQxo(event), 4, null);
                                                z = true;
                                            } else {
                                                z = onSubmit.invoke().booleanValue();
                                            }
                                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 27:
                                            if (!singleLine) {
                                                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(textFieldState, "\t", true, null, !androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2253isFromSoftKeyboardZmokQxo(event), 4, null);
                                                z = true;
                                            }
                                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 28:
                                            selectionMovementDeletionContext.selectAll();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 29:
                                            selectionMovementDeletionContext.moveCursorLeftByChar().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 30:
                                            selectionMovementDeletionContext.moveCursorRightByChar().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 31:
                                            selectionMovementDeletionContext.moveCursorLeftByWord().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 32:
                                            selectionMovementDeletionContext.moveCursorRightByWord().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 33:
                                            selectionMovementDeletionContext.moveCursorPrevByParagraph().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 34:
                                            selectionMovementDeletionContext.moveCursorNextByParagraph().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 35:
                                            selectionMovementDeletionContext.moveCursorToLineStart().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 36:
                                            selectionMovementDeletionContext.moveCursorToLineEnd().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 37:
                                            selectionMovementDeletionContext.moveCursorToLineLeftSide().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 38:
                                            selectionMovementDeletionContext.moveCursorToLineRightSide().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 39:
                                            selectionMovementDeletionContext.moveCursorUpByLine().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 40:
                                            selectionMovementDeletionContext.moveCursorDownByLine().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 41:
                                            selectionMovementDeletionContext.moveCursorUpByPage().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 42:
                                            selectionMovementDeletionContext.moveCursorDownByPage().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 43:
                                            selectionMovementDeletionContext.moveCursorToHome().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 44:
                                            selectionMovementDeletionContext.moveCursorToEnd().selectMovement();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 45:
                                            selectionMovementDeletionContext.deselect();
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 46:
                                            textFieldState.undo();
                                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 47:
                                            textFieldState.redo();
                                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 48:
                                            androidx.compose.foundation.text.KeyEventHelpers_androidKt.showCharacterPalette();
                                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                            z = true;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        case 49:
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                                keyboardController.show();
                                                z = true;
                                            }
                                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                            if (androidx.compose.foundation.ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                                            }
                                            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(selectionMovementDeletionContext.getSelection(), selectionMovementDeletionContext.getInitialValue().getSelection())) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                            break;
                                        default:
                                            throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                }
                            }
                        }
                        rect = null;
                        if (rect != null) {
                        }
                    }
                }
                f = Float.NaN;
                androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext selectionMovementDeletionContext2 = new androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext(textFieldState, layoutResult, androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.m2253isFromSoftKeyboardZmokQxo(event), f, this.Camera2StreamConfigurationMap);
                switch (androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.WhenMappings.$EnumSwitchMapping$0[mo2054mapZmokQxo.ordinal()]) {
                }
            }
        }
        if (z) {
            androidx.collection.MutableLongSet mutableLongSet3 = this.getHighSpeedVideoFpsRangesFor;
            if (mutableLongSet3 == null) {
                mutableLongSet3 = new androidx.collection.MutableLongSet(3);
                this.getHighSpeedVideoFpsRangesFor = mutableLongSet3;
            }
            mutableLongSet3.plusAssign(m7089getKeyZmokQxo);
        }
        return z;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cL2zOB6bDyBxmVpH7EzkneDMfC4(androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext selectionMovementDeletionContext) {
        selectionMovementDeletionContext.moveCursorRightByChar();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ev-VnmB1Pdz9qgtwvfTEY9l9cN4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2251$r8$lambda$evVnmB1Pdz9qgtwvfTEY9l9cN4(androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext selectionMovementDeletionContext) {
        selectionMovementDeletionContext.moveCursorLeftByChar();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.KeyCommand.values().length];
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.COPY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.PASTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.CUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.UP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DOWN.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.LINE_START.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.LINE_END.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.HOME.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.END.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.TAB.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.DESELECT.ordinal()] = 45;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.UNDO.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.REDO.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr[androidx.compose.foundation.text.KeyCommand.CENTER.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
