package p061i2;

import B.v;
import H2.o;
import Q1.e;
import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f13843a;

    public a(c cVar) {
        this.f13843a = cVar;
    }

    @Override // p061i2.r
    public final void a() {
        this.f13843a.f13865e.remove(this);
    }

    @Override // p061i2.r
    public final boolean b(Uri uri, v vVar, boolean z4) {
        HashMap map;
        b bVar;
        c cVar = this.f13843a;
        if (cVar.f13858C == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.f13856A;
            int i7 = t.f17159a;
            List list = mVar.f13922e;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int size = list.size();
                map = cVar.f13864d;
                if (i8 >= size) {
                    break;
                }
                b bVar2 = (b) map.get(((l) list.get(i8)).f13914a);
                if (bVar2 != null && jElapsedRealtime < bVar2.f13853y) {
                    i9++;
                }
                i8++;
            }
            o oVar = new o(1, 0, cVar.f13856A.f13922e.size(), i9);
            cVar.f13863c.getClass();
            e eVarT = M4.e.t(oVar, vVar);
            if (eVarT != null && eVarT.f5785a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, eVarT.f5786b);
            }
        }
        return false;
    }
}
