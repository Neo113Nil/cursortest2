package C4;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import n.t0;

/* loaded from: classes.dex */
public final class b implements W2.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f849a;

    /* renamed from: b, reason: collision with root package name */
    public int f850b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f851c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f852d;

    public b(HashSet hashSet, boolean z3, int i, boolean z5) {
        this.f852d = hashSet;
        this.f849a = z3;
        this.f850b = i;
        this.f851c = z5;
    }

    @Override // W2.d
    public boolean a() {
        return this.f851c;
    }

    @Override // W2.d
    public boolean b() {
        return this.f849a;
    }

    @Override // W2.d
    public Set c() {
        return (HashSet) this.f852d;
    }

    @Override // W2.d
    public int d() {
        return this.f850b;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public y4.i e(SSLSocket sSLSocket) {
        y4.i iVar;
        int i;
        boolean z3;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i5 = this.f850b;
        List list = (List) this.f852d;
        int size = list.size();
        while (true) {
            if (i5 >= size) {
                iVar = null;
                break;
            }
            iVar = (y4.i) list.get(i5);
            if (iVar.b(sSLSocket)) {
                this.f850b = i5 + 1;
                break;
            }
            i5++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f851c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.c(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            kotlin.jvm.internal.l.e("toString(this)", arrays);
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i6 = this.f850b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i6 >= size2) {
                z3 = false;
                break;
            }
            if (((y4.i) list.get(i6)).b(sSLSocket)) {
                z3 = true;
                break;
            }
            i6++;
        }
        this.f849a = z3;
        boolean z5 = this.f851c;
        String[] strArr = iVar.f21340c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.l.e("sslSocket.enabledCipherSuites", enabledCipherSuites2);
            enabledCipherSuites = z4.b.o(enabledCipherSuites2, strArr, y4.h.f21320c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = iVar.f21341d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.e("sslSocket.enabledProtocols", enabledProtocols3);
            enabledProtocols = z4.b.o(enabledProtocols3, r6, Z3.a.f6354l);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.l.e("supportedCipherSuites", supportedCipherSuites);
        y4.g gVar = y4.h.f21320c;
        byte[] bArr = z4.b.f21979a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (gVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z5 && i != -1) {
            kotlin.jvm.internal.l.e("cipherSuitesIntersection", enabledCipherSuites);
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.l.e("supportedCipherSuites[indexOfFallbackScsv]", str);
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", copyOf);
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        t0 t0Var = new t0();
        t0Var.f18324a = iVar.f21338a;
        t0Var.f18326c = strArr;
        t0Var.f18327d = r6;
        t0Var.f18325b = iVar.f21339b;
        kotlin.jvm.internal.l.e("cipherSuitesIntersection", enabledCipherSuites);
        t0Var.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        kotlin.jvm.internal.l.e("tlsVersionsIntersection", enabledProtocols);
        t0Var.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        y4.i a5 = t0Var.a();
        if (a5.c() != null) {
            sSLSocket.setEnabledProtocols(a5.f21341d);
        }
        if (a5.a() != null) {
            sSLSocket.setEnabledCipherSuites(a5.f21340c);
        }
        return iVar;
    }

    public b(List list) {
        kotlin.jvm.internal.l.f("connectionSpecs", list);
        this.f852d = list;
    }
}
