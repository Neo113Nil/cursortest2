package E0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements a1.k, a1.InterfaceC0062b, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, a1.InterfaceC0063c, io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f260b;

    public /* synthetic */ a(int i2, java.lang.Object obj) {
        this.f259a = i2;
        this.f260b = obj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public java.lang.Object apply(java.lang.Object obj) {
        io.appmetrica.analytics.impl.EnumC0785w2 a2;
        switch (this.f259a) {
            case 2:
                return io.appmetrica.analytics.location.impl.u.a((io.appmetrica.analytics.location.impl.u) this.f260b, (android.location.LocationManager) obj);
            default:
                a2 = io.appmetrica.analytics.impl.C0733u2.a((io.appmetrica.analytics.impl.C0268c2) this.f260b, (android.app.usage.UsageStatsManager) obj);
                return a2;
        }
    }

    @Override // a1.InterfaceC0063c
    public void f(java.lang.Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((org.json.JSONObject) obj).getBoolean("handled");
            } catch (org.json.JSONException e2) {
                android.util.Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((P0.A) ((E0.a) this.f260b).f260b).a(z2);
    }

    @Override // a1.InterfaceC0062b
    public void g(java.lang.Object obj, x0.e eVar) {
        switch (this.f259a) {
            case 1:
                G0.b bVar = (G0.b) this.f260b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                H0.d dVar = (H0.d) ((java.util.ArrayList) obj).get(0);
                try {
                    android.content.Context context = bVar.f556a;
                    try {
                        com.yandex.varioqub.config.Varioqub.init(G0.d.a(dVar), new com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter(context), context);
                    } catch (java.lang.Throwable th) {
                        android.util.Log.e("VarioqubFlutter", "Something went wrong while parsing Varioqub Settings", th);
                    }
                    arrayList.add(0, null);
                } catch (java.lang.Throwable th2) {
                    arrayList = Q1.l.D(th2);
                }
                eVar.f(arrayList);
                break;
            case 5:
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon) this.f260b, obj, eVar);
                break;
            default:
                io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon) this.f260b, obj, eVar);
                break;
        }
    }

    @Override // a1.k
    public void i(x0.e call, Z0.j jVar) {
        java.lang.Object opt;
        android.app.ActivityOptions activityOptions;
        kotlin.jvm.internal.i.e(call, "call");
        if (!kotlin.jvm.internal.i.a((java.lang.String) call.f8409b, "openCrossing")) {
            jVar.b();
            return;
        }
        java.lang.Object obj = call.f8410c;
        if (obj == null) {
            opt = null;
        } else if (obj instanceof java.util.Map) {
            opt = ((java.util.Map) obj).get("trail");
        } else {
            if (!(obj instanceof org.json.JSONObject)) {
                throw new java.lang.ClassCastException();
            }
            opt = ((org.json.JSONObject) obj).opt("trail");
        }
        java.lang.String str = (java.lang.String) opt;
        if (str == null || str.length() == 0) {
            jVar.c(null);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new android.os.Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i2 = android.os.Build.VERSION.SDK_INT;
        java.lang.String a2 = k.AbstractC0919b.a();
        if (!android.text.TextUtils.isEmpty(a2)) {
            android.os.Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a2);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i2 >= 34) {
            activityOptions = k.AbstractC0918a.a();
            k.AbstractC0920c.a(activityOptions, false);
        } else {
            activityOptions = null;
        }
        android.os.Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
        C.j jVar2 = (C.j) this.f260b;
        intent.setData(android.net.Uri.parse(str));
        ((com.watchfacestudio.huasi_urx110.MainActivity) jVar2.f88b).startActivity(intent, bundle2);
        jVar.c(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        io.appmetrica.analytics.impl.I5.a((io.appmetrica.analytics.impl.I5) this.f260b);
    }
}
