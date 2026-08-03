package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzbiw {
    public static final void zza(com.google.android.gms.internal.ads.zzbiv zzbivVar, com.google.android.gms.internal.ads.zzbit zzbitVar) {
        if (zzbitVar.zzb() == null) {
            throw new java.lang.IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (android.text.TextUtils.isEmpty(zzbitVar.zzc())) {
            throw new java.lang.IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbivVar.zza(zzbitVar.zzb(), zzbitVar.zzc(), zzbitVar.zza(), zzbitVar.zzd());
    }
}
