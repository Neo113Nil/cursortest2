package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes5.dex */
public class AppRestartDuringAdDetectionService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f4122a;

    public static boolean a() {
        return f4122a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        f4122a = false;
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        f4122a = true;
        stopSelf();
    }
}
