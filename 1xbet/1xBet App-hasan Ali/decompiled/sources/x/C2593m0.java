package x;

import c4.AbstractC0542c;

/* renamed from: x.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2593m0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.v f20824k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20825l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20826m;

    /* renamed from: n, reason: collision with root package name */
    public int f20827n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2593m0(C2604s0 c2604s0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20826m = c2604s0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20825l = obj;
        this.f20827n |= Integer.MIN_VALUE;
        return this.f20826m.b(0L, this);
    }
}
