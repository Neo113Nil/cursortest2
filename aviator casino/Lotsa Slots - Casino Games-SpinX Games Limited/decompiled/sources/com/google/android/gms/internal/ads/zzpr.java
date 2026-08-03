package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzpr implements com.google.android.gms.internal.ads.zznm {
    private final com.google.android.gms.internal.ads.zzdo zza;
    private final com.google.android.gms.internal.ads.zzbd zzb;
    private final com.google.android.gms.internal.ads.zzbe zzc;
    private final com.google.android.gms.internal.ads.zzpq zzd;
    private final android.util.SparseArray zze;
    private com.google.android.gms.internal.ads.zzef zzf;
    private com.google.android.gms.internal.ads.zzbb zzg;
    private com.google.android.gms.internal.ads.zzdz zzh;
    private boolean zzi;

    private final com.google.android.gms.internal.ads.zznn zzae() {
        return zzad(this.zzd.zzb());
    }

    private final com.google.android.gms.internal.ads.zznn zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final com.google.android.gms.internal.ads.zznn zzag(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        com.google.android.gms.internal.ads.zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzxkVar != null) {
            return this.zzd.zze(zzxkVar) != null ? zzad(zzxkVar) : zzaa(com.google.android.gms.internal.ads.zzbf.zza, i, zzxkVar);
        }
        com.google.android.gms.internal.ads.zzbf zzq = zzbbVar.zzq();
        if (i >= zzq.zza()) {
            zzq = com.google.android.gms.internal.ads.zzbf.zza;
        }
        return zzaa(zzq, i, null);
    }

    private final com.google.android.gms.internal.ads.zznn zzah(com.google.android.gms.internal.ads.zzau zzauVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar;
        return (!(zzauVar instanceof com.google.android.gms.internal.ads.zzjk) || (zzxkVar = ((com.google.android.gms.internal.ads.zzjk) zzauVar).zzh) == null) ? zzZ() : zzad(zzxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        this.zzi = true;
        zzY(zzZ, -1, new com.google.android.gms.internal.ads.zzea(zzZ) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzB(final int i, final int i2, final boolean z) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new com.google.android.gms.internal.ads.zzea(zzaf, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzC(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1007, new com.google.android.gms.internal.ads.zzea(zzaf, zzjbVar) { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzD(final java.lang.String str, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1008, new com.google.android.gms.internal.ads.zzea(zzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzph
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzE(final com.google.android.gms.internal.ads.zzv zzvVar, final com.google.android.gms.internal.ads.zzjc zzjcVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1009, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzpk
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzk(com.google.android.gms.internal.ads.zznn.this, zzvVar, zzjcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzF(final long j) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1010, new com.google.android.gms.internal.ads.zzea(zzaf, j) { // from class: com.google.android.gms.internal.ads.zzpl
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzG(final int i, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1011, new com.google.android.gms.internal.ads.zzea(zzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzpm
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzH(final java.lang.String str) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1012, new com.google.android.gms.internal.ads.zzea(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzpn
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzI(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        final com.google.android.gms.internal.ads.zznn zzae = zzae();
        zzY(zzae, 1013, new com.google.android.gms.internal.ads.zzea(zzae, zzjbVar) { // from class: com.google.android.gms.internal.ads.zzpo
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzJ(final java.lang.Exception exc) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1014, new com.google.android.gms.internal.ads.zzea(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzK(final java.lang.Exception exc) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1029, new com.google.android.gms.internal.ads.zzea(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzL(final com.google.android.gms.internal.ads.zzry zzryVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1031, new com.google.android.gms.internal.ads.zzea(zzaf, zzryVar) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzM(final com.google.android.gms.internal.ads.zzry zzryVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1032, new com.google.android.gms.internal.ads.zzea(zzaf, zzryVar) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzN(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1015, new com.google.android.gms.internal.ads.zzea(zzaf, zzjbVar) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzO(final java.lang.String str, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1016, new com.google.android.gms.internal.ads.zzea(zzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzP(final com.google.android.gms.internal.ads.zzv zzvVar, final com.google.android.gms.internal.ads.zzjc zzjcVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1017, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzl(com.google.android.gms.internal.ads.zznn.this, zzvVar, zzjcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzQ(final int i, final long j) {
        final com.google.android.gms.internal.ads.zznn zzae = zzae();
        zzY(zzae, 1018, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzm(com.google.android.gms.internal.ads.zznn.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzR(final java.lang.String str) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1019, new com.google.android.gms.internal.ads.zzea(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzS(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        final com.google.android.gms.internal.ads.zznn zzae = zzae();
        zzY(zzae, 1020, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzdh(com.google.android.gms.internal.ads.zznn.this, zzjbVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzT(final java.lang.Object obj, final long j) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 26, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj2) {
                ((com.google.android.gms.internal.ads.zznp) obj2).zzo(com.google.android.gms.internal.ads.zznn.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzU(final long j, final int i) {
        final com.google.android.gms.internal.ads.zznn zzae = zzae();
        zzY(zzae, 1021, new com.google.android.gms.internal.ads.zzea(zzae, j, i) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzV(final java.lang.Exception exc) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 1030, new com.google.android.gms.internal.ads.zzea(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzW(final int i) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new com.google.android.gms.internal.ads.zzea(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzX(final int i, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zznn zzad = zzad(this.zzd.zzd());
        zzY(zzad, 1006, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzdg(com.google.android.gms.internal.ads.zznn.this, i, j, j2);
            }
        });
    }

    protected final void zzY(com.google.android.gms.internal.ads.zznn zznnVar, int i, com.google.android.gms.internal.ads.zzea zzeaVar) {
        this.zze.put(i, zznnVar);
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzf;
        zzefVar.zze(i, zzeaVar);
        zzefVar.zzf();
    }

    protected final com.google.android.gms.internal.ads.zznn zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(com.google.android.gms.internal.ads.zzbb zzbbVar, com.google.android.gms.internal.ads.zzay zzayVar) {
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    protected final com.google.android.gms.internal.ads.zznn zzaa(com.google.android.gms.internal.ads.zzbf zzbfVar, int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar2 = true == zzbfVar.zzg() ? null : zzxkVar;
        long zzb = this.zza.zzb();
        boolean z = zzbfVar.equals(this.zzg.zzq()) && i == this.zzg.zzs();
        long j = 0;
        if (zzxkVar2 == null || !zzxkVar2.zzb()) {
            if (z) {
                j = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j2 = zzbfVar.zzb(i, this.zzc, 0L).zzl;
                j = com.google.android.gms.internal.ads.zzfl.zzr(0L);
            }
        } else if (z && this.zzg.zzy() == zzxkVar2.zzb && this.zzg.zzz() == zzxkVar2.zzc) {
            j = this.zzg.zzu();
        }
        return new com.google.android.gms.internal.ads.zznn(zzb, zzbfVar, i, zzxkVar2, j, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    final /* synthetic */ void zzab(com.google.android.gms.internal.ads.zzbb zzbbVar, com.google.android.gms.internal.ads.zznp zznpVar, com.google.android.gms.internal.ads.zzs zzsVar) {
        zznpVar.zzdi(zzbbVar, new com.google.android.gms.internal.ads.zzno(zzsVar, this.zze));
    }

    final /* synthetic */ void zzac() {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 1028, new com.google.android.gms.internal.ads.zzea(zzZ) { // from class: com.google.android.gms.internal.ads.zzpj
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzai(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar, final int i2) {
        final com.google.android.gms.internal.ads.zznn zzag = zzag(i, zzxkVar);
        zzY(zzag, 1000, new com.google.android.gms.internal.ads.zzea(zzag, zzxbVar, zzxgVar, i2) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzaj(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        final com.google.android.gms.internal.ads.zznn zzag = zzag(i, zzxkVar);
        zzY(zzag, 1001, new com.google.android.gms.internal.ads.zzea(zzag, zzxbVar, zzxgVar) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzak(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        final com.google.android.gms.internal.ads.zznn zzag = zzag(i, zzxkVar);
        zzY(zzag, 1002, new com.google.android.gms.internal.ads.zzea(zzag, zzxbVar, zzxgVar) { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzal(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar, final java.io.IOException iOException, final boolean z) {
        final com.google.android.gms.internal.ads.zznn zzag = zzag(i, zzxkVar);
        zzY(zzag, 1003, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzh(com.google.android.gms.internal.ads.zznn.this, zzxbVar, zzxgVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzam(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        final com.google.android.gms.internal.ads.zznn zzag = zzag(i, zzxkVar);
        zzY(zzag, 1004, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzdf(com.google.android.gms.internal.ads.zznn.this, zzxgVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final com.google.android.gms.internal.ads.zzak zzakVar, final int i) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 1, new com.google.android.gms.internal.ads.zzea(zzZ, zzakVar, i) { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final com.google.android.gms.internal.ads.zzbn zzbnVar) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 2, new com.google.android.gms.internal.ads.zzea(zzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final com.google.android.gms.internal.ads.zzan zzanVar) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 14, new com.google.android.gms.internal.ads.zzea(zzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzpd
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 3, new com.google.android.gms.internal.ads.zzea(zzZ, z) { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final com.google.android.gms.internal.ads.zzax zzaxVar) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 13, new com.google.android.gms.internal.ads.zzea(zzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z, final int i) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, -1, new com.google.android.gms.internal.ads.zzea(zzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 4, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zze(com.google.android.gms.internal.ads.zznn.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z, final int i) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 5, new com.google.android.gms.internal.ads.zzea(zzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 6, new com.google.android.gms.internal.ads.zzea(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 7, new com.google.android.gms.internal.ads.zzea(zzZ, z) { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final com.google.android.gms.internal.ads.zzau zzauVar) {
        final com.google.android.gms.internal.ads.zznn zzah = zzah(zzauVar);
        zzY(zzah, 10, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzoz
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzg(com.google.android.gms.internal.ads.zznn.this, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final com.google.android.gms.internal.ads.zzau zzauVar) {
        final com.google.android.gms.internal.ads.zznn zzah = zzah(zzauVar);
        zzY(zzah, 10, new com.google.android.gms.internal.ads.zzea(zzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzpa
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final com.google.android.gms.internal.ads.zzav zzavVar) {
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 12, new com.google.android.gms.internal.ads.zzea(zzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzpc
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 21, new com.google.android.gms.internal.ads.zzea(zzaf, i) { // from class: com.google.android.gms.internal.ads.zzpf
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 22, new com.google.android.gms.internal.ads.zzea(zzaf, f) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 23, new com.google.android.gms.internal.ads.zzea(zzaf, z) { // from class: com.google.android.gms.internal.ads.zzpe
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final com.google.android.gms.internal.ads.zzbv zzbvVar) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 25, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzpg
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zznn zznnVar = com.google.android.gms.internal.ads.zznn.this;
                com.google.android.gms.internal.ads.zzbv zzbvVar2 = zzbvVar;
                ((com.google.android.gms.internal.ads.zznp) obj).zzp(zznnVar, zzbvVar2);
                int i = zzbvVar2.zzb;
                int i2 = zzbvVar2.zzc;
                float f = zzbvVar2.zzd;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i, final int i2) {
        final com.google.android.gms.internal.ads.zznn zzaf = zzaf();
        zzY(zzaf, 24, new com.google.android.gms.internal.ads.zzea(zzaf, i, i2) { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzv(com.google.android.gms.internal.ads.zznp zznpVar) {
        this.zzf.zzc(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzw(com.google.android.gms.internal.ads.zznp zznpVar) {
        this.zzf.zzd(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzx(final com.google.android.gms.internal.ads.zzbb zzbbVar, android.os.Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzgtj.zzi(z);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        com.google.android.gms.internal.ads.zzdo zzdoVar = this.zza;
        this.zzh = zzdoVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdoVar, new com.google.android.gms.internal.ads.zzeb() { // from class: com.google.android.gms.internal.ads.zzpp
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzs zzsVar) {
                com.google.android.gms.internal.ads.zzpr.this.zzab(zzbbVar, (com.google.android.gms.internal.ads.zznp) obj, zzsVar);
            }
        });
    }

    private final com.google.android.gms.internal.ads.zznn zzad(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        this.zzg.getClass();
        com.google.android.gms.internal.ads.zzbf zze = zzxkVar == null ? null : this.zzd.zze(zzxkVar);
        if (zzxkVar != null && zze != null) {
            return zzaa(zze, zze.zzo(zzxkVar.zza, this.zzb).zzc, zzxkVar);
        }
        int zzs = this.zzg.zzs();
        com.google.android.gms.internal.ads.zzbf zzq = this.zzg.zzq();
        if (zzs >= zzq.zza()) {
            zzq = com.google.android.gms.internal.ads.zzbf.zza;
        }
        return zzaa(zzq, zzs, null);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzy() {
        com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzh;
        zzdzVar.getClass();
        zzdzVar.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zznq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzpr.this.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzz(java.util.List list, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        com.google.android.gms.internal.ads.zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzxkVar, zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(com.google.android.gms.internal.ads.zzbf zzbfVar, final int i) {
        com.google.android.gms.internal.ads.zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 0, new com.google.android.gms.internal.ads.zzea(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final com.google.android.gms.internal.ads.zzba zzbaVar, final com.google.android.gms.internal.ads.zzba zzbaVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        com.google.android.gms.internal.ads.zzpq zzpqVar = this.zzd;
        com.google.android.gms.internal.ads.zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpqVar.zzf(zzbbVar);
        final com.google.android.gms.internal.ads.zznn zzZ = zzZ();
        zzY(zzZ, 11, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzpb
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zznp) obj).zzde(com.google.android.gms.internal.ads.zznn.this, zzbaVar, zzbaVar2, i);
            }
        });
    }

    public zzpr(com.google.android.gms.internal.ads.zzdo zzdoVar) {
        zzdoVar.getClass();
        this.zza = zzdoVar;
        this.zzf = new com.google.android.gms.internal.ads.zzef(com.google.android.gms.internal.ads.zzfl.zzf().getThread());
        com.google.android.gms.internal.ads.zzbd zzbdVar = new com.google.android.gms.internal.ads.zzbd();
        this.zzb = zzbdVar;
        this.zzc = new com.google.android.gms.internal.ads.zzbe();
        this.zzd = new com.google.android.gms.internal.ads.zzpq(zzbdVar);
        this.zze = new android.util.SparseArray();
    }
}
