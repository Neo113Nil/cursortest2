package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class i4 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4242a;
    private final com.applovin.impl.sdk.p b;
    private final AtomicReference c = new AtomicReference();

    public i4(com.applovin.impl.sdk.l lVar) {
        this.f4242a = lVar;
        this.b = lVar.Q();
    }

    private OkHttpClient a() {
        Object obj = this.c.get();
        if (obj == null) {
            synchronized (this.c) {
                obj = this.c.get();
                if (obj == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    long intValue = ((Integer) this.f4242a.a(c5.b3)).intValue();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    obj = builder.connectTimeout(intValue, timeUnit).readTimeout(((Integer) this.f4242a.a(c5.c3)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                    if (obj == null) {
                        obj = this.c;
                    }
                    this.c.set(obj);
                }
            }
        }
        if (obj == this.c) {
            obj = null;
        }
        return (OkHttpClient) obj;
    }

    @Override // com.applovin.impl.k2
    public InputStream a(String str, String str2, Map map) {
        Request.Builder builder = new Request.Builder().url(str).get();
        if (StringUtils.isValidString(str2)) {
            builder.addHeader("Range", "bytes=" + str2);
        }
        Response execute = a().newCall(builder.build()).execute();
        int code = execute.code();
        this.f4242a.E().a("loadResource", str, code, execute.message());
        if (s0.a(code)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody body = execute.body();
        if (body == null) {
            return null;
        }
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", hashMap);
        CollectionUtils.putStringIfValid("details", execute.protocol().name(), hashMap);
        this.f4242a.g().d(h2.T, hashMap);
        return body.byteStream();
    }
}
