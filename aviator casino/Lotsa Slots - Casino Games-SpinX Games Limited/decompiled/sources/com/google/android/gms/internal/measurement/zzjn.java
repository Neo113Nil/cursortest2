package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjn extends com.google.android.gms.internal.measurement.zzkg {
    private final android.content.Context zza;

    @javax.annotation.Nullable
    private final com.google.common.base.Supplier zzb;

    zzjn(android.content.Context context, @javax.annotation.Nullable com.google.common.base.Supplier supplier) {
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.common.base.Supplier supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzkg) {
            com.google.android.gms.internal.measurement.zzkg zzkgVar = (com.google.android.gms.internal.measurement.zzkg) obj;
            if (this.zza.equals(zzkgVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.common.base.Supplier supplier = this.zzb;
        return (hashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 45 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    final android.content.Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    @javax.annotation.Nullable
    final com.google.common.base.Supplier zzb() {
        return this.zzb;
    }
}
