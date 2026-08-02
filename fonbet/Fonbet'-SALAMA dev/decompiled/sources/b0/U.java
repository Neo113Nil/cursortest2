package b0;

import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class U extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public W f9987a;

    /* renamed from: b, reason: collision with root package name */
    public Q f9988b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9989c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f9991e;

    /* renamed from: f, reason: collision with root package name */
    public int f9992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f9991e = w7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f9990d = obj;
        this.f9992f |= Integer.MIN_VALUE;
        return this.f9991e.a(null, this);
    }
}
