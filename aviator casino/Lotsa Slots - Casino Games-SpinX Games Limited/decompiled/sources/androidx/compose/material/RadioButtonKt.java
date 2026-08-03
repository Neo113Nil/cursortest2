package androidx.compose.material;

/* compiled from: RadioButton.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0066  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.RadioButtonColors radioButtonColors, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.material.RadioButtonColors radioButtonColors2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        float m4478constructorimpl;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state;
        final androidx.compose.runtime.State state2;
        androidx.compose.material.RadioButtonColors radioButtonColors3;
        boolean z5;
        androidx.compose.ui.Modifier modifier4;
        ?? r12;
        androidx.compose.ui.Modifier.Companion companion;
        boolean changed;
        java.lang.Object rememberedValue;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final boolean z6;
        final androidx.compose.material.RadioButtonColors radioButtonColors4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1314435585);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(RadioButton)P(5,4,3,1,2)78@3687L39,79@3780L8,81@3813L164,85@4006L29,109@4847L385,102@4551L681:RadioButton.kt#jmzs0o");
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
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            if (startRestartGroup.changed(radioButtonColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion2 = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z7 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i6 = i3 & (-458753);
                                modifier3 = companion2;
                                z4 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                radioButtonColors2 = androidx.compose.material.RadioButtonDefaults.INSTANCE.m1481colorsRGew2ao(0L, 0L, 0L, startRestartGroup, 3072, 7);
                            } else {
                                i6 = i3;
                                modifier3 = companion2;
                                z4 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        startRestartGroup.endDefaults();
                        if (!z) {
                            m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                        }
                        androidx.compose.runtime.State m118animateDpAsStateKz89ssw = androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(m4478constructorimpl, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
                        int i9 = i6 >> 9;
                        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i9 & 896) | (i9 & 14) | ((i6 << 3) & 112));
                        startRestartGroup.startReplaceableGroup(1941632354);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "94@4361L123");
                        if (function0 == null) {
                            radioButtonColors3 = radioButtonColors2;
                            z5 = z4;
                            modifier4 = modifier3;
                            composer2 = startRestartGroup;
                            r12 = 0;
                            state = radioColor;
                            state2 = m118animateDpAsStateKz89ssw;
                            companion = androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, z, mutableInteractionSource4, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, startRestartGroup, 54, 4), z5, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3796getRadioButtono7Vup1c()), function0);
                        } else {
                            composer2 = startRestartGroup;
                            state = radioColor;
                            state2 = m118animateDpAsStateKz89ssw;
                            radioButtonColors3 = radioButtonColors2;
                            z5 = z4;
                            modifier4 = modifier3;
                            r12 = 0;
                            companion = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                        if (function0 != null) {
                            companion3 = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(companion3);
                        }
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.ui.Modifier m609requiredSize3ABfNKs = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier5.then(companion3).then(companion), androidx.compose.ui.Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                        composer2.startReplaceableGroup(511388516);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                        changed = composer2.changed(state) | composer2.changed(state2);
                        rememberedValue = composer2.rememberedValue();
                        if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                    float f;
                                    float f2;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                    f = androidx.compose.material.RadioButtonKt.RadioStrokeWidth;
                                    float f3 = Canvas.mo315toPx0680j_4(f);
                                    long m2123unboximpl = state.getValue().m2123unboximpl();
                                    f2 = androidx.compose.material.RadioButtonKt.RadioRadius;
                                    float f4 = f3 / 2;
                                    androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, m2123unboximpl, Canvas.mo315toPx0680j_4(f2) - f4, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(state2.getValue().m4492unboximpl(), androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0) {
                                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, state.getValue().m2123unboximpl(), Canvas.mo315toPx0680j_4(state2.getValue().m4492unboximpl()) - f4, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue, composer2, r12);
                        modifier2 = modifier5;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        z6 = z5;
                        radioButtonColors4 = radioButtonColors3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        radioButtonColors4 = radioButtonColors2;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i10) {
                            androidx.compose.material.RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors4, composer3, i | 1, i2);
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
                startRestartGroup.endDefaults();
                if (!z) {
                }
                androidx.compose.runtime.State m118animateDpAsStateKz89ssw2 = androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(m4478constructorimpl, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
                int i92 = i6 >> 9;
                androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor2 = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i92 & 896) | (i92 & 14) | ((i6 << 3) & 112));
                startRestartGroup.startReplaceableGroup(1941632354);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "94@4361L123");
                if (function0 == null) {
                }
                composer2.endReplaceableGroup();
                androidx.compose.ui.Modifier.Companion companion32 = androidx.compose.ui.Modifier.INSTANCE;
                if (function0 != null) {
                }
                androidx.compose.ui.Modifier modifier52 = modifier4;
                androidx.compose.ui.Modifier m609requiredSize3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier52.then(companion32).then(companion), androidx.compose.ui.Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                changed = composer2.changed(state) | composer2.changed(state2);
                rememberedValue = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        float f;
                        float f2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        f = androidx.compose.material.RadioButtonKt.RadioStrokeWidth;
                        float f3 = Canvas.mo315toPx0680j_4(f);
                        long m2123unboximpl = state.getValue().m2123unboximpl();
                        f2 = androidx.compose.material.RadioButtonKt.RadioRadius;
                        float f4 = f3 / 2;
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, m2123unboximpl, Canvas.mo315toPx0680j_4(f2) - f4, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(state2.getValue().m4492unboximpl(), androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, state.getValue().m2123unboximpl(), Canvas.mo315toPx0680j_4(state2.getValue().m4492unboximpl()) - f4, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
                composer2.endReplaceableGroup();
                androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue, composer2, r12);
                modifier2 = modifier52;
                mutableInteractionSource5 = mutableInteractionSource4;
                z6 = z5;
                radioButtonColors4 = radioButtonColors3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
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
            startRestartGroup.endDefaults();
            if (!z) {
            }
            androidx.compose.runtime.State m118animateDpAsStateKz89ssw22 = androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(m4478constructorimpl, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
            int i922 = i6 >> 9;
            androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor22 = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i922 & 896) | (i922 & 14) | ((i6 << 3) & 112));
            startRestartGroup.startReplaceableGroup(1941632354);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "94@4361L123");
            if (function0 == null) {
            }
            composer2.endReplaceableGroup();
            androidx.compose.ui.Modifier.Companion companion322 = androidx.compose.ui.Modifier.INSTANCE;
            if (function0 != null) {
            }
            androidx.compose.ui.Modifier modifier522 = modifier4;
            androidx.compose.ui.Modifier m609requiredSize3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier522.then(companion322).then(companion), androidx.compose.ui.Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
            composer2.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed = composer2.changed(state) | composer2.changed(state2);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                    float f;
                    float f2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    f = androidx.compose.material.RadioButtonKt.RadioStrokeWidth;
                    float f3 = Canvas.mo315toPx0680j_4(f);
                    long m2123unboximpl = state.getValue().m2123unboximpl();
                    f2 = androidx.compose.material.RadioButtonKt.RadioRadius;
                    float f4 = f3 / 2;
                    androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, m2123unboximpl, Canvas.mo315toPx0680j_4(f2) - f4, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                    if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(state2.getValue().m4492unboximpl(), androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0) {
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, state.getValue().m2123unboximpl(), Canvas.mo315toPx0680j_4(state2.getValue().m4492unboximpl()) - f4, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, null, 0, 108, null);
                    }
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue, composer2, r12);
            modifier2 = modifier522;
            mutableInteractionSource5 = mutableInteractionSource4;
            z6 = z5;
            radioButtonColors4 = radioButtonColors3;
            endRestartGroup = composer2.endRestartGroup();
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
        startRestartGroup.endDefaults();
        if (!z) {
        }
        androidx.compose.runtime.State m118animateDpAsStateKz89ssw222 = androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(m4478constructorimpl, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, null, 6, null), null, startRestartGroup, 48, 4);
        int i9222 = i6 >> 9;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> radioColor222 = radioButtonColors2.radioColor(z4, z, startRestartGroup, (i9222 & 896) | (i9222 & 14) | ((i6 << 3) & 112));
        startRestartGroup.startReplaceableGroup(1941632354);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "94@4361L123");
        if (function0 == null) {
        }
        composer2.endReplaceableGroup();
        androidx.compose.ui.Modifier.Companion companion3222 = androidx.compose.ui.Modifier.INSTANCE;
        if (function0 != null) {
        }
        androidx.compose.ui.Modifier modifier5222 = modifier4;
        androidx.compose.ui.Modifier m609requiredSize3ABfNKs222 = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier5222.then(companion3222).then(companion), androidx.compose.ui.Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
        composer2.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed = composer2.changed(state) | composer2.changed(state2);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                float f;
                float f2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                f = androidx.compose.material.RadioButtonKt.RadioStrokeWidth;
                float f3 = Canvas.mo315toPx0680j_4(f);
                long m2123unboximpl = state.getValue().m2123unboximpl();
                f2 = androidx.compose.material.RadioButtonKt.RadioRadius;
                float f4 = f3 / 2;
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, m2123unboximpl, Canvas.mo315toPx0680j_4(f2) - f4, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(state2.getValue().m4492unboximpl(), androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0) {
                    androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(Canvas, state.getValue().m2123unboximpl(), Canvas.mo315toPx0680j_4(state2.getValue().m4492unboximpl()) - f4, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, null, 0, 108, null);
                }
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        androidx.compose.foundation.CanvasKt.Canvas(m609requiredSize3ABfNKs222, (kotlin.jvm.functions.Function1) rememberedValue, composer2, r12);
        modifier2 = modifier5222;
        mutableInteractionSource5 = mutableInteractionSource4;
        z6 = z5;
        radioButtonColors4 = radioButtonColors3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);
        RadioButtonSize = m4478constructorimpl;
        RadioRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(m4478constructorimpl / f);
        RadioButtonDotSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);
        RadioStrokeWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
    }
}
