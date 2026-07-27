package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Request {

    /* renamed from: a, reason: collision with root package name */
    private final String f8854a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8855b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8856c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8857d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f8858a;

        /* renamed from: b, reason: collision with root package name */
        private String f8859b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f8860c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final HashMap f8861d = new HashMap();

        public Builder(String str) {
            this.f8858a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f8861d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f8858a, this.f8859b, this.f8860c, this.f8861d, 0);
        }

        public Builder post(byte[] bArr) {
            this.f8860c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f8859b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int i3) {
        this(str, str2, bArr, hashMap);
    }

    public byte[] getBody() {
        return this.f8856c;
    }

    public Map<String, String> getHeaders() {
        return this.f8857d;
    }

    public String getMethod() {
        return this.f8855b;
    }

    public String getUrl() {
        return this.f8854a;
    }

    public String toString() {
        return "Request{url=" + this.f8854a + ", method='" + this.f8855b + "', bodyLength=" + this.f8856c.length + ", headers=" + this.f8857d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.f8854a = str;
        this.f8855b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f8856c = bArr;
        this.f8857d = e.a(hashMap);
    }
}
