package Pf;

import Of.C3707a;
import Pf.f;
import Pf.q;
import java.io.Serializable;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class b implements Iterable<C3821a>, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f22452a = 0;

    /* renamed from: b, reason: collision with root package name */
    String[] f22453b = new String[3];

    /* renamed from: c, reason: collision with root package name */
    Object[] f22454c = new Object[3];

    final class a implements Iterator<C3821a> {

        /* renamed from: a, reason: collision with root package name */
        int f22455a;

        /* renamed from: b, reason: collision with root package name */
        int f22456b = 0;

        a() {
            this.f22455a = b.this.f22452a;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            b bVar = b.this;
            if (bVar.f22452a != this.f22455a) {
                throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
            }
            while (this.f22456b < bVar.f22452a && b.s(bVar.f22453b[this.f22456b])) {
                this.f22456b++;
            }
            return this.f22456b < bVar.f22452a;
        }

        @Override // java.util.Iterator
        public final C3821a next() {
            b bVar = b.this;
            if (bVar.f22452a != this.f22455a) {
                throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
            }
            if (this.f22456b >= bVar.f22452a) {
                throw new NoSuchElementException();
            }
            C3821a c3821a = new C3821a(bVar.f22453b[this.f22456b], (String) bVar.f22454c[this.f22456b], bVar);
            this.f22456b++;
            return c3821a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i11 = this.f22456b - 1;
            this.f22456b = i11;
            b.this.x(i11);
            this.f22455a--;
        }
    }

    private void f(String str, Serializable serializable) {
        g(this.f22452a + 1);
        String[] strArr = this.f22453b;
        int i11 = this.f22452a;
        strArr[i11] = str;
        this.f22454c[i11] = serializable;
        this.f22452a = i11 + 1;
    }

    private void g(int i11) {
        Nf.b.a(i11 >= this.f22452a);
        String[] strArr = this.f22453b;
        int length = strArr.length;
        if (length >= i11) {
            return;
        }
        int i12 = length >= 3 ? this.f22452a * 2 : 3;
        if (i11 <= i12) {
            i11 = i12;
        }
        this.f22453b = (String[]) Arrays.copyOf(strArr, i11);
        this.f22454c = Arrays.copyOf(this.f22454c, i11);
    }

    private int r(String str) {
        Nf.b.d(str);
        for (int i11 = 0; i11 < this.f22452a; i11++) {
            if (str.equalsIgnoreCase(this.f22453b[i11])) {
                return i11;
            }
        }
        return -1;
    }

    static boolean s(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i11) {
        int i12 = this.f22452a;
        if (i11 >= i12) {
            throw new Nf.c("Must be false");
        }
        int i13 = (i12 - i11) - 1;
        if (i13 > 0) {
            String[] strArr = this.f22453b;
            int i14 = i11 + 1;
            System.arraycopy(strArr, i14, strArr, i11, i13);
            Object[] objArr = this.f22454c;
            System.arraycopy(objArr, i14, objArr, i11, i13);
        }
        int i15 = this.f22452a - 1;
        this.f22452a = i15;
        this.f22453b[i15] = null;
        this.f22454c[i15] = null;
    }

    public final void A(String str, q.a aVar) {
        Nf.b.d(str);
        Map map = (Map) (!m("/jsoup.userdata") ? null : B().get("jsoup.attrs"));
        if (map == null) {
            map = new HashMap();
            C(map, "jsoup.attrs");
        }
        map.put(str, aVar);
    }

    final Map<String, Object> B() {
        int q11 = q("/jsoup.userdata");
        if (q11 != -1) {
            return (Map) this.f22454c[q11];
        }
        HashMap hashMap = new HashMap();
        f("/jsoup.userdata", hashMap);
        return hashMap;
    }

    public final void C(Object obj, String str) {
        B().put(str, obj);
    }

    public final void c(String str, String str2) {
        f(str, str2);
    }

    public final void e(b bVar) {
        int i11 = bVar.f22452a;
        if (i11 == 0) {
            return;
        }
        g(this.f22452a + i11);
        boolean z11 = this.f22452a != 0;
        a aVar = bVar.new a();
        while (aVar.hasNext()) {
            C3821a c3821a = (C3821a) aVar.next();
            if (z11) {
                u(c3821a);
            } else {
                f(c3821a.a(), c3821a.getValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22452a != bVar.f22452a) {
            return false;
        }
        for (int i11 = 0; i11 < this.f22452a; i11++) {
            int q11 = bVar.q(this.f22453b[i11]);
            if (q11 == -1 || !Objects.equals(this.f22454c[i11], bVar.f22454c[q11])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f22452a = this.f22452a;
            bVar.f22453b = (String[]) Arrays.copyOf(this.f22453b, this.f22452a);
            bVar.f22454c = Arrays.copyOf(this.f22454c, this.f22452a);
            int q11 = q("/jsoup.userdata");
            if (q11 != -1) {
                this.f22454c[q11] = new HashMap((Map) this.f22454c[q11]);
            }
            return bVar;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22454c) + (((this.f22452a * 31) + Arrays.hashCode(this.f22453b)) * 31);
    }

    public final int i(org.jsoup.parser.k kVar) {
        int i11 = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean d11 = kVar.d();
        int i12 = 0;
        while (i11 < this.f22452a) {
            String str = this.f22453b[i11];
            i11++;
            int i13 = i11;
            while (i13 < this.f22452a) {
                if ((d11 && str.equals(this.f22453b[i13])) || (!d11 && str.equalsIgnoreCase(this.f22453b[i13]))) {
                    i12++;
                    x(i13);
                    i13--;
                }
                i13++;
            }
        }
        return i12;
    }

    public final boolean isEmpty() {
        return this.f22452a == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<C3821a> iterator() {
        return new a();
    }

    public final String k(String str) {
        Object obj;
        int q11 = q(str);
        return (q11 == -1 || (obj = this.f22454c[q11]) == null) ? "" : (String) obj;
    }

    public final String l(String str) {
        Object obj;
        int r11 = r(str);
        return (r11 == -1 || (obj = this.f22454c[r11]) == null) ? "" : (String) obj;
    }

    public final boolean m(String str) {
        return q(str) != -1;
    }

    public final boolean n(String str) {
        return r(str) != -1;
    }

    final void o(Of.b bVar, f.a aVar) {
        String b11;
        int i11 = this.f22452a;
        for (int i12 = 0; i12 < i11; i12++) {
            String str = this.f22453b[i12];
            if (!s(str) && (b11 = C3821a.b(str, aVar.g())) != null) {
                C3821a.d(b11, (String) this.f22454c[i12], bVar.a(' '), aVar);
            }
        }
    }

    final int q(String str) {
        Nf.b.d(str);
        for (int i11 = 0; i11 < this.f22452a; i11++) {
            if (str.equals(this.f22453b[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int size() {
        return this.f22452a;
    }

    public final void t() {
        for (int i11 = 0; i11 < this.f22452a; i11++) {
            String str = this.f22453b[i11];
            if (!s(str)) {
                this.f22453b[i11] = C3707a.a(str);
            }
        }
    }

    public final String toString() {
        StringBuilder b11 = Of.k.b();
        o(Of.b.d(b11), new f.a());
        return Of.k.l(b11);
    }

    public final void u(C3821a c3821a) {
        Nf.b.d(c3821a);
        v(c3821a.a(), c3821a.getValue());
        c3821a.f22451c = this;
    }

    public final void v(String str, String str2) {
        Nf.b.d(str);
        int q11 = q(str);
        if (q11 != -1) {
            this.f22454c[q11] = str2;
        } else {
            f(str, str2);
        }
    }

    final void w(String str, String str2) {
        int r11 = r(str);
        if (r11 == -1) {
            f(str, str2);
            return;
        }
        this.f22454c[r11] = str2;
        if (this.f22453b[r11].equals(str)) {
            return;
        }
        this.f22453b[r11] = str;
    }

    public final q.a z(String str) {
        q.a aVar;
        if (!m(str)) {
            return q.a.f22500c;
        }
        Map map = (Map) (!m("/jsoup.userdata") ? null : B().get("jsoup.attrs"));
        return (map == null || (aVar = (q.a) map.get(str)) == null) ? q.a.f22500c : aVar;
    }
}
