package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.webkit.Profile;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
public final class U7 {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f6885a;
    public Hg b;
    public float c;
    public boolean d;
    public final WeakReference e;
    public final Ej f;
    public final RelativeLayout g;
    public boolean h;

    public U7(WeakReference activityRef, Ej adContainer, RelativeLayout adBackgroundView) {
        Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f6885a = adBackgroundView;
        this.b = Ig.a(AbstractC3841k6.g());
        this.c = 1.0f;
        this.e = activityRef;
        this.f = adContainer;
        this.g = adBackgroundView;
    }

    public final void a(final Hg orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.b = orientation;
        Ej ej = this.f;
        Intrinsics.checkNotNull(ej, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        ej.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.U7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return U7.a(Hg.this, (Ej) obj);
            }
        });
    }

    public final void b() {
        Activity activity = (Activity) this.e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).e) {
            try {
                C fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    C4220xj c4220xj = (C4220xj) fullScreenEventsListener;
                    Y9 y9 = c4220xj.f7481a.i;
                    if (y9 != null) {
                        String str = Ej.j1;
                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                        ((Z9) y9).a(str, com.ironsource.Wf.m);
                    }
                    if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, c4220xj.f7481a.getViewState())) {
                        c4220xj.f7481a.setAndUpdateViewState("Hidden");
                    }
                    c4220xj.f7481a.Y();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                String str2 = "Encountered unexpected error in onAdScreenDismissed handler: " + e.getMessage();
                Kc.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            Ej ej = this.f;
            Intrinsics.checkNotNull(ej, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            ej.setFullScreenActivityContext(null);
            try {
                ej.o();
            } catch (Exception e2) {
                String str3 = "Encountered unexpected error in processing close request: " + e2.getMessage();
                Kc.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            Ej container = this.f;
            Intrinsics.checkNotNullParameter(container, "container");
            InMobiAdActivity.t.remove(container.hashCode());
        }
        this.f.b();
    }

    public final void c() {
        C3813j6 c3813j6;
        RelativeLayout.LayoutParams layoutParams;
        if (this.c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f6885a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.d) {
            C3900m6 c3900m6 = AbstractC3841k6.f7196a;
            Context context = this.f6885a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c3813j6 = AbstractC3841k6.b(context);
        } else {
            C3900m6 c3900m62 = AbstractC3841k6.f7196a;
            Context context2 = this.f6885a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Display a2 = AbstractC3841k6.a(context2);
            if (a2 == null) {
                c3813j6 = AbstractC3841k6.b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                a2.getMetrics(displayMetrics);
                c3813j6 = new C3813j6(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        String str = "setAdLayoutWidthAndHeight {width:" + c3813j6.f7174a + ", height:" + c3813j6.b + "} Orientation:" + this.b;
        if (Ig.b(this.b)) {
            layoutParams = new RelativeLayout.LayoutParams(MathKt.roundToInt(c3813j6.f7174a * this.c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, MathKt.roundToInt(c3813j6.b * this.c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f6885a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Tp viewableAd = this.f.getViewableAd();
        View c = viewableAd != null ? viewableAd.c() : null;
        if (c != null) {
            ViewParent parent = c.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.g.getContext());
            relativeLayout.addView(c, new RelativeLayout.LayoutParams(-1, -1));
            this.g.addView(relativeLayout, layoutParams);
            this.f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                Tp viewableAd = this.f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(hashMap);
                }
            } catch (Exception e) {
                String str = "SDK encountered unexpected error in enabling impression tracking on this ad: " + e.getMessage();
                C fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((C4220xj) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        Ej ej = this.f;
        if (!(ej instanceof Ej)) {
            ej = null;
        }
        if (ej == null) {
            return;
        }
        ej.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.U7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return U7.a((Ej) obj);
            }
        });
        if (ej.M) {
            return;
        }
        try {
            ej.o();
        } catch (Exception e) {
            String str = "Encountered unexpected error in processing close request: " + e.getMessage();
            Kc.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final Unit a(Ej it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.s();
        return Unit.INSTANCE;
    }

    public static final Unit a(Hg hg, Ej it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b(hg);
        return Unit.INSTANCE;
    }
}
