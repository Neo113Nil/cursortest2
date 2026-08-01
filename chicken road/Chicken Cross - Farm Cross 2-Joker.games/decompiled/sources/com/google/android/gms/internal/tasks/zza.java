package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-tasks@@18.3.2 */
/* loaded from: classes8.dex */
public final class zza extends Handler {
    public zza() {
        Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
