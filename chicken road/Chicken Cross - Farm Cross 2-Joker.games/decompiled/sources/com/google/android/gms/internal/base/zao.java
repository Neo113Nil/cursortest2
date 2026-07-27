package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-base@@18.7.2 */
/* loaded from: classes9.dex */
public class zao extends Handler {
    private final Looper zaa;

    public zao() {
        this.zaa = Looper.getMainLooper();
    }

    public zao(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public zao(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
