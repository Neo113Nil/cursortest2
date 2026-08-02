package F4;

import androidx.recyclerview.widget.i;

/* loaded from: classes8.dex */
public final class A extends i.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K f8763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f8764b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i.d<Object> f8765c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f8766d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f8767e;

    A(K k11, K k12, i.d dVar, int i11, int i12) {
        this.f8763a = k11;
        this.f8764b = k12;
        this.f8765c = dVar;
        this.f8766d = i11;
        this.f8767e = i12;
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areContentsTheSame(int i11, int i12) {
        Object c11 = this.f8763a.c(i11);
        Object c12 = this.f8764b.c(i12);
        if (c11 == c12) {
            return true;
        }
        return this.f8765c.areContentsTheSame(c11, c12);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areItemsTheSame(int i11, int i12) {
        Object c11 = this.f8763a.c(i11);
        Object c12 = this.f8764b.c(i12);
        if (c11 == c12) {
            return true;
        }
        return this.f8765c.areItemsTheSame(c11, c12);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final Object getChangePayload(int i11, int i12) {
        Object c11 = this.f8763a.c(i11);
        Object c12 = this.f8764b.c(i12);
        return c11 == c12 ? Boolean.TRUE : this.f8765c.getChangePayload(c11, c12);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getNewListSize() {
        return this.f8767e;
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getOldListSize() {
        return this.f8766d;
    }
}
