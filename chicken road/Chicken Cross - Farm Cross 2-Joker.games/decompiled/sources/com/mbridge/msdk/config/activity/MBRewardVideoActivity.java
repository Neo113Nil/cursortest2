package com.mbridge.msdk.config.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.i0;

/* loaded from: classes6.dex */
public class MBRewardVideoActivity extends BaseActivity {
    ViewGroup b;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(i0.a(getApplicationContext(), "mbridge_activity", "layout"), (ViewGroup) null);
        this.b = viewGroup;
        setContentView(viewGroup);
        this.f8895a = new a(this, this.b);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
