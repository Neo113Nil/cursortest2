package p098n4;

import p003a.a;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f15387e;

    public L(r rVar) {
        this.f15387e = rVar;
    }

    @Override // p003a.a
    public final a Y(c cVar) {
        return new L(this.f15387e.o(cVar));
    }

    @Override // p003a.a
    public final r f0() {
        return this.f15387e;
    }
}
