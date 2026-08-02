package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0011\u001aO\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%\u001a;\u0010&\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-\"\u000e\u0010.\u001a\u00020/X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0010\u00103\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0010\u00104\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102¨\u00065"}, d2 = {"Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/CheckboxColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "checkmarkStroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "outlineStroke", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "TriStateCheckbox", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/runtime/Composer;I)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "stroke", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "drawingCache", "Landroidx/compose/material3/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/material3/CheckDrawingCache;)V", "SnapAnimationDelay", "", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "CheckboxSize", "RadiusSize", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxKt {
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        androidx.compose.material3.CheckboxColors checkboxColors2;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final androidx.compose.material3.CheckboxColors checkboxColors3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z5;
        androidx.compose.material3.CheckboxColors checkboxColors4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        kotlin.jvm.functions.Function0 function0;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1406741137);
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
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                checkboxColors2 = androidx.compose.material3.CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                z5 = z3;
                                checkboxColors4 = checkboxColors2;
                                mutableInteractionSource4 = null;
                                androidx.compose.ui.Modifier modifier3 = modifier2;
                                int i8 = i3;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1406741137, i8, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                                }
                                float floor = (float) java.lang.Math.floor(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(androidx.compose.material3.CheckboxDefaults.INSTANCE.m2993getStrokeWidthD9Ej5fM()));
                                androidx.compose.ui.state.ToggleableState ToggleableState = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                                if (function1 == null) {
                                    startRestartGroup.startReplaceGroup(2066152950);
                                    boolean z6 = (i8 & 112) == 32;
                                    boolean z7 = (i8 & 14) == 4;
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if ((z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit highSpeedVideoSizes;
                                                highSpeedVideoSizes = androidx.compose.material3.CheckboxKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, z);
                                                return highSpeedVideoSizes;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(2066218639);
                                    startRestartGroup.endReplaceGroup();
                                    function0 = null;
                                }
                                TriStateCheckbox(ToggleableState, function0, new androidx.compose.ui.graphics.drawscope.Stroke(floor, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.Stroke(floor, 0.0f, 0, 0, null, 30, null), modifier3, z5, checkboxColors4, mutableInteractionSource4, startRestartGroup, (i8 << 6) & 33546240, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                z4 = z5;
                                checkboxColors3 = checkboxColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        z5 = z3;
                        checkboxColors4 = checkboxColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        androidx.compose.ui.Modifier modifier32 = modifier2;
                        int i82 = i3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        float floor2 = (float) java.lang.Math.floor(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(androidx.compose.material3.CheckboxDefaults.INSTANCE.m2993getStrokeWidthD9Ej5fM()));
                        androidx.compose.ui.state.ToggleableState ToggleableState2 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                        if (function1 == null) {
                        }
                        TriStateCheckbox(ToggleableState2, function0, new androidx.compose.ui.graphics.drawscope.Stroke(floor2, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.Stroke(floor2, 0.0f, 0, 0, null, 30, null), modifier32, z5, checkboxColors4, mutableInteractionSource4, startRestartGroup, (i82 << 6) & 33546240, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier32;
                        z4 = z5;
                        checkboxColors3 = checkboxColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z3;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRangesFor = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRangesFor(z, function1, modifier4, z4, checkboxColors3, mutableInteractionSource3, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final androidx.compose.ui.graphics.drawscope.Stroke stroke, final androidx.compose.ui.graphics.drawscope.Stroke stroke2, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        boolean z3;
        androidx.compose.material3.CheckboxColors checkboxColors2;
        int i6;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z4;
        final androidx.compose.material3.CheckboxColors checkboxColors3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(534932591);
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
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(stroke) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(stroke2) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z3 = z2;
                        i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                checkboxColors2 = checkboxColors;
                                if (startRestartGroup.changed(checkboxColors2)) {
                                    i8 = 1048576;
                                    i3 |= i8;
                                }
                            } else {
                                checkboxColors2 = checkboxColors;
                            }
                            i8 = 524288;
                            i3 |= i8;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i6 = i2 & 128;
                        if (i6 != 0) {
                            i3 |= 12582912;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i & 12582912) == 0) {
                                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                            }
                        }
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            kotlin.jvm.functions.Function0 function0 = null;
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    checkboxColors2 = androidx.compose.material3.CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    mutableInteractionSource2 = null;
                                    int i9 = i3;
                                    androidx.compose.ui.Modifier modifier4 = modifier2;
                                    boolean z5 = z3;
                                    androidx.compose.material3.CheckboxColors checkboxColors4 = checkboxColors2;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(534932591, i9, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                                    }
                                    androidx.compose.ui.state.ToggleableState ToggleableState = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                                    if (function1 != null) {
                                        startRestartGroup.startReplaceGroup(1848599606);
                                        boolean z6 = (i9 & 112) == 32;
                                        boolean z7 = (i9 & 14) == 4;
                                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                        if ((z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                                    highSpeedVideoFpsRangesFor = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1.this, z);
                                                    return highSpeedVideoFpsRangesFor;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(1848665295);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    TriStateCheckbox(ToggleableState, function0, stroke, stroke2, modifier4, z5, checkboxColors4, mutableInteractionSource2, startRestartGroup, i9 & 33554304, 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    z4 = z5;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    checkboxColors3 = checkboxColors4;
                                    modifier3 = modifier4;
                                } else {
                                    i7 = i3;
                                    i3 = i7;
                                    int i92 = i3;
                                    androidx.compose.ui.Modifier modifier42 = modifier2;
                                    boolean z52 = z3;
                                    androidx.compose.material3.CheckboxColors checkboxColors42 = checkboxColors2;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    androidx.compose.ui.state.ToggleableState ToggleableState2 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                                    if (function1 != null) {
                                    }
                                    TriStateCheckbox(ToggleableState2, function0, stroke, stroke2, modifier42, z52, checkboxColors42, mutableInteractionSource2, startRestartGroup, i92 & 33554304, 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    z4 = z52;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    checkboxColors3 = checkboxColors42;
                                    modifier3 = modifier42;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i7 = i3 & (-3670017);
                                    i3 = i7;
                                }
                                int i922 = i3;
                                androidx.compose.ui.Modifier modifier422 = modifier2;
                                boolean z522 = z3;
                                androidx.compose.material3.CheckboxColors checkboxColors422 = checkboxColors2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                androidx.compose.ui.state.ToggleableState ToggleableState22 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                                if (function1 != null) {
                                }
                                TriStateCheckbox(ToggleableState22, function0, stroke, stroke2, modifier422, z522, checkboxColors422, mutableInteractionSource2, startRestartGroup, i922 & 33554304, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                z4 = z522;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                checkboxColors3 = checkboxColors422;
                                modifier3 = modifier422;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            z4 = z3;
                            checkboxColors3 = checkboxColors2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    ((java.lang.Integer) obj2).intValue();
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material3.CheckboxKt.getHighResolutionOutputSizeshNQ4ISI(z, function1, stroke, stroke2, modifier3, z4, checkboxColors3, mutableInteractionSource4, i, i2, (androidx.compose.runtime.Composer) obj);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z3 = z2;
                    if ((1572864 & i) == 0) {
                    }
                    i6 = i2 & 128;
                    if (i6 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                z3 = z2;
                if ((1572864 & i) == 0) {
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final androidx.compose.ui.state.ToggleableState toggleableState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        boolean z2;
        androidx.compose.material3.CheckboxColors checkboxColors2;
        int i6;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.material3.CheckboxColors checkboxColors3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1608358065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i7 = 16384;
                                i3 |= i7;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i7 = 8192;
                        i3 |= i7;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                companion = modifier2;
                            } else {
                                companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    checkboxColors2 = androidx.compose.material3.CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    mutableInteractionSource3 = null;
                                    checkboxColors3 = checkboxColors2;
                                    boolean z3 = z2;
                                    int i8 = i3;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1608358065, i8, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                                    }
                                    float floor = (float) java.lang.Math.floor(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(androidx.compose.material3.CheckboxDefaults.INSTANCE.m2993getStrokeWidthD9Ej5fM()));
                                    androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(floor, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), 0, null, 26, null);
                                    androidx.compose.ui.graphics.drawscope.Stroke stroke2 = new androidx.compose.ui.graphics.drawscope.Stroke(floor, 0.0f, 0, 0, null, 30, null);
                                    int i9 = i8 << 6;
                                    TriStateCheckbox(toggleableState, function0, stroke, stroke2, companion, z3, checkboxColors3, mutableInteractionSource3, startRestartGroup, (i8 & 126) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128), 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    z2 = z3;
                                }
                            }
                            checkboxColors3 = checkboxColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            boolean z32 = z2;
                            int i82 = i3;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            float floor2 = (float) java.lang.Math.floor(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(androidx.compose.material3.CheckboxDefaults.INSTANCE.m2993getStrokeWidthD9Ej5fM()));
                            androidx.compose.ui.graphics.drawscope.Stroke stroke3 = new androidx.compose.ui.graphics.drawscope.Stroke(floor2, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), 0, null, 26, null);
                            androidx.compose.ui.graphics.drawscope.Stroke stroke22 = new androidx.compose.ui.graphics.drawscope.Stroke(floor2, 0.0f, 0, 0, null, 30, null);
                            int i92 = i82 << 6;
                            TriStateCheckbox(toggleableState, function0, stroke3, stroke22, companion, z32, checkboxColors3, mutableInteractionSource3, startRestartGroup, (i82 & 126) | (57344 & i92) | (458752 & i92) | (3670016 & i92) | (i92 & 29360128), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            z2 = z32;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            checkboxColors3 = checkboxColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final boolean z4 = z2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit Camera2StreamConfigurationMap2;
                                    ((java.lang.Integer) obj2).intValue();
                                    Camera2StreamConfigurationMap2 = androidx.compose.material3.CheckboxKt.Camera2StreamConfigurationMap(androidx.compose.ui.state.ToggleableState.this, function0, modifier3, z4, checkboxColors3, mutableInteractionSource3, i, i2, (androidx.compose.runtime.Composer) obj);
                                    return Camera2StreamConfigurationMap2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final androidx.compose.ui.state.ToggleableState toggleableState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.graphics.drawscope.Stroke stroke, final androidx.compose.ui.graphics.drawscope.Stroke stroke2, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        androidx.compose.material3.CheckboxColors checkboxColors2;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.material3.CheckboxColors checkboxColors3;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final boolean z3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier.Companion companion2;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-406243761);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(stroke) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(stroke2) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i7 = 1048576;
                            i3 |= i7;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i7 = 524288;
                    i3 |= i7;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            i6 = i3;
                            modifier4 = modifier2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                checkboxColors2 = androidx.compose.material3.CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            modifier4 = companion3;
                            i6 = i3;
                        }
                        boolean z4 = z2;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-406243761, i6, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                        }
                        if (function0 != null) {
                            companion = androidx.compose.foundation.selection.ToggleableKt.m1953triStateToggleableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, toggleableState, mutableInteractionSource3, androidx.compose.material3.RippleKt.m3643rippleH2RKhps$default(false, androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.m4487getStateLayerSizeD9Ej5fM() / 2.0f), 0L, 4, null), z4, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7800getCheckboxo7Vup1c()), function0);
                        } else {
                            companion = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if (function0 != null) {
                            companion2 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(androidx.compose.ui.Modifier.INSTANCE);
                        } else {
                            companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(modifier4.then(companion2).then(companion), Camera2StreamConfigurationMap);
                        int i9 = i6 << 6;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        getHighSpeedVideoFpsRanges(z4, toggleableState, m1706padding3ABfNKs, checkboxColors3, stroke, stroke2, startRestartGroup, ((i6 >> 15) & 14) | ((i6 << 3) & 112) | ((i6 >> 9) & 7168) | (57344 & i9) | (i9 & 458752));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z3 = z4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z3 = z2;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.material3.CheckboxColors checkboxColors4 = checkboxColors3;
                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRangesFor = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.state.ToggleableState.this, function0, stroke, stroke2, modifier3, z3, checkboxColors4, mutableInteractionSource4, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final boolean z, final androidx.compose.ui.state.ToggleableState toggleableState, final androidx.compose.ui.Modifier modifier, final androidx.compose.material3.CheckboxColors checkboxColors, final androidx.compose.ui.graphics.drawscope.Stroke stroke, final androidx.compose.ui.graphics.drawscope.Stroke stroke2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        float f;
        int i3;
        char c;
        int i4;
        float f2;
        int i5;
        float f3;
        int i6;
        java.lang.Object rememberedValue;
        boolean changed;
        boolean changed2;
        boolean changedInstance;
        boolean changed3;
        boolean changed4;
        boolean changed5;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-891330208);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(stroke) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(stroke2) ? 131072 : 65536;
        }
        int i7 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-891330208, i7, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:401)");
            }
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(toggleableState, (java.lang.String) null, startRestartGroup, i9, 2);
            final androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    return getHighSpeedVideoSizes(segment, composer3, num.intValue());
                }

                private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighSpeedVideoSizes(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, int i10) {
                    composer3.startReplaceGroup(1780794470);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1780794470, i10, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:407)");
                    }
                    androidx.compose.animation.core.SnapSpec snap = (segment.getInitialState() == androidx.compose.ui.state.ToggleableState.Off || segment.getTargetState() != androidx.compose.ui.state.ToggleableState.Off) ? value : androidx.compose.animation.core.AnimationSpecKt.snap(100);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return snap;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.ui.state.ToggleableState toggleableState2 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-768316570);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
            }
            int i10 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    f = 0.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    java.lang.Float valueOf = java.lang.Float.valueOf(f);
                    androidx.compose.ui.state.ToggleableState toggleableState3 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-768316570);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        i3 = i7;
                        c = 65535;
                    } else {
                        i3 = i7;
                        c = 65535;
                        androidx.compose.runtime.ComposerKt.traceEventStart(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
                    }
                    i4 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            f2 = 0.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            int i11 = i3;
                            composer2 = startRestartGroup;
                            final androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), function3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            kotlin.jvm.functions.Function3 function32 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                                @Override // kotlin.jvm.functions.Function3
                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                    return getHighResolutionOutputSizeshNQ4ISI(segment, composer3, num.intValue());
                                }

                                private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, int i12) {
                                    androidx.compose.animation.core.SnapSpec snap;
                                    composer3.startReplaceGroup(630790831);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(630790831, i12, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
                                    }
                                    if (segment.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                                        snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                                    } else {
                                        snap = segment.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : value;
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return snap;
                                }
                            };
                            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                            androidx.compose.ui.state.ToggleableState toggleableState4 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
                            composer2.startReplaceGroup(1840054703);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
                            }
                            i5 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState4.ordinal()];
                            if (i5 != 1 || i5 == 2) {
                                f3 = 0.0f;
                            } else {
                                if (i5 != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                f3 = 1.0f;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            androidx.compose.ui.state.ToggleableState toggleableState5 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                            composer2.startReplaceGroup(1840054703);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
                            }
                            i6 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState5.ordinal()];
                            if (i6 != 1 && i6 != 2) {
                                if (i6 == 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                f4 = 1.0f;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            final androidx.compose.runtime.State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), (androidx.compose.animation.core.FiniteAnimationSpec) function32.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter2, "FloatAnimation", composer2, 0);
                            rememberedValue = composer2.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.material3.CheckDrawingCache(null, null, null, 7, null);
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            final androidx.compose.material3.CheckDrawingCache checkDrawingCache = (androidx.compose.material3.CheckDrawingCache) rememberedValue;
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> checkmarkColor$material3 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i9 | ((i11 >> 6) & 112));
                            int i12 = (i8 & 896) | (i11 & 126);
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> boxColor$material3 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i12);
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> borderColor$material3 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i12);
                            androidx.compose.ui.Modifier m1732requiredSize3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1732requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), getHighResolutionOutputSizeshNQ4ISI);
                            changed = composer2.changed(boxColor$material3);
                            changed2 = composer2.changed(borderColor$material3);
                            changedInstance = composer2.changedInstance(stroke2);
                            changed3 = composer2.changed(checkmarkColor$material3);
                            changed4 = composer2.changed(createTransitionAnimation);
                            changed5 = composer2.changed(createTransitionAnimation2);
                            changedInstance2 = composer2.changedInstance(stroke);
                            rememberedValue2 = composer2.rememberedValue();
                            if (!(changed | changed2 | changedInstance | changed3 | changed4 | changed5 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit highSpeedVideoFpsRangesFor;
                                        highSpeedVideoFpsRangesFor = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, borderColor$material3, stroke2, checkmarkColor$material3, createTransitionAnimation, createTransitionAnimation2, stroke, checkDrawingCache, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                        return highSpeedVideoFpsRangesFor;
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.foundation.CanvasKt.Canvas(m1732requiredSize3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        } else if (i4 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    int i112 = i3;
                    composer2 = startRestartGroup;
                    final androidx.compose.runtime.State createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), function3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    kotlin.jvm.functions.Function3 function322 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            return getHighResolutionOutputSizeshNQ4ISI(segment, composer3, num.intValue());
                        }

                        private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, int i122) {
                            androidx.compose.animation.core.SnapSpec snap;
                            composer3.startReplaceGroup(630790831);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(630790831, i122, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
                            }
                            if (segment.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                                snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                            } else {
                                snap = segment.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : value;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return snap;
                        }
                    };
                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter22 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                    androidx.compose.ui.state.ToggleableState toggleableState42 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
                    composer2.startReplaceGroup(1840054703);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i5 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState42.ordinal()];
                    if (i5 != 1) {
                    }
                    f3 = 0.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    composer2.endReplaceGroup();
                    androidx.compose.ui.state.ToggleableState toggleableState52 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                    composer2.startReplaceGroup(1840054703);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i6 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState52.ordinal()];
                    if (i6 != 1) {
                        if (i6 == 3) {
                        }
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    composer2.endReplaceGroup();
                    final androidx.compose.runtime.State createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), (androidx.compose.animation.core.FiniteAnimationSpec) function322.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter22, "FloatAnimation", composer2, 0);
                    rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    final androidx.compose.material3.CheckDrawingCache checkDrawingCache2 = (androidx.compose.material3.CheckDrawingCache) rememberedValue;
                    final androidx.compose.runtime.State checkmarkColor$material32 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i9 | ((i112 >> 6) & 112));
                    int i122 = (i8 & 896) | (i112 & 126);
                    final androidx.compose.runtime.State boxColor$material32 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i122);
                    final androidx.compose.runtime.State borderColor$material32 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i122);
                    androidx.compose.ui.Modifier m1732requiredSize3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1732requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), getHighResolutionOutputSizeshNQ4ISI);
                    changed = composer2.changed(boxColor$material32);
                    changed2 = composer2.changed(borderColor$material32);
                    changedInstance = composer2.changedInstance(stroke2);
                    changed3 = composer2.changed(checkmarkColor$material32);
                    changed4 = composer2.changed(createTransitionAnimation3);
                    changed5 = composer2.changed(createTransitionAnimation22);
                    changedInstance2 = composer2.changedInstance(stroke);
                    rememberedValue2 = composer2.rememberedValue();
                    if (!(changed | changed2 | changedInstance | changed3 | changed4 | changed5 | changedInstance2)) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoFpsRangesFor;
                            highSpeedVideoFpsRangesFor = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, borderColor$material32, stroke2, checkmarkColor$material32, createTransitionAnimation3, createTransitionAnimation22, stroke, checkDrawingCache2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            return highSpeedVideoFpsRangesFor;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                    androidx.compose.foundation.CanvasKt.Canvas(m1732requiredSize3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                } else if (i10 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            java.lang.Float valueOf2 = java.lang.Float.valueOf(f);
            androidx.compose.ui.state.ToggleableState toggleableState32 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-768316570);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i4 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState32.ordinal()];
            if (i4 != 1) {
            }
            f2 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            int i1122 = i3;
            composer2 = startRestartGroup;
            final androidx.compose.runtime.State createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf2, java.lang.Float.valueOf(f2), function3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            kotlin.jvm.functions.Function3 function3222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    return getHighResolutionOutputSizeshNQ4ISI(segment, composer3, num.intValue());
                }

                private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer3, int i1222) {
                    androidx.compose.animation.core.SnapSpec snap;
                    composer3.startReplaceGroup(630790831);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(630790831, i1222, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
                    }
                    if (segment.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                        snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        snap = segment.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : value;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return snap;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.ui.state.ToggleableState toggleableState422 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
            composer2.startReplaceGroup(1840054703);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i5 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState422.ordinal()];
            if (i5 != 1) {
            }
            f3 = 0.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            composer2.endReplaceGroup();
            androidx.compose.ui.state.ToggleableState toggleableState522 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
            composer2.startReplaceGroup(1840054703);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i6 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState522.ordinal()];
            if (i6 != 1) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            composer2.endReplaceGroup();
            final androidx.compose.runtime.State createTransitionAnimation222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), (androidx.compose.animation.core.FiniteAnimationSpec) function3222.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter222, "FloatAnimation", composer2, 0);
            rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.material3.CheckDrawingCache checkDrawingCache22 = (androidx.compose.material3.CheckDrawingCache) rememberedValue;
            final androidx.compose.runtime.State checkmarkColor$material322 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i9 | ((i1122 >> 6) & 112));
            int i1222 = (i8 & 896) | (i1122 & 126);
            final androidx.compose.runtime.State boxColor$material322 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i1222);
            final androidx.compose.runtime.State borderColor$material322 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i1222);
            androidx.compose.ui.Modifier m1732requiredSize3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m1732requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), getHighResolutionOutputSizeshNQ4ISI);
            changed = composer2.changed(boxColor$material322);
            changed2 = composer2.changed(borderColor$material322);
            changedInstance = composer2.changedInstance(stroke2);
            changed3 = composer2.changed(checkmarkColor$material322);
            changed4 = composer2.changed(createTransitionAnimation32);
            changed5 = composer2.changed(createTransitionAnimation222);
            changedInstance2 = composer2.changedInstance(stroke);
            rememberedValue2 = composer2.rememberedValue();
            if (!(changed | changed2 | changedInstance | changed3 | changed4 | changed5 | changedInstance2)) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, borderColor$material322, stroke2, checkmarkColor$material322, createTransitionAnimation32, createTransitionAnimation222, stroke, checkDrawingCache22, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
            androidx.compose.foundation.CanvasKt.Canvas(m1732requiredSize3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.material3.CheckboxKt.getHighSpeedVideoFpsRanges(z, toggleableState, modifier, checkboxColors, stroke, stroke2, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.ui.graphics.drawscope.Stroke stroke, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.runtime.State state5, androidx.compose.ui.graphics.drawscope.Stroke stroke2, androidx.compose.material3.CheckDrawingCache checkDrawingCache, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        Camera2StreamConfigurationMap(drawScope, ((androidx.compose.ui.graphics.Color) state.getValue()).m6006unboximpl(), ((androidx.compose.ui.graphics.Color) state2.getValue()).m6006unboximpl(), drawScope.mo1418toPx0680j_4(getHighSpeedVideoFpsRanges), stroke);
        getHighSpeedVideoFpsRanges(drawScope, ((androidx.compose.ui.graphics.Color) state3.getValue()).m6006unboximpl(), ((java.lang.Number) state4.getValue()).floatValue(), ((java.lang.Number) state5.getValue()).floatValue(), stroke2, checkDrawingCache);
        return kotlin.Unit.INSTANCE;
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, float f, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, j2)) {
            float width2 = stroke.getWidth();
            float width3 = stroke.getWidth();
            long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(width2) << 32) | (java.lang.Float.floatToRawIntBits(width3) & 4294967295L));
            float width4 = stroke.getWidth();
            float width5 = stroke.getWidth();
            long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat - (width4 * 2.0f)) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - (width5 * 2.0f)) & 4294967295L));
            float max = java.lang.Math.max(0.0f, f - stroke.getWidth());
            androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, m5744constructorimpl, m5812constructorimpl, androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(max) << 32) | (java.lang.Float.floatToRawIntBits(max) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, 224, null);
            long m5744constructorimpl2 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(width) << 32) | (java.lang.Float.floatToRawIntBits(width) & 4294967295L));
            float width6 = stroke.getWidth();
            float f2 = f - width;
            androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j2, m5744constructorimpl2, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat - stroke.getWidth()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - width6) << 32)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), stroke, 0.0f, null, 0, 224, null);
            return;
        }
        androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, 0L, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, 226, null);
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, float f2, androidx.compose.ui.graphics.drawscope.Stroke stroke, androidx.compose.material3.CheckDrawingCache checkDrawingCache) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getGetHighSpeedVideoFpsRanges().rewind();
        checkDrawingCache.getGetHighSpeedVideoFpsRanges().moveTo(0.2f * intBitsToFloat, lerp3 * intBitsToFloat);
        checkDrawingCache.getGetHighSpeedVideoFpsRanges().lineTo(lerp * intBitsToFloat, lerp2 * intBitsToFloat);
        checkDrawingCache.getGetHighSpeedVideoFpsRanges().lineTo(0.8f * intBitsToFloat, intBitsToFloat * lerp4);
        checkDrawingCache.getCamera2StreamConfigurationMap().setPath(checkDrawingCache.getGetHighSpeedVideoFpsRanges(), false);
        checkDrawingCache.getGetHighResolutionOutputSizeshNQ4ISI().rewind();
        checkDrawingCache.getCamera2StreamConfigurationMap().getSegment(0.0f, checkDrawingCache.getCamera2StreamConfigurationMap().getLength() * f, checkDrawingCache.getGetHighResolutionOutputSizeshNQ4ISI(), true);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, checkDrawingCache.getGetHighResolutionOutputSizeshNQ4ISI(), j, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.state.ToggleableState toggleableState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.graphics.drawscope.Stroke stroke, androidx.compose.ui.graphics.drawscope.Stroke stroke2, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, int i2, androidx.compose.runtime.Composer composer) {
        TriStateCheckbox(toggleableState, function0, stroke, stroke2, modifier, z, checkboxColors, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.state.ToggleableState toggleableState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, int i2, androidx.compose.runtime.Composer composer) {
        TriStateCheckbox(toggleableState, function0, modifier, z, checkboxColors, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(boolean z, androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.ui.Modifier modifier, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.ui.graphics.drawscope.Stroke stroke, androidx.compose.ui.graphics.drawscope.Stroke stroke2, int i, androidx.compose.runtime.Composer composer) {
        getHighSpeedVideoFpsRanges(z, toggleableState, modifier, checkboxColors, stroke, stroke2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.graphics.drawscope.Stroke stroke, androidx.compose.ui.graphics.drawscope.Stroke stroke2, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, int i2, androidx.compose.runtime.Composer composer) {
        Checkbox(z, function1, stroke, stroke2, modifier, z2, checkboxColors, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.material3.CheckboxColors checkboxColors, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, int i2, androidx.compose.runtime.Composer composer) {
        Checkbox(z, function1, modifier, z2, checkboxColors, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.state.ToggleableState.values().length];
            try {
                iArr[androidx.compose.ui.state.ToggleableState.On.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.state.ToggleableState.Off.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.state.ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
