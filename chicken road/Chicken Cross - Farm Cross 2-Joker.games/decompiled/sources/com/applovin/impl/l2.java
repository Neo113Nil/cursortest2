package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class l2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4279a;
    private final com.applovin.impl.sdk.p b;

    public l2(com.applovin.impl.sdk.l lVar) {
        this.f4279a = lVar;
        this.b = lVar.Q();
    }

    @Override // com.applovin.impl.k2
    public InputStream a(String str, String str2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f4279a.a(c5.b3)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f4279a.a(c5.c3)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        if (StringUtils.isValidString(str2)) {
            httpURLConnection.setRequestProperty("Range", "bytes=" + str2);
        }
        int responseCode = httpURLConnection.getResponseCode();
        this.f4279a.E().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (s0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", hashMap);
        this.f4279a.g().d(h2.T, hashMap);
        return inputStream;
    }
}
