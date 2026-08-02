package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzb extends com.google.android.play.core.splitcompat.zzt {
    private final java.io.File zza;
    private final java.lang.String zzb;

    zzb(java.io.File file, java.lang.String str) {
        if (file == null) {
            throw new java.lang.NullPointerException("Null splitFile");
        }
        this.zza = file;
        if (str == null) {
            throw new java.lang.NullPointerException("Null splitId");
        }
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.splitcompat.zzt)) {
            return false;
        }
        com.google.android.play.core.splitcompat.zzt zztVar = (com.google.android.play.core.splitcompat.zzt) obj;
        return this.zza.equals(zztVar.zza()) && this.zzb.equals(zztVar.zzb());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.String str = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitFileInfo{splitFile=");
        sb.append(obj);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.play.core.splitcompat.zzt
    final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.splitcompat.zzt
    final java.io.File zza() {
        return this.zza;
    }
}
