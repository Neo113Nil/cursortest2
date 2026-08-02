package M5;

import N5.c;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: M5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3607c {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17409a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17410b = c.a.a("k");

    /* JADX WARN: Multi-variable type inference failed */
    public static I5.l a(N5.c cVar, B5.g gVar) throws IOException {
        B5.g gVar2 = gVar;
        boolean z11 = cVar.m() == c.b.BEGIN_OBJECT;
        if (z11) {
            cVar.beginObject();
        }
        I5.b bVar = null;
        I5.e eVar = null;
        I5.m<PointF, PointF> mVar = null;
        I5.g gVar3 = null;
        I5.b bVar2 = null;
        I5.b bVar3 = null;
        I5.d dVar = null;
        I5.b bVar4 = null;
        I5.b bVar5 = null;
        while (cVar.hasNext()) {
            switch (cVar.p(f17409a)) {
                case 0:
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        if (cVar.p(f17410b) != 0) {
                            cVar.q();
                            cVar.skipValue();
                        } else {
                            eVar = C3605a.a(cVar, gVar);
                        }
                    }
                    cVar.endObject();
                    continue;
                case 1:
                    mVar = C3605a.b(cVar, gVar);
                    continue;
                case 2:
                    gVar3 = new I5.g(u.a(cVar, gVar2, 1.0f, F.f17397a, false));
                    continue;
                case 3:
                    gVar2.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C3608d.d(cVar, gVar);
                    continue;
                case 6:
                    bVar4 = C3608d.b(cVar, gVar2, false);
                    continue;
                case 7:
                    bVar5 = C3608d.b(cVar, gVar2, false);
                    continue;
                case 8:
                    bVar2 = C3608d.b(cVar, gVar2, false);
                    continue;
                case 9:
                    bVar3 = C3608d.b(cVar, gVar2, false);
                    continue;
                default:
                    cVar.q();
                    cVar.skipValue();
                    continue;
            }
            I5.b b11 = C3608d.b(cVar, gVar2, false);
            if (b11.i().isEmpty()) {
                b11.i().add(new P5.a(gVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(gVar2.f())));
            } else if (((P5.a) b11.i().get(0)).f21849b == 0) {
                gVar2 = gVar;
                b11.i().set(0, new P5.a(gVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(gVar.f())));
                bVar = b11;
            }
            gVar2 = gVar;
            bVar = b11;
        }
        if (z11) {
            cVar.endObject();
        }
        I5.e eVar2 = (eVar == null || (eVar.g() && ((PointF) ((P5.a) ((ArrayList) eVar.i()).get(0)).f21849b).equals(0.0f, 0.0f))) ? null : eVar;
        if (mVar == null || (!(mVar instanceof I5.i) && mVar.g() && mVar.i().get(0).f21849b.equals(0.0f, 0.0f))) {
            mVar = null;
        }
        return new I5.l(eVar2, mVar, (gVar3 == null || (gVar3.g() && ((P5.d) ((P5.a) gVar3.i().get(0)).f21849b).a())) ? null : gVar3, (bVar == null || (bVar.g() && ((Float) ((P5.a) bVar.i().get(0)).f21849b).floatValue() == 0.0f)) ? null : bVar, dVar, bVar4, bVar5, (bVar2 == null || (bVar2.g() && ((Float) ((P5.a) bVar2.i().get(0)).f21849b).floatValue() == 0.0f)) ? null : bVar2, (bVar3 == null || (bVar3.g() && ((Float) ((P5.a) bVar3.i().get(0)).f21849b).floatValue() == 0.0f)) ? null : bVar3);
    }
}
