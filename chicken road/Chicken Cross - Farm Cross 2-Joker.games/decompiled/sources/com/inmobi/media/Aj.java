package com.inmobi.media;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Aj implements InterfaceC3853kh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f6458a;

    public Aj(Ej ej) {
        this.f6458a = ej;
    }

    public final void a(String id, int i, String str, long j, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullExpressionValue(Ej.j1, "access$getTAG$cp(...)");
        String str2 = "Ping Ack received for id: " + id + ", statusCode: " + i + ", message: " + str + ", timestamp: " + j;
        JSONObject a2 = AbstractC4275zj.a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
        if (str != null) {
            a2.put("msg", str);
        }
        a2.put("retryCount", i2);
        String jSONObject = a2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        this.f6458a.h("window.imraidview.broadcastEvent('onPingComplete', '" + id + "', " + j + ", '" + jSONObject + "');");
    }
}
