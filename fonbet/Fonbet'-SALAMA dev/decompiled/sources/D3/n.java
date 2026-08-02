package D3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import w1.P2;

/* loaded from: classes.dex */
public final class n implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f1730b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f1731c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1732d;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u1.c f1735x;

    /* renamed from: a, reason: collision with root package name */
    public int f1729a = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f1733e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1734f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public n(u1.c cVar, P2 p22, CharSequence charSequence) {
        this.f1735x = cVar;
        this.f1732d = (c) p22.f17508b;
        this.f1731c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        c cVar;
        p3.f.r(this.f1729a != 4);
        int e7 = t.e.e(this.f1729a);
        if (e7 == 0) {
            return true;
        }
        if (e7 == 2) {
            return false;
        }
        this.f1729a = 4;
        int i7 = this.f1733e;
        while (true) {
            int i8 = this.f1733e;
            if (i8 == -1) {
                this.f1729a = 3;
                str = null;
                break;
            }
            b bVar = (b) this.f1735x.f16591b;
            CharSequence charSequence = this.f1731c;
            int length = charSequence.length();
            p3.f.n(i8, length);
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(i8))) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                i8 = charSequence.length();
                this.f1733e = -1;
            } else {
                this.f1733e = i8 + 1;
            }
            int i9 = this.f1733e;
            if (i9 == i7) {
                int i10 = i9 + 1;
                this.f1733e = i10;
                if (i10 > charSequence.length()) {
                    this.f1733e = -1;
                }
            } else {
                while (true) {
                    cVar = this.f1732d;
                    if (i7 >= i8 || !cVar.a(charSequence.charAt(i7))) {
                        break;
                    }
                    i7++;
                }
                while (i8 > i7 && cVar.a(charSequence.charAt(i8 - 1))) {
                    i8--;
                }
                int i11 = this.f1734f;
                if (i11 == 1) {
                    i8 = charSequence.length();
                    this.f1733e = -1;
                    while (i8 > i7 && cVar.a(charSequence.charAt(i8 - 1))) {
                        i8--;
                    }
                } else {
                    this.f1734f = i11 - 1;
                }
                str = charSequence.subSequence(i7, i8).toString();
            }
        }
        this.f1730b = str;
        if (this.f1729a == 3) {
            return false;
        }
        this.f1729a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1729a = 2;
        String str = this.f1730b;
        this.f1730b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
