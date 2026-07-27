package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzmq implements zzxz, zzuo {
    final /* synthetic */ zzmv zza;
    private final zzms zzb;

    public zzmq(zzmv zzmvVar, zzms zzmsVar) {
        Objects.requireNonNull(zzmvVar);
        this.zza = zzmvVar;
        this.zzb = zzmsVar;
    }

    private final Pair zzf(int i, zzxo zzxoVar) {
        zzxo zzxoVar2;
        zzxo zzxoVar3 = null;
        if (zzxoVar != null) {
            zzms zzmsVar = this.zzb;
            int i2 = 0;
            while (true) {
                List list = zzmsVar.zzc;
                if (i2 >= list.size()) {
                    zzxoVar2 = null;
                    break;
                }
                if (((zzxo) list.get(i2)).zzd == zzxoVar.zzd) {
                    Object obj = zzxoVar.zza;
                    Object obj2 = zzmsVar.zzb;
                    int i3 = zznc.zzb;
                    zzxoVar2 = zzxoVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzxoVar2 == null) {
                return null;
            }
            zzxoVar3 = zzxoVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzxoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzai(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar, final int i2) {
        final Pair zzf = zzf(0, zzxoVar);
        if (zzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmq.this.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar, i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzaj(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar) {
        final Pair zzf = zzf(0, zzxoVar);
        if (zzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzml
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmq.this.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzak(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar) {
        final Pair zzf = zzf(0, zzxoVar);
        if (zzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmq.this.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzal(int i, zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar, final IOException iOException, final boolean z) {
        final Pair zzf = zzf(0, zzxoVar);
        if (zzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmq.this.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzam(int i, zzxo zzxoVar, final zzxk zzxkVar) {
        final Pair zzf = zzf(0, zzxoVar);
        if (zzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmq.this.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxkVar);
                }
            });
        }
    }
}
