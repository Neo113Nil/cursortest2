package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4041r6 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f7343a;
    public int b;
    public C4180w6 c;
    public InterfaceC4125u6 d;
    public InterfaceC3917mn e;
    public Y9 f;
    public Lq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041r6(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7343a = activity;
        this.b = -1;
    }

    public final void a(String expandInput, EnumC4069s6 inputType, boolean z, long j, String placementType, String impressionId, String creativeId, Yb yb) {
        Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        String str = "initBrowser called with {expandInput: " + expandInput + ", bottomNavBarVisible: " + z + "}";
        if (this.c == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C4180w6 c4180w6 = new C4180w6(context, j, placementType, impressionId, creativeId, new Function1() { // from class: com.inmobi.media.r6$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4041r6.a(C4041r6.this, (JSONObject) obj);
                }
            }, this.f);
            this.c = c4180w6;
            c4180w6.setId(65517);
        }
        C4180w6 c4180w62 = this.c;
        if (c4180w62 != null) {
            c4180w62.setLandingPageTelemetryControlInfo(yb);
        }
        if (this.b != expandInput.hashCode()) {
            if (inputType == EnumC4069s6.f7367a) {
                C4180w6 c4180w63 = this.c;
                if (c4180w63 != null) {
                    c4180w63.loadUrl(expandInput);
                }
            } else {
                C4180w6 c4180w64 = this.c;
                if (c4180w64 != null) {
                    c4180w64.loadData(expandInput, "text/html", "UTF-8");
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            C4180w6 c4180w65 = this.c;
            if (c4180w65 != null) {
                c4180w65.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.c, layoutParams);
            }
        }
        this.b = expandInput.hashCode();
        if (!z) {
            View findViewById = findViewById(65533);
            if (findViewById != null) {
                removeView(findViewById);
                return;
            }
            return;
        }
        if (findViewById(65533) != null) {
            return;
        }
        float f = AbstractC3841k6.d().c;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f));
        layoutParams2.addRule(12);
        addView(linearLayout, layoutParams2);
        if (AbstractC3727g4.a(this.f7343a)) {
            Lq lq = this.g;
            if (lq != null) {
                lq.a();
            }
            this.g = new Lq(this.f7343a, new C4013q6(layoutParams2), this.f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.weight = 25.0f;
        b(linearLayout, layoutParams3);
        d(linearLayout, layoutParams3);
        a(linearLayout, layoutParams3);
        c(linearLayout, layoutParams3);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        K5 k5 = new K5(context, (byte) 2, this.f);
        k5.setId(65516);
        k5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.r6$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4041r6.b(C4041r6.this, view, motionEvent);
            }
        });
        linearLayout.addView(k5, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        K5 k5 = new K5(context, (byte) 6, this.f);
        k5.setId(1048283);
        k5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.r6$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4041r6.c(C4041r6.this, view, motionEvent);
            }
        });
        linearLayout.addView(k5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        K5 k5 = new K5(context, (byte) 3, this.f);
        k5.setId(65502);
        k5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.r6$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4041r6.d(C4041r6.this, view, motionEvent);
            }
        });
        linearLayout.addView(k5, layoutParams);
    }

    public final InterfaceC3917mn getUserLeftApplicationListener() {
        return this.e;
    }

    public final void setEmbeddedBrowserUpdateListener(InterfaceC4125u6 browserUpdateListener) {
        Intrinsics.checkNotNullParameter(browserUpdateListener, "browserUpdateListener");
        this.d = browserUpdateListener;
    }

    public final void setLogger(Y9 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f = logger;
    }

    public final void setUserLeftApplicationListener(InterfaceC3917mn interfaceC3917mn) {
        this.e = interfaceC3917mn;
    }

    public static final boolean b(C4041r6 c4041r6, View view, MotionEvent motionEvent) {
        C4153v6 c4153v6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C4180w6 c4180w6 = c4041r6.c;
            if (c4180w6 != null && (c4153v6 = c4180w6.h) != null) {
                C4153v6.a(c4153v6, 5, true, null, 12);
            }
            InterfaceC4125u6 interfaceC4125u6 = c4041r6.d;
            if (interfaceC4125u6 != null) {
                C4156v9.a(((C4128u9) interfaceC4125u6).f7410a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(C4041r6 c4041r6, View view, MotionEvent motionEvent) {
        C4153v6 c4153v6;
        C4153v6 c4153v62;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C4180w6 c4180w6 = c4041r6.c;
            if (c4180w6 != null && (c4153v62 = c4180w6.h) != null) {
                C4153v6.a(c4153v62, 6, true, null, 12);
            }
            C4180w6 c4180w62 = c4041r6.c;
            if (c4180w62 != null && (c4153v6 = c4180w62.h) != null) {
                C4153v6.a(c4153v6, 6, true, null, 12);
            }
            C4180w6 c4180w63 = c4041r6.c;
            if (c4180w63 != null) {
                c4180w63.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(C4041r6 c4041r6, View view, MotionEvent motionEvent) {
        C4180w6 c4180w6 = c4041r6.c;
        if (c4180w6 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c4180w6.canGoForward()) {
                c4180w6.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final Unit a(C4041r6 c4041r6, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC4125u6 interfaceC4125u6 = c4041r6.d;
        if (interfaceC4125u6 != null) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            D d = ((C4128u9) interfaceC4125u6).f7410a.b;
            Ej ej = d instanceof Ej ? (Ej) d : null;
            if (ej != null) {
                ej.c(jsonObject);
            }
        }
        return Unit.INSTANCE;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        K5 k5 = new K5(context, (byte) 4, this.f);
        k5.setId(65503);
        k5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.r6$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4041r6.a(C4041r6.this, view, motionEvent);
            }
        });
        linearLayout.addView(k5, layoutParams);
    }

    public static final boolean a(C4041r6 c4041r6, View view, MotionEvent motionEvent) {
        C4180w6 c4180w6 = c4041r6.c;
        if (c4180w6 == null) {
            InterfaceC4125u6 interfaceC4125u6 = c4041r6.d;
            if (interfaceC4125u6 != null) {
                C4156v9.a(((C4128u9) interfaceC4125u6).f7410a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c4180w6.canGoBack()) {
                c4180w6.goBack();
            } else {
                InterfaceC4125u6 interfaceC4125u62 = c4041r6.d;
                if (interfaceC4125u62 != null) {
                    C4156v9.a(((C4128u9) interfaceC4125u62).f7410a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
