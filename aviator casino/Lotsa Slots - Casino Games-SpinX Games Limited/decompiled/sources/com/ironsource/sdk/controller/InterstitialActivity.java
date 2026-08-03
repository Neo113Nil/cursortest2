package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class InterstitialActivity extends com.ironsource.sdk.controller.ControllerActivity {
    private static final java.lang.String s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.ironsource.sdk.utils.Logger.i(s, com.ironsource.X3.i.t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.ironsource.sdk.utils.Logger.i(s, com.ironsource.X3.i.u0);
    }
}
