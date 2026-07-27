package n;

import java.util.Iterator;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1138d extends AbstractC1139e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1137c f10121a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10122b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1140f f10123c;

    public C1138d(C1140f c1140f) {
        this.f10123c = c1140f;
    }

    @Override // n.AbstractC1139e
    public final void a(C1137c c1137c) {
        C1137c c1137c2 = this.f10121a;
        if (c1137c == c1137c2) {
            C1137c c1137c3 = c1137c2.f10120d;
            this.f10121a = c1137c3;
            this.f10122b = c1137c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10122b) {
            return this.f10123c.f10124a != null;
        }
        C1137c c1137c = this.f10121a;
        return (c1137c == null || c1137c.f10119c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10122b) {
            this.f10122b = false;
            this.f10121a = this.f10123c.f10124a;
        } else {
            C1137c c1137c = this.f10121a;
            this.f10121a = c1137c != null ? c1137c.f10119c : null;
        }
        return this.f10121a;
    }
}
