package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"DividerAlpha", "", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006c  */
    /* renamed from: Divider-oMI9zvI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1016DivideroMI9zvI(Modifier modifier, long j, float f, float f2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        final Modifier.Companion companion;
        final long m1627copywmQWz5c$default;
        Modifier.Companion m424paddingqDBjuR0$default;
        float f5;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1249392198);
        ComposerKt.sourceInformation(startRestartGroup, "C(Divider)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,2:c#ui.unit.Dp)45@1819L6,59@2200L147:Divider.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        m1627copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1627copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m975getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
                        if (i7 != 0) {
                            f3 = Dp.m3840constructorimpl(1);
                        }
                        if (i4 != 0) {
                            f4 = Dp.m3840constructorimpl(0);
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        m1627copywmQWz5c$default = j2;
                    }
                    startRestartGroup.endDefaults();
                    if (f4 != 0.0f) {
                        m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, f4, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        m424paddingqDBjuR0$default = Modifier.INSTANCE;
                    }
                    startRestartGroup.startReplaceableGroup(1228914189);
                    ComposerKt.sourceInformation(startRestartGroup, "*55@2139L7");
                    if (Dp.m3845equalsimpl0(f3, Dp.INSTANCE.m3858getHairlineD9Ej5fM())) {
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        f5 = Dp.m3840constructorimpl(1.0f / ((Density) consume).getDensity());
                    } else {
                        f5 = f3;
                    }
                    startRestartGroup.endReplaceableGroup();
                    BoxKt.Box(BackgroundKt.m173backgroundbw27NRU$default(SizeKt.m447height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(m424paddingqDBjuR0$default), 0.0f, 1, null), f5), m1627copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    m1627copywmQWz5c$default = j2;
                }
                final float f6 = f3;
                final float f7 = f4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        DividerKt.m1016DivideroMI9zvI(Modifier.this, m1627copywmQWz5c$default, f6, f7, composer2, i | 1, i2);
                    }
                });
                return;
            }
            f4 = f2;
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            if (f4 != 0.0f) {
            }
            startRestartGroup.startReplaceableGroup(1228914189);
            ComposerKt.sourceInformation(startRestartGroup, "*55@2139L7");
            if (Dp.m3845equalsimpl0(f3, Dp.INSTANCE.m3858getHairlineD9Ej5fM())) {
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m173backgroundbw27NRU$default(SizeKt.m447height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(m424paddingqDBjuR0$default), 0.0f, 1, null), f5), m1627copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
            final float f62 = f3;
            final float f72 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        if (f4 != 0.0f) {
        }
        startRestartGroup.startReplaceableGroup(1228914189);
        ComposerKt.sourceInformation(startRestartGroup, "*55@2139L7");
        if (Dp.m3845equalsimpl0(f3, Dp.INSTANCE.m3858getHairlineD9Ej5fM())) {
        }
        startRestartGroup.endReplaceableGroup();
        BoxKt.Box(BackgroundKt.m173backgroundbw27NRU$default(SizeKt.m447height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(m424paddingqDBjuR0$default), 0.0f, 1, null), f5), m1627copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
        final float f622 = f3;
        final float f722 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
