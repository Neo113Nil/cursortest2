package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00060\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"", "T", "Landroidx/navigation3/scene/SceneSetupNavEntryDecorator;", "rememberSceneSetupNavEntryDecorator", "(Landroidx/compose/runtime/Composer;I)Landroidx/navigation3/scene/SceneSetupNavEntryDecorator;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalEntriesToExcludeFromCurrentScene", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalEntriesToExcludeFromCurrentScene", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SceneSetupNavEntryDecoratorKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.util.Set<java.lang.Object>> LocalEntriesToExcludeFromCurrentScene = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.scene.SceneSetupNavEntryDecoratorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.navigation3.scene.SceneSetupNavEntryDecoratorKt.m9236$r8$lambda$qcnKHgnHcpMGqRdxhCaJt72lB0();
        }
    }, 1, null);

    public static final <T> androidx.navigation3.scene.SceneSetupNavEntryDecorator<T> rememberSceneSetupNavEntryDecorator(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-881900212, i, -1, "androidx.navigation3.scene.rememberSceneSetupNavEntryDecorator (SceneSetupNavEntryDecorator.kt:30)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.navigation3.scene.SceneSetupNavEntryDecorator(null, 1, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.navigation3.scene.SceneSetupNavEntryDecorator<T> sceneSetupNavEntryDecorator = (androidx.navigation3.scene.SceneSetupNavEntryDecorator) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return sceneSetupNavEntryDecorator;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.util.Set<java.lang.Object>> getLocalEntriesToExcludeFromCurrentScene() {
        return LocalEntriesToExcludeFromCurrentScene;
    }

    /* renamed from: $r8$lambda$qcnKHgnHcpMGqRdxhC-aJt72lB0, reason: not valid java name */
    public static /* synthetic */ java.util.Set m9236$r8$lambda$qcnKHgnHcpMGqRdxhCaJt72lB0() {
        return new java.util.HashSet();
    }
}
