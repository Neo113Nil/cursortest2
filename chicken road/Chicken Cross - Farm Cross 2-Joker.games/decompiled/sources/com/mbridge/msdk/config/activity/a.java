package com.mbridge.msdk.config.activity;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* compiled from: ActivityPresenter.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8896a = "ActivityPresenter";
    private com.mbridge.msdk.config.activity.lifecycle.a b;
    private ViewGroup c;
    private int d;

    public a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.c = viewGroup;
        a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.b = (com.mbridge.msdk.config.activity.lifecycle.a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("156", 1);
            this.d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        a("onCreate");
    }

    public void a(String str) {
        if (this.b == null) {
            return;
        }
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "onDestroy":
                this.b.f();
                break;
            case "onPause":
                this.b.e();
                break;
            case "onStart":
                this.b.onStart();
                break;
            case "onBackPressed":
                this.b.c();
                break;
            case "onStop":
                this.b.a();
                break;
            case "onCreate":
                this.b.a(this.c);
                break;
            case "onResume":
                this.b.b();
                break;
        }
        q0.b("ActivityPresenter", "life " + str);
    }

    private void a(MBRewardVideoActivity mBRewardVideoActivity) {
        int i;
        int i2;
        int a2;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("154", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("157", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("158", 0);
            int g = v0.g(mBRewardVideoActivity);
            int f = v0.f(mBRewardVideoActivity);
            if (intent.getIntExtra("155", 0) == 0 && (a2 = c.a((Context) mBRewardVideoActivity)) > 0) {
                f -= a2;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                i = g;
                i2 = f;
            } else {
                i = v0.a(mBRewardVideoActivity, intExtra);
                i2 = v0.a(mBRewardVideoActivity, intExtra2);
            }
            int min = Math.min(i, g);
            int min2 = Math.min(i2, f);
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(min, min2);
            } else {
                layoutParams.width = min;
                layoutParams.height = min2;
            }
            this.c.setLayoutParams(layoutParams);
            this.c.setX((g - min) / 2.0f);
            this.c.setY((f - min2) / 2.0f);
        } catch (Exception e) {
            q0.b("ActivityPresenter", e.getMessage());
        }
    }
}
