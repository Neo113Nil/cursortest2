package b0;

import k6.AbstractC1356c;
import w1.F0;

/* renamed from: b0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762j extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public F0 f10054a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F0 f10056c;

    /* renamed from: d, reason: collision with root package name */
    public int f10057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0762j(F0 f02, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10056c = f02;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10055b = obj;
        this.f10057d |= Integer.MIN_VALUE;
        return this.f10056c.u(this);
    }
}
