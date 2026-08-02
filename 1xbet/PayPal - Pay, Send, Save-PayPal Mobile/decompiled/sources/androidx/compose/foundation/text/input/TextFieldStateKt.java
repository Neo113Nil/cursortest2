package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001aA\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u00110\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0002\b\u0015\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0001¨\u0006\u0018"}, d2 = {"rememberTextFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "initialText", "", "initialSelection", "Landroidx/compose/ui/text/TextRange;", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;", "setTextAndPlaceCursorAtEnd", "", "text", "setTextAndSelectAll", "clearText", "finalizeComposingAnnotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composition", "annotationList", "Landroidx/compose/runtime/collection/MutableVector;", "finalizeComposingAnnotations-itr0ztk", "toTextFieldBuffer", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldStateKt {
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final androidx.compose.foundation.text.input.TextFieldState m2185rememberTextFieldStateLepunE(final java.lang.String str, final long j, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            j = androidx.compose.ui.text.TextRangeKt.TextRange(str.length());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1125389485, i, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:660)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.foundation.text.input.TextFieldState.Saver saver = androidx.compose.foundation.text.input.TextFieldState.Saver.INSTANCE;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(j)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.TextFieldStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.TextFieldStateKt.$r8$lambda$VwpNrlwIb0RHFBtR_sNeGlnCzfI(str, j);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.text.input.TextFieldState textFieldState = (androidx.compose.foundation.text.input.TextFieldState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return textFieldState;
    }

    public static final androidx.compose.foundation.text.input.TextFieldBuffer toTextFieldBuffer(androidx.compose.foundation.text.input.TextFieldState textFieldState) {
        androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer = new androidx.compose.foundation.text.input.TextFieldBuffer(textFieldState.getValue$foundation(), null, null, null, 14, null);
        textFieldBuffer.setCanCallAddStyle$foundation(true);
        return textFieldBuffer;
    }

    public static final void setTextAndPlaceCursorAtEnd(androidx.compose.foundation.text.input.TextFieldState textFieldState, java.lang.String str) {
        androidx.compose.foundation.text.input.TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.getLength(), str);
            androidx.compose.foundation.text.input.TextFieldBufferKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(androidx.compose.foundation.text.input.TextFieldState textFieldState, java.lang.String str) {
        androidx.compose.foundation.text.input.TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.getLength(), str);
            androidx.compose.foundation.text.input.TextFieldBufferKt.selectAll(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void clearText(androidx.compose.foundation.text.input.TextFieldState textFieldState) {
        androidx.compose.foundation.text.input.TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            androidx.compose.foundation.text.input.TextFieldBufferKt.delete(startEdit, 0, startEdit.getLength());
            androidx.compose.foundation.text.input.TextFieldBufferKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static /* synthetic */ androidx.compose.foundation.text.input.TextFieldState $r8$lambda$VwpNrlwIb0RHFBtR_sNeGlnCzfI(java.lang.String str, long j) {
        return new androidx.compose.foundation.text.input.TextFieldState(str, j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: access$finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    public static final /* synthetic */ java.util.List m2184access$finalizeComposingAnnotationsitr0ztk(androidx.compose.ui.text.TextRange textRange, androidx.compose.runtime.collection.MutableVector mutableVector) {
        if (mutableVector != null && mutableVector.getSize() != 0) {
            return kotlin.collections.CollectionsKt.toList(mutableVector.asMutableList());
        }
        if (textRange != null && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI())) {
            return kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.text.AnnotatedString.Range(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null), androidx.compose.ui.text.TextRange.m8037getMinimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8036getMaximpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI())));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
