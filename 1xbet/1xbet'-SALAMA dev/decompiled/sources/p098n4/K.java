package p098n4;

import java.util.ArrayList;
import p003a.a;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f15385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0934g f15386f;

    public K(D d7, C0934g c0934g) {
        this.f15385e = d7;
        this.f15386f = c0934g;
    }

    @Override // p003a.a
    public final a Y(c cVar) {
        return new K(this.f15385e, this.f15386f.t(cVar));
    }

    @Override // p003a.a
    public final r f0() {
        return this.f15385e.i(this.f15386f, new ArrayList());
    }
}
