package I1;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1260a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1261b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1262c;

    public n() {
        this.f1261b = new Object();
    }

    public void a(double d6, double d7) {
        boolean z = this.f1260a;
        double[] dArr = (double[]) this.f1261b;
        double d8 = 1.0d;
        if (!z) {
            d8 = 1.0d / (((dArr[7] * d7) + (dArr[3] * d6)) + dArr[15]);
        }
        double d9 = ((dArr[4] * d7) + (dArr[0] * d6) + dArr[12]) * d8;
        double d10 = ((dArr[5] * d7) + (dArr[1] * d6) + dArr[13]) * d8;
        double[] dArr2 = (double[]) this.f1262c;
        if (d9 < dArr2[0]) {
            dArr2[0] = d9;
        } else if (d9 > dArr2[1]) {
            dArr2[1] = d9;
        }
        if (d10 < dArr2[2]) {
            dArr2[2] = d10;
        } else if (d10 > dArr2[3]) {
            dArr2[3] = d10;
        }
    }

    public void b(m mVar) {
        synchronized (this.f1261b) {
            try {
                if (((ArrayDeque) this.f1262c) == null) {
                    this.f1262c = new ArrayDeque();
                }
                ((ArrayDeque) this.f1262c).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Task task) {
        m mVar;
        synchronized (this.f1261b) {
            if (((ArrayDeque) this.f1262c) != null && !this.f1260a) {
                this.f1260a = true;
                while (true) {
                    synchronized (this.f1261b) {
                        try {
                            mVar = (m) ((ArrayDeque) this.f1262c).poll();
                            if (mVar == null) {
                                this.f1260a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    mVar.b(task);
                }
            }
        }
    }

    public n(boolean z, double[] dArr, double[] dArr2) {
        this.f1260a = z;
        this.f1261b = dArr;
        this.f1262c = dArr2;
    }
}
