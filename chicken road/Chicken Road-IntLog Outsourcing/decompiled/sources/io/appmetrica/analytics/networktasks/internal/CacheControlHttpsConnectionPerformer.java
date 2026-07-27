package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a, reason: collision with root package name */
    private final a f9858a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f9859b;

    public interface Client {
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(String str, byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    public void performConnection(String str, Client client) {
        Response a6;
        int code;
        String str2;
        try {
            a aVar = this.f9858a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f9859b;
            aVar.getClass();
            a6 = a.a(oldETag, str, sSLSocketFactory);
            code = a6.getCode();
        } catch (Throwable unused) {
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
        List list = (List) CollectionUtils.getFromMapIgnoreCase(a6.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, a6.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f9858a = aVar;
        this.f9859b = sSLSocketFactory;
    }
}
