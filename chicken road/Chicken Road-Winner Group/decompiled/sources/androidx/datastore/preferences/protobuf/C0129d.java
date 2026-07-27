package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.Y0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2219a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2220b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f2221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2222d;

    public C0129d(Y0 y02) {
        this.f2222d = y02;
        this.f2221c = y02.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2219a) {
            case 0:
                if (this.f2220b < this.f2221c) {
                }
                break;
            default:
                if (this.f2220b < this.f2221c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2219a) {
            case 0:
                int i3 = this.f2220b;
                if (i3 >= this.f2221c) {
                    throw new NoSuchElementException();
                }
                this.f2220b = i3 + 1;
                return Byte.valueOf(((C0132g) this.f2222d).g(i3));
            default:
                int i4 = this.f2220b;
                if (i4 >= this.f2221c) {
                    throw new NoSuchElementException();
                }
                this.f2220b = i4 + 1;
                return Byte.valueOf(((Y0) this.f2222d).c(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2219a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0129d(C0132g c0132g) {
        this.f2222d = c0132g;
        this.f2221c = c0132g.size();
    }
}
