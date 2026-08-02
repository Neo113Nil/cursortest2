package z2;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class i extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public j f21966k;

    /* renamed from: l, reason: collision with root package name */
    public h f21967l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f21968m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f21969n;

    /* renamed from: o, reason: collision with root package name */
    public int f21970o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f21969n = jVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f21968m = obj;
        this.f21970o |= Integer.MIN_VALUE;
        return this.f21969n.b(null, this);
    }
}
