package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C0885t0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9159b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f9161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f9162e;

    public /* synthetic */ Y(AbstractMap abstractMap, int i7) {
        this.f9158a = i7;
        this.f9162e = abstractMap;
    }

    public final Iterator a() {
        switch (this.f9158a) {
            case 0:
                if (this.f9161d == null) {
                    this.f9161d = ((W) this.f9162e).f9151b.entrySet().iterator();
                }
                break;
            default:
                if (this.f9161d == null) {
                    this.f9161d = ((C0885t0) this.f9162e).f12277c.entrySet().iterator();
                }
                break;
        }
        return this.f9161d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9158a) {
            case 0:
                int i7 = this.f9159b + 1;
                W w7 = (W) this.f9162e;
                if (i7 >= w7.f9150a.size()) {
                    return !w7.f9151b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i8 = this.f9159b + 1;
                C0885t0 c0885t0 = (C0885t0) this.f9162e;
                if (i8 >= c0885t0.f12276b.size()) {
                    return !c0885t0.f12277c.isEmpty() && a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9158a) {
            case 0:
                this.f9160c = true;
                int i7 = this.f9159b + 1;
                this.f9159b = i7;
                W w7 = (W) this.f9162e;
                return i7 < w7.f9150a.size() ? (Map.Entry) w7.f9150a.get(this.f9159b) : (Map.Entry) a().next();
            default:
                this.f9160c = true;
                int i8 = this.f9159b + 1;
                this.f9159b = i8;
                C0885t0 c0885t0 = (C0885t0) this.f9162e;
                return i8 < c0885t0.f12276b.size() ? (Map.Entry) c0885t0.f12276b.get(this.f9159b) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f9162e;
        switch (this.f9158a) {
            case 0:
                if (!this.f9160c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f9160c = false;
                int i7 = W.f9149f;
                W w7 = (W) abstractMap;
                w7.b();
                if (this.f9159b >= w7.f9150a.size()) {
                    a().remove();
                    return;
                }
                int i8 = this.f9159b;
                this.f9159b = i8 - 1;
                w7.h(i8);
                return;
            default:
                if (!this.f9160c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f9160c = false;
                int i9 = C0885t0.f12274x;
                C0885t0 c0885t0 = (C0885t0) abstractMap;
                c0885t0.b();
                if (this.f9159b >= c0885t0.f12276b.size()) {
                    a().remove();
                    return;
                }
                int i10 = this.f9159b;
                this.f9159b = i10 - 1;
                c0885t0.g(i10);
                return;
        }
    }
}
