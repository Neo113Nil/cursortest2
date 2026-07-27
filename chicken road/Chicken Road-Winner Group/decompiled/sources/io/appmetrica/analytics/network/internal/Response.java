package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8862a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8863b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8864c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8865d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f8866e;
    private final Throwable f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8867g;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f8863b;
    }

    public byte[] getErrorData() {
        return this.f8865d;
    }

    public Throwable getException() {
        return this.f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f8866e;
    }

    public byte[] getResponseData() {
        return this.f8864c;
    }

    public String getUrl() {
        return this.f8867g;
    }

    public boolean isCompleted() {
        return this.f8862a;
    }

    public String toString() {
        return "Response{completed=" + this.f8862a + ", code=" + this.f8863b + ", responseDataLength=" + this.f8864c.length + ", errorDataLength=" + this.f8865d.length + ", headers=" + this.f8866e + ", exception=" + this.f + ", url=" + this.f8867g + '}';
    }

    public Response(boolean z3, int i3, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this(z3, i3, bArr, bArr2, map, th, null);
    }

    public Response(boolean z3, int i3, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th, String str) {
        Map a3;
        this.f8862a = z3;
        this.f8863b = i3;
        this.f8864c = bArr;
        this.f8865d = bArr2;
        if (map == null) {
            a3 = Collections.EMPTY_MAP;
        } else {
            a3 = e.a(map);
        }
        this.f8866e = a3;
        this.f = th;
        this.f8867g = str;
    }
}
