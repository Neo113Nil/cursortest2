package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0012\u001aC\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001a\u001a\b\u0010\u001b\u001a\u00020\tH\u0007\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0004\b!\u0010\"\u001a;\u0010#\u001a\u00020\u0001*\u00020$2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0010\u0010.\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020&H\u0002\u001aC\u0010/\u001a\u00020\u0001*\u00020$2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u00104\"\u000e\u00105\u001a\u00020&X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00106\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u00107\"\u0010\u00108\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u00107\"\u0016\u00109\u001a\u00020\u0016X\u0080\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b:\u0010;\"\u0016\u0010<\u001a\u00020\u0016X\u0080\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b=\u0010;\"\u0010\u0010>\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u00107\"\u0010\u0010?\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u00107\"\u000e\u0010@\u001a\u00020&X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020&X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020&X\u0082T¢\u0006\u0002\n\u0000¨\u0006C²\u0006\n\u0010D\u001a\u00020&X\u008a\u0084\u0002"}, d2 = {"PullToRefreshBox", "", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "pullToRefresh", "enabled", "threshold", "Landroidx/compose/ui/unit/Dp;", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "PullToRefreshState", "CircularArrowProgressIndicator", "progress", "Landroidx/compose/material3/internal/FloatProducer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Landroidx/compose/material3/internal/FloatProducer;JLandroidx/compose/runtime/Composer;I)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "alpha", "", "values", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "arcBounds", "Landroidx/compose/ui/geometry/Rect;", "strokeWidth", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "ArrowValues", "drawArrow", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "MaxProgressArc", "StrokeWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ArcRadius", "SpinnerSize", "getSpinnerSize", "()F", "SpinnerContainerSize", "getSpinnerContainerSize", "ArrowWidth", "ArrowHeight", "MinAlpha", "MaxAlpha", "DragMultiplier", "material3", "targetAlpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullToRefreshKt {
    private static final float getOutputFormats = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.5f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(5.5f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PullToRefreshBox(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState2;
        int i4;
        int i5;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        final androidx.compose.ui.Alignment alignment2;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState3;
        int i6;
        androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState4;
        androidx.compose.ui.Alignment alignment3;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        androidx.compose.ui.Modifier modifier3;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-532332839);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pullToRefreshState2 = pullToRefreshState;
                    if (startRestartGroup.changed(pullToRefreshState2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    pullToRefreshState2 = pullToRefreshState;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                pullToRefreshState2 = pullToRefreshState;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(alignment) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function33 = function3;
                    i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            alignment3 = alignment;
                            i6 = i3;
                            pullToRefreshState4 = pullToRefreshState2;
                            function35 = function33;
                            modifier3 = modifier2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 8) != 0) {
                                pullToRefreshState3 = rememberPullToRefreshState(startRestartGroup, 0);
                                i3 &= -7169;
                            } else {
                                pullToRefreshState3 = pullToRefreshState2;
                            }
                            androidx.compose.ui.Alignment topStart = i4 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment;
                            if (i5 != 0) {
                                function33 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1028036671, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        androidx.compose.foundation.layout.BoxScope boxScope2 = boxScope;
                                        androidx.compose.runtime.Composer composer3 = composer2;
                                        int intValue = num.intValue();
                                        if ((intValue & 6) == 0) {
                                            intValue |= composer3.changed(boxScope2) ? 4 : 2;
                                        }
                                        if (!composer3.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1028036671, intValue, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:126)");
                                            }
                                            androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.INSTANCE.m4392Indicator2poqoh4(androidx.compose.material3.pulltorefresh.PullToRefreshState.this, z, boxScope2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0L, 0L, 0.0f, composer3, 1572864, 56);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }, startRestartGroup, 54);
                            }
                            i6 = i3;
                            pullToRefreshState4 = pullToRefreshState3;
                            alignment3 = topStart;
                            function35 = function33;
                            modifier3 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-532332839, i6, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                        }
                        int i9 = i6;
                        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function35;
                        androidx.compose.ui.Modifier m4403pullToRefreshZ4HSEVQ$default = m4403pullToRefreshZ4HSEVQ$default(modifier3, z, pullToRefreshState4, false, 0.0f, function0, 12, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m4403pullToRefreshZ4HSEVQ$default);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        function32.invoke(boxScopeInstance, startRestartGroup, java.lang.Integer.valueOf(((i9 >> 15) & 112) | 6));
                        function36.invoke(boxScopeInstance, startRestartGroup, java.lang.Integer.valueOf(((i9 >> 12) & 112) | 6));
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function34 = function36;
                        modifier2 = modifier3;
                        pullToRefreshState2 = pullToRefreshState4;
                        alignment2 = alignment3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        alignment2 = alignment;
                        function34 = function33;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material3.pulltorefresh.PullToRefreshKt.m4399$r8$lambda$7_zUVEveehh_0tihWXKGK3cR8(z, function0, modifier2, pullToRefreshState2, alignment2, function34, function32, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function33 = function3;
                if ((i2 & 64) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function33 = function3;
            if ((i2 & 64) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function33 = function3;
        if ((i2 & 64) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m4403pullToRefreshZ4HSEVQ$default(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, boolean z2, float f, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            f = androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.INSTANCE.m4397getPositionalThresholdD9Ej5fM();
        }
        return m4402pullToRefreshZ4HSEVQ(modifier, z, pullToRefreshState, z3, f, function0);
    }

    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m4402pullToRefreshZ4HSEVQ(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, boolean z2, float f, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return modifier.then(new androidx.compose.material3.pulltorefresh.PullToRefreshElement(z, function0, z2, pullToRefreshState, f, null));
    }

    public static final androidx.compose.material3.pulltorefresh.PullToRefreshState rememberPullToRefreshState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(318623070, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:585)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl, java.lang.Float> saver = androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.INSTANCE.getSaver();
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.pulltorefresh.PullToRefreshKt.m4400$r8$lambda$HBrvQuodRDSK9DQE717chQu07s();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl pullToRefreshStateImpl = (androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pullToRefreshStateImpl;
    }

    public static final androidx.compose.material3.pulltorefresh.PullToRefreshState PullToRefreshState() {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(final androidx.compose.material3.internal.FloatProducer floatProducer, final long j, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1353562852);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1353562852, i2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:631)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            java.lang.Object obj = rememberedValue;
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                Path.mo5887setFillTypeoQ8Xj4U(androidx.compose.ui.graphics.PathFillType.INSTANCE.m6274getEvenOddRgk1Os());
                startRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final androidx.compose.ui.graphics.Path path = (androidx.compose.ui.graphics.Path) obj;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Float.valueOf(androidx.compose.material3.pulltorefresh.PullToRefreshKt.$r8$lambda$b84_2akonsXLcDYngQ0j1xfhdSQ(androidx.compose.material3.internal.FloatProducer.this));
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(((java.lang.Number) ((androidx.compose.runtime.State) rememberedValue2).getValue()).floatValue(), androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(floatProducer));
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.compose.material3.pulltorefresh.PullToRefreshKt.$r8$lambda$f8Z4ONJYixZktSkmxwmDBizPmfE(androidx.compose.material3.internal.FloatProducer.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion, (kotlin.jvm.functions.Function1) rememberedValue3), getHighSpeedVideoSizes);
            boolean z2 = i4 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(floatProducer));
            boolean changed = startRestartGroup.changed(animateFloatAsState);
            boolean z3 = (i2 & 112) == 32;
            boolean changedInstance = startRestartGroup.changedInstance(path);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance || (changed | z2 | z3)) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                composer2 = startRestartGroup;
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.material3.pulltorefresh.PullToRefreshKt.getHighSpeedVideoSizes(androidx.compose.material3.internal.FloatProducer.this, animateFloatAsState, j, path, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                        return highSpeedVideoSizes;
                    }
                };
                composer2.updateRememberedValue(function1);
                rememberedValue4 = function1;
            } else {
                i3 = 0;
                composer2 = startRestartGroup;
            }
            androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue4, composer2, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material3.pulltorefresh.PullToRefreshKt.$r8$lambda$cSgtYNP6GuOzKMtqbZ97zO77flQ(androidx.compose.material3.internal.FloatProducer.this, j, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material3.internal.FloatProducer floatProducer, androidx.compose.runtime.State state, long j, androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        long j2;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext;
        float invoke = floatProducer.invoke();
        float max = (java.lang.Math.max(java.lang.Math.min(1.0f, invoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(java.lang.Math.abs(invoke) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (coerceIn - (((float) java.lang.Math.pow(coerceIn, 2.0d)) / 4.0f))) * 0.5f;
        androidx.compose.material3.pulltorefresh.ArrowValues arrowValues = new androidx.compose.material3.pulltorefresh.ArrowValues(pow, pow * 360.0f, ((max * 0.8f) + pow) * 360.0f, java.lang.Math.min(1.0f, max));
        float floatValue = ((java.lang.Number) state.getValue()).floatValue();
        float getHighResolutionOutputSizeshNQ4ISI2 = arrowValues.getGetHighResolutionOutputSizeshNQ4ISI();
        long mo6530getCenterF1C5BW0 = drawScope.mo6530getCenterF1C5BW0();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext2.mo6453getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            drawContext2.getTransform().mo6459rotateUv8p0NA(getHighResolutionOutputSizeshNQ4ISI2, mo6530getCenterF1C5BW0);
            float f = drawScope.mo1418toPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
            float f2 = getOutputFormats;
            androidx.compose.ui.geometry.Rect m5791Rect3MmeM6k = androidx.compose.ui.geometry.RectKt.m5791Rect3MmeM6k(androidx.compose.ui.geometry.SizeKt.m5831getCenteruvyYCjk(drawScope.mo6531getSizeNHjbRc()), f + (drawScope.mo1418toPx0680j_4(f2) / 2.0f));
            try {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j, arrowValues.getCamera2StreamConfigurationMap(), arrowValues.getGetHighSpeedVideoSizes() - arrowValues.getCamera2StreamConfigurationMap(), false, m5791Rect3MmeM6k.m5787getTopLeftF1C5BW0(), m5791Rect3MmeM6k.m5785getSizeNHjbRc(), floatValue, new androidx.compose.ui.graphics.drawscope.Stroke(drawScope.mo1418toPx0680j_4(f2), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw(), 0, null, 26, null), null, 0, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                path.reset();
                path.moveTo(0.0f, 0.0f);
                float f3 = getHighSpeedVideoFpsRanges;
                path.lineTo((drawScope.mo1418toPx0680j_4(f3) * arrowValues.getGetHighSpeedVideoFpsRanges()) / 2.0f, drawScope.mo1418toPx0680j_4(getHighSpeedVideoFpsRangesFor) * arrowValues.getGetHighSpeedVideoFpsRanges());
                path.lineTo(drawScope.mo1418toPx0680j_4(f3) * arrowValues.getGetHighSpeedVideoFpsRanges(), 0.0f);
                float min = java.lang.Math.min(m5791Rect3MmeM6k.getRight() - m5791Rect3MmeM6k.getLeft(), m5791Rect3MmeM6k.getBottom() - m5791Rect3MmeM6k.getTop()) / 2.0f;
                float f4 = (drawScope.mo1418toPx0680j_4(f3) * arrowValues.getGetHighSpeedVideoFpsRanges()) / 2.0f;
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5791Rect3MmeM6k.m5782getCenterF1C5BW0() >> 32));
                float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5791Rect3MmeM6k.m5782getCenterF1C5BW0() & 4294967295L));
                float f5 = drawScope.mo1418toPx0680j_4(f2);
                path.mo5889translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((min + intBitsToFloat) - f4) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2 - f5) & 4294967295L)));
                float getHighSpeedVideoSizes2 = arrowValues.getGetHighSpeedVideoSizes();
                float f6 = drawScope.mo1418toPx0680j_4(f2);
                long mo6530getCenterF1C5BW02 = drawScope.mo6530getCenterF1C5BW0();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = drawScope.getDrawContext();
                long mo6453getSizeNHjbRc2 = drawContext3.mo6453getSizeNHjbRc();
                drawContext3.getCanvas().save();
                try {
                    drawContext3.getTransform().mo6459rotateUv8p0NA(getHighSpeedVideoSizes2 - f6, mo6530getCenterF1C5BW02);
                    androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, path, j, floatValue, new androidx.compose.ui.graphics.drawscope.Stroke(drawScope.mo1418toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
                    drawContext3.getCanvas().restore();
                    drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc2);
                    drawContext2.getCanvas().restore();
                    drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    drawContext = drawContext2;
                    j2 = mo6453getSizeNHjbRc;
                    try {
                        drawContext3.getCanvas().restore();
                        drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc2);
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        drawContext.getCanvas().restore();
                        drawContext.mo6454setSizeuvyYCjk(j2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                drawContext = drawContext2;
                j2 = mo6453getSizeNHjbRc;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            j2 = mo6453getSizeNHjbRc;
            drawContext = drawContext2;
        }
    }

    public static final float getSpinnerSize() {
        return getHighSpeedVideoSizes;
    }

    public static final float getSpinnerContainerSize() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: $r8$lambda$7_z-UVE-veehh_0tihWXKGK3cR8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4399$r8$lambda$7_zUVEveehh_0tihWXKGK3cR8(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PullToRefreshBox(z, function0, modifier, pullToRefreshState, alignment, function3, function32, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HBrvQ-uodRDSK9DQE717chQu07s, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl m4400$r8$lambda$HBrvQuodRDSK9DQE717chQu07s() {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl();
    }

    public static /* synthetic */ float $r8$lambda$b84_2akonsXLcDYngQ0j1xfhdSQ(androidx.compose.material3.internal.FloatProducer floatProducer) {
        return floatProducer.invoke() >= 1.0f ? 1.0f : 0.3f;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cSgtYNP6GuOzKMtqbZ97zO77flQ(androidx.compose.material3.internal.FloatProducer floatProducer, long j, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(floatProducer, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f8Z4ONJYixZktSkmxwmDBizPmfE(androidx.compose.material3.internal.FloatProducer floatProducer, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (floatProducer.invoke() > 0.0f) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ProgressBarRangeInfo(floatProducer.invoke(), kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f), 0));
        }
        return kotlin.Unit.INSTANCE;
    }
}
