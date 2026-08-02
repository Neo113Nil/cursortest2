package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzao extends com.google.android.libraries.places.api.model.zzfx {
    private int zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.zzfx
    final com.google.android.libraries.places.api.model.LocalTime zzc() {
        if (this.zzc == 3) {
            return new com.google.android.libraries.places.api.model.zzea(this.zza, this.zzb);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" hours");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" minutes");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.zzfx
    final com.google.android.libraries.places.api.model.zzfx zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    final com.google.android.libraries.places.api.model.zzfx zza(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    zzao() {
    }
}
