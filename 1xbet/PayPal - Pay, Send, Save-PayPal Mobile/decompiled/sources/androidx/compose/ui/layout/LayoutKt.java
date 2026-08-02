package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\n\u001a \u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\u000b\u001a>\u0010\u0000\u001a\u00020\u00012\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00050\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00050\rH\u0001¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u0019\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0018\u001a7\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "contents", "", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/ExtensionFunctionType;", "modifierMaterializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "materializerOfWithCompositionLocalInjection", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "LargeDimension", "", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    public static final void Layout(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        function2.invoke(composer, java.lang.Integer.valueOf(((((i << 6) & 896) | 6) >> 6) & 14));
        composer.endNode();
    }

    public static final void Layout(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, modifier);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        composer.endNode();
    }

    public static final void Layout(java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(multiContentMeasurePolicy)) || (i & 384) == 256;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        combineAsVirtualLayouts.invoke(composer, 0);
        composer.endNode();
    }

    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts(final java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> list) {
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1271844412, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                getHighSpeedVideoSizes(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, int i) {
                if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1271844412, i, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
                }
                java.util.List<kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = list2.get(i2);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> virtualConstructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getVirtualConstructor();
                    if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(virtualConstructor);
                    } else {
                        composer.useNode();
                    }
                    androidx.compose.runtime.Updater.m5303initimpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer), java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    function2.invoke(composer, 0);
                    composer.endNode();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }

    public static final kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf(final androidx.compose.ui.Modifier modifier) {
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-511438721, true, new kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode> skippableUpdater, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                getHighSpeedVideoFpsRanges(skippableUpdater.getGetHighSpeedVideoFpsRangesFor(), composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, androidx.compose.runtime.Composer composer2, int i) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-511438721, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:200)");
                }
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, androidx.compose.ui.Modifier.this);
                composer.startReplaceableGroup(509942095);
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                composer.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            {
                super(3);
            }
        });
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    public static final kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf(final androidx.compose.ui.Modifier modifier) {
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2123382363, true, new kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode> skippableUpdater, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                getHighSpeedVideoSizes(skippableUpdater.getGetHighSpeedVideoFpsRangesFor(), composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, androidx.compose.runtime.Composer composer2, int i) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2123382363, i, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:222)");
                }
                int hashCode = java.lang.Integer.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0));
                androidx.compose.ui.Modifier materializeWithCompositionLocalInjectionInternal = androidx.compose.ui.ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, androidx.compose.ui.Modifier.this);
                composer.startReplaceableGroup(509942095);
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeWithCompositionLocalInjectionInternal, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                composer.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            {
                super(3);
            }
        });
    }

    @kotlin.Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1663319424);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1663319424, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:241)");
            }
            int hashCode = java.lang.Integer.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode> constructor$ui = androidx.compose.ui.node.LayoutNode.INSTANCE.getConstructor$ui();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5304initimpl(m5299constructorimpl, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui(true);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                    Camera2StreamConfigurationMap(layoutNode);
                    return kotlin.Unit.INSTANCE;
                }
            });
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf(((((i3 << 3) & 896) | 6) >> 6) & 14));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
                private void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer2) {
                    androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout(androidx.compose.ui.Modifier.this, function2, measurePolicy, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    getHighSpeedVideoFpsRangesFor(composer2);
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
}
