package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f1342e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f1343f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1344a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1345b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1346c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1347d;

    static {
        f fVar = f.f1325q;
        f fVar2 = f.f1326r;
        f fVar3 = f.f1327s;
        f fVar4 = f.f1328t;
        f fVar5 = f.f1329u;
        f fVar6 = f.f1319k;
        f fVar7 = f.f1321m;
        f fVar8 = f.f1320l;
        f fVar9 = f.f1322n;
        f fVar10 = f.f1324p;
        f fVar11 = f.f1323o;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, f.f1317i, f.f1318j, f.f1315g, f.f1316h, f.f1313e, f.f1314f, f.f1312d};
        h hVar = new h(true);
        hVar.a(fVarArr);
        B b2 = B.TLS_1_3;
        B b3 = B.TLS_1_2;
        hVar.d(b2, b3);
        if (!hVar.f1338a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        hVar.f1339b = true;
        new i(hVar);
        h hVar2 = new h(true);
        hVar2.a(fVarArr2);
        B b4 = B.TLS_1_1;
        B b5 = B.TLS_1_0;
        hVar2.d(b2, b3, b4, b5);
        if (!hVar2.f1338a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        hVar2.f1339b = true;
        f1342e = new i(hVar2);
        h hVar3 = new h(true);
        hVar3.a(fVarArr2);
        hVar3.d(b5);
        if (!hVar3.f1338a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        hVar3.f1339b = true;
        new i(hVar3);
        f1343f = new i(new h(false));
    }

    public i(h hVar) {
        this.f1344a = hVar.f1338a;
        this.f1346c = (String[]) hVar.f1340c;
        this.f1347d = (String[]) hVar.f1341d;
        this.f1345b = hVar.f1339b;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f1344a) {
            return false;
        }
        String[] strArr = this.f1347d;
        if (strArr != null && !j1.d.n(j1.d.f6058f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f1346c;
        return strArr2 == null || j1.d.n(f.f1310b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z2 = iVar.f1344a;
        boolean z3 = this.f1344a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f1346c, iVar.f1346c) && Arrays.equals(this.f1347d, iVar.f1347d) && this.f1345b == iVar.f1345b);
    }

    public final int hashCode() {
        if (this.f1344a) {
            return ((((527 + Arrays.hashCode(this.f1346c)) * 31) + Arrays.hashCode(this.f1347d)) * 31) + (!this.f1345b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f1344a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.f1346c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(f.a(str3));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        } else {
            str = "[all enabled]";
        }
        String[] strArr2 = this.f1347d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str4 : strArr2) {
                arrayList2.add(B.a(str4));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f1345b + ")";
    }
}
