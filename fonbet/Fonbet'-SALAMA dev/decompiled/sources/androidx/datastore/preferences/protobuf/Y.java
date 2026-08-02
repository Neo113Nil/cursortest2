package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C0929t0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Y implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9158a;

    /* renamed from: b, reason: collision with root package name */
    public int f9159b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9160c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f9161d;

    /* renamed from: e, reason: collision with root package name */
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
                    this.f9161d = ((C0929t0) this.f9162e).f12277c.entrySet().iterator();
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
                    if (w7.f9151b.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
            default:
                int i8 = this.f9159b + 1;
                C0929t0 c0929t0 = (C0929t0) this.f9162e;
                if (i8 >= c0929t0.f12276b.size()) {
                    if (c0929t0.f12277c.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9158a) {
            case 0:
                this.f9160c = true;
                int i7 = this.f9159b + 1;
                this.f9159b = i7;
                W w7 = (W) this.f9162e;
                if (i7 >= w7.f9150a.size()) {
                    break;
                } else {
                    break;
                }
            default:
                this.f9160c = true;
                int i8 = this.f9159b + 1;
                this.f9159b = i8;
                C0929t0 c0929t0 = (C0929t0) this.f9162e;
                if (i8 >= c0929t0.f12276b.size()) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
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
                int i9 = C0929t0.f12274x;
                C0929t0 c0929t0 = (C0929t0) abstractMap;
                c0929t0.b();
                if (this.f9159b >= c0929t0.f12276b.size()) {
                    a().remove();
                    return;
                }
                int i10 = this.f9159b;
                this.f9159b = i10 - 1;
                c0929t0.g(i10);
                return;
        }
    }
}
