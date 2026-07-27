package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public class InneractiveBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public b f5165a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f5165a = new b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f5165a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.f5165a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f5165a);
                    this.f5165a = null;
                }
            } catch (Exception e) {
                IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            if (frameLayout != null) {
                com.fyber.inneractive.sdk.util.o.a(frameLayout);
            }
        } catch (Exception e) {
            IAlog.f("handleEdgeToEdge failed: %s", e.getMessage());
        }
    }
}
