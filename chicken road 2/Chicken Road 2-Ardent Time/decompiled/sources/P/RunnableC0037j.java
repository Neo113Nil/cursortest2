package P;

/* renamed from: P.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0037j implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.ThreadLocal f1278e = new java.lang.ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final P.C0034g f1279f = new P.C0034g();

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f1280a;

    /* renamed from: b, reason: collision with root package name */
    public long f1281b;

    /* renamed from: c, reason: collision with root package name */
    public long f1282c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f1283d;

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f2484m && this.f1281b == 0) {
            this.f1281b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        P.C0035h c0035h = recyclerView.f2465a0;
        c0035h.f1270a = i2;
        c0035h.f1271b = i3;
    }

    public final void b(long j2) {
        P.C0036i c0036i;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.util.ArrayList arrayList = this.f1280a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                P.C0035h c0035h = recyclerView2.f2465a0;
                c0035h.f1272c = 0;
                i2 += c0035h.f1272c;
            }
        }
        java.util.ArrayList arrayList2 = this.f1283d;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                P.C0035h c0035h2 = recyclerView3.f2465a0;
                java.lang.Math.abs(c0035h2.f1270a);
                java.lang.Math.abs(c0035h2.f1271b);
                if (c0035h2.f1272c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new P.C0036i());
                    }
                    throw null;
                }
            }
        }
        java.util.Collections.sort(arrayList2, f1279f);
        if (arrayList2.size() <= 0 || (recyclerView = (c0036i = (P.C0036i) arrayList2.get(0)).f1276d) == null) {
            return;
        }
        int i5 = c0036i.f1277e;
        if (recyclerView.f2470d.D() > 0) {
            androidx.recyclerview.widget.RecyclerView.j(recyclerView.f2470d.C(0));
            throw null;
        }
        P.B b2 = recyclerView.f2464a;
        try {
            recyclerView.f2493w++;
            b2.a(i5);
            throw null;
        } catch (java.lang.Throwable th) {
            int i6 = recyclerView.f2493w - 1;
            recyclerView.f2493w = i6;
            if (i6 < 1) {
                recyclerView.f2493w = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = u.d.f8356a;
            android.os.Trace.beginSection("RV Prefetch");
            java.util.ArrayList arrayList = this.f1280a;
            if (arrayList.isEmpty()) {
                this.f1281b = 0L;
                android.os.Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = java.lang.Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f1281b = 0L;
                android.os.Trace.endSection();
            } else {
                b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j2) + this.f1282c);
                this.f1281b = 0L;
                android.os.Trace.endSection();
            }
        } catch (java.lang.Throwable th) {
            this.f1281b = 0L;
            int i4 = u.d.f8356a;
            android.os.Trace.endSection();
            throw th;
        }
    }
}
