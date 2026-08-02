package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001c8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "reset", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;", "toTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "mBufferState", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text", "()Landroidx/compose/ui/text/input/EditingBuffer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private androidx.compose.ui.text.input.TextFieldValue mBufferState = new androidx.compose.ui.text.input.TextFieldValue(androidx.compose.ui.text.AnnotatedStringKt.emptyAnnotatedString(), androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    private androidx.compose.ui.text.input.EditingBuffer mBuffer = new androidx.compose.ui.text.input.EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection(), (kotlin.jvm.internal.DefaultConstructorMarker) null);

    /* renamed from: getMBufferState$ui_text, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    /* renamed from: getMBuffer$ui_text, reason: from getter */
    public final androidx.compose.ui.text.input.EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    public final void reset(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.TextInputSession textInputSession) {
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(value.getComposition(), this.mBuffer.m8195getCompositionMzsxiRA$ui_text());
        boolean z = true;
        boolean z2 = false;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.mBufferState.getAnnotatedString().getText(), value.getAnnotatedString().getText())) {
            this.mBuffer = new androidx.compose.ui.text.input.EditingBuffer(value.getAnnotatedString(), value.getSelection(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(this.mBufferState.getSelection(), value.getSelection())) {
                z = false;
            } else {
                this.mBuffer.setSelection$ui_text(androidx.compose.ui.text.TextRange.m8037getMinimpl(value.getSelection()), androidx.compose.ui.text.TextRange.m8036getMaximpl(value.getSelection()));
            }
            z2 = z;
            z = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text();
        } else if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(value.getComposition().getGetHighResolutionOutputSizeshNQ4ISI())) {
            this.mBuffer.setComposition$ui_text(androidx.compose.ui.text.TextRange.m8037getMinimpl(value.getComposition().getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8036getMaximpl(value.getComposition().getGetHighResolutionOutputSizeshNQ4ISI()));
        }
        if (z || (!z2 && !areEqual)) {
            this.mBuffer.commitComposition$ui_text();
            value = androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(value, (androidx.compose.ui.text.AnnotatedString) null, 0L, (androidx.compose.ui.text.TextRange) null, 3, (java.lang.Object) null);
        }
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue, value);
        }
    }

    public final androidx.compose.ui.text.input.TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> p0, final androidx.compose.ui.text.input.EditCommand p1) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error while applying EditCommand batch to buffer (length=");
        sb2.append(this.mBuffer.getLength$ui_text());
        sb2.append(", composition=");
        sb2.append(this.mBuffer.m8195getCompositionMzsxiRA$ui_text());
        sb2.append(", selection=");
        sb2.append((java.lang.Object) androidx.compose.ui.text.TextRange.m8042toStringimpl(this.mBuffer.m8196getSelectiond9O1mEE$ui_text()));
        sb2.append("):");
        sb.append(sb2.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        kotlin.collections.CollectionsKt.joinTo(p0, sb, (r14 & 2) != 0 ? ", " : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.input.EditProcessor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence Camera2StreamConfigurationMap;
                androidx.compose.ui.text.input.EditCommand editCommand = androidx.compose.ui.text.input.EditCommand.this;
                androidx.compose.ui.text.input.EditProcessor editProcessor = this;
                Camera2StreamConfigurationMap = androidx.compose.ui.text.input.EditProcessor.Camera2StreamConfigurationMap(editCommand, (androidx.compose.ui.text.input.EditCommand) obj);
                return Camera2StreamConfigurationMap;
            }
        });
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence Camera2StreamConfigurationMap(androidx.compose.ui.text.input.EditCommand editCommand, androidx.compose.ui.text.input.EditCommand editCommand2) {
        java.lang.String str = editCommand == editCommand2 ? " > " : "   ";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(getHighSpeedVideoSizes(editCommand2));
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoSizes(androidx.compose.ui.text.input.EditCommand editCommand) {
        if (editCommand instanceof androidx.compose.ui.text.input.CommitTextCommand) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CommitTextCommand(text.length=");
            androidx.compose.ui.text.input.CommitTextCommand commitTextCommand = (androidx.compose.ui.text.input.CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.SetComposingTextCommand) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SetComposingTextCommand(text.length=");
            androidx.compose.ui.text.input.SetComposingTextCommand setComposingTextCommand = (androidx.compose.ui.text.input.SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.SetComposingRegionCommand) {
            return ((androidx.compose.ui.text.input.SetComposingRegionCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.DeleteSurroundingTextCommand) {
            return ((androidx.compose.ui.text.input.DeleteSurroundingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand) {
            return ((androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.SetSelectionCommand) {
            return ((androidx.compose.ui.text.input.SetSelectionCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.FinishComposingTextCommand) {
            return ((androidx.compose.ui.text.input.FinishComposingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.BackspaceCommand) {
            return ((androidx.compose.ui.text.input.BackspaceCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.MoveCursorCommand) {
            return ((androidx.compose.ui.text.input.MoveCursorCommand) editCommand).toString();
        }
        if (editCommand instanceof androidx.compose.ui.text.input.DeleteAllCommand) {
            return ((androidx.compose.ui.text.input.DeleteAllCommand) editCommand).toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown EditCommand: ");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "{anonymous EditCommand}";
        }
        sb3.append(simpleName);
        return sb3.toString();
    }

    public final androidx.compose.ui.text.input.TextFieldValue apply(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> editCommands) {
        androidx.compose.ui.text.input.EditCommand editCommand;
        androidx.compose.ui.text.input.EditCommand editCommand2 = null;
        try {
            int size = editCommands.size();
            int i = 0;
            androidx.compose.ui.text.input.EditCommand editCommand3 = null;
            while (i < size) {
                try {
                    editCommand = editCommands.get(i);
                } catch (java.lang.Exception e) {
                    e = e;
                    editCommand2 = editCommand3;
                }
                try {
                    editCommand.applyTo(this.mBuffer);
                    i++;
                    editCommand3 = editCommand;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    editCommand2 = editCommand;
                    throw new java.lang.RuntimeException(getHighSpeedVideoFpsRangesFor(editCommands, editCommand2), e);
                }
            }
            androidx.compose.ui.text.AnnotatedString annotatedString$ui_text = this.mBuffer.toAnnotatedString$ui_text();
            long m8196getSelectiond9O1mEE$ui_text = this.mBuffer.m8196getSelectiond9O1mEE$ui_text();
            androidx.compose.ui.text.TextRange m8027boximpl = androidx.compose.ui.text.TextRange.m8027boximpl(m8196getSelectiond9O1mEE$ui_text);
            m8027boximpl.getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.ui.text.TextRange textRange = androidx.compose.ui.text.TextRange.m8038getReversedimpl(this.mBufferState.getSelection()) ? null : m8027boximpl;
            androidx.compose.ui.text.input.TextFieldValue textFieldValue = new androidx.compose.ui.text.input.TextFieldValue(annotatedString$ui_text, textRange != null ? textRange.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8036getMaximpl(m8196getSelectiond9O1mEE$ui_text), androidx.compose.ui.text.TextRange.m8037getMinimpl(m8196getSelectiond9O1mEE$ui_text)), this.mBuffer.m8195getCompositionMzsxiRA$ui_text(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }
}
