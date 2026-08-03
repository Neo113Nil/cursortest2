package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vh {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.KProperty[] f5017a = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.Vh.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static org.json.JSONObject a(java.lang.String browser, java.lang.String event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(browser, "browser");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, event);
        return jSONObject;
    }
}
