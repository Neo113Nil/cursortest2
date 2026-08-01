package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdsr implements zzdej {
    private final zzdqr zza;
    private final zzdqw zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdsr(zzdqr zzdqrVar, zzdqw zzdqwVar, Executor executor, Executor executor2) {
        this.zza = zzdqrVar;
        this.zzb = zzdqwVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzclm zzclmVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclm.this.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdqr zzdqrVar = this.zza;
            zzeml zzZ = zzdqrVar.zzZ();
            if (zzZ == null && zzdqrVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgx)).booleanValue()) {
                ListenableFuture zzX = zzdqrVar.zzX();
                zzcgo zzY = zzdqrVar.zzY();
                if (zzX == null || zzY == null) {
                    return;
                }
                zzhcy.zzr(zzhcy.zzq(zzX, zzY), new zzdsp(this), this.zzd);
                return;
            }
            if (zzZ != null) {
                zzclm zzW = zzdqrVar.zzW();
                zzclm zzT = zzdqrVar.zzT();
                if (zzW == null) {
                    zzW = zzT == null ? null : zzT;
                }
                if (zzW != null) {
                    zza(zzW);
                }
            }
        }
    }
}
