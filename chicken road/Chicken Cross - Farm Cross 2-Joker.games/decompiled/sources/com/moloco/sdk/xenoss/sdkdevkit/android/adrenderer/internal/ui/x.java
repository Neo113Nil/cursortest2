package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes7.dex */
public final class x {
    public static final Unit a(float f, long j, long j2, int i, int i2, Composer composer, int i3) {
        a(f, j, j2, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(float f, int i, float f2, long j, long j2, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        a(f, i, f2, j, j2, i2, modifier, composer, i3 | 1, i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0296 A[LOOP:0: B:62:0x0202->B:66:0x0296, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a A[EDGE_INSN: B:67:0x029a->B:75:0x029a BREAK  A[LOOP:0: B:62:0x0202->B:66:0x0296], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, int i, float f2, long j, long j2, int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        float f3;
        int i8;
        long j3;
        int i9;
        int i10;
        int i11;
        long m1658getGray0d7_KjU;
        final long j4;
        final float f4;
        final int i12;
        final Modifier modifier2;
        float f5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-293854230);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = i;
            i5 |= startRestartGroup.changed(i6) ? 32 : 16;
            i7 = i4 & 4;
            if (i7 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                f3 = f2;
                i5 |= startRestartGroup.changed(f3) ? 256 : 128;
                i8 = i4 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    j3 = j;
                    i5 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    i9 = i4 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) != 599186 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        f5 = f;
                        m1658getGray0d7_KjU = j2;
                        i12 = i2;
                        f4 = f3;
                        j4 = j3;
                        modifier2 = modifier;
                    } else {
                        float f6 = i13 == 0 ? 4.8f : f;
                        if (i14 != 0) {
                            i6 = 5;
                        }
                        if (i7 != 0) {
                            f3 = Dp.m3840constructorimpl(12);
                        }
                        long m1665getWhite0d7_KjU = i8 == 0 ? Color.INSTANCE.m1665getWhite0d7_KjU() : j3;
                        m1658getGray0d7_KjU = i9 == 0 ? Color.INSTANCE.m1658getGray0d7_KjU() : j2;
                        int i15 = i10 == 0 ? 9 : i2;
                        Modifier modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-293854230, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RatingBar (RatingBar.kt:45)");
                        }
                        int floor = (int) Math.floor(f6);
                        int roundToInt = MathKt.roundToInt(10.0f * f6) - (floor * 10);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        int i16 = i15;
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier3);
                        Modifier modifier4 = modifier3;
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                        Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, companion.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(1767013527);
                        if (1 <= i6) {
                            int i17 = 1;
                            while (true) {
                                if (i17 <= floor) {
                                    startRestartGroup.startReplaceableGroup(-1057077637);
                                    IconKt.m1074Iconww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m461size3ABfNKs(Modifier.INSTANCE, f3), m1665getWhite0d7_KjU, startRestartGroup, (i5 & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                } else if (i17 == floor + 1 && 1 <= roundToInt && roundToInt < 10) {
                                    startRestartGroup.startReplaceableGroup(-1056685549);
                                    a(f3, m1665getWhite0d7_KjU, m1658getGray0d7_KjU, startRestartGroup, (i5 >> 6) & 1022, 0);
                                    startRestartGroup.endReplaceableGroup();
                                } else {
                                    startRestartGroup.startReplaceableGroup(-1056438386);
                                    IconKt.m1074Iconww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m461size3ABfNKs(Modifier.INSTANCE, f3), m1658getGray0d7_KjU, startRestartGroup, ((i5 >> 3) & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                    if (i17 != i6) {
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                if (i17 != i6) {
                                }
                            }
                        }
                        startRestartGroup.endReplaceableGroup();
                        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(Modifier.INSTANCE, Dp.m3840constructorimpl(4)), startRestartGroup, 6);
                        TextKt.m1243TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1665getWhite0d7_KjU(), TextUnitKt.getSp(i16), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = m1665getWhite0d7_KjU;
                        f4 = f3;
                        i12 = i16;
                        modifier2 = modifier4;
                        f5 = f6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f7 = f5;
                        final int i18 = i6;
                        final long j5 = m1658getGray0d7_KjU;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x.a(f7, i18, f4, j4, j5, i12, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                j3 = j;
                i9 = i4 & 16;
                if (i9 == 0) {
                }
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) != 599186) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int floor2 = (int) Math.floor(f6);
                int roundToInt2 = MathKt.roundToInt(10.0f * f6) - (floor2 * 10);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                int i162 = i15;
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(modifier3);
                Modifier modifier42 = modifier3;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1767013527);
                if (1 <= i6) {
                }
                startRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(Modifier.INSTANCE, Dp.m3840constructorimpl(4)), startRestartGroup, 6);
                TextKt.m1243TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1665getWhite0d7_KjU(), TextUnitKt.getSp(i162), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                j4 = m1665getWhite0d7_KjU;
                f4 = f3;
                i12 = i162;
                modifier2 = modifier42;
                f5 = f6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            i8 = i4 & 8;
            if (i8 != 0) {
            }
            j3 = j;
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) != 599186) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int floor22 = (int) Math.floor(f6);
            int roundToInt22 = MathKt.roundToInt(10.0f * f6) - (floor22 * 10);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
            int i1622 = i15;
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(modifier3);
            Modifier modifier422 = modifier3;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl22, rowMeasurePolicy22, companion22.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl22, density22, companion22.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1767013527);
            if (1 <= i6) {
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m466width3ABfNKs(Modifier.INSTANCE, Dp.m3840constructorimpl(4)), startRestartGroup, 6);
            TextKt.m1243TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1665getWhite0d7_KjU(), TextUnitKt.getSp(i1622), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = m1665getWhite0d7_KjU;
            f4 = f3;
            i12 = i1622;
            modifier2 = modifier422;
            f5 = f6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i;
        i7 = i4 & 4;
        if (i7 == 0) {
        }
        f3 = f2;
        i8 = i4 & 8;
        if (i8 != 0) {
        }
        j3 = j;
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) != 599186) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int floor222 = (int) Math.floor(f6);
        int roundToInt222 = MathKt.roundToInt(10.0f * f6) - (floor222 * 10);
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor222 = companion222.getConstructor();
        int i16222 = i15;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(modifier3);
        Modifier modifier4222 = modifier3;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl222 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl222, rowMeasurePolicy222, companion222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl222, density222, companion222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1767013527);
        if (1 <= i6) {
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m466width3ABfNKs(Modifier.INSTANCE, Dp.m3840constructorimpl(4)), startRestartGroup, 6);
        TextKt.m1243TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1665getWhite0d7_KjU(), TextUnitKt.getSp(i16222), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = m1665getWhite0d7_KjU;
        f4 = f3;
        i12 = i16222;
        modifier2 = modifier4222;
        f5 = f6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, long j, long j2, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        long j3;
        int i4;
        long j4;
        float m3840constructorimpl;
        long j5;
        Object rememberedValue;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2016551008);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j3 = j;
            i3 |= startRestartGroup.changed(j3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                j4 = j2;
                i3 |= startRestartGroup.changed(j4) ? 256 : 128;
                if ((i3 & 147) != 146 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    m3840constructorimpl = f2;
                    j5 = j3;
                    j6 = j4;
                } else {
                    m3840constructorimpl = i5 != 0 ? Dp.m3840constructorimpl(12) : f2;
                    if (i6 != 0) {
                        j3 = Color.INSTANCE.m1665getWhite0d7_KjU();
                    }
                    j5 = j3;
                    long m1658getGray0d7_KjU = i4 != 0 ? Color.INSTANCE.m1658getGray0d7_KjU() : j4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2016551008, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HalfStar (RatingBar.kt:95)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier m461size3ABfNKs = SizeKt.m461size3ABfNKs(companion, m3840constructorimpl);
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m461size3ABfNKs);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, companion2.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Icons icons = Icons.INSTANCE;
                    IconKt.m1074Iconww6aTOc(StarKt.getStar(icons.getDefault()), (String) null, boxScopeInstance.matchParentSize(companion), m1658getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
                    ImageVector star = StarKt.getStar(icons.getDefault());
                    Modifier matchParentSize = boxScopeInstance.matchParentSize(companion);
                    startRestartGroup.startReplaceableGroup(-1749569609);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return x.a((ContentDrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    IconKt.m1074Iconww6aTOc(star, (String) null, DrawModifierKt.drawWithContent(matchParentSize, (Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = m1658getGray0d7_KjU;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final float f3 = m3840constructorimpl;
                    final long j7 = j5;
                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x.a(f3, j7, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            j4 = j2;
            if ((i3 & 147) != 146) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            j5 = j3;
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier m461size3ABfNKs2 = SizeKt.m461size3ABfNKs(companion3, m3840constructorimpl);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m461size3ABfNKs2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl2, density2, companion22.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Icons icons2 = Icons.INSTANCE;
            IconKt.m1074Iconww6aTOc(StarKt.getStar(icons2.getDefault()), (String) null, boxScopeInstance2.matchParentSize(companion3), m1658getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
            ImageVector star2 = StarKt.getStar(icons2.getDefault());
            Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(companion3);
            startRestartGroup.startReplaceableGroup(-1749569609);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m1074Iconww6aTOc(star2, (String) null, DrawModifierKt.drawWithContent(matchParentSize2, (Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            j6 = m1658getGray0d7_KjU;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j3 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j4 = j2;
        if ((i3 & 147) != 146) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        j5 = j3;
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier.Companion companion32 = Modifier.INSTANCE;
        Modifier m461size3ABfNKs22 = SizeKt.m461size3ABfNKs(companion32, m3840constructorimpl);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m461size3ABfNKs22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl22, density22, companion222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Icons icons22 = Icons.INSTANCE;
        IconKt.m1074Iconww6aTOc(StarKt.getStar(icons22.getDefault()), (String) null, boxScopeInstance22.matchParentSize(companion32), m1658getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
        ImageVector star22 = StarKt.getStar(icons22.getDefault());
        Modifier matchParentSize22 = boxScopeInstance22.matchParentSize(companion32);
        startRestartGroup.startReplaceableGroup(-1749569609);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        IconKt.m1074Iconww6aTOc(star22, (String) null, DrawModifierKt.drawWithContent(matchParentSize22, (Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        j6 = m1658getGray0d7_KjU;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final Unit a(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m1461getWidthimpl = Size.m1461getWidthimpl(drawWithContent.mo2122getSizeNHjbRc()) / 2.0f;
        float m1458getHeightimpl = Size.m1458getHeightimpl(drawWithContent.mo2122getSizeNHjbRc());
        int m1617getIntersectrtfAjoo = ClipOp.INSTANCE.m1617getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo2047getSizeNHjbRc = drawContext.mo2047getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2050clipRectN_I0leg(0.0f, 0.0f, m1461getWidthimpl, m1458getHeightimpl, m1617getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo2048setSizeuvyYCjk(mo2047getSizeNHjbRc);
        return Unit.INSTANCE;
    }
}
