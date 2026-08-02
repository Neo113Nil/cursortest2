package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class k implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        android.view.Display display;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        android.util.DisplayMetrics displayMetrics = null;
        try {
            java.lang.Object systemService = context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            display = ((android.hardware.display.DisplayManager) systemService).getDisplay(0);
        } catch (java.lang.UnsupportedOperationException unused) {
            display = null;
        }
        if (display == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        try {
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (java.lang.UnsupportedOperationException unused2) {
        }
        if (displayMetrics == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        int rotation = display.getRotation();
        if (rotation == 0) {
            linkedHashMap.put("DOR", "PORTRAIT");
        } else if (rotation == 1) {
            linkedHashMap.put("DOR", "LEFT");
        } else if (rotation == 2) {
            linkedHashMap.put("DOR", "UPSIDEDOWN");
        } else if (rotation == 3) {
            linkedHashMap.put("DOR", "RIGHT");
        }
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append('X');
        sb.append(i2);
        linkedHashMap.put("RES", sb.toString());
        java.lang.Object systemService2 = context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
        linkedHashMap.put("SCREENSDETECTED", java.lang.String.valueOf(((android.hardware.display.DisplayManager) systemService2).getDisplays().length));
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "205cd9";
    }
}
