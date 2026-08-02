package g0;

import android.util.SparseArray;
import h0.C1175a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f13040a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f13041b;

    /* renamed from: c, reason: collision with root package name */
    public r f13042c;

    /* renamed from: d, reason: collision with root package name */
    public r f13043d;

    /* renamed from: e, reason: collision with root package name */
    public int f13044e;

    /* renamed from: f, reason: collision with root package name */
    public int f13045f;

    public o(r rVar) {
        this.f13041b = rVar;
        this.f13042c = rVar;
    }

    public final int a(int i7) {
        SparseArray sparseArray = this.f13042c.f13055a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i7);
        int i8 = 1;
        int i9 = 2;
        if (this.f13040a == 2) {
            if (rVar != null) {
                this.f13042c = rVar;
                this.f13045f++;
            } else if (i7 == 65038) {
                b();
            } else if (i7 != 65039) {
                r rVar2 = this.f13042c;
                if (rVar2.f13056b != null) {
                    i9 = 3;
                    if (this.f13045f != 1) {
                        this.f13043d = rVar2;
                        b();
                    } else if (c()) {
                        this.f13043d = this.f13042c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i8 = i9;
        } else if (rVar == null) {
            b();
        } else {
            this.f13040a = 2;
            this.f13042c = rVar;
            this.f13045f = 1;
            i8 = i9;
        }
        this.f13044e = i7;
        return i8;
    }

    public final void b() {
        this.f13040a = 1;
        this.f13042c = this.f13041b;
        this.f13045f = 0;
    }

    public final boolean c() {
        C1175a c3 = this.f13042c.f13056b.c();
        int a2 = c3.a(6);
        return !(a2 == 0 || ((ByteBuffer) c3.f5028d).get(a2 + c3.f5025a) == 0) || this.f13044e == 65039;
    }
}
