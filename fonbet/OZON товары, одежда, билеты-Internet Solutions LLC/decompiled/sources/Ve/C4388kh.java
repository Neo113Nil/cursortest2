package Ve;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* renamed from: Ve.kh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4388kh implements Be {

    /* renamed from: a, reason: collision with root package name */
    public final Vl f31440a;

    /* renamed from: b, reason: collision with root package name */
    public SSLContext f31441b;

    /* renamed from: c, reason: collision with root package name */
    public TrustManager[] f31442c;

    /* renamed from: d, reason: collision with root package name */
    public X509TrustManager f31443d;

    /* renamed from: e, reason: collision with root package name */
    public C4359jh f31444e;

    public C4388kh(Vl sPaySdkConfigRepository) {
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f31440a = sPaySdkConfigRepository;
    }

    @Override // Ve.Be
    public final X509TrustManager a() {
        X509TrustManager x509TrustManager = this.f31443d;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        Intrinsics.n("customX509TrustManager");
        throw null;
    }

    @Override // Ve.Be
    public final SSLContext b() {
        SSLContext sSLContext = this.f31441b;
        if (sSLContext != null) {
            return sSLContext;
        }
        Intrinsics.n("customSSLContext");
        throw null;
    }

    @Override // Ve.Be
    public final HostnameVerifier c() {
        C4359jh c4359jh = this.f31444e;
        if (c4359jh != null) {
            return c4359jh;
        }
        Intrinsics.n("hostnameVerifier");
        throw null;
    }

    public final HostnameVerifier d() {
        final ArrayList t2 = C7714v.t(C4515p.a("IyN8cAklNG04Lmk5Cjs7HzYjIWkWKDADfjs0CAwbfR5zF0BA"), C4515p.a("IyNlFCM7ND41IyUSLC40C387NBg1Iz0gLC8udDQ7LQcADTdpcxRAQA=="), C4515p.a("IyN8Ei8BKnQaASgHABskFi8BNHQaOTJ4aiM4ERYXa3A0Oy0HAA03aXMUQEA="), C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEgFAo8KSk1DT0WCS5AQA=="), C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEgFAo8KSk1DX0CFixAQA=="), C4515p.a("IyNwZRApIXQ0OTQLNRg0DiwUInQeAjQhHyM4YSwBaAcKPDt4GyU3DgYpQEA="), C4515p.a("IyNwDS8uLTIgOikHNSIhEnMuLRB+Oy0fACM7FhYXQEA="), C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEhFAo8KSk1DX0CFixAQA=="), C4515p.a("IyNlFCM7NCYPIyU0CSkiBwo5KyEfJSUgBi5AQA=="), C4515p.a("IyN8Ei8BKnQaASgHABskFi8BNHQaOTJ4aiN9FhkXaHQeOikbNSJ9FnIsMi0KOisPACN9AhYsQEA="), C4515p.a("IyNwZRApIXQ0OTQLNRg0DiwUInQeAjQhHyM4YQYpIhcKPDR9DxghEgkpIjV/ATE1ahg9FgkuQEA="), C4515p.a("IyNpCyMUM3gPGCQSGRcxDyMUNQsPGzQKci4qDxo5MgM1DX0wGRdAQA=="), C4515p.a("IyN8GDYiOBEZFzEPIxRxFw8gOQkWLEBA"), C4515p.a("IyN8GDYiOBEZFzEPIxQxAxAiOQkWLEBA"), C4515p.a("IyNwZRApIXQkOy0HaiI4CRYsQEA="), C4515p.a("IyNwZRApIXQ0OzEpNQw4MwYuMHQePXV0NSI6aTguLi1/ATh8MSIhAnIvIg9+OjgDDw0hICwUQEA="));
        SPaySdkConfig sPaySdkConfig = ((C4712vn) this.f31440a).f32313c;
        if (sPaySdkConfig == null) {
            throw C4317i3.f31235a;
        }
        final ArrayList<String> sslPins = sPaySdkConfig.getSslPins();
        if (sslPins == null) {
            sslPins = new ArrayList<>();
        }
        return new HostnameVerifier() { // from class: Ve.jh
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                ArrayList trustedHostsList = t2;
                Intrinsics.checkNotNullParameter(trustedHostsList, "$trustedHostsList");
                C4388kh this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ArrayList trustedPins = sslPins;
                Intrinsics.checkNotNullParameter(trustedPins, "$trustedPins");
                if (trustedHostsList.contains(str)) {
                    Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                    Intrinsics.checkNotNullExpressionValue(peerCertificates, "session.peerCertificates");
                    for (Certificate certificate : peerCertificates) {
                        Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        this$0.getClass();
                        if (trustedPins.contains(Lf.a.l0((X509Certificate) certificate))) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
    }
}
