package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.U3;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes6.dex */
public class InterstitialActivity extends ControllerActivity {
    private static final String s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(s, U3.i.t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(s, U3.i.u0);
    }
}
