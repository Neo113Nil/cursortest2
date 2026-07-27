package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f8919a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f8920b;

    /* renamed from: c, reason: collision with root package name */
    private Map f8921c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f8922d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f8922d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f8919a;
    }

    public byte[] getResponseData() {
        return this.f8920b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f8921c;
    }

    public boolean isValidResponse() {
        return this.f8922d.isResponseValid(this.f8919a);
    }

    public void setResponseCode(int i3) {
        this.f8919a = i3;
    }

    public void setResponseData(byte[] bArr) {
        this.f8920b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f8921c = map;
    }
}
