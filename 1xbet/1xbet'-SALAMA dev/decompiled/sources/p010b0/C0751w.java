package p010b0;

import D6.C0136t;
import p077k6.c;

/* JADX INFO: renamed from: b0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0751w extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f10108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0136t f10109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f10111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751w(O o7, c cVar) {
        super(cVar);
        this.f10111e = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10110d = obj;
        this.f10112f |= Integer.MIN_VALUE;
        return O.c(this.f10111e, null, this);
    }
}
