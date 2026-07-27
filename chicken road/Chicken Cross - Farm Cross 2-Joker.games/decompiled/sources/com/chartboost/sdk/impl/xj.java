package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xj extends hg {
    public SurfaceView e;
    public FrameLayout f;

    public /* synthetic */ xj(Context context, String str, t5 t5Var, da daVar, id idVar, String str2, SurfaceView surfaceView, FrameLayout frameLayout, h7 h7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, t5Var, daVar, idVar, str2, surfaceView, (i & 128) != 0 ? new FrameLayout(context) : frameLayout, h7Var, (i & 512) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.xj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                n3 a2;
                a2 = xj.a((Context) obj);
                return a2;
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 a(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new n3(it);
    }

    public final void b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView != null) {
            if (surfaceView != null) {
                surfaceView.setVisibility(8);
            }
            this.f.removeView(this.e);
            removeView(this.f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(Context context, String html, t5 callback, da impressionInterface, id nativeBridgeCommand, String str, SurfaceView surfaceView, FrameLayout videoBackground, h7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(videoBackground, "videoBackground");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.e = surfaceView;
        this.f = videoBackground;
        if (surfaceView != null) {
            videoBackground.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            videoBackground.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            addView(this.f);
            this.f.addView(this.e);
            addView(getWebViewContainer());
            callback.a();
            callback.d();
            return;
        }
        throw new IllegalStateException("SurfaceView is not ready. Cannot display video.");
    }
}
