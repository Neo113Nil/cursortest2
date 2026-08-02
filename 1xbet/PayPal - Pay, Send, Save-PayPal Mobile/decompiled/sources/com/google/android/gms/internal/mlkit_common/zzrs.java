package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzrs extends com.google.android.gms.internal.mlkit_common.zzsa {
    private java.lang.String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final com.google.android.gms.internal.mlkit_common.zzsb zzd() {
        java.lang.String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new com.google.android.gms.internal.mlkit_common.zzru(str, this.zzb, this.zzc, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final com.google.android.gms.internal.mlkit_common.zzsa zzc(java.lang.String str) {
        this.zza = "common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final com.google.android.gms.internal.mlkit_common.zzsa zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final com.google.android.gms.internal.mlkit_common.zzsa zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    zzrs() {
    }
}
