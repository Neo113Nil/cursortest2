package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzww extends zzwp {
    private final HashMap zza = new HashMap();
    private Handler zzb;

    protected zzww() {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final void zzN() {
        for (zzwv zzwvVar : this.zza.values()) {
            zzwvVar.zza.zzr(zzwvVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected void zza(zziq zziqVar) {
        this.zzb = zzfm.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final void zzc() {
        for (zzwv zzwvVar : this.zza.values()) {
            zzwvVar.zza.zzs(zzwvVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected void zzd() {
        HashMap hashMap = this.zza;
        for (zzwv zzwvVar : hashMap.values()) {
            zzxq zzxqVar = zzwvVar.zza;
            zzxqVar.zzt(zzwvVar.zzb);
            zzwu zzwuVar = zzwvVar.zzc;
            zzxqVar.zzn(zzwuVar);
            zzxqVar.zzp(zzwuVar);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public void zzu() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzwv) it.next()).zza.zzu();
        }
    }

    protected abstract void zzv(Object obj, zzxq zzxqVar, zzbf zzbfVar);

    protected final void zzw(final Object obj, zzxq zzxqVar) {
        HashMap hashMap = this.zza;
        zzguk.zza(!hashMap.containsKey(obj));
        zzxp zzxpVar = new zzxp() { // from class: com.google.android.gms.internal.ads.zzwt
            @Override // com.google.android.gms.internal.ads.zzxp
            public final /* synthetic */ void zza(zzxq zzxqVar2, zzbf zzbfVar) {
                zzww.this.zzv(obj, zzxqVar2, zzbfVar);
            }
        };
        zzwu zzwuVar = new zzwu(this, obj);
        hashMap.put(obj, new zzwv(zzxqVar, zzxpVar, zzwuVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzxqVar.zzm(handler, zzwuVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzxqVar.zzo(handler2, zzwuVar);
        zzxqVar.zzq(zzxpVar, zzk(), zzl());
        if (zzj()) {
            return;
        }
        zzxqVar.zzs(zzxpVar);
    }

    protected int zzx(Object obj, int i) {
        return 0;
    }

    protected zzxo zzy(Object obj, zzxo zzxoVar) {
        throw null;
    }

    protected long zzz(Object obj, long j, zzxo zzxoVar) {
        return j;
    }
}
