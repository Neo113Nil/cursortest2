package p010b0;

import p077k6.c;
import p155w1.F0;

/* JADX INFO: renamed from: b0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F0 f10054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F0 f10056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739j(F0 f7, c cVar) {
        super(cVar);
        this.f10056c = f7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10055b = obj;
        this.f10057d |= Integer.MIN_VALUE;
        return this.f10056c.u(this);
    }
}
