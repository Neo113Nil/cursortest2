package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0017\u001a<\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010$\"\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010%\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0018\u0010,\u001a\u00020\u0007*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cacheFor", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/MeasurePolicy;", "propagate", "Cache1", "Cache2", "maybeCachedBoxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultBoxMeasurePolicy", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "boxChildDataNode", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "getBoxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "matchesParentSize", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxKt {
    private static final androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.ui.layout.MeasurePolicy> getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(true);
    private static final androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.ui.layout.MeasurePolicy> getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor(false);
    private static final androidx.compose.ui.layout.MeasurePolicy getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
    private static final androidx.compose.ui.layout.MeasurePolicy getHighSpeedVideoFpsRanges = androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1.getHighSpeedVideoSizes;

    public static final void Box(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = maybeCachedBoxMeasurePolicy(alignment, z);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, modifier);
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
        function3.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, composer, java.lang.Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endNode();
    }

    private static final androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.ui.layout.MeasurePolicy> getHighSpeedVideoFpsRangesFor(boolean z) {
        androidx.collection.MutableScatterMap<androidx.compose.ui.Alignment, androidx.compose.ui.layout.MeasurePolicy> mutableScatterMap = new androidx.collection.MutableScatterMap<>(9);
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getTopEnd(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopEnd(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getCenter(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getCenterEnd(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterEnd(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getBottomStart(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomStart(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), z));
        mutableScatterMap.set(androidx.compose.ui.Alignment.INSTANCE.getBottomEnd(), new androidx.compose.foundation.layout.BoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomEnd(), z));
        return mutableScatterMap;
    }

    public static final androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment alignment, boolean z) {
        androidx.compose.ui.layout.MeasurePolicy measurePolicy = (z ? getHighResolutionOutputSizeshNQ4ISI : getHighSpeedVideoSizes).get(alignment);
        return measurePolicy == null ? new androidx.compose.foundation.layout.BoxMeasurePolicy(alignment, z) : measurePolicy;
    }

    public static final androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy(androidx.compose.ui.Alignment alignment, boolean z, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.compose.ui.Alignment.INSTANCE.getTopStart()) && !z) {
            composer.startReplaceGroup(244332343);
            composer.endReplaceGroup();
            boxMeasurePolicy = getHighSpeedVideoFpsRangesFor;
        } else {
            composer.startReplaceGroup(244380021);
            boolean z2 = true;
            boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(alignment)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !composer.changed(z)) && (i & 48) != 32) {
                z2 = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.layout.BoxMeasurePolicy(alignment, z);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            boxMeasurePolicy = (androidx.compose.foundation.layout.BoxMeasurePolicy) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return boxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.LayoutDirection layoutDirection, int i, int i2, androidx.compose.ui.Alignment alignment) {
        androidx.compose.ui.Alignment camera2StreamConfigurationMap;
        androidx.compose.foundation.layout.BoxChildDataNode highSpeedVideoSizes = getHighSpeedVideoSizes(measurable);
        androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope, placeable, ((highSpeedVideoSizes == null || (camera2StreamConfigurationMap = highSpeedVideoSizes.getCamera2StreamConfigurationMap()) == null) ? alignment : camera2StreamConfigurationMap).mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.m8767constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)), androidx.compose.ui.unit.IntSize.m8767constructorimpl((i << 32) | (i2 & 4294967295L)), layoutDirection), 0.0f, 2, null);
    }

    public static final void Box(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = getHighSpeedVideoFpsRanges;
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.BoxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.BoxKt.Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.this, i, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    public static final androidx.compose.ui.layout.MeasurePolicy getEmptyBoxMeasurePolicy() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final androidx.compose.foundation.layout.BoxChildDataNode getHighSpeedVideoSizes(androidx.compose.ui.layout.Measurable measurable) {
        java.lang.Object parentData = measurable.getParentData();
        if (parentData instanceof androidx.compose.foundation.layout.BoxChildDataNode) {
            return (androidx.compose.foundation.layout.BoxChildDataNode) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.layout.Measurable measurable) {
        androidx.compose.foundation.layout.BoxChildDataNode highSpeedVideoSizes = getHighSpeedVideoSizes(measurable);
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes.getGetHighSpeedVideoSizes();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer) {
        Box(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
