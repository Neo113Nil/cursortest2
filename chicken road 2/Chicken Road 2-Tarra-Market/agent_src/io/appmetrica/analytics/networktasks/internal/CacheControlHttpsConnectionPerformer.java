package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a, reason: collision with root package name */
    private final a f5494a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f5495b;

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
        Response a2;
        int code;
        String str2;
        try {
            a aVar = this.f5494a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f5495b;
            aVar.getClass();
            a2 = a.a(oldETag, str, sSLSocketFactory);
            code = a2.getCode();
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
        List list = (List) CollectionUtils.getFromMapIgnoreCase(a2.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, a2.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f5494a = aVar;
        this.f5495b = sSLSocketFactory;
    }
}
