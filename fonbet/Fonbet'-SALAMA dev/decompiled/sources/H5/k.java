package H5;

import B4.AbstractC0060d;
import B4.C0057a;
import B4.C0058b;
import B4.C0059c;
import B4.C0061e;
import B4.C0074s;
import B4.H;
import B4.I;
import B4.Y;
import B4.Z;
import B4.c0;
import E5.C0199q;
import G4.F;
import R5.C0405a;
import R5.C0411g;
import U5.m0;
import U5.n0;
import V3.B;
import V3.C0460b;
import V3.C0481x;
import V3.J;
import V3.Q;
import V3.r0;
import V3.u0;
import Y4.D;
import a.AbstractC0603a;
import android.os.Message;
import android.webkit.WebChromeClient;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import g4.C1144q;
import g4.C1145r;
import g4.InterfaceC1131d;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import v0.AbstractC1663a;
import w1.C1719l1;
import w1.C1726n0;
import w1.C1759x1;
import w1.V0;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements A5.b, Continuation, X1.a, D3.g, InterfaceC1131d, A5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3382a;

    public /* synthetic */ k(int i7) {
        this.f3382a = i7;
    }

    public J3.b a(Q3.o oVar) {
        K3.j jVar;
        K3.j jVar2;
        switch (this.f3382a) {
            case 3:
                J3.o oVar2 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    V3.r F7 = V3.r.F((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (F7.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    K3.j jVar3 = K3.j.f3913e;
                    int size = F7.B().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int A7 = F7.C().A();
                    if (A7 != 12 && A7 != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(A7)));
                    }
                    r0 r0Var = (r0) oVar.f5826e;
                    int ordinal = r0Var.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                                }
                            }
                        }
                        jVar3 = K3.j.f3912d;
                    } else {
                        jVar3 = K3.j.f3911c;
                    }
                    K3.k kVar = new K3.k(size, A7, 16, jVar3);
                    C1726n0 c1726n0 = new C1726n0(7);
                    c1726n0.f17806c = null;
                    c1726n0.f17807d = null;
                    c1726n0.f17805b = kVar;
                    c1726n0.f17806c = C1719l1.u(F7.B().z(), oVar2);
                    c1726n0.f17807d = (Integer) oVar.f5827f;
                    return c1726n0.d();
                } catch (C unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 4:
                J3.o oVar3 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    C0481x D7 = C0481x.D((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (D7.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    K3.j jVar4 = K3.j.f3916h;
                    int size2 = D7.A().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    r0 r0Var2 = (r0) oVar.f5826e;
                    int ordinal2 = r0Var2.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.b());
                                }
                            }
                        }
                        jVar4 = K3.j.f3915g;
                    } else {
                        jVar4 = K3.j.f3914f;
                    }
                    K3.n nVar = new K3.n(size2, 12, 16, jVar4);
                    C1759x1 c1759x1 = new C1759x1(7, false);
                    c1759x1.f17926c = null;
                    c1759x1.f17927d = null;
                    c1759x1.f17925b = nVar;
                    c1759x1.f17926c = C1719l1.u(D7.A().z(), oVar3);
                    c1759x1.f17927d = (Integer) oVar.f5827f;
                    return c1759x1.C();
                } catch (C unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 5:
                J3.o oVar4 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    B D8 = B.D((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (D8.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    K3.j jVar5 = K3.j.f3918k;
                    int size3 = D8.A().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    r0 r0Var3 = (r0) oVar.f5826e;
                    int ordinal3 = r0Var3.ordinal();
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.b());
                                }
                            }
                        }
                        jVar5 = K3.j.j;
                    } else {
                        jVar5 = K3.j.f3917i;
                    }
                    K3.q qVar = new K3.q(size3, jVar5);
                    android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(8, false);
                    tVar.f8077c = null;
                    tVar.f8078d = null;
                    tVar.f8076b = qVar;
                    tVar.f8077c = C1719l1.u(D8.A().z(), oVar4);
                    tVar.f8078d = (Integer) oVar.f5827f;
                    return tVar.R();
                } catch (C unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 6:
                J3.o oVar5 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    J D9 = J.D((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (D9.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r0 r0Var4 = (r0) oVar.f5826e;
                    int ordinal4 = r0Var4.ordinal();
                    if (ordinal4 != 1) {
                        if (ordinal4 != 2) {
                            if (ordinal4 == 3) {
                                jVar = K3.j.f3921n;
                            } else if (ordinal4 != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.b());
                            }
                        }
                        jVar = K3.j.f3920m;
                    } else {
                        jVar = K3.j.f3919l;
                    }
                    return K3.s.b(jVar, C1719l1.u(D9.A().z(), oVar5), (Integer) oVar.f5827f);
                } catch (C unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 7:
                J3.o oVar6 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    u0 D10 = u0.D((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (D10.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r0 r0Var5 = (r0) oVar.f5826e;
                    int ordinal5 = r0Var5.ordinal();
                    if (ordinal5 != 1) {
                        if (ordinal5 != 2) {
                            if (ordinal5 == 3) {
                                jVar2 = K3.j.f3924q;
                            } else if (ordinal5 != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.b());
                            }
                        }
                        jVar2 = K3.j.f3923p;
                    } else {
                        jVar2 = K3.j.f3922o;
                    }
                    return K3.w.b(jVar2, C1719l1.u(D10.A().z(), oVar6), (Integer) oVar.f5827f);
                } catch (C unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 14:
                J3.o oVar7 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    C0460b F8 = C0460b.F((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (F8.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1759x1 c1759x12 = new C1759x1(11, false);
                    c1759x12.f17925b = null;
                    c1759x12.f17926c = null;
                    c1759x12.f17927d = R3.d.f6023f;
                    c1759x12.d0(F8.B().size());
                    int A8 = F8.C().A();
                    if (A8 < 10 || 16 < A8) {
                        throw new GeneralSecurityException(e1.k.d(A8, "Invalid tag size for AesCmacParameters: "));
                    }
                    c1759x12.f17926c = Integer.valueOf(A8);
                    c1759x12.f17927d = R3.f.a((r0) oVar.f5826e);
                    R3.e D11 = c1759x12.D();
                    C1726n0 c1726n02 = new C1726n0(11);
                    c1726n02.f17806c = null;
                    c1726n02.f17807d = null;
                    c1726n02.f17805b = D11;
                    c1726n02.f17806c = C1719l1.u(F8.B().z(), oVar7);
                    c1726n02.f17807d = (Integer) oVar.f5827f;
                    return c1726n02.e();
                } catch (C | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                J3.o oVar8 = J3.o.f3859a;
                if (!((String) oVar.f5822a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    Q G2 = Q.G((AbstractC0873i) oVar.f5824c, C0879o.a());
                    if (G2.E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    k1.g gVar = new k1.g();
                    gVar.f14674a = null;
                    gVar.f14675b = null;
                    gVar.f14676c = null;
                    gVar.f14677d = R3.d.f6031o;
                    gVar.f14674a = Integer.valueOf(G2.C().size());
                    gVar.f14675b = Integer.valueOf(G2.D().C());
                    gVar.f14676c = R3.l.a(G2.D().B());
                    gVar.f14677d = R3.l.b((r0) oVar.f5826e);
                    R3.k f7 = gVar.f();
                    android.support.v4.media.session.t tVar2 = new android.support.v4.media.session.t(12, false);
                    tVar2.f8077c = null;
                    tVar2.f8078d = null;
                    tVar2.f8076b = f7;
                    tVar2.f8077c = C1719l1.u(G2.C().z(), oVar8);
                    tVar2.f8078d = (Integer) oVar.f5827f;
                    return tVar2.S();
                } catch (C | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // D3.g
    public Object apply(Object obj) {
        return (N1.q) obj;
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        Set b7 = c1145r.b(C1144q.a(R4.a.class));
        R4.c cVar = R4.c.f6062c;
        if (cVar == null) {
            synchronized (R4.c.class) {
                try {
                    cVar = R4.c.f6062c;
                    if (cVar == null) {
                        cVar = new R4.c(0);
                        R4.c.f6062c = cVar;
                    }
                } finally {
                }
            }
        }
        return new R4.b(b7, cVar);
    }

    @Override // A5.c
    public void f(Object obj) {
        switch (this.f3382a) {
            case 18:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "");
                    int i7 = C0411g.f6164e;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i8 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i9 = C0411g.f6164e;
                        break;
                    }
                }
            case 19:
            case zzbbd.zzt.zzm /* 21 */:
            case 26:
            default:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "");
                    int i10 = C0411g.f6164e;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i11 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i12 = C0411g.f6164e;
                        break;
                    }
                }
            case 20:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "");
                    int i13 = C0411g.f6164e;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i14 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i15 = C0411g.f6164e;
                        break;
                    }
                }
            case 22:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "");
                    int i16 = C0411g.f6164e;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i17 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        t6.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i18 = C0411g.f6164e;
                        break;
                    }
                }
            case 23:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "");
                    int i19 = C0411g.f6164e;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i20 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i21 = C0411g.f6164e;
                        break;
                    }
                }
            case 24:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "");
                    int i22 = C0411g.f6164e;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i23 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        t6.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i24 = C0411g.f6164e;
                        break;
                    }
                }
            case 25:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "");
                    int i25 = C0411g.f6164e;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i26 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        t6.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i27 = C0411g.f6164e;
                        break;
                    }
                }
            case 27:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj16 = list8.get(0);
                        t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        t6.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj16, (String) obj17, (String) list8.get(2)));
                        break;
                    }
                }
                break;
            case 28:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "");
                    int i28 = C0411g.f6164e;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i29 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        t6.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i30 = C0411g.f6164e;
                        break;
                    }
                }
        }
    }

    @Override // X1.a
    public boolean g(int i7, int i8, int i9, int i10, int i11) {
        return (i8 == 67 && i9 == 79 && i10 == 77 && (i11 == 77 || i7 == 2)) || (i8 == 77 && i9 == 76 && i10 == 76 && (i11 == 84 || i7 == 2));
    }

    @Override // A5.b
    public void i(Object obj, V0 v02) {
        List w02;
        List w03;
        List w04;
        switch (this.f3382a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                final m mVar = (m) arrayList2.get(0);
                final String str = (String) arrayList2.get(1);
                final Boolean bool = (Boolean) arrayList2.get(2);
                final t tVar = (t) arrayList2.get(3);
                final s sVar = (s) arrayList2.get(4);
                final C0199q c0199q = new C0199q(arrayList, v02, 22);
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: H5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        s sVar2 = s.this;
                        m mVar2 = mVar;
                        String str2 = str;
                        Boolean bool2 = bool;
                        t tVar2 = tVar;
                        C0199q c0199q2 = c0199q;
                        HashMap hashMap = e.f3360y;
                        try {
                            int k02 = AbstractC0603a.k0(sVar2.f3403a);
                            Z l02 = AbstractC0603a.l0(e.a(mVar2), str2, bool2.booleanValue(), tVar2);
                            if (l02 == null) {
                                c0199q2.a(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
                            } else {
                                c0199q2.success(AbstractC0603a.s0((c0) Tasks.await(l02.c(k02)), AbstractC0603a.j0(sVar2.f3404b)));
                            }
                        } catch (Exception e7) {
                            D.R(c0199q2, e7);
                        }
                    }
                });
                return;
            case 1:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                m mVar2 = (m) arrayList4.get(0);
                String str2 = (String) arrayList4.get(1);
                t tVar2 = (t) arrayList4.get(2);
                int i7 = t.e.f(1)[((Integer) arrayList4.get(3)).intValue()];
                List<g> list = (List) arrayList4.get(4);
                Boolean bool2 = (Boolean) arrayList4.get(5);
                E5.r rVar = new E5.r(arrayList3, v02, 23);
                Z l02 = AbstractC0603a.l0(e.a(mVar2), str2, bool2.booleanValue(), tVar2);
                ArrayList arrayList5 = new ArrayList();
                for (g gVar : list) {
                    int e7 = t.e.e(gVar.f3370a);
                    if (e7 == 0) {
                        arrayList5.add(new C0058b(null, "count"));
                    } else if (e7 == 1) {
                        arrayList5.add(new C0059c(C0074s.a(gVar.f3371b), "sum"));
                    } else if (e7 == 2) {
                        arrayList5.add(new C0057a(C0074s.a(gVar.f3371b), "average"));
                    }
                }
                AbstractC0060d abstractC0060d = (AbstractC0060d) arrayList5.get(0);
                AbstractC0060d[] abstractC0060dArr = (AbstractC0060d[]) arrayList5.subList(1, arrayList5.size()).toArray(new AbstractC0060d[0]);
                l02.getClass();
                Y y4 = new Y();
                y4.add(abstractC0060d);
                y4.addAll(Arrays.asList(abstractC0060dArr));
                FlutterFirebasePlugin.cachedThreadPool.execute(new F(new C0061e(l02, y4), i7, list, rVar));
                return;
            case 19:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    w02 = D.D(null);
                } catch (Throwable th) {
                    w02 = AbstractC0603a.w0(th);
                }
                v02.f(w02);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                t6.h.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        w03 = D.D(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e8) {
                        throw new RuntimeException(e8);
                    }
                } catch (Throwable th2) {
                    w03 = AbstractC0603a.w0(th2);
                }
                v02.f(w03);
                return;
            default:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    w04 = D.D(null);
                } catch (Throwable th3) {
                    w04 = AbstractC0603a.w0(th3);
                }
                v02.f(w04);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception exception = task.getException();
        if (exception instanceof m0) {
            exception = L4.r.g(((m0) exception).f6556a);
        } else if (exception instanceof n0) {
            exception = L4.r.g(((n0) exception).f6560a);
        }
        if (exception instanceof I) {
            throw exception;
        }
        throw new I(exception.getMessage(), H.UNKNOWN, exception);
    }

    public /* synthetic */ k(Object obj, int i7) {
        this.f3382a = i7;
    }
}
