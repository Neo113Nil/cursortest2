package P5;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* renamed from: P5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0401m extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5665a;

    /* renamed from: b, reason: collision with root package name */
    public int f5666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0402n f5667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401m(C0402n c0402n, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f5667c = c0402n;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f5665a = obj;
        this.f5666b |= Integer.MIN_VALUE;
        return this.f5667c.c(null, this);
    }
}
