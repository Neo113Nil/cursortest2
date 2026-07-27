package W;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: W.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0166k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3347e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0163h f3348f = new C0163h();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3349a;

    /* renamed from: b, reason: collision with root package name */
    public long f3350b;

    /* renamed from: c, reason: collision with root package name */
    public long f3351c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3352d;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f4669m && this.f3350b == 0) {
            this.f3350b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0164i c0164i = recyclerView.f4653d0;
        c0164i.f3339a = i2;
        c0164i.f3340b = i3;
    }

    public final void b(long j2) {
        C0165j c0165j;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f3349a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0164i c0164i = recyclerView2.f4653d0;
                c0164i.f3341c = 0;
                i2 += c0164i.f3341c;
            }
        }
        ArrayList arrayList2 = this.f3352d;
        arrayList2.ensureCapacity(i2);
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0164i c0164i2 = recyclerView3.f4653d0;
                Math.abs(c0164i2.f3339a);
                Math.abs(c0164i2.f3340b);
                if (c0164i2.f3341c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0165j());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f3348f);
        if (arrayList2.size() <= 0 || (recyclerView = (c0165j = (C0165j) arrayList2.get(0)).f3345d) == null) {
            return;
        }
        int i7 = c0165j.f3346e;
        if (recyclerView.f4652d.I() > 0) {
            RecyclerView.j(recyclerView.f4652d.H(0));
            throw null;
        }
        T4.l lVar = recyclerView.f4646a;
        try {
            recyclerView.f4681w++;
            lVar.e(i7);
            throw null;
        } catch (Throwable th) {
            int i8 = recyclerView.f4681w - 1;
            recyclerView.f4681w = i8;
            if (i8 < 1) {
                recyclerView.f4681w = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = A.g.f2a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3349a;
            if (arrayList.isEmpty()) {
                this.f3350b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f3350b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f3351c);
                this.f3350b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3350b = 0L;
            int i6 = A.g.f2a;
            Trace.endSection();
            throw th;
        }
    }
}
