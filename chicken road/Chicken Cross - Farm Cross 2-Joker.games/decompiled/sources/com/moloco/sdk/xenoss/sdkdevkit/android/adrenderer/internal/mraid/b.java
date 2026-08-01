package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.lang.ref.WeakReference;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes7.dex */
public final class b {
    public static Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> d;
    public static Function0<Unit> f;
    public static c g;
    public static z h;
    public static Function0<Unit> i;
    public static Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> l;
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b m;
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a n;
    public static MetricsRecorder o;

    /* renamed from: a, reason: collision with root package name */
    public static final b f11021a = new b();
    public static WeakReference<j> b = new WeakReference<>(null);
    public static WeakReference<Activity> c = new WeakReference<>(null);
    public static Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> e = a.f11022a;
    public static Function0<Unit> j = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.p();
        }
    };
    public static Function0<Unit> k = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.o();
        }
    };
    public static final int p = 8;

    public static final class a implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11022a = new a();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-1525839088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525839088, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivityDataHolder.closeButton.<anonymous> (MraidActivity.kt:354)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
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

    public static final Unit o() {
        return Unit.INSTANCE;
    }

    public static final Unit p() {
        return Unit.INSTANCE;
    }

    public final void a(j jVar) {
        b = new WeakReference<>(jVar);
    }

    public final void b(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        k = function0;
    }

    public final void c(Function0<Unit> function0) {
        i = function0;
    }

    public final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d() {
        return e;
    }

    public final MetricsRecorder e() {
        return o;
    }

    public final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> f() {
        return d;
    }

    public final Function0<Unit> g() {
        return f;
    }

    public final Function0<Unit> h() {
        return k;
    }

    public final Function0<Unit> i() {
        return i;
    }

    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> j() {
        return l;
    }

    public final Function0<Unit> k() {
        return j;
    }

    public final z l() {
        return h;
    }

    public final Activity m() {
        return c.get();
    }

    public final j n() {
        return b.get();
    }

    public final void a(Activity activity) {
        c = new WeakReference<>(activity);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b() {
        return n;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b c() {
        return m;
    }

    public final void d(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        j = function0;
    }

    public final void a(Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> function10) {
        d = function10;
    }

    public final void a(Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        e = function2;
    }

    public final void a(Function0<Unit> function0) {
        f = function0;
    }

    public final c a() {
        return g;
    }

    public final void a(c cVar) {
        g = cVar;
    }

    public final void a(z zVar) {
        h = zVar;
    }

    public final void a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1) {
        l = function1;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar) {
        m = bVar;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar) {
        n = aVar;
    }

    public final void a(MetricsRecorder metricsRecorder) {
        o = metricsRecorder;
    }
}
