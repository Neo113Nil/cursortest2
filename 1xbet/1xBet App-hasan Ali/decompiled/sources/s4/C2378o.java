package s4;

import c4.AbstractC0542c;

/* renamed from: s4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2378o extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public I.E f19290k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19291l;

    /* renamed from: m, reason: collision with root package name */
    public int f19292m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.E f19293n;

    /* renamed from: o, reason: collision with root package name */
    public Object f19294o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2378o(I.E e3, a4.c cVar) {
        super(cVar);
        this.f19293n = e3;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19291l = obj;
        this.f19292m |= Integer.MIN_VALUE;
        return this.f19293n.d(null, this);
    }
}
