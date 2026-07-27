package M;

import m4.AbstractC1295c;

/* renamed from: M.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082k extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1709a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1710b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1711c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.s f1712d;

    /* renamed from: e, reason: collision with root package name */
    public P f1713e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0083l f1715g;

    /* renamed from: h, reason: collision with root package name */
    public int f1716h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082k(C0083l c0083l, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1715g = c0083l;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1714f = obj;
        this.f1716h |= Integer.MIN_VALUE;
        return this.f1715g.a(null, this);
    }
}
