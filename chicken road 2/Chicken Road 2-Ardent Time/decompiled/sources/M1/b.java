package M1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f1020a;

    /* renamed from: b, reason: collision with root package name */
    public int f1021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1022c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1023d;

    public b(java.util.List connectionSpecs) {
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        this.f1020a = connectionSpecs;
    }

    public final I1.i a(javax.net.ssl.SSLSocket sSLSocket) {
        I1.i iVar;
        int i2;
        boolean z2;
        java.lang.String[] cipherSuitesIntersection;
        java.lang.String[] tlsVersionsIntersection;
        int i3 = this.f1021b;
        java.util.List list = this.f1020a;
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                iVar = null;
                break;
            }
            int i4 = i3 + 1;
            iVar = (I1.i) list.get(i3);
            if (iVar.b(sSLSocket)) {
                this.f1021b = i4;
                break;
            }
            i3 = i4;
        }
        if (iVar == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f1023d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            java.lang.String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.b(enabledProtocols);
            java.lang.String arrays = java.util.Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.i.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new java.net.UnknownServiceException(sb.toString());
        }
        int i5 = this.f1021b;
        int size2 = list.size();
        while (true) {
            i2 = 0;
            if (i5 >= size2) {
                z2 = false;
                break;
            }
            int i6 = i5 + 1;
            if (((I1.i) list.get(i5)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i5 = i6;
        }
        this.f1022c = z2;
        boolean z3 = this.f1023d;
        java.lang.String[] strArr = iVar.f731c;
        if (strArr != null) {
            java.lang.String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.i.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = J1.b.p(enabledCipherSuites, strArr, I1.g.f705c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        java.lang.String[] strArr2 = iVar.f732d;
        if (strArr2 != null) {
            java.lang.String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = J1.b.p(enabledProtocols2, strArr2, j1.C0917a.f7943b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        java.lang.String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.i.d(supportedCipherSuites, "supportedCipherSuites");
        I1.f fVar = I1.g.f705c;
        byte[] bArr = J1.b.f932a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i2++;
        }
        if (z3 && i2 != -1) {
            kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            java.lang.String str = supportedCipherSuites[i2];
            kotlin.jvm.internal.i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (java.lang.String[]) copyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        I1.h hVar = new I1.h();
        hVar.f723a = iVar.f729a;
        hVar.f725c = strArr;
        hVar.f726d = strArr2;
        hVar.f724b = iVar.f730b;
        kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        hVar.c((java.lang.String[]) java.util.Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.i.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        hVar.f((java.lang.String[]) java.util.Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        I1.i a2 = hVar.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.f732d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f731c);
        }
        return iVar;
    }
}
