package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MenuKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class p {

    public static final class a implements Function3<q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11181a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$a$a, reason: collision with other inner class name */
        public static final class C1567a implements Function3<RowScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f11182a;
            public final /* synthetic */ long b;
            public final /* synthetic */ TextStyle c;

            public C1567a(q qVar, long j, TextStyle textStyle) {
                this.f11182a = qVar;
                this.b = j;
                this.c = textStyle;
            }

            public final void a(RowScope TextButton, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(412998526, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous>.<anonymous> (CountdownButton.kt:87)");
                }
                TextKt.m1243TextfLXpl1I(((q.c) this.f11182a).a(), null, 0L, this.b, null, null, null, 0L, null, TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), 0L, 0, false, 1, null, this.c, composer, 0, 3072, 24054);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                a(rowScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public a(Function0<Unit> function0, boolean z, long j, long j2, long j3) {
            this.f11181a = function0;
            this.b = z;
            this.c = j;
            this.d = j2;
            this.e = j3;
        }

        public final void a(q buttonPart, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(buttonPart, "buttonPart");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(buttonPart) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052010049, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:59)");
            }
            TextStyle h6 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6();
            if (buttonPart instanceof q.a) {
                composer.startReplaceableGroup(1000266506);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof q.b) {
                composer.startReplaceableGroup(1000608622);
                q.b bVar = (q.b) buttonPart;
                u.a(bVar.e(), this.f11181a, null, this.b, bVar.c(), this.c, this.d, bVar.d(), bVar.b(), bVar.a(), composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof q.c) {
                composer.startReplaceableGroup(-1491723097);
                Function0<Unit> function0 = this.f11181a;
                boolean z = this.b;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long j = this.c;
                ButtonKt.TextButton(function0, null, z, null, null, null, null, buttonDefaults.m935textButtonColorsRGew2ao(0L, j, j, composer, ButtonDefaults.$stable << 9, 1), null, ComposableLambdaKt.composableLambda(composer, 412998526, true, new C1567a(buttonPart, this.e, h6)), composer, C.ENCODING_PCM_32BIT, 378);
                composer.endReplaceableGroup();
            } else {
                if (!(buttonPart instanceof q.d)) {
                    composer.startReplaceableGroup(-1491754012);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1001871283);
                q.d dVar = (q.d) buttonPart;
                long d = TextUnit.m4018equalsimpl0(dVar.d(), TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE()) ? this.e : dVar.d();
                z.a(dVar.h(), dVar.g(), dVar.c(), dVar.f(), dVar.b(), dVar.a(), DpKt.m3862DpSizeYgX7TsA(Dp.m3840constructorimpl(MenuKt.InTransitionDuration), Dp.m3840constructorimpl(20)), dVar.e(), dVar.i(), dVar.j(), d, this.f11181a, composer, 1572864, 0, 0);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(q qVar, Composer composer, Integer num) {
            a(qVar, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(q qVar, Modifier modifier, Function0 function0, boolean z, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, Function0 function02, int i, int i2, Composer composer, int i3) {
        a(qVar, modifier, function0, z, j, j2, j3, kVar, function02, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q countdownButtonPart, Modifier modifier, final Function0<Unit> onClick, final boolean z, long j, long j2, long j3, final com.moloco.sdk.internal.ortb.model.k kVar, final Function0<Unit> onTimerFinish, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        long j4;
        long j5;
        long b;
        long d;
        long j6;
        Modifier modifier2;
        int i6;
        long j7;
        Composer composer2;
        final Modifier modifier3;
        final long j8;
        q.a aVar;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(countdownButtonPart, "countdownButtonPart");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(1730954989);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(countdownButtonPart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(onClick) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                    i7 = 16384;
                    i3 |= i7;
                }
                i7 = 8192;
                i3 |= i7;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
                j4 = j3;
            } else {
                j4 = j3;
                if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changed(j4) ? 1048576 : 524288;
                }
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(kVar) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(onTimerFinish) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 16) == 0) {
                        j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m976getPrimary0d7_KjU();
                        i3 &= -57345;
                    } else {
                        j5 = j;
                    }
                    b = i4 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
                    d = i5 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j4;
                    j6 = j5;
                    modifier2 = modifier4;
                    i6 = i3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier2 = modifier;
                    j6 = j;
                    b = j2;
                    i6 = i3;
                    d = j4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1730954989, i6, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton (CountdownButton.kt:38)");
                }
                Modifier m462size6HolHcs = SizeKt.m462size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), b);
                Alignment topEnd = Alignment.INSTANCE.getTopEnd();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m462size6HolHcs);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
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
                startRestartGroup.startReplaceableGroup(523924163);
                if ((countdownButtonPart instanceof q.a) && kVar != null) {
                    aVar = (q.a) countdownButtonPart;
                    if (aVar.b()) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(kVar, aVar.c(), aVar.a(), onTimerFinish, startRestartGroup, ((i6 >> 21) & 14) | ((i6 >> 15) & 7168));
                    }
                }
                startRestartGroup.endReplaceableGroup();
                j7 = b;
                composer2 = startRestartGroup;
                CrossfadeKt.Crossfade(countdownButtonPart, modifier2, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2052010049, true, new a(onClick, z, j6, b, d)), composer2, (i6 & 14) | 3072 | (i6 & 112), 4);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                j8 = j6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j8 = j;
                j7 = j2;
                d = j4;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final long j9 = j7;
                final long j10 = d;
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p.a(q.this, modifier3, onClick, z, j8, j9, j10, kVar, onTimerFinish, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        j6 = j5;
        modifier2 = modifier4;
        i6 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m462size6HolHcs2 = SizeKt.m462size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), b);
        Alignment topEnd2 = Alignment.INSTANCE.getTopEnd();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topEnd2, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m462size6HolHcs2);
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
        startRestartGroup.startReplaceableGroup(523924163);
        if (countdownButtonPart instanceof q.a) {
            aVar = (q.a) countdownButtonPart;
            if (aVar.b()) {
            }
        }
        startRestartGroup.endReplaceableGroup();
        j7 = b;
        composer2 = startRestartGroup;
        CrossfadeKt.Crossfade(countdownButtonPart, modifier2, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2052010049, true, new a(onClick, z, j6, b, d)), composer2, (i6 & 14) | 3072 | (i6 & 112), 4);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        j8 = j6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
