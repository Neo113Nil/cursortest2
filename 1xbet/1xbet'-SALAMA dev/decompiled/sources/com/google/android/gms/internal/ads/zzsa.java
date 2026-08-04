package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class zzsa extends Handler {
    final /* synthetic */ zzsc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsa(zzsc zzscVar, Looper looper) {
        super(looper);
        this.zza = zzscVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsc.zza(this.zza, message);
    }
}
