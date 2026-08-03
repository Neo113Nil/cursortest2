package androidx.compose.material;

/* compiled from: Checkbox.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010!\u001a9\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aA\u0010,\u001a\u00020\f*\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\n\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", com.helpshift.proactive.InAppViewConstants.RADIUS, "", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(24);
    private static final float CheckboxSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* compiled from: Checkbox.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.state.ToggleableState.values().length];
            iArr[androidx.compose.ui.state.ToggleableState.On.ordinal()] = 1;
            iArr[androidx.compose.ui.state.ToggleableState.Off.ordinal()] = 2;
            iArr[androidx.compose.ui.state.ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0065  */
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
        androidx.compose.ui.Modifier.Companion companion;
        boolean z4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i6;
        androidx.compose.material.CheckboxColors m1280colorszjMxDiM;
        kotlin.jvm.functions.Function0 function0;
        final androidx.compose.material.CheckboxColors checkboxColors3;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z5;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2118660998);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Checkbox)P(!1,5,4,2,3)90@4153L39,91@4240L8,93@4257L284:Checkbox.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
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
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            z4 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) != 0) {
                                i6 = i3 & (-458753);
                                m1280colorszjMxDiM = androidx.compose.material.CheckboxDefaults.INSTANCE.m1280colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                startRestartGroup.endDefaults();
                                androidx.compose.ui.state.ToggleableState ToggleableState = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                                startRestartGroup.startReplaceableGroup(1433125990);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
                                if (function1 != null) {
                                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
                                    startRestartGroup.startReplaceableGroup(511388516);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(function1);
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                invoke2();
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                function1.invoke(java.lang.Boolean.valueOf(!z));
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                                } else {
                                    function0 = null;
                                }
                                startRestartGroup.endReplaceableGroup();
                                TriStateCheckbox(ToggleableState, function0, companion, z4, mutableInteractionSource3, m1280colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                checkboxColors3 = m1280colorszjMxDiM;
                                modifier3 = companion;
                                z5 = z4;
                                mutableInteractionSource4 = mutableInteractionSource5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i6 = i3;
                        m1280colorszjMxDiM = checkboxColors2;
                        startRestartGroup.endDefaults();
                        androidx.compose.ui.state.ToggleableState ToggleableState2 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                        startRestartGroup.startReplaceableGroup(1433125990);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
                        if (function1 != null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TriStateCheckbox(ToggleableState2, function0, companion, z4, mutableInteractionSource3, m1280colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                        checkboxColors3 = m1280colorszjMxDiM;
                        modifier3 = companion;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource52;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                            androidx.compose.material.CheckboxKt.Checkbox(z, function1, modifier3, z5, mutableInteractionSource4, checkboxColors3, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i6 = i3;
                m1280colorszjMxDiM = checkboxColors2;
                startRestartGroup.endDefaults();
                androidx.compose.ui.state.ToggleableState ToggleableState22 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
                startRestartGroup.startReplaceableGroup(1433125990);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
                if (function1 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState22, function0, companion, z4, mutableInteractionSource3, m1280colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                checkboxColors3 = m1280colorszjMxDiM;
                modifier3 = companion;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource522;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i6 = i3;
            m1280colorszjMxDiM = checkboxColors2;
            startRestartGroup.endDefaults();
            androidx.compose.ui.state.ToggleableState ToggleableState222 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
            startRestartGroup.startReplaceableGroup(1433125990);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
            if (function1 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState222, function0, companion, z4, mutableInteractionSource3, m1280colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
            checkboxColors3 = m1280colorszjMxDiM;
            modifier3 = companion;
            z5 = z4;
            mutableInteractionSource4 = mutableInteractionSource5222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i & 458752) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i6 = i3;
        m1280colorszjMxDiM = checkboxColors2;
        startRestartGroup.endDefaults();
        androidx.compose.ui.state.ToggleableState ToggleableState2222 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z);
        startRestartGroup.startReplaceableGroup(1433125990);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
        if (function1 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        TriStateCheckbox(ToggleableState2222, function0, companion, z4, mutableInteractionSource3, m1280colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
        checkboxColors3 = m1280colorszjMxDiM;
        modifier3 = companion;
        z5 = z4;
        mutableInteractionSource4 = mutableInteractionSource52222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final androidx.compose.ui.state.ToggleableState state, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.CheckboxColors checkboxColors, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z2;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.material.CheckboxColors checkboxColors2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        boolean z3;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.material.CheckboxColors m1280colorszjMxDiM;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.ui.Modifier modifier5;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final androidx.compose.material.CheckboxColors checkboxColors3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2031255194);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TriStateCheckbox)P(5,4,3,1,2)136@6460L39,137@6547L8,155@7071L301:Checkbox.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
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
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion2 = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z4 = i4 == 0 ? true : z2;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i6 = i3 & (-458753);
                                modifier3 = companion2;
                                z3 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                m1280colorszjMxDiM = androidx.compose.material.CheckboxDefaults.INSTANCE.m1280colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                startRestartGroup.endDefaults();
                                startRestartGroup.startReplaceableGroup(-1517549514);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "147@6884L120");
                                if (function0 == null) {
                                    modifier4 = modifier3;
                                    composer2 = startRestartGroup;
                                    companion = androidx.compose.foundation.selection.ToggleableKt.m825triStateToggleableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, state, mutableInteractionSource4, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, startRestartGroup, 54, 4), z3, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3793getCheckboxo7Vup1c()), function0);
                                } else {
                                    modifier4 = modifier3;
                                    composer2 = startRestartGroup;
                                    companion = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                composer2.endReplaceableGroup();
                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                if (function0 != null) {
                                    companion3 = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(companion3);
                                }
                                CheckboxImpl(z3, state, androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(modifier4.then(companion3).then(companion), CheckboxDefaultPadding), m1280colorszjMxDiM, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                                modifier5 = modifier4;
                                z2 = z3;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                checkboxColors3 = m1280colorszjMxDiM;
                            } else {
                                i6 = i3;
                                modifier3 = companion2;
                                z3 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z3 = z2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        m1280colorszjMxDiM = checkboxColors2;
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(-1517549514);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "147@6884L120");
                        if (function0 == null) {
                        }
                        composer2.endReplaceableGroup();
                        androidx.compose.ui.Modifier.Companion companion32 = androidx.compose.ui.Modifier.INSTANCE;
                        if (function0 != null) {
                        }
                        CheckboxImpl(z3, state, androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(modifier4.then(companion32).then(companion), CheckboxDefaultPadding), m1280colorszjMxDiM, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                        modifier5 = modifier4;
                        z2 = z3;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        checkboxColors3 = m1280colorszjMxDiM;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        composer2 = startRestartGroup;
                        checkboxColors3 = checkboxColors2;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i9) {
                            androidx.compose.material.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState.this, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
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
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024c A[LOOP:0: B:73:0x024a->B:74:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckboxImpl(final boolean z, final androidx.compose.ui.state.ToggleableState toggleableState, final androidx.compose.ui.Modifier modifier, final androidx.compose.material.CheckboxColors checkboxColors, androidx.compose.runtime.Composer composer, final int i) {
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        java.lang.Object rememberedValue;
        int i5;
        boolean z2;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2118895727);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CheckboxImpl)P(1,3,2)258@10957L23,259@11021L443,275@11524L458,290@12004L32,291@12066L21,292@12115L24,293@12170L27,294@12280L508,294@12202L586:Checkbox.kt#jmzs0o");
        int i6 = (i & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i6 |= startRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i6 |= startRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(toggleableState, (java.lang.String) null, startRestartGroup, i9, 2);
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> animateFloat, androidx.compose.runtime.Composer composer2, int i10) {
                    androidx.compose.animation.core.SpringSpec snap;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-1707702900);
                    if (animateFloat.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                        snap = androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    } else {
                        snap = animateFloat.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return snap;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(1847725064);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            androidx.compose.ui.state.ToggleableState toggleableState2 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1798345588);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            int i10 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    f = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    java.lang.Float valueOf = java.lang.Float.valueOf(f);
                    androidx.compose.ui.state.ToggleableState toggleableState3 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1798345588);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                    i2 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f2 = 0.0f;
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> animateFloat, androidx.compose.runtime.Composer composer2, int i11) {
                                    androidx.compose.animation.core.TweenSpec snap;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                    composer2.startReplaceableGroup(1075283605);
                                    if (animateFloat.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                                        snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                                    } else {
                                        snap = animateFloat.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null);
                                    }
                                    composer2.endReplaceableGroup();
                                    return snap;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(1399891485);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(1847725064);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            androidx.compose.ui.state.ToggleableState toggleableState4 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-2098942571);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                            i3 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState4.ordinal()];
                            if (i3 != 1 || i3 == 2) {
                                f3 = 0.0f;
                            } else {
                                if (i3 != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                f3 = 1.0f;
                            }
                            startRestartGroup.endReplaceableGroup();
                            java.lang.Float valueOf2 = java.lang.Float.valueOf(f3);
                            androidx.compose.ui.state.ToggleableState toggleableState5 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-2098942571);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                            i4 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState5.ordinal()];
                            if (i4 != 1 && i4 != 2) {
                                if (i4 == 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                f4 = 1.0f;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.runtime.State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf2, java.lang.Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke((androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.material.CheckDrawingCache(null, null, null, 7, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.material.CheckDrawingCache checkDrawingCache = (androidx.compose.material.CheckDrawingCache) rememberedValue;
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> checkmarkColor = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
                            int i11 = (i7 & 14) | (i7 & 112) | (i8 & 896);
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> boxColor = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i11);
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> borderColor = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i11);
                            androidx.compose.ui.Modifier m609requiredSize3ABfNKs = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
                            java.lang.Object[] objArr = {boxColor, borderColor, checkmarkColor, createTransitionAnimation, createTransitionAnimation2, checkDrawingCache};
                            startRestartGroup.startReplaceableGroup(-568225417);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            z2 = false;
                            for (i5 = 0; i5 < 6; i5++) {
                                z2 |= startRestartGroup.changed(objArr[i5]);
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
                                        float f5;
                                        long m1285CheckboxImpl$lambda9;
                                        long m1281CheckboxImpl$lambda10;
                                        float f6;
                                        long m1284CheckboxImpl$lambda8;
                                        float m1282CheckboxImpl$lambda4;
                                        float m1283CheckboxImpl$lambda6;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                        f5 = androidx.compose.material.CheckboxKt.StrokeWidth;
                                        float floor = (float) java.lang.Math.floor(Canvas.mo315toPx0680j_4(f5));
                                        m1285CheckboxImpl$lambda9 = androidx.compose.material.CheckboxKt.m1285CheckboxImpl$lambda9(boxColor);
                                        m1281CheckboxImpl$lambda10 = androidx.compose.material.CheckboxKt.m1281CheckboxImpl$lambda10(borderColor);
                                        f6 = androidx.compose.material.CheckboxKt.RadiusSize;
                                        androidx.compose.material.CheckboxKt.m1293drawBox1wkBAMs(Canvas, m1285CheckboxImpl$lambda9, m1281CheckboxImpl$lambda10, Canvas.mo315toPx0680j_4(f6), floor);
                                        m1284CheckboxImpl$lambda8 = androidx.compose.material.CheckboxKt.m1284CheckboxImpl$lambda8(checkmarkColor);
                                        m1282CheckboxImpl$lambda4 = androidx.compose.material.CheckboxKt.m1282CheckboxImpl$lambda4(createTransitionAnimation);
                                        m1283CheckboxImpl$lambda6 = androidx.compose.material.CheckboxKt.m1283CheckboxImpl$lambda6(createTransitionAnimation2);
                                        androidx.compose.material.CheckboxKt.m1294drawCheck3IgeMak(Canvas, m1284CheckboxImpl$lambda8, m1282CheckboxImpl$lambda4, m1283CheckboxImpl$lambda6, floor, androidx.compose.material.CheckDrawingCache.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
                        } else if (i2 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf, java.lang.Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> animateFloat, androidx.compose.runtime.Composer composer2, int i112) {
                            androidx.compose.animation.core.TweenSpec snap;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(1075283605);
                            if (animateFloat.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                                snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                            } else {
                                snap = animateFloat.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null);
                            }
                            composer2.endReplaceableGroup();
                            return snap;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1399891485);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter22 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(1847725064);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    androidx.compose.ui.state.ToggleableState toggleableState42 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-2098942571);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                    i3 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState42.ordinal()];
                    if (i3 != 1) {
                    }
                    f3 = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    java.lang.Float valueOf22 = java.lang.Float.valueOf(f3);
                    androidx.compose.ui.state.ToggleableState toggleableState52 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-2098942571);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                    i4 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState52.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 3) {
                        }
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf22, java.lang.Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22.invoke((androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.material.CheckDrawingCache checkDrawingCache2 = (androidx.compose.material.CheckDrawingCache) rememberedValue;
                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> checkmarkColor2 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
                    int i112 = (i7 & 14) | (i7 & 112) | (i8 & 896);
                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> boxColor2 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i112);
                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> borderColor2 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i112);
                    androidx.compose.ui.Modifier m609requiredSize3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
                    java.lang.Object[] objArr2 = {boxColor2, borderColor2, checkmarkColor2, createTransitionAnimation3, createTransitionAnimation22, checkDrawingCache2};
                    startRestartGroup.startReplaceableGroup(-568225417);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    z2 = false;
                    while (i5 < 6) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                            invoke2(drawScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
                            float f5;
                            long m1285CheckboxImpl$lambda9;
                            long m1281CheckboxImpl$lambda10;
                            float f6;
                            long m1284CheckboxImpl$lambda8;
                            float m1282CheckboxImpl$lambda4;
                            float m1283CheckboxImpl$lambda6;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            f5 = androidx.compose.material.CheckboxKt.StrokeWidth;
                            float floor = (float) java.lang.Math.floor(Canvas.mo315toPx0680j_4(f5));
                            m1285CheckboxImpl$lambda9 = androidx.compose.material.CheckboxKt.m1285CheckboxImpl$lambda9(boxColor2);
                            m1281CheckboxImpl$lambda10 = androidx.compose.material.CheckboxKt.m1281CheckboxImpl$lambda10(borderColor2);
                            f6 = androidx.compose.material.CheckboxKt.RadiusSize;
                            androidx.compose.material.CheckboxKt.m1293drawBox1wkBAMs(Canvas, m1285CheckboxImpl$lambda9, m1281CheckboxImpl$lambda10, Canvas.mo315toPx0680j_4(f6), floor);
                            m1284CheckboxImpl$lambda8 = androidx.compose.material.CheckboxKt.m1284CheckboxImpl$lambda8(checkmarkColor2);
                            m1282CheckboxImpl$lambda4 = androidx.compose.material.CheckboxKt.m1282CheckboxImpl$lambda4(createTransitionAnimation3);
                            m1283CheckboxImpl$lambda6 = androidx.compose.material.CheckboxKt.m1283CheckboxImpl$lambda6(createTransitionAnimation22);
                            androidx.compose.material.CheckboxKt.m1294drawCheck3IgeMak(Canvas, m1284CheckboxImpl$lambda8, m1282CheckboxImpl$lambda4, m1283CheckboxImpl$lambda6, floor, androidx.compose.material.CheckDrawingCache.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
                } else if (i10 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            startRestartGroup.endReplaceableGroup();
            java.lang.Float valueOf3 = java.lang.Float.valueOf(f);
            androidx.compose.ui.state.ToggleableState toggleableState32 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1798345588);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            i2 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState32.ordinal()];
            if (i2 != 1) {
            }
            f2 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf3, java.lang.Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> segment, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.ui.state.ToggleableState> animateFloat, androidx.compose.runtime.Composer composer2, int i1122) {
                    androidx.compose.animation.core.TweenSpec snap;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(1075283605);
                    if (animateFloat.getInitialState() == androidx.compose.ui.state.ToggleableState.Off) {
                        snap = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        snap = animateFloat.getTargetState() == androidx.compose.ui.state.ToggleableState.Off ? androidx.compose.animation.core.AnimationSpecKt.snap(100) : androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    }
                    composer2.endReplaceableGroup();
                    return snap;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(1847725064);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            androidx.compose.ui.state.ToggleableState toggleableState422 = (androidx.compose.ui.state.ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-2098942571);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            i3 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState422.ordinal()];
            if (i3 != 1) {
            }
            f3 = 0.0f;
            startRestartGroup.endReplaceableGroup();
            java.lang.Float valueOf222 = java.lang.Float.valueOf(f3);
            androidx.compose.ui.state.ToggleableState toggleableState522 = (androidx.compose.ui.state.ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-2098942571);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            i4 = androidx.compose.material.CheckboxKt.WhenMappings.$EnumSwitchMapping$0[toggleableState522.ordinal()];
            if (i4 != 1) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, valueOf222, java.lang.Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222.invoke((androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) updateTransition.getSegment(), (androidx.compose.animation.core.Transition.Segment) startRestartGroup, (androidx.compose.runtime.Composer) 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.material.CheckDrawingCache checkDrawingCache22 = (androidx.compose.material.CheckDrawingCache) rememberedValue;
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> checkmarkColor22 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
            int i1122 = (i7 & 14) | (i7 & 112) | (i8 & 896);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> boxColor22 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i1122);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> borderColor22 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i1122);
            androidx.compose.ui.Modifier m609requiredSize3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
            java.lang.Object[] objArr22 = {boxColor22, borderColor22, checkmarkColor22, createTransitionAnimation32, createTransitionAnimation222, checkDrawingCache22};
            startRestartGroup.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            z2 = false;
            while (i5 < 6) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                    invoke2(drawScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
                    float f5;
                    long m1285CheckboxImpl$lambda9;
                    long m1281CheckboxImpl$lambda10;
                    float f6;
                    long m1284CheckboxImpl$lambda8;
                    float m1282CheckboxImpl$lambda4;
                    float m1283CheckboxImpl$lambda6;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    f5 = androidx.compose.material.CheckboxKt.StrokeWidth;
                    float floor = (float) java.lang.Math.floor(Canvas.mo315toPx0680j_4(f5));
                    m1285CheckboxImpl$lambda9 = androidx.compose.material.CheckboxKt.m1285CheckboxImpl$lambda9(boxColor22);
                    m1281CheckboxImpl$lambda10 = androidx.compose.material.CheckboxKt.m1281CheckboxImpl$lambda10(borderColor22);
                    f6 = androidx.compose.material.CheckboxKt.RadiusSize;
                    androidx.compose.material.CheckboxKt.m1293drawBox1wkBAMs(Canvas, m1285CheckboxImpl$lambda9, m1281CheckboxImpl$lambda10, Canvas.mo315toPx0680j_4(f6), floor);
                    m1284CheckboxImpl$lambda8 = androidx.compose.material.CheckboxKt.m1284CheckboxImpl$lambda8(checkmarkColor22);
                    m1282CheckboxImpl$lambda4 = androidx.compose.material.CheckboxKt.m1282CheckboxImpl$lambda4(createTransitionAnimation32);
                    m1283CheckboxImpl$lambda6 = androidx.compose.material.CheckboxKt.m1283CheckboxImpl$lambda6(createTransitionAnimation222);
                    androidx.compose.material.CheckboxKt.m1294drawCheck3IgeMak(Canvas, m1284CheckboxImpl$lambda8, m1282CheckboxImpl$lambda4, m1283CheckboxImpl$lambda6, floor, androidx.compose.material.CheckDrawingCache.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                androidx.compose.material.CheckboxKt.CheckboxImpl(z, toggleableState, modifier, checkboxColors, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1293drawBox1wkBAMs(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc());
        if (androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, j2)) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2674drawRoundRectuAw5IA$default(drawScope, j, 0L, androidx.compose.ui.geometry.SizeKt.Size(m1940getWidthimpl, m1940getWidthimpl), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, null);
            return;
        }
        float f4 = m1940getWidthimpl - (2 * f2);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2674drawRoundRectuAw5IA$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f4, f4), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius$default(java.lang.Math.max(0.0f, f - f2), 0.0f, 2, null), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f5 = m1940getWidthimpl - f2;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2674drawRoundRectuAw5IA$default(drawScope, j2, androidx.compose.ui.geometry.OffsetKt.Offset(f3, f3), androidx.compose.ui.geometry.SizeKt.Size(f5, f5), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius$default(f - f3, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m1294drawCheck3IgeMak(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, float f2, float f3, androidx.compose.material.CheckDrawingCache checkDrawingCache) {
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2476getSquareKaPHkGw(), 0, null, 26, null);
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc());
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m1940getWidthimpl, lerp3 * m1940getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m1940getWidthimpl, lerp2 * m1940getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m1940getWidthimpl, m1940getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2668drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-4, reason: not valid java name */
    public static final float m1282CheckboxImpl$lambda4(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-6, reason: not valid java name */
    public static final float m1283CheckboxImpl$lambda6(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-8, reason: not valid java name */
    public static final long m1284CheckboxImpl$lambda8(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-9, reason: not valid java name */
    public static final long m1285CheckboxImpl$lambda9(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-10, reason: not valid java name */
    public static final long m1281CheckboxImpl$lambda10(androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        return state.getValue().m2123unboximpl();
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        StrokeWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        RadiusSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
    }
}
