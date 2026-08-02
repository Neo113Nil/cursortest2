package androidx.datastore.preferences.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0872h;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9174a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9175b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f9176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9177d;

    public C0680d(C0683g c0683g) {
        this.f9177d = c0683g;
        this.f9176c = c0683g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9174a) {
            case 0:
                if (this.f9175b < this.f9176c) {
                }
                break;
            default:
                if (this.f9175b < this.f9176c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9174a) {
            case 0:
                int i7 = this.f9175b;
                if (i7 >= this.f9176c) {
                    throw new NoSuchElementException();
                }
                this.f9175b = i7 + 1;
                return Byte.valueOf(((C0683g) this.f9177d).A(i7));
            default:
                int i8 = this.f9175b;
                if (i8 >= this.f9176c) {
                    throw new NoSuchElementException();
                }
                this.f9175b = i8 + 1;
                return Byte.valueOf(((C0872h) this.f9177d).B(i8));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9174a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0680d(C0872h c0872h) {
        this.f9177d = c0872h;
        this.f9176c = c0872h.size();
    }
}
