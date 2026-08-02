package com.google.firebase.auth.api.internal;

import android.support.annotation.GuardedBy;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseError;

/* loaded from: classes.dex */
public abstract class zzah {
    private static Logger zzdx = new Logger("BiChannelGoogleApi", "FirebaseAuth: ");

    @GuardedBy("this")
    private zzai zzgj;

    private final GoogleApi zzc(zzam zzamVar) {
        zzai zzx = zzx();
        if (zzx.zzgm.zzd(zzamVar)) {
            Logger logger = zzdx;
            String valueOf = String.valueOf(zzx.zzgl);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("getGoogleApiForMethod() returned Fallback: ");
            sb.append(valueOf);
            logger.w(sb.toString(), new Object[0]);
            return zzx.zzgl;
        }
        Logger logger2 = zzdx;
        String valueOf2 = String.valueOf(zzx.zzgk);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("getGoogleApiForMethod() returned Gms: ");
        sb2.append(valueOf2);
        logger2.w(sb2.toString(), new Object[0]);
        return zzx.zzgk;
    }

    private final zzai zzx() {
        zzai zzaiVar;
        synchronized (this) {
            if (this.zzgj == null) {
                this.zzgj = zzw();
            }
            zzaiVar = this.zzgj;
        }
        return zzaiVar;
    }

    public final <TResult, A extends Api.AnyClient> Task<TResult> zza(zzam<A, TResult> zzamVar) {
        GoogleApi zzc = zzc(zzamVar);
        return zzc == null ? Tasks.forException(zzce.zzb(new Status(FirebaseError.ERROR_INTERNAL_ERROR, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable"))) : zzc.doRead(zzamVar);
    }

    public final <TResult, A extends Api.AnyClient> Task<TResult> zzb(zzam<A, TResult> zzamVar) {
        GoogleApi zzc = zzc(zzamVar);
        return zzc == null ? Tasks.forException(zzce.zzb(new Status(FirebaseError.ERROR_INTERNAL_ERROR, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable"))) : zzc.doWrite(zzamVar);
    }

    abstract zzai zzw();
}
