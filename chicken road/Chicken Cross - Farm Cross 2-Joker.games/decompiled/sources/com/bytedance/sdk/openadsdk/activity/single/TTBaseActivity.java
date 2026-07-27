package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.utils.mk;
import com.bytedance.sdk.openadsdk.utils.qy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class TTBaseActivity extends Activity {
    protected String mu;
    private OnBackInvokedCallback pcc;
    protected boolean pq = false;

    protected boolean oo() {
        return false;
    }

    private static class pcc implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> pcc;

        pcc(TTBaseActivity tTBaseActivity) {
            this.pcc = new WeakReference<>(tTBaseActivity);
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.pcc.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.gbb();
            }
        }
    }

    protected void gbb() {
        onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (oo() && qy.pcc()) {
            this.pcc = new pcc(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.pcc);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e) {
                lo.pcc("TTBaseActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e2) {
                    lo.pcc("TTBaseActivity", "onResume set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                try {
                    super.onPause();
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (IllegalArgumentException unused2) {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
                return;
            }
        }
        super.onPause();
    }

    public void gm(boolean z) {
        this.pq = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!qy.pcc() || this.pcc == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.pcc);
        this.pcc = null;
    }

    protected void lu() {
        try {
            if (!mk.sf() || Build.VERSION.SDK_INT < 29) {
                return;
            }
            getWindow().getDecorView().setForceDarkAllowed(false);
        } catch (Throwable unused) {
        }
    }
}
