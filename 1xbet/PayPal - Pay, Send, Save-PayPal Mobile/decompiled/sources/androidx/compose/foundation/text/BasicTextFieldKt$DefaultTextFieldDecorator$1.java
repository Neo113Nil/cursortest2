package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BasicTextFieldKt$DefaultTextFieldDecorator$1 implements androidx.compose.foundation.text.input.TextFieldDecorator {
    public static final androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1 getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1();

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2101003086);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2101003086, i2, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:622)");
            }
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf(i2 & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1.this, function2, i, (androidx.compose.runtime.Composer) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1 basicTextFieldKt$DefaultTextFieldDecorator$1, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        basicTextFieldKt$DefaultTextFieldDecorator$1.Decoration(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    BasicTextFieldKt$DefaultTextFieldDecorator$1() {
    }
}
