package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U5 extends android.widget.RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f4989a;
    public int b;
    public com.inmobi.media.Z5 c;
    public com.inmobi.media.X5 d;
    public com.inmobi.media.InterfaceC2729rl e;
    public com.inmobi.media.InterfaceC2772t9 f;
    public com.inmobi.media.Oo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(android.app.Activity activity) {
        super(activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f4989a = activity;
        this.b = -1;
    }

    public final void b(android.widget.LinearLayout linearLayout, android.widget.LinearLayout.LayoutParams layoutParams) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.C2607n5 c2607n5 = new com.inmobi.media.C2607n5(context, (byte) 2, this.f);
        c2607n5.setId(65516);
        c2607n5.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.media.U5$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.media.U5.b(com.inmobi.media.U5.this, view, motionEvent);
            }
        });
        linearLayout.addView(c2607n5, layoutParams);
    }

    public final void c(android.widget.LinearLayout linearLayout, android.widget.LinearLayout.LayoutParams layoutParams) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.C2607n5 c2607n5 = new com.inmobi.media.C2607n5(context, (byte) 6, this.f);
        c2607n5.setId(1048283);
        c2607n5.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.media.U5$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.media.U5.c(com.inmobi.media.U5.this, view, motionEvent);
            }
        });
        linearLayout.addView(c2607n5, layoutParams);
    }

    public final void d(android.widget.LinearLayout linearLayout, android.widget.LinearLayout.LayoutParams layoutParams) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.C2607n5 c2607n5 = new com.inmobi.media.C2607n5(context, (byte) 3, this.f);
        c2607n5.setId(65502);
        c2607n5.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.media.U5$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.media.U5.d(com.inmobi.media.U5.this, view, motionEvent);
            }
        });
        linearLayout.addView(c2607n5, layoutParams);
    }

    public final com.inmobi.media.InterfaceC2729rl getUserLeftApplicationListener() {
        return this.e;
    }

    public final void setEmbeddedBrowserUpdateListener(com.inmobi.media.X5 browserUpdateListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(browserUpdateListener, "browserUpdateListener");
        this.d = browserUpdateListener;
    }

    public final void setLogger(com.inmobi.media.InterfaceC2772t9 logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.f = logger;
    }

    public final void setUserLeftApplicationListener(com.inmobi.media.InterfaceC2729rl interfaceC2729rl) {
        this.e = interfaceC2729rl;
    }

    public final void a(java.lang.String expandInput, com.inmobi.media.V5 inputType, boolean z, long j, java.lang.String placementType, java.lang.String impressionId, java.lang.String creativeId, com.inmobi.media.C2431gb c2431gb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputType, "inputType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementType, "placementType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        if (this.c == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.inmobi.media.Z5 z5 = new com.inmobi.media.Z5(context, j, placementType, impressionId, creativeId, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.U5$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.U5.a(com.inmobi.media.U5.this, (org.json.JSONObject) obj);
                }
            }, this.f);
            this.c = z5;
            z5.setId(65517);
        }
        com.inmobi.media.Z5 z52 = this.c;
        if (z52 != null) {
            z52.setLandingPageTelemetryControlInfo(c2431gb);
        }
        if (this.b != expandInput.hashCode()) {
            if (inputType == com.inmobi.media.V5.f5008a) {
                com.inmobi.media.Z5 z53 = this.c;
                if (z53 != null) {
                    z53.loadUrl(expandInput);
                }
            } else {
                com.inmobi.media.Z5 z54 = this.c;
                if (z54 != null) {
                    z54.loadData(expandInput, "text/html", "UTF-8");
                }
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            com.inmobi.media.Z5 z55 = this.c;
            if (z55 != null) {
                z55.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.c, layoutParams);
            }
        }
        this.b = expandInput.hashCode();
        if (z) {
            if (findViewById(65533) != null) {
                return;
            }
            float f = com.inmobi.media.N5.d().c;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setId(65533);
            linearLayout.setWeightSum(100.0f);
            linearLayout.setBackgroundResource(android.R.drawable.bottom_bar);
            linearLayout.setBackgroundColor(-7829368);
            setBackgroundColor(-7829368);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, (int) (48 * f));
            layoutParams2.addRule(12);
            addView(linearLayout, layoutParams2);
            if (com.inmobi.media.J3.a(this.f4989a)) {
                com.inmobi.media.Oo oo = this.g;
                if (oo != null) {
                    oo.a();
                }
                this.g = new com.inmobi.media.Oo(this.f4989a, new com.inmobi.media.T5(layoutParams2), this.f);
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            layoutParams3.weight = 25.0f;
            b(linearLayout, layoutParams3);
            d(linearLayout, layoutParams3);
            a(linearLayout, layoutParams3);
            c(linearLayout, layoutParams3);
            return;
        }
        android.view.View findViewById = findViewById(65533);
        if (findViewById != null) {
            removeView(findViewById);
        }
    }

    public static final boolean b(com.inmobi.media.U5 u5, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Y5 y5;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            com.inmobi.media.Z5 z5 = u5.c;
            if (z5 != null && (y5 = z5.h) != null) {
                com.inmobi.media.Y5.a(y5, 5, true, null, 12);
            }
            com.inmobi.media.X5 x5 = u5.d;
            if (x5 != null) {
                com.inmobi.media.R8.a(((com.inmobi.media.Q8) x5).f4912a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(com.inmobi.media.U5 u5, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Y5 y5;
        com.inmobi.media.Y5 y52;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            com.inmobi.media.Z5 z5 = u5.c;
            if (z5 != null && (y52 = z5.h) != null) {
                com.inmobi.media.Y5.a(y52, 6, true, null, 12);
            }
            com.inmobi.media.Z5 z52 = u5.c;
            if (z52 != null && (y5 = z52.h) != null) {
                com.inmobi.media.Y5.a(y5, 6, true, null, 12);
            }
            com.inmobi.media.Z5 z53 = u5.c;
            if (z53 != null) {
                z53.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(com.inmobi.media.U5 u5, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Z5 z5 = u5.c;
        if (z5 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (z5.canGoForward()) {
                z5.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final kotlin.Unit a(com.inmobi.media.U5 u5, org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        com.inmobi.media.X5 x5 = u5.d;
        if (x5 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            com.inmobi.media.C c = ((com.inmobi.media.Q8) x5).f4912a.b;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi ? (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c : null;
            if (gestureDetectorOnGestureListenerC2675pi != null) {
                gestureDetectorOnGestureListenerC2675pi.c(jsonObject);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(android.widget.LinearLayout linearLayout, android.widget.LinearLayout.LayoutParams layoutParams) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.C2607n5 c2607n5 = new com.inmobi.media.C2607n5(context, (byte) 4, this.f);
        c2607n5.setId(65503);
        c2607n5.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.media.U5$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.media.U5.a(com.inmobi.media.U5.this, view, motionEvent);
            }
        });
        linearLayout.addView(c2607n5, layoutParams);
    }

    public static final boolean a(com.inmobi.media.U5 u5, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Z5 z5 = u5.c;
        if (z5 == null) {
            com.inmobi.media.X5 x5 = u5.d;
            if (x5 != null) {
                com.inmobi.media.R8.a(((com.inmobi.media.Q8) x5).f4912a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (z5.canGoBack()) {
                z5.goBack();
            } else {
                com.inmobi.media.X5 x52 = u5.d;
                if (x52 != null) {
                    com.inmobi.media.R8.a(((com.inmobi.media.Q8) x52).f4912a);
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
