package b4;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0826c;
import com.google.android.gms.common.internal.D;
import e6.C1054c;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w1.V0;

/* renamed from: b4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0787g {

    /* renamed from: a, reason: collision with root package name */
    public final V0 f10146a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f10147b;

    public C0787g(Context context, C0784d c0784d, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        D.i(context);
        D.i(c0784d);
        V0 v02 = new V0(c0784d, executor, scheduledExecutorService);
        C1054c c1054c = new C1054c(15);
        this.f10146a = v02;
        ComponentCallbacks2C0826c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0826c.f11168e.a(new C0786f(this, v02, c1054c));
    }
}
