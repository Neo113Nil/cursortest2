package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Af;
import com.ironsource.Ib;
import com.ironsource.Y3;
import com.ironsource.ah;

/* loaded from: classes6.dex */
public class ContextProvider {
    private static volatile ContextProvider b;

    /* renamed from: a, reason: collision with root package name */
    private Y3 f8163a = new Af();

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (b == null) {
            synchronized (ContextProvider.class) {
                if (b == null) {
                    b = new ContextProvider();
                }
            }
        }
        return b;
    }

    public Context getActiveContext() {
        Activity a2 = this.f8163a.a();
        return a2 != null ? a2 : this.f8163a.b();
    }

    public Context getApplicationContext() {
        Context b2 = this.f8163a.b();
        Activity a2 = this.f8163a.a();
        return (b2 != null || a2 == null) ? b2 : a2.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f8163a.a();
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f8163a.a(activity);
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f8163a.a(context);
        }
    }

    public void updateStrategyIfNeeded() {
        if (Ib.a0().h().u()) {
            this.f8163a = new ah(this.f8163a.a(), this.f8163a.b());
        }
    }
}
