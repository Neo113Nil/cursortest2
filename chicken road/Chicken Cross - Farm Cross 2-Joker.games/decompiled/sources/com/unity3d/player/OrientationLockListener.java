package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* loaded from: classes7.dex */
public class OrientationLockListener {

    /* renamed from: a, reason: collision with root package name */
    public com.unity3d.player.a.L f11720a;
    public final Context b;

    public final native void nativeUpdateOrientationLockState(int i);

    public OrientationLockListener(Context context) {
        this.b = context;
        this.f11720a = new com.unity3d.player.a.L(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        com.unity3d.player.a.L l = this.f11720a;
        l.getClass();
        l.b = new com.unity3d.player.a.K(new Handler(Looper.getMainLooper()), this);
        l.f11748a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, l.b);
    }
}
