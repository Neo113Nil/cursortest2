package U;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: U.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0071k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1567e = new ThreadLocal();
    public static final C0068h f = new C0068h();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1568a;

    /* renamed from: b, reason: collision with root package name */
    public long f1569b;

    /* renamed from: c, reason: collision with root package name */
    public long f1570c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1571d;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f2413m && this.f1569b == 0) {
            this.f1569b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0069i c0069i = recyclerView.f2392T;
        c0069i.f1559a = i3;
        c0069i.f1560b = i4;
    }

    public final void b(long j3) {
        C0070j c0070j;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f1568a;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0069i c0069i = recyclerView2.f2392T;
                c0069i.f1561c = 0;
                i3 += c0069i.f1561c;
            }
        }
        ArrayList arrayList2 = this.f1571d;
        arrayList2.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0069i c0069i2 = recyclerView3.f2392T;
                Math.abs(c0069i2.f1559a);
                Math.abs(c0069i2.f1560b);
                if (c0069i2.f1561c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0070j());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f);
        if (arrayList2.size() <= 0 || (recyclerView = (c0070j = (C0070j) arrayList2.get(0)).f1565d) == null) {
            return;
        }
        int i6 = c0070j.f1566e;
        if (recyclerView.f2402d.D() > 0) {
            RecyclerView.j(recyclerView.f2402d.C(0));
            throw null;
        }
        A a3 = recyclerView.f2396a;
        try {
            recyclerView.f2423w++;
            a3.a(i6);
            throw null;
        } catch (Throwable th) {
            int i7 = recyclerView.f2423w - 1;
            recyclerView.f2423w = i7;
            if (i7 < 1) {
                recyclerView.f2423w = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = z.e.f10630a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1568a;
            if (arrayList.isEmpty()) {
                this.f1569b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f1569b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f1570c);
                this.f1569b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f1569b = 0L;
            int i5 = z.e.f10630a;
            Trace.endSection();
            throw th;
        }
    }
}
