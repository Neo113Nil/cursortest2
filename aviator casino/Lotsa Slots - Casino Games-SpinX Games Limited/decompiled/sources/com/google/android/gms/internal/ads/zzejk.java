package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzejk implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzejl zzb;

    zzejk(com.google.android.gms.internal.ads.zzejl zzejlVar, boolean z) {
        this.zza = z;
        java.util.Objects.requireNonNull(zzejlVar);
        this.zzb = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // com.google.android.gms.internal.ads.zzhbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.List<java.lang.String> emptyList;
        java.util.List asList;
        char c;
        com.google.android.gms.internal.ads.zzejl zzejlVar = this.zzb;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (zzejlVar.zzf()) {
            return;
        }
        java.lang.Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof java.util.List) {
            asList = (java.util.List) obj2;
        } else {
            if (!(obj2 instanceof java.lang.String[])) {
                emptyList = java.util.Collections.emptyList();
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : emptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1052618729:
                            if (str.equals("native")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? com.google.android.gms.internal.ads.zzbhv.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : com.google.android.gms.internal.ads.zzbhv.zzd.zza.REWARD_BASED_VIDEO_AD : com.google.android.gms.internal.ads.zzbhv.zzd.zza.NATIVE_APP_INSTALL : com.google.android.gms.internal.ads.zzbhv.zzd.zza.INTERSTITIAL : com.google.android.gms.internal.ads.zzbhv.zzd.zza.BANNER);
                }
                final com.google.android.gms.internal.ads.zzbhv.zzaf.zzd zze = com.google.android.gms.internal.ads.zzejl.zze(bundle);
                final com.google.android.gms.internal.ads.zzbhv.zzab zzb = zzejlVar.zzb(bundle);
                final boolean z = this.zza;
                zzejlVar.zza.zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzejj
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj3) {
                        com.google.android.gms.internal.ads.zzejl zzejlVar2 = com.google.android.gms.internal.ads.zzejk.this.zzb;
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj3;
                        if (zzejlVar2.zzf()) {
                            return null;
                        }
                        com.google.android.gms.internal.ads.zzbhv.zzaf.zzd zzdVar = zze;
                        com.google.android.gms.internal.ads.zzbhv.zzab zzabVar = zzb;
                        java.util.ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zzc = zzejlVar2.zzc(z2, arrayList2, zzabVar, zzdVar);
                        com.google.android.gms.internal.ads.zzejo.zzf(sQLiteDatabase, z2, true);
                        com.google.android.gms.internal.ads.zzejo.zze(sQLiteDatabase, zzejlVar2.zzd().zzb(), zzc);
                        return null;
                    }
                });
            }
            asList = java.util.Arrays.asList((java.lang.String[]) obj2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(asList.size());
        for (java.lang.Object obj3 : asList) {
            if (obj3 instanceof java.lang.String) {
                arrayList2.add((java.lang.String) obj3);
            }
        }
        emptyList = java.util.Collections.unmodifiableList(arrayList2);
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        while (r1.hasNext()) {
        }
        final com.google.android.gms.internal.ads.zzbhv.zzaf.zzd zze2 = com.google.android.gms.internal.ads.zzejl.zze(bundle);
        final com.google.android.gms.internal.ads.zzbhv.zzab zzb2 = zzejlVar.zzb(bundle);
        final boolean z2 = this.zza;
        zzejlVar.zza.zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj32) {
                com.google.android.gms.internal.ads.zzejl zzejlVar2 = com.google.android.gms.internal.ads.zzejk.this.zzb;
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj32;
                if (zzejlVar2.zzf()) {
                    return null;
                }
                com.google.android.gms.internal.ads.zzbhv.zzaf.zzd zzdVar = zze2;
                com.google.android.gms.internal.ads.zzbhv.zzab zzabVar = zzb2;
                java.util.ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zzc = zzejlVar2.zzc(z22, arrayList22, zzabVar, zzdVar);
                com.google.android.gms.internal.ads.zzejo.zzf(sQLiteDatabase, z22, true);
                com.google.android.gms.internal.ads.zzejo.zze(sQLiteDatabase, zzejlVar2.zzd().zzb(), zzc);
                return null;
            }
        });
    }
}
