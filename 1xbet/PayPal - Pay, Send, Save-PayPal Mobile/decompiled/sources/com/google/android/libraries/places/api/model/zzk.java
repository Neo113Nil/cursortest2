package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzk extends com.google.android.libraries.places.api.model.zzfr {
    private int zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.zzfr
    public final com.google.android.libraries.places.api.model.zzfs zzc() {
        if (this.zzc == 3) {
            return new com.google.android.libraries.places.api.model.zzcs(this.zza, this.zzb);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" offset");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" length");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.zzfr
    public final com.google.android.libraries.places.api.model.zzfr zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzfr
    public final com.google.android.libraries.places.api.model.zzfr zza(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    zzk() {
    }
}
