package androidx.compose.foundation.layout;

@kotlin.Deprecated(message = "FlowLayout overflow is no longer maintained")
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011Bu\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012&\b\u0002\u0010\r\u001a \u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f\u0018\u00010\u0007\u0012&\b\u0002\u0010\u000e\u001a \u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "p0", "", "p1", "p2", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p3", "p4", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowRowOverflow extends androidx.compose.foundation.layout.FlowLayoutOverflow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.FlowRowOverflow.Companion INSTANCE = new androidx.compose.foundation.layout.FlowRowOverflow.Companion(null);
    private static final androidx.compose.foundation.layout.FlowRowOverflow getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.layout.FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Visible, 0, 0, null, null, 30, null);
    private static final androidx.compose.foundation.layout.FlowRowOverflow getHighSpeedVideoFpsRanges = new androidx.compose.foundation.layout.FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Clip, 0, 0, null, null, 30, null);

    private FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType overflowType, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.FlowLayoutOverflowState, ? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> function1, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.FlowLayoutOverflowState, ? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> function12) {
        super(overflowType, i, i2, function1, function12, null);
    }

    /* synthetic */ FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType overflowType, int i, int i2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : function1, (i3 & 16) != 0 ? null : function12);
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u00052\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013J_\u0010\u0014\u001a\u00020\u00052\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;", "", "<init>", "()V", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, "Landroidx/compose/foundation/layout/FlowRowOverflow;", "getVisible$annotations", "getVisible", "()Landroidx/compose/foundation/layout/FlowRowOverflow;", "Clip", "getClip$annotations", "getClip", "expandIndicator", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/layout/FlowRowOverflow;", "expandOrCollapseIndicator", "collapseIndicator", "minRowsToShowCollapse", "", "minHeightToShowCollapse", "Landroidx/compose/ui/unit/Dp;", "expandOrCollapseIndicator--jt2gSs", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.foundation.layout.FlowRowOverflow getVisible() {
            return androidx.compose.foundation.layout.FlowRowOverflow.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.compose.foundation.layout.FlowRowOverflow getClip() {
            return androidx.compose.foundation.layout.FlowRowOverflow.getHighSpeedVideoFpsRanges;
        }

        public final androidx.compose.foundation.layout.FlowRowOverflow expandIndicator(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowOverflowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
            return new androidx.compose.foundation.layout.FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.jvm.functions.Function2 highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.layout.FlowRowOverflow.Companion.getHighSpeedVideoSizes(kotlin.jvm.functions.Function3.this, (androidx.compose.foundation.layout.FlowLayoutOverflowState) obj);
                    return highSpeedVideoSizes;
                }
            }, null, 22, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.jvm.functions.Function2 getHighSpeedVideoSizes(final kotlin.jvm.functions.Function3 function3, final androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
            return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-982932461, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FlowRowOverflow.Companion.Camera2StreamConfigurationMap(androidx.compose.foundation.layout.FlowLayoutOverflowState.this, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return Camera2StreamConfigurationMap;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-982932461, i, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:98)");
                }
                function3.invoke(new androidx.compose.foundation.layout.FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function3 function3, final androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
            return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1742323353, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.layout.FlowRowOverflow.Companion.getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.FlowLayoutOverflowState.this, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRanges;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1742323353, i, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:145)");
                }
                function3.invoke(new androidx.compose.foundation.layout.FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function3 function3, final androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
            return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1862526094, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.layout.FlowRowOverflow.Companion.getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowLayoutOverflowState.this, function3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoSizes;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1862526094, i, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:152)");
                }
                function3.invoke(new androidx.compose.foundation.layout.FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final androidx.compose.foundation.layout.FlowRowOverflow m1667expandOrCollapseIndicatorjt2gSs(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowOverflowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowOverflowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, int i, float f, androidx.compose.runtime.Composer composer, int i2, int i3) {
            boolean z = true;
            int i4 = (i3 & 4) != 0 ? 1 : i;
            float m8601constructorimpl = (i3 & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1512952504, i2, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:134)");
            }
            int mo1412roundToPx0680j_4 = ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1412roundToPx0680j_4(m8601constructorimpl);
            boolean z2 = (((i2 & 896) ^ 384) > 256 && composer.changed(i4)) || (i2 & 384) == 256;
            boolean changed = composer.changed(mo1412roundToPx0680j_4);
            boolean z3 = (((i2 & 14) ^ 6) > 4 && composer.changed(function3)) || (i2 & 6) == 4;
            if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(function32)) && (i2 & 48) != 32) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((z2 | changed | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.layout.FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i4, mo1412roundToPx0680j_4, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.jvm.functions.Function2 highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FlowRowOverflow.Companion.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function3.this, (androidx.compose.foundation.layout.FlowLayoutOverflowState) obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.jvm.functions.Function2 highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.FlowRowOverflow.Companion.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3.this, (androidx.compose.foundation.layout.FlowLayoutOverflowState) obj);
                        return highSpeedVideoFpsRangesFor;
                    }
                }, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.layout.FlowRowOverflow flowRowOverflow = (androidx.compose.foundation.layout.FlowRowOverflow) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return flowRowOverflow;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FlowRowOverflow(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType overflowType, int i, int i2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, i, i2, function1, function12);
    }
}
