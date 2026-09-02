package l1;

import i1.C0071b;
import i1.h;
import i1.i;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f6085a;

    /* renamed from: b, reason: collision with root package name */
    public int f6086b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6087c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6088d;

    public b(List list) {
        this.f6085a = list;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Cloneable, java.lang.String[]] */
    public final i a(SSLSocket sSLSocket) {
        i iVar;
        boolean z2;
        int i2 = this.f6086b;
        List list = this.f6085a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                iVar = null;
                break;
            }
            iVar = (i) list.get(i2);
            if (iVar.a(sSLSocket)) {
                this.f6086b = i2 + 1;
                break;
            }
            i2++;
        }
        if (iVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f6088d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i3 = this.f6086b;
        while (true) {
            if (i3 >= list.size()) {
                z2 = false;
                break;
            }
            if (((i) list.get(i3)).a(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f6087c = z2;
        C0071b c0071b = C0071b.f1293e;
        boolean z3 = this.f6088d;
        c0071b.getClass();
        String[] strArr = iVar.f1346c;
        String[] l2 = strArr != null ? j1.d.l(i1.f.f1310b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        ?? r8 = iVar.f1347d;
        String[] l3 = r8 != 0 ? j1.d.l(j1.d.f6058f, sSLSocket.getEnabledProtocols(), r8) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        i1.e eVar = i1.f.f1310b;
        byte[] bArr = j1.d.f6053a;
        int length = supportedCipherSuites.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i4++;
        }
        if (z3 && i4 != -1) {
            String str = supportedCipherSuites[i4];
            int length2 = l2.length;
            String[] strArr2 = new String[1 + length2];
            System.arraycopy(l2, 0, strArr2, 0, l2.length);
            strArr2[length2] = str;
            l2 = strArr2;
        }
        h hVar = new h();
        hVar.f1338a = iVar.f1344a;
        hVar.f1340c = strArr;
        hVar.f1341d = r8;
        hVar.f1339b = iVar.f1345b;
        hVar.b(l2);
        hVar.e(l3);
        i iVar2 = new i(hVar);
        String[] strArr3 = iVar2.f1347d;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        String[] strArr4 = iVar2.f1346c;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        return iVar;
    }
}
