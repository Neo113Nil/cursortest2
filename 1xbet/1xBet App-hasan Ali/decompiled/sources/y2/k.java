package y2;

import c4.AbstractC0542c;
import w2.C2550h;

/* loaded from: classes.dex */
public final class k extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public l f21205k;

    /* renamed from: l, reason: collision with root package name */
    public C2550h f21206l;

    /* renamed from: m, reason: collision with root package name */
    public Object f21207m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f21208n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f21209o;

    /* renamed from: p, reason: collision with root package name */
    public int f21210p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f21209o = lVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f21208n = obj;
        this.f21210p |= Integer.MIN_VALUE;
        return this.f21209o.a(this);
    }
}
