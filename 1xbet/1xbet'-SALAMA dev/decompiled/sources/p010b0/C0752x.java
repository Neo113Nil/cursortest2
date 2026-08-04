package p010b0;

import M6.d;
import p077k6.c;

/* JADX INFO: renamed from: b0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752x extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f10113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f10114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752x(O o7, c cVar) {
        super(cVar);
        this.f10116d = o7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10115c = obj;
        this.f10117e |= Integer.MIN_VALUE;
        return O.d(this.f10116d, this);
    }
}
