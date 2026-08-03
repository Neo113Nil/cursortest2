package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public class InneractiveBaseActivity extends android.app.Activity {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.activities.b f3516a;

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(android.R.id.content);
        if (frameLayout != null && android.os.Build.VERSION.SDK_INT >= 35) {
            frameLayout.setOnApplyWindowInsetsListener(new com.fyber.inneractive.sdk.util.m());
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.f3516a = new com.fyber.inneractive.sdk.activities.b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f3516a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.f3516a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f3516a);
                    this.f3516a = null;
                }
            } catch (java.lang.Exception e) {
                com.fyber.inneractive.sdk.util.IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }
}
