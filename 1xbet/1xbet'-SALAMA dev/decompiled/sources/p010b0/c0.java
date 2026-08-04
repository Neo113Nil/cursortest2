package p010b0;

import M6.a;
import p077k6.c;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F0 f10016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F0 f10019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(F0 f7, c cVar) {
        super(cVar);
        this.f10019d = f7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10018c = obj;
        this.f10020e |= Integer.MIN_VALUE;
        return this.f10019d.K(this);
    }
}
