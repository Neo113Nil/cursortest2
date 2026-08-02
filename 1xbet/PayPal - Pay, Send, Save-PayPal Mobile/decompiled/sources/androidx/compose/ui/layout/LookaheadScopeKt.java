package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a0\u0010\u0007\u001a\u00020\u00022!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u007f\u0010\u0018\u001a\u00020\t*\u00020\t2\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\u00002$\b\u0002\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u00052-\u0010\u0017\u001a)\u0012\u0004\u0012\u00020\u0013\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010#\u001a\u00020\u001e*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\"\"0\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadScope;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "content", "LookaheadScope", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "", "isMeasurementApproachInProgress", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isPlacementApproachInProgress", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "approachLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "sourceCoordinates", "lookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-Fgt4K4Q", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LookaheadScopeKt {
    private static final kotlin.jvm.functions.Function2<androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.layout.LayoutCoordinates, java.lang.Boolean> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.layout.LayoutCoordinates, java.lang.Boolean>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
            return java.lang.Boolean.FALSE;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LookaheadScope(final kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.LookaheadScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(441837433);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(441837433, i2, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:49)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.layout.LookaheadScopeImpl(null, i3, 0 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.LookaheadScopeImpl lookaheadScopeImpl = (androidx.compose.ui.layout.LookaheadScopeImpl) rememberedValue;
            androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final androidx.compose.ui.node.LayoutNode invoke() {
                        return new androidx.compose.ui.node.LayoutNode(true, 0, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(function0);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5304initimpl(m5299constructorimpl, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode layoutNode) {
                    layoutNode.setVirtualLookaheadRoot$ui(true);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                    getHighSpeedVideoFpsRanges(layoutNode);
                    return kotlin.Unit.INSTANCE;
                }
            });
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, lookaheadScopeImpl, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LookaheadScopeImpl, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.layout.LookaheadScopeImpl lookaheadScopeImpl2) {
                    getHighResolutionOutputSizeshNQ4ISI(layoutNode, lookaheadScopeImpl2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.layout.LookaheadScopeImpl lookaheadScopeImpl2) {
                    lookaheadScopeImpl2.setScopeCoordinates(new kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.ui.layout.LayoutCoordinates invoke() {
                            androidx.compose.ui.node.LayoutNode parent$ui = androidx.compose.ui.node.LayoutNode.this.getParent$ui();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(parent$ui);
                            return parent$ui.getInnerCoordinator$ui().getCoordinates();
                        }

                        {
                            super(0);
                        }
                    });
                }
            });
            function3.invoke(lookaheadScopeImpl, startRestartGroup, java.lang.Integer.valueOf((i2 << 3) & 112));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer2) {
                    androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope(function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    Camera2StreamConfigurationMap(composer2);
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

    public static /* synthetic */ androidx.compose.ui.Modifier approachLayout$default(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = getHighSpeedVideoFpsRangesFor;
        }
        return approachLayout(modifier, function1, function2, function3);
    }

    public static final androidx.compose.ui.Modifier approachLayout(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, java.lang.Boolean> function1, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? super androidx.compose.ui.layout.LayoutCoordinates, java.lang.Boolean> function2, kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.ApproachMeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        return modifier.then(new androidx.compose.ui.layout.ApproachLayoutElement(function3, function1, function2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.layout.LayoutCoordinates lookaheadScopeCoordinates(androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        if (!(layoutCoordinates instanceof androidx.compose.ui.node.LookaheadCapablePlaceable)) {
            throw new java.lang.IllegalArgumentException("Invalid LayoutCoordinates: ".concat(java.lang.String.valueOf(layoutCoordinates)).toString());
        }
        return lookaheadScope.getLookaheadScopeCoordinates(((androidx.compose.ui.node.LookaheadCapablePlaceable) layoutCoordinates).getPlacementScope());
    }

    /* renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m7380localLookaheadPositionOfFgt4K4Q(androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        androidx.compose.ui.layout.LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        androidx.compose.ui.layout.LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        if (lookaheadCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates) {
            return ((androidx.compose.ui.layout.LookaheadLayoutCoordinates) lookaheadCoordinates).mo7363localPositionOfS_NoaFU(lookaheadCoordinates2, j, z);
        }
        if (!(lookaheadCoordinates2 instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates)) {
            return lookaheadCoordinates.mo7363localPositionOfS_NoaFU(lookaheadCoordinates, j, z);
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl(((androidx.compose.ui.layout.LookaheadLayoutCoordinates) lookaheadCoordinates2).mo7363localPositionOfS_NoaFU(lookaheadCoordinates, j, z) ^ (-9223372034707292160L));
    }
}
