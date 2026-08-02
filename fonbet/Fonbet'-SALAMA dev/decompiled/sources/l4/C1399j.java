package l4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1399j implements InterfaceC1401l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f14948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1404o f14949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14950c;

    public C1399j(s sVar, Long l7, C1404o c1404o) {
        this.f14950c = sVar;
        this.f14948a = l7;
        this.f14949b = c1404o;
    }

    @Override // l4.InterfaceC1401l
    public final void a(Map map) {
        s sVar = this.f14950c;
        ConcurrentHashMap concurrentHashMap = sVar.f14997o;
        Long l7 = this.f14948a;
        C1404o c1404o = (C1404o) concurrentHashMap.get(l7);
        C1404o c1404o2 = this.f14949b;
        if (c1404o == c1404o2) {
            sVar.f14997o.remove(l7);
            c1404o2.f14964b.a(map);
            return;
        }
        android.support.v4.media.session.t tVar = sVar.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "Ignoring on complete for get " + l7 + " because it was removed already.", new Object[0]);
        }
    }
}
