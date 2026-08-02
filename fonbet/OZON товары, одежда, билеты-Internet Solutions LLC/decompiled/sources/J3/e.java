package J3;

import J3.b;
import java.util.Arrays;
import m3.N;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: c, reason: collision with root package name */
    private int f13760c;

    /* renamed from: d, reason: collision with root package name */
    private int f13761d;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13758a = true;

    /* renamed from: b, reason: collision with root package name */
    private final int f13759b = 65536;

    /* renamed from: e, reason: collision with root package name */
    private int f13762e = 0;

    /* renamed from: f, reason: collision with root package name */
    private a[] f13763f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i11 = this.f13761d + 1;
            this.f13761d = i11;
            int i12 = this.f13762e;
            if (i12 > 0) {
                a[] aVarArr = this.f13763f;
                int i13 = i12 - 1;
                this.f13762e = i13;
                aVar = aVarArr[i13];
                aVar.getClass();
                this.f13763f[this.f13762e] = null;
            } else {
                a aVar2 = new a(0, new byte[this.f13759b]);
                a[] aVarArr2 = this.f13763f;
                if (i11 > aVarArr2.length) {
                    this.f13763f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final int b() {
        return this.f13759b;
    }

    public final synchronized int c() {
        return this.f13761d * this.f13759b;
    }

    public final synchronized void d(a aVar) {
        a[] aVarArr = this.f13763f;
        int i11 = this.f13762e;
        this.f13762e = i11 + 1;
        aVarArr[i11] = aVar;
        this.f13761d--;
        notifyAll();
    }

    public final synchronized void e(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f13763f;
                int i11 = this.f13762e;
                this.f13762e = i11 + 1;
                aVarArr[i11] = aVar.a();
                this.f13761d--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void f() {
        if (this.f13758a) {
            g(0);
        }
    }

    public final synchronized void g(int i11) {
        boolean z11 = i11 < this.f13760c;
        this.f13760c = i11;
        if (z11) {
            h();
        }
    }

    public final synchronized void h() {
        int max = Math.max(0, N.f(this.f13760c, this.f13759b) - this.f13761d);
        int i11 = this.f13762e;
        if (max >= i11) {
            return;
        }
        Arrays.fill(this.f13763f, max, i11, (Object) null);
        this.f13762e = max;
    }
}
