package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aO\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010!\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)\"\u000e\u0010*\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00101\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00102\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00103\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00104\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100¨\u00065²\u0006\n\u00106\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "TriStateCheckbox", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxRippleRadius", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "RadiusSize", "material", "checkDrawFraction", "checkCenterGravitationShiftFraction"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxKt {
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.CheckboxColors checkboxColors, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.material.CheckboxColors checkboxColors2;
        final boolean z4;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final androidx.compose.material.CheckboxColors checkboxColors3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        int i6;
        int i7;
        androidx.compose.material.CheckboxColors m2536colorszjMxDiM;
        kotlin.jvm.functions.Function0 function0;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2118660998);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
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
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier2;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            z5 = i4 != 0 ? true : z3;
                            mutableInteractionSource4 = i5 != 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) != 0) {
                                i6 = 32;
                                i7 = i3 & (-458753);
                                m2536colorszjMxDiM = androidx.compose.material.CheckboxDefaults.INSTANCE.m2536colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-2118660998, i7, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                                }
                                androidx.compose.ui.state.ToggleableState ToggleableState = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                                if (function1 == null) {
                                    startRestartGroup.startReplaceGroup(1809972427);
                                    boolean z6 = (i7 & 112) == i6;
                                    boolean z7 = (i7 & 14) == 4;
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if ((z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                                highResolutionOutputSizeshNQ4ISI = androidx.compose.material.CheckboxKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, z);
                                                return highResolutionOutputSizeshNQ4ISI;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(1810037123);
                                    startRestartGroup.endReplaceGroup();
                                    function0 = null;
                                }
                                TriStateCheckbox(ToggleableState, function0, companion, z5, mutableInteractionSource4, m2536colorszjMxDiM, startRestartGroup, i7 & 524160, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                checkboxColors3 = m2536colorszjMxDiM;
                                z4 = z5;
                            }
                        }
                        i6 = 32;
                        i7 = i3;
                        m2536colorszjMxDiM = checkboxColors2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        androidx.compose.ui.state.ToggleableState ToggleableState2 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                        if (function1 == null) {
                        }
                        TriStateCheckbox(ToggleableState2, function0, companion, z5, mutableInteractionSource4, m2536colorszjMxDiM, startRestartGroup, i7 & 524160, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        checkboxColors3 = m2536colorszjMxDiM;
                        z4 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRangesFor = androidx.compose.material.CheckboxKt.getHighSpeedVideoFpsRangesFor(z, function1, modifier3, z4, mutableInteractionSource3, checkboxColors3, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final androidx.compose.ui.state.ToggleableState toggleableState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.CheckboxColors checkboxColors, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.material.CheckboxColors checkboxColors2;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final androidx.compose.material.CheckboxColors checkboxColors3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        androidx.compose.material.CheckboxColors checkboxColors4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier.Companion companion2;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2031255194);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            checkboxColors4 = checkboxColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = i5 != 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) == 0) {
                                i6 = i3;
                                modifier3 = companion3;
                                z4 = z2;
                                checkboxColors4 = checkboxColors2;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(2031255194, i6, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                                }
                                if (function0 == null) {
                                    composer2 = startRestartGroup;
                                    companion = androidx.compose.foundation.selection.ToggleableKt.m1953triStateToggleableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, toggleableState, mutableInteractionSource4, androidx.compose.material.RippleKt.m2713rippleH2RKhps$default(false, getHighSpeedVideoFpsRangesFor, 0L, 4, null), z4, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7800getCheckboxo7Vup1c()), function0);
                                } else {
                                    composer2 = startRestartGroup;
                                    companion = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                if (function0 == null) {
                                    companion2 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(androidx.compose.ui.Modifier.INSTANCE);
                                } else {
                                    companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                getHighResolutionOutputSizeshNQ4ISI(z4, toggleableState, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(modifier3.then(companion2).then(companion), getHighResolutionOutputSizeshNQ4ISI), checkboxColors4, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                z3 = z4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                checkboxColors3 = checkboxColors4;
                            } else {
                                i6 = i3 & (-458753);
                                modifier3 = companion3;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                checkboxColors4 = androidx.compose.material.CheckboxDefaults.INSTANCE.m2536colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                        }
                        z4 = z2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        if (function0 == null) {
                        }
                        if (function0 == null) {
                        }
                        getHighResolutionOutputSizeshNQ4ISI(z4, toggleableState, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(modifier3.then(companion2).then(companion), getHighResolutionOutputSizeshNQ4ISI), checkboxColors4, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        z3 = z4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        checkboxColors3 = checkboxColors4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRangesFor = androidx.compose.material.CheckboxKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.state.ToggleableState.this, function0, modifier2, z3, mutableInteractionSource3, checkboxColors3, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final boolean z, final androidx.compose.ui.state.ToggleableState toggleableState, final androidx.compose.ui.Modifier modifier, final androidx.compose.material.CheckboxColors checkboxColors, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        float f3;
        int i8;
        java.lang.Object rememberedValue;
        boolean changed;
        boolean changed2;
        boolean changed3;
        boolean changed4;
        boolean changed5;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2118895727);
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
        int i9 = i2;
        if (!startRestartGroup.shouldExecute((i9 & 1171) != 1170, i9 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2118895727, i9, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:256)");
            }
            int i10 = i9 >> 3;
            int i11 = i10 & 14;
            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(toggleableState, (java.lang.String) null, startRestartGroup, i11, 2);
            kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    androidx.compose.animation.core.FiniteAnimationSpec highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.material.CheckboxKt.getHighSpeedVideoFpsRangesFor((androidx.compose.animation.core.Transition.Segment) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return highSpeedVideoFpsRangesFor;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.ui.state.ToggleableState toggleableState2 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1798345588);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:268)");
            }
            int i12 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
            float f4 = 1.0f;
            if (i12 != 1) {
                if (i12 == 2) {
                    f = 0.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    java.lang.Float valueOf = java.lang.Float.valueOf(f);
                    androidx.compose.ui.state.ToggleableState toggleableState3 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1798345588);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:268)");
                    }
                    i3 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f2 = 0.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            final androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), (androidx.compose.animation.core.FiniteAnimationSpec) function3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            kotlin.jvm.functions.Function3 function32 = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    androidx.compose.animation.core.FiniteAnimationSpec highResolutionOutputSizeshNQ4ISI;
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material.CheckboxKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.Transition.Segment) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            };
                            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                            androidx.compose.ui.state.ToggleableState toggleableState4 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-2098942571);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                i4 = -1;
                                i5 = 0;
                                androidx.compose.runtime.ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
                            } else {
                                i4 = -1;
                                i5 = 0;
                            }
                            i6 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState4.ordinal()];
                            if (i6 != 1 || i6 == 2) {
                                i7 = 3;
                                f3 = 0.0f;
                            } else {
                                i7 = 3;
                                if (i6 != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                f3 = 1.0f;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.ui.state.ToggleableState toggleableState5 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-2098942571);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-2098942571, i5, i4, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
                            }
                            i8 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState5.ordinal()];
                            if (i8 != 1 || i8 == 2) {
                                f4 = 0.0f;
                            } else if (i8 != i7) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            boolean z2 = i5;
                            final androidx.compose.runtime.State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), (androidx.compose.animation.core.FiniteAnimationSpec) function32.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i5)), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.material.CheckDrawingCache(null, null, null, 7, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final androidx.compose.material.CheckDrawingCache checkDrawingCache = (androidx.compose.material.CheckDrawingCache) rememberedValue;
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> checkmarkColor = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i11 | ((i9 >> 6) & 112));
                            int i13 = (i10 & 896) | (i9 & 126);
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> boxColor = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i13);
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> borderColor = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i13);
                            androidx.compose.ui.Modifier m1732requiredSize3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1732requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), z2, 2, null), Camera2StreamConfigurationMap);
                            changed = startRestartGroup.changed(boxColor);
                            changed2 = startRestartGroup.changed(borderColor);
                            changed3 = startRestartGroup.changed(checkmarkColor);
                            changed4 = startRestartGroup.changed(createTransitionAnimation);
                            changed5 = startRestartGroup.changed(createTransitionAnimation2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!(changed | changed2 | changed3 | changed4 | changed5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit highSpeedVideoSizes;
                                        highSpeedVideoSizes = androidx.compose.material.CheckboxKt.getHighSpeedVideoSizes(androidx.compose.material.CheckDrawingCache.this, boxColor, borderColor, checkmarkColor, createTransitionAnimation, createTransitionAnimation2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                        return highSpeedVideoSizes;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.foundation.CanvasKt.Canvas(m1732requiredSize3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        } else if (i3 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final androidx.compose.runtime.State createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), (androidx.compose.animation.core.FiniteAnimationSpec) function3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    kotlin.jvm.functions.Function3 function322 = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            androidx.compose.animation.core.FiniteAnimationSpec highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.CheckboxKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.Transition.Segment) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter22 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                    androidx.compose.ui.state.ToggleableState toggleableState42 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-2098942571);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i6 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState42.ordinal()];
                    if (i6 != 1) {
                    }
                    i7 = 3;
                    f3 = 0.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.ui.state.ToggleableState toggleableState52 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-2098942571);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i8 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState52.ordinal()];
                    if (i8 != 1) {
                    }
                    f4 = 0.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    boolean z22 = i5;
                    final androidx.compose.runtime.State createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), (androidx.compose.animation.core.FiniteAnimationSpec) function322.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i5)), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    final androidx.compose.material.CheckDrawingCache checkDrawingCache2 = (androidx.compose.material.CheckDrawingCache) rememberedValue;
                    final androidx.compose.runtime.State checkmarkColor2 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i11 | ((i9 >> 6) & 112));
                    int i132 = (i10 & 896) | (i9 & 126);
                    final androidx.compose.runtime.State boxColor2 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i132);
                    final androidx.compose.runtime.State borderColor2 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i132);
                    androidx.compose.ui.Modifier m1732requiredSize3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1732requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), z22, 2, null), Camera2StreamConfigurationMap);
                    changed = startRestartGroup.changed(boxColor2);
                    changed2 = startRestartGroup.changed(borderColor2);
                    changed3 = startRestartGroup.changed(checkmarkColor2);
                    changed4 = startRestartGroup.changed(createTransitionAnimation3);
                    changed5 = startRestartGroup.changed(createTransitionAnimation22);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changed | changed2 | changed3 | changed4 | changed5)) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = androidx.compose.material.CheckboxKt.getHighSpeedVideoSizes(androidx.compose.material.CheckDrawingCache.this, boxColor2, borderColor2, checkmarkColor2, createTransitionAnimation3, createTransitionAnimation22, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            return highSpeedVideoSizes;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.foundation.CanvasKt.Canvas(m1732requiredSize3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                } else if (i12 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            java.lang.Float valueOf2 = java.lang.Float.valueOf(f);
            androidx.compose.ui.state.ToggleableState toggleableState32 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1798345588);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i3 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState32.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final androidx.compose.runtime.State createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf2, java.lang.Float.valueOf(f2), (androidx.compose.animation.core.FiniteAnimationSpec) function3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            kotlin.jvm.functions.Function3 function3222 = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    androidx.compose.animation.core.FiniteAnimationSpec highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material.CheckboxKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.Transition.Segment) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.ui.state.ToggleableState toggleableState422 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-2098942571);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i6 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState422.ordinal()];
            if (i6 != 1) {
            }
            i7 = 3;
            f3 = 0.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.state.ToggleableState toggleableState522 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-2098942571);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i8 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState522.ordinal()];
            if (i8 != 1) {
            }
            f4 = 0.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            boolean z222 = i5;
            final androidx.compose.runtime.State createTransitionAnimation222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), (androidx.compose.animation.core.FiniteAnimationSpec) function3222.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i5)), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.material.CheckDrawingCache checkDrawingCache22 = (androidx.compose.material.CheckDrawingCache) rememberedValue;
            final androidx.compose.runtime.State checkmarkColor22 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i11 | ((i9 >> 6) & 112));
            int i1322 = (i10 & 896) | (i9 & 126);
            final androidx.compose.runtime.State boxColor22 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i1322);
            final androidx.compose.runtime.State borderColor22 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i1322);
            androidx.compose.ui.Modifier m1732requiredSize3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m1732requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), z222, 2, null), Camera2StreamConfigurationMap);
            changed = startRestartGroup.changed(boxColor22);
            changed2 = startRestartGroup.changed(borderColor22);
            changed3 = startRestartGroup.changed(checkmarkColor22);
            changed4 = startRestartGroup.changed(createTransitionAnimation32);
            changed5 = startRestartGroup.changed(createTransitionAnimation222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changed | changed2 | changed3 | changed4 | changed5)) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.material.CheckboxKt.getHighSpeedVideoSizes(androidx.compose.material.CheckDrawingCache.this, boxColor22, borderColor22, checkmarkColor22, createTransitionAnimation32, createTransitionAnimation222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    return highSpeedVideoSizes;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.foundation.CanvasKt.Canvas(m1732requiredSize3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap2;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap2 = androidx.compose.material.CheckboxKt.Camera2StreamConfigurationMap(z, toggleableState, modifier, checkboxColors, i, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.FiniteAnimationSpec getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.Transition.Segment segment, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.animation.core.SpringSpec snap;
        composer.startReplaceGroup(-1707702900);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1707702900, i, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:261)");
        }
        if (segment.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
            snap = androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null);
        } else {
            snap = segment.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.FiniteAnimationSpec getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.Segment segment, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.animation.core.TweenSpec snap;
        composer.startReplaceGroup(1075283605);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1075283605, i, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:278)");
        }
        if (segment.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
            snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
        } else {
            snap = segment.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material.CheckDrawingCache checkDrawingCache, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.runtime.State state5, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float floor = (float) java.lang.Math.floor(drawScope.mo1418toPx0680j_4(getHighSpeedVideoSizes));
        getHighSpeedVideoFpsRangesFor(drawScope, Camera2StreamConfigurationMap(state), getHighSpeedVideoFpsRanges(state2), drawScope.mo1418toPx0680j_4(getHighSpeedVideoFpsRanges), floor);
        getHighSpeedVideoSizes(drawScope, getHighSpeedVideoSizes(state3), getHighSpeedVideoFpsRangesFor(state4), getHighResolutionOutputSizeshNQ4ISI(state5), floor, checkDrawingCache);
        return kotlin.Unit.INSTANCE;
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, j2)) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, 0L, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        float f4 = intBitsToFloat - (f2 * 2.0f);
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f4) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L));
        float max = java.lang.Math.max(0.0f, f - f2);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, m5744constructorimpl, m5812constructorimpl, androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(max) << 32) | (java.lang.Float.floatToRawIntBits(max) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f5 = intBitsToFloat - f2;
        androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j2, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f5) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f5) << 32)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(r0) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f - f3) << 32)), stroke, 0.0f, null, 0, 224, null);
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, float f2, float f3, androidx.compose.material.CheckDrawingCache checkDrawingCache) {
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), 0, null, 26, null);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getGetHighSpeedVideoFpsRangesFor().reset();
        checkDrawingCache.getGetHighSpeedVideoFpsRangesFor().moveTo(0.2f * intBitsToFloat, lerp3 * intBitsToFloat);
        checkDrawingCache.getGetHighSpeedVideoFpsRangesFor().lineTo(lerp * intBitsToFloat, lerp2 * intBitsToFloat);
        checkDrawingCache.getGetHighSpeedVideoFpsRangesFor().lineTo(0.8f * intBitsToFloat, intBitsToFloat * lerp4);
        checkDrawingCache.getCamera2StreamConfigurationMap().setPath(checkDrawingCache.getGetHighSpeedVideoFpsRangesFor(), false);
        checkDrawingCache.getGetHighResolutionOutputSizeshNQ4ISI().reset();
        checkDrawingCache.getCamera2StreamConfigurationMap().getSegment(0.0f, checkDrawingCache.getCamera2StreamConfigurationMap().getLength() * f, checkDrawingCache.getGetHighResolutionOutputSizeshNQ4ISI(), true);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, checkDrawingCache.getGetHighResolutionOutputSizeshNQ4ISI(), j, 0.0f, stroke, null, 0, 52, null);
    }

    private static final float getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final long getHighSpeedVideoSizes(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m6006unboximpl();
    }

    private static final long Camera2StreamConfigurationMap(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m6006unboximpl();
    }

    private static final long getHighSpeedVideoFpsRanges(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m6006unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.state.ToggleableState toggleableState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.CheckboxColors checkboxColors, int i, int i2, androidx.compose.runtime.Composer composer) {
        TriStateCheckbox(toggleableState, function0, modifier, z, mutableInteractionSource, checkboxColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(boolean z, androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.ui.Modifier modifier, androidx.compose.material.CheckboxColors checkboxColors, int i, androidx.compose.runtime.Composer composer) {
        getHighResolutionOutputSizeshNQ4ISI(z, toggleableState, modifier, checkboxColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.CheckboxColors checkboxColors, int i, int i2, androidx.compose.runtime.Composer composer) {
        Checkbox(z, function1, modifier, z2, mutableInteractionSource, checkboxColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
