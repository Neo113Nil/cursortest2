package com.iab.omid.library.unity3d.utils;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static android.app.UiModeManager f4514a;

    public static com.iab.omid.library.unity3d.adsession.DeviceCategory a() {
        android.app.UiModeManager uiModeManager = f4514a;
        if (uiModeManager == null) {
            return com.iab.omid.library.unity3d.adsession.DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? com.iab.omid.library.unity3d.adsession.DeviceCategory.OTHER : com.iab.omid.library.unity3d.adsession.DeviceCategory.CTV : com.iab.omid.library.unity3d.adsession.DeviceCategory.MOBILE;
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            f4514a = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }
}
