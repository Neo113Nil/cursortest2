package p010b0;

import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W f9987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f9988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f9991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w7, c cVar) {
        super(cVar);
        this.f9991e = w7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f9990d = obj;
        this.f9992f |= Integer.MIN_VALUE;
        return this.f9991e.a(null, this);
    }
}
