package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbce {
    public static final void zza(zzbcd zzbcdVar, zzbcb zzbcbVar) {
        if (zzbcbVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbcbVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcdVar.zzd(zzbcbVar.zza(), zzbcbVar.zzb(), zzbcbVar.zzc(), zzbcbVar.zzd());
    }
}
