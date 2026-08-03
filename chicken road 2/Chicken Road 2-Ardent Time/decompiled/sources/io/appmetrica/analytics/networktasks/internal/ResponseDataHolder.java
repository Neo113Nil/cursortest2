package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f7422a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f7423b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map f7424c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker f7425d;

    public ResponseDataHolder(io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker responseValidityChecker) {
        this.f7425d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f7422a;
    }

    public byte[] getResponseData() {
        return this.f7423b;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.f7424c;
    }

    public boolean isValidResponse() {
        return this.f7425d.isResponseValid(this.f7422a);
    }

    public void setResponseCode(int i2) {
        this.f7422a = i2;
    }

    public void setResponseData(byte[] bArr) {
        this.f7423b = bArr;
    }

    public void setResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.f7424c = map;
    }
}
