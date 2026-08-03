package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.impl.a f7384a;

    /* renamed from: b, reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f7385b;

    public interface Client {
        java.lang.String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(java.lang.String str, byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this(new io.appmetrica.analytics.networktasks.impl.a(), sSLSocketFactory);
    }

    public void performConnection(java.lang.String str, io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client client) {
        io.appmetrica.analytics.networkapi.Response a2;
        int code;
        java.lang.String str2;
        try {
            io.appmetrica.analytics.networktasks.impl.a aVar = this.f7384a;
            java.lang.String oldETag = client.getOldETag();
            javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.f7385b;
            aVar.getClass();
            a2 = io.appmetrica.analytics.networktasks.impl.a.a(oldETag, str, sSLSocketFactory);
            code = a2.getCode();
        } catch (java.lang.Throwable unused) {
        }
        if (code != 200) {
            if (code != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        java.util.List list = (java.util.List) io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(a2.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (java.lang.String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, a2.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(io.appmetrica.analytics.networktasks.impl.a aVar, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.f7384a = aVar;
        this.f7385b = sSLSocketFactory;
    }
}
