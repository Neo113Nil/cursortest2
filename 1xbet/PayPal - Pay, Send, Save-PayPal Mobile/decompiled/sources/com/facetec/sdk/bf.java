package com.facetec.sdk;

/* loaded from: classes8.dex */
abstract class bf extends android.app.Activity {

    /* renamed from: a, reason: collision with root package name */
    com.facetec.sdk.cn f3415a;
    android.os.Handler b;
    android.view.View c;
    android.widget.RelativeLayout d;
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);

    enum e {
        NOT_GRANTED,
        DENIED_ALWAYS,
        GRANTED
    }

    abstract void b(java.lang.String str);

    abstract void c();

    abstract void d(java.lang.String str);

    abstract void e();

    abstract void e(boolean z);

    abstract void f();

    abstract void g();

    abstract void h();

    abstract void i();

    abstract void j();

    abstract void k();

    abstract void l();

    abstract void m();

    abstract void n();

    abstract void o();

    abstract void p();

    abstract void q();

    abstract void t();

    bf() {
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            com.facetec.sdk.ai.e(true);
            this.b.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bf$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bf.this.u();
                }
            }, 1000L);
        } catch (java.lang.Throwable th) {
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.ON_RESUME_ERROR, "Error detected in onResume(). Ending the session.", th);
            d(com.facetec.sdk.as.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (hasWindowFocus()) {
            return;
        }
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACETEC_SDK_ACTIVITY_CONTEXT_SWITCH_TRIGGERED, (java.lang.String) null, (java.lang.Throwable) null);
        s();
    }

    private void s() {
        synchronized (this) {
            if (!b() && !isFinishing()) {
                e(false);
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (com.facetec.sdk.bj.c(configuration)) {
            t();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        android.os.Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
    }

    protected final void d() {
        androidx.core.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{"android.permission.CAMERA"}, 0);
        c(true);
    }

    protected final com.facetec.sdk.bf.e a() {
        if (androidx.core.content.ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            if (com.facetec.sdk.bj.g(this).getBoolean("cameraPermissionsShown", false) && !androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) {
                return com.facetec.sdk.bf.e.DENIED_ALWAYS;
            }
            return com.facetec.sdk.bf.e.NOT_GRANTED;
        }
        return com.facetec.sdk.bf.e.GRANTED;
    }

    final boolean b() {
        return this.e.get();
    }

    final void c(boolean z) {
        this.e.set(z);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
