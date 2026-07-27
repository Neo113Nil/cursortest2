package sg.bigo.ads.h1;

import android.content.Context;

/* loaded from: classes3.dex */
public final class j extends p {
    public j(k kVar, sg.bigo.ads.V0.a aVar, Context context, long j) {
        super(kVar, aVar, null, context, j);
    }

    @Override // sg.bigo.ads.h1.p
    public final void a() {
        boolean isEmpty;
        r rVar = this.f12969a;
        synchronized (rVar) {
            isEmpty = rVar.b.isEmpty();
        }
        if (isEmpty) {
            return;
        }
        b();
    }
}
