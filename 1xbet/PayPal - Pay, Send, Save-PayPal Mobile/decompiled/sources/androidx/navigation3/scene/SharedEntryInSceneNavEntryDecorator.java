package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/navigation3/scene/SharedEntryInSceneNavEntryDecorator;", "", "T", "Landroidx/navigation3/runtime/NavEntryDecorator;", "Landroidx/compose/animation/SharedTransitionScope;", "sharedTransitionScope", "<init>", "(Landroidx/compose/animation/SharedTransitionScope;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharedEntryInSceneNavEntryDecorator<T> extends androidx.navigation3.runtime.NavEntryDecorator<T> {
    public static final int $stable = 0;

    public SharedEntryInSceneNavEntryDecorator(final androidx.compose.animation.SharedTransitionScope sharedTransitionScope) {
        super(null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2108709411, true, new kotlin.jvm.functions.Function3() { // from class: androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator.$r8$lambda$FWJk_tpJxlTSWWs2PQezBVR9Kn8(androidx.compose.animation.SharedTransitionScope.this, (androidx.navigation3.runtime.NavEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FWJk_tpJxlTSWWs2PQezBVR9Kn8(androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(navEntry) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2108709411, i2, -1, "androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator.<init>.<anonymous> (SharedEntryInSceneNavEntryDecorator.kt:47)");
            }
            androidx.navigation3.scene.Scene scene = (androidx.navigation3.scene.Scene) composer.consume(androidx.navigation3.scene.SharedEntryInSceneNavEntryDecoratorKt.getLocalCurrentScene());
            if (scene == null || (scene instanceof androidx.navigation3.scene.OverlayScene)) {
                composer.startReplaceGroup(-1924000656);
                navEntry.Content(composer, i2 & 14);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1924421295);
                androidx.compose.ui.Modifier sharedElement$default = androidx.compose.animation.SharedTransitionScope.sharedElement$default(sharedTransitionScope, androidx.compose.ui.Modifier.INSTANCE, sharedTransitionScope.rememberSharedContentState(navEntry.getContentKey(), composer, 0), (androidx.compose.animation.AnimatedVisibilityScope) composer.consume(androidx.navigation3.ui.LocalNavAnimatedContentScopeKt.getLocalNavAnimatedContentScope()), null, null, false, 0.0f, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, sharedElement$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                navEntry.Content(composer, i2 & 14);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
