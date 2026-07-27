package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzpv implements zznq {
    private final zzdp zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzpu zzd;
    private final SparseArray zze;
    private zzeg zzf;
    private zzbb zzg;
    private zzea zzh;
    private boolean zzi;

    private final zznr zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zznr zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zznr zzag(int i, zzxo zzxoVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzxoVar != null) {
            return this.zzd.zze(zzxoVar) != null ? zzad(zzxoVar) : zzaa(zzbf.zza, i, zzxoVar);
        }
        zzbf zzq = zzbbVar.zzq();
        if (i >= zzq.zza()) {
            zzq = zzbf.zza;
        }
        return zzaa(zzq, i, null);
    }

    private final zznr zzah(zzau zzauVar) {
        zzxo zzxoVar;
        return (!(zzauVar instanceof zzjn) || (zzxoVar = ((zzjn) zzauVar).zzh) == null) ? zzZ() : zzad(zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zznr zzZ = zzZ();
        this.zzi = true;
        zzY(zzZ, -1, new zzeb(zzZ) { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzB(final int i, final int i2, final boolean z) {
        final zznr zzaf = zzaf();
        zzY(zzaf, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new zzeb(zzaf, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzC(final zzje zzjeVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1007, new zzeb(zzaf, zzjeVar) { // from class: com.google.android.gms.internal.ads.zzpb
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzD(final String str, final long j, final long j2) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1008, new zzeb(zzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzpl
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzE(final zzv zzvVar, final zzjf zzjfVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1009, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpo
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzk(zznr.this, zzvVar, zzjfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzF(final long j) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1010, new zzeb(zzaf, j) { // from class: com.google.android.gms.internal.ads.zzpp
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzG(final int i, final long j, final long j2) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1011, new zzeb(zzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzpq
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzH(final String str) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1012, new zzeb(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzpr
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzI(final zzje zzjeVar) {
        final zznr zzae = zzae();
        zzY(zzae, 1013, new zzeb(zzae, zzjeVar) { // from class: com.google.android.gms.internal.ads.zzps
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzJ(final Exception exc) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1014, new zzeb(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzK(final Exception exc) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1029, new zzeb(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzL(final zzsc zzscVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1031, new zzeb(zzaf, zzscVar) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzM(final zzsc zzscVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1032, new zzeb(zzaf, zzscVar) { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzN(final zzje zzjeVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1015, new zzeb(zzaf, zzjeVar) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzO(final String str, final long j, final long j2) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1016, new zzeb(zzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzP(final zzv zzvVar, final zzjf zzjfVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1017, new zzeb() { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzl(zznr.this, zzvVar, zzjfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzQ(final int i, final long j) {
        final zznr zzae = zzae();
        zzY(zzae, 1018, new zzeb() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzm(zznr.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzR(final String str) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1019, new zzeb(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzS(final zzje zzjeVar) {
        final zznr zzae = zzae();
        zzY(zzae, 1020, new zzeb() { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzdh(zznr.this, zzjeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzT(final Object obj, final long j) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 26, new zzeb() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj2) {
                ((zznt) obj2).zzo(zznr.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzU(final long j, final int i) {
        final zznr zzae = zzae();
        zzY(zzae, 1021, new zzeb(zzae, j, i) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzV(final Exception exc) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 1030, new zzeb(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzW(final int i) {
        final zznr zzZ = zzZ();
        zzY(zzZ, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new zzeb(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzX(final int i, final long j, final long j2) {
        final zznr zzad = zzad(this.zzd.zzd());
        zzY(zzad, 1006, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpm
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzdg(zznr.this, i, j, j2);
            }
        });
    }

    protected final void zzY(zznr zznrVar, int i, zzeb zzebVar) {
        this.zze.put(i, zznrVar);
        zzeg zzegVar = this.zzf;
        zzegVar.zze(i, zzebVar);
        zzegVar.zzf();
    }

    protected final zznr zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    @RequiresNonNull({"player"})
    protected final zznr zzaa(zzbf zzbfVar, int i, zzxo zzxoVar) {
        zzxo zzxoVar2 = true == zzbfVar.zzg() ? null : zzxoVar;
        long zzb = this.zza.zzb();
        boolean z = zzbfVar.equals(this.zzg.zzq()) && i == this.zzg.zzs();
        long j = 0;
        if (zzxoVar2 == null || !zzxoVar2.zzb()) {
            if (z) {
                j = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j2 = zzbfVar.zzb(i, this.zzc, 0L).zzl;
                j = zzfm.zzs(0L);
            }
        } else if (z && this.zzg.zzy() == zzxoVar2.zzb && this.zzg.zzz() == zzxoVar2.zzc) {
            j = this.zzg.zzu();
        }
        return new zznr(zzb, zzbfVar, i, zzxoVar2, j, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    final /* synthetic */ void zzab(zzbb zzbbVar, zznt zzntVar, zzs zzsVar) {
        zzntVar.zzdi(zzbbVar, new zzns(zzsVar, this.zze));
    }

    final /* synthetic */ void zzac() {
        final zznr zzZ = zzZ();
        zzY(zzZ, 1028, new zzeb(zzZ) { // from class: com.google.android.gms.internal.ads.zzpn
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzai(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar, final int i2) {
        final zznr zzag = zzag(i, zzxoVar);
        zzY(zzag, 1000, new zzeb(zzag, zzxfVar, zzxkVar, i2) { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzaj(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar) {
        final zznr zzag = zzag(i, zzxoVar);
        zzY(zzag, 1001, new zzeb(zzag, zzxfVar, zzxkVar) { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzak(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar) {
        final zznr zzag = zzag(i, zzxoVar);
        zzY(zzag, 1002, new zzeb(zzag, zzxfVar, zzxkVar) { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzal(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar, final IOException iOException, final boolean z) {
        final zznr zzag = zzag(i, zzxoVar);
        zzY(zzag, 1003, new zzeb() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzh(zznr.this, zzxfVar, zzxkVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzam(int i, zzxo zzxoVar, final zzxk zzxkVar) {
        final zznr zzag = zzag(i, zzxoVar);
        zzY(zzag, 1004, new zzeb() { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzdf(zznr.this, zzxkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final zzak zzakVar, final int i) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 1, new zzeb(zzZ, zzakVar, i) { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 2, new zzeb(zzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 14, new zzeb(zzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzph
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 3, new zzeb(zzZ, z) { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 13, new zzeb(zzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z, final int i) {
        final zznr zzZ = zzZ();
        zzY(zzZ, -1, new zzeb(zzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zze(zznr.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z, final int i) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 5, new zzeb(zzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzoz
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 6, new zzeb(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzpa
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 7, new zzeb(zzZ, z) { // from class: com.google.android.gms.internal.ads.zzpc
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zznr zzah = zzah(zzauVar);
        zzY(zzah, 10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpd
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzg(zznr.this, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final zzau zzauVar) {
        final zznr zzah = zzah(zzauVar);
        zzY(zzah, 10, new zzeb(zzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzpe
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zznr zzZ = zzZ();
        zzY(zzZ, 12, new zzeb(zzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzpg
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 21, new zzeb(zzaf, i) { // from class: com.google.android.gms.internal.ads.zzpj
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 22, new zzeb(zzaf, f) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 23, new zzeb(zzaf, z) { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 25, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpk
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                zznr zznrVar = zznr.this;
                zzbv zzbvVar2 = zzbvVar;
                ((zznt) obj).zzp(zznrVar, zzbvVar2);
                int i = zzbvVar2.zzb;
                int i2 = zzbvVar2.zzc;
                float f = zzbvVar2.zzd;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i, final int i2) {
        final zznr zzaf = zzaf();
        zzY(zzaf, 24, new zzeb(zzaf, i, i2) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzv(zznt zzntVar) {
        this.zzf.zzc(zzntVar);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzw(zznt zzntVar) {
        this.zzf.zzd(zzntVar);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        zzguk.zzi(z);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        zzdp zzdpVar = this.zza;
        this.zzh = zzdpVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdpVar, new zzec() { // from class: com.google.android.gms.internal.ads.zzpt
            @Override // com.google.android.gms.internal.ads.zzec
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                zzpv.this.zzab(zzbbVar, (zznt) obj, zzsVar);
            }
        });
    }

    private final zznr zzad(zzxo zzxoVar) {
        this.zzg.getClass();
        zzbf zze = zzxoVar == null ? null : this.zzd.zze(zzxoVar);
        if (zzxoVar != null && zze != null) {
            return zzaa(zze, zze.zzo(zzxoVar.zza, this.zzb).zzc, zzxoVar);
        }
        int zzs = this.zzg.zzs();
        zzbf zzq = this.zzg.zzq();
        if (zzs >= zzq.zza()) {
            zzq = zzbf.zza;
        }
        return zzaa(zzq, zzs, null);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzy() {
        zzea zzeaVar = this.zzh;
        zzeaVar.getClass();
        zzeaVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zznu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzpv.this.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzz(List list, zzxo zzxoVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzxoVar, zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zznr zzZ = zzZ();
        zzY(zzZ, 0, new zzeb(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzpu zzpuVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpuVar.zzf(zzbbVar);
        final zznr zzZ = zzZ();
        zzY(zzZ, 11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpf
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznt) obj).zzde(zznr.this, zzbaVar, zzbaVar2, i);
            }
        });
    }

    public zzpv(zzdp zzdpVar) {
        zzdpVar.getClass();
        this.zza = zzdpVar;
        this.zzf = new zzeg(zzfm.zzf().getThread());
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzpu(zzbdVar);
        this.zze = new SparseArray();
    }
}
