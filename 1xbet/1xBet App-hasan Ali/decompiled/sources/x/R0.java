package x;

import c4.AbstractC0542c;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class R0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public S0 f20707k;

    /* renamed from: l, reason: collision with root package name */
    public W3.c f20708l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC2015a f20709m;

    /* renamed from: n, reason: collision with root package name */
    public float f20710n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f20711o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S0 f20712p;

    /* renamed from: q, reason: collision with root package name */
    public int f20713q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(S0 s02, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20712p = s02;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20711o = obj;
        this.f20713q |= Integer.MIN_VALUE;
        return this.f20712p.a(null, null, this);
    }
}
