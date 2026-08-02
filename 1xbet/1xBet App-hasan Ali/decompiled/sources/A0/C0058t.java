package A0;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.ads.MobileAds;
import d.AbstractC1904d;
import g0.C1962g;
import g0.C1965j;
import g0.InterfaceC1960e;
import game.betting133.sports1xbet.aqua_application.AquaGuideDeckActivity;
import game.betting133.sports1xbet.aqua_bootstrap.AquaLaunchBridgeActivity;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import i4.InterfaceC2015a;
import java.util.ListIterator;
import o4.AbstractC2227e;
import r.C2322H;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.C2731G;

/* renamed from: A0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0058t extends kotlin.jvm.internal.j implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f576k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0058t(int i, Object obj, Class cls, String str, String str2, int i5, int i6) {
        super(i, i5, cls, obj, str, str2);
        this.f576k = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020c  */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ContentCaptureSession a5;
        Y3.a aVar;
        boolean z3;
        W3.o oVar;
        z0.c0 c0Var;
        W3.o oVar2 = W3.o.f6046a;
        switch (this.f576k) {
            case 0:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    D0.d.g(view);
                }
                if (i < 29 || (a5 = D0.a.a(view)) == null) {
                    return null;
                }
                return new D0.b(a5, view);
            case 1:
                AquaGuideDeckActivity aquaGuideDeckActivity = (AquaGuideDeckActivity) this.receiver;
                int i5 = AquaGuideDeckActivity.f17163E;
                aquaGuideDeckActivity.getClass();
                MobileAds.a(aquaGuideDeckActivity, new P3.a(0));
                return oVar2;
            case 2:
                AquaGuideDeckActivity aquaGuideDeckActivity2 = (AquaGuideDeckActivity) this.receiver;
                int i6 = AquaGuideDeckActivity.f17163E;
                aquaGuideDeckActivity2.getClass();
                Y3.c cVar = new Y3.c(10);
                cVar.add(Boolean.valueOf(kotlin.jvm.internal.l.a(AbstractC2349a.f19098g, "adMarkerAdx")));
                cVar.add(Boolean.valueOf(!AbstractC2227e.H0(AbstractC2349a.f19100j)));
                Y3.c e3 = AbstractC2346c.e(cVar);
                if (e3 == null || !e3.isEmpty()) {
                    ListIterator listIterator = e3.listIterator(0);
                    do {
                        aVar = (Y3.a) listIterator;
                        if (aVar.hasNext()) {
                        }
                    } while (((Boolean) aVar.next()).booleanValue());
                    z3 = false;
                    if (!z3) {
                        O3.e.d(aquaGuideDeckActivity2);
                    } else if (z3) {
                        throw new D2.e();
                    }
                    return oVar2;
                }
                z3 = true;
                if (!z3) {
                }
                return oVar2;
            case 3:
                AquaGuideDeckActivity aquaGuideDeckActivity3 = (AquaGuideDeckActivity) this.receiver;
                int i7 = AquaGuideDeckActivity.f17163E;
                aquaGuideDeckActivity3.getClass();
                AbstractC1904d.a(aquaGuideDeckActivity3, new X.d(1278736533, new P3.b(androidx.compose.foundation.layout.c.f6868c, 1), true));
                return oVar2;
            case 4:
                AquaLaunchBridgeActivity aquaLaunchBridgeActivity = (AquaLaunchBridgeActivity) this.receiver;
                int i8 = AquaLaunchBridgeActivity.J;
                aquaLaunchBridgeActivity.j();
                return oVar2;
            case 5:
                AquaLaunchBridgeActivity aquaLaunchBridgeActivity2 = (AquaLaunchBridgeActivity) this.receiver;
                int i9 = AquaLaunchBridgeActivity.J;
                aquaLaunchBridgeActivity2.j();
                return oVar2;
            case 6:
                AquaLaunchBridgeActivity aquaLaunchBridgeActivity3 = (AquaLaunchBridgeActivity) this.receiver;
                int i10 = AquaLaunchBridgeActivity.J;
                aquaLaunchBridgeActivity3.k();
                return oVar2;
            case 7:
                ((AquaTournamentCatalogViewModel) this.receiver).stepBameansckPage();
                return oVar2;
            case 8:
                ((AquaTournamentCatalogViewModel) this.receiver).stepFormeanswardPage();
                return oVar2;
            default:
                C1962g c1962g = (C1962g) this.receiver;
                C1965j c1965j = c1962g.f17023a;
                g0.s sVar = c1965j.f17035h;
                g0.r rVar = g0.r.f17057n;
                C2322H c2322h = c1962g.f17025c;
                C2322H c2322h2 = c1962g.f17026d;
                if (sVar == null) {
                    Object[] objArr = c2322h2.f18934b;
                    long[] jArr = c2322h2.f18933a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j5 = jArr[i11];
                            oVar = oVar2;
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j5 & 255) < 128) {
                                        ((InterfaceC1960e) objArr[(i11 << 3) + i13]).m(rVar);
                                    }
                                    j5 >>= 8;
                                }
                                if (i12 != 8) {
                                }
                            }
                            if (i11 != length) {
                                i11++;
                                oVar2 = oVar;
                            }
                        }
                    } else {
                        oVar = oVar2;
                    }
                } else {
                    oVar = oVar2;
                    int i14 = 1;
                    if (sVar.f7175x) {
                        if (c2322h.c(sVar)) {
                            sVar.B0();
                        }
                        g0.r A02 = sVar.A0();
                        if (!sVar.f7162k.f7175x) {
                            AbstractC2540a.b("visitAncestors called on an unattached node");
                        }
                        b0.o oVar3 = sVar.f7162k;
                        C2731G v4 = AbstractC2749f.v(sVar);
                        int i15 = 0;
                        while (v4 != null) {
                            if ((v4.f21612O.f.f7165n & 5120) != 0) {
                                while (oVar3 != null) {
                                    int i16 = oVar3.f7164m;
                                    if ((i16 & 5120) != 0) {
                                        if ((i16 & 1024) != 0) {
                                            i15++;
                                        }
                                        if ((oVar3 instanceof InterfaceC1960e) && c2322h2.c(oVar3)) {
                                            if (i15 <= i14) {
                                                ((InterfaceC1960e) oVar3).m(A02);
                                            } else {
                                                ((InterfaceC1960e) oVar3).m(g0.r.f17055l);
                                            }
                                            c2322h2.k(oVar3);
                                        }
                                    }
                                    oVar3 = oVar3.f7166o;
                                    i14 = 1;
                                }
                            }
                            v4 = v4.u();
                            oVar3 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
                            i14 = 1;
                        }
                        Object[] objArr2 = c2322h2.f18934b;
                        long[] jArr2 = c2322h2.f18933a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i17 = 0;
                            while (true) {
                                long j6 = jArr2[i17];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                    for (int i19 = 0; i19 < i18; i19++) {
                                        if ((j6 & 255) < 128) {
                                            ((InterfaceC1960e) objArr2[(i17 << 3) + i19]).m(rVar);
                                        }
                                        j6 >>= 8;
                                    }
                                    if (i18 != 8) {
                                    }
                                }
                                if (i17 != length2) {
                                    i17++;
                                }
                            }
                        }
                    }
                }
                if (c1965j.f17035h == null || c1965j.f17031c.A0() == rVar) {
                    c1965j.c();
                }
                c2322h.b();
                c2322h2.b();
                c1962g.f17027e = false;
                return oVar;
        }
    }
}
