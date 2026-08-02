package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\")\u0010\u001e\u001a\u00020\u0013*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00138A@AX\u0080\u008e\u0002¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "cornerRadius", "dashWidth", "dashGap", "dashedBorder-shuYwDI", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Color;FFFFLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "dashedBorder", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "", "", "drawDashedBorder-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFF)V", "drawDashedBorder", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "HasDashedBorderKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getHasDashedBorderKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "<set-?>", "getHasDashedBorder", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setHasDashedBorder", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "hasDashedBorder"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DashedBorderKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.paypal.oslo.feature.home.ui.DashedBorderKt.class, "hasDashedBorder", "getHasDashedBorder(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> HasDashedBorderKey = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("HasDashedBorder", (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getHasDashedBorderKey() {
        return HasDashedBorderKey;
    }

    public static final boolean getHasDashedBorder(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return HasDashedBorderKey.getValue(semanticsPropertyReceiver, Camera2StreamConfigurationMap[0]).booleanValue();
    }

    public static final void setHasDashedBorder(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        HasDashedBorderKey.setValue(semanticsPropertyReceiver, Camera2StreamConfigurationMap[0], java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r23.changed(r19) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r23.changed(r20) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r23.changed(r21) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r23.changed(r22) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
    /* renamed from: dashedBorder-shuYwDI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.Modifier m14896dashedBordershuYwDI(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, final float f, final float f2, final float f3, final float f4, androidx.compose.runtime.Composer composer, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object rememberedValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1509702697, i, -1, "com.paypal.oslo.feature.home.ui.dashedBorder (DashedBorder.kt:59)");
        }
        final long value = color.getValue(composer, (i >> 3) & 14);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.DashedBorderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.ui.DashedBorderKt.$r8$lambda$GknbSS4CrxqIZIxlG91jDAa1L_A((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
        boolean changed = composer.changed(value);
        if (((i & 896) ^ 384) <= 256) {
        }
        if ((i & 384) != 256) {
            z = false;
            if (((i & 7168) ^ 3072) <= 2048) {
            }
            if ((i & 3072) != 2048) {
                z2 = false;
                if (((57344 & i) ^ 24576) <= 16384) {
                }
                if ((i & 24576) != 16384) {
                    z3 = false;
                    if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                        z4 = false;
                        rememberedValue = composer.rememberedValue();
                        if (!(changed | z | z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.DashedBorderKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.home.ui.DashedBorderKt.$r8$lambda$4zjpisYTIzB__k9meFuILaLdI5E(value, f, f2, f3, f4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        return drawBehind;
                    }
                    z4 = true;
                    rememberedValue = composer.rememberedValue();
                    if (!(changed | z | z2 | z3 | z4)) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.DashedBorderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.home.ui.DashedBorderKt.$r8$lambda$4zjpisYTIzB__k9meFuILaLdI5E(value, f, f2, f3, f4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                    androidx.compose.ui.Modifier drawBehind2 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    return drawBehind2;
                }
                z3 = true;
                if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                }
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                }
                z4 = true;
                rememberedValue = composer.rememberedValue();
                if (!(changed | z | z2 | z3 | z4)) {
                }
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.DashedBorderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.DashedBorderKt.$r8$lambda$4zjpisYTIzB__k9meFuILaLdI5E(value, f, f2, f3, f4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                androidx.compose.ui.Modifier drawBehind22 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                return drawBehind22;
            }
            z2 = true;
            if (((57344 & i) ^ 24576) <= 16384) {
            }
            if ((i & 24576) != 16384) {
            }
            z3 = true;
            if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
            }
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            }
            z4 = true;
            rememberedValue = composer.rememberedValue();
            if (!(changed | z | z2 | z3 | z4)) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.DashedBorderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.ui.DashedBorderKt.$r8$lambda$4zjpisYTIzB__k9meFuILaLdI5E(value, f, f2, f3, f4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
            androidx.compose.ui.Modifier drawBehind222 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return drawBehind222;
        }
        z = true;
        if (((i & 7168) ^ 3072) <= 2048) {
        }
        if ((i & 3072) != 2048) {
        }
        z2 = true;
        if (((57344 & i) ^ 24576) <= 16384) {
        }
        if ((i & 24576) != 16384) {
        }
        z3 = true;
        if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
        }
        z4 = true;
        rememberedValue = composer.rememberedValue();
        if (!(changed | z | z2 | z3 | z4)) {
        }
        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.DashedBorderKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.home.ui.DashedBorderKt.$r8$lambda$4zjpisYTIzB__k9meFuILaLdI5E(value, f, f2, f3, f4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        };
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.ui.Modifier drawBehind2222 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return drawBehind2222;
    }

    /* renamed from: drawDashedBorder-3IgeMak, reason: not valid java name */
    public static final void m14897drawDashedBorder3IgeMak(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, float f2, float f3, float f4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float f5 = f / 2.0f;
        androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f5) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f5) << 32)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)) - f, 0.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)) - f, 0.0f)) << 32)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), new androidx.compose.ui.graphics.drawscope.Stroke(f, 0.0f, 0, 0, androidx.compose.ui.graphics.PathEffect.INSTANCE.dashPathEffect(new float[]{f3, f4}, 0.0f), 14, null), 0.0f, null, 0, 224, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4zjpisYTIzB__k9meFuILaLdI5E(long j, float f, float f2, float f3, float f4, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        m14897drawDashedBorder3IgeMak(drawScope, j, drawScope.mo1418toPx0680j_4(f), drawScope.mo1418toPx0680j_4(f2), drawScope.mo1418toPx0680j_4(f3), drawScope.mo1418toPx0680j_4(f4));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GknbSS4CrxqIZIxlG91jDAa1L_A(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        setHasDashedBorder(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }
}
