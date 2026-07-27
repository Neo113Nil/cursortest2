package sg.bigo.ads.P0;

import android.util.Pair;
import sg.bigo.ads.P.j;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f12497a;

    public a(c cVar) {
        this.f12497a = cVar;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Pair pair) {
        c cVar = this.f12497a;
        if (cVar != null) {
            cVar.a(i, i2, i3, str, pair);
        }
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, sg.bigo.ads.N.d dVar, Object[] objArr) {
        j[] jVarArr = (j[]) objArr;
        c cVar = this.f12497a;
        if (cVar != null) {
            cVar.a(i, dVar, jVarArr);
        }
    }
}
