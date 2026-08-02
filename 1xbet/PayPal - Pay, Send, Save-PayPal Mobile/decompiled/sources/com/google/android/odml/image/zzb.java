package com.google.android.odml.image;

/* loaded from: classes9.dex */
final class zzb extends com.google.android.odml.image.zzh {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;

    @Override // com.google.android.odml.image.zzh
    final com.google.android.odml.image.zzh zza(int i) {
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    final com.google.android.odml.image.zzh zzb(int i) {
        this.zzb = java.lang.Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    final com.google.android.odml.image.ImageProperties zzc() {
        java.lang.Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new com.google.android.odml.image.zzc(num.intValue(), this.zzb.intValue(), null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb.append(" storageType");
        }
        java.lang.String valueOf = java.lang.String.valueOf(sb);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    zzb() {
    }
}
