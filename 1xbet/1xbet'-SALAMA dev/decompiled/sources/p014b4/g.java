package p014b4;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0782c;
import com.google.android.gms.common.internal.D;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p036e6.c;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f10146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f10147b;

    public g(Context context, d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        D.i(context);
        D.i(dVar);
        V0 v6 = new V0(dVar, executor, scheduledExecutorService);
        c cVar = new c(15);
        this.f10146a = v6;
        ComponentCallbacks2C0782c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0782c.f11168e.a(new f(this, v6, cVar));
    }
}
