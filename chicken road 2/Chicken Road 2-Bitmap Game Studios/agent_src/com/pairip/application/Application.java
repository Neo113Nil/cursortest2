package com.pairip.application;

import android.content.Context;
import com.door.brass.knob.LemonMeringueCafeApp;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends LemonMeringueCafeApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
