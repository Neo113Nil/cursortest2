package androidx.compose.foundation.text2.input;

/* compiled from: TextFieldState.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a&\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0007\u001a6\u0010\r\u001a\u00020\u000e*\u00020\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0087@¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"TextFieldState", "Landroidx/compose/foundation/text2/input/TextFieldState;", "initialValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "rememberTextFieldState", "initialText", "", "initialSelectionInChars", "Landroidx/compose/ui/text/TextRange;", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text2/input/TextFieldState;", "clearText", "", "forEachTextValue", "", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/compose/foundation/text2/input/TextFieldState;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTextAndPlaceCursorAtEnd", "text", "setTextAndSelectAll", "textAsFlow", "Lkotlinx/coroutines/flow/Flow;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldStateKt {
    public static final androidx.compose.foundation.text2.input.TextFieldState TextFieldState(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        return new androidx.compose.foundation.text2.input.TextFieldState(textFieldValue.getText(), textFieldValue.getSelection(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final kotlinx.coroutines.flow.Flow<androidx.compose.foundation.text2.input.TextFieldCharSequence> textAsFlow(final androidx.compose.foundation.text2.input.TextFieldState textFieldState) {
        return androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.TextFieldCharSequence>() { // from class: androidx.compose.foundation.text2.input.TextFieldStateKt$textAsFlow$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.foundation.text2.input.TextFieldCharSequence invoke() {
                return androidx.compose.foundation.text2.input.TextFieldState.this.getText();
            }
        });
    }

    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final androidx.compose.foundation.text2.input.TextFieldState m1105rememberTextFieldStateLepunE(final java.lang.String str, final long j, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-855595317);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberTextFieldState)P(1,0:c#ui.text.TextRange)471@18563L107:TextFieldState.kt#b7kqo7");
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            j = androidx.compose.ui.text.TextRangeKt.TextRange(str.length());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-855595317, i, -1, "androidx.compose.foundation.text2.input.rememberTextFieldState (TextFieldState.kt:471)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.foundation.text2.input.TextFieldState.Saver saver = androidx.compose.foundation.text2.input.TextFieldState.Saver.INSTANCE;
        composer.startReplaceableGroup(650674345);
        boolean changed = composer.changed(str) | composer.changed(j);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.TextFieldState>() { // from class: androidx.compose.foundation.text2.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.text2.input.TextFieldState invoke() {
                    return new androidx.compose.foundation.text2.input.TextFieldState(str, j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = (androidx.compose.foundation.text2.input.TextFieldState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 56, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object forEachTextValue(androidx.compose.foundation.text2.input.TextFieldState textFieldState, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text2.input.TextFieldCharSequence, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1 textFieldStateKt$forEachTextValue$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1) {
            textFieldStateKt$forEachTextValue$1 = (androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1) continuation;
            if ((textFieldStateKt$forEachTextValue$1.label & Integer.MIN_VALUE) != 0) {
                textFieldStateKt$forEachTextValue$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = textFieldStateKt$forEachTextValue$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldStateKt$forEachTextValue$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<androidx.compose.foundation.text2.input.TextFieldCharSequence> textAsFlow = textAsFlow(textFieldState);
                    textFieldStateKt$forEachTextValue$1.label = 1;
                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(textAsFlow, function2, textFieldStateKt$forEachTextValue$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("textAsFlow expected not to complete without exception".toString());
            }
        }
        textFieldStateKt$forEachTextValue$1 = new androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1(continuation);
        java.lang.Object obj2 = textFieldStateKt$forEachTextValue$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldStateKt$forEachTextValue$1.label;
        if (i != 0) {
        }
        throw new java.lang.IllegalStateException("textAsFlow expected not to complete without exception".toString());
    }

    public static final void setTextAndPlaceCursorAtEnd(androidx.compose.foundation.text2.input.TextFieldState textFieldState, java.lang.String str) {
        androidx.compose.foundation.text2.input.TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        startEdit.replace(0, startEdit.getLength(), str);
        androidx.compose.foundation.text2.input.TextFieldBufferKt.placeCursorAtEnd(startEdit);
        textFieldState.commitEdit(startEdit);
    }

    public static final void setTextAndSelectAll(androidx.compose.foundation.text2.input.TextFieldState textFieldState, java.lang.String str) {
        androidx.compose.foundation.text2.input.TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        startEdit.replace(0, startEdit.getLength(), str);
        androidx.compose.foundation.text2.input.TextFieldBufferKt.selectAll(startEdit);
        textFieldState.commitEdit(startEdit);
    }

    public static final void clearText(androidx.compose.foundation.text2.input.TextFieldState textFieldState) {
        androidx.compose.foundation.text2.input.TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        androidx.compose.foundation.text2.input.TextFieldBufferKt.delete(startEdit, 0, startEdit.getLength());
        androidx.compose.foundation.text2.input.TextFieldBufferKt.placeCursorAtEnd(startEdit);
        textFieldState.commitEdit(startEdit);
    }
}
