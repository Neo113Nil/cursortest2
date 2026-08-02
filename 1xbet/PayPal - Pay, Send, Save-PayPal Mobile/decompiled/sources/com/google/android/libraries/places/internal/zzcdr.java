package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcdr implements com.google.android.libraries.places.internal.zzbmk {
    private static final java.lang.ThreadLocal zza = new java.lang.ThreadLocal();
    private final com.google.android.libraries.places.internal.zzbff zzb;
    private final com.google.android.libraries.places.internal.zzbex zzc;

    zzcdr(com.google.android.libraries.places.internal.zzbex zzbexVar, int i) {
        this.zzc = (com.google.android.libraries.places.internal.zzbex) com.google.common.base.Preconditions.checkNotNull(zzbexVar, "defaultInstance cannot be null");
        this.zzb = zzbexVar.zzbr();
    }

    @Override // com.google.android.libraries.places.internal.zzbmi
    public final /* synthetic */ java.io.InputStream zza(java.lang.Object obj) {
        return new com.google.android.libraries.places.internal.zzcdq((com.google.android.libraries.places.internal.zzbex) obj, this.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    @Override // com.google.android.libraries.places.internal.zzbmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ java.lang.Object zzb(java.io.InputStream inputStream) {
        byte[] bArr;
        com.google.android.libraries.places.internal.zzbco zzG;
        if (inputStream instanceof com.google.android.libraries.places.internal.zzcdq) {
            com.google.android.libraries.places.internal.zzcdq zzcdqVar = (com.google.android.libraries.places.internal.zzcdq) inputStream;
            if (zzcdqVar.zzc() == this.zzb) {
                try {
                    return zzcdqVar.zzb();
                } catch (java.lang.IllegalStateException unused) {
                }
            }
        }
        try {
            try {
                if (inputStream instanceof com.google.android.libraries.places.internal.zzbla) {
                    try {
                        int available = inputStream.available();
                        if (available > 0 && available <= 4194304) {
                            java.lang.ThreadLocal threadLocal = zza;
                            java.lang.ref.Reference reference = (java.lang.ref.Reference) threadLocal.get();
                            if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                                bArr = new byte[available];
                                threadLocal.set(new java.lang.ref.WeakReference(bArr));
                            }
                            int i = available;
                            while (i > 0) {
                                int read = inputStream.read(bArr, available - i, i);
                                if (read == -1) {
                                    break;
                                }
                                i -= read;
                            }
                            if (i == 0) {
                                zzG = com.google.android.libraries.places.internal.zzbco.zzG(bArr, 0, available);
                                if (zzG == null) {
                                    zzG = com.google.android.libraries.places.internal.zzbco.zzF(inputStream, 4096);
                                }
                                zzG.zzL(Integer.MAX_VALUE);
                                com.google.android.libraries.places.internal.zzbex zzbexVar = (com.google.android.libraries.places.internal.zzbex) this.zzb.zza(zzG, com.google.android.libraries.places.internal.zzcds.zza);
                                zzG.zzb(0);
                                return zzbexVar;
                            }
                            int i2 = available - i;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(available).length() + 21 + java.lang.String.valueOf(i2).length());
                            sb.append("size inaccurate: ");
                            sb.append(available);
                            sb.append(" != ");
                            sb.append(i2);
                            throw new java.lang.RuntimeException(sb.toString());
                        }
                        if (available == 0) {
                            return this.zzc;
                        }
                    } catch (java.io.IOException e) {
                        throw new java.lang.RuntimeException(e);
                    }
                }
                zzG.zzb(0);
                return zzbexVar;
            } catch (com.google.android.libraries.places.internal.zzbed e2) {
                throw e2;
            }
            com.google.android.libraries.places.internal.zzbex zzbexVar2 = (com.google.android.libraries.places.internal.zzbex) this.zzb.zza(zzG, com.google.android.libraries.places.internal.zzcds.zza);
        } catch (com.google.android.libraries.places.internal.zzbed e3) {
            throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Invalid protobuf byte sequence").zzd(e3), null);
        }
        zzG = null;
        if (zzG == null) {
        }
        zzG.zzL(Integer.MAX_VALUE);
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final java.lang.Class zzc() {
        return this.zzc.getClass();
    }
}
