package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f9896a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f9897b;

    /* renamed from: c, reason: collision with root package name */
    private Map f9898c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f9899d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f9899d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f9896a;
    }

    public byte[] getResponseData() {
        return this.f9897b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f9898c;
    }

    public boolean isValidResponse() {
        return this.f9899d.isResponseValid(this.f9896a);
    }

    public void setResponseCode(int i2) {
        this.f9896a = i2;
    }

    public void setResponseData(byte[] bArr) {
        this.f9897b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f9898c = map;
    }
}
