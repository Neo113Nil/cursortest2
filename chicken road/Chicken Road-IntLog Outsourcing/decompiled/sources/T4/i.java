package T4;

import g4.AbstractC0466k;
import i4.C0494a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f2880e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f2881f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2882a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2883b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2884c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2885d;

    static {
        f fVar = f.f2863r;
        f fVar2 = f.f2864s;
        f fVar3 = f.f2865t;
        f fVar4 = f.f2857l;
        f fVar5 = f.f2859n;
        f fVar6 = f.f2858m;
        f fVar7 = f.f2860o;
        f fVar8 = f.f2862q;
        f fVar9 = f.f2861p;
        List A02 = AbstractC0466k.A0(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
        List A03 = AbstractC0466k.A0(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f2855j, f.f2856k, f.f2853h, f.f2854i, f.f2851f, f.f2852g, f.f2850e);
        h hVar = new h();
        f[] fVarArr = (f[]) A02.toArray(new f[0]);
        hVar.b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        D d6 = D.f2809c;
        D d7 = D.f2810d;
        hVar.d(d6, d7);
        if (!hVar.f2876a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f2877b = true;
        hVar.a();
        h hVar2 = new h();
        f[] fVarArr2 = (f[]) A03.toArray(new f[0]);
        hVar2.b((f[]) Arrays.copyOf(fVarArr2, fVarArr2.length));
        hVar2.d(d6, d7);
        if (!hVar2.f2876a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f2877b = true;
        f2880e = hVar2.a();
        h hVar3 = new h();
        f[] fVarArr3 = (f[]) A03.toArray(new f[0]);
        hVar3.b((f[]) Arrays.copyOf(fVarArr3, fVarArr3.length));
        hVar3.d(d6, d7, D.f2811e, D.f2812f);
        if (!hVar3.f2876a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f2877b = true;
        hVar3.a();
        f2881f = new i(false, false, null, null);
    }

    public i(boolean z, boolean z5, String[] strArr, String[] strArr2) {
        this.f2882a = z;
        this.f2883b = z5;
        this.f2884c = strArr;
        this.f2885d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.i.b(enabledCipherSuites);
        String[] strArr = this.f2884c;
        if (strArr != null) {
            enabledCipherSuites = U4.c.i(strArr, enabledCipherSuites, f.f2848c);
        }
        ?? r22 = this.f2885d;
        if (r22 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = U4.c.i(enabledProtocols2, r22, C0494a.f5832b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.i.b(supportedCipherSuites);
        C0155e c0155e = f.f2848c;
        byte[] bArr = U4.c.f3176a;
        int length = supportedCipherSuites.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (c0155e.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (z && i2 != -1) {
            String str = supportedCipherSuites[i2];
            kotlin.jvm.internal.i.d(str, "get(...)");
            kotlin.jvm.internal.i.e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        h hVar = new h();
        hVar.f2876a = this.f2882a;
        hVar.f2878c = strArr;
        hVar.f2879d = r22;
        hVar.f2877b = this.f2883b;
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i a6 = hVar.a();
        if (a6.c() != null) {
            sSLSocket.setEnabledProtocols(a6.f2885d);
        }
        if (a6.b() != null) {
            sSLSocket.setEnabledCipherSuites(a6.f2884c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f2884c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f2847b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f2885d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            D.f2808b.getClass();
            arrayList.add(C0152b.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z = iVar.f2882a;
        boolean z5 = this.f2882a;
        if (z5 != z) {
            return false;
        }
        return !z5 || (Arrays.equals(this.f2884c, iVar.f2884c) && Arrays.equals(this.f2885d, iVar.f2885d) && this.f2883b == iVar.f2883b);
    }

    public final int hashCode() {
        if (!this.f2882a) {
            return 17;
        }
        String[] strArr = this.f2884c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2885d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2883b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2882a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2883b + ')';
    }
}
