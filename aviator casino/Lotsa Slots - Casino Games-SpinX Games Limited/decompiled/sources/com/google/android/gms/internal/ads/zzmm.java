package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmm implements com.google.android.gms.internal.ads.zzxv, com.google.android.gms.internal.ads.zzuj {
    final /* synthetic */ com.google.android.gms.internal.ads.zzmr zza;
    private final com.google.android.gms.internal.ads.zzmo zzb;

    public zzmm(com.google.android.gms.internal.ads.zzmr zzmrVar, com.google.android.gms.internal.ads.zzmo zzmoVar) {
        java.util.Objects.requireNonNull(zzmrVar);
        this.zza = zzmrVar;
        this.zzb = zzmoVar;
    }

    private final android.util.Pair zzf(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar2;
        com.google.android.gms.internal.ads.zzxk zzxkVar3 = null;
        if (zzxkVar != null) {
            com.google.android.gms.internal.ads.zzmo zzmoVar = this.zzb;
            int i2 = 0;
            while (true) {
                java.util.List list = zzmoVar.zzc;
                if (i2 >= list.size()) {
                    zzxkVar2 = null;
                    break;
                }
                if (((com.google.android.gms.internal.ads.zzxk) list.get(i2)).zzd == zzxkVar.zzd) {
                    java.lang.Object obj = zzxkVar.zza;
                    java.lang.Object obj2 = zzmoVar.zzb;
                    int i3 = com.google.android.gms.internal.ads.zzmy.zzb;
                    zzxkVar2 = zzxkVar.zza(android.util.Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzxkVar2 == null) {
                return null;
            }
            zzxkVar3 = zzxkVar2;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(this.zzb.zzd), zzxkVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzai(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar, final int i2) {
        final android.util.Pair zzf = zzf(0, zzxkVar);
        if (zzf != null) {
            com.google.android.gms.internal.ads.zzmr zzmrVar = this.zza;
            zzmrVar.zzk().zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzml
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    android.util.Pair pair = zzf;
                    com.google.android.gms.internal.ads.zzmm.this.zza.zzj().zzai(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzxk) pair.second, zzxbVar, zzxgVar, i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzaj(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        final android.util.Pair zzf = zzf(0, zzxkVar);
        if (zzf != null) {
            com.google.android.gms.internal.ads.zzmr zzmrVar = this.zza;
            zzmrVar.zzk().zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzmh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    android.util.Pair pair = zzf;
                    com.google.android.gms.internal.ads.zzmm.this.zza.zzj().zzaj(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzxk) pair.second, zzxbVar, zzxgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzak(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        final android.util.Pair zzf = zzf(0, zzxkVar);
        if (zzf != null) {
            com.google.android.gms.internal.ads.zzmr zzmrVar = this.zza;
            zzmrVar.zzk().zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzmi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    android.util.Pair pair = zzf;
                    com.google.android.gms.internal.ads.zzmm.this.zza.zzj().zzak(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzxk) pair.second, zzxbVar, zzxgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzal(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar, final java.io.IOException iOException, final boolean z) {
        final android.util.Pair zzf = zzf(0, zzxkVar);
        if (zzf != null) {
            com.google.android.gms.internal.ads.zzmr zzmrVar = this.zza;
            zzmrVar.zzk().zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzmj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    android.util.Pair pair = zzf;
                    com.google.android.gms.internal.ads.zzmm.this.zza.zzj().zzal(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzxk) pair.second, zzxbVar, zzxgVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzam(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        final android.util.Pair zzf = zzf(0, zzxkVar);
        if (zzf != null) {
            com.google.android.gms.internal.ads.zzmr zzmrVar = this.zza;
            zzmrVar.zzk().zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzmk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    android.util.Pair pair = zzf;
                    com.google.android.gms.internal.ads.zzmm.this.zza.zzj().zzam(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzxk) pair.second, zzxgVar);
                }
            });
        }
    }
}
