package b3;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f4818a;

    /* renamed from: b, reason: collision with root package name */
    public Map.Entry f4819b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4820c;

    public C0280a(AbstractRunnableC0283d abstractRunnableC0283d, Iterator it) {
        this.f4818a = it;
        a();
    }

    public final void a() {
        T t5;
        do {
            Iterator it = this.f4818a;
            if (!it.hasNext()) {
                this.f4819b = null;
                this.f4820c = null;
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                this.f4819b = entry;
                t5 = ((C0282c) entry.getKey()).get();
                this.f4820c = t5;
            }
        } while (t5 == 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4820c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f4820c;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        try {
            return new C0281b(obj, this.f4819b);
        } finally {
            a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
