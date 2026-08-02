package s4;

import b4.EnumC0510a;
import c4.AbstractC0542c;
import p4.U;

/* loaded from: classes.dex */
public final class A extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public B f19207k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2369f f19208l;

    /* renamed from: m, reason: collision with root package name */
    public D f19209m;

    /* renamed from: n, reason: collision with root package name */
    public U f19210n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f19211o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f19212p;

    /* renamed from: q, reason: collision with root package name */
    public int f19213q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b3, a4.c cVar) {
        super(cVar);
        this.f19212p = b3;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19211o = obj;
        this.f19213q |= Integer.MIN_VALUE;
        B.k(this.f19212p, null, this);
        return EnumC0510a.f7289k;
    }
}
