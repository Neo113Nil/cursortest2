package com.iab.omid.library.inmobi.utils;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static android.app.UiModeManager f4443a;

    public static com.iab.omid.library.inmobi.adsession.DeviceCategory a() {
        android.app.UiModeManager uiModeManager = f4443a;
        if (uiModeManager == null) {
            return com.iab.omid.library.inmobi.adsession.DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? com.iab.omid.library.inmobi.adsession.DeviceCategory.OTHER : com.iab.omid.library.inmobi.adsession.DeviceCategory.CTV : com.iab.omid.library.inmobi.adsession.DeviceCategory.MOBILE;
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            f4443a = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }
}
