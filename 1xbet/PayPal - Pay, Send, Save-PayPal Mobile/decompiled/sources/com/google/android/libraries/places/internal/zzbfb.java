package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfb implements com.google.android.libraries.places.internal.zzbfl {
    private final com.google.android.libraries.places.internal.zzbex zza;
    private final com.google.android.libraries.places.internal.zzbfy zzb;
    private final boolean zzc;
    private final com.google.android.libraries.places.internal.zzbdc zzd;

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final java.lang.Object zza() {
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        return zzbexVar instanceof com.google.android.libraries.places.internal.zzbdq ? ((com.google.android.libraries.places.internal.zzbdq) zzbexVar).zzbs() : zzbexVar.zzbK().zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.libraries.places.internal.zzbdq) obj).zzc.equals(((com.google.android.libraries.places.internal.zzbdq) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.equals(((com.google.android.libraries.places.internal.zzbdn) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final int zzc(java.lang.Object obj) {
        int hashCode = ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final void zzd(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbfn.zzE(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.libraries.places.internal.zzbfn.zzD(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final int zze(java.lang.Object obj) {
        int zzh = ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.zzh();
        return this.zzc ? zzh + ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zzi() : zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final void zzf(java.lang.Object obj, com.google.android.libraries.places.internal.zzbgl zzbglVar) throws java.io.IOException {
        java.util.Iterator zzd = ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zzd();
        while (zzd.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) zzd.next();
            com.google.android.libraries.places.internal.zzbdf zzbdfVar = (com.google.android.libraries.places.internal.zzbdf) entry.getKey();
            if (zzbdfVar.zzc() != com.google.android.libraries.places.internal.zzbgk.MESSAGE) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            zzbdfVar.zzd();
            zzbdfVar.zze();
            if (entry instanceof com.google.android.libraries.places.internal.zzbef) {
                zzbdfVar.zza();
                zzbglVar.zzv(525004180, ((com.google.android.libraries.places.internal.zzbef) entry).zza().zzc());
            } else {
                zzbdfVar.zza();
                zzbglVar.zzv(525004180, entry.getValue());
            }
        }
        ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.zzf(zzbglVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final void zzg(java.lang.Object obj, com.google.android.libraries.places.internal.zzbfk zzbfkVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        boolean zzd;
        com.google.android.libraries.places.internal.zzbdc zzbdcVar = this.zzd;
        com.google.android.libraries.places.internal.zzbfy zzbfyVar = this.zzb;
        java.lang.Object zzh = zzbfyVar.zzh(obj);
        com.google.android.libraries.places.internal.zzbdg zza = zzbdcVar.zza(obj);
        while (true) {
            try {
                if (zzbfkVar.zzb() == Integer.MAX_VALUE) {
                    break;
                }
                int zzc = zzbfkVar.zzc();
                if (zzc != 11) {
                    if ((zzc & 7) == 2) {
                        com.google.android.libraries.places.internal.zzbdp zzb = zzbdbVar.zzb(this.zza, zzc >>> 3);
                        if (zzb != null) {
                            zzbdcVar.zzd(zzbfkVar, zzb, zzbdbVar, zza);
                        } else {
                            zzd = zzbfyVar.zzk(zzh, zzbfkVar, 0);
                        }
                    } else {
                        zzd = zzbfkVar.zzd();
                    }
                    if (!zzd) {
                        break;
                    }
                } else {
                    com.google.android.libraries.places.internal.zzbdp zzbdpVar = null;
                    com.google.android.libraries.places.internal.zzbcl zzbclVar = null;
                    int i = 0;
                    for (int i2 = Integer.MAX_VALUE; zzbfkVar.zzb() != i2; i2 = Integer.MAX_VALUE) {
                        int zzc2 = zzbfkVar.zzc();
                        if (zzc2 == 16) {
                            i = zzbfkVar.zzt();
                            zzbdpVar = zzbdbVar.zzb(this.zza, i);
                        } else if (zzc2 != 26) {
                            if (zzc2 == 12 || !zzbfkVar.zzd()) {
                                break;
                            }
                        } else if (zzbdpVar != null) {
                            zzbdcVar.zzd(zzbfkVar, zzbdpVar, zzbdbVar, zza);
                        } else {
                            zzbclVar = zzbfkVar.zzs();
                        }
                    }
                    if (zzbfkVar.zzc() != 12) {
                        throw new com.google.android.libraries.places.internal.zzbed("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzbclVar != null) {
                        if (zzbdpVar != null) {
                            com.google.android.libraries.places.internal.zzbdp zzbdpVar2 = zzbdpVar;
                            com.google.android.libraries.places.internal.zzbdk zzbdkVar = (com.google.android.libraries.places.internal.zzbdk) ((com.google.android.libraries.places.internal.zzbdq) zzbdpVar.zza).zzb(5, null, null);
                            com.google.android.libraries.places.internal.zzbco zzh2 = zzbclVar.zzh();
                            zzbdkVar.zzx(zzh2, zzbdbVar);
                            zza.zzf(zzbdpVar.zzb, zzbdkVar.zzF());
                            zzh2.zzb(0);
                        } else {
                            zzbfyVar.zzd(zzh, i, zzbclVar);
                        }
                    }
                }
            } finally {
                zzbfyVar.zzi(obj, zzh);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final void zzh(java.lang.Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final boolean zzi(java.lang.Object obj) {
        return ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zzg();
    }

    static com.google.android.libraries.places.internal.zzbfb zzj(com.google.android.libraries.places.internal.zzbfy zzbfyVar, com.google.android.libraries.places.internal.zzbdc zzbdcVar, com.google.android.libraries.places.internal.zzbex zzbexVar) {
        return new com.google.android.libraries.places.internal.zzbfb(zzbfyVar, zzbdcVar, zzbexVar);
    }

    private zzbfb(com.google.android.libraries.places.internal.zzbfy zzbfyVar, com.google.android.libraries.places.internal.zzbdc zzbdcVar, com.google.android.libraries.places.internal.zzbex zzbexVar) {
        this.zzb = zzbfyVar;
        this.zzc = zzbexVar instanceof com.google.android.libraries.places.internal.zzbdn;
        this.zzd = zzbdcVar;
        this.zza = zzbexVar;
    }
}
