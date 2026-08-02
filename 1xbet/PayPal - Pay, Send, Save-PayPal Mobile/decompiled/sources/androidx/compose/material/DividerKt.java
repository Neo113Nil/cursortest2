package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "DividerAlpha", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0065  */
    /* renamed from: Divider-oMI9zvI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2600DivideroMI9zvI(androidx.compose.ui.Modifier modifier, long j, float f, float f2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        androidx.compose.ui.Modifier.Companion companion;
        long j3;
        final float f5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float m8601constructorimpl;
        float f6;
        androidx.compose.ui.Modifier.Companion m1710paddingqDBjuR0$default;
        float f7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1249392198);
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
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        companion = modifier2;
                    } else {
                        companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            j2 = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2561getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -113;
                        }
                        if (i6 != 0) {
                            f3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f);
                        }
                        if (i4 != 0) {
                            m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                            f6 = f3;
                            long j4 = j2;
                            int i7 = i3;
                            j3 = j4;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1249392198, i7, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                            }
                            if (m8601constructorimpl == 0.0f) {
                                m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, m8601constructorimpl, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                m1710paddingqDBjuR0$default = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f6, androidx.compose.ui.unit.Dp.INSTANCE.m8619getHairlineD9Ej5fM())) {
                                startRestartGroup.startReplaceGroup(-455913241);
                                startRestartGroup.endReplaceGroup();
                                f7 = f6;
                            } else {
                                startRestartGroup.startReplaceGroup(-455979798);
                                f7 = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f / ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).getDensity());
                                startRestartGroup.endReplaceGroup();
                            }
                            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion.then(m1710paddingqDBjuR0$default), 0.0f, 1, null), f7), j3, null, 2, null), startRestartGroup, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            f3 = f6;
                            f5 = m8601constructorimpl;
                        }
                    }
                    f6 = f3;
                    m8601constructorimpl = f4;
                    long j42 = j2;
                    int i72 = i3;
                    j3 = j42;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (m8601constructorimpl == 0.0f) {
                    }
                    if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f6, androidx.compose.ui.unit.Dp.INSTANCE.m8619getHairlineD9Ej5fM())) {
                    }
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion.then(m1710paddingqDBjuR0$default), 0.0f, 1, null), f7), j3, null, 2, null), startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    f3 = f6;
                    f5 = m8601constructorimpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    j3 = j2;
                    f5 = f4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final long j5 = j3;
                    final float f8 = f3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.DividerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material.DividerKt.$r8$lambda$qn2ooAJgQtJWAynbiuQ_EgZT3Lw(androidx.compose.ui.Modifier.this, j5, f8, f5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qn2ooAJgQtJWAynbiuQ_EgZT3Lw(androidx.compose.ui.Modifier modifier, long j, float f, float f2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m2600DivideroMI9zvI(modifier, j, f, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
