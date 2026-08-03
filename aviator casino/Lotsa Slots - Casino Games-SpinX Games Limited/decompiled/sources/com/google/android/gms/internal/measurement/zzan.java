package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzan extends com.google.android.gms.internal.measurement.zzai implements com.google.android.gms.internal.measurement.zzak {
    protected final java.util.List zza;
    protected final java.util.List zzb;
    protected com.google.android.gms.internal.measurement.zzg zzc;

    private zzan(com.google.android.gms.internal.measurement.zzan zzanVar) {
        super(zzanVar.zzd);
        java.util.ArrayList arrayList = new java.util.ArrayList(zzanVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzanVar.zza);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(zzanVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzanVar.zzb);
        this.zzc = zzanVar.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzg zzc = this.zzc.zzc();
        int i = 0;
        while (true) {
            java.util.List list2 = this.zza;
            if (i >= list2.size()) {
                break;
            }
            if (i < list.size()) {
                zzc.zzf((java.lang.String) list2.get(i), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i)));
            } else {
                zzc.zzf((java.lang.String) list2.get(i), zzf);
            }
            i++;
        }
        for (com.google.android.gms.internal.measurement.zzao zzaoVar : this.zzb) {
            com.google.android.gms.internal.measurement.zzao zza = zzc.zza(zzaoVar);
            if (zza instanceof com.google.android.gms.internal.measurement.zzap) {
                zza = zzc.zza(zzaoVar);
            }
            if (zza instanceof com.google.android.gms.internal.measurement.zzag) {
                return ((com.google.android.gms.internal.measurement.zzag) zza).zzb();
            }
        }
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return new com.google.android.gms.internal.measurement.zzan(this);
    }

    public zzan(java.lang.String str, java.util.List list, java.util.List list2, com.google.android.gms.internal.measurement.zzg zzgVar) {
        super(str);
        this.zza = new java.util.ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zza.add(((com.google.android.gms.internal.measurement.zzao) it.next()).zzc());
            }
        }
        this.zzb = new java.util.ArrayList(list2);
    }
}
