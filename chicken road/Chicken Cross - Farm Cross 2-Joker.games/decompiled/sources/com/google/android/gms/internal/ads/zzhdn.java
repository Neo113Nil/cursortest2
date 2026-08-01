package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbr;
import com.ironsource.U3;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhdn extends zzhbr.zzf implements Runnable {
    private final Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final String zzd() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append(U3.j.e);
        return sb.toString();
    }

    zzhdn(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }
}
