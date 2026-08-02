package C0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: C0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0093l implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1297e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0090i f1298f = new C0090i(0);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1299a;

    /* renamed from: b, reason: collision with root package name */
    public long f1300b;

    /* renamed from: c, reason: collision with root package name */
    public long f1301c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1302d;

    public final void a(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.f9690D && this.f1300b == 0) {
            this.f1300b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0091j c0091j = recyclerView.f9728n0;
        c0091j.f1289a = i7;
        c0091j.f1290b = i8;
    }

    public final void b(long j) {
        C0092k c0092k;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f1299a;
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i8);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0091j c0091j = recyclerView2.f9728n0;
                c0091j.f1291c = 0;
                i7 += c0091j.f1291c;
            }
        }
        ArrayList arrayList2 = this.f1302d;
        arrayList2.ensureCapacity(i7);
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i9);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0091j c0091j2 = recyclerView3.f9728n0;
                Math.abs(c0091j2.f1289a);
                Math.abs(c0091j2.f1290b);
                if (c0091j2.f1291c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0092k());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f1298f);
        if (arrayList2.size() <= 0 || (recyclerView = (c0092k = (C0092k) arrayList2.get(0)).f1295d) == null) {
            return;
        }
        int i10 = c0092k.f1296e;
        if (recyclerView.f9715d.h0() > 0) {
            RecyclerView.j(recyclerView.f9715d.g0(0));
            throw null;
        }
        A a2 = recyclerView.f9710a;
        try {
            recyclerView.f9700N++;
            a2.n(i10);
            throw null;
        } catch (Throwable th) {
            int i11 = recyclerView.f9700N - 1;
            recyclerView.f9700N = i11;
            if (i11 < 1) {
                recyclerView.f9700N = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = L.l.f4188a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1299a;
            if (arrayList.isEmpty()) {
                this.f1300b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i8);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f1300b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.f1301c);
                this.f1300b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f1300b = 0L;
            int i9 = L.l.f4188a;
            Trace.endSection();
            throw th;
        }
    }
}
