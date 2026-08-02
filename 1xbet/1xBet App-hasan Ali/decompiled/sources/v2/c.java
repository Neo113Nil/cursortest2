package v2;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public Object f20393k;

    /* renamed from: l, reason: collision with root package name */
    public x4.i f20394l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f20396n;

    /* renamed from: o, reason: collision with root package name */
    public int f20397o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20396n = dVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20395m = obj;
        this.f20397o |= Integer.MIN_VALUE;
        return this.f20396n.a(this);
    }
}
