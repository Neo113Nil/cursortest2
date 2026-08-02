package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
final class zzeg implements zzdi {
    private Message zza;

    private zzeg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdi
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzei.zzl(this);
    }

    public final zzeg zzb(Message message, zzei zzeiVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzei.zzl(this);
        return sendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzeg(zzeh zzehVar) {
    }
}
