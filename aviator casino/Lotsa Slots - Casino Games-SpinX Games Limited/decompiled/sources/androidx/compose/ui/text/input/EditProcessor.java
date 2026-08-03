package androidx.compose.ui.text.input;

/* compiled from: EditProcessor.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ \u0010\u0010\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\bJ\f\u0010\u0019\u001a\u00020\u0011*\u00020\u000fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "generateBatchErrorMessage", "", "failedCommand", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "toStringForLog", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private androidx.compose.ui.text.input.TextFieldValue mBufferState = new androidx.compose.ui.text.input.TextFieldValue(androidx.compose.ui.text.AnnotatedStringKt.emptyAnnotatedString(), androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    private androidx.compose.ui.text.input.EditingBuffer mBuffer = new androidx.compose.ui.text.input.EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection(), (kotlin.jvm.internal.DefaultConstructorMarker) null);

    /* renamed from: getMBufferState$ui_text_release, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    /* renamed from: getMBuffer$ui_text_release, reason: from getter */
    public final androidx.compose.ui.text.input.EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    public final void reset(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.TextInputSession textInputSession) {
        boolean z = true;
        boolean z2 = !kotlin.jvm.internal.Intrinsics.areEqual(value.getComposition(), this.mBuffer.m4125getCompositionMzsxiRA$ui_text_release());
        boolean z3 = false;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.mBufferState.getAnnotatedString(), value.getAnnotatedString())) {
            this.mBuffer = new androidx.compose.ui.text.input.EditingBuffer(value.getAnnotatedString(), value.getSelection(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(this.mBufferState.getSelection(), value.getSelection())) {
            z = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(androidx.compose.ui.text.TextRange.m3962getMinimpl(value.getSelection()), androidx.compose.ui.text.TextRange.m3961getMaximpl(value.getSelection()));
            z = false;
            z3 = true;
        }
        if (value.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(value.getComposition().getPackedValue())) {
            this.mBuffer.setComposition$ui_text_release(androidx.compose.ui.text.TextRange.m3962getMinimpl(value.getComposition().getPackedValue()), androidx.compose.ui.text.TextRange.m3961getMaximpl(value.getComposition().getPackedValue()));
        }
        if (z || (!z3 && z2)) {
            this.mBuffer.commitComposition$ui_text_release();
            value = androidx.compose.ui.text.input.TextFieldValue.m4200copy3r_uNRQ$default(value, (androidx.compose.ui.text.AnnotatedString) null, 0L, (androidx.compose.ui.text.TextRange) null, 3, (java.lang.Object) null);
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

    private final java.lang.String generateBatchErrorMessage(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> editCommands, final androidx.compose.ui.text.input.EditCommand failedCommand) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m4125getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((java.lang.Object) androidx.compose.ui.text.TextRange.m3967toStringimpl(this.mBuffer.m4126getSelectiond9O1mEE$ui_text_release())) + "):");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        kotlin.collections.CollectionsKt.joinTo(editCommands, sb, (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.EditCommand, java.lang.CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.CharSequence invoke(androidx.compose.ui.text.input.EditCommand editCommand) {
                java.lang.String stringForLog;
                java.lang.String str = androidx.compose.ui.text.input.EditCommand.this == editCommand ? " > " : "   ";
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                stringForLog = this.toStringForLog(editCommand);
                sb2.append(stringForLog);
                return sb2.toString();
            }
        });
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String toStringForLog(androidx.compose.ui.text.input.EditCommand editCommand) {
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
        if (!(editCommand instanceof androidx.compose.ui.text.input.SetComposingRegionCommand) && !(editCommand instanceof androidx.compose.ui.text.input.DeleteSurroundingTextCommand) && !(editCommand instanceof androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand) && !(editCommand instanceof androidx.compose.ui.text.input.SetSelectionCommand) && !(editCommand instanceof androidx.compose.ui.text.input.FinishComposingTextCommand) && !(editCommand instanceof androidx.compose.ui.text.input.BackspaceCommand) && !(editCommand instanceof androidx.compose.ui.text.input.MoveCursorCommand) && !(editCommand instanceof androidx.compose.ui.text.input.DeleteAllCommand)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown EditCommand: ");
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "{anonymous EditCommand}";
            }
            sb3.append(simpleName);
            return sb3.toString();
        }
        return editCommand.toString();
    }

    public final androidx.compose.ui.text.input.TextFieldValue apply(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> editCommands) {
        androidx.compose.ui.text.input.EditCommand editCommand;
        java.lang.Exception e;
        androidx.compose.ui.text.input.EditCommand editCommand2;
        try {
            int size = editCommands.size();
            int i = 0;
            editCommand = null;
            while (i < size) {
                try {
                    editCommand2 = editCommands.get(i);
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
                try {
                    editCommand2.applyTo(this.mBuffer);
                    i++;
                    editCommand = editCommand2;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    editCommand = editCommand2;
                    throw new java.lang.RuntimeException(generateBatchErrorMessage(editCommands, editCommand), e);
                }
            }
            androidx.compose.ui.text.AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long m4126getSelectiond9O1mEE$ui_text_release = this.mBuffer.m4126getSelectiond9O1mEE$ui_text_release();
            androidx.compose.ui.text.TextRange m3952boximpl = androidx.compose.ui.text.TextRange.m3952boximpl(m4126getSelectiond9O1mEE$ui_text_release);
            m3952boximpl.getPackedValue();
            androidx.compose.ui.text.TextRange textRange = androidx.compose.ui.text.TextRange.m3963getReversedimpl(this.mBufferState.getSelection()) ? null : m3952boximpl;
            androidx.compose.ui.text.input.TextFieldValue textFieldValue = new androidx.compose.ui.text.input.TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.getPackedValue() : androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3961getMaximpl(m4126getSelectiond9O1mEE$ui_text_release), androidx.compose.ui.text.TextRange.m3962getMinimpl(m4126getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m4125getCompositionMzsxiRA$ui_text_release(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (java.lang.Exception e4) {
            editCommand = null;
            e = e4;
        }
    }
}
