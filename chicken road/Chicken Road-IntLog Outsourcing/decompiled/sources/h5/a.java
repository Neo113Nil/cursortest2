package h5;

import a.AbstractC0169a;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends AbstractC0169a {

    /* renamed from: g, reason: collision with root package name */
    public final d f5825g;

    public a(d trustRootIndex) {
        i.e(trustRootIndex, "trustRootIndex");
        this.f5825g = trustRootIndex;
    }

    public static boolean U(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i2) {
        if (!i.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i2) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // a.AbstractC0169a
    public final List c(String hostname, List chain) {
        i.e(chain, "chain");
        i.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i.d(removeFirst, "removeFirst(...)");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a6 = this.f5825g.a(x509Certificate);
            if (a6 == null) {
                Iterator it = arrayDeque.iterator();
                i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    i.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (U(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a6)) {
                arrayList.add(a6);
            }
            if (U(a6, a6, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && i.a(((a) obj).f5825g, this.f5825g);
    }

    public final int hashCode() {
        return this.f5825g.hashCode();
    }
}
