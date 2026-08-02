package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38478a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final LongSparseArray<List<TotalCaptureResult>> f38479b = new LongSparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    HashMap f38480c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final LongSparseArray<List<d>> f38481d = new LongSparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    a f38482e;

    interface a {
        void a(@NonNull d dVar, @NonNull TotalCaptureResult totalCaptureResult, int i11);
    }

    c() {
    }

    private void e() {
        a aVar;
        d dVar;
        TotalCaptureResult totalCaptureResult;
        Integer num;
        synchronized (this.f38478a) {
            try {
                int size = this.f38479b.size() - 1;
                while (true) {
                    aVar = null;
                    if (size < 0) {
                        dVar = null;
                        totalCaptureResult = null;
                        break;
                    }
                    List<TotalCaptureResult> valueAt = this.f38479b.valueAt(size);
                    if (!valueAt.isEmpty()) {
                        totalCaptureResult = valueAt.get(0);
                        Long l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                        long longValue = l11 != null ? l11.longValue() : -1L;
                        x2.i.f(null, longValue == this.f38479b.keyAt(size));
                        List<d> list = this.f38481d.get(longValue);
                        if (list != null && !list.isEmpty()) {
                            dVar = list.get(0);
                            LongSparseArray<List<d>> longSparseArray = this.f38481d;
                            List<d> list2 = longSparseArray.get(longValue);
                            if (list2 != null) {
                                list2.remove(dVar);
                                if (list2.isEmpty()) {
                                    longSparseArray.remove(longValue);
                                }
                            }
                            valueAt.remove(totalCaptureResult);
                            if (valueAt.isEmpty()) {
                                this.f38479b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                f();
            } finally {
            }
        }
        if (dVar == null || totalCaptureResult == null) {
            return;
        }
        synchronized (this.f38478a) {
            try {
                a aVar2 = this.f38482e;
                if (aVar2 != null) {
                    aVar = aVar2;
                    num = (Integer) this.f38480c.get(totalCaptureResult);
                } else {
                    dVar.b();
                    num = null;
                }
            } finally {
            }
        }
        if (aVar != null) {
            aVar.a(dVar, totalCaptureResult, num.intValue());
        }
    }

    private void f() {
        synchronized (this.f38478a) {
            try {
                if (this.f38481d.size() != 0 && this.f38479b.size() != 0) {
                    long keyAt = this.f38481d.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f38479b.keyAt(0);
                    x2.i.b(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f38481d.size() - 1; size >= 0; size--) {
                            if (this.f38481d.keyAt(size) < keyAt2) {
                                Iterator<d> it = this.f38481d.valueAt(size).iterator();
                                while (it.hasNext()) {
                                    it.next().b();
                                }
                                this.f38481d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f38479b.size() - 1; size2 >= 0; size2--) {
                            if (this.f38479b.keyAt(size2) < keyAt) {
                                this.f38479b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    final void a(@NonNull TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.f38478a) {
            try {
                Long l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long longValue = l11 != null ? l11.longValue() : -1L;
                if (longValue == -1) {
                    return;
                }
                LongSparseArray<List<TotalCaptureResult>> longSparseArray = this.f38479b;
                List<TotalCaptureResult> list = longSparseArray.get(longValue);
                if (list == null) {
                    list = new ArrayList<>();
                    longSparseArray.put(longValue, list);
                }
                list.add(totalCaptureResult);
                this.f38480c.put(totalCaptureResult, Integer.valueOf(i11));
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void b() {
        synchronized (this.f38478a) {
            try {
                this.f38479b.clear();
                for (int i11 = 0; i11 < this.f38481d.size(); i11++) {
                    Iterator<d> it = this.f38481d.get(this.f38481d.keyAt(i11)).iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
                this.f38481d.clear();
                this.f38480c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void c() {
        synchronized (this.f38478a) {
            this.f38482e = null;
        }
    }

    final void d(@NonNull d dVar) {
        synchronized (this.f38478a) {
            Image image = dVar.get();
            LongSparseArray<List<d>> longSparseArray = this.f38481d;
            long timestamp = image.getTimestamp();
            List<d> list = longSparseArray.get(timestamp);
            if (list == null) {
                list = new ArrayList<>();
                longSparseArray.put(timestamp, list);
            }
            list.add(dVar);
        }
        e();
    }

    final void g(@NonNull a aVar) {
        synchronized (this.f38478a) {
            this.f38482e = aVar;
        }
    }
}
