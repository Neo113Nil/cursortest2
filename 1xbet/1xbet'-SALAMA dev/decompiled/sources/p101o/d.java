package p101o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15530b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f15531c;

    public d(f fVar) {
        this.f15531c = fVar;
    }

    @Override // p101o.e
    public final void a(c cVar) {
        c cVar2 = this.f15529a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f15528d;
            this.f15529a = cVar3;
            this.f15530b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15530b) {
            return this.f15531c.f15532a != null;
        }
        c cVar = this.f15529a;
        return (cVar == null || cVar.f15527c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15530b) {
            this.f15530b = false;
            this.f15529a = this.f15531c.f15532a;
        } else {
            c cVar = this.f15529a;
            this.f15529a = cVar != null ? cVar.f15527c : null;
        }
        return this.f15529a;
    }
}
