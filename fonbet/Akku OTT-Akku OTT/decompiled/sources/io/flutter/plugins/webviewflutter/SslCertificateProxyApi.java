package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.cert.X509Certificate;
import java.util.Date;

/* loaded from: classes3.dex */
class SslCertificateProxyApi extends PigeonApiSslCertificate {
    public SslCertificateProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    @Nullable
    public SslCertificate.DName getIssuedBy(@NonNull SslCertificate sslCertificate) {
        return sslCertificate.getIssuedBy();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    @Nullable
    public SslCertificate.DName getIssuedTo(@NonNull SslCertificate sslCertificate) {
        return sslCertificate.getIssuedTo();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    @Nullable
    public Long getValidNotAfterMsSinceEpoch(@NonNull SslCertificate sslCertificate) {
        Date validNotAfterDate = sslCertificate.getValidNotAfterDate();
        if (validNotAfterDate != null) {
            return Long.valueOf(validNotAfterDate.getTime());
        }
        return null;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    @Nullable
    public Long getValidNotBeforeMsSinceEpoch(@NonNull SslCertificate sslCertificate) {
        Date validNotBeforeDate = sslCertificate.getValidNotBeforeDate();
        if (validNotBeforeDate != null) {
            return Long.valueOf(validNotBeforeDate.getTime());
        }
        return null;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    @Nullable
    public X509Certificate getX509Certificate(@NonNull SslCertificate sslCertificate) {
        X509Certificate x509Certificate;
        if (getPigeonRegistrar().sdkIsAtLeast(29)) {
            x509Certificate = sslCertificate.getX509Certificate();
            return x509Certificate;
        }
        getPigeonRegistrar().createUnsupportedVersionMessage("SslCertificate.getX509Certificate", "Build.VERSION_CODES.Q");
        return null;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslCertificate
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
