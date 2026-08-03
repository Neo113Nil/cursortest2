package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rl implements io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yl f4917a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.V2 f4918b;

    public Rl() {
        this(new io.appmetrica.analytics.impl.Yl(), new io.appmetrica.analytics.impl.V2());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0314dm handle(io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder) {
        java.lang.String str;
        java.lang.String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders = responseDataHolder.getResponseHeaders();
            java.util.List list = responseHeaders != null ? (java.util.List) io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f4918b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                io.appmetrica.analytics.impl.Yl yl = this.f4917a;
                yl.getClass();
                io.appmetrica.analytics.impl.C0314dm c0314dm = new io.appmetrica.analytics.impl.C0314dm();
                try {
                    yl.f5362h.getClass();
                    io.appmetrica.analytics.impl.C0354fb c0354fb = new io.appmetrica.analytics.impl.C0354fb(new java.lang.String(responseData, "UTF-8"));
                    org.json.JSONObject optJSONObject = c0354fb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0314dm.f5740h = str2;
                    c0314dm.f5741i = str;
                    yl.a(c0314dm, c0354fb);
                    c0314dm.f5733a = android.text.TextUtils.isEmpty(c0314dm.f5741i) ? 1 : 2;
                } catch (java.lang.Throwable unused) {
                    c0314dm = new io.appmetrica.analytics.impl.C0314dm();
                    c0314dm.f5733a = 1;
                }
                if (2 == c0314dm.f5733a) {
                    return c0314dm;
                }
            }
        }
        return null;
    }

    public Rl(io.appmetrica.analytics.impl.Yl yl, io.appmetrica.analytics.impl.V2 v2) {
        this.f4917a = yl;
        this.f4918b = v2;
    }
}
