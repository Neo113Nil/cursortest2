package p010b0;

import M6.d;
import p077k6.c;

/* JADX INFO: renamed from: b0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0749u extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f10100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f10101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749u(O o7, c cVar) {
        super(cVar);
        this.f10103d = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10102c = obj;
        this.f10104e |= Integer.MIN_VALUE;
        return O.b(this.f10103d, this);
    }
}
