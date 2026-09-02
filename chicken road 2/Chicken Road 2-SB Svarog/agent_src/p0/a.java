package p0;

import o0.r;

/* loaded from: classes.dex */
public final class a extends a0.b {

    /* renamed from: e, reason: collision with root package name */
    public r f1103e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1105g;

    /* renamed from: h, reason: collision with root package name */
    public int f1106h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, a0.b bVar2) {
        super(bVar2);
        this.f1105g = bVar;
    }

    @Override // a0.b
    public final Object c(Object obj) {
        this.f1104f = obj;
        this.f1106h |= Integer.MIN_VALUE;
        return this.f1105g.a(null, this);
    }
}
