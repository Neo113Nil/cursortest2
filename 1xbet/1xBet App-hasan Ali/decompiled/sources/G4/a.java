package G4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1984d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1985c;

    static {
        f1984d = j3.i.v() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i = 0;
        ArrayList E0 = X3.l.E0(new H4.n[]{(!j3.i.v() || Build.VERSION.SDK_INT < 29) ? null : new H4.a(), new H4.m(H4.f.f), new H4.m(H4.k.f2379a), new H4.m(H4.h.f2375a)});
        ArrayList arrayList = new ArrayList();
        int size = E0.size();
        while (i < size) {
            Object obj = E0.get(i);
            i++;
            if (((H4.n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f1985c = arrayList;
    }

    @Override // G4.n
    public final AbstractC2425d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        H4.b bVar = x509TrustManagerExtensions != null ? new H4.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new K4.a(c(x509TrustManager));
    }

    @Override // G4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = this.f1985c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((H4.n) obj).a(sSLSocket)) {
                break;
            }
        }
        H4.n nVar = (H4.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // G4.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f1985c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((H4.n) obj).a(sSLSocket)) {
                break;
            }
        }
        H4.n nVar = (H4.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // G4.n
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.l.f("hostname", str);
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
