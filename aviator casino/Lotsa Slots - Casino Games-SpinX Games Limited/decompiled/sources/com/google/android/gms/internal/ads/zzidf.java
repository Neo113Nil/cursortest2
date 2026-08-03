package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidf implements com.google.android.gms.internal.ads.zzigc {
    private final com.google.android.gms.internal.ads.zzide zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzidf(com.google.android.gms.internal.ads.zzide zzideVar) {
        zzideVar.getClass();
        this.zza = zzideVar;
        zzideVar.zzd = this;
    }

    private final void zzQ(int i) throws java.io.IOException {
        if ((this.zzb & 7) != i) {
            throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
        int zzo = zzideVar.zzo();
        zzideVar.zzJ();
        int zzB = zzideVar.zzB(zzo);
        zzideVar.zza++;
        zzighVar.zzg(obj, this, zzidoVar);
        zzideVar.zzb(0);
        zzideVar.zza--;
        zzideVar.zzC(zzB);
    }

    private final java.lang.Object zzS(com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        java.lang.Object zza = zzighVar.zza();
        zzR(zza, zzighVar, zzidoVar);
        zzighVar.zzk(zza);
        return zza;
    }

    private final void zzT(java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzighVar.zzg(obj, this, zzidoVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new com.google.android.gms.internal.ads.zziet("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final java.lang.Object zzU(com.google.android.gms.internal.ads.zzihg zzihgVar, java.lang.Class cls, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzihg zzihgVar2 = com.google.android.gms.internal.ads.zzihg.DOUBLE;
        switch (zzihgVar) {
            case DOUBLE:
                return java.lang.Double.valueOf(zze());
            case FLOAT:
                return java.lang.Float.valueOf(zzf());
            case INT64:
                return java.lang.Long.valueOf(zzh());
            case UINT64:
                return java.lang.Long.valueOf(zzg());
            case INT32:
                return java.lang.Integer.valueOf(zzi());
            case FIXED64:
                return java.lang.Long.valueOf(zzj());
            case FIXED32:
                return java.lang.Integer.valueOf(zzk());
            case BOOL:
                return java.lang.Boolean.valueOf(zzl());
            case STRING:
                return zzn();
            case GROUP:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                zzQ(2);
                return zzS(com.google.android.gms.internal.ads.zzifz.zza().zzb(cls), zzidoVar);
            case BYTES:
                return zzq();
            case UINT32:
                return java.lang.Integer.valueOf(zzr());
            case ENUM:
                return java.lang.Integer.valueOf(zzs());
            case SFIXED32:
                return java.lang.Integer.valueOf(zzt());
            case SFIXED64:
                return java.lang.Long.valueOf(zzu());
            case SINT32:
                return java.lang.Integer.valueOf(zzv());
            case SINT64:
                return java.lang.Long.valueOf(zzw());
        }
    }

    private final void zzV(int i) throws java.io.IOException {
        if (this.zza.zzE() != i) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw new com.google.android.gms.internal.ads.zziet("Failed to parse the message.");
        }
    }

    private static final void zzX(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw new com.google.android.gms.internal.ads.zziet("Failed to parse the message.");
        }
    }

    public static com.google.android.gms.internal.ads.zzidf zza(com.google.android.gms.internal.ads.zzide zzideVar) {
        java.lang.Object obj = zzideVar.zzd;
        return obj != null ? (com.google.android.gms.internal.ads.zzidf) obj : new com.google.android.gms.internal.ads.zzidf(zzideVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzA(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zzifdVar.zzd(zzideVar.zzg());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzifdVar.zzd(zzideVar2.zzg());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Long.valueOf(zzideVar3.zzg()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzideVar4.zzg()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzB(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zziefVar.zzi(zzideVar.zzh());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zziefVar.zzi(zzideVar2.zzh());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzideVar3.zzh()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzideVar4.zzh()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzC(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzo = zzideVar.zzo();
                zzX(zzo);
                int zzE = zzideVar.zzE() + zzo;
                do {
                    zzifdVar.zzd(zzideVar.zzi());
                } while (zzideVar.zzE() < zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzifdVar.zzd(zzideVar2.zzi());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzo2 = zzideVar3.zzo();
                zzX(zzo2);
                int zzE2 = zzideVar3.zzE() + zzo2;
                do {
                    list.add(java.lang.Long.valueOf(zzideVar3.zzi()));
                } while (zzideVar3.zzE() < zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzideVar4.zzi()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzD(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzo = zzideVar.zzo();
                zzW(zzo);
                int zzE = zzideVar.zzE() + zzo;
                do {
                    zziefVar.zzi(zzideVar.zzj());
                } while (zzideVar.zzE() < zzE);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zziefVar.zzi(zzideVar2.zzj());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzo2 = zzideVar3.zzo();
                zzW(zzo2);
                int zzE2 = zzideVar3.zzE() + zzo2;
                do {
                    list.add(java.lang.Integer.valueOf(zzideVar3.zzj()));
                } while (zzideVar3.zzE() < zzE2);
                return;
            }
            if (i3 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzideVar4.zzj()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzE(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzicq) {
            com.google.android.gms.internal.ads.zzicq zzicqVar = (com.google.android.gms.internal.ads.zzicq) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zzicqVar.zzg(zzideVar.zzk());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzicqVar.zzg(zzideVar2.zzk());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Boolean.valueOf(zzideVar3.zzk()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Boolean.valueOf(zzideVar4.zzk()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzF(java.util.List list, boolean z) throws java.io.IOException {
        int zza;
        int i;
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof com.google.android.gms.internal.ads.zzifa) && !z) {
            com.google.android.gms.internal.ads.zzifa zzifaVar = (com.google.android.gms.internal.ads.zzifa) list;
            do {
                zzq();
                zzifaVar.zzb();
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                if (zzideVar.zzD()) {
                    return;
                } else {
                    i = zzideVar.zza();
                }
            } while (i == this.zzb);
        } else {
            do {
                list.add(z ? zzn() : zzm());
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    zza = zzideVar2.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzG(java.util.List list, com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzighVar, zzidoVar));
            com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
            if (zzideVar.zzD() || this.zzd != 0) {
                return;
            } else {
                zza = zzideVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    @java.lang.Deprecated
    public final void zzH(java.util.List list, com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
        }
        do {
            java.lang.Object zza2 = zzighVar.zza();
            zzT(zza2, zzighVar, zzidoVar);
            zzighVar.zzk(zza2);
            list.add(zza2);
            com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
            if (zzideVar.zzD() || this.zzd != 0) {
                return;
            } else {
                zza = zzideVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzJ(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zziefVar.zzi(zzideVar.zzo());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zziefVar.zzi(zzideVar2.zzo());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzideVar3.zzo()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzideVar4.zzo()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzK(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zziefVar.zzi(zzideVar.zzp());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zziefVar.zzi(zzideVar2.zzp());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzideVar3.zzp()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzideVar4.zzp()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzL(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzo = zzideVar.zzo();
                zzW(zzo);
                int zzE = zzideVar.zzE() + zzo;
                do {
                    zziefVar.zzi(zzideVar.zzq());
                } while (zzideVar.zzE() < zzE);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zziefVar.zzi(zzideVar2.zzq());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzo2 = zzideVar3.zzo();
                zzW(zzo2);
                int zzE2 = zzideVar3.zzE() + zzo2;
                do {
                    list.add(java.lang.Integer.valueOf(zzideVar3.zzq()));
                } while (zzideVar3.zzE() < zzE2);
                return;
            }
            if (i3 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzideVar4.zzq()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzM(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzo = zzideVar.zzo();
                zzX(zzo);
                int zzE = zzideVar.zzE() + zzo;
                do {
                    zzifdVar.zzd(zzideVar.zzr());
                } while (zzideVar.zzE() < zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzifdVar.zzd(zzideVar2.zzr());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzo2 = zzideVar3.zzo();
                zzX(zzo2);
                int zzE2 = zzideVar3.zzE() + zzo2;
                do {
                    list.add(java.lang.Long.valueOf(zzideVar3.zzr()));
                } while (zzideVar3.zzE() < zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzideVar4.zzr()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzN(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zziefVar.zzi(zzideVar.zzs());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zziefVar.zzi(zzideVar2.zzs());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Integer.valueOf(zzideVar3.zzs()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Integer.valueOf(zzideVar4.zzs()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzO(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zzifdVar.zzd(zzideVar.zzt());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzifdVar.zzd(zzideVar2.zzt());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Long.valueOf(zzideVar3.zzt()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzideVar4.zzt()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzigc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzP(java.util.Map map, com.google.android.gms.internal.ads.zzifh zzifhVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzQ(2);
        com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
        int zzB = zzideVar.zzB(zzideVar.zzo());
        java.lang.Object obj = zzifhVar.zzd;
        java.lang.Object obj2 = zzifhVar.zzb;
        java.lang.Object obj3 = obj;
        while (true) {
            try {
                int zzb = zzb();
                if (zzb == Integer.MAX_VALUE || zzideVar.zzD()) {
                    break;
                }
                if (zzb == 1) {
                    obj2 = zzU(zzifhVar.zza, null, null);
                } else if (zzb != 2) {
                    try {
                        if (!zzd()) {
                            throw new com.google.android.gms.internal.ads.zziet("Unable to parse map entry.");
                        }
                    } catch (com.google.android.gms.internal.ads.zzies e) {
                        if (!zzd()) {
                            throw new com.google.android.gms.internal.ads.zziet("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    obj3 = zzU(zzifhVar.zzc, obj.getClass(), zzidoVar);
                }
            } finally {
                this.zza.zzC(zzB);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigc
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

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
        if (zzideVar.zzD() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzideVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final double zze() throws java.io.IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final float zzf() throws java.io.IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final long zzg() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final long zzh() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzi() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final long zzj() throws java.io.IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzk() throws java.io.IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final boolean zzl() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final java.lang.String zzm() throws java.io.IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final java.lang.String zzn() throws java.io.IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzo(java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzQ(2);
        zzR(obj, zzighVar, zzidoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzp(java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzQ(3);
        zzT(obj, zzighVar, zzidoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final com.google.android.gms.internal.ads.zzida zzq() throws java.io.IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzr() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzs() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzt() throws java.io.IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final long zzu() throws java.io.IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final int zzv() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final long zzw() throws java.io.IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzx(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzidl) {
            com.google.android.gms.internal.ads.zzidl zzidlVar = (com.google.android.gms.internal.ads.zzidl) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzo = zzideVar.zzo();
                zzX(zzo);
                int zzE = zzideVar.zzE() + zzo;
                do {
                    zzidlVar.zzg(zzideVar.zzd());
                } while (zzideVar.zzE() < zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzidlVar.zzg(zzideVar2.zzd());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzo2 = zzideVar3.zzo();
                zzX(zzo2);
                int zzE2 = zzideVar3.zzE() + zzo2;
                do {
                    list.add(java.lang.Double.valueOf(zzideVar3.zzd()));
                } while (zzideVar3.zzE() < zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Double.valueOf(zzideVar4.zzd()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzy(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzidv) {
            com.google.android.gms.internal.ads.zzidv zzidvVar = (com.google.android.gms.internal.ads.zzidv) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzo = zzideVar.zzo();
                zzW(zzo);
                int zzE = zzideVar.zzE() + zzo;
                do {
                    zzidvVar.zzg(zzideVar.zze());
                } while (zzideVar.zzE() < zzE);
                return;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzidvVar.zzg(zzideVar2.zze());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzo2 = zzideVar3.zzo();
                zzW(zzo2);
                int zzE2 = zzideVar3.zzE() + zzo2;
                do {
                    list.add(java.lang.Float.valueOf(zzideVar3.zze()));
                } while (zzideVar3.zzE() < zzE2);
                return;
            }
            if (i3 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Float.valueOf(zzideVar4.zze()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzz(java.util.List list) throws java.io.IOException {
        int zza;
        int i;
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
                int zzE = zzideVar.zzE() + zzideVar.zzo();
                do {
                    zzifdVar.zzd(zzideVar.zzf());
                } while (zzideVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar2 = this.zza;
                zzifdVar.zzd(zzideVar2.zzf());
                if (zzideVar2.zzD()) {
                    return;
                } else {
                    i = zzideVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.zzide zzideVar3 = this.zza;
                int zzE2 = zzideVar3.zzE() + zzideVar3.zzo();
                do {
                    list.add(java.lang.Long.valueOf(zzideVar3.zzf()));
                } while (zzideVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                com.google.android.gms.internal.ads.zzide zzideVar4 = this.zza;
                list.add(java.lang.Long.valueOf(zzideVar4.zzf()));
                if (zzideVar4.zzD()) {
                    return;
                } else {
                    zza = zzideVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigc
    public final void zzI(java.util.List list) throws java.io.IOException {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            com.google.android.gms.internal.ads.zzide zzideVar = this.zza;
            if (zzideVar.zzD()) {
                return;
            } else {
                zza = zzideVar.zza();
            }
        } while (zza == this.zzb);
        this.zzd = zza;
    }
}
