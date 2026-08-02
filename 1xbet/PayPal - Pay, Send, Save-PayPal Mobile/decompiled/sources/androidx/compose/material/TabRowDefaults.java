package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001a\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u001c\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "<init>", "()V", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "height", "Indicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material/TabPosition;", "DividerOpacity", "", "DividerThickness", "getDividerThickness-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "material", "currentTabWidth", "indicatorOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    public static final androidx.compose.material.TabRowDefaults INSTANCE = new androidx.compose.material.TabRowDefaults();
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(52.0f);

    private TabRowDefaults() {
    }

    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m2791Divider9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        long j2;
        final androidx.compose.ui.Modifier.Companion companion;
        final float f3;
        final long j3;
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(910934799);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
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
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
                f3 = f2;
            } else {
                companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    f3 = getHighSpeedVideoFpsRanges;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    j2 = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(((androidx.compose.ui.graphics.Color) startRestartGroup.consume(androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            }
            long j4 = j2;
            int i7 = i3;
            j3 = j4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(910934799, i7, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:357)");
            }
            androidx.compose.material.DividerKt.m2600DivideroMI9zvI(companion, j3, f3, 0.0f, startRestartGroup, (i7 & 14) | ((i7 >> 3) & 112) | ((i7 << 3) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            f3 = f2;
            j3 = j2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.TabRowDefaults.$r8$lambda$_XZbp9l5SKNH4orp4xMSFpM4WyU(androidx.compose.material.TabRowDefaults.this, companion, f3, j3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m2792Indicator9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        long j2;
        final androidx.compose.ui.Modifier.Companion companion;
        final float f3;
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1499002201);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
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
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
                f3 = f2;
            } else {
                companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    f3 = getHighResolutionOutputSizeshNQ4ISI;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    j2 = ((androidx.compose.ui.graphics.Color) startRestartGroup.consume(androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl();
                    i3 &= -897;
                }
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1499002201, i3, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:374)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f3), j2, null, 2, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            f3 = f2;
        }
        final long j3 = j2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.TabRowDefaults.m2790$r8$lambda$5DsJdM7ZUzbP5GP0TcrVJUz0(androidx.compose.material.TabRowDefaults.this, companion, f3, j3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m2793getDividerThicknessD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2794getIndicatorHeightD9Ej5fM() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m2795getScrollableTabRowPaddingD9Ej5fM() {
        return Camera2StreamConfigurationMap;
    }

    public final androidx.compose.ui.Modifier tabIndicatorOffset(androidx.compose.ui.Modifier modifier, final androidx.compose.material.TabPosition tabPosition) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(androidx.compose.material.TabPosition.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material.TabRowDefaults.$r8$lambda$IKB9X1Z1mif4nhsExQqHou6nqBo(androidx.compose.material.TabPosition.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: $r8$lambda$5-DsJdM7-ZUzbP5GP0Tcr-VJUz0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2790$r8$lambda$5DsJdM7ZUzbP5GP0TcrVJUz0(androidx.compose.material.TabRowDefaults tabRowDefaults, androidx.compose.ui.Modifier modifier, float f, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        tabRowDefaults.m2792Indicator9IZ8Weo(modifier, f, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$IKB9X1Z1mif4nhsExQqHou6nqBo(androidx.compose.material.TabPosition tabPosition, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-398757863);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-398757863, i, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:393)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m1173animateDpAsStateAjpBEmI = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(tabPosition.getWidth(), androidx.compose.animation.core.AnimationSpecKt.tween$default(250, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m1173animateDpAsStateAjpBEmI2 = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(tabPosition.getLeft(), androidx.compose.animation.core.AnimationSpecKt.tween$default(250, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getBottomStart(), false, 2, null);
        boolean changed = composer.changed(m1173animateDpAsStateAjpBEmI2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.unit.IntOffset m8720boximpl;
                    androidx.compose.runtime.State state = androidx.compose.runtime.State.this;
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) obj;
                    m8720boximpl = androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(density.mo1412roundToPx0680j_4(((androidx.compose.ui.unit.Dp) state.getValue()).m8615unboximpl()) << 32));
                    return m8720boximpl;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(wrapContentSize$default, (kotlin.jvm.functions.Function1) rememberedValue), m1173animateDpAsStateAjpBEmI.getValue().m8615unboximpl());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1745width3ABfNKs;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_XZbp9l5SKNH4orp4xMSFpM4WyU(androidx.compose.material.TabRowDefaults tabRowDefaults, androidx.compose.ui.Modifier modifier, float f, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        tabRowDefaults.m2791Divider9IZ8Weo(modifier, f, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
