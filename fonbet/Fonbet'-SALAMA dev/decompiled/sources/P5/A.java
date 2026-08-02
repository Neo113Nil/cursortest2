package P5;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class A extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5589a;

    /* renamed from: b, reason: collision with root package name */
    public int f5590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f5591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b7, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f5591c = b7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f5589a = obj;
        this.f5590b |= Integer.MIN_VALUE;
        return this.f5591c.c(null, this);
    }
}
