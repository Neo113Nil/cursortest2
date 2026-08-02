package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzmv extends com.google.android.libraries.places.internal.zzmx {
    private java.lang.String zza;
    private int zzb;
    private com.google.android.libraries.places.internal.zzmy zzc;
    private byte zzd;

    final com.google.android.libraries.places.internal.zzmx zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null packageName");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmx
    public final com.google.android.libraries.places.internal.zzmx zzc(com.google.android.libraries.places.internal.zzmy zzmyVar) {
        if (zzmyVar == null) {
            throw new java.lang.NullPointerException("Null requestSource");
        }
        this.zzc = zzmyVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmx
    final com.google.android.libraries.places.internal.zzmz zzd() {
        java.lang.String str;
        com.google.android.libraries.places.internal.zzmy zzmyVar;
        if (this.zzd == 1 && (str = this.zza) != null && (zzmyVar = this.zzc) != null) {
            return new com.google.android.libraries.places.internal.zzmw(str, this.zzb, zzmyVar, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" packageName");
        }
        if (this.zzd == 0) {
            sb.append(" versionCode");
        }
        if (this.zzc == null) {
            sb.append(" requestSource");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.internal.zzmx
    final com.google.android.libraries.places.internal.zzmx zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) 1;
        return this;
    }

    zzmv() {
    }
}
