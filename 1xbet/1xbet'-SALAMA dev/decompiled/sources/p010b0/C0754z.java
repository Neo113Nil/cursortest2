package p010b0;

import p077k6.c;

/* JADX INFO: renamed from: b0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f10120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754z(O o7, c cVar) {
        super(cVar);
        this.f10123d = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10122c = obj;
        this.f10124e |= Integer.MIN_VALUE;
        return this.f10123d.h(this);
    }
}
