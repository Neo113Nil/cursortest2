package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1088hu implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0802bc f13813a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0802bc c0802bc = this.f13813a;
        ((C1091hx) c0802bc.f12825o).c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        c0802bc.l(new RunnableC1081hn(12, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0802bc c0802bc = this.f13813a;
        ((C1091hx) c0802bc.f12825o).c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        c0802bc.l(new RunnableC1303mm(16, this));
    }
}
