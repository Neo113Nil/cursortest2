package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class PD extends BroadcastReceiver implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final Handler f11073k;

    public PD(Handler handler) {
        this.f11073k = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11073k.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
