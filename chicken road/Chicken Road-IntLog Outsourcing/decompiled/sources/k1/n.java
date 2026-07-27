package k1;

import G0.J;
import G0.O;
import G0.y;
import I1.o;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static n f10710e;

    /* renamed from: a, reason: collision with root package name */
    public int f10711a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10712b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10713c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10714d;

    public n(J j2, int i2, Consumer consumer, Runnable runnable) {
        this.f10711a = i2;
        this.f10712b = consumer;
        this.f10713c = runnable;
        this.f10714d = j2;
    }

    public static synchronized n c(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f10710e == null) {
                    f10710e = new n(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new y("MessengerIpcClient"))));
                }
                nVar = f10710e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public Object a() {
        int i2 = this.f10711a;
        ArrayList arrayList = (ArrayList) this.f10712b;
        if (i2 < arrayList.size()) {
            int i3 = this.f10711a;
            this.f10711a = i3 + 1;
            return arrayList.get(i3);
        }
        Object obj = ((Supplier) this.f10713c).get();
        arrayList.add(obj);
        this.f10711a++;
        return obj;
    }

    public void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        J j2 = (J) this.f10714d;
        if (z) {
            j2.Q(114, 28, O.f770E);
            AbstractC0357o0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            j2.Q(107, 28, O.f770E);
            AbstractC0357o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f10713c).run();
    }

    public synchronized o d(m mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(mVar.toString()));
            }
            if (!((l) this.f10714d).d(mVar)) {
                l lVar = new l(this);
                this.f10714d = lVar;
                lVar.d(mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mVar.f10706b.f1248a;
    }

    public n(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10714d = new l(this);
        this.f10711a = 1;
        this.f10713c = scheduledExecutorService;
        this.f10712b = context.getApplicationContext();
    }

    public n(Supplier supplier, Consumer consumer) {
        this.f10712b = new ArrayList();
        this.f10713c = supplier;
        this.f10714d = consumer;
    }
}
