package C2;

import r.r;

/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3.g f827g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, v3.g gVar) {
        super(i);
        this.f827g = gVar;
    }

    @Override // r.r
    public final void a(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj2;
        ((h) this.f827g.f20439l).i((b) obj, eVar.f824a, eVar.f825b, eVar.f826c);
    }

    @Override // r.r
    public final int f(Object obj, Object obj2) {
        return ((e) obj2).f826c;
    }
}
