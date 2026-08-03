package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzaz implements java.util.Comparator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzai zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzg zzb;

    zzaz(com.google.android.gms.internal.measurement.zzai zzaiVar, com.google.android.gms.internal.measurement.zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zzao zzaoVar = (com.google.android.gms.internal.measurement.zzao) obj;
        com.google.android.gms.internal.measurement.zzao zzaoVar2 = (com.google.android.gms.internal.measurement.zzao) obj2;
        if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzat) {
            return !(zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzat) ? 1 : 0;
        }
        if (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzat) {
            return -1;
        }
        com.google.android.gms.internal.measurement.zzai zzaiVar = this.zza;
        return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) com.google.android.gms.internal.measurement.zzh.zzi(zzaiVar.zza(this.zzb, java.util.Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
    }
}
