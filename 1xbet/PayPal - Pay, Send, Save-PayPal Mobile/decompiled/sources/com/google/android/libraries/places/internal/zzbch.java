package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbch extends com.google.android.libraries.places.internal.zzbcj {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzbch(byte[] bArr, int i, int i2) {
        super(null);
        zzl(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final com.google.android.libraries.places.internal.zzbcl zzd(int i, int i2) {
        int zzl = zzl(i, i2, this.zzd);
        return zzl == 0 ? com.google.android.libraries.places.internal.zzbcl.zza : new com.google.android.libraries.places.internal.zzbch(this.zzb, this.zzc + i, zzl);
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    final void zze(com.google.android.libraries.places.internal.zzbce zzbceVar) throws java.io.IOException {
        zzbceVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    protected final boolean zzf(com.google.android.libraries.places.internal.zzbcl zzbclVar) {
        boolean z = zzbclVar instanceof com.google.android.libraries.places.internal.zzbck;
        if (!z && !(zzbclVar instanceof com.google.android.libraries.places.internal.zzbch)) {
            return zzbclVar.zzf(this);
        }
        int i = this.zzd;
        if (i > zzbclVar.zzc()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 18 + java.lang.String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i > zzbclVar.zzc()) {
            int zzc = zzbclVar.zzc();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 27 + java.lang.String.valueOf(zzc).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(zzc);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (z) {
            return com.google.android.libraries.places.internal.zzbcl.zzm(this.zzb, this.zzc, ((com.google.android.libraries.places.internal.zzbck) zzbclVar).zzi(), 0, i);
        }
        if (zzbclVar instanceof com.google.android.libraries.places.internal.zzbch) {
            com.google.android.libraries.places.internal.zzbch zzbchVar = (com.google.android.libraries.places.internal.zzbch) zzbclVar;
            return com.google.android.libraries.places.internal.zzbcl.zzm(this.zzb, this.zzc, zzbchVar.zzb, zzbchVar.zzc, i);
        }
        com.google.android.libraries.places.internal.zzbcl zzd = zzbclVar.zzd(0, i);
        int i2 = this.zzc;
        return zzd.equals(zzd(i2, i + i2));
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    protected final int zzg(int i, int i2, int i3) {
        return com.google.android.libraries.places.internal.zzbeb.zzb(i, this.zzb, this.zzc, i3);
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final byte zza(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 18 + java.lang.String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
    }

    final /* synthetic */ int zzj() {
        return this.zzc;
    }

    final /* synthetic */ byte[] zzi() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final com.google.android.libraries.places.internal.zzbco zzh() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final int zzc() {
        return this.zzd;
    }
}
