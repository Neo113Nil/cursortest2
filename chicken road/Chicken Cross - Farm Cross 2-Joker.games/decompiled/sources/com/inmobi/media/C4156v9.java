package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4156v9 implements Kg {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7432a;
    public D b;
    public U7 c;
    public RelativeLayout d;
    public C4041r6 e;
    public Hg f;
    public float g;
    public Y9 h;
    public final C4128u9 i;
    public final C4100t9 j;

    public C4156v9(InMobiAdActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7432a = new WeakReference(activity);
        this.f = Ig.a(AbstractC3841k6.g());
        this.g = 1.0f;
        this.i = new C4128u9(this);
        this.j = new C4100t9(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        C4041r6 c4041r6;
        Window window;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            Activity activity = (Activity) this.f7432a.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).b();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1);
        D d = (D) adContainers.get(intExtra);
        if (d == null) {
            String str = "Failed to find ad container with key: " + intExtra;
            Activity activity2 = (Activity) this.f7432a.get();
            if (activity2 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity2).b();
                return;
            }
            return;
        }
        int intExtra2 = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra2 == 0) {
            C fullScreenEventsListener = ((Ej) d).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((C4220xj) fullScreenEventsListener).a();
            }
            Activity activity3 = (Activity) this.f7432a.get();
            if (activity3 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity3).b();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f7432a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f7432a.get();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).g) {
                Object obj2 = this.f7432a.get();
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).g = true;
                if (!(d instanceof Ej) ? false : ((Ej) d).Y0) {
                    Y9 y9 = this.h;
                    if (y9 != null) {
                        ((Z9) y9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f7432a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        Y5.f6965a.getClass();
                        if (Y5.t()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        } else if (Y5.r()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        }
                        if (Y5.t()) {
                            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                            insetsController.setSystemBarsBehavior(2);
                            insetsController.hide(WindowInsetsCompat.Type.systemBars());
                            insetsController.hide(WindowInsetsCompat.Type.displayCutout());
                        } else if (Y5.w()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity4 = (Activity) this.f7432a.get();
                    if (activity4 != null) {
                        Intrinsics.checkNotNullParameter(activity4, "<this>");
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra2 && !Intrinsics.areEqual("html", ((Ej) d).getMarkupType())) || ((202 == intExtra2 && !Intrinsics.areEqual("htmlUrl", ((Ej) d).getMarkupType())) || (201 == intExtra2 && !Intrinsics.areEqual("inmobiJson", ((Ej) d).getMarkupType())))) {
            C fullScreenEventsListener2 = ((Ej) d).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((C4220xj) fullScreenEventsListener2).a();
            }
            Activity activity5 = (Activity) this.f7432a.get();
            if (activity5 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity5).b();
                return;
            }
            return;
        }
        try {
            this.b = d;
            ((Ej) d).setFullScreenActivityContext((Activity) this.f7432a.get());
            a();
            Activity activity6 = (Activity) this.f7432a.get();
            if (activity6 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.d = relativeLayout;
            }
            a(d);
            U7 u7 = this.c;
            if (u7 != null) {
                u7.d();
            }
            Activity activity7 = (Activity) this.f7432a.get();
            if (activity7 != null) {
                FrameLayout frameLayout = (FrameLayout) activity7.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    U7 u72 = this.c;
                    if (u72 != null) {
                        u72.c();
                    }
                }
            }
            if (d instanceof Ej) {
                ((Ej) d).setEmbeddedBrowserJsCallbacks(this.j);
            }
            if (!(d instanceof Ej) || (c4041r6 = this.e) == null) {
                return;
            }
            c4041r6.setUserLeftApplicationListener(((Ej) d).getListener());
        } catch (Exception e) {
            Ej ej = (Ej) d;
            ej.setFullScreenActivityContext(null);
            C fullScreenEventsListener3 = ej.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((C4220xj) fullScreenEventsListener3).a();
            }
            Activity activity8 = (Activity) this.f7432a.get();
            if (activity8 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity8).b();
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public final void b(Hg hg) {
        String str = "New Orientation is: " + hg;
        this.f = hg;
    }

    public final void c() {
        try {
            final C4041r6 c4041r6 = this.e;
            if (c4041r6 != null) {
                ViewParent parent = c4041r6.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(c4041r6);
                }
                ViewParent parent2 = c4041r6.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new Runnable() { // from class: com.inmobi.media.v9$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4156v9.a(C4041r6.this);
                        }
                    });
                }
            }
            C4041r6 c4041r62 = this.e;
            if (c4041r62 != null) {
                C4180w6 c4180w6 = c4041r62.c;
                if (c4180w6 != null) {
                    c4180w6.destroy();
                }
                c4041r62.c = null;
                c4041r62.d = null;
                c4041r62.e = null;
                Lq lq = c4041r62.g;
                if (lq != null) {
                    lq.a();
                }
                c4041r62.removeAllViews();
            }
            this.e = null;
            Ej.h1.getClass();
            a(C3855kj.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        C3900m6 d;
        Activity activity;
        if (this.e == null) {
            return;
        }
        D d2 = this.b;
        if (d2 != null) {
            if ((!(d2 instanceof Ej) ? false : ((Ej) d2).Y0) || ((activity = (Activity) this.f7432a.get()) != null && AbstractC3727g4.a(activity))) {
                d = AbstractC3841k6.h();
                float f = d.f7240a;
                float f2 = d.c;
                float f3 = f * f2;
                float f4 = d.b * f2;
                if (!Ig.b(this.f)) {
                    a(MathKt.roundToInt((1 - this.g) * f3), -1);
                    return;
                } else {
                    a(-1, MathKt.roundToInt((1 - this.g) * f4));
                    return;
                }
            }
        }
        d = AbstractC3841k6.d();
        float f5 = d.f7240a;
        float f22 = d.c;
        float f32 = f5 * f22;
        float f42 = d.b * f22;
        if (!Ig.b(this.f)) {
        }
    }

    public final void a() {
        Activity activity = (Activity) this.f7432a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(D d) {
        RelativeLayout relativeLayout;
        if (((Activity) this.f7432a.get()) == null || (relativeLayout = this.d) == null) {
            return;
        }
        Ej ej = (Ej) d;
        String markupType = ej.getMarkupType();
        if (!Intrinsics.areEqual(markupType, "html") && !Intrinsics.areEqual(markupType, "htmlUrl")) {
            throw new IllegalArgumentException("InMobiActivityViewHandler: Unknown Markup type");
        }
        U7 u7 = new U7(this.f7432a, ej, relativeLayout);
        this.c = u7;
        u7.a(this.f);
        u7.c = this.g;
        u7.d = ej.Y0;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        D d = this.b;
        Ej ej = d instanceof Ej ? (Ej) d : null;
        if (ej != null) {
            ej.c(jsonObject);
        }
    }

    @Override // com.inmobi.media.Kg
    public final void a(Hg orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (((Activity) this.f7432a.get()) == null) {
            return;
        }
        U7 u7 = this.c;
        if (u7 != null) {
            u7.a(orientation);
        }
        Hg hg = this.f;
        if (hg != orientation && Ig.b(hg) != Ig.b(orientation)) {
            b(orientation);
            U7 u72 = this.c;
            if (u72 != null) {
                u72.c();
            }
            b();
            return;
        }
        b(orientation);
    }

    public static final void a(C4156v9 c4156v9) {
        c4156v9.g = 1.0f;
        U7 u7 = c4156v9.c;
        if (u7 != null) {
            u7.c = 1.0f;
            u7.c();
        }
        C4041r6 c4041r6 = c4156v9.e;
        if (c4041r6 != null) {
            c4041r6.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        c4156v9.c();
    }

    public static final void a(C4041r6 c4041r6) {
        c4041r6.getParent().requestLayout();
    }

    public final void a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.f7432a.get();
        if (activity == null) {
            return;
        }
        String str = "setEmbeddedBrowserWidthHeight {width:" + i + ", height:" + i2 + "} Landscape:" + Ig.b(this.f);
        if (Ig.b(this.f)) {
            layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        Intrinsics.checkNotNull(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            C4041r6 c4041r6 = this.e;
            if (c4041r6 != null) {
                c4041r6.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        C4041r6 c4041r62 = this.e;
        if (c4041r62 != null) {
            relativeLayout.addView(c4041r62, layoutParams);
        }
    }
}
