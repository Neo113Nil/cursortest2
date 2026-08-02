package x0;

import P.C0327y;
import i4.InterfaceC2015a;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import r.C2321G;
import z0.C2731G;
import z0.C2735K;
import z0.C2746c;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20939l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f20940m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i, Object obj) {
        super(0);
        this.f20939l = i;
        this.f20940m = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        C0327y c0327y;
        switch (this.f20939l) {
            case 0:
                C2614C c2614c = (C2614C) this.f20940m;
                if (!((Boolean) c2614c.f.getValue()).booleanValue() && (c0327y = c2614c.f20915c) != null) {
                    c0327y.k();
                }
                break;
            case 1:
                K a5 = ((i0) this.f20940m).a();
                C2731G c2731g = a5.f20941k;
                if (a5.f20954x != ((R.b) c2731g.o()).f5100k.f5108m) {
                    C2321G c2321g = a5.f20946p;
                    Object[] objArr = c2321g.f18930c;
                    long[] jArr = c2321g.f18928a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j5 = jArr[i];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j5) < 128) {
                                        ((C2614C) objArr[(i << 3) + i6]).f20916d = true;
                                    }
                                    j5 >>= 8;
                                }
                                if (i5 != 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                    if (c2731g.f21630q != null) {
                        if (!c2731g.f21613P.f21654e) {
                            C2731G.U(c2731g, false, 7);
                        }
                    } else if (!c2731g.q()) {
                        C2731G.W(c2731g, false, 7);
                    }
                }
                break;
            case 2:
                y0.c cVar = (y0.c) this.f20940m;
                int i7 = 0;
                cVar.f = false;
                HashSet hashSet = new HashSet();
                R.e eVar = cVar.f21132d;
                Object[] objArr2 = eVar.f5106k;
                int i8 = eVar.f5108m;
                int i9 = 0;
                while (true) {
                    R.e eVar2 = cVar.f21133e;
                    if (i9 >= i8) {
                        eVar.h();
                        eVar2.h();
                        R.e eVar3 = cVar.f21130b;
                        Object[] objArr3 = eVar3.f5106k;
                        int i10 = eVar3.f5108m;
                        while (true) {
                            R.e eVar4 = cVar.f21131c;
                            if (i7 >= i10) {
                                eVar3.h();
                                eVar4.h();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    ((C2746c) it.next()).A0();
                                }
                                break;
                            } else {
                                C2746c c2746c = (C2746c) objArr3[i7];
                                y0.g gVar = (y0.g) eVar4.f5106k[i7];
                                if (c2746c.f7175x) {
                                    y0.c.b(c2746c, gVar, hashSet);
                                }
                                i7++;
                            }
                        }
                    } else {
                        C2731G c2731g2 = (C2731G) objArr2[i9];
                        y0.g gVar2 = (y0.g) eVar2.f5106k[i9];
                        b0.o oVar = c2731g2.f21612O.f;
                        if (oVar.f7175x) {
                            y0.c.b(oVar, gVar2, hashSet);
                        }
                        i9++;
                    }
                }
            case 3:
                break;
            case 4:
                try {
                    break;
                } catch (SSLPeerUnverifiedException unused) {
                    return X3.v.f6090k;
                }
            case 5:
                C2735K c2735k = ((C2731G) this.f20940m).f21613P;
                c2735k.f21663p.f21740I = true;
                z0.U u5 = c2735k.f21664q;
                if (u5 != null) {
                    u5.f21704C = true;
                }
                break;
            default:
                i0.G g5 = z0.e0.f21790T;
                ((i4.c) this.f20940m).c(g5);
                g5.f17226A = g5.f17237u.a(g5.f17239w, g5.f17241y, g5.f17240x);
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(InterfaceC2015a interfaceC2015a) {
        super(0);
        this.f20939l = 4;
        this.f20940m = (kotlin.jvm.internal.m) interfaceC2015a;
    }
}
