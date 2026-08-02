package b0;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* renamed from: b0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770s extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10093a;

    /* renamed from: b, reason: collision with root package name */
    public int f10094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P5.B f10095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770s(P5.B b7, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f10095c = b7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10093a = obj;
        this.f10094b |= Integer.MIN_VALUE;
        return this.f10095c.c(null, this);
    }
}
