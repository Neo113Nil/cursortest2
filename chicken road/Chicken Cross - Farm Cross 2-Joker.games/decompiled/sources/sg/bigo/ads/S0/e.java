package sg.bigo.ads.S0;

import android.text.TextUtils;
import android.util.Pair;
import sg.bigo.ads.Q0.n;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.q0.C5447k;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12537a;

    public e(f fVar) {
        this.f12537a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f12537a;
        if (fVar.f12538a != null) {
            if (fVar.e == null) {
                fVar.e = fVar.b();
            }
            C5447k c5447k = this.f12537a.e;
            Pair pair = null;
            if (c5447k == null || c5447k.f13258a.get() != 0) {
                f fVar2 = this.f12537a;
                if (fVar2.f.getAndAdd(1) >= 3 || fVar2.g.get()) {
                    return;
                }
                AbstractC5446j.a(fVar2.i);
                AbstractC5446j.a(1, null, fVar2.i, 5000L);
                return;
            }
            f fVar3 = this.f12537a;
            n nVar = fVar3.f12538a;
            if (nVar != null && nVar.f12510a != null) {
                pair = fVar3.a().a(sg.bigo.ads.O.g.f12472a);
            }
            if (pair == null || TextUtils.isEmpty((CharSequence) pair.first)) {
                return;
            }
            this.f12537a.a(pair);
            this.f12537a.f12538a.f12510a.a(0L);
            if (1 == ((Integer) pair.second).intValue() % sg.bigo.ads.O.g.f12472a.R) {
                this.f12537a.a((String) pair.first, ((Integer) pair.second).intValue(), "0");
            }
        }
    }
}
