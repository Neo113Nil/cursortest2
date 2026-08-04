package p010b0;

import p077k6.c;
import t6.p;

/* JADX INFO: renamed from: b0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0740k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f10062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O f10063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10064f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0741l f10065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10066y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740k(C0741l c0741l, c cVar) {
        super(cVar);
        this.f10065x = c0741l;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10064f = obj;
        this.f10066y |= Integer.MIN_VALUE;
        return this.f10065x.a(null, this);
    }
}
