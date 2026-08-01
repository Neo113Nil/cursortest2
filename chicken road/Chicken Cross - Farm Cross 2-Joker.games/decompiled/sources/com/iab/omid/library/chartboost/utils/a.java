package com.iab.omid.library.chartboost.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.chartboost.adsession.DeviceCategory;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f6182a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f6182a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f6182a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
