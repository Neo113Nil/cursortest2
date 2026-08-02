package B;

import c4.AbstractC0542c;

/* renamed from: B.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public a4.j f666k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0075d f668m;

    /* renamed from: n, reason: collision with root package name */
    public int f669n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074c(C0075d c0075d, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f668m = c0075d;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f667l = obj;
        this.f669n |= Integer.MIN_VALUE;
        return this.f668m.i(this);
    }
}
