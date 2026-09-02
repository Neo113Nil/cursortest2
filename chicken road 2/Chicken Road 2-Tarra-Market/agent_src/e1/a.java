package e1;

import d1.r;

/* loaded from: classes.dex */
public final class a extends O0.b {

    /* renamed from: d, reason: collision with root package name */
    public r f974d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f976f;

    /* renamed from: g, reason: collision with root package name */
    public int f977g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, O0.b bVar2) {
        super(bVar2);
        this.f976f = bVar;
    }

    @Override // O0.b
    public final Object b(Object obj) {
        this.f975e = obj;
        this.f977g |= Integer.MIN_VALUE;
        return this.f976f.a(null, this);
    }
}
