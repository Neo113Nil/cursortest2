package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"BoxWithConstraints", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BoxWithConstraints(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, boolean z, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxWithConstraintsScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Alignment alignment2;
        int i4;
        boolean z2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Alignment alignment3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(380139498);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            alignment2 = alignment;
            i3 |= startRestartGroup.changed(alignment2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    alignment3 = alignment2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    alignment3 = i6 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment2;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    final androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(alignment3, z2);
                    boolean z3 = (i3 & 7168) == 2048;
                    boolean changed = startRestartGroup.changed(maybeCachedBoxMeasurePolicy);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                androidx.compose.ui.layout.MeasureResult highSpeedVideoSizes;
                                highSpeedVideoSizes = androidx.compose.foundation.layout.BoxWithConstraintsKt.getHighSpeedVideoSizes(androidx.compose.ui.layout.MeasurePolicy.this, function3, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                                return highSpeedVideoSizes;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(companion, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i3 & 14, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final androidx.compose.ui.Alignment alignment4 = alignment3;
                    final boolean z4 = z2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            ((java.lang.Integer) obj2).intValue();
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.BoxWithConstraintsKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.this, alignment4, z4, function3, i, i2, (androidx.compose.runtime.Composer) obj);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        alignment2 = alignment;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoSizes(androidx.compose.ui.layout.MeasurePolicy measurePolicy, final kotlin.jvm.functions.Function3 function3, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
        final androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl(subcomposeMeasureScope, constraints.getGetHighSpeedVideoFpsRangesFor(), null);
        return measurePolicy.mo1095measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(kotlin.Unit.INSTANCE, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-431986394, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.BoxWithConstraintsKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function3.this, boxWithConstraintsScopeImpl, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        })), constraints.getGetHighSpeedVideoFpsRangesFor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function3 function3, androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-431986394, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:66)");
            }
            function3.invoke(boxWithConstraintsScopeImpl, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer) {
        BoxWithConstraints(modifier, alignment, z, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
