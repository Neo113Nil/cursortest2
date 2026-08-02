package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzcj extends Handler {
    private final /* synthetic */ zzch zzml;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcj(zzch zzchVar, Looper looper) {
        super(looper);
        this.zzml = zzchVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zzch zzchVar;
        zzch zzchVar2;
        zzch zzchVar3;
        switch (message.what) {
            case 0:
                PendingResult<?> pendingResult = (PendingResult) message.obj;
                obj = this.zzml.zzfa;
                synchronized (obj) {
                    if (pendingResult == null) {
                        zzchVar3 = this.zzml.zzme;
                        zzchVar3.zzd(new Status(13, "Transform returned null"));
                    } else if (pendingResult instanceof zzbx) {
                        zzchVar2 = this.zzml.zzme;
                        zzchVar2.zzd(((zzbx) pendingResult).getStatus());
                    } else {
                        zzchVar = this.zzml.zzme;
                        zzchVar.zza(pendingResult);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String valueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i);
                Log.e("TransformedResultImpl", sb.toString());
                return;
        }
    }
}
