package K4;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.l;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class a extends AbstractC2425d {

    /* renamed from: k, reason: collision with root package name */
    public final d f2893k;

    public a(d dVar) {
        l.f("trustRootIndex", dVar);
        this.f2893k = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && l.a(((a) obj).f2893k, this.f2893k);
    }

    public final int hashCode() {
        return this.f2893k.hashCode();
    }

    @Override // t3.AbstractC2425d
    public final List n(String str, List list) {
        l.f("chain", list);
        l.f("hostname", str);
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        l.e("queue.removeFirst()", removeFirst);
        arrayList.add(removeFirst);
        boolean z3 = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a5 = this.f2893k.a(x509Certificate);
            if (a5 == null) {
                Iterator it = arrayDeque.iterator();
                l.e("queue.iterator()", it);
                while (it.hasNext()) {
                    Object next = it.next();
                    l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", next);
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (l.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z3) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a5)) {
                arrayList.add(a5);
            }
            if (l.a(a5.getIssuerDN(), a5.getSubjectDN())) {
                try {
                    a5.verify(a5.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z3 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
