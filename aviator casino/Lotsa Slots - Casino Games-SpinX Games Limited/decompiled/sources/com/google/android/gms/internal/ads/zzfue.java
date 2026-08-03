package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfue extends com.google.android.gms.internal.ads.zzgwe {
    private final java.util.LinkedList zza = new java.util.LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgwb, java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzftm zzftmVar = (com.google.android.gms.internal.ads.zzftm) obj;
        if (zzftmVar.zzf() != 3) {
            this.zza.add(zzftmVar);
            return true;
        }
        java.util.LinkedList linkedList = this.zza;
        java.util.ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            com.google.android.gms.internal.ads.zzftm zzftmVar2 = (com.google.android.gms.internal.ads.zzftm) listIterator.next();
            if (zzftmVar2.zzf() == 3) {
                double zze = zzftmVar2.zze();
                double zze2 = zzftmVar.zze();
                if (zze < zze2 || (zze == zze2 && zzftmVar2.zzc() > zzftmVar.zzc())) {
                    listIterator.set(zzftmVar);
                    zzftmVar = zzftmVar2;
                }
            }
        }
        linkedList.add(zzftmVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final java.util.Queue zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb, com.google.android.gms.internal.ads.zzgwd
    public final /* synthetic */ java.lang.Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe, com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ java.util.Collection zzc() {
        return this.zza;
    }
}
