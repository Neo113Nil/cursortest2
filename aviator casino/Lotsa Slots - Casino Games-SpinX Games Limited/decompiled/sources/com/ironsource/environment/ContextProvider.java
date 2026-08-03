package com.ironsource.environment;

/* loaded from: classes5.dex */
public class ContextProvider {
    private static volatile com.ironsource.environment.ContextProvider b;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC2965b4 f6220a = new com.ironsource.Cf();

    private ContextProvider() {
    }

    public static com.ironsource.environment.ContextProvider getInstance() {
        if (b == null) {
            synchronized (com.ironsource.environment.ContextProvider.class) {
                if (b == null) {
                    b = new com.ironsource.environment.ContextProvider();
                }
            }
        }
        return b;
    }

    public android.content.Context getActiveContext() {
        android.app.Activity a2 = this.f6220a.a();
        return a2 != null ? a2 : this.f6220a.b();
    }

    public android.content.Context getApplicationContext() {
        android.content.Context b2 = this.f6220a.b();
        android.app.Activity a2 = this.f6220a.a();
        return (b2 != null || a2 == null) ? b2 : a2.getApplicationContext();
    }

    public android.app.Activity getCurrentActiveActivity() {
        return this.f6220a.a();
    }

    public void updateActivity(android.app.Activity activity) {
        if (activity != null) {
            this.f6220a.a(activity);
        }
    }

    public void updateAppContext(android.content.Context context) {
        if (context != null) {
            this.f6220a.a(context);
        }
    }

    public void updateStrategyIfNeeded() {
        if (com.ironsource.Jb.Y().h().t()) {
            this.f6220a = new com.ironsource.Xg(this.f6220a.a(), this.f6220a.b());
        }
    }
}
