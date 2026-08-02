package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcp implements com.google.android.libraries.places.internal.zzbfk {
    private final com.google.android.libraries.places.internal.zzbco zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzbcp(com.google.android.libraries.places.internal.zzbco zzbcoVar) {
        this.zza = zzbcoVar;
        zzbcoVar.zze = this;
    }

    private final void zzR(int i) throws java.io.IOException {
        if ((this.zzb & 7) != i) {
            throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzS(java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
        int zzo = zzbcoVar.zzo();
        zzbcoVar.zzI();
        int zzz = zzbcoVar.zzz(zzo);
        zzbcoVar.zza++;
        zzbflVar.zzg(obj, this, zzbdbVar);
        zzbcoVar.zzb(0);
        zzbcoVar.zza--;
        zzbcoVar.zzA(zzz);
    }

    private final java.lang.Object zzT(com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        java.lang.Object zza = zzbflVar.zza();
        zzS(zza, zzbflVar, zzbdbVar);
        zzbflVar.zzh(zza);
        return zza;
    }

    private final void zzU(java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzbflVar.zzg(obj, this, zzbdbVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new com.google.android.libraries.places.internal.zzbed("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final java.lang.Object zzV(com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        java.lang.Object zza = zzbflVar.zza();
        zzU(zza, zzbflVar, zzbdbVar);
        zzbflVar.zzh(zza);
        return zza;
    }

    private final void zzW(int i) throws java.io.IOException {
        if (this.zza.zzC() != i) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzX(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw new com.google.android.libraries.places.internal.zzbed("Failed to parse the message.");
        }
    }

    private static final void zzY(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw new com.google.android.libraries.places.internal.zzbed("Failed to parse the message.");
        }
    }

    public static com.google.android.libraries.places.internal.zzbcp zza(com.google.android.libraries.places.internal.zzbco zzbcoVar) {
        java.lang.Object obj = zzbcoVar.zze;
        return obj != null ? (com.google.android.libraries.places.internal.zzbcp) obj : new com.google.android.libraries.places.internal.zzbcp(zzbcoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzA(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.libraries.places.internal.zzbdi) {
            com.google.android.libraries.places.internal.zzbdi zzbdiVar = (com.google.android.libraries.places.internal.zzbdi) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzo = zzbcoVar.zzo();
                zzX(zzo);
                int zzC = zzbcoVar.zzC();
                do {
                    zzbdiVar.zzf(zzbcoVar.zze());
                } while (zzbcoVar.zzC() < zzC + zzo);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdiVar.zzf(zzbcoVar2.zze());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    i = zzbcoVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzo2 = zzbcoVar3.zzo();
                zzX(zzo2);
                int zzC2 = zzbcoVar3.zzC();
                do {
                    list.add(java.lang.Float.valueOf(zzbcoVar3.zze()));
                } while (zzbcoVar3.zzC() < zzC2 + zzo2);
                return;
            }
            if (i3 != 5) {
                throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Float.valueOf(zzbcoVar4.zze()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzB(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbem) {
            com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbemVar.zzf(zzbcoVar.zzf());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbemVar.zzf(zzbcoVar2.zzf());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Long.valueOf(zzbcoVar3.zzf()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzbcoVar4.zzf()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzC(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbem) {
            com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbemVar.zzf(zzbcoVar.zzg());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbemVar.zzf(zzbcoVar2.zzg());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Long.valueOf(zzbcoVar3.zzg()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzbcoVar4.zzg()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzD(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbdr) {
            com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbdrVar.zzh(zzbcoVar.zzh());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdrVar.zzh(zzbcoVar2.zzh());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzbcoVar3.zzh()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzbcoVar4.zzh()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzE(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbem) {
            com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzo = zzbcoVar.zzo();
                zzY(zzo);
                int zzC = zzbcoVar.zzC();
                do {
                    zzbemVar.zzf(zzbcoVar.zzi());
                } while (zzbcoVar.zzC() < zzC + zzo);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbemVar.zzf(zzbcoVar2.zzi());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzo2 = zzbcoVar3.zzo();
                zzY(zzo2);
                int zzC2 = zzbcoVar3.zzC();
                do {
                    list.add(java.lang.Long.valueOf(zzbcoVar3.zzi()));
                } while (zzbcoVar3.zzC() < zzC2 + zzo2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzbcoVar4.zzi()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzF(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.libraries.places.internal.zzbdr) {
            com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzo = zzbcoVar.zzo();
                zzX(zzo);
                int zzC = zzbcoVar.zzC();
                do {
                    zzbdrVar.zzh(zzbcoVar.zzj());
                } while (zzbcoVar.zzC() < zzC + zzo);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdrVar.zzh(zzbcoVar2.zzj());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    i = zzbcoVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzo2 = zzbcoVar3.zzo();
                zzX(zzo2);
                int zzC2 = zzbcoVar3.zzC();
                do {
                    list.add(java.lang.Integer.valueOf(zzbcoVar3.zzj()));
                } while (zzbcoVar3.zzC() < zzC2 + zzo2);
                return;
            }
            if (i3 != 5) {
                throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzbcoVar4.zzj()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzG(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbcd) {
            com.google.android.libraries.places.internal.zzbcd zzbcdVar = (com.google.android.libraries.places.internal.zzbcd) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbcdVar.zzf(zzbcoVar.zzk());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbcdVar.zzf(zzbcoVar2.zzk());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Boolean.valueOf(zzbcoVar3.zzk()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Boolean.valueOf(zzbcoVar4.zzk()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    public final void zzH(java.util.List list, boolean z) throws java.io.IOException {
        int zza;
        int i;
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbej) || z) {
            do {
                list.add(z ? zzn() : zzm());
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                if (zzbcoVar.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        } else {
            com.google.android.libraries.places.internal.zzbej zzbejVar = (com.google.android.libraries.places.internal.zzbej) list;
            do {
                zzs();
                zzbejVar.zzb();
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    i = zzbcoVar2.zza();
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzI(java.util.List list, com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzT(zzbflVar, zzbdbVar));
            com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
            if (zzbcoVar.zzB() || this.zzd != 0) {
                return;
            } else {
                zza = zzbcoVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    @java.lang.Deprecated
    public final void zzJ(java.util.List list, com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzV(zzbflVar, zzbdbVar));
            com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
            if (zzbcoVar.zzB() || this.zzd != 0) {
                return;
            } else {
                zza = zzbcoVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzK(java.util.List list) throws java.io.IOException {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzs());
            com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
            if (zzbcoVar.zzB()) {
                return;
            } else {
                zza = zzbcoVar.zza();
            }
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzL(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbdr) {
            com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbdrVar.zzh(zzbcoVar.zzo());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdrVar.zzh(zzbcoVar2.zzo());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzbcoVar3.zzo()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzbcoVar4.zzo()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzM(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbdr) {
            com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbdrVar.zzh(zzbcoVar.zzp());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdrVar.zzh(zzbcoVar2.zzp());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzbcoVar3.zzp()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzbcoVar4.zzp()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzN(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.libraries.places.internal.zzbdr) {
            com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzo = zzbcoVar.zzo();
                zzX(zzo);
                int zzC = zzbcoVar.zzC();
                do {
                    zzbdrVar.zzh(zzbcoVar.zzq());
                } while (zzbcoVar.zzC() < zzC + zzo);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdrVar.zzh(zzbcoVar2.zzq());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    i = zzbcoVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzo2 = zzbcoVar3.zzo();
                zzX(zzo2);
                int zzC2 = zzbcoVar3.zzC();
                do {
                    list.add(java.lang.Integer.valueOf(zzbcoVar3.zzq()));
                } while (zzbcoVar3.zzC() < zzC2 + zzo2);
                return;
            }
            if (i3 != 5) {
                throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzbcoVar4.zzq()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzO(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbem) {
            com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzo = zzbcoVar.zzo();
                zzY(zzo);
                int zzC = zzbcoVar.zzC();
                do {
                    zzbemVar.zzf(zzbcoVar.zzr());
                } while (zzbcoVar.zzC() < zzC + zzo);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbemVar.zzf(zzbcoVar2.zzr());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzo2 = zzbcoVar3.zzo();
                zzY(zzo2);
                int zzC2 = zzbcoVar3.zzC();
                do {
                    list.add(java.lang.Long.valueOf(zzbcoVar3.zzr()));
                } while (zzbcoVar3.zzC() < zzC2 + zzo2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzbcoVar4.zzr()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzP(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbdr) {
            com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbdrVar.zzh(zzbcoVar.zzs());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbdrVar.zzh(zzbcoVar2.zzs());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzbcoVar3.zzs()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzbcoVar4.zzs()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzQ(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbem) {
            com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzC = zzbcoVar.zzC() + zzbcoVar.zzo();
                do {
                    zzbemVar.zzf(zzbcoVar.zzt());
                } while (zzbcoVar.zzC() < zzC);
                zzW(zzC);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbemVar.zzf(zzbcoVar2.zzt());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzC2 = zzbcoVar3.zzC() + zzbcoVar3.zzo();
                do {
                    list.add(java.lang.Long.valueOf(zzbcoVar3.zzt()));
                } while (zzbcoVar3.zzC() < zzC2);
                zzW(zzC2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzbcoVar4.zzt()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzb() throws java.io.IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zza();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final boolean zzd() throws java.io.IOException {
        int i;
        com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
        if (zzbcoVar.zzB() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzbcoVar.zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final double zze() throws java.io.IOException {
        zzR(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final float zzf() throws java.io.IOException {
        zzR(5);
        return this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final long zzg() throws java.io.IOException {
        zzR(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final long zzh() throws java.io.IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzi() throws java.io.IOException {
        zzR(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final long zzj() throws java.io.IOException {
        zzR(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzk() throws java.io.IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final boolean zzl() throws java.io.IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final java.lang.String zzm() throws java.io.IOException {
        zzR(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final java.lang.String zzn() throws java.io.IOException {
        zzR(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final java.lang.Object zzo(java.lang.Class cls, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        zzR(2);
        return zzT(com.google.android.libraries.places.internal.zzbfh.zza().zzb(cls), zzbdbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    @java.lang.Deprecated
    public final java.lang.Object zzp(java.lang.Class cls, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        zzR(3);
        return zzV(com.google.android.libraries.places.internal.zzbfh.zza().zzb(cls), zzbdbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzq(java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        zzR(2);
        zzS(obj, zzbflVar, zzbdbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzr(java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        zzR(3);
        zzU(obj, zzbflVar, zzbdbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final com.google.android.libraries.places.internal.zzbcl zzs() throws java.io.IOException {
        zzR(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzt() throws java.io.IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzu() throws java.io.IOException {
        zzR(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzv() throws java.io.IOException {
        zzR(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final long zzw() throws java.io.IOException {
        zzR(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzx() throws java.io.IOException {
        zzR(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final long zzy() throws java.io.IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final void zzz(java.util.List list) throws java.io.IOException {
        int zza;
        if (list instanceof com.google.android.libraries.places.internal.zzbcw) {
            com.google.android.libraries.places.internal.zzbcw zzbcwVar = (com.google.android.libraries.places.internal.zzbcw) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar = this.zza;
                int zzo = zzbcoVar.zzo();
                zzY(zzo);
                int zzC = zzbcoVar.zzC();
                do {
                    zzbcwVar.zzf(zzbcoVar.zzd());
                } while (zzbcoVar.zzC() < zzC + zzo);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar2 = this.zza;
                zzbcwVar.zzf(zzbcoVar2.zzd());
                if (zzbcoVar2.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar2.zza();
                }
            } while (zza == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
                }
                com.google.android.libraries.places.internal.zzbco zzbcoVar3 = this.zza;
                int zzo2 = zzbcoVar3.zzo();
                zzY(zzo2);
                int zzC2 = zzbcoVar3.zzC();
                do {
                    list.add(java.lang.Double.valueOf(zzbcoVar3.zzd()));
                } while (zzbcoVar3.zzC() < zzC2 + zzo2);
                return;
            }
            do {
                com.google.android.libraries.places.internal.zzbco zzbcoVar4 = this.zza;
                list.add(java.lang.Double.valueOf(zzbcoVar4.zzd()));
                if (zzbcoVar4.zzB()) {
                    return;
                } else {
                    zza = zzbcoVar4.zza();
                }
            } while (zza == this.zzb);
        }
        this.zzd = zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfk
    public final int zzc() {
        return this.zzb;
    }
}
