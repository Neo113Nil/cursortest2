package Ve;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ti implements Be {

    /* renamed from: a, reason: collision with root package name */
    public final Vl f30054a;

    /* renamed from: b, reason: collision with root package name */
    public SSLContext f30055b;

    /* renamed from: c, reason: collision with root package name */
    public TrustManager[] f30056c;

    /* renamed from: d, reason: collision with root package name */
    public X509TrustManager f30057d;

    /* renamed from: e, reason: collision with root package name */
    public Si f30058e;

    public Ti(Vl sPaySdkConfigRepository) {
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f30054a = sPaySdkConfigRepository;
    }

    @Override // Ve.Be
    public final X509TrustManager a() {
        X509TrustManager x509TrustManager = this.f30057d;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        Intrinsics.n("customX509TrustManager");
        throw null;
    }

    @Override // Ve.Be
    public final SSLContext b() {
        SSLContext sSLContext = this.f30055b;
        if (sSLContext != null) {
            return sSLContext;
        }
        Intrinsics.n("customSSLContext");
        throw null;
    }

    @Override // Ve.Be
    public final HostnameVerifier c() {
        Si si2 = this.f30058e;
        if (si2 != null) {
            return si2;
        }
        Intrinsics.n("hostnameVerifier");
        throw null;
    }
}
