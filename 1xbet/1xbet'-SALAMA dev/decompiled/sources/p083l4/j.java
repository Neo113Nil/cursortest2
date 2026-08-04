package p083l4;

import android.support.v4.media.session.t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f14954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14956c;

    public j(s sVar, Long l7, o oVar) {
        this.f14956c = sVar;
        this.f14954a = l7;
        this.f14955b = oVar;
    }

    @Override // p083l4.l
    public final void a(Map map) {
        s sVar = this.f14956c;
        ConcurrentHashMap concurrentHashMap = sVar.f15003o;
        Long l7 = this.f14954a;
        o oVar = (o) concurrentHashMap.get(l7);
        o oVar2 = this.f14955b;
        if (oVar == oVar2) {
            sVar.f15003o.remove(l7);
            oVar2.f14970b.a(map);
            return;
        }
        t tVar = sVar.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "Ignoring on complete for get " + l7 + " because it was removed already.", new Object[0]);
        }
    }
}
