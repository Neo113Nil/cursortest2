package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt INSTANCE = new androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt();
    private static kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(559628295, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.getHighSpeedVideoFpsRangesFor((kotlin.jvm.functions.Function2) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            return highSpeedVideoFpsRangesFor;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(function2) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(559628295, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:210)");
            }
            function2.invoke(composer, java.lang.Integer.valueOf(i & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$559628295$foundation() {
        return getHighSpeedVideoSizes;
    }
}
