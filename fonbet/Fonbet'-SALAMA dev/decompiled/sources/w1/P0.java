package w1;

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

/* loaded from: classes.dex */
public abstract class P0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f17494a;

    /* renamed from: b, reason: collision with root package name */
    public static final X509TrustManagerExtensions f17495b;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    static {
        TrustManagerFactory trustManagerFactory;
        HashSet hashSet = new HashSet(13);
        f17494a = hashSet;
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
        f17495b = null;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        } catch (KeyStoreException e7) {
            e = e7;
            trustManagerFactory = null;
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            trustManagerFactory = null;
        }
        try {
            trustManagerFactory.init((KeyStore) null);
        } catch (KeyStoreException e9) {
            e = e9;
            AbstractC1706i0.r("Error in getting trust manager: ", e);
            if (trustManagerFactory != null) {
            }
            f17495b = new X509TrustManagerExtensions(x509TrustManager);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            AbstractC1706i0.r("Error in getting trust manager: ", e);
            if (trustManagerFactory != null) {
            }
            f17495b = new X509TrustManagerExtensions(x509TrustManager);
        }
        if (trustManagerFactory != null) {
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            int length = trustManagers.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                TrustManager trustManager = trustManagers[i7];
                if (trustManager instanceof X509TrustManager) {
                    x509TrustManager = (X509TrustManager) trustManager;
                    break;
                }
                i7++;
            }
        }
        f17495b = new X509TrustManagerExtensions(x509TrustManager);
    }

    public static void a(HttpsURLConnection httpsURLConnection) {
        List<X509Certificate> checkServerTrusted;
        X509TrustManagerExtensions x509TrustManagerExtensions = f17495b;
        if (x509TrustManagerExtensions == null) {
            return;
        }
        String str = "";
        try {
            Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
            checkServerTrusted = x509TrustManagerExtensions.checkServerTrusted((X509Certificate[]) Arrays.copyOf(serverCertificates, serverCertificates.length, X509Certificate[].class), "RSA", httpsURLConnection.getURL().getHost());
        } catch (NoSuchAlgorithmException e7) {
            AbstractC1706i0.r("Error in validating pinning: ", e7);
        } catch (CertificateException e8) {
            AbstractC1706i0.r("Error in getting certificate: ", e8);
        }
        if (checkServerTrusted == null) {
            throw new SSLPeerUnverifiedException("Empty trusted chain Certificate.");
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        for (X509Certificate x509Certificate : checkServerTrusted) {
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            messageDigest.update(encoded, 0, encoded.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            if (f17494a.contains(encodeToString)) {
                "Found matched pin: ".concat(String.valueOf(encodeToString));
                return;
            }
            str = str + "    sha256/" + encodeToString + ": " + x509Certificate.getSubjectDN().toString() + "\n";
        }
        throw new SSLPeerUnverifiedException("Certificate pinning failure!\n  Peer certificate chain:\n".concat(String.valueOf(str)));
    }
}
