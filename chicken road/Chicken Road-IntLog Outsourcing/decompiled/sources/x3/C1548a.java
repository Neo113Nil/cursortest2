package x3;

import javax.net.ssl.SSLContext;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f12300a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12301b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12302c;

    /* renamed from: d, reason: collision with root package name */
    public final com.onesignal.otel.config.a f12303d;

    /* renamed from: e, reason: collision with root package name */
    public final K3.a f12304e;

    /* renamed from: f, reason: collision with root package name */
    public final SSLContext f12305f;

    public C1548a(String str, long j2, long j6, com.onesignal.otel.config.a aVar, K3.a aVar2, SSLContext sSLContext) {
        if (str == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.f12300a = str;
        this.f12301b = j2;
        this.f12302c = j6;
        this.f12303d = aVar;
        this.f12304e = aVar2;
        this.f12305f = sSLContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        C1548a c1548a = (C1548a) ((i) obj);
        if (this.f12300a.equals(c1548a.f12300a)) {
            c1548a.getClass();
            if (this.f12301b == c1548a.f12301b && this.f12302c == c1548a.f12302c && this.f12303d.equals(c1548a.f12303d)) {
                K3.a aVar = c1548a.f12304e;
                K3.a aVar2 = this.f12304e;
                if (aVar2 != null ? aVar2.equals(aVar) : aVar == null) {
                    SSLContext sSLContext = c1548a.f12305f;
                    SSLContext sSLContext2 = this.f12305f;
                    if (sSLContext2 == null) {
                        if (sSLContext == null) {
                            return true;
                        }
                    } else if (sSLContext2.equals(sSLContext)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f12300a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ (-1575588001)) * 1000003;
        long j2 = this.f12301b;
        int i2 = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j6 = this.f12302c;
        int hashCode2 = (((i2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f12303d.hashCode()) * (-721379959);
        K3.a aVar = this.f12304e;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        SSLContext sSLContext = this.f12305f;
        return (hashCode3 ^ (sSLContext != null ? sSLContext.hashCode() : 0)) * (-721379959);
    }

    public final String toString() {
        return "HttpSenderConfig{endpoint=" + this.f12300a + ", compressor=null, exportAsJson=false, contentType=application/x-protobuf, timeoutNanos=" + this.f12301b + ", connectTimeoutNanos=" + this.f12302c + ", headersSupplier=" + this.f12303d + ", proxyOptions=null, retryPolicy=" + this.f12304e + ", sslContext=" + this.f12305f + ", trustManager=null, executorService=null}";
    }
}
