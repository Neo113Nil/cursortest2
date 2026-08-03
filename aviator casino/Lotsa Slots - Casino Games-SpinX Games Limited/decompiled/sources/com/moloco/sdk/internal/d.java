package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f6946a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.d.c();
        }
    });
    public static final long b = androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU();
    public static final long c = com.moloco.sdk.internal.u.a();
    public static final int d = 30;
    public static final long e;

    public static final class a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.D f6947a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.v b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public a(com.moloco.sdk.internal.ortb.model.D d, com.moloco.sdk.internal.ortb.model.v vVar, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f6947a = d;
            this.b = vVar;
            this.c = kVar;
        }

        public final kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            androidx.compose.ui.graphics.Color foregroundColor;
            composer.startReplaceableGroup(-1625076729);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1625076729, i, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:237)");
            }
            float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(this.f6947a.getControlSize());
            long m4500DpSizeYgX7TsA = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
            com.moloco.sdk.internal.ortb.model.v vVar = this.b;
            long foregroundColor2 = (vVar == null || (foregroundColor = vVar.getForegroundColor()) == null) ? this.f6947a.getForegroundColor() : foregroundColor.m2123unboximpl();
            androidx.compose.ui.Alignment a2 = com.moloco.sdk.internal.d.a(this.f6947a.getHorizontalAlignment(), this.f6947a.getVerticalAlignment());
            androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(this.f6947a.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String()));
            long sp = androidx.compose.ui.unit.TextUnitKt.getSp(this.f6947a.getControlSize());
            androidx.compose.ui.unit.TextUnitKt.m4686checkArithmeticR2X_6o(sp);
            long pack = androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m4671getRawTypeimpl(sp), androidx.compose.ui.unit.TextUnit.m4673getValueimpl(sp) / 2);
            long m4581timesGh9hcWk = androidx.compose.ui.unit.DpSize.m4581timesGh9hcWk(m4500DpSizeYgX7TsA, 0.4f);
            androidx.compose.ui.graphics.Color backgroundColor = this.f6947a.getBackgroundColor();
            kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(a2, m561PaddingValues0680j_4, foregroundColor2, m4500DpSizeYgX7TsA, pack, com.moloco.sdk.internal.d.b(m4581timesGh9hcWk, backgroundColor != null ? backgroundColor.m2123unboximpl() : com.moloco.sdk.internal.d.b, foregroundColor2, this.b, composer, 0), null, this.c, composer, 0, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class b implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6948a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.D b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public b(boolean z, com.moloco.sdk.internal.ortb.model.D d, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f6948a = z;
            this.b = d;
            this.c = kVar;
        }

        public final kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a2;
            composer.startReplaceableGroup(1846302992);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1846302992, i, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:258)");
            }
            if (this.f6948a) {
                a2 = null;
            } else {
                float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(this.b.getControlSize());
                long m4500DpSizeYgX7TsA = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
                androidx.compose.ui.Alignment a3 = com.moloco.sdk.internal.d.a(this.b.getHorizontalAlignment(), this.b.getVerticalAlignment());
                androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(this.b.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String()));
                long foregroundColor = this.b.getForegroundColor();
                long sp = androidx.compose.ui.unit.TextUnitKt.getSp(this.b.getControlSize());
                androidx.compose.ui.unit.TextUnitKt.m4686checkArithmeticR2X_6o(sp);
                long pack = androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m4671getRawTypeimpl(sp), androidx.compose.ui.unit.TextUnit.m4673getValueimpl(sp) / 2);
                androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.moloco_close, composer, 0);
                long m4581timesGh9hcWk = androidx.compose.ui.unit.DpSize.m4581timesGh9hcWk(m4500DpSizeYgX7TsA, 0.45f);
                androidx.compose.ui.graphics.Color backgroundColor = this.b.getBackgroundColor();
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(a3, m561PaddingValues0680j_4, foregroundColor, m4500DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(painterResource, m4581timesGh9hcWk, null, backgroundColor != null ? backgroundColor.m2123unboximpl() : com.moloco.sdk.internal.d.b, composer, 0, 4), null, this.c, composer, 0, 64);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class c implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function7<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function2<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a, ? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z f6949a;

        public c(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.f6949a = zVar;
        }

        public final kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function2<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            long j;
            composer.startReplaceableGroup(1012987991);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1012987991, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:80)");
            }
            if (this.f6949a.getMute().getControlSize() != null) {
                float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(r1.getData());
                j = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
            } else {
                j = com.moloco.sdk.internal.d.e;
            }
            androidx.compose.ui.Alignment a2 = com.moloco.sdk.internal.d.a(this.f6949a.getMute().getHorizontalAlignment(), this.f6949a.getMute().getVerticalAlignment());
            androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(this.f6949a.getMute().getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String()));
            long m4581timesGh9hcWk = androidx.compose.ui.unit.DpSize.m4581timesGh9hcWk(j, 0.6f);
            long foregroundColor = this.f6949a.getMute().getForegroundColor();
            androidx.compose.ui.graphics.Color backgroundColor = this.f6949a.getMute().getBackgroundColor();
            kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function2<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(j, m4581timesGh9hcWk, null, backgroundColor != null ? backgroundColor.m2123unboximpl() : com.moloco.sdk.internal.d.b, a2, m561PaddingValues0680j_4, foregroundColor, androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.moloco_volume_off, composer, 0), androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.moloco_volume_on, composer, 0), null, composer, 0, 516);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function7<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function2<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a, ? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$d, reason: collision with other inner class name */
    public static final class C0174d implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z f6950a;

        public C0174d(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.f6950a = zVar;
        }

        public final kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a2;
            androidx.compose.ui.graphics.Color foregroundColor;
            composer.startReplaceableGroup(-474197615);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-474197615, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:95)");
            }
            com.moloco.sdk.internal.ortb.model.D skip = this.f6950a.getSkip();
            if (skip == null) {
                a2 = null;
            } else {
                com.moloco.sdk.internal.ortb.model.z zVar = this.f6950a;
                float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(skip.getControlSize());
                long m4500DpSizeYgX7TsA = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
                com.moloco.sdk.internal.ortb.model.v inlineTextButton = zVar.getInlineTextButton();
                long foregroundColor2 = (inlineTextButton == null || (foregroundColor = inlineTextButton.getForegroundColor()) == null) ? skip.getForegroundColor() : foregroundColor.m2123unboximpl();
                androidx.compose.ui.Alignment a3 = com.moloco.sdk.internal.d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(skip.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String()));
                long sp = androidx.compose.ui.unit.TextUnitKt.getSp(skip.getControlSize());
                androidx.compose.ui.unit.TextUnitKt.m4686checkArithmeticR2X_6o(sp);
                long pack = androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m4671getRawTypeimpl(sp), androidx.compose.ui.unit.TextUnit.m4673getValueimpl(sp) / 2);
                long m4581timesGh9hcWk = androidx.compose.ui.unit.DpSize.m4581timesGh9hcWk(m4500DpSizeYgX7TsA, 0.4f);
                androidx.compose.ui.graphics.Color backgroundColor = skip.getBackgroundColor();
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(a3, m561PaddingValues0680j_4, foregroundColor2, m4500DpSizeYgX7TsA, pack, com.moloco.sdk.internal.d.b(m4581timesGh9hcWk, backgroundColor != null ? backgroundColor.m2123unboximpl() : com.moloco.sdk.internal.d.b, foregroundColor2, zVar.getInlineTextButton(), composer, 0), null, zVar.getCountDownTimer(), composer, 0, 64);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class e implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z f6951a;

        public e(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.f6951a = zVar;
        }

        public final kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a2;
            composer.startReplaceableGroup(-606521360);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-606521360, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:116)");
            }
            com.moloco.sdk.internal.ortb.model.D skip = this.f6951a.getSkip();
            if (skip == null) {
                a2 = null;
            } else {
                com.moloco.sdk.internal.ortb.model.z zVar = this.f6951a;
                float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(skip.getControlSize());
                long m4500DpSizeYgX7TsA = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
                androidx.compose.ui.Alignment a3 = com.moloco.sdk.internal.d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(skip.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String()));
                long foregroundColor = skip.getForegroundColor();
                long sp = androidx.compose.ui.unit.TextUnitKt.getSp(skip.getControlSize());
                androidx.compose.ui.unit.TextUnitKt.m4686checkArithmeticR2X_6o(sp);
                long pack = androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m4671getRawTypeimpl(sp), androidx.compose.ui.unit.TextUnit.m4673getValueimpl(sp) / 2);
                androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.moloco_skip, composer, 0);
                long m4581timesGh9hcWk = androidx.compose.ui.unit.DpSize.m4581timesGh9hcWk(m4500DpSizeYgX7TsA, 0.4f);
                androidx.compose.ui.graphics.Color backgroundColor = skip.getBackgroundColor();
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(a3, m561PaddingValues0680j_4, foregroundColor, m4500DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(painterResource, m4581timesGh9hcWk, null, backgroundColor != null ? backgroundColor.m2123unboximpl() : com.moloco.sdk.internal.d.b, composer, 0, 4), null, zVar.getCountDownTimer(), composer, 0, 64);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class f implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function7<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6952a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z b;

        public f(boolean z, com.moloco.sdk.internal.ortb.model.z zVar) {
            this.f6952a = z;
            this.b = zVar;
        }

        public final kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function7;
            com.moloco.sdk.internal.ortb.model.i cta;
            composer.startReplaceableGroup(483693011);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(483693011, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:134)");
            }
            if (this.f6952a || (cta = this.b.getCta()) == null) {
                function7 = null;
            } else {
                androidx.compose.ui.Alignment a2 = com.moloco.sdk.internal.d.a(cta.getHorizontalAlignment(), cta.getVerticalAlignment());
                androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(cta.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String()));
                java.lang.String text = cta.getText();
                long foregroundColor = cta.getForegroundColor();
                androidx.compose.ui.graphics.Color backgroundColor = cta.getBackgroundColor();
                function7 = com.moloco.sdk.internal.u.a(a2, m561PaddingValues0680j_4, text, foregroundColor, backgroundColor != null ? backgroundColor.m2123unboximpl() : com.moloco.sdk.internal.u.a(), cta.getCom.helpshift.proactive.InAppViewConstants.IMAGE_URL java.lang.String(), composer, 0, 0);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function7<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class g implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z f6953a;

        public g(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.f6953a = zVar;
        }

        public final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            composer.startReplaceableGroup(830314579);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(830314579, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:152)");
            }
            com.moloco.sdk.internal.ortb.model.A progressBar = this.f6953a.getProgressBar();
            kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a2 = progressBar == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(com.moloco.sdk.internal.d.a(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment()), androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(progressBar.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String())), progressBar.getForegroundColor(), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function5<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class h implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function6<? super androidx.compose.foundation.layout.BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z f6954a;

        public h(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.f6954a = zVar;
        }

        public final kotlin.jvm.functions.Function6<androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.runtime.Composer composer, int i) {
            composer.startReplaceableGroup(392356305);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(392356305, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:161)");
            }
            com.moloco.sdk.internal.ortb.model.E vastPrivacyIcon = this.f6954a.getVastPrivacyIcon();
            composer.startReplaceableGroup(-1135715087);
            kotlin.jvm.functions.Function6<androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a2 = vastPrivacyIcon == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.internal.d.a(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment()), androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(vastPrivacyIcon.getCom.helpshift.proactive.InAppViewConstants.PADDING java.lang.String())), composer, 0, 0);
            composer.endReplaceableGroup();
            if (a2 == null) {
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, composer, 0, 3);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function6<? super androidx.compose.foundation.layout.BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super kotlin.jvm.functions.Function0<? extends kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            return a(composer, num.intValue());
        }
    }

    static {
        float f2 = 30;
        e = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(f2), androidx.compose.ui.unit.Dp.m4478constructorimpl(f2));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b(com.moloco.sdk.internal.ortb.model.z zVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(b(zVar, false), a2, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.moloco.sdk.internal.ortb.model.z c() {
        long j = c;
        int m10896constructorimpl = kotlin.UInt.m10896constructorimpl(30);
        com.moloco.sdk.internal.ortb.model.u uVar = com.moloco.sdk.internal.ortb.model.u.d;
        com.moloco.sdk.internal.ortb.model.F f2 = com.moloco.sdk.internal.ortb.model.F.b;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        androidx.compose.ui.graphics.Color color = null;
        com.moloco.sdk.internal.ortb.model.D d2 = new com.moloco.sdk.internal.ortb.model.D(5, 10, m10896constructorimpl, uVar, f2, j, color, 64, defaultConstructorMarker);
        com.moloco.sdk.internal.ortb.model.A a2 = new com.moloco.sdk.internal.ortb.model.A(0, com.moloco.sdk.internal.ortb.model.u.c, com.moloco.sdk.internal.ortb.model.F.d, j, null);
        int i = 10;
        kotlin.UInt uInt = null;
        boolean z = false;
        boolean z2 = false;
        java.lang.String str = null;
        com.moloco.sdk.internal.ortb.model.i iVar = null;
        boolean z3 = true;
        com.moloco.sdk.internal.ortb.model.l lVar = null;
        com.moloco.sdk.internal.ortb.model.C3411a c3411a = null;
        com.moloco.sdk.internal.ortb.model.C3412b c3412b = null;
        com.moloco.sdk.internal.ortb.model.v vVar = null;
        java.lang.Object[] objArr = 0 == true ? 1 : 0;
        return new com.moloco.sdk.internal.ortb.model.z(d2, d2, a2, new com.moloco.sdk.internal.ortb.model.y(false, i, com.moloco.sdk.internal.ortb.model.u.b, f2, j, uInt, color, 96, defaultConstructorMarker), iVar, z3, new com.moloco.sdk.internal.ortb.model.C3413c(z, z2, str, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.moloco.sdk.internal.ortb.model.E) (0 == true ? 1 : 0), lVar, (com.moloco.sdk.internal.ortb.model.k) objArr, c3411a, c3412b, vVar, 7552, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.moloco.sdk.internal.ortb.model.z f() {
        return (com.moloco.sdk.internal.ortb.model.z) f6946a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(b(zVar, true), a2, a2);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b() {
        return b(f());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a() {
        return a(f());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x b(com.moloco.sdk.internal.ortb.model.z zVar, boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        kotlin.UInt delaySeconds;
        boolean mute = zVar.getMute().getMute();
        java.lang.Boolean bool = zVar.getSkip() == null ? null : java.lang.Boolean.TRUE;
        com.moloco.sdk.internal.ortb.model.D skip = zVar.getSkip();
        int delaySeconds2 = skip != null ? skip.getDelaySeconds() : 0;
        com.moloco.sdk.internal.ortb.model.C3413c autoStore = zVar.getAutoStore();
        boolean z2 = autoStore != null && autoStore.getEnabled() && zVar.getAutoStore().getOnSkip();
        com.moloco.sdk.internal.ortb.model.C3413c autoStore2 = zVar.getAutoStore();
        boolean z3 = autoStore2 != null && autoStore2.getEnabled();
        int delaySeconds3 = zVar.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.l dec = zVar.getDec();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x(mute, bool, delaySeconds2, delaySeconds3, (dec == null || (close = dec.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.getData(), z2, z3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(0L, new com.moloco.sdk.internal.d.c(zVar), a(zVar.getClose(), z, zVar.getCountDownTimer()), new com.moloco.sdk.internal.d.C0174d(zVar), new com.moloco.sdk.internal.d.e(zVar), new com.moloco.sdk.internal.d.f(z, zVar), com.moloco.sdk.internal.p.a(zVar.getIsAllAreaClickable()), new com.moloco.sdk.internal.d.g(zVar), new com.moloco.sdk.internal.d.h(zVar), (kotlin.jvm.functions.Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q) null, !z, 1537, (java.lang.Object) null), zVar.getAndroidInline(), zVar.getAutoInline());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a(com.moloco.sdk.internal.ortb.model.z zVar, boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        kotlin.UInt delaySeconds;
        int delaySeconds2 = zVar.getClose().getDelaySeconds();
        kotlin.jvm.functions.Function10 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(0L, a(z, zVar.getClose(), zVar.getDec(), zVar.getCountDownTimer(), zVar.getInlineTextButton()), 1, null);
        com.moloco.sdk.internal.ortb.model.l dec = zVar.getDec();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f(delaySeconds2, a2, (dec == null || (close = dec.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.getData(), a(zVar.getClose(), z, (com.moloco.sdk.internal.ortb.model.k) null, 2, (java.lang.Object) null), zVar.getAndroidInline(), zVar.getAutoInline());
    }

    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> a(boolean z, com.moloco.sdk.internal.ortb.model.D close, com.moloco.sdk.internal.ortb.model.l lVar, com.moloco.sdk.internal.ortb.model.k kVar, com.moloco.sdk.internal.ortb.model.v vVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(close, "close");
        if (lVar == null) {
            return a(close, z, kVar);
        }
        return new com.moloco.sdk.internal.d.a(close, vVar, kVar);
    }

    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> a(com.moloco.sdk.internal.ortb.model.D d2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar) {
        return new com.moloco.sdk.internal.d.b(z, d2, kVar);
    }

    public static /* synthetic */ kotlin.jvm.functions.Function2 a(com.moloco.sdk.internal.ortb.model.D d2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            kVar = null;
        }
        return a(d2, z, kVar);
    }

    public static final androidx.compose.ui.Alignment a(com.moloco.sdk.internal.ortb.model.u horizontalAlignment, com.moloco.sdk.internal.ortb.model.F verticalAlignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        com.moloco.sdk.internal.ortb.model.F f2 = com.moloco.sdk.internal.ortb.model.F.b;
        if (verticalAlignment == f2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) {
            return androidx.compose.ui.Alignment.INSTANCE.getTopStart();
        }
        if (verticalAlignment == f2 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) {
            return androidx.compose.ui.Alignment.INSTANCE.getTopCenter();
        }
        if (verticalAlignment == f2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) {
            return androidx.compose.ui.Alignment.INSTANCE.getTopEnd();
        }
        com.moloco.sdk.internal.ortb.model.F f3 = com.moloco.sdk.internal.ortb.model.F.c;
        if (verticalAlignment == f3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) {
            return androidx.compose.ui.Alignment.INSTANCE.getCenterStart();
        }
        if (verticalAlignment == f3 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) {
            return androidx.compose.ui.Alignment.INSTANCE.getCenter();
        }
        if (verticalAlignment == f3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) {
            return androidx.compose.ui.Alignment.INSTANCE.getCenterEnd();
        }
        com.moloco.sdk.internal.ortb.model.F f4 = com.moloco.sdk.internal.ortb.model.F.d;
        return (verticalAlignment == f4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) ? androidx.compose.ui.Alignment.INSTANCE.getBottomStart() : (verticalAlignment == f4 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) ? androidx.compose.ui.Alignment.INSTANCE.getBottomCenter() : (verticalAlignment == f4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) ? androidx.compose.ui.Alignment.INSTANCE.getBottomEnd() : androidx.compose.ui.Alignment.INSTANCE.getTopStart();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q b(long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.v vVar, androidx.compose.runtime.Composer composer, int i) {
        long j4;
        composer.startReplaceableGroup(129538364);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(129538364, i, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:184)");
        }
        composer.startReplaceableGroup(-1579299883);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar = null;
        java.lang.String str = null;
        if (vVar != null) {
            java.lang.String textPosition = vVar.getTextPosition();
            if (textPosition != null) {
                str = textPosition.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(str, "right");
            java.lang.Boolean useIcon = vVar.getUseIcon();
            boolean booleanValue = useIcon != null ? useIcon.booleanValue() : true;
            java.lang.String text = vVar.getText();
            if (text == null) {
                text = "play store";
            }
            androidx.compose.ui.graphics.Color foregroundColor = vVar.getForegroundColor();
            long m2123unboximpl = foregroundColor != null ? foregroundColor.m2123unboximpl() : j3;
            androidx.compose.ui.graphics.Color backgroundColor = vVar.getBackgroundColor();
            long m2123unboximpl2 = backgroundColor != null ? backgroundColor.m2123unboximpl() : j2;
            java.lang.Integer fontSize = vVar.getFontSize();
            long sp = fontSize != null ? androidx.compose.ui.unit.TextUnitKt.getSp(fontSize.intValue()) : androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
            if (vVar.getIconSize() != null) {
                float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(r1.intValue());
                j4 = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
            } else {
                j4 = j;
            }
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(text, null, j4, null, m2123unboximpl2, z, booleanValue, m2123unboximpl, sp, composer, 0, 10);
        }
        composer.endReplaceableGroup();
        if (qVar == null) {
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.moloco_skip, composer, 0), j, null, j2, composer, ((i << 3) & 112) | ((i << 6) & 7168), 4);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return qVar;
    }
}
