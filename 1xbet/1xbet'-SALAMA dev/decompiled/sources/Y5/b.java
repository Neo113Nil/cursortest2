package Y5;

import G4.A;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7771e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f7773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f7774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7775d;

    static {
        a[] aVarArr = {a.f7758F, a.f7759G, a.f7760H, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.f7757E, a.f7756D, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        A a2 = new A(true);
        a2.c(aVarArr);
        l lVar = l.TLS_1_3;
        l lVar2 = l.TLS_1_2;
        a2.f(lVar, lVar2);
        if (!a2.f2871a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        a2.f2872b = true;
        b bVar = new b(a2);
        f7771e = bVar;
        A a4 = new A(bVar);
        a4.f(lVar, lVar2, l.TLS_1_1, l.TLS_1_0);
        if (!a4.f2871a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        a4.f2872b = true;
        new b(a4);
        new b(new A(false));
    }

    public b(A a2) {
        this.f7772a = a2.f2871a;
        this.f7773b = (String[]) a2.f2873c;
        this.f7774c = (String[]) a2.f2874d;
        this.f7775d = a2.f2872b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z4 = bVar.f7772a;
        boolean z7 = this.f7772a;
        if (z7 != z4) {
            return false;
        }
        return !z7 || (Arrays.equals(this.f7773b, bVar.f7773b) && Arrays.equals(this.f7774c, bVar.f7774c) && this.f7775d == bVar.f7775d);
    }

    public final int hashCode() {
        if (this.f7772a) {
            return ((((527 + Arrays.hashCode(this.f7773b)) * 31) + Arrays.hashCode(this.f7774c)) * 31) + (!this.f7775d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        l lVar;
        if (!this.f7772a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f7773b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                String str = strArr[i7];
                aVarArr[i7] = str.startsWith("SSL_") ? a.valueOf("TLS_" + str.substring(4)) : a.valueOf(str);
            }
            String[] strArr2 = m.f7818a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder sbK = p031e1.k.k("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f7774c;
        l[] lVarArr = new l[strArr3.length];
        for (int i8 = 0; i8 < strArr3.length; i8++) {
            String str2 = strArr3[i8];
            if ("TLSv1.3".equals(str2)) {
                lVar = l.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                lVar = l.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                lVar = l.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                lVar = l.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(L.i("Unexpected TLS version: ", str2));
                }
                lVar = l.SSL_3_0;
            }
            lVarArr[i8] = lVar;
        }
        String[] strArr4 = m.f7818a;
        sbK.append(Collections.unmodifiableList(Arrays.asList((Object[]) lVarArr.clone())));
        sbK.append(", supportsTlsExtensions=");
        sbK.append(this.f7775d);
        sbK.append(")");
        return sbK.toString();
    }
}
