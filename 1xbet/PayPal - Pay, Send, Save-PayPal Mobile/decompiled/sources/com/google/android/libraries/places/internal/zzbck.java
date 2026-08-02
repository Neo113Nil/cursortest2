package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbck extends com.google.android.libraries.places.internal.zzbcj {
    private final byte[] zzb;

    zzbck(byte[] bArr) {
        super(null);
        this.zzb = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    final byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final com.google.android.libraries.places.internal.zzbcl zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzl = zzl(0, i2, bArr.length);
        return zzl == 0 ? com.google.android.libraries.places.internal.zzbcl.zza : new com.google.android.libraries.places.internal.zzbch(bArr, 0, zzl);
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    final void zze(com.google.android.libraries.places.internal.zzbce zzbceVar) throws java.io.IOException {
        byte[] bArr = this.zzb;
        zzbceVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    protected final boolean zzf(com.google.android.libraries.places.internal.zzbcl zzbclVar) {
        if (zzbclVar instanceof com.google.android.libraries.places.internal.zzbck) {
            return java.util.Arrays.equals(this.zzb, ((com.google.android.libraries.places.internal.zzbck) zzbclVar).zzb);
        }
        if (!(zzbclVar instanceof com.google.android.libraries.places.internal.zzbch)) {
            return zzbclVar.zzf(this);
        }
        byte[] bArr = this.zzb;
        int zzc = zzbclVar.zzc();
        int length = bArr.length;
        if (length > zzc) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 18 + java.lang.String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (length <= zzbclVar.zzc()) {
            com.google.android.libraries.places.internal.zzbch zzbchVar = (com.google.android.libraries.places.internal.zzbch) zzbclVar;
            return com.google.android.libraries.places.internal.zzbcl.zzm(bArr, 0, zzbchVar.zzi(), zzbchVar.zzj(), length);
        }
        int zzc2 = zzbclVar.zzc();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 27 + java.lang.String.valueOf(zzc2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(zzc2);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    protected final int zzg(int i, int i2, int i3) {
        return com.google.android.libraries.places.internal.zzbeb.zzb(i, this.zzb, 0, i3);
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final com.google.android.libraries.places.internal.zzbco zzh() {
        byte[] bArr = this.zzb;
        return com.google.android.libraries.places.internal.zzbco.zzH(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzi() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbcl
    public final int zzc() {
        return this.zzb.length;
    }
}
