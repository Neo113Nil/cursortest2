package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class a {
    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }
}
