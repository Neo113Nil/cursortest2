package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.R;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class z {

    public static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f11207a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ long i;
        public final /* synthetic */ Painter j;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z$a$a, reason: collision with other inner class name */
        public static final class C1573a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f11208a;
            public final /* synthetic */ Painter b;
            public final /* synthetic */ String c;
            public final /* synthetic */ long d;

            public C1573a(long j, Painter painter, String str, long j2) {
                this.f11208a = j;
                this.b = painter;
                this.c = str;
                this.d = j2;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(367056260, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:75)");
                }
                IconKt.m1073Iconww6aTOc(this.b, this.c, SizeKt.m462size6HolHcs(Modifier.INSTANCE, this.f11208a), this.d, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f11209a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            public b(String str, long j, long j2) {
                this.f11209a = str;
                this.b = j;
                this.c = j2;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-618324232, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:67)");
                }
                TextKt.m1243TextfLXpl1I(this.f11209a, OffsetKt.m409offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3840constructorimpl(-1), 1, null), this.b, this.c, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 48, 0, 65520);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public a(float f, String str, Function0<Unit> function0, boolean z, boolean z2, String str2, long j, long j2, long j3, Painter painter) {
            this.f11207a = f;
            this.b = str;
            this.c = function0;
            this.d = z;
            this.e = z2;
            this.f = str2;
            this.g = j;
            this.h = j2;
            this.i = j3;
            this.j = painter;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1541935208, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous> (TextIconButton.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier m421paddingVpY3zN4 = PaddingKt.m421paddingVpY3zN4(SizeKt.m449heightInVpY3zN4$default(companion, this.f11207a, 0.0f, 2, null), Dp.m3840constructorimpl(10), Dp.m3840constructorimpl(6));
            Indication m1262rememberRipple9IZ8Weo = RippleKt.m1262rememberRipple9IZ8Weo(true, 0.0f, 0L, composer, 6, 6);
            composer.startReplaceableGroup(1151230561);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier m190clickableO2vRcR0$default = ClickableKt.m190clickableO2vRcR0$default(m421paddingVpY3zN4, (MutableInteractionSource) rememberedValue, m1262rememberRipple9IZ8Weo, false, this.b, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), this.c, 4, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            boolean z = this.d;
            boolean z2 = this.e;
            String str = this.f;
            long j = this.g;
            long j2 = this.h;
            long j3 = this.i;
            Painter painter = this.j;
            String str2 = this.b;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m190clickableO2vRcR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer);
            Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, companion2.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -618324232, true, new b(str, j, j2));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, 367056260, true, new C1573a(j3, painter, str2, j));
            if (z) {
                composer.startReplaceableGroup(774006835);
                composableLambda.invoke(composer, 6);
                if (z2) {
                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion, Dp.m3840constructorimpl(4)), composer, 6);
                    composableLambda2.invoke(composer, 6);
                }
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(774193331);
                composer.startReplaceableGroup(717711159);
                if (z2) {
                    composableLambda2.invoke(composer, 6);
                    SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion, Dp.m3840constructorimpl(4)), composer, 6);
                }
                composer.endReplaceableGroup();
                composableLambda.invoke(composer, 6);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, Painter painter, String str2, long j, Shape shape, long j2, long j3, long j4, boolean z, boolean z2, long j5, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        a(str, painter, str2, j, shape, j2, j3, j4, z, z2, j5, function0, composer, i | 1, i2, i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String text, Painter painter, final String str, final long j, final Shape backgroundShape, final long j2, final long j3, final long j4, boolean z, boolean z2, long j5, final Function0<Unit> onClick, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        Painter painter2;
        long j6;
        boolean z4;
        boolean z5;
        int i10;
        Painter painter3;
        Composer composer2;
        final Painter painter4;
        final boolean z6;
        final boolean z7;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-2051575724);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0 && startRestartGroup.changed(painter)) {
                i11 = 32;
                i4 |= i11;
            }
            i11 = 16;
            i4 |= i11;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(backgroundShape) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 = i4 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                i5 = i4;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                }
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i5 |= startRestartGroup.changed(j3) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i5 |= startRestartGroup.changed(j4) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i5 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i5 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i5 |= C.ENCODING_PCM_32BIT;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & C.ENCODING_PCM_32BIT) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? 536870912 : 268435456;
                }
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
                i9 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i9 = i2 | (startRestartGroup.changed(j5) ? 4 : 2);
            } else {
                i9 = i2;
            }
            if ((i3 & 2048) == 0) {
                i9 |= 48;
            } else if ((i2 & 48) == 0) {
                i9 |= startRestartGroup.changed(onClick) ? 32 : 16;
            }
            if ((i5 & 306783379) != 306783378 && (i9 & 19) == 18 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                painter4 = painter;
                z6 = z;
                j7 = j5;
                z7 = z3;
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i3 & 2) == 0) {
                        painter2 = PainterResources_androidKt.painterResource(R.drawable.double_arrow_24, startRestartGroup, 0);
                        i5 &= -113;
                    } else {
                        painter2 = painter;
                    }
                    boolean z8 = i6 == 0 ? true : z;
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if (i8 == 0) {
                        z4 = z8;
                        j6 = TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE();
                    } else {
                        j6 = j5;
                        z4 = z8;
                    }
                    z5 = z3;
                    i10 = i5;
                    painter3 = painter2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    z4 = z;
                    j6 = j5;
                    z5 = z3;
                    i10 = i5;
                    painter3 = painter;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2051575724, i10, i9, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton (TextIconButton.kt:48)");
                }
                composer2 = startRestartGroup;
                int i12 = i10 >> 9;
                SurfaceKt.m1172SurfaceFjzlyU(null, backgroundShape, j2, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1541935208, true, new a(((Dp) ComparisonsKt.maxOf(Dp.m3838boximpl(DpSize.m3936getHeightD9Ej5fM(j3)), Dp.m3838boximpl(DpSize.m3936getHeightD9Ej5fM(j)))).m3854unboximpl(), str, onClick, z4, z5, text, j4, j6, j, painter3)), composer2, (i12 & 112) | 1572864 | (i12 & 896), 57);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                painter4 = painter3;
                z6 = z4;
                z7 = z5;
                j7 = j6;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z.a(text, painter4, str, j, backgroundShape, j2, j3, j4, z6, z7, j7, onClick, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i3 & 2) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        z5 = z3;
        i10 = i5;
        painter3 = painter2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        int i122 = i10 >> 9;
        SurfaceKt.m1172SurfaceFjzlyU(null, backgroundShape, j2, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1541935208, true, new a(((Dp) ComparisonsKt.maxOf(Dp.m3838boximpl(DpSize.m3936getHeightD9Ej5fM(j3)), Dp.m3838boximpl(DpSize.m3936getHeightD9Ej5fM(j)))).m3854unboximpl(), str, onClick, z4, z5, text, j4, j6, j, painter3)), composer2, (i122 & 112) | 1572864 | (i122 & 896), 57);
        if (ComposerKt.isTraceInProgress()) {
        }
        painter4 = painter3;
        z6 = z4;
        z7 = z5;
        j7 = j6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-863217207);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-863217207, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButtonPreview (TextIconButton.kt:105)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, o.f11179a.a(), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
