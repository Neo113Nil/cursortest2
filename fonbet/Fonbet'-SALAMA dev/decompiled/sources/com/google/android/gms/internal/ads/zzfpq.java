package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class zzfpq extends Handler {
    public zzfpq() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfpq(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
