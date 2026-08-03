package com.inmobi.media;

/* renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2568li implements com.inmobi.media.InterfaceC2513jg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5319a;

    public C2568li(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5319a = gestureDetectorOnGestureListenerC2675pi;
    }

    public final void a(java.lang.String id, int i, java.lang.String str, long j, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1, "access$getTAG$cp(...)");
        org.json.JSONObject a2 = com.inmobi.media.AbstractC2541ki.a("code", i);
        if (str != null) {
            a2.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str);
        }
        a2.put("retryCount", i2);
        java.lang.String jSONObject = a2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        this.f5319a.h("window.imraidview.broadcastEvent('onPingComplete', '" + id + "', " + j + ", '" + jSONObject + "');");
    }
}
