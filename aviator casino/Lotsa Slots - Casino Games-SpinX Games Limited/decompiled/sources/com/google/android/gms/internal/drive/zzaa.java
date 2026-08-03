package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzaa extends com.google.android.gms.drive.Metadata {
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdt;

    public zzaa(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzdt = metadataBundle;
    }

    @Override // com.google.android.gms.drive.Metadata
    public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> metadataField) {
        return (T) this.zzdt.zza(metadataField);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzdt);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 17);
        sb.append("Metadata [mImpl=");
        sb.append(valueOf);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return this.zzdt != null;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.drive.Metadata freeze() {
        return new com.google.android.gms.internal.drive.zzaa(this.zzdt.zzbf());
    }
}
