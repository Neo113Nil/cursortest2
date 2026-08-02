package com.razorpay;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class UpiChooserSelectionReceiver extends BroadcastReceiver {
    @RequiresApi(api = 22)
    private ComponentName l$1_I$l$(Intent intent) {
        Object parcelableExtra;
        if (intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
                return (ComponentName) parcelableExtra;
            } catch (Exception e) {
                AnalyticsUtil.reportCaughtException(e);
            }
        }
        return (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ComponentName l$1_I$l$ = l$1_I$l$(intent);
            if (l$1_I$l$ != null && !TextUtils.isEmpty(l$1_I$l$.getPackageName())) {
                HashMap hashMap = new HashMap();
                hashMap.put("package_name", l$1_I$l$.getPackageName());
                hashMap.put("url", intent.getStringExtra("razorpay_upi_chooser_url"));
                hashMap.put("candidate_count", Integer.valueOf(intent.getIntExtra("razorpay_upi_chooser_candidate_count", -1)));
                hashMap.put("selection_source", "system_chooser");
                try {
                    String appNameOfPackageName = BaseUtils.getAppNameOfPackageName(l$1_I$l$.getPackageName(), context);
                    if (!TextUtils.isEmpty(appNameOfPackageName)) {
                        hashMap.put("app_name", appNameOfPackageName);
                    }
                } catch (Exception e) {
                    AnalyticsUtil.reportCaughtException(e);
                }
                AnalyticsUtil.trackEvent(AnalyticsEvent.NATIVE_INTENT_SYSTEM_CHOOSER_SELECTED, AnalyticsUtil.getJSONResponse(hashMap));
            }
        } catch (Exception e2) {
            AnalyticsUtil.reportCaughtException(e2);
        }
    }
}
