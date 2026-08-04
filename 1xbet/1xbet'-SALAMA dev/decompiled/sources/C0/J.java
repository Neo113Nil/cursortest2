package C0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1238e;

    public J() {
        this.f1234a = -1;
        this.f1235b = -1;
        this.f1238e = null;
        this.f1237d = new ArrayList();
        this.f1236c = 1;
    }

    public void a() {
        int i7 = this.f1236c;
        this.f1236c = i7 == Integer.MIN_VALUE ? this.f1234a : i7 + this.f1235b;
        this.f1238e = ((String) this.f1237d) + this.f1236c;
    }

    public int b(int i7) {
        int i8 = this.f1235b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f1237d).size() == 0) {
            return i7;
        }
        ArrayList arrayList = (ArrayList) this.f1237d;
        View view = (View) arrayList.get(arrayList.size() - 1);
        H h6 = (H) view.getLayoutParams();
        this.f1235b = ((StaggeredGridLayoutManager) this.f1238e).j.d(view);
        h6.getClass();
        return this.f1235b;
    }

    public void c(Z5.b bVar) {
        int i7;
        int i8 = bVar.f7888c;
        if (i8 > 4096) {
            Arrays.fill((Z5.b[]) this.f1238e, (Object) null);
            this.f1235b = ((Z5.b[]) this.f1238e).length - 1;
            this.f1234a = 0;
            this.f1236c = 0;
            return;
        }
        int i9 = (this.f1236c + i8) - 4096;
        if (i9 > 0) {
            int length = ((Z5.b[]) this.f1238e).length - 1;
            int i10 = 0;
            while (true) {
                i7 = this.f1235b;
                if (length < i7 || i9 <= 0) {
                    break;
                }
                int i11 = ((Z5.b[]) this.f1238e)[length].f7888c;
                i9 -= i11;
                this.f1236c -= i11;
                this.f1234a--;
                i10++;
                length--;
            }
            Z5.b[] bVarArr = (Z5.b[]) this.f1238e;
            int i12 = i7 + 1;
            System.arraycopy(bVarArr, i12, bVarArr, i12 + i10, this.f1234a);
            this.f1235b += i10;
        }
        int i13 = this.f1234a + 1;
        Z5.b[] bVarArr2 = (Z5.b[]) this.f1238e;
        if (i13 > bVarArr2.length) {
            Z5.b[] bVarArr3 = new Z5.b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f1235b = ((Z5.b[]) this.f1238e).length - 1;
            this.f1238e = bVarArr3;
        }
        int i14 = this.f1235b;
        this.f1235b = i14 - 1;
        ((Z5.b[]) this.f1238e)[i14] = bVar;
        this.f1234a++;
        this.f1236c += i8;
    }

    public void d() {
        if (this.f1236c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public void e(String str) {
        if (str == null || "".equals(str)) {
            this.f1238e = null;
            return;
        }
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.f1238e = str;
        } else {
            J2.j.g("Invalid value passed to setMaxAdContentRating: ".concat(str));
        }
    }

    public void f(int i7) {
        if (i7 == -1 || i7 == 0 || i7 == 1) {
            this.f1234a = i7;
            return;
        }
        J2.j.g("Invalid value passed to setTagForChildDirectedTreatment: " + i7);
    }

    public void g(int i7) {
        if (i7 == -1 || i7 == 0 || i7 == 1) {
            this.f1235b = i7;
            return;
        }
        J2.j.g("Invalid value passed to setTagForUnderAgeOfConsent: " + i7);
    }

    public void h(N6.f fVar) {
        i(fVar.b(), 127, 0);
        fVar.z((N6.d) this.f1237d, fVar.b());
    }

    public void i(int i7, int i8, int i9) {
        N6.d dVar = (N6.d) this.f1237d;
        if (i7 < i8) {
            dVar.n(i7 | i9);
            return;
        }
        dVar.n(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            dVar.n(128 | (i10 & 127));
            i10 >>>= 7;
        }
        dVar.n(i10);
    }

    public J(int i7, int i8) {
        this(Integer.MIN_VALUE, i7, i8);
    }

    public J(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.f1237d = str;
        this.f1234a = i8;
        this.f1235b = i9;
        this.f1236c = Integer.MIN_VALUE;
        this.f1238e = "";
    }

    public J(N6.d dVar) {
        this.f1238e = new Z5.b[8];
        this.f1235b = 7;
        this.f1237d = dVar;
    }

    public J(StaggeredGridLayoutManager staggeredGridLayoutManager, int i7) {
        this.f1238e = staggeredGridLayoutManager;
        this.f1237d = new ArrayList();
        this.f1234a = Integer.MIN_VALUE;
        this.f1235b = Integer.MIN_VALUE;
        this.f1236c = i7;
    }
}
