package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a-\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"HorizontalDivider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "HorizontalDivider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "VerticalDivider", "VerticalDivider-9IZ8Weo", "Divider", "Divider-9IZ8Weo", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005e  */
    /* renamed from: HorizontalDivider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3246HorizontalDivider9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        final long j2;
        androidx.compose.ui.Modifier.Companion companion;
        final float f3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                f3 = f2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    f3 = i5 != 0 ? androidx.compose.material3.DividerDefaults.INSTANCE.m3240getThicknessD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = androidx.compose.material3.DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                    f3 = f2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(75144485, i3, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
                }
                androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f3);
                boolean z2 = (i3 & 112) == 32;
                if ((((i3 & 896) ^ 384) <= 256 || !startRestartGroup.changed(j2)) && (i3 & 384) != 256) {
                    z = false;
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DividerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DividerKt.m3243$r8$lambda$LkVW6RvqLmftafWUCh7IWonmVI(f3, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.CanvasKt.Canvas(m1726height3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final float f4 = f3;
                final long j3 = j2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DividerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.DividerKt.$r8$lambda$FWJaz3V1hNdSuHhSqhYQlWuGp4Q(androidx.compose.ui.Modifier.this, f4, j3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        boolean z3 = true;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005e  */
    /* renamed from: VerticalDivider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3247VerticalDivider9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        final long j2;
        androidx.compose.ui.Modifier.Companion companion;
        final float f3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1534852205);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                f3 = f2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    f3 = i5 != 0 ? androidx.compose.material3.DividerDefaults.INSTANCE.m3240getThicknessD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = androidx.compose.material3.DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                    f3 = f2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1534852205, i3, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
                }
                androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), f3);
                boolean z2 = (i3 & 112) == 32;
                if ((((i3 & 896) ^ 384) <= 256 || !startRestartGroup.changed(j2)) && (i3 & 384) != 256) {
                    z = false;
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DividerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DividerKt.m3242$r8$lambda$IxIf1j5CSMJztpcGwi0As8DvxU(f3, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.CanvasKt.Canvas(m1745width3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final float f4 = f3;
                final long j3 = j2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DividerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.DividerKt.m3241$r8$lambda$5ZBpFtkebeFjev6F5TochhUMgs(androidx.compose.ui.Modifier.this, f4, j3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        boolean z3 = true;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    @kotlin.Deprecated(message = "Renamed to HorizontalDivider", replaceWith = @kotlin.ReplaceWith(expression = "HorizontalDivider(modifier, thickness, color)", imports = {}))
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3245Divider9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        long j2;
        androidx.compose.ui.Modifier.Companion companion;
        float f3;
        long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float f4;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1562471785);
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
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                    f3 = f2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    f3 = i6 != 0 ? androidx.compose.material3.DividerDefaults.INSTANCE.m3240getThicknessD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j3 = androidx.compose.material3.DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1562471785, i3, -1, "androidx.compose.material3.Divider (Divider.kt:99)");
                        }
                        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f3, androidx.compose.ui.unit.Dp.INSTANCE.m8619getHairlineD9Ej5fM())) {
                            startRestartGroup.startReplaceGroup(-1258183496);
                            startRestartGroup.endReplaceGroup();
                            f4 = f3;
                        } else {
                            startRestartGroup.startReplaceGroup(-1258250053);
                            f4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f / ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).getDensity());
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f4), j3, null, 2, null), startRestartGroup, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }
                j3 = j2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f3, androidx.compose.ui.unit.Dp.INSTANCE.m8619getHairlineD9Ej5fM())) {
                }
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f4), j3, null, 2, null), startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                f3 = f2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final float f5 = f3;
                final long j4 = j3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DividerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.DividerKt.m3244$r8$lambda$xvKwHj3zieWfs6NERUTQwcR1hg(androidx.compose.ui.Modifier.this, f5, j4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$5ZBpFtkebeFj-ev6F5TochhUMgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3241$r8$lambda$5ZBpFtkebeFjev6F5TochhUMgs(androidx.compose.ui.Modifier modifier, float f, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3247VerticalDivider9IZ8Weo(modifier, f, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FWJaz3V1hNdSuHhSqhYQlWuGp4Q(androidx.compose.ui.Modifier modifier, float f, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3246HorizontalDivider9IZ8Weo(modifier, f, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IxIf-1j5CSMJztpcGwi0As8DvxU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3242$r8$lambda$IxIf1j5CSMJztpcGwi0As8DvxU(float f, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float f2 = drawScope.mo1418toPx0680j_4(f);
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(drawScope.mo1418toPx0680j_4(f) / 2.0f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
        float f3 = drawScope.mo1418toPx0680j_4(f) / 2.0f;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, m5744constructorimpl, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), f2, 0, null, 0.0f, null, 0, 496, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LkVW6RvqLm-ftafWUCh7IWonmVI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3243$r8$lambda$LkVW6RvqLmftafWUCh7IWonmVI(float f, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float f2 = drawScope.mo1418toPx0680j_4(f);
        float f3 = drawScope.mo1418toPx0680j_4(f) / 2.0f;
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L));
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        float f4 = drawScope.mo1418toPx0680j_4(f) / 2.0f;
        androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, m5744constructorimpl, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), f2, 0, null, 0.0f, null, 0, 496, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xvKwHj3zieWf-s6NERUTQwcR1hg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3244$r8$lambda$xvKwHj3zieWfs6NERUTQwcR1hg(androidx.compose.ui.Modifier modifier, float f, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3245Divider9IZ8Weo(modifier, f, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
