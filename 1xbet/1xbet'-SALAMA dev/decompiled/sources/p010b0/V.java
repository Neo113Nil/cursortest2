package p010b0;

import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class V extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W f9993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f9996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f9998f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9999x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w7, c cVar) {
        super(cVar);
        this.f9998f = w7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f9997e = obj;
        this.f9999x |= Integer.MIN_VALUE;
        return this.f9998f.b(null, this);
    }
}
