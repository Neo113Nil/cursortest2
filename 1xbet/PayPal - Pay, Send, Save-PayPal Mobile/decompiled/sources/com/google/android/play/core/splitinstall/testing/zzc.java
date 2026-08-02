package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
final class zzc extends com.google.android.play.core.splitinstall.testing.zzv {
    private final java.lang.Integer zzb;
    private final java.util.Map zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.splitinstall.testing.zzv)) {
            return false;
        }
        com.google.android.play.core.splitinstall.testing.zzv zzvVar = (com.google.android.play.core.splitinstall.testing.zzv) obj;
        java.lang.Integer num = this.zzb;
        if (num == null) {
            if (zzvVar.zza() != null) {
                return false;
            }
        } else if (!num.equals(zzvVar.zza())) {
            return false;
        }
        return this.zzc.equals(zzvVar.zzb());
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalTestingConfig{defaultSplitInstallErrorCode=");
        sb.append(num);
        sb.append(", splitInstallErrorCodeByModule=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzb;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.zzc.hashCode();
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    public final java.util.Map zzb() {
        return this.zzc;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    public final java.lang.Integer zza() {
        return this.zzb;
    }

    /* synthetic */ zzc(java.lang.Integer num, java.util.Map map, com.google.android.play.core.splitinstall.testing.zzb zzbVar) {
        this.zzb = num;
        this.zzc = map;
    }
}
