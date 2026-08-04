package p010b0;

import P5.B;
import p065i6.d;
import p077k6.c;

/* JADX INFO: renamed from: b0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0747s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f10095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0747s(B b7, d dVar) {
        super(dVar);
        this.f10095c = b7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10093a = obj;
        this.f10094b |= Integer.MIN_VALUE;
        return this.f10095c.c(null, this);
    }
}
