package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0015\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0002\u0010\u0016\u001a&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002\u001a2\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0000\u001a2\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002\u001a6\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0003H\u0002\u001aV\u0010!\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0003H\u0083\b¢\u0006\u0002\u0010#\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010*\u001a\u0017\u0010+\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010,\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010\u001e\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"Slider", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "stepSize", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/pds/components/SliderStyle;", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILjava/lang/Float;Lcom/paypal/pds/components/SliderStyle;Landroidx/compose/runtime/Composer;II)V", "DefaultStepSize", "ContinuousStepDivisor", "PreviewCustomSliderValue", "calculateStepSize", "(Ljava/lang/Float;ILkotlin/ranges/ClosedFloatingPointRange;)F", "calculateFinalValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "createScaleToUserValue", "minPx", "maxPx", "createScaleToOffset", "calculateThumbPosition", "trackWidth", "isDragging", "rawOffset", "sliderSemantics", "actualStepSize", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;FIFLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "thumbColor", "Lcom/paypal/pds/core/Color;", "disabledThumbColor", "activeTrackColor", "disabledActiveTrackColor", "inactiveTrackColor", "(FLkotlin/jvm/functions/Function1;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILjava/lang/Float;Landroidx/compose/runtime/Composer;III)V", "SliderPreview", "(Lcom/paypal/pds/components/SliderStyle;Landroidx/compose/runtime/Composer;I)V", "pds_release", "customSliderValue"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SliderKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i, java.lang.Float f2, com.paypal.pds.components.SliderStyle sliderStyle, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        java.lang.Float f3;
        int i9;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final boolean z2;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3;
        final int i10;
        final java.lang.Float f4;
        final com.paypal.pds.components.SliderStyle sliderStyle2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z3;
        com.paypal.pds.components.SliderStyle sliderStyle3;
        int i11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1844900631);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i11 = 16384;
                            i4 |= i11;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i11 = 8192;
                    i4 |= i11;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        f3 = f2;
                        i4 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(sliderStyle) ? 8388608 : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                companion = modifier;
                                z3 = z;
                            } else {
                                companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                z3 = i5 == 0 ? z : true;
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                    closedFloatingPointRange2 = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
                                }
                                if (i6 != 0) {
                                    i7 = 0;
                                }
                                if (i8 != 0) {
                                    f3 = null;
                                }
                                if (i9 != 0) {
                                    sliderStyle3 = com.paypal.pds.components.SliderStyle.Neutral.INSTANCE;
                                    androidx.compose.ui.Modifier modifier3 = companion;
                                    kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange4 = closedFloatingPointRange2;
                                    int i13 = i7;
                                    java.lang.Float f5 = f3;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1844900631, i4, -1, "com.paypal.pds.components.Slider (Slider.kt:102)");
                                    }
                                    int i14 = i4 << 15;
                                    composer2 = startRestartGroup;
                                    Slider(f, function1, sliderStyle3.getActiveTrackColor(), com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, sliderStyle3.getActiveTrackColor(), com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, sliderStyle3.getInactiveTrackColor(), modifier3, z3, closedFloatingPointRange4, i13, f5, startRestartGroup, (1879048192 & i14) | (i14 & 234881024) | (i4 & 14) | 199680 | (i4 & 112) | (29360128 & i14), (i4 >> 15) & 126, 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    z2 = z3;
                                    closedFloatingPointRange3 = closedFloatingPointRange4;
                                    i10 = i13;
                                    f4 = f5;
                                    sliderStyle2 = sliderStyle3;
                                }
                            }
                            sliderStyle3 = sliderStyle;
                            androidx.compose.ui.Modifier modifier32 = companion;
                            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange42 = closedFloatingPointRange2;
                            int i132 = i7;
                            java.lang.Float f52 = f3;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            int i142 = i4 << 15;
                            composer2 = startRestartGroup;
                            Slider(f, function1, sliderStyle3.getActiveTrackColor(), com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, sliderStyle3.getActiveTrackColor(), com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, sliderStyle3.getInactiveTrackColor(), modifier32, z3, closedFloatingPointRange42, i132, f52, startRestartGroup, (1879048192 & i142) | (i142 & 234881024) | (i4 & 14) | 199680 | (i4 & 112) | (29360128 & i142), (i4 >> 15) & 126, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier32;
                            z2 = z3;
                            closedFloatingPointRange3 = closedFloatingPointRange42;
                            i10 = i132;
                            f4 = f52;
                            sliderStyle2 = sliderStyle3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            z2 = z;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i10 = i7;
                            f4 = f3;
                            sliderStyle2 = sliderStyle;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.SliderKt.$r8$lambda$CtJ0OqIXTstQ8xXy9o_UqpHmM1A(f, function1, modifier2, z2, closedFloatingPointRange3, i10, f4, sliderStyle2, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    f3 = f2;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                f3 = f2;
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            f3 = f2;
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        f3 = f2;
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(float f, int i, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange) {
        if (i <= 0) {
            return f;
        }
        return closedFloatingPointRange.getStart().floatValue() + (kotlin.math.MathKt.roundToInt((f - closedFloatingPointRange.getStart().floatValue()) / r0) * ((closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / (i + 1)));
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> createScaleToUserValue(final float f, final float f2, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedFloatingPointRange, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Float.valueOf(com.paypal.pds.components.SliderKt.m22034$r8$lambda$Wq5A0UAvHR5C1CK5diCGCBUl1g(f2, f, closedFloatingPointRange, ((java.lang.Float) obj).floatValue()));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, final com.paypal.pds.core.Color color, final com.paypal.pds.core.Color color2, final com.paypal.pds.core.Color color3, final com.paypal.pds.core.Color color4, final com.paypal.pds.core.Color color5, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i, java.lang.Float f2, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.ui.Modifier modifier2;
        final boolean z2;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2;
        final int i7;
        final java.lang.Float f3;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z3;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3;
        int i8;
        java.lang.Float f4;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        boolean changed;
        boolean changed2;
        int i9;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        java.lang.Object rememberedValue3;
        kotlin.jvm.functions.Function1 function12;
        boolean changed3;
        kotlin.jvm.functions.Function1 function13;
        boolean z5;
        java.lang.Object rememberedValue4;
        kotlin.jvm.functions.Function1 function14;
        java.lang.Object rememberedValue5;
        final androidx.compose.runtime.MutableFloatState mutableFloatState2;
        java.lang.Object rememberedValue6;
        java.lang.Object rememberedValue7;
        float f5;
        androidx.compose.runtime.MutableState mutableState;
        float min;
        java.lang.Float f6;
        float f7;
        androidx.compose.runtime.MutableFloatState mutableFloatState3;
        float f8;
        long value;
        boolean changed4;
        boolean changed5;
        float f9;
        boolean z6;
        java.lang.Object rememberedValue8;
        long j;
        java.lang.Object rememberedValue9;
        boolean changedInstance;
        int i10;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        java.lang.Object obj;
        java.lang.Object rememberedValue10;
        java.lang.String stringResource;
        boolean z7;
        boolean changed6;
        boolean changed7;
        boolean changed8;
        int i11;
        boolean z8;
        androidx.compose.runtime.State state;
        boolean z9;
        boolean changed9;
        java.lang.Object rememberedValue11;
        boolean changedInstance2;
        java.lang.Object rememberedValue12;
        androidx.compose.ui.Modifier draggable;
        boolean changed10;
        boolean changed11;
        boolean changed12;
        java.lang.Object rememberedValue13;
        boolean changed13;
        java.lang.Object rememberedValue14;
        final float f10;
        java.lang.Object rememberedValue15;
        java.lang.Object rememberedValue16;
        int i12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color5, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1728713542);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(color) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(color2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(color3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= startRestartGroup.changed(color4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= startRestartGroup.changed(color5) ? 1048576 : 524288;
        }
        int i13 = i4 & 128;
        if (i13 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        int i14 = i4 & 256;
        if (i14 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            if ((i4 & 512) == 0 && startRestartGroup.changed(closedFloatingPointRange)) {
                i12 = 536870912;
                i5 |= i12;
            }
            i12 = 268435456;
            i5 |= i12;
        }
        int i15 = i4 & 1024;
        if (i15 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i16 = i4 & 2048;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        int i17 = i6;
        if (startRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i4 & 512) != 0) {
                    i5 &= -1879048193;
                }
                companion = modifier;
                z3 = z;
                closedFloatingPointRange3 = closedFloatingPointRange;
                i8 = i;
            } else {
                companion = i13 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                z3 = i14 != 0 ? true : z;
                if ((i4 & 512) != 0) {
                    closedFloatingPointRange3 = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
                    i5 &= -1879048193;
                } else {
                    closedFloatingPointRange3 = closedFloatingPointRange;
                }
                i8 = i15 != 0 ? 0 : i;
                if (i16 != 0) {
                    f4 = null;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1728713542, i5, i17, "com.paypal.pds.components.Slider (Slider.kt:320)");
                    }
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableFloatState mutableFloatState4 = (androidx.compose.runtime.MutableFloatState) rememberedValue;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i5 >> 3) & 14);
                    final float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize20()) / 2.0f;
                    mutableFloatState = mutableFloatState4;
                    final float floatValue = mutableFloatState.getFloatValue() - mo1418toPx0680j_4;
                    changed = startRestartGroup.changed(mo1418toPx0680j_4);
                    changed2 = startRestartGroup.changed(floatValue);
                    i9 = (i5 & 1879048192) ^ 805306368;
                    modifier2 = companion;
                    if (i9 > 536870912 || !startRestartGroup.changed(closedFloatingPointRange3)) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i5 & 805306368) != 536870912) {
                            z4 = false;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!(changed | changed2 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = createScaleToUserValue(mo1418toPx0680j_4, floatValue, closedFloatingPointRange3);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                            changed3 = startRestartGroup.changed(mo1418toPx0680j_4) | startRestartGroup.changed(floatValue);
                            if (i9 > 536870912 || !startRestartGroup.changed(closedFloatingPointRange3)) {
                                function13 = function12;
                                if ((i5 & 805306368) != 536870912) {
                                    z5 = false;
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!(z5 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                                return java.lang.Float.valueOf(com.paypal.pds.components.SliderKt.m22036$r8$lambda$hWgSaqkb8pwx3IVZDSjf9GdVU(kotlin.ranges.ClosedFloatingPointRange.this, mo1418toPx0680j_4, floatValue, ((java.lang.Float) obj2).floatValue()));
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function14 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue5;
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    final androidx.compose.runtime.MutableFloatState mutableFloatState5 = (androidx.compose.runtime.MutableFloatState) rememberedValue6;
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        f5 = floatValue;
                                        rememberedValue7 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    } else {
                                        f5 = floatValue;
                                    }
                                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue7;
                                    if (mutableFloatState.getFloatValue() > 0.0f && !((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                        mutableFloatState2.setFloatValue(((java.lang.Number) function14.invoke(java.lang.Float.valueOf(f))).floatValue());
                                    }
                                    float floatValue2 = !((java.lang.Boolean) mutableState.getValue()).booleanValue() ? mutableFloatState2.getFloatValue() : ((f - closedFloatingPointRange3.getStart().floatValue()) / (closedFloatingPointRange3.getEndInclusive().floatValue() - closedFloatingPointRange3.getStart().floatValue())) * mutableFloatState.getFloatValue();
                                    if (f4 == null) {
                                        min = f4.floatValue();
                                    } else if (i8 > 0) {
                                        min = java.lang.Math.min(10.0f, (closedFloatingPointRange3.getEndInclusive().floatValue() - closedFloatingPointRange3.getStart().floatValue()) / (i8 + 1));
                                    } else {
                                        min = java.lang.Math.min(10.0f, (closedFloatingPointRange3.getEndInclusive().floatValue() - closedFloatingPointRange3.getStart().floatValue()) / 20.0f);
                                    }
                                    if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                        startRestartGroup.startReplaceGroup(-845752359);
                                        startRestartGroup.endReplaceGroup();
                                        f6 = f4;
                                        f7 = min;
                                        mutableFloatState3 = mutableFloatState;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-845703720);
                                        f6 = f4;
                                        f7 = min;
                                        mutableFloatState3 = mutableFloatState;
                                        floatValue2 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(floatValue2, androidx.compose.animation.core.AnimationSpecKt.tween$default(150, 0, com.paypal.pds.core.MotionEasingKt.easingStandardInOut(startRestartGroup, 0), 2, null), 0.0f, "thumbPosition", null, startRestartGroup, 3072, 20).getValue().floatValue();
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    f8 = floatValue2;
                                    float size48 = com.paypal.pds.core.ConstantsKt.getSize48();
                                    float size482 = com.paypal.pds.core.ConstantsKt.getSize48();
                                    if (z3) {
                                        startRestartGroup.startReplaceGroup(-858550421);
                                        value = color4.getValue(startRestartGroup, (i5 >> 15) & 14);
                                    } else {
                                        startRestartGroup.startReplaceGroup(-858551573);
                                        value = color3.getValue(startRestartGroup, (i5 >> 12) & 14);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    long value2 = color5.getValue(startRestartGroup, (i5 >> 18) & 14);
                                    changed4 = startRestartGroup.changed(mo1418toPx0680j_4);
                                    final float f11 = f5;
                                    changed5 = startRestartGroup.changed(f11);
                                    final long j2 = value;
                                    if (i9 > 536870912 || !startRestartGroup.changed(closedFloatingPointRange3)) {
                                        f9 = f8;
                                        if ((i5 & 805306368) != 536870912) {
                                            z6 = false;
                                            rememberedValue8 = startRestartGroup.rememberedValue();
                                            if ((!(changed4 | changed5) && !z6) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                final kotlin.jvm.functions.Function1 function15 = function13;
                                                final int i18 = i8;
                                                final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange4 = closedFloatingPointRange3;
                                                kotlin.jvm.functions.Function1 function16 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                                        return com.paypal.pds.components.SliderKt.$r8$lambda$BF5Ze8iv5iYxq388uKHfwiBca8c(androidx.compose.runtime.MutableFloatState.this, mutableFloatState5, mo1418toPx0680j_4, f11, function15, i18, closedFloatingPointRange4, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                                                    }
                                                };
                                                final kotlin.jvm.functions.Function1 function17 = function13;
                                                final int i19 = i8;
                                                final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange5 = closedFloatingPointRange3;
                                                j = value2;
                                                java.lang.Object sliderDraggableState = new com.paypal.pds.components.SliderDraggableState(function16, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                                        return com.paypal.pds.components.SliderKt.$r8$lambda$7O9KXkBT15LLjdI6BA4uOECrgc0(mo1418toPx0680j_4, f11, mutableFloatState2, function17, i19, closedFloatingPointRange5, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                                                    }
                                                });
                                                startRestartGroup.updateRememberedValue(sliderDraggableState);
                                                rememberedValue8 = sliderDraggableState;
                                            } else {
                                                j = value2;
                                            }
                                            com.paypal.pds.components.SliderDraggableState sliderDraggableState2 = (com.paypal.pds.components.SliderDraggableState) rememberedValue8;
                                            rememberedValue9 = startRestartGroup.rememberedValue();
                                            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue9 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                            }
                                            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue9;
                                            boolean isDragging = sliderDraggableState2.isDragging();
                                            changedInstance = startRestartGroup.changedInstance(sliderDraggableState2);
                                            java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                                            if (!changedInstance || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                i10 = i9;
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                obj = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.SliderKt$Slider$2$1(sliderDraggableState2, mutableInteractionSource3, mutableState2, null);
                                                startRestartGroup.updateRememberedValue(obj);
                                            } else {
                                                obj = rememberedValue17;
                                                i10 = i9;
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isDragging), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) obj, startRestartGroup, 0);
                                            mutableState.setValue(java.lang.Boolean.valueOf(sliderDraggableState2.isDragging()));
                                            androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier2), size482);
                                            rememberedValue10 = startRestartGroup.rememberedValue();
                                            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                                        return com.paypal.pds.components.SliderKt.$r8$lambda$IfGNIZLNXAiy1voqfC1YJRsCrtk(androidx.compose.runtime.MutableFloatState.this, (androidx.compose.ui.unit.IntSize) obj2);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue10);
                                            }
                                            androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m1726height3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue10);
                                            int i20 = (int) f;
                                            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_content_description, new java.lang.Object[]{java.lang.Integer.valueOf(i20), java.lang.Integer.valueOf((int) closedFloatingPointRange3.getEndInclusive().floatValue())}, startRestartGroup, 0);
                                            if (i8 > 0) {
                                                startRestartGroup.startReplaceGroup(-840458428);
                                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_state_description_discrete, new java.lang.Object[]{java.lang.Integer.valueOf(i20), java.lang.Integer.valueOf((int) f7)}, startRestartGroup, 0);
                                                startRestartGroup.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(-840279930);
                                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_state_description_continuous, new java.lang.Object[]{java.lang.Integer.valueOf(i20)}, startRestartGroup, 0);
                                                startRestartGroup.endReplaceGroup();
                                            }
                                            final java.lang.String str = stringResource;
                                            final boolean z10 = z3;
                                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange6 = closedFloatingPointRange3;
                                            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onSizeChanged, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                                                    final boolean z11 = z10;
                                                    final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = closedFloatingPointRange6;
                                                    final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function18 = function1;
                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1.1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final /* synthetic */ java.lang.Boolean invoke(java.lang.Float f12) {
                                                            return invoke(f12.floatValue());
                                                        }

                                                        public final java.lang.Boolean invoke(float f12) {
                                                            boolean z12;
                                                            if (z11) {
                                                                function18.invoke(java.lang.Float.valueOf(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f12), closedFloatingPointRange7)).floatValue()));
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            return java.lang.Boolean.valueOf(z12);
                                                        }
                                                    }, 1, null);
                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource2);
                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str);
                                                }
                                            }, 1, null);
                                            java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z3), java.lang.Float.valueOf(mutableFloatState3.getFloatValue()), closedFloatingPointRange3, java.lang.Integer.valueOf(i8)};
                                            z7 = (234881024 & i5) == 67108864;
                                            changed6 = startRestartGroup.changed(mo1418toPx0680j_4);
                                            changed7 = startRestartGroup.changed(f11);
                                            kotlin.jvm.functions.Function1 function18 = function13;
                                            changed8 = startRestartGroup.changed(function18);
                                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                            if ((i17 & 14) == 4) {
                                                i11 = i10;
                                                z8 = true;
                                            } else {
                                                i11 = i10;
                                                z8 = false;
                                            }
                                            if ((i11 > 536870912 || !startRestartGroup.changed(closedFloatingPointRange3)) && (i5 & 805306368) != 536870912) {
                                                state = rememberUpdatedState;
                                                z9 = false;
                                            } else {
                                                state = rememberUpdatedState;
                                                z9 = true;
                                            }
                                            changed9 = startRestartGroup.changed(state);
                                            int i21 = i5;
                                            rememberedValue11 = startRestartGroup.rememberedValue();
                                            if (!(z8 | changed6 | z7 | changed7 | changed8 | z9 | changed9) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new com.paypal.pds.components.SliderKt$Slider$4$1(z3, mo1418toPx0680j_4, f11, function18, i8, closedFloatingPointRange3, state, mutableFloatState2);
                                                startRestartGroup.updateRememberedValue(rememberedValue11);
                                            }
                                            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default, objArr, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue11);
                                            androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                                            boolean isDragging2 = sliderDraggableState2.isDragging();
                                            com.paypal.pds.components.SliderDraggableState sliderDraggableState3 = sliderDraggableState2;
                                            changedInstance2 = startRestartGroup.changedInstance(sliderDraggableState2);
                                            rememberedValue12 = startRestartGroup.rememberedValue();
                                            if (!changedInstance2 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue12 = (kotlin.jvm.functions.Function3) new com.paypal.pds.components.SliderKt$Slider$5$1(sliderDraggableState2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue12);
                                            }
                                            draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(pointerInput, sliderDraggableState3, orientation, (r20 & 4) != 0 ? true : z3, (r20 & 8) != 0 ? null : mutableInteractionSource4, (r20 & 16) != 0 ? false : isDragging2, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : (kotlin.jvm.functions.Function3) rememberedValue12, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : null, (r20 & 128) != 0 ? false : false);
                                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(draggable, "Slider");
                                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
                                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            androidx.compose.ui.Modifier m1726height3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize4());
                                            final long j3 = j;
                                            changed10 = startRestartGroup.changed(j3);
                                            final float f12 = f9;
                                            changed11 = startRestartGroup.changed(f12);
                                            changed12 = startRestartGroup.changed(j2);
                                            rememberedValue13 = startRestartGroup.rememberedValue();
                                            if (!(changed10 | changed11 | changed12) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                                        return com.paypal.pds.components.SliderKt.$r8$lambda$mkxrB5gi8Bz0RlC40bdjhJdx30Y(j3, f12, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue13);
                                            }
                                            androidx.compose.foundation.CanvasKt.Canvas(m1726height3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue13, startRestartGroup, 6);
                                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                            changed13 = startRestartGroup.changed(f12);
                                            rememberedValue14 = startRestartGroup.rememberedValue();
                                            if (!changed13 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                f10 = size48;
                                                rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                                        return com.paypal.pds.components.SliderKt.$r8$lambda$VJyXHLFyEHpaxm78yuaKOYbI8RQ(f12, f10, (androidx.compose.ui.unit.Density) obj2);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue14);
                                            } else {
                                                f10 = size48;
                                            }
                                            androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(companion2, (kotlin.jvm.functions.Function1) rememberedValue14), f10);
                                            rememberedValue15 = startRestartGroup.rememberedValue();
                                            if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue15 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda10
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                                        return com.paypal.pds.components.SliderKt.$r8$lambda$Vjx7ojLI2V7uR1Xh_VunWSw3Nq4((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue15);
                                            }
                                            androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue15);
                                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.createNode(constructor2);
                                            } else {
                                                startRestartGroup.useNode();
                                            }
                                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), z3 ? color : color2, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2);
                                            com.paypal.pds.core.PDSIndication.Emphasis emphasis = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
                                            rememberedValue16 = startRestartGroup.rememberedValue();
                                            if (rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda11
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Object invoke() {
                                                        kotlin.Unit unit;
                                                        unit = kotlin.Unit.INSTANCE;
                                                        return unit;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue16);
                                            }
                                            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background, mutableInteractionSource4, emphasis, z3, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, ((i21 >> 15) & 7168) | 1573296, 24), startRestartGroup, 0);
                                            startRestartGroup.endNode();
                                            startRestartGroup.endNode();
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            i7 = i8;
                                            z2 = z3;
                                            closedFloatingPointRange2 = closedFloatingPointRange3;
                                            f3 = f6;
                                        }
                                    } else {
                                        f9 = f8;
                                    }
                                    z6 = true;
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (!(changed4 | changed5 | z6)) {
                                    }
                                    final kotlin.jvm.functions.Function1 function152 = function13;
                                    final int i182 = i8;
                                    final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange42 = closedFloatingPointRange3;
                                    kotlin.jvm.functions.Function1 function162 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return com.paypal.pds.components.SliderKt.$r8$lambda$BF5Ze8iv5iYxq388uKHfwiBca8c(androidx.compose.runtime.MutableFloatState.this, mutableFloatState5, mo1418toPx0680j_4, f11, function152, i182, closedFloatingPointRange42, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                                        }
                                    };
                                    final kotlin.jvm.functions.Function1 function172 = function13;
                                    final int i192 = i8;
                                    final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange52 = closedFloatingPointRange3;
                                    j = value2;
                                    java.lang.Object sliderDraggableState4 = new com.paypal.pds.components.SliderDraggableState(function162, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return com.paypal.pds.components.SliderKt.$r8$lambda$7O9KXkBT15LLjdI6BA4uOECrgc0(mo1418toPx0680j_4, f11, mutableFloatState2, function172, i192, closedFloatingPointRange52, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                                        }
                                    });
                                    startRestartGroup.updateRememberedValue(sliderDraggableState4);
                                    rememberedValue8 = sliderDraggableState4;
                                    com.paypal.pds.components.SliderDraggableState sliderDraggableState22 = (com.paypal.pds.components.SliderDraggableState) rememberedValue8;
                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    androidx.compose.runtime.MutableState mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue9;
                                    boolean isDragging3 = sliderDraggableState22.isDragging();
                                    changedInstance = startRestartGroup.changedInstance(sliderDraggableState22);
                                    java.lang.Object rememberedValue172 = startRestartGroup.rememberedValue();
                                    if (changedInstance) {
                                    }
                                    i10 = i9;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    obj = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.SliderKt$Slider$2$1(sliderDraggableState22, mutableInteractionSource3, mutableState22, null);
                                    startRestartGroup.updateRememberedValue(obj);
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isDragging3), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) obj, startRestartGroup, 0);
                                    mutableState.setValue(java.lang.Boolean.valueOf(sliderDraggableState22.isDragging()));
                                    androidx.compose.ui.Modifier m1726height3ABfNKs3 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier2), size482);
                                    rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    androidx.compose.ui.Modifier onSizeChanged2 = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m1726height3ABfNKs3, (kotlin.jvm.functions.Function1) rememberedValue10);
                                    int i202 = (int) f;
                                    final java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_content_description, new java.lang.Object[]{java.lang.Integer.valueOf(i202), java.lang.Integer.valueOf((int) closedFloatingPointRange3.getEndInclusive().floatValue())}, startRestartGroup, 0);
                                    if (i8 > 0) {
                                    }
                                    final java.lang.String str2 = stringResource;
                                    final boolean z102 = z3;
                                    final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange62 = closedFloatingPointRange3;
                                    androidx.compose.ui.Modifier semantics$default2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onSizeChanged2, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                                            final boolean z11 = z102;
                                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = closedFloatingPointRange62;
                                            final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function182 = function1;
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1.1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ java.lang.Boolean invoke(java.lang.Float f122) {
                                                    return invoke(f122.floatValue());
                                                }

                                                public final java.lang.Boolean invoke(float f122) {
                                                    boolean z12;
                                                    if (z11) {
                                                        function182.invoke(java.lang.Float.valueOf(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f122), closedFloatingPointRange7)).floatValue()));
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    return java.lang.Boolean.valueOf(z12);
                                                }
                                            }, 1, null);
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource22);
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
                                        }
                                    }, 1, null);
                                    java.lang.Object[] objArr2 = {java.lang.Boolean.valueOf(z3), java.lang.Float.valueOf(mutableFloatState3.getFloatValue()), closedFloatingPointRange3, java.lang.Integer.valueOf(i8)};
                                    if ((234881024 & i5) == 67108864) {
                                    }
                                    changed6 = startRestartGroup.changed(mo1418toPx0680j_4);
                                    changed7 = startRestartGroup.changed(f11);
                                    kotlin.jvm.functions.Function1 function182 = function13;
                                    changed8 = startRestartGroup.changed(function182);
                                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource3;
                                    if ((i17 & 14) == 4) {
                                    }
                                    if (i11 > 536870912) {
                                    }
                                    state = rememberUpdatedState;
                                    z9 = false;
                                    changed9 = startRestartGroup.changed(state);
                                    int i212 = i5;
                                    rememberedValue11 = startRestartGroup.rememberedValue();
                                    if (!(z8 | changed6 | z7 | changed7 | changed8 | z9 | changed9)) {
                                    }
                                    rememberedValue11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new com.paypal.pds.components.SliderKt$Slider$4$1(z3, mo1418toPx0680j_4, f11, function182, i8, closedFloatingPointRange3, state, mutableFloatState2);
                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                    androidx.compose.ui.Modifier pointerInput2 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default2, objArr2, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue11);
                                    androidx.compose.foundation.gestures.Orientation orientation2 = androidx.compose.foundation.gestures.Orientation.Horizontal;
                                    boolean isDragging22 = sliderDraggableState22.isDragging();
                                    com.paypal.pds.components.SliderDraggableState sliderDraggableState32 = sliderDraggableState22;
                                    changedInstance2 = startRestartGroup.changedInstance(sliderDraggableState22);
                                    rememberedValue12 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2) {
                                    }
                                    rememberedValue12 = (kotlin.jvm.functions.Function3) new com.paypal.pds.components.SliderKt$Slider$5$1(sliderDraggableState22, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                    draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(pointerInput2, sliderDraggableState32, orientation2, (r20 & 4) != 0 ? true : z3, (r20 & 8) != 0 ? null : mutableInteractionSource42, (r20 & 16) != 0 ? false : isDragging22, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : (kotlin.jvm.functions.Function3) rememberedValue12, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : null, (r20 & 128) != 0 ? false : false);
                                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(draggable, "Slider");
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
                                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.ui.Modifier m1726height3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize4());
                                    final long j32 = j;
                                    changed10 = startRestartGroup.changed(j32);
                                    final float f122 = f9;
                                    changed11 = startRestartGroup.changed(f122);
                                    changed12 = startRestartGroup.changed(j2);
                                    rememberedValue13 = startRestartGroup.rememberedValue();
                                    if (!(changed10 | changed11 | changed12)) {
                                    }
                                    rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return com.paypal.pds.components.SliderKt.$r8$lambda$mkxrB5gi8Bz0RlC40bdjhJdx30Y(j32, f122, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                    androidx.compose.foundation.CanvasKt.Canvas(m1726height3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue13, startRestartGroup, 6);
                                    androidx.compose.ui.Modifier.Companion companion22 = androidx.compose.ui.Modifier.INSTANCE;
                                    changed13 = startRestartGroup.changed(f122);
                                    rememberedValue14 = startRestartGroup.rememberedValue();
                                    if (changed13) {
                                    }
                                    f10 = size48;
                                    rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return com.paypal.pds.components.SliderKt.$r8$lambda$VJyXHLFyEHpaxm78yuaKOYbI8RQ(f122, f10, (androidx.compose.ui.unit.Density) obj2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                    androidx.compose.ui.Modifier m1740size3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(companion22, (kotlin.jvm.functions.Function1) rememberedValue14), f10);
                                    rememberedValue15 = startRestartGroup.rememberedValue();
                                    if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    androidx.compose.ui.Modifier clearAndSetSemantics2 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1740size3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue15);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                                    int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics2);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, maybeCachedBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), z3 ? color : color2, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2);
                                    com.paypal.pds.core.PDSIndication.Emphasis emphasis2 = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
                                    rememberedValue16 = startRestartGroup.rememberedValue();
                                    if (rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background2, mutableInteractionSource42, emphasis2, z3, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, ((i212 >> 15) & 7168) | 1573296, 24), startRestartGroup, 0);
                                    startRestartGroup.endNode();
                                    startRestartGroup.endNode();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    i7 = i8;
                                    z2 = z3;
                                    closedFloatingPointRange2 = closedFloatingPointRange3;
                                    f3 = f6;
                                }
                            } else {
                                function13 = function12;
                            }
                            z5 = true;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!(z5 | changed3)) {
                            }
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return java.lang.Float.valueOf(com.paypal.pds.components.SliderKt.m22036$r8$lambda$hWgSaqkb8pwx3IVZDSjf9GdVU(kotlin.ranges.ClosedFloatingPointRange.this, mo1418toPx0680j_4, floatValue, ((java.lang.Float) obj2).floatValue()));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue4;
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue5;
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            final androidx.compose.runtime.MutableFloatState mutableFloatState52 = (androidx.compose.runtime.MutableFloatState) rememberedValue6;
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (androidx.compose.runtime.MutableState) rememberedValue7;
                            if (mutableFloatState.getFloatValue() > 0.0f) {
                                mutableFloatState2.setFloatValue(((java.lang.Number) function14.invoke(java.lang.Float.valueOf(f))).floatValue());
                            }
                            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            }
                            if (f4 == null) {
                            }
                            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            }
                            f8 = floatValue2;
                            float size483 = com.paypal.pds.core.ConstantsKt.getSize48();
                            float size4822 = com.paypal.pds.core.ConstantsKt.getSize48();
                            if (z3) {
                            }
                            startRestartGroup.endReplaceGroup();
                            long value22 = color5.getValue(startRestartGroup, (i5 >> 18) & 14);
                            changed4 = startRestartGroup.changed(mo1418toPx0680j_4);
                            final float f112 = f5;
                            changed5 = startRestartGroup.changed(f112);
                            final long j22 = value;
                            if (i9 > 536870912) {
                            }
                            f9 = f8;
                            if ((i5 & 805306368) != 536870912) {
                            }
                            z6 = true;
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!(changed4 | changed5 | z6)) {
                            }
                            final kotlin.jvm.functions.Function1 function1522 = function13;
                            final int i1822 = i8;
                            final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange422 = closedFloatingPointRange3;
                            kotlin.jvm.functions.Function1 function1622 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.pds.components.SliderKt.$r8$lambda$BF5Ze8iv5iYxq388uKHfwiBca8c(androidx.compose.runtime.MutableFloatState.this, mutableFloatState52, mo1418toPx0680j_4, f112, function1522, i1822, closedFloatingPointRange422, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                                }
                            };
                            final kotlin.jvm.functions.Function1 function1722 = function13;
                            final int i1922 = i8;
                            final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange522 = closedFloatingPointRange3;
                            j = value22;
                            java.lang.Object sliderDraggableState42 = new com.paypal.pds.components.SliderDraggableState(function1622, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.pds.components.SliderKt.$r8$lambda$7O9KXkBT15LLjdI6BA4uOECrgc0(mo1418toPx0680j_4, f112, mutableFloatState2, function1722, i1922, closedFloatingPointRange522, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                                }
                            });
                            startRestartGroup.updateRememberedValue(sliderDraggableState42);
                            rememberedValue8 = sliderDraggableState42;
                            com.paypal.pds.components.SliderDraggableState sliderDraggableState222 = (com.paypal.pds.components.SliderDraggableState) rememberedValue8;
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            androidx.compose.runtime.MutableState mutableState222 = (androidx.compose.runtime.MutableState) rememberedValue9;
                            boolean isDragging32 = sliderDraggableState222.isDragging();
                            changedInstance = startRestartGroup.changedInstance(sliderDraggableState222);
                            java.lang.Object rememberedValue1722 = startRestartGroup.rememberedValue();
                            if (changedInstance) {
                            }
                            i10 = i9;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            obj = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.SliderKt$Slider$2$1(sliderDraggableState222, mutableInteractionSource3, mutableState222, null);
                            startRestartGroup.updateRememberedValue(obj);
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isDragging32), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) obj, startRestartGroup, 0);
                            mutableState.setValue(java.lang.Boolean.valueOf(sliderDraggableState222.isDragging()));
                            androidx.compose.ui.Modifier m1726height3ABfNKs32 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier2), size4822);
                            rememberedValue10 = startRestartGroup.rememberedValue();
                            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            androidx.compose.ui.Modifier onSizeChanged22 = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m1726height3ABfNKs32, (kotlin.jvm.functions.Function1) rememberedValue10);
                            int i2022 = (int) f;
                            final java.lang.String stringResource222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_content_description, new java.lang.Object[]{java.lang.Integer.valueOf(i2022), java.lang.Integer.valueOf((int) closedFloatingPointRange3.getEndInclusive().floatValue())}, startRestartGroup, 0);
                            if (i8 > 0) {
                            }
                            final java.lang.String str22 = stringResource;
                            final boolean z1022 = z3;
                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange622 = closedFloatingPointRange3;
                            androidx.compose.ui.Modifier semantics$default22 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onSizeChanged22, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                                    final boolean z11 = z1022;
                                    final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = closedFloatingPointRange622;
                                    final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1822 = function1;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ java.lang.Boolean invoke(java.lang.Float f1222) {
                                            return invoke(f1222.floatValue());
                                        }

                                        public final java.lang.Boolean invoke(float f1222) {
                                            boolean z12;
                                            if (z11) {
                                                function1822.invoke(java.lang.Float.valueOf(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f1222), closedFloatingPointRange7)).floatValue()));
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            return java.lang.Boolean.valueOf(z12);
                                        }
                                    }, 1, null);
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource222);
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str22);
                                }
                            }, 1, null);
                            java.lang.Object[] objArr22 = {java.lang.Boolean.valueOf(z3), java.lang.Float.valueOf(mutableFloatState3.getFloatValue()), closedFloatingPointRange3, java.lang.Integer.valueOf(i8)};
                            if ((234881024 & i5) == 67108864) {
                            }
                            changed6 = startRestartGroup.changed(mo1418toPx0680j_4);
                            changed7 = startRestartGroup.changed(f112);
                            kotlin.jvm.functions.Function1 function1822 = function13;
                            changed8 = startRestartGroup.changed(function1822);
                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource3;
                            if ((i17 & 14) == 4) {
                            }
                            if (i11 > 536870912) {
                            }
                            state = rememberUpdatedState;
                            z9 = false;
                            changed9 = startRestartGroup.changed(state);
                            int i2122 = i5;
                            rememberedValue11 = startRestartGroup.rememberedValue();
                            if (!(z8 | changed6 | z7 | changed7 | changed8 | z9 | changed9)) {
                            }
                            rememberedValue11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new com.paypal.pds.components.SliderKt$Slider$4$1(z3, mo1418toPx0680j_4, f112, function1822, i8, closedFloatingPointRange3, state, mutableFloatState2);
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                            androidx.compose.ui.Modifier pointerInput22 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default22, objArr22, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue11);
                            androidx.compose.foundation.gestures.Orientation orientation22 = androidx.compose.foundation.gestures.Orientation.Horizontal;
                            boolean isDragging222 = sliderDraggableState222.isDragging();
                            com.paypal.pds.components.SliderDraggableState sliderDraggableState322 = sliderDraggableState222;
                            changedInstance2 = startRestartGroup.changedInstance(sliderDraggableState222);
                            rememberedValue12 = startRestartGroup.rememberedValue();
                            if (!changedInstance2) {
                            }
                            rememberedValue12 = (kotlin.jvm.functions.Function3) new com.paypal.pds.components.SliderKt$Slider$5$1(sliderDraggableState222, null);
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                            draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(pointerInput22, sliderDraggableState322, orientation22, (r20 & 4) != 0 ? true : z3, (r20 & 8) != 0 ? null : mutableInteractionSource422, (r20 & 16) != 0 ? false : isDragging222, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : (kotlin.jvm.functions.Function3) rememberedValue12, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : null, (r20 & 128) != 0 ? false : false);
                            androidx.compose.ui.Modifier testTag22 = androidx.compose.ui.platform.TestTagKt.testTag(draggable, "Slider");
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy32 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
                            int hashCode32 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag22);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl32 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, maybeCachedBoxMeasurePolicy32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, currentCompositionLocalMap32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl32, java.lang.Integer.valueOf(hashCode32), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, materializeModifier32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance32 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier m1726height3ABfNKs222 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize4());
                            final long j322 = j;
                            changed10 = startRestartGroup.changed(j322);
                            final float f1222 = f9;
                            changed11 = startRestartGroup.changed(f1222);
                            changed12 = startRestartGroup.changed(j22);
                            rememberedValue13 = startRestartGroup.rememberedValue();
                            if (!(changed10 | changed11 | changed12)) {
                            }
                            rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.pds.components.SliderKt.$r8$lambda$mkxrB5gi8Bz0RlC40bdjhJdx30Y(j322, f1222, j22, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                            androidx.compose.foundation.CanvasKt.Canvas(m1726height3ABfNKs222, (kotlin.jvm.functions.Function1) rememberedValue13, startRestartGroup, 6);
                            androidx.compose.ui.Modifier.Companion companion222 = androidx.compose.ui.Modifier.INSTANCE;
                            changed13 = startRestartGroup.changed(f1222);
                            rememberedValue14 = startRestartGroup.rememberedValue();
                            if (changed13) {
                            }
                            f10 = size483;
                            rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.pds.components.SliderKt.$r8$lambda$VJyXHLFyEHpaxm78yuaKOYbI8RQ(f1222, f10, (androidx.compose.ui.unit.Density) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                            androidx.compose.ui.Modifier m1740size3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(companion222, (kotlin.jvm.functions.Function1) rememberedValue14), f10);
                            rememberedValue15 = startRestartGroup.rememberedValue();
                            if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            androidx.compose.ui.Modifier clearAndSetSemantics22 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1740size3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue15);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int hashCode222 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics22);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl222 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl222, maybeCachedBoxMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl222, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl222, java.lang.Integer.valueOf(hashCode222), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl222, materializeModifier222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier background22 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), z3 ? color : color2, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2);
                            com.paypal.pds.core.PDSIndication.Emphasis emphasis22 = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
                            rememberedValue16 = startRestartGroup.rememberedValue();
                            if (rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background22, mutableInteractionSource422, emphasis22, z3, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, ((i2122 >> 15) & 7168) | 1573296, 24), startRestartGroup, 0);
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            i7 = i8;
                            z2 = z3;
                            closedFloatingPointRange2 = closedFloatingPointRange3;
                            f3 = f6;
                        }
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z4 = true;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!(changed | changed2 | z4)) {
                    }
                    rememberedValue3 = createScaleToUserValue(mo1418toPx0680j_4, floatValue, closedFloatingPointRange3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    changed3 = startRestartGroup.changed(mo1418toPx0680j_4) | startRestartGroup.changed(floatValue);
                    if (i9 > 536870912) {
                    }
                    function13 = function12;
                    if ((i5 & 805306368) != 536870912) {
                    }
                    z5 = true;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!(z5 | changed3)) {
                    }
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Float.valueOf(com.paypal.pds.components.SliderKt.m22036$r8$lambda$hWgSaqkb8pwx3IVZDSjf9GdVU(kotlin.ranges.ClosedFloatingPointRange.this, mo1418toPx0680j_4, floatValue, ((java.lang.Float) obj2).floatValue()));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    function14 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue5;
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    final androidx.compose.runtime.MutableFloatState mutableFloatState522 = (androidx.compose.runtime.MutableFloatState) rememberedValue6;
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue7;
                    if (mutableFloatState.getFloatValue() > 0.0f) {
                    }
                    if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    }
                    if (f4 == null) {
                    }
                    if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    }
                    f8 = floatValue2;
                    float size4832 = com.paypal.pds.core.ConstantsKt.getSize48();
                    float size48222 = com.paypal.pds.core.ConstantsKt.getSize48();
                    if (z3) {
                    }
                    startRestartGroup.endReplaceGroup();
                    long value222 = color5.getValue(startRestartGroup, (i5 >> 18) & 14);
                    changed4 = startRestartGroup.changed(mo1418toPx0680j_4);
                    final float f1122 = f5;
                    changed5 = startRestartGroup.changed(f1122);
                    final long j222 = value;
                    if (i9 > 536870912) {
                    }
                    f9 = f8;
                    if ((i5 & 805306368) != 536870912) {
                    }
                    z6 = true;
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!(changed4 | changed5 | z6)) {
                    }
                    final kotlin.jvm.functions.Function1 function15222 = function13;
                    final int i18222 = i8;
                    final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange4222 = closedFloatingPointRange3;
                    kotlin.jvm.functions.Function1 function16222 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.pds.components.SliderKt.$r8$lambda$BF5Ze8iv5iYxq388uKHfwiBca8c(androidx.compose.runtime.MutableFloatState.this, mutableFloatState522, mo1418toPx0680j_4, f1122, function15222, i18222, closedFloatingPointRange4222, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                        }
                    };
                    final kotlin.jvm.functions.Function1 function17222 = function13;
                    final int i19222 = i8;
                    final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange5222 = closedFloatingPointRange3;
                    j = value222;
                    java.lang.Object sliderDraggableState422 = new com.paypal.pds.components.SliderDraggableState(function16222, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.pds.components.SliderKt.$r8$lambda$7O9KXkBT15LLjdI6BA4uOECrgc0(mo1418toPx0680j_4, f1122, mutableFloatState2, function17222, i19222, closedFloatingPointRange5222, rememberUpdatedState, ((java.lang.Float) obj2).floatValue());
                        }
                    });
                    startRestartGroup.updateRememberedValue(sliderDraggableState422);
                    rememberedValue8 = sliderDraggableState422;
                    com.paypal.pds.components.SliderDraggableState sliderDraggableState2222 = (com.paypal.pds.components.SliderDraggableState) rememberedValue8;
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.compose.runtime.MutableState mutableState2222 = (androidx.compose.runtime.MutableState) rememberedValue9;
                    boolean isDragging322 = sliderDraggableState2222.isDragging();
                    changedInstance = startRestartGroup.changedInstance(sliderDraggableState2222);
                    java.lang.Object rememberedValue17222 = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    i10 = i9;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    obj = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.SliderKt$Slider$2$1(sliderDraggableState2222, mutableInteractionSource3, mutableState2222, null);
                    startRestartGroup.updateRememberedValue(obj);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isDragging322), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) obj, startRestartGroup, 0);
                    mutableState.setValue(java.lang.Boolean.valueOf(sliderDraggableState2222.isDragging()));
                    androidx.compose.ui.Modifier m1726height3ABfNKs322 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier2), size48222);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.compose.ui.Modifier onSizeChanged222 = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m1726height3ABfNKs322, (kotlin.jvm.functions.Function1) rememberedValue10);
                    int i20222 = (int) f;
                    final java.lang.String stringResource2222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_content_description, new java.lang.Object[]{java.lang.Integer.valueOf(i20222), java.lang.Integer.valueOf((int) closedFloatingPointRange3.getEndInclusive().floatValue())}, startRestartGroup, 0);
                    if (i8 > 0) {
                    }
                    final java.lang.String str222 = stringResource;
                    final boolean z10222 = z3;
                    final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange6222 = closedFloatingPointRange3;
                    androidx.compose.ui.Modifier semantics$default222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onSizeChanged222, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                            final boolean z11 = z10222;
                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = closedFloatingPointRange6222;
                            final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function18222 = function1;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ java.lang.Boolean invoke(java.lang.Float f12222) {
                                    return invoke(f12222.floatValue());
                                }

                                public final java.lang.Boolean invoke(float f12222) {
                                    boolean z12;
                                    if (z11) {
                                        function18222.invoke(java.lang.Float.valueOf(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f12222), closedFloatingPointRange7)).floatValue()));
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return java.lang.Boolean.valueOf(z12);
                                }
                            }, 1, null);
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource2222);
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str222);
                        }
                    }, 1, null);
                    java.lang.Object[] objArr222 = {java.lang.Boolean.valueOf(z3), java.lang.Float.valueOf(mutableFloatState3.getFloatValue()), closedFloatingPointRange3, java.lang.Integer.valueOf(i8)};
                    if ((234881024 & i5) == 67108864) {
                    }
                    changed6 = startRestartGroup.changed(mo1418toPx0680j_4);
                    changed7 = startRestartGroup.changed(f1122);
                    kotlin.jvm.functions.Function1 function18222 = function13;
                    changed8 = startRestartGroup.changed(function18222);
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource3;
                    if ((i17 & 14) == 4) {
                    }
                    if (i11 > 536870912) {
                    }
                    state = rememberUpdatedState;
                    z9 = false;
                    changed9 = startRestartGroup.changed(state);
                    int i21222 = i5;
                    rememberedValue11 = startRestartGroup.rememberedValue();
                    if (!(z8 | changed6 | z7 | changed7 | changed8 | z9 | changed9)) {
                    }
                    rememberedValue11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new com.paypal.pds.components.SliderKt$Slider$4$1(z3, mo1418toPx0680j_4, f1122, function18222, i8, closedFloatingPointRange3, state, mutableFloatState2);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                    androidx.compose.ui.Modifier pointerInput222 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default222, objArr222, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue11);
                    androidx.compose.foundation.gestures.Orientation orientation222 = androidx.compose.foundation.gestures.Orientation.Horizontal;
                    boolean isDragging2222 = sliderDraggableState2222.isDragging();
                    com.paypal.pds.components.SliderDraggableState sliderDraggableState3222 = sliderDraggableState2222;
                    changedInstance2 = startRestartGroup.changedInstance(sliderDraggableState2222);
                    rememberedValue12 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue12 = (kotlin.jvm.functions.Function3) new com.paypal.pds.components.SliderKt$Slider$5$1(sliderDraggableState2222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                    draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(pointerInput222, sliderDraggableState3222, orientation222, (r20 & 4) != 0 ? true : z3, (r20 & 8) != 0 ? null : mutableInteractionSource4222, (r20 & 16) != 0 ? false : isDragging2222, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : (kotlin.jvm.functions.Function3) rememberedValue12, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : null, (r20 & 128) != 0 ? false : false);
                    androidx.compose.ui.Modifier testTag222 = androidx.compose.ui.platform.TestTagKt.testTag(draggable, "Slider");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy322 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
                    int hashCode322 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier322 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag222);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor322 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl322 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl322, maybeCachedBoxMeasurePolicy322, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl322, currentCompositionLocalMap322, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl322, java.lang.Integer.valueOf(hashCode322), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl322, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl322, materializeModifier322, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance322 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier m1726height3ABfNKs2222 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize4());
                    final long j3222 = j;
                    changed10 = startRestartGroup.changed(j3222);
                    final float f12222 = f9;
                    changed11 = startRestartGroup.changed(f12222);
                    changed12 = startRestartGroup.changed(j222);
                    rememberedValue13 = startRestartGroup.rememberedValue();
                    if (!(changed10 | changed11 | changed12)) {
                    }
                    rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.pds.components.SliderKt.$r8$lambda$mkxrB5gi8Bz0RlC40bdjhJdx30Y(j3222, f12222, j222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                    androidx.compose.foundation.CanvasKt.Canvas(m1726height3ABfNKs2222, (kotlin.jvm.functions.Function1) rememberedValue13, startRestartGroup, 6);
                    androidx.compose.ui.Modifier.Companion companion2222 = androidx.compose.ui.Modifier.INSTANCE;
                    changed13 = startRestartGroup.changed(f12222);
                    rememberedValue14 = startRestartGroup.rememberedValue();
                    if (changed13) {
                    }
                    f10 = size4832;
                    rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.pds.components.SliderKt.$r8$lambda$VJyXHLFyEHpaxm78yuaKOYbI8RQ(f12222, f10, (androidx.compose.ui.unit.Density) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                    androidx.compose.ui.Modifier m1740size3ABfNKs222 = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(companion2222, (kotlin.jvm.functions.Function1) rememberedValue14), f10);
                    rememberedValue15 = startRestartGroup.rememberedValue();
                    if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.compose.ui.Modifier clearAndSetSemantics222 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1740size3ABfNKs222, (kotlin.jvm.functions.Function1) rememberedValue15);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode2222 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics222);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2222 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2222, maybeCachedBoxMeasurePolicy2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2222, currentCompositionLocalMap2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2222, java.lang.Integer.valueOf(hashCode2222), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2222, materializeModifier2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier background222 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), z3 ? color : color2, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2);
                    com.paypal.pds.core.PDSIndication.Emphasis emphasis222 = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
                    rememberedValue16 = startRestartGroup.rememberedValue();
                    if (rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background222, mutableInteractionSource4222, emphasis222, z3, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, ((i21222 >> 15) & 7168) | 1573296, 24), startRestartGroup, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i7 = i8;
                    z2 = z3;
                    closedFloatingPointRange2 = closedFloatingPointRange3;
                    f3 = f6;
                }
            }
            f4 = f2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.runtime.MutableFloatState mutableFloatState42 = (androidx.compose.runtime.MutableFloatState) rememberedValue;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
            final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i5 >> 3) & 14);
            final float mo1418toPx0680j_42 = density2.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize20()) / 2.0f;
            mutableFloatState = mutableFloatState42;
            final float floatValue3 = mutableFloatState.getFloatValue() - mo1418toPx0680j_42;
            changed = startRestartGroup.changed(mo1418toPx0680j_42);
            changed2 = startRestartGroup.changed(floatValue3);
            i9 = (i5 & 1879048192) ^ 805306368;
            modifier2 = companion;
            if (i9 > 536870912) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i5 & 805306368) != 536870912) {
            }
            z4 = true;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!(changed | changed2 | z4)) {
            }
            rememberedValue3 = createScaleToUserValue(mo1418toPx0680j_42, floatValue3, closedFloatingPointRange3);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            changed3 = startRestartGroup.changed(mo1418toPx0680j_42) | startRestartGroup.changed(floatValue3);
            if (i9 > 536870912) {
            }
            function13 = function12;
            if ((i5 & 805306368) != 536870912) {
            }
            z5 = true;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!(z5 | changed3)) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Float.valueOf(com.paypal.pds.components.SliderKt.m22036$r8$lambda$hWgSaqkb8pwx3IVZDSjf9GdVU(kotlin.ranges.ClosedFloatingPointRange.this, mo1418toPx0680j_42, floatValue3, ((java.lang.Float) obj2).floatValue()));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            function14 = (kotlin.jvm.functions.Function1) rememberedValue4;
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue5;
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.runtime.MutableFloatState mutableFloatState5222 = (androidx.compose.runtime.MutableFloatState) rememberedValue6;
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue7;
            if (mutableFloatState.getFloatValue() > 0.0f) {
            }
            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            }
            if (f4 == null) {
            }
            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            }
            f8 = floatValue2;
            float size48322 = com.paypal.pds.core.ConstantsKt.getSize48();
            float size482222 = com.paypal.pds.core.ConstantsKt.getSize48();
            if (z3) {
            }
            startRestartGroup.endReplaceGroup();
            long value2222 = color5.getValue(startRestartGroup, (i5 >> 18) & 14);
            changed4 = startRestartGroup.changed(mo1418toPx0680j_42);
            final float f11222 = f5;
            changed5 = startRestartGroup.changed(f11222);
            final long j2222 = value;
            if (i9 > 536870912) {
            }
            f9 = f8;
            if ((i5 & 805306368) != 536870912) {
            }
            z6 = true;
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!(changed4 | changed5 | z6)) {
            }
            final kotlin.jvm.functions.Function1 function152222 = function13;
            final int i182222 = i8;
            final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange42222 = closedFloatingPointRange3;
            kotlin.jvm.functions.Function1 function162222 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.pds.components.SliderKt.$r8$lambda$BF5Ze8iv5iYxq388uKHfwiBca8c(androidx.compose.runtime.MutableFloatState.this, mutableFloatState5222, mo1418toPx0680j_42, f11222, function152222, i182222, closedFloatingPointRange42222, rememberUpdatedState2, ((java.lang.Float) obj2).floatValue());
                }
            };
            final kotlin.jvm.functions.Function1 function172222 = function13;
            final int i192222 = i8;
            final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange52222 = closedFloatingPointRange3;
            j = value2222;
            java.lang.Object sliderDraggableState4222 = new com.paypal.pds.components.SliderDraggableState(function162222, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.pds.components.SliderKt.$r8$lambda$7O9KXkBT15LLjdI6BA4uOECrgc0(mo1418toPx0680j_42, f11222, mutableFloatState2, function172222, i192222, closedFloatingPointRange52222, rememberUpdatedState2, ((java.lang.Float) obj2).floatValue());
                }
            });
            startRestartGroup.updateRememberedValue(sliderDraggableState4222);
            rememberedValue8 = sliderDraggableState4222;
            com.paypal.pds.components.SliderDraggableState sliderDraggableState22222 = (com.paypal.pds.components.SliderDraggableState) rememberedValue8;
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.runtime.MutableState mutableState22222 = (androidx.compose.runtime.MutableState) rememberedValue9;
            boolean isDragging3222 = sliderDraggableState22222.isDragging();
            changedInstance = startRestartGroup.changedInstance(sliderDraggableState22222);
            java.lang.Object rememberedValue172222 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            i10 = i9;
            mutableInteractionSource3 = mutableInteractionSource2;
            obj = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.SliderKt$Slider$2$1(sliderDraggableState22222, mutableInteractionSource3, mutableState22222, null);
            startRestartGroup.updateRememberedValue(obj);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isDragging3222), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) obj, startRestartGroup, 0);
            mutableState.setValue(java.lang.Boolean.valueOf(sliderDraggableState22222.isDragging()));
            androidx.compose.ui.Modifier m1726height3ABfNKs3222 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier2), size482222);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.ui.Modifier onSizeChanged2222 = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m1726height3ABfNKs3222, (kotlin.jvm.functions.Function1) rememberedValue10);
            int i202222 = (int) f;
            final java.lang.String stringResource22222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_slider_content_description, new java.lang.Object[]{java.lang.Integer.valueOf(i202222), java.lang.Integer.valueOf((int) closedFloatingPointRange3.getEndInclusive().floatValue())}, startRestartGroup, 0);
            if (i8 > 0) {
            }
            final java.lang.String str2222 = stringResource;
            final boolean z102222 = z3;
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange62222 = closedFloatingPointRange3;
            androidx.compose.ui.Modifier semantics$default2222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onSizeChanged2222, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                    final boolean z11 = z102222;
                    final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = closedFloatingPointRange62222;
                    final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function182222 = function1;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>() { // from class: com.paypal.pds.components.SliderKt$sliderSemantics$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Boolean invoke(java.lang.Float f122222) {
                            return invoke(f122222.floatValue());
                        }

                        public final java.lang.Boolean invoke(float f122222) {
                            boolean z12;
                            if (z11) {
                                function182222.invoke(java.lang.Float.valueOf(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f122222), closedFloatingPointRange7)).floatValue()));
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            return java.lang.Boolean.valueOf(z12);
                        }
                    }, 1, null);
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource22222);
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2222);
                }
            }, 1, null);
            java.lang.Object[] objArr2222 = {java.lang.Boolean.valueOf(z3), java.lang.Float.valueOf(mutableFloatState3.getFloatValue()), closedFloatingPointRange3, java.lang.Integer.valueOf(i8)};
            if ((234881024 & i5) == 67108864) {
            }
            changed6 = startRestartGroup.changed(mo1418toPx0680j_42);
            changed7 = startRestartGroup.changed(f11222);
            kotlin.jvm.functions.Function1 function182222 = function13;
            changed8 = startRestartGroup.changed(function182222);
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource3;
            if ((i17 & 14) == 4) {
            }
            if (i11 > 536870912) {
            }
            state = rememberUpdatedState2;
            z9 = false;
            changed9 = startRestartGroup.changed(state);
            int i212222 = i5;
            rememberedValue11 = startRestartGroup.rememberedValue();
            if (!(z8 | changed6 | z7 | changed7 | changed8 | z9 | changed9)) {
            }
            rememberedValue11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new com.paypal.pds.components.SliderKt$Slider$4$1(z3, mo1418toPx0680j_42, f11222, function182222, i8, closedFloatingPointRange3, state, mutableFloatState2);
            startRestartGroup.updateRememberedValue(rememberedValue11);
            androidx.compose.ui.Modifier pointerInput2222 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default2222, objArr2222, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue11);
            androidx.compose.foundation.gestures.Orientation orientation2222 = androidx.compose.foundation.gestures.Orientation.Horizontal;
            boolean isDragging22222 = sliderDraggableState22222.isDragging();
            com.paypal.pds.components.SliderDraggableState sliderDraggableState32222 = sliderDraggableState22222;
            changedInstance2 = startRestartGroup.changedInstance(sliderDraggableState22222);
            rememberedValue12 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue12 = (kotlin.jvm.functions.Function3) new com.paypal.pds.components.SliderKt$Slider$5$1(sliderDraggableState22222, null);
            startRestartGroup.updateRememberedValue(rememberedValue12);
            draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(pointerInput2222, sliderDraggableState32222, orientation2222, (r20 & 4) != 0 ? true : z3, (r20 & 8) != 0 ? null : mutableInteractionSource42222, (r20 & 16) != 0 ? false : isDragging22222, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : (kotlin.jvm.functions.Function3) rememberedValue12, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : null, (r20 & 128) != 0 ? false : false);
            androidx.compose.ui.Modifier testTag2222 = androidx.compose.ui.platform.TestTagKt.testTag(draggable, "Slider");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3222 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
            int hashCode3222 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2222);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl3222 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3222, maybeCachedBoxMeasurePolicy3222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3222, currentCompositionLocalMap3222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3222, java.lang.Integer.valueOf(hashCode3222), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3222, materializeModifier3222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1726height3ABfNKs22222 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize4());
            final long j32222 = j;
            changed10 = startRestartGroup.changed(j32222);
            final float f122222 = f9;
            changed11 = startRestartGroup.changed(f122222);
            changed12 = startRestartGroup.changed(j2222);
            rememberedValue13 = startRestartGroup.rememberedValue();
            if (!(changed10 | changed11 | changed12)) {
            }
            rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.pds.components.SliderKt.$r8$lambda$mkxrB5gi8Bz0RlC40bdjhJdx30Y(j32222, f122222, j2222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue13);
            androidx.compose.foundation.CanvasKt.Canvas(m1726height3ABfNKs22222, (kotlin.jvm.functions.Function1) rememberedValue13, startRestartGroup, 6);
            androidx.compose.ui.Modifier.Companion companion22222 = androidx.compose.ui.Modifier.INSTANCE;
            changed13 = startRestartGroup.changed(f122222);
            rememberedValue14 = startRestartGroup.rememberedValue();
            if (changed13) {
            }
            f10 = size48322;
            rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.pds.components.SliderKt.$r8$lambda$VJyXHLFyEHpaxm78yuaKOYbI8RQ(f122222, f10, (androidx.compose.ui.unit.Density) obj2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue14);
            androidx.compose.ui.Modifier m1740size3ABfNKs2222 = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(companion22222, (kotlin.jvm.functions.Function1) rememberedValue14), f10);
            rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.ui.Modifier clearAndSetSemantics2222 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1740size3ABfNKs2222, (kotlin.jvm.functions.Function1) rememberedValue15);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy22222 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode22222 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics2222);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22222 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22222, maybeCachedBoxMeasurePolicy22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22222, currentCompositionLocalMap22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22222, java.lang.Integer.valueOf(hashCode22222), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22222, materializeModifier22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier background2222 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), z3 ? color : color2, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2);
            com.paypal.pds.core.PDSIndication.Emphasis emphasis2222 = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
            rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background2222, mutableInteractionSource42222, emphasis2222, z3, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, ((i212222 >> 15) & 7168) | 1573296, 24), startRestartGroup, 0);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i7 = i8;
            z2 = z3;
            closedFloatingPointRange2 = closedFloatingPointRange3;
            f3 = f6;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
            closedFloatingPointRange2 = closedFloatingPointRange;
            i7 = i;
            f3 = f2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.pds.components.SliderKt.$r8$lambda$Llg3gfjAVidogZI4osITnwtZwWI(f, function1, color, color2, color3, color4, color5, modifier3, z2, closedFloatingPointRange2, i7, f3, i2, i3, i4, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7O9KXkBT15LLjdI6BA4uOECrgc0(float f, float f2, androidx.compose.runtime.MutableFloatState mutableFloatState, kotlin.jvm.functions.Function1 function1, int i, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, androidx.compose.runtime.State state, float f3) {
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(f3, f, f2);
        mutableFloatState.setFloatValue(coerceIn);
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(getHighSpeedVideoFpsRangesFor(((java.lang.Number) function1.invoke(java.lang.Float.valueOf(coerceIn))).floatValue(), i, closedFloatingPointRange)), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) closedFloatingPointRange));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BF5Ze8iv5iYxq388uKHfwiBca8c(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, androidx.compose.runtime.State state, float f3) {
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(mutableFloatState.getFloatValue() + f3 + mutableFloatState2.getFloatValue(), f, f2);
        mutableFloatState.setFloatValue(coerceIn);
        mutableFloatState2.setFloatValue(0.0f);
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(getHighSpeedVideoFpsRangesFor(((java.lang.Number) function1.invoke(java.lang.Float.valueOf(coerceIn))).floatValue(), i, closedFloatingPointRange)), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) closedFloatingPointRange));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CtJ0OqIXTstQ8xXy9o_UqpHmM1A(float f, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, java.lang.Float f2, com.paypal.pds.components.SliderStyle sliderStyle, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        Slider(f, function1, modifier, z, closedFloatingPointRange, i, f2, sliderStyle, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IfGNIZLNXAiy1voqfC1YJRsCrtk(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.ui.unit.IntSize intSize) {
        mutableFloatState.setFloatValue((int) (intSize.m8776unboximpl() >> 32));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Llg3gfjAVidogZI4osITnwtZwWI(float f, kotlin.jvm.functions.Function1 function1, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4, com.paypal.pds.core.Color color5, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, java.lang.Float f2, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        Slider(f, function1, color, color2, color3, color4, color5, modifier, z, closedFloatingPointRange, i, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.unit.IntOffset $r8$lambda$VJyXHLFyEHpaxm78yuaKOYbI8RQ(float f, float f2, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(kotlin.math.MathKt.roundToInt(f - (density.mo1418toPx0680j_4(f2) / 2.0f)) << 32));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vjx7ojLI2V7uR1Xh_VunWSw3Nq4(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$Wq5A0UAvHR5C1-CK5diCGCBUl1g, reason: not valid java name */
    public static /* synthetic */ float m22034$r8$lambda$Wq5A0UAvHR5C1CK5diCGCBUl1g(float f, float f2, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, float f3) {
        return ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue() + ((f > f2 ? kotlin.ranges.RangesKt.coerceIn((f3 - f2) / (f - f2), 0.0f, 1.0f) : 0.0f) * (((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z1UDMQ0iyq11oXx25ugYSQvMLLs(androidx.compose.runtime.MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$epBIsn8k2nNv-HEMUnlSU_ZCrIw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22035$r8$lambda$epBIsn8k2nNvHEMUnlSU_ZCrIw(final com.paypal.pds.components.SliderStyle sliderStyle, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1248899771);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(sliderStyle) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1248899771, i3, -1, "com.paypal.pds.components.SliderPreview (Slider.kt:559)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(70.0f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
            float floatValue = mutableFloatState.getFloatValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.SliderKt.$r8$lambda$Z1UDMQ0iyq11oXx25ugYSQvMLLs(androidx.compose.runtime.MutableFloatState.this, ((java.lang.Float) obj).floatValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Slider(floatValue, (kotlin.jvm.functions.Function1) rememberedValue2, null, false, kotlin.ranges.RangesKt.rangeTo(0.0f, 100.0f), 0, null, sliderStyle, startRestartGroup, ((i3 << 21) & 29360128) | 48, 108);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SliderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.SliderKt.m22035$r8$lambda$epBIsn8k2nNvHEMUnlSU_ZCrIw(com.paypal.pds.components.SliderStyle.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$hWgSa-qkb8pwx3IVZDSjf9Gd-VU, reason: not valid java name */
    public static /* synthetic */ float m22036$r8$lambda$hWgSaqkb8pwx3IVZDSjf9GdVU(kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, float f, float f2, float f3) {
        return f + (((f3 - ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue()) / (((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue())) * (f2 - f));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mkxrB5gi8Bz0RlC40bdjhJdx30Y(long j, float f, long j2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float f2 = drawScope.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize4());
        float f3 = drawScope.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize32());
        float intBitsToFloat = (java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)) - f2) / 2.0f;
        androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L)), null, 0.0f, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        if (f > 0.0f) {
            float intBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)) - f2) / 2.0f;
            androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j2, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L)), null, 0.0f, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
