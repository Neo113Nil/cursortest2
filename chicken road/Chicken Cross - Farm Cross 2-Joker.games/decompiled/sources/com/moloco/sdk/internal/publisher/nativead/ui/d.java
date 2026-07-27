package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d extends FrameLayout implements l {
    public static final a d = new a(null);
    public static final int e = 8;
    public static final String f = "VideoContainer";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f10675a;
    public final C b;
    public ComposeView c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f10676a;
        public final /* synthetic */ d b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Q d;

        public static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f10677a;
            public final /* synthetic */ Function0<Unit> b;
            public final /* synthetic */ Modifier c;
            public final /* synthetic */ Q d;

            public a(d dVar, Function0<Unit> function0, Modifier modifier, Q q) {
                this.f10677a = dVar;
                this.b = function0;
                this.c = modifier;
                this.d = q;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035844210, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous>.<anonymous> (NativeAdVideoContainer.kt:64)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f10677a.f10675a;
                long m1654getBlack0d7_KjU = Color.INSTANCE.m1654getBlack0d7_KjU();
                Function0<Unit> function0 = this.b;
                o oVar = new o(function0, function0, function0);
                x.a(aVar, this.c, m1654getBlack0d7_KjU, f.a(composer, 0), null, null, null, null, oVar, null, null, p.a(g.a(), composer, 6, 0), this.d, false, composer, 818110848, 0, 9280);
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

        public b(z zVar, d dVar, Function0<Unit> function0, Q q) {
            this.f10676a = zVar;
            this.b = dVar;
            this.c = function0;
            this.d = q;
        }

        public final void a(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if ((i & 6) == 0) {
                i |= composer.changed(modifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867022133, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous> (NativeAdVideoContainer.kt:63)");
            }
            this.f10676a.a(ComposableLambdaKt.composableLambda(composer, 1035844210, true, new a(this.b, this.c, modifier, this.d)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a vastAdController, Q viewVisibilityTracker, C viewLifecycleOwner, z watermark, Function0<Unit> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastAdController, "vastAdController");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.f10675a = vastAdController;
        this.b = viewLifecycleOwner;
        ComposeView a2 = com.moloco.sdk.internal.publisher.nativead.ui.b.a(context, ComposableLambdaKt.composableLambdaInstance(1867022133, true, new b(watermark, this, function0, viewVisibilityTracker)));
        addView(a2, new ViewGroup.LayoutParams(-1, -1));
        this.c = a2;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        this.f10675a.destroy();
        k();
    }

    public final ComposeView getVideoView() {
        return this.c;
    }

    public final void k() {
        removeAllViews();
        ComposeView composeView = this.c;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        this.c = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "onAttachedToWindow", null, false, 12, null);
        this.b.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "onDetachedFromWindow", null, false, 12, null);
        this.b.b(this);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.b.d(this);
        } else {
            this.b.c(this);
        }
    }

    public final void setVideoView(ComposeView composeView) {
        this.c = composeView;
    }
}
