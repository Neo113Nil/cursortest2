package C;

import c4.AbstractC0542c;
import h0.C1989c;

/* loaded from: classes.dex */
public final class b extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C1989c f773k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f774l;

    /* renamed from: m, reason: collision with root package name */
    public int f775m;

    /* renamed from: n, reason: collision with root package name */
    public int f776n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f777o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f778p;

    /* renamed from: q, reason: collision with root package name */
    public int f779q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f778p = cVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f777o = obj;
        this.f779q |= Integer.MIN_VALUE;
        return this.f778p.a(null, this);
    }
}
