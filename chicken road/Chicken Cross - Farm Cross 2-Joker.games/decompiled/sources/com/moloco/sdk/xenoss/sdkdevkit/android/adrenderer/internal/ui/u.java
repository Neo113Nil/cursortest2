package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.widget.ImageViewCompat;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes7.dex */
public final class u {
    public static final Unit a(Painter painter, Function0 function0, Modifier modifier, boolean z, String str, long j, long j2, long j3, Shape shape, long j4, int i, int i2, Composer composer, int i3) {
        a(painter, function0, modifier, z, str, j, j2, j3, shape, j4, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Painter painter, final Function0<Unit> onClick, Modifier modifier, boolean z, String str, long j, long j2, long j3, Shape shape, long j4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        long j5;
        Modifier modifier3;
        boolean z3;
        String str2;
        long j6;
        long j7;
        int i9;
        long j8;
        long j9;
        Shape shape2;
        long j10;
        long j11;
        Object rememberedValue;
        Modifier modifier4;
        final boolean z4;
        final String str3;
        final long j12;
        final Shape shape3;
        final long j13;
        final long j14;
        final long j15;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-2002285559);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(j)) {
                            i11 = 131072;
                            i3 |= i11;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j3)) {
                            i10 = 8388608;
                            i3 |= i10;
                        }
                        i10 = 4194304;
                        i3 |= i10;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((100663296 & i) == 0) {
                        i3 |= startRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i8 = i2 & 512;
                        if (i8 != 0) {
                            i3 |= C.ENCODING_PCM_32BIT;
                            j5 = j4;
                        } else {
                            j5 = j4;
                            if ((i & C.ENCODING_PCM_32BIT) == 0) {
                                i3 |= startRestartGroup.changed(j5) ? 536870912 : 268435456;
                            }
                        }
                        if ((306783379 & i3) != 306783378 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            str3 = str;
                            shape3 = shape;
                            modifier4 = modifier2;
                            z4 = z2;
                            j12 = j5;
                            j13 = j;
                            j15 = j2;
                            j14 = j3;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                j10 = j2;
                                i9 = i3;
                                modifier3 = modifier2;
                                z3 = z2;
                                j8 = j5;
                                str2 = str;
                                j6 = j;
                                j9 = j3;
                                shape2 = shape;
                            } else {
                                modifier3 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                                z3 = i4 != 0 ? true : z2;
                                str2 = i5 != 0 ? null : str;
                                if ((i2 & 32) != 0) {
                                    j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m976getPrimary0d7_KjU();
                                    i3 &= -458753;
                                } else {
                                    j6 = j;
                                }
                                long b = i6 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                    j7 = b;
                                } else {
                                    j7 = j3;
                                }
                                Shape f = i7 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
                                if (i8 != 0) {
                                    i9 = i3;
                                    j8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e();
                                } else {
                                    i9 = i3;
                                    j8 = j5;
                                }
                                j9 = j7;
                                shape2 = f;
                                j10 = b;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                j11 = j6;
                                ComposerKt.traceEventStart(-2002285559, i9, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GenericIconButton (GenericIconButton.kt:54)");
                            } else {
                                j11 = j6;
                            }
                            Modifier m173backgroundbw27NRU$default = BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m462size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
                            Indication m1262rememberRipple9IZ8Weo = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                            startRestartGroup.startReplaceableGroup(-1646968890);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            Modifier m189clickableO2vRcR0 = ClickableKt.m189clickableO2vRcR0(m173backgroundbw27NRU$default, (MutableInteractionSource) rememberedValue, m1262rememberRipple9IZ8Weo, z3, str2, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            long j16 = j10;
                            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            modifier4 = modifier3;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m189clickableO2vRcR0);
                            Shape shape4 = shape2;
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
                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, companion.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            IconKt.m1073Iconww6aTOc(painter, str2, SizeKt.m462size6HolHcs(Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z3;
                            str3 = str2;
                            j12 = j8;
                            shape3 = shape4;
                            j13 = j11;
                            j14 = j9;
                            j15 = j16;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier4;
                            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return u.a(Painter.this, onClick, modifier5, z4, str3, j13, j15, j14, shape3, j12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i2 & 512;
                    if (i8 != 0) {
                    }
                    if ((306783379 & i3) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    j9 = j7;
                    shape2 = f;
                    j10 = b;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m173backgroundbw27NRU$default2 = BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m462size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
                    Indication m1262rememberRipple9IZ8Weo2 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                    startRestartGroup.startReplaceableGroup(-1646968890);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier m189clickableO2vRcR02 = ClickableKt.m189clickableO2vRcR0(m173backgroundbw27NRU$default2, (MutableInteractionSource) rememberedValue, m1262rememberRipple9IZ8Weo2, z3, str2, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    long j162 = j10;
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    modifier4 = modifier3;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m189clickableO2vRcR02);
                    Shape shape42 = shape2;
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                    Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m1073Iconww6aTOc(painter, str2, SizeKt.m462size6HolHcs(Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z3;
                    str3 = str2;
                    j12 = j8;
                    shape3 = shape42;
                    j13 = j11;
                    j14 = j9;
                    j15 = j162;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((196608 & i) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                }
                if ((306783379 & i3) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                j9 = j7;
                shape2 = f;
                j10 = b;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m173backgroundbw27NRU$default22 = BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m462size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
                Indication m1262rememberRipple9IZ8Weo22 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                startRestartGroup.startReplaceableGroup(-1646968890);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m189clickableO2vRcR022 = ClickableKt.m189clickableO2vRcR0(m173backgroundbw27NRU$default22, (MutableInteractionSource) rememberedValue, m1262rememberRipple9IZ8Weo22, z3, str2, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                long j1622 = j10;
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                modifier4 = modifier3;
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m189clickableO2vRcR022);
                Shape shape422 = shape2;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl22, density22, companion22.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                IconKt.m1073Iconww6aTOc(painter, str2, SizeKt.m462size6HolHcs(Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z3;
                str3 = str2;
                j12 = j8;
                shape3 = shape422;
                j13 = j11;
                j14 = j9;
                j15 = j1622;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i2 & 512;
            if (i8 != 0) {
            }
            if ((306783379 & i3) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            j9 = j7;
            shape2 = f;
            j10 = b;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m173backgroundbw27NRU$default222 = BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m462size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
            Indication m1262rememberRipple9IZ8Weo222 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
            startRestartGroup.startReplaceableGroup(-1646968890);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m189clickableO2vRcR0222 = ClickableKt.m189clickableO2vRcR0(m173backgroundbw27NRU$default222, (MutableInteractionSource) rememberedValue, m1262rememberRipple9IZ8Weo222, z3, str2, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            long j16222 = j10;
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
            modifier4 = modifier3;
            Function0<ComposeUiNode> constructor222 = companion222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m189clickableO2vRcR0222);
            Shape shape4222 = shape2;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl222 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl222, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl222, density222, companion222.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            IconKt.m1073Iconww6aTOc(painter, str2, SizeKt.m462size6HolHcs(Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            str3 = str2;
            j12 = j8;
            shape3 = shape4222;
            j13 = j11;
            j14 = j9;
            j15 = j16222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((196608 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i2 & 512;
        if (i8 != 0) {
        }
        if ((306783379 & i3) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        j9 = j7;
        shape2 = f;
        j10 = b;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m173backgroundbw27NRU$default2222 = BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m462size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
        Indication m1262rememberRipple9IZ8Weo2222 = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
        startRestartGroup.startReplaceableGroup(-1646968890);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Modifier m189clickableO2vRcR02222 = ClickableKt.m189clickableO2vRcR0(m173backgroundbw27NRU$default2222, (MutableInteractionSource) rememberedValue, m1262rememberRipple9IZ8Weo2222, z3, str2, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), onClick);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        long j162222 = j10;
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
        modifier4 = modifier3;
        Function0<ComposeUiNode> constructor2222 = companion2222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(m189clickableO2vRcR02222);
        Shape shape42222 = shape2;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl2222 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl2222, rememberBoxMeasurePolicy2222, companion2222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl2222, density2222, companion2222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl2222, layoutDirection2222, companion2222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl2222, viewConfiguration2222, companion2222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        IconKt.m1073Iconww6aTOc(painter, str2, SizeKt.m462size6HolHcs(Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z3;
        str3 = str2;
        j12 = j8;
        shape3 = shape42222;
        j13 = j11;
        j14 = j9;
        j15 = j162222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1484935213);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1484935213, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.Preview (GenericIconButton.kt:81)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, n.f11177a.a(), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ ImageView a(Context context, int i, int i2, int i3, int i4, boolean z, String str, Integer num, Function0 function0, int i5, Object obj) {
        int dimensionPixelSize = (i5 & 8) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size) : i3;
        return a(context, i, i2, dimensionPixelSize, (i5 & 16) != 0 ? dimensionPixelSize : i4, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? null : num, function0);
    }

    public static final ImageView a(Context context, int i, int i2, int i3, int i4, boolean z, String str, Integer num, final Function0<Unit> onClick) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        int coerceAtLeast = RangesKt.coerceAtLeast((i3 - i4) / 2, 0);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i3, i3));
        if (num != null) {
            drawable = a(context, num.intValue());
        } else {
            drawable = ContextCompat.getDrawable(context, R.drawable.moloco_icon_button_background);
        }
        imageView.setBackground(drawable);
        imageView.setPadding(coerceAtLeast, coerceAtLeast, coerceAtLeast, coerceAtLeast);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(i);
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(i2));
        imageView.setEnabled(z);
        imageView.setFocusable(true);
        imageView.setContentDescription(str);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.a(Function0.this, view);
            }
        });
        return imageView;
    }

    public static final void a(Function0 function0, View view) {
        function0.invoke();
    }

    public static final RippleDrawable a(Context context, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(a(context)), gradientDrawable, gradientDrawable2);
    }

    public static final int a(Context context) {
        int i;
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(android.R.attr.colorControlHighlight, typedValue, true) || (i = typedValue.data) == 0) ? ContextCompat.getColor(context, R.color.moloco_icon_button_ripple_fallback) : i;
    }
}
