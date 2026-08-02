package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
public class SplitCompatApplication extends android.app.Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        com.google.android.play.core.splitcompat.SplitCompat.install(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
    }
}
