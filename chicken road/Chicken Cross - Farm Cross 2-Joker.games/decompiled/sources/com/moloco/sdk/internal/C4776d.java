package com.moloco.sdk.internal;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.ortb.model.C4778a;
import com.moloco.sdk.internal.ortb.model.C4779b;
import com.moloco.sdk.internal.ortb.model.C4780c;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.internal.ortb.model.G;
import com.moloco.sdk.internal.ortb.model.H;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.moloco.sdk.internal.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4776d {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f10450a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4776d.b();
        }
    });
    public static final long b = Color.INSTANCE.m1665getWhite0d7_KjU();
    public static final long c = v.a();
    public static final int d = 30;
    public static final long e;
    public static final float f = 0.6f;

    /* renamed from: com.moloco.sdk.internal.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10451a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.moloco.sdk.internal.ortb.model.w.values().length];
            try {
                iArr[com.moloco.sdk.internal.ortb.model.w.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.w.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.w.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.w.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.w.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10451a = iArr;
            int[] iArr2 = new int[H.values().length];
            try {
                iArr2[H.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[H.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[H.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$b */
    public static final class b implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f10452a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.x b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public b(F f, com.moloco.sdk.internal.ortb.model.x xVar, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f10452a = f;
            this.b = xVar;
            this.c = kVar;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Color foregroundColor;
            composer.startReplaceableGroup(-1625076729);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1625076729, i, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:256)");
            }
            float m3840constructorimpl = Dp.m3840constructorimpl(this.f10452a.getControlSize());
            long m3862DpSizeYgX7TsA = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
            com.moloco.sdk.internal.ortb.model.x xVar = this.b;
            long foregroundColor2 = (xVar == null || (foregroundColor = xVar.getForegroundColor()) == null) ? this.f10452a.getForegroundColor() : foregroundColor.m1638unboximpl();
            Alignment a2 = C4776d.a(this.f10452a.getHorizontalAlignment(), this.f10452a.getVerticalAlignment());
            PaddingValues m413PaddingValues0680j_4 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(this.f10452a.getPadding()));
            long sp = TextUnitKt.getSp(this.f10452a.getControlSize());
            TextUnitKt.m4034checkArithmeticR2X_6o(sp);
            long pack = TextUnitKt.pack(TextUnit.m4019getRawTypeimpl(sp), TextUnit.m4021getValueimpl(sp) / 2);
            long m3943timesGh9hcWk = DpSize.m3943timesGh9hcWk(m3862DpSizeYgX7TsA, 0.4f);
            Color backgroundColor = this.f10452a.getBackgroundColor();
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(a2, m413PaddingValues0680j_4, foregroundColor2, m3862DpSizeYgX7TsA, pack, C4776d.b(m3943timesGh9hcWk, backgroundColor != null ? backgroundColor.m1638unboximpl() : C4776d.b, foregroundColor2, this.b, composer, 0), null, this.c, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$c */
    public static final class c implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10453a;
        public final /* synthetic */ F b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public c(boolean z, F f, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f10453a = z;
            this.b = f;
            this.c = kVar;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2;
            composer.startReplaceableGroup(1846302992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846302992, i, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:277)");
            }
            if (this.f10453a) {
                a2 = null;
            } else {
                float m3840constructorimpl = Dp.m3840constructorimpl(this.b.getControlSize());
                long m3862DpSizeYgX7TsA = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
                Alignment a3 = C4776d.a(this.b.getHorizontalAlignment(), this.b.getVerticalAlignment());
                PaddingValues m413PaddingValues0680j_4 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(this.b.getPadding()));
                long foregroundColor = this.b.getForegroundColor();
                long sp = TextUnitKt.getSp(this.b.getControlSize());
                TextUnitKt.m4034checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m4019getRawTypeimpl(sp), TextUnit.m4021getValueimpl(sp) / 2);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.moloco_close, composer, 0);
                long m3943timesGh9hcWk = DpSize.m3943timesGh9hcWk(m3862DpSizeYgX7TsA, 0.45f);
                Color backgroundColor = this.b.getBackgroundColor();
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(a3, m413PaddingValues0680j_4, foregroundColor, m3862DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(painterResource, m3943timesGh9hcWk, null, backgroundColor != null ? backgroundColor.m1638unboximpl() : C4776d.b, composer, 0, 4), null, this.c, composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$d, reason: collision with other inner class name */
    public static final class C1470d implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B f10454a;

        public C1470d(com.moloco.sdk.internal.ortb.model.B b) {
            this.f10454a = b;
        }

        public final Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            long j;
            composer.startReplaceableGroup(1941247592);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1941247592, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:98)");
            }
            if (this.f10454a.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getControlSize() != null) {
                float m3840constructorimpl = Dp.m3840constructorimpl(r1.getData());
                j = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
            } else {
                j = C4776d.e;
            }
            Alignment a2 = C4776d.a(this.f10454a.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getHorizontalAlignment(), this.f10454a.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getVerticalAlignment());
            PaddingValues m413PaddingValues0680j_4 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(this.f10454a.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getPadding()));
            long m3943timesGh9hcWk = DpSize.m3943timesGh9hcWk(j, 0.6f);
            long foregroundColor = this.f10454a.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getForegroundColor();
            Color backgroundColor = this.f10454a.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getBackgroundColor();
            Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(j, m3943timesGh9hcWk, null, backgroundColor != null ? backgroundColor.m1638unboximpl() : C4776d.b, a2, m413PaddingValues0680j_4, foregroundColor, PainterResources_androidKt.painterResource(R.drawable.moloco_volume_off, composer, 0), PainterResources_androidKt.painterResource(R.drawable.moloco_volume_on, composer, 0), null, composer, 0, 516);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$e */
    public static final class e implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B f10455a;

        public e(com.moloco.sdk.internal.ortb.model.B b) {
            this.f10455a = b;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2;
            Color foregroundColor;
            composer.startReplaceableGroup(1588309742);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1588309742, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:113)");
            }
            F skip = this.f10455a.getSkip();
            if (skip == null) {
                a2 = null;
            } else {
                com.moloco.sdk.internal.ortb.model.B b = this.f10455a;
                float m3840constructorimpl = Dp.m3840constructorimpl(skip.getControlSize());
                long m3862DpSizeYgX7TsA = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
                com.moloco.sdk.internal.ortb.model.x inlineTextButton = b.getInlineTextButton();
                long foregroundColor2 = (inlineTextButton == null || (foregroundColor = inlineTextButton.getForegroundColor()) == null) ? skip.getForegroundColor() : foregroundColor.m1638unboximpl();
                Alignment a3 = C4776d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues m413PaddingValues0680j_4 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(skip.getPadding()));
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m4034checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m4019getRawTypeimpl(sp), TextUnit.m4021getValueimpl(sp) / 2);
                long m3943timesGh9hcWk = DpSize.m3943timesGh9hcWk(m3862DpSizeYgX7TsA, 0.4f);
                Color backgroundColor = skip.getBackgroundColor();
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(a3, m413PaddingValues0680j_4, foregroundColor2, m3862DpSizeYgX7TsA, pack, C4776d.b(m3943timesGh9hcWk, backgroundColor != null ? backgroundColor.m1638unboximpl() : C4776d.b, foregroundColor2, b.getInlineTextButton(), composer, 0), null, b.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$f */
    public static final class f implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B f10456a;

        public f(com.moloco.sdk.internal.ortb.model.B b) {
            this.f10456a = b;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2;
            composer.startReplaceableGroup(884446767);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(884446767, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:134)");
            }
            F skip = this.f10456a.getSkip();
            if (skip == null) {
                a2 = null;
            } else {
                com.moloco.sdk.internal.ortb.model.B b = this.f10456a;
                float m3840constructorimpl = Dp.m3840constructorimpl(skip.getControlSize());
                long m3862DpSizeYgX7TsA = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
                Alignment a3 = C4776d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues m413PaddingValues0680j_4 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(skip.getPadding()));
                long foregroundColor = skip.getForegroundColor();
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m4034checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m4019getRawTypeimpl(sp), TextUnit.m4021getValueimpl(sp) / 2);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.moloco_skip, composer, 0);
                long m3943timesGh9hcWk = DpSize.m3943timesGh9hcWk(m3862DpSizeYgX7TsA, 0.4f);
                Color backgroundColor = skip.getBackgroundColor();
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(a3, m413PaddingValues0680j_4, foregroundColor, m3862DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(painterResource, m3943timesGh9hcWk, null, backgroundColor != null ? backgroundColor.m1638unboximpl() : C4776d.b, composer, 0, 4), null, b.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$g */
    public static final class g implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10457a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B b;

        public g(boolean z, com.moloco.sdk.internal.ortb.model.B b) {
            this.f10457a = z;
            this.b = b;
        }

        public final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> function7;
            com.moloco.sdk.internal.ortb.model.i cta;
            composer.startReplaceableGroup(-874204308);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-874204308, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:152)");
            }
            if (this.f10457a || (cta = this.b.getCta()) == null) {
                function7 = null;
            } else {
                Alignment a2 = C4776d.a(cta.getHorizontalAlignment(), cta.getVerticalAlignment());
                PaddingValues m413PaddingValues0680j_4 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(cta.getPadding()));
                String text = cta.getText();
                long foregroundColor = cta.getForegroundColor();
                Color backgroundColor = cta.getBackgroundColor();
                function7 = v.a(a2, m413PaddingValues0680j_4, text, foregroundColor, backgroundColor != null ? backgroundColor.m1638unboximpl() : v.a(), cta.getImageUrl(), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$h */
    public static final class h implements Function2<Composer, Integer, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B f10458a;

        public h(com.moloco.sdk.internal.ortb.model.B b) {
            this.f10458a = b;
        }

        public final Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(1485642988);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485642988, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:170)");
            }
            com.moloco.sdk.internal.ortb.model.C progressBar = this.f10458a.getProgressBar();
            Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a2 = progressBar == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(C4776d.a(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment()), PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(progressBar.getPadding())), progressBar.getForegroundColor(), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$i */
    public static final class i implements Function2<Composer, Integer, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.B f10459a;

        public i(com.moloco.sdk.internal.ortb.model.B b) {
            this.f10459a = b;
        }

        public final Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(1045477038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1045477038, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:179)");
            }
            G vastPrivacyIcon = this.f10459a.getVastPrivacyIcon();
            composer.startReplaceableGroup(-1135677423);
            Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a2 = vastPrivacyIcon == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(C4776d.a(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment()), PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(vastPrivacyIcon.getPadding())), composer, 0, 0);
            composer.endReplaceableGroup();
            if (a2 == null) {
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(null, null, composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$j */
    public /* synthetic */ class j extends FunctionReferenceImpl implements Function3<Context, Flow<? extends Boolean>, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f10460a = new j();

        public j() {
            super(3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.class, "defaultProgressBarView", "defaultProgressBarView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/VastProgressBarView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w invoke(Context p0, Flow<Boolean> p1, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.c(p0, p1, p2);
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$k */
    public /* synthetic */ class k extends FunctionReferenceImpl implements Function2<Context, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f10461a = new k();

        public k() {
            super(2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.class, "defaultVastIconView", "defaultVastIconView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/LinearVastIconView;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k invoke(Context p0, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(p0, p1);
        }
    }

    static {
        float f2 = 30;
        e = DpKt.m3862DpSizeYgX7TsA(Dp.m3840constructorimpl(f2), Dp.m3840constructorimpl(f2));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q b(long j2, long j3, long j4, com.moloco.sdk.internal.ortb.model.x xVar, Composer composer, int i2) {
        long j5;
        composer.startReplaceableGroup(129538364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129538364, i2, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:203)");
        }
        composer.startReplaceableGroup(-1579260747);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar = null;
        String str = null;
        if (xVar != null) {
            String textPosition = xVar.getTextPosition();
            if (textPosition != null) {
                str = textPosition.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            boolean z = !Intrinsics.areEqual(str, "right");
            Boolean useIcon = xVar.getUseIcon();
            boolean booleanValue = useIcon != null ? useIcon.booleanValue() : true;
            String text = xVar.getText();
            if (text == null) {
                text = "play store";
            }
            Color foregroundColor = xVar.getForegroundColor();
            long m1638unboximpl = foregroundColor != null ? foregroundColor.m1638unboximpl() : j4;
            Color backgroundColor = xVar.getBackgroundColor();
            long m1638unboximpl2 = backgroundColor != null ? backgroundColor.m1638unboximpl() : j3;
            Integer fontSize = xVar.getFontSize();
            long sp = fontSize != null ? TextUnitKt.getSp(fontSize.intValue()) : TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE();
            if (xVar.getIconSize() != null) {
                float m3840constructorimpl = Dp.m3840constructorimpl(r1.intValue());
                j5 = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
            } else {
                j5 = j2;
            }
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(text, null, j5, null, m1638unboximpl2, z, booleanValue, m1638unboximpl, sp, composer, 0, 10);
        }
        composer.endReplaceableGroup();
        if (qVar == null) {
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(PainterResources_androidKt.painterResource(R.drawable.moloco_skip, composer, 0), j2, null, j3, composer, ((i2 << 3) & 112) | ((i2 << 6) & 7168), 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return qVar;
    }

    public static final com.moloco.sdk.internal.ortb.model.B e() {
        return (com.moloco.sdk.internal.ortb.model.B) f10450a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(com.moloco.sdk.internal.ortb.model.B b2) {
        Intrinsics.checkNotNullParameter(b2, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(b2, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i(a(b2, false, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) null, 2, (Object) null), a2, a2);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a() {
        return a(e());
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null);
        }
        return a(b2, gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g adaptiveBlurConfig) {
        Intrinsics.checkNotNullParameter(b2, "<this>");
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(b2, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i(a(b2, true, adaptiveBlurConfig), a2, a2);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null);
        }
        return a(gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g adaptiveBlurConfig) {
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        return a(e(), adaptiveBlurConfig);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y a(com.moloco.sdk.internal.ortb.model.B b2, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null);
        }
        return a(b2, z, gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y a(com.moloco.sdk.internal.ortb.model.B b2, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        com.moloco.sdk.internal.ortb.model.t close;
        UInt delaySeconds;
        boolean z2 = b2.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String().getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String();
        Boolean bool = b2.getSkip() == null ? null : Boolean.TRUE;
        F skip = b2.getSkip();
        int i2 = 0;
        int delaySeconds2 = skip != null ? skip.getDelaySeconds() : 0;
        C4780c autoStore = b2.getAutoStore();
        boolean z3 = autoStore != null && autoStore.getEnabled() && b2.getAutoStore().getOnSkip();
        C4780c autoStore2 = b2.getAutoStore();
        boolean z4 = autoStore2 != null && autoStore2.getEnabled();
        int delaySeconds3 = b2.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.n dec = b2.getDec();
        if (dec != null && (close = dec.getClose()) != null && (delaySeconds = close.getDelaySeconds()) != null) {
            i2 = delaySeconds.getData();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y(z2, bool, delaySeconds2, delaySeconds3, i2, z3, z4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, new C1470d(b2), a(b2.getClose(), z, b2.getCountDownTimer()), new e(b2), new f(b2), new g(z, b2), p.a(b2.getIsAllAreaClickable()), new h(b2), new i(b2), (Function2) null, (Q) null, !z, 1537, (Object) null), b2.getAndroidInline(), b2.getAutoInline(), gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a(com.moloco.sdk.internal.ortb.model.B b2, boolean z) {
        com.moloco.sdk.internal.ortb.model.t close;
        UInt delaySeconds;
        int delaySeconds2 = b2.getClose().getDelaySeconds();
        Function10 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(0L, a(z, b2.getClose(), b2.getDec(), b2.getCountDownTimer(), b2.getInlineTextButton()), 1, null);
        com.moloco.sdk.internal.ortb.model.n dec = b2.getDec();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f(delaySeconds2, a2, (dec == null || (close = dec.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.getData(), a(b2.getClose(), z, (com.moloco.sdk.internal.ortb.model.k) null, 2, (Object) null), b2.getAndroidInline(), b2.getAutoInline());
    }

    public static final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> a(boolean z, F close, com.moloco.sdk.internal.ortb.model.n nVar, com.moloco.sdk.internal.ortb.model.k kVar, com.moloco.sdk.internal.ortb.model.x xVar) {
        Intrinsics.checkNotNullParameter(close, "close");
        if (nVar == null) {
            return a(close, z, kVar);
        }
        return new b(close, xVar, kVar);
    }

    public static final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> a(F f2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar) {
        return new c(z, f2, kVar);
    }

    public static /* synthetic */ Function2 a(F f2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            kVar = null;
        }
        return a(f2, z, kVar);
    }

    public static final Alignment a(com.moloco.sdk.internal.ortb.model.w horizontalAlignment, H verticalAlignment) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        H h2 = H.b;
        if (verticalAlignment == h2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.e)) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (verticalAlignment == h2 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.c) {
            return Alignment.INSTANCE.getTopCenter();
        }
        if (verticalAlignment == h2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.f)) {
            return Alignment.INSTANCE.getTopEnd();
        }
        H h3 = H.c;
        if (verticalAlignment == h3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.e)) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (verticalAlignment == h3 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.c) {
            return Alignment.INSTANCE.getCenter();
        }
        if (verticalAlignment == h3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.f)) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        H h4 = H.d;
        return (verticalAlignment == h4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.e)) ? Alignment.INSTANCE.getBottomStart() : (verticalAlignment == h4 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.c) ? Alignment.INSTANCE.getBottomCenter() : (verticalAlignment == h4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.w.f)) ? Alignment.INSTANCE.getBottomEnd() : Alignment.INSTANCE.getTopStart();
    }

    public static final View a(int i2, Integer num, com.moloco.sdk.internal.ortb.model.C c2, G g2, boolean z, boolean z2, final int i3, final int i4, final Integer num2, final Integer num3, final Integer num4, final Integer num5, final Integer num6, final Integer num7, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        int dimensionPixelSize;
        Function3 function3;
        Function2 function2;
        Function2 a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        float f2 = context.getResources().getDisplayMetrics().density;
        final int i5 = (int) (i2 * f2);
        if (num != null) {
            dimensionPixelSize = (int) (num.intValue() * f2);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_banner_mute_button_size);
        }
        final int i6 = dimensionPixelSize;
        Function3 function32 = new Function3() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4776d.a(i3, i6, i4, i5, num2, (Context) obj, (Flow) obj2, (Flow) obj3);
            }
        };
        if (c2 != null) {
            function3 = new Function3() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C4776d.a(num3, num4, num5, (Context) obj, (Flow) obj2, (Flow) obj3);
                }
            };
        } else {
            function3 = j.f10460a;
        }
        if (g2 != null) {
            function2 = new Function2() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4776d.a(num6, num7, (Context) obj, (Flow) obj2);
                }
            };
        } else {
            function2 = k.f10461a;
        }
        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((r26 & 1) != 0 ? null : null, (r26 & 2) != 0 ? ViewCompat.MEASURED_STATE_MASK : ViewCompat.MEASURED_STATE_MASK, (Function3<? super Context, ? super Flow<Boolean>, ? super Flow<Boolean>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n>) ((r26 & 4) != 0 ? x.p.f11482a : function32), (Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w>) ((r26 & 8) != 0 ? x.q.f11483a : function3), (Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q>) ((r26 & 16) != 0 ? null : null), (Function2<? super Context, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k>) ((r26 & 32) != 0 ? x.r.f11484a : function2), (Function5<? super Context, ? super Flow<Boolean>, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, s>) ((r26 & 64) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null) : z ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null)), (r26 & 128) == 0 ? p.a(z2) : null, (r26 & 256) != 0 ? a.h.f10873a.k() : null, (r26 & 512) != 0 ? true : !z, (r26 & 1024) != 0 ? a.h.f10873a.f() : null, (Function0<Unit>) ((r26 & 2048) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x.a();
            }
        } : null));
        return (View) a2.invoke(context, adViewModel);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n a(int i2, int i3, int i4, int i5, Integer num, Context ctx, Flow isPlayerPlaying, Flow muteFlow) {
        int color;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(isPlayerPlaying, "isPlayerPlaying");
        Intrinsics.checkNotNullParameter(muteFlow, "muteFlow");
        int i6 = R.drawable.moloco_volume_off;
        int i7 = R.drawable.moloco_volume_on;
        int roundToInt = MathKt.roundToInt(i3 * 0.6f);
        if (num != null) {
            color = num.intValue();
        } else {
            color = ContextCompat.getColor(ctx, R.color.moloco_button_background);
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n(ctx, isPlayerPlaying, muteFlow, i2, i6, i7, i3, roundToInt, i4, i5, color);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w a(Integer num, Integer num2, Integer num3, Context ctx, Flow isP, Flow prog) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(isP, "isP");
        Intrinsics.checkNotNullParameter(prog, "prog");
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Intrinsics.checkNotNull(num2);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w(ctx, isP, prog, intValue, num2.intValue(), (int) ((num3 != null ? num3.intValue() : 0) * ctx.getResources().getDisplayMetrics().density));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k a(Integer num, Integer num2, Context ctx, Flow flow) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNull(num);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k(ctx, flow, num.intValue(), (int) ((num2 != null ? num2.intValue() : 0) * ctx.getResources().getDisplayMetrics().density));
    }

    public static final com.moloco.sdk.internal.ortb.model.B b() {
        long j2 = c;
        int m8176constructorimpl = UInt.m8176constructorimpl(30);
        com.moloco.sdk.internal.ortb.model.w wVar = com.moloco.sdk.internal.ortb.model.w.d;
        H h2 = H.b;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Color color = null;
        F f2 = new F(5, 10, m8176constructorimpl, wVar, h2, j2, color, 64, defaultConstructorMarker);
        int i2 = 10;
        UInt uInt = null;
        G g2 = null;
        return new com.moloco.sdk.internal.ortb.model.B(f2, f2, new com.moloco.sdk.internal.ortb.model.C(0, com.moloco.sdk.internal.ortb.model.w.c, H.d, j2, null), new com.moloco.sdk.internal.ortb.model.A(false, i2, com.moloco.sdk.internal.ortb.model.w.b, h2, j2, uInt, color, 96, defaultConstructorMarker), (com.moloco.sdk.internal.ortb.model.i) null, true, new C4780c(false, false, (String) null, 6, (DefaultConstructorMarker) null), g2, (com.moloco.sdk.internal.ortb.model.n) null, (com.moloco.sdk.internal.ortb.model.k) null, (C4778a) null, (C4779b) null, (com.moloco.sdk.internal.ortb.model.x) null, 7552, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b(com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null);
        }
        return b(b2, gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b(com.moloco.sdk.internal.ortb.model.B b2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g adaptiveBlurConfig) {
        Intrinsics.checkNotNullParameter(b2, "<this>");
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(b2, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i(b(b2, true, adaptiveBlurConfig), a2, a2);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null);
        }
        return b(gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g adaptiveBlurConfig) {
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        return b(e(), adaptiveBlurConfig);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b(com.moloco.sdk.internal.ortb.model.B b2, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null);
        }
        return b(b2, z, gVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b(com.moloco.sdk.internal.ortb.model.B b2, final boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        com.moloco.sdk.internal.ortb.model.t close;
        UInt delaySeconds;
        com.moloco.sdk.internal.ortb.model.A a2 = b2.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String();
        final com.moloco.sdk.internal.ortb.model.C progressBar = b2.getProgressBar();
        final G vastPrivacyIcon = b2.getVastPrivacyIcon();
        final boolean isAllAreaClickable = b2.getIsAllAreaClickable();
        final int m1683toArgb8_81llA = ColorKt.m1683toArgb8_81llA(a2.getForegroundColor());
        Color backgroundColor = a2.getBackgroundColor();
        final Integer valueOf = backgroundColor != null ? Integer.valueOf(ColorKt.m1683toArgb8_81llA(backgroundColor.m1638unboximpl())) : null;
        final int b3 = b(a2.getHorizontalAlignment(), a2.getVerticalAlignment());
        final int padding = a2.getPadding();
        UInt controlSize = a2.getControlSize();
        Integer valueOf2 = controlSize != null ? Integer.valueOf(controlSize.getData()) : null;
        final Integer valueOf3 = progressBar != null ? Integer.valueOf(ColorKt.m1683toArgb8_81llA(progressBar.getForegroundColor())) : null;
        final Integer valueOf4 = progressBar != null ? Integer.valueOf(b(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment())) : null;
        final Integer valueOf5 = progressBar != null ? Integer.valueOf(progressBar.getPadding()) : null;
        final Integer valueOf6 = vastPrivacyIcon != null ? Integer.valueOf(b(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment())) : null;
        final Integer valueOf7 = vastPrivacyIcon != null ? Integer.valueOf(vastPrivacyIcon.getPadding()) : null;
        boolean z2 = a2.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String();
        Boolean bool = b2.getSkip() != null ? Boolean.TRUE : null;
        F skip = b2.getSkip();
        int delaySeconds2 = skip != null ? skip.getDelaySeconds() : 0;
        C4780c autoStore = b2.getAutoStore();
        boolean z3 = autoStore != null && autoStore.getEnabled() && b2.getAutoStore().getOnSkip();
        C4780c autoStore2 = b2.getAutoStore();
        boolean z4 = autoStore2 != null && autoStore2.getEnabled();
        int delaySeconds3 = b2.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.n dec = b2.getDec();
        final Integer num = valueOf2;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y(z2, bool, delaySeconds2, delaySeconds3, (dec == null || (close = dec.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.getData(), z3, z4, new Function2() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C4776d.a(padding, num, progressBar, vastPrivacyIcon, z, isAllAreaClickable, m1683toArgb8_81llA, b3, valueOf, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        }, b2.getAndroidInline(), b2.getAutoInline(), gVar);
    }

    public static final int b(com.moloco.sdk.internal.ortb.model.w horizontalAlignment, H verticalAlignment) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        int i4 = a.f10451a[horizontalAlignment.ordinal()];
        if (i4 == 1 || i4 == 2) {
            i2 = GravityCompat.START;
        } else if (i4 == 3) {
            i2 = 1;
        } else {
            if (i4 != 4 && i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = GravityCompat.END;
        }
        int i5 = a.b[verticalAlignment.ordinal()];
        if (i5 == 1) {
            i3 = 48;
        } else if (i5 == 2) {
            i3 = 16;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 80;
        }
        return i2 | i3;
    }
}
