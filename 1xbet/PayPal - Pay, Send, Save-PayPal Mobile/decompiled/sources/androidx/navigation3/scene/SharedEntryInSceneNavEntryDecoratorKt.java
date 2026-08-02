package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"", "T", "Landroidx/compose/animation/SharedTransitionScope;", "sharedTransitionScope", "Landroidx/navigation3/scene/SharedEntryInSceneNavEntryDecorator;", "rememberSharedEntryInSceneNavEntryDecorator", "(Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/runtime/Composer;I)Landroidx/navigation3/scene/SharedEntryInSceneNavEntryDecorator;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/navigation3/scene/Scene;", "LocalCurrentScene", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalCurrentScene", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharedEntryInSceneNavEntryDecoratorKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.navigation3.scene.Scene<?>> LocalCurrentScene = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.scene.SharedEntryInSceneNavEntryDecoratorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.navigation3.scene.SharedEntryInSceneNavEntryDecoratorKt.$r8$lambda$ioNdA5RZTgBfZdMggwTpu6ts0TE();
        }
    }, 1, null);

    public static /* synthetic */ androidx.navigation3.scene.Scene $r8$lambda$ioNdA5RZTgBfZdMggwTpu6ts0TE() {
        return null;
    }

    public static final <T> androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator<T> rememberSharedEntryInSceneNavEntryDecorator(androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1818575683, i, -1, "androidx.navigation3.scene.rememberSharedEntryInSceneNavEntryDecorator (SharedEntryInSceneNavEntryDecorator.kt:33)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(sharedTransitionScope)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator(sharedTransitionScope);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator<T> sharedEntryInSceneNavEntryDecorator = (androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return sharedEntryInSceneNavEntryDecorator;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.navigation3.scene.Scene<?>> getLocalCurrentScene() {
        return LocalCurrentScene;
    }
}
