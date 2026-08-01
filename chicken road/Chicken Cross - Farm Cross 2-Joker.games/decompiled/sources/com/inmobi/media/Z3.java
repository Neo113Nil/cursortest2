package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.unity3d.ads.BuildConfig;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Ej f6985a;
    public final boolean b;
    public final boolean c;
    public final Y9 d;

    public Z3(Ej renderView, boolean z, boolean z2, Y9 y9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        this.f6985a = renderView;
        this.b = z;
        this.c = z2;
        this.d = y9;
    }

    public final void a(final Jq insets) {
        final ViewGroup viewGroup;
        Handler handler;
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!(this.f6985a.getContainerContext() instanceof InMobiAdActivity) || (viewGroup = (ViewGroup) this.f6985a.getRootView().findViewById(65534)) == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.inmobi.media.Z3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Z3.a(Z3.this, viewGroup, insets);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Z3 z3, ViewGroup viewGroup, Jq jq) {
        Unit unit;
        Tp viewableAd;
        Tp viewableAd2;
        Pair a2 = z3.a();
        View.OnClickListener onClickListener = (View.OnClickListener) a2.component1();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) a2.component2();
        Unit unit2 = null;
        if (z3.b) {
            View findViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (findViewById != null) {
                Y9 y9 = z3.d;
                if (y9 != null) {
                    ((Z9) y9).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                z3.a(findViewById);
            } else {
                Context context = z3.f6985a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                K5 k5 = new K5(context, (byte) 0, z3.d);
                k5.setId(65532);
                Y5.f6965a.getClass();
                if (Y5.x()) {
                    k5.setElevation(1.7014117E38f);
                }
                k5.setOnClickListener(onClickListener);
                z3.a(k5);
                if (viewGroup != null) {
                    viewGroup.addView(k5, layoutParams);
                }
                layoutParams.setMargins(0, jq.b, jq.c, 0);
            }
        } else {
            View findViewById2 = z3.f6985a.getRootView().findViewById(65532);
            if (findViewById2 != null) {
                yq webViewFactory = z3.f6985a.getWebViewFactory();
                webViewFactory.getClass();
                Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
                Ej ej = (Ej) webViewFactory.b.get(BuildConfig.FLAVOR);
                if (ej != null && (viewableAd = ej.getViewableAd()) != null) {
                    viewableAd.a(findViewById2);
                }
                ViewParent parent = findViewById2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(findViewById2);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            Y9 y92 = z3.d;
            if (y92 != null) {
                ((Z9) y92).c("CloseButtonHandler", "Close button not present, not removing");
                Unit unit3 = Unit.INSTANCE;
            }
        }
        if (z3.c) {
            View findViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (findViewById3 != null) {
                Y9 y93 = z3.d;
                if (y93 != null) {
                    ((Z9) y93).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                z3.a(findViewById3);
                return;
            }
            Context context2 = z3.f6985a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            K5 k52 = new K5(context2, (byte) 1, z3.d);
            k52.setId(65531);
            Y5.f6965a.getClass();
            if (Y5.x()) {
                k52.setElevation(1.7014117E38f);
            }
            k52.setOnClickListener(onClickListener);
            z3.a(k52);
            if (viewGroup != null) {
                viewGroup.addView(k52, layoutParams);
            }
            layoutParams.setMargins(0, jq.b, jq.c, 0);
            return;
        }
        View findViewById4 = z3.f6985a.getRootView().findViewById(65531);
        if (findViewById4 != null) {
            yq webViewFactory2 = z3.f6985a.getWebViewFactory();
            webViewFactory2.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            Ej ej2 = (Ej) webViewFactory2.b.get(BuildConfig.FLAVOR);
            if (ej2 != null && (viewableAd2 = ej2.getViewableAd()) != null) {
                viewableAd2.a(findViewById4);
            }
            ViewParent parent2 = findViewById4.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(findViewById4);
                unit2 = Unit.INSTANCE;
            }
            if (unit2 != null) {
                return;
            }
        }
        Y9 y94 = z3.d;
        if (y94 != null) {
            ((Z9) y94).c("CloseButtonHandler", "Close region not present, not removing");
            Unit unit4 = Unit.INSTANCE;
        }
    }

    public final void a(View view) {
        Tp viewableAd;
        yq webViewFactory = this.f6985a.getWebViewFactory();
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        Ej ej = (Ej) webViewFactory.b.get(BuildConfig.FLAVOR);
        if (ej == null || (viewableAd = ej.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final Pair a() {
        float f = AbstractC3841k6.d().c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.inmobi.media.Z3$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z3.a(Z3.this, view);
            }
        };
        int i = (int) (50 * f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(11);
        return TuplesKt.to(onClickListener, layoutParams);
    }

    public static final void a(Z3 z3, View view) {
        try {
            z3.f6985a.o();
        } catch (Exception e) {
            String str = "Encountered unexpected error in processing close request: " + e.getMessage();
            Kc.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
