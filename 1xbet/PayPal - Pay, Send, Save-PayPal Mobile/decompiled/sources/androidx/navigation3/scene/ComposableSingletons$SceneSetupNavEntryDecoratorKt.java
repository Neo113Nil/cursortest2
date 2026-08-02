package androidx.navigation3.scene;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$SceneSetupNavEntryDecoratorKt {
    public static final androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt INSTANCE = new androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt();
    private static kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-51699941, false, new kotlin.jvm.functions.Function3() { // from class: androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt.$r8$lambda$_CBb64s5KtgNeZ0uIJMJy_afb_w((kotlin.jvm.functions.Function2) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$_CBb64s5KtgNeZ0uIJMJy_afb_w(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(function2) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-51699941, i, -1, "androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt.lambda$-51699941.<anonymous> (SceneSetupNavEntryDecorator.kt:74)");
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

    /* renamed from: getLambda$-51699941$navigation3_ui, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m9231getLambda$51699941$navigation3_ui() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
