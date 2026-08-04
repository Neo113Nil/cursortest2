package D3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f1731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1732d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p145u1.c f1735x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1729a = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1733e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1734f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public n(p145u1.c cVar, P2 p5, CharSequence charSequence) {
        this.f1735x = cVar;
        this.f1732d = (c) p5.f17514b;
        this.f1731c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        c cVar;
        p113p3.f.r(this.f1729a != 4);
        int iE = p136t.e.e(this.f1729a);
        if (iE == 0) {
            return true;
        }
        if (iE == 2) {
            return false;
        }
        this.f1729a = 4;
        int i7 = this.f1733e;
        while (true) {
            int length = this.f1733e;
            if (length == -1) {
                this.f1729a = 3;
                string = null;
                break;
            }
            b bVar = (b) this.f1735x.f16597b;
            CharSequence charSequence = this.f1731c;
            int length2 = charSequence.length();
            p113p3.f.n(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f1733e = -1;
            } else {
                this.f1733e = length + 1;
            }
            int i8 = this.f1733e;
            if (i8 != i7) {
                while (true) {
                    cVar = this.f1732d;
                    if (i7 >= length || !cVar.a(charSequence.charAt(i7))) {
                        break;
                    }
                    i7++;
                }
                while (length > i7 && cVar.a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i9 = this.f1734f;
                if (i9 == 1) {
                    length = charSequence.length();
                    this.f1733e = -1;
                    while (length > i7 && cVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.f1734f = i9 - 1;
                }
                string = charSequence.subSequence(i7, length).toString();
                break;
            }
            int i10 = i8 + 1;
            this.f1733e = i10;
            if (i10 > charSequence.length()) {
                this.f1733e = -1;
            }
        }
        this.f1730b = string;
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
