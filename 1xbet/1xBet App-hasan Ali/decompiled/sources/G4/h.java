package G4;

import X3.o;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import y4.v;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1999d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2000c;

    static {
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z3 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1999d = z3;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        kotlin.jvm.internal.l.e("newProvider()", newProvider);
        this.f2000c = newProvider;
    }

    @Override // G4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((v) obj) != v.f21427l) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(o.S(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((v) obj2).f21434k);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // G4.n
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // G4.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f2000c);
        kotlin.jvm.internal.l.e("getInstance(\"TLS\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // G4.n
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k5 = k();
        k5.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k5.getSocketFactory();
        kotlin.jvm.internal.l.e("newSSLContext().apply {\n…null)\n    }.socketFactory", socketFactory);
        return socketFactory;
    }

    @Override // G4.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.l.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f1998a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.l.e("toString(this)", arrays);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
