package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3855kj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f7205a = {Reflection.property1(new PropertyReference1Impl(C3855kj.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String browser, String event) {
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, event);
        return jSONObject;
    }
}
