package androidx.compose.material;

/* compiled from: TabRow.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "()V", "DividerOpacity", "", "DividerThickness", "Landroidx/compose/ui/unit/Dp;", "getDividerThickness-D9Ej5fM", "()F", "F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "height", "Indicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material/TabPosition;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    public static final androidx.compose.material.TabRowDefaults INSTANCE = new androidx.compose.material.TabRowDefaults();
    private static final float DividerThickness = androidx.compose.ui.unit.Dp.m4478constructorimpl(1);
    private static final float IndicatorHeight = androidx.compose.ui.unit.Dp.m4478constructorimpl(2);
    private static final float ScrollableTabRowPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(52);

    private TabRowDefaults() {
    }

    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1539Divider9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        long j2;
        androidx.compose.ui.Modifier.Companion companion;
        float f3;
        final long m2112copywmQWz5c$default;
        final float f4;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(910934799);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Divider)P(1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)366@16274L7,368@16353L66:TabRow.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    f3 = DividerThickness;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = startRestartGroup.consume(localContentColor);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    m2112copywmQWz5c$default = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(((androidx.compose.ui.graphics.Color) consume).m2123unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                    startRestartGroup.endDefaults();
                    androidx.compose.material.DividerKt.m1355DivideroMI9zvI(companion, m2112copywmQWz5c$default, f3, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
                    f4 = f3;
                    modifier2 = companion;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
                f3 = f2;
            }
            m2112copywmQWz5c$default = j2;
            startRestartGroup.endDefaults();
            androidx.compose.material.DividerKt.m1355DivideroMI9zvI(companion, m2112copywmQWz5c$default, f3, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
            f4 = f3;
            modifier2 = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
            f4 = f2;
            m2112copywmQWz5c$default = j2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                androidx.compose.material.TabRowDefaults.this.m1539Divider9IZ8Weo(modifier2, f4, m2112copywmQWz5c$default, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m1540Indicator9IZ8Weo(androidx.compose.ui.Modifier modifier, float f, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        float f2;
        long j2;
        androidx.compose.ui.Modifier.Companion companion;
        float f3;
        final float f4;
        final long j3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1499002201);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Indicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)383@16862L7,385@16886L142:TabRow.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                f3 = (i2 & 2) != 0 ? IndicatorHeight : f2;
                if ((i2 & 4) != 0) {
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = startRestartGroup.consume(localContentColor);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    j2 = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                f3 = f2;
            }
            startRestartGroup.endDefaults();
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f3), j2, null, 2, null), startRestartGroup, 0);
            f4 = f3;
            j3 = j2;
            modifier2 = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
            f4 = f2;
            j3 = j2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                androidx.compose.material.TabRowDefaults.this.m1540Indicator9IZ8Weo(modifier2, f4, j3, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m1541getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1542getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1543getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    public final androidx.compose.ui.Modifier tabIndicatorOffset(androidx.compose.ui.Modifier modifier, final androidx.compose.material.TabPosition currentTabPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(androidx.compose.material.TabPosition.this);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier composed, androidx.compose.runtime.Composer composer, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-398757863);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C408@17714L165,412@17911L164:TabRow.kt#jmzs0o");
                androidx.compose.runtime.State m118animateDpAsStateKz89ssw = androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(androidx.compose.material.TabPosition.this.getWidth(), androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4);
                androidx.compose.ui.Modifier m622width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.foundation.layout.OffsetKt.m529offsetVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getBottomStart(), false, 2, null), m1545invoke$lambda1(androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(androidx.compose.material.TabPosition.this.getLeft(), androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4)), 0.0f, 2, null), m1544invoke$lambda0(m118animateDpAsStateKz89ssw));
                composer.endReplaceableGroup();
                return m622width3ABfNKs;
            }

            /* renamed from: invoke$lambda-0, reason: not valid java name */
            private static final float m1544invoke$lambda0(androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state) {
                return state.getValue().m4492unboximpl();
            }

            /* renamed from: invoke$lambda-1, reason: not valid java name */
            private static final float m1545invoke$lambda1(androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state) {
                return state.getValue().m4492unboximpl();
            }
        });
    }
}
