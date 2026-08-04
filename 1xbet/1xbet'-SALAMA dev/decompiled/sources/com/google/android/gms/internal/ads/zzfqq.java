package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzfqq extends zzfrt {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zzb(int i7) {
        this.zza = i7;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfru zzc() {
        if (this.zzc == 1) {
            return new zzfqs(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
