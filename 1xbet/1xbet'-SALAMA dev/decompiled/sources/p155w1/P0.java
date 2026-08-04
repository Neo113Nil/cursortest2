package p155w1;

import android.net.http.X509TrustManagerExtensions;
import android.util.Base64;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f17500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X509TrustManagerExtensions f17501b;

    static {
        TrustManagerFactory trustManagerFactory;
        HashSet hashSet = new HashSet(13);
        f17500a = hashSet;
        hashSet.add("WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=");
        hashSet.add("SVqWumuteCQHvVIaALrOZXuzVVVeS7f4FGxxu6V+es4=");
        hashSet.add("cAajgxHlj7GTSEIzIYIQxmEloOSoJq7VOaxWHfv72QM=");
        hashSet.add("I/Lt/z7ekCWanjD0Cvj5EqXls2lOaThEA0H2Bg4BT/o=");
        hashSet.add("Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw=");
        hashSet.add("JbQbUG5JMJUoI6brnx0x3vZF6jilxsapbXGVfjhN8Fg=");
        hashSet.add("r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
        hashSet.add("UZJDjsNp1+4M5x9cbbdflB779y5YRBcV6Z6rBMLIrO4=");
        hashSet.add("lnsM2T/O9/J84sJFdnrpsFp3awZJ+ZZbYpCWhGloaHI=");
        hashSet.add("i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY=");
        hashSet.add("uUwZgwDOxcBXrQcntwu+kYFpkiVkOaezL0WYEZ3anJc=");
        hashSet.add("dolnbtzEBnELx/9lOEQ22e6OZO/QNb6VSSX2XHA3E7A=");
        hashSet.add("2fRAUXyxl4A1/XHrKNBmc8bTkzA7y4FB/GLJuNAzCqY=");
        X509TrustManager x509TrustManager = null;
        f17501b = null;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            try {
                trustManagerFactory.init((KeyStore) null);
            } catch (KeyStoreException e7) {
                e = e7;
                AbstractC0997i0.r("Error in getting trust manager: ", e);
            } catch (NoSuchAlgorithmException e8) {
                e = e8;
                AbstractC0997i0.r("Error in getting trust manager: ", e);
            }
        } catch (KeyStoreException e9) {
            e = e9;
            trustManagerFactory = null;
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            trustManagerFactory = null;
        }
        if (trustManagerFactory != null) {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    x509TrustManager = (X509TrustManager) trustManager;
                    break;
                }
            }
        }
        f17501b = new X509TrustManagerExtensions(x509TrustManager);
    }

    public static void a(HttpsURLConnection httpsURLConnection) throws SSLPeerUnverifiedException {
        X509TrustManagerExtensions x509TrustManagerExtensions = f17501b;
        if (x509TrustManagerExtensions == null) {
            return;
        }
        String str = "";
        try {
            Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
            List<X509Certificate> listCheckServerTrusted = x509TrustManagerExtensions.checkServerTrusted((X509Certificate[]) Arrays.copyOf(serverCertificates, serverCertificates.length, X509Certificate[].class), "RSA", httpsURLConnection.getURL().getHost());
            if (listCheckServerTrusted == null) {
                throw new SSLPeerUnverifiedException("Empty trusted chain Certificate.");
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (X509Certificate x509Certificate : listCheckServerTrusted) {
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                messageDigest.update(encoded, 0, encoded.length);
                String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 2);
                if (f17500a.contains(strEncodeToString)) {
                    "Found matched pin: ".concat(String.valueOf(strEncodeToString));
                    return;
                }
                str = str + "    sha256/" + strEncodeToString + ": " + x509Certificate.getSubjectDN().toString() + "\n";
            }
            throw new SSLPeerUnverifiedException("Certificate pinning failure!\n  Peer certificate chain:\n".concat(String.valueOf(str)));
        } catch (NoSuchAlgorithmException e7) {
            AbstractC0997i0.r("Error in validating pinning: ", e7);
        } catch (CertificateException e8) {
            AbstractC0997i0.r("Error in getting certificate: ", e8);
        }
    }
}
