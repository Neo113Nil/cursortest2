package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class p1 extends i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f5506a = new OkHttpClient().newBuilder().build();

    public static HashMap b(Response response) {
        HashMap hashMap = new HashMap();
        if (response != null) {
            Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                String name = headers.name(i);
                hashMap.put(name, Collections.singletonList(headers.get(name)));
            }
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair a2 = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = a2.second;
            String message = obj != null ? ((Response) obj).message() : "";
            FilterInputStream a3 = a((Response) a2.second);
            Object obj2 = a2.second;
            int code = obj2 == null ? -1 : ((Response) obj2).code();
            HashMap b = b((Response) a2.second);
            Response response = (Response) a2.second;
            o1 o1Var = new o1(i.a(a3, code, message, b, response != null ? response.headers().get(HttpHeaders.LAST_MODIFIED) : null), (Response) a2.second);
            Iterator it = ((List) a2.first).iterator();
            while (it.hasNext()) {
                o1Var.f.add((String) it.next());
            }
            return o1Var;
        } catch (b e) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e.getMessage());
            throw e;
        } catch (Exception e2) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e2.getMessage());
            throw e2;
        }
    }

    public final Pair a(String str, t0 t0Var, ArrayList arrayList, String str2, String str3) {
        String header;
        l1 p = t0Var.p();
        Request.Builder builder = new Request.Builder();
        a(builder, HttpHeaders.ACCEPT_ENCODING, "gzip");
        a(builder, "User-Agent", str2);
        a(builder, HttpHeaders.IF_MODIFIED_SINCE, str3);
        Map l = t0Var.l();
        if (l != null) {
            for (String str4 : l.keySet()) {
                a(builder, str4, (String) l.get(str4));
            }
        }
        builder.url(str);
        if (t0Var.m() == m0.POST || t0Var.m() == m0.PUT) {
            byte[] f = t0Var.f();
            if (f != null) {
                builder.post(RequestBody.create(f, MediaType.parse(t0Var.n())));
            } else {
                throw new Exception("Could not create ok http request. post payload is null");
            }
        }
        Request build = builder.build();
        boolean z = !(t0Var instanceof h1);
        OkHttpClient.Builder followSslRedirects = this.f5506a.newBuilder().followRedirects(z).followSslRedirects(z);
        long j = p.f5501a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient build2 = followSslRedirects.connectTimeout(j, timeUnit).readTimeout(p.b, timeUnit).build();
        t0Var.c(System.currentTimeMillis());
        IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.g);
        try {
            try {
                Response execute = build2.newCall(build).execute();
                if ((t0Var instanceof h1) && (((execute.code() > 300 && execute.code() < 304) || execute.code() == 307 || execute.code() == 308) && (header = execute.header(HttpHeaders.LOCATION, "")) != null)) {
                    if (!header.startsWith(ProxyConfig.MATCH_HTTP) && !header.contains("://") && arrayList.size() > 0) {
                        Uri parse = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                        header = String.format(header.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), header);
                    }
                    String str5 = header;
                    arrayList.add(str5);
                    if (arrayList.size() <= 5) {
                        return a(str5, t0Var, arrayList, str2, str3);
                    }
                    throw new b("Url chain too big for us");
                }
                return new Pair(arrayList, execute);
            } catch (Exception e) {
                throw new b(e);
            }
        } finally {
            t0Var.a(System.currentTimeMillis());
            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
        }
    }

    public static FilterInputStream a(Response response) {
        if (response == null) {
            return null;
        }
        try {
            if (response.body() == null) {
                return null;
            }
            return i.a(response.body().byteStream(), TextUtils.equals("gzip", response.headers().get("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Request.Builder builder, String str, String str2) {
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
