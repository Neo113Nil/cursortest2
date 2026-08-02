package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    private final a f41907a;

    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static HandlerThread f41908e;

        /* renamed from: f, reason: collision with root package name */
        private static Handler f41909f;

        /* renamed from: a, reason: collision with root package name */
        int f41910a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f41911b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f41912c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f41913d = new WindowOnFrameMetricsAvailableListenerC0760a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        final class WindowOnFrameMetricsAvailableListenerC0760a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0760a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                a aVar = a.this;
                if ((aVar.f41910a & 1) != 0) {
                    a.b(aVar.f41911b[0], frameMetrics.getMetric(8));
                }
                if ((aVar.f41910a & 2) != 0) {
                    a.b(aVar.f41911b[1], frameMetrics.getMetric(1));
                }
                if ((aVar.f41910a & 4) != 0) {
                    a.b(aVar.f41911b[2], frameMetrics.getMetric(3));
                }
                if ((aVar.f41910a & 8) != 0) {
                    a.b(aVar.f41911b[3], frameMetrics.getMetric(4));
                }
                if ((aVar.f41910a & 16) != 0) {
                    a.b(aVar.f41911b[4], frameMetrics.getMetric(5));
                }
                if ((aVar.f41910a & 64) != 0) {
                    a.b(aVar.f41911b[6], frameMetrics.getMetric(7));
                }
                if ((aVar.f41910a & 32) != 0) {
                    a.b(aVar.f41911b[5], frameMetrics.getMetric(6));
                }
                if ((aVar.f41910a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    a.b(aVar.f41911b[7], frameMetrics.getMetric(0));
                }
                if ((aVar.f41910a & 256) != 0) {
                    a.b(aVar.f41911b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i11) {
            this.f41910a = i11;
        }

        static void b(SparseIntArray sparseIntArray, long j11) {
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + j11) / 1000000);
                if (j11 >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }

        public final void a(Activity activity) {
            if (f41908e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f41908e = handlerThread;
                handlerThread.start();
                f41909f = new Handler(f41908e.getLooper());
            }
            for (int i11 = 0; i11 <= 8; i11++) {
                SparseIntArray[] sparseIntArrayArr = this.f41911b;
                if (sparseIntArrayArr[i11] == null && (this.f41910a & (1 << i11)) != 0) {
                    sparseIntArrayArr[i11] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f41913d, f41909f);
            this.f41912c.add(new WeakReference<>(activity));
        }

        public final SparseIntArray[] c(Activity activity) {
            ArrayList<WeakReference<Activity>> arrayList = this.f41912c;
            Iterator<WeakReference<Activity>> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    arrayList.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f41913d);
            return this.f41911b;
        }

        public final SparseIntArray[] d() {
            ArrayList<WeakReference<Activity>> arrayList = this.f41912c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = arrayList.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f41913d);
                    arrayList.remove(size);
                }
            }
            return this.f41911b;
        }
    }

    private static class b {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public final void a(@NonNull Activity activity) {
        this.f41907a.a(activity);
    }

    public final SparseIntArray[] b() {
        return this.f41907a.f41911b;
    }

    public final void c(@NonNull Activity activity) {
        this.f41907a.c(activity);
    }

    public final void d() {
        a aVar = this.f41907a;
        SparseIntArray[] sparseIntArrayArr = aVar.f41911b;
        aVar.f41911b = new SparseIntArray[9];
    }

    public final void e() {
        this.f41907a.d();
    }

    public FrameMetricsAggregator(int i11) {
        this.f41907a = new a(i11);
    }
}
