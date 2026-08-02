package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\t\u001a1\u0010\n\u001a\u00020\u00012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u001a\u001a\u00020\u0013*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0018\u0010\u001a\u001a\u00020\u0013*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d\"&\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u001f0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"SharedTransitionLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SharedTransitionScope", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "DefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/geometry/Rect;", "ParentClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "VisualDebugging", "", "ScaleToBoundsCached", "Landroidx/compose/animation/ScaleToBoundsImpl;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "shouldCache", "getShouldCache", "(Landroidx/compose/ui/Alignment;)Z", "(Landroidx/compose/ui/layout/ContentScale;)Z", "cachedScaleToBoundsImplMap", "Landroidx/collection/MutableScatterMap;", "animation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedTransitionScopeKt {
    public static final boolean VisualDebugging = false;
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE), 1, null);
    private static final androidx.compose.animation.SharedTransitionScope.OverlayClip getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.animation.SharedTransitionScope.OverlayClip() { // from class: androidx.compose.animation.SharedTransitionScopeKt$ParentClip$1
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public final androidx.compose.ui.graphics.Path getClipPath(androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, androidx.compose.ui.geometry.Rect bounds, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
            androidx.compose.animation.SharedTransitionScope.SharedContentState parentSharedContentState = sharedContentState.getParentSharedContentState();
            if (parentSharedContentState != null) {
                return parentSharedContentState.getClipPathInOverlay();
            }
            return null;
        }
    };
    private static final androidx.collection.MutableScatterMap<androidx.compose.ui.layout.ContentScale, androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.animation.ScaleToBoundsImpl>> getHighSpeedVideoSizes = new androidx.collection.MutableScatterMap<>(0, 1, null);

    public static final void SharedTransitionLayout(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.SharedTransitionScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(646379026);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(646379026, i3, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:120)");
            }
            SharedTransitionScope(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1948801580, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.SharedTransitionScope, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    getHighSpeedVideoSizes(sharedTransitionScope, modifier2, composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer2, int i5) {
                    int i6;
                    if ((i5 & 6) == 0) {
                        i6 = (composer2.changed(sharedTransitionScope) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i6 |= composer2.changed(modifier2) ? 32 : 16;
                    }
                    if (!composer2.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1948801580, i6, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:124)");
                    }
                    androidx.compose.ui.Modifier then = androidx.compose.ui.Modifier.this.then(modifier2);
                    kotlin.jvm.functions.Function3<androidx.compose.animation.SharedTransitionScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, then);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    function32.invoke(sharedTransitionScope, composer2, java.lang.Integer.valueOf(i6 & 14));
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionLayout(androidx.compose.ui.Modifier.this, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }

    public static final void SharedTransitionScope(final kotlin.jvm.functions.Function4<? super androidx.compose.animation.SharedTransitionScope, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1908320054);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1908320054, i2, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:142)");
            }
            androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2062852661, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.LookaheadScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    getHighSpeedVideoSizes(lookaheadScope, composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.runtime.Composer composer2, int i3) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2062852661, i3, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:144)");
                    }
                    java.lang.Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                    java.lang.Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new androidx.compose.animation.SharedTransitionScopeImpl(lookaheadScope, coroutineScope);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl = (androidx.compose.animation.SharedTransitionScopeImpl) rememberedValue2;
                    function4.invoke(sharedTransitionScopeImpl, new androidx.compose.animation.SharedTransitionScopeRootModifierElement(sharedTransitionScopeImpl), composer2, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.animation.SharedTransitionScopeKt.SharedTransitionScope(function4, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }

    public static final /* synthetic */ androidx.compose.animation.ScaleToBoundsImpl access$ScaleToBoundsCached(androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Alignment alignment) {
        if ((contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getFillWidth() || contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getFillHeight() || contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds() || contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getFit() || contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop() || contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getNone() || contentScale == androidx.compose.ui.layout.ContentScale.INSTANCE.getInside()) && (alignment == androidx.compose.ui.Alignment.INSTANCE.getTopStart() || alignment == androidx.compose.ui.Alignment.INSTANCE.getTopCenter() || alignment == androidx.compose.ui.Alignment.INSTANCE.getTopEnd() || alignment == androidx.compose.ui.Alignment.INSTANCE.getCenterStart() || alignment == androidx.compose.ui.Alignment.INSTANCE.getCenter() || alignment == androidx.compose.ui.Alignment.INSTANCE.getCenterEnd() || alignment == androidx.compose.ui.Alignment.INSTANCE.getBottomStart() || alignment == androidx.compose.ui.Alignment.INSTANCE.getBottomCenter() || alignment == androidx.compose.ui.Alignment.INSTANCE.getBottomEnd())) {
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.ContentScale, androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.animation.ScaleToBoundsImpl>> mutableScatterMap = getHighSpeedVideoSizes;
            androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.animation.ScaleToBoundsImpl> mutableScatterMap2 = mutableScatterMap.get(contentScale);
            if (mutableScatterMap2 == null) {
                mutableScatterMap2 = new androidx.collection.MutableScatterMap<>(0, 1, null);
                mutableScatterMap.set(contentScale, mutableScatterMap2);
            }
            androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.animation.ScaleToBoundsImpl> mutableScatterMap3 = mutableScatterMap2;
            androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl = mutableScatterMap3.get(alignment);
            if (scaleToBoundsImpl == null) {
                scaleToBoundsImpl = new androidx.compose.animation.ScaleToBoundsImpl(contentScale, alignment);
                mutableScatterMap3.set(alignment, scaleToBoundsImpl);
            }
            return scaleToBoundsImpl;
        }
        return new androidx.compose.animation.ScaleToBoundsImpl(contentScale, alignment);
    }
}
