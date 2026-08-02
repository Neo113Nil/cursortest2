package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC0627Nj implements ServiceConnection {
    public final /* synthetic */ HandlerC0628Nk A00;

    public ServiceConnectionC0627Nj(HandlerC0628Nk handlerC0628Nk) {
        this.A00 = handlerC0628Nk;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        AbstractRunnableC0840Vt abstractRunnableC0840Vt;
        C1127cu c1127cu;
        Messenger messenger;
        handler = this.A00.A04;
        abstractRunnableC0840Vt = this.A00.A08;
        handler.removeCallbacks(abstractRunnableC0840Vt);
        this.A00.A00 = new Messenger(iBinder);
        c1127cu = this.A00.A07;
        if (UA.A09(c1127cu)) {
            HandlerC0628Nk handlerC0628Nk = this.A00;
            messenger = this.A00.A00;
            handlerC0628Nk.A07(messenger);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
