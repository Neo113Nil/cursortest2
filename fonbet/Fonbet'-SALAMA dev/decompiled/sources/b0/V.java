package b0;

import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class V extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public W f9993a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9994b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9995c;

    /* renamed from: d, reason: collision with root package name */
    public Y f9996d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f9998f;

    /* renamed from: x, reason: collision with root package name */
    public int f9999x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f9998f = w7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f9997e = obj;
        this.f9999x |= Integer.MIN_VALUE;
        return this.f9998f.b(null, this);
    }
}
