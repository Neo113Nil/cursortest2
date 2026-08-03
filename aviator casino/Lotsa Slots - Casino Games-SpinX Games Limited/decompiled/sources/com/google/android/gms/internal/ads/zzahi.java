package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahi implements com.google.android.gms.internal.ads.zzagb {
    private final long zzb;
    private final com.google.android.gms.internal.ads.zzagb zzc;

    public zzahi(long j, com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzb = j;
        this.zzc = zzagbVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final com.google.android.gms.internal.ads.zzahk zzu(int i, int i2) {
        return this.zzc.zzu(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzw(com.google.android.gms.internal.ads.zzahb zzahbVar) {
        this.zzc.zzw(new com.google.android.gms.internal.ads.zzahh(this, zzahbVar, zzahbVar));
    }
}
