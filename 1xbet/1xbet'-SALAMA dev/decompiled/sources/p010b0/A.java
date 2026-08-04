package p010b0;

import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f9902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f9903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f9906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o7, d dVar) {
        super(dVar);
        this.f9906e = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f9905d = obj;
        this.f9907f |= Integer.MIN_VALUE;
        return O.e(this.f9906e, false, this);
    }
}
