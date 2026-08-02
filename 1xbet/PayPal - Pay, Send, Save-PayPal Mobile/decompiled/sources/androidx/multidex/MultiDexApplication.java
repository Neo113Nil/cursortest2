package androidx.multidex;

/* loaded from: classes7.dex */
public class MultiDexApplication extends android.app.Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        androidx.multidex.MultiDex.install(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
    }
}
