package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzei implements zzdj {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzei(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeg zzegVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzegVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzeg zzm() {
        zzeg zzegVar;
        List list = zza;
        synchronized (list) {
            try {
                zzegVar = list.isEmpty() ? new zzeg(null) : (zzeg) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final zzdi zzb(int i7) {
        Handler handler = this.zzb;
        zzeg zzegVarZzm = zzm();
        zzegVarZzm.zzb(handler.obtainMessage(i7), this);
        return zzegVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final zzdi zzc(int i7, Object obj) {
        Handler handler = this.zzb;
        zzeg zzegVarZzm = zzm();
        zzegVarZzm.zzb(handler.obtainMessage(i7, obj), this);
        return zzegVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final zzdi zzd(int i7, int i8, int i9) {
        Handler handler = this.zzb;
        zzeg zzegVarZzm = zzm();
        zzegVarZzm.zzb(handler.obtainMessage(1, i8, i9), this);
        return zzegVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zzf(int i7) {
        this.zzb.removeMessages(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final boolean zzg(int i7) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final boolean zzi(int i7) {
        return this.zzb.sendEmptyMessage(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final boolean zzj(int i7, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final boolean zzk(zzdi zzdiVar) {
        return ((zzeg) zzdiVar).zzc(this.zzb);
    }
}
