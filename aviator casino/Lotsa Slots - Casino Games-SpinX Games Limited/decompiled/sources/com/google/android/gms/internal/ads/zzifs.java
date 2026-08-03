package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzifs<T> implements com.google.android.gms.internal.ads.zzigh<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.ads.zziha.zzr();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.ads.zzifp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final com.google.android.gms.internal.ads.zzigt zzm;
    private final com.google.android.gms.internal.ads.zzidp zzn;

    private zzifs(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.ads.zzifp zzifpVar, boolean z, int[] iArr2, int i3, int i4, com.google.android.gms.internal.ads.zzifv zzifvVar, com.google.android.gms.internal.ads.zzifb zzifbVar, com.google.android.gms.internal.ads.zzigt zzigtVar, com.google.android.gms.internal.ads.zzidp zzidpVar, com.google.android.gms.internal.ads.zzifk zzifkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzifpVar instanceof com.google.android.gms.internal.ads.zziee;
        boolean z2 = false;
        if (zzidpVar != null && (zzifpVar instanceof com.google.android.gms.internal.ads.zziea)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzigtVar;
        this.zzn = zzidpVar;
        this.zzg = zzifpVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zziee) {
            return ((com.google.android.gms.internal.ads.zziee) obj).zzaX();
        }
        return true;
    }

    private static void zzF(java.lang.Object obj) {
        if (zzE(obj)) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        java.lang.String.valueOf(valueOf);
        throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static int zzG(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).intValue();
    }

    private static long zzH(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).longValue();
    }

    private final boolean zzI(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzK(obj, i) == zzK(obj2, i);
    }

    private final boolean zzJ(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzK(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzK(java.lang.Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.ads.zziha.zzc(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.ads.zziha.zzk(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.ads.zziha.zzi(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.ads.zziha.zze(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.ads.zziha.zze(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.ads.zziha.zzc(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.ads.zziha.zze(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.ads.zziha.zzc(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.ads.zziha.zzg(obj, j2);
            case 8:
                java.lang.Object zzm = com.google.android.gms.internal.ads.zziha.zzm(obj, j2);
                if (zzm instanceof java.lang.String) {
                    return !((java.lang.String) zzm).isEmpty();
                }
                if (zzm instanceof com.google.android.gms.internal.ads.zzida) {
                    return !com.google.android.gms.internal.ads.zzida.zza.equals(zzm);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.ads.zziha.zzm(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.ads.zzida.zza.equals(com.google.android.gms.internal.ads.zziha.zzm(obj, j2));
            case 11:
                return com.google.android.gms.internal.ads.zziha.zzc(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.ads.zziha.zzc(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.ads.zziha.zzc(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.ads.zziha.zze(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.ads.zziha.zzc(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.ads.zziha.zze(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.ads.zziha.zzm(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final void zzL(java.lang.Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.ads.zziha.zzd(obj, j, (1 << (zzB >>> 20)) | com.google.android.gms.internal.ads.zziha.zzc(obj, j));
    }

    private final boolean zzM(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.ads.zziha.zzc(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final boolean zzN(java.lang.Object obj, java.lang.Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        return com.google.android.gms.internal.ads.zziha.zzc(obj, zzB) == com.google.android.gms.internal.ads.zziha.zzc(obj2, zzB);
    }

    private final void zzO(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.ads.zziha.zzd(obj, zzB(i2) & 1048575, i);
    }

    private final int zzP(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzQ(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static final int zzR(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzihg zzihgVar, java.lang.Class cls, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        int i3;
        com.google.android.gms.internal.ads.zzihg zzihgVar2 = com.google.android.gms.internal.ads.zzihg.DOUBLE;
        switch (zzihgVar) {
            case DOUBLE:
                i3 = i + 8;
                zzicoVar.zzc = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzicp.zze(bArr, i)));
                break;
            case FLOAT:
                i3 = i + 4;
                zzicoVar.zzc = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i)));
                break;
            case INT64:
            case UINT64:
                int zzc = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i, zzicoVar);
                zzicoVar.zzc = java.lang.Long.valueOf(zzicoVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i, zzicoVar);
                zzicoVar.zzc = java.lang.Integer.valueOf(zzicoVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                zzicoVar.zzc = java.lang.Long.valueOf(com.google.android.gms.internal.ads.zzicp.zze(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                zzicoVar.zzc = java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i));
                break;
            case BOOL:
                int zzc2 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i, zzicoVar);
                zzicoVar.zzc = java.lang.Boolean.valueOf(zzicoVar.zzb != 0);
                return zzc2;
            case STRING:
                return com.google.android.gms.internal.ads.zzicp.zzf(bArr, i, zzicoVar);
            case GROUP:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case MESSAGE:
                return com.google.android.gms.internal.ads.zzicp.zzh(com.google.android.gms.internal.ads.zzifz.zza().zzb(cls), bArr, i, i2, zzicoVar);
            case BYTES:
                return com.google.android.gms.internal.ads.zzicp.zzg(bArr, i, zzicoVar);
            case SINT32:
                int zza3 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i, zzicoVar);
                zzicoVar.zzc = java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzide.zzM(zzicoVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i, zzicoVar);
                zzicoVar.zzc = java.lang.Long.valueOf(com.google.android.gms.internal.ads.zzide.zzN(zzicoVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzS(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzihiVar.zzm(i, (java.lang.String) obj);
        } else {
            zzihiVar.zzn(i, (com.google.android.gms.internal.ads.zzida) obj);
        }
    }

    static com.google.android.gms.internal.ads.zzigu zzh(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zziee zzieeVar = (com.google.android.gms.internal.ads.zziee) obj;
        com.google.android.gms.internal.ads.zzigu zziguVar = zzieeVar.zzt;
        if (zziguVar != com.google.android.gms.internal.ads.zzigu.zza()) {
            return zziguVar;
        }
        com.google.android.gms.internal.ads.zzigu zzb2 = com.google.android.gms.internal.ads.zzigu.zzb();
        zzieeVar.zzt = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.ads.zzifs zzm(java.lang.Class cls, com.google.android.gms.internal.ads.zzifm zzifmVar, com.google.android.gms.internal.ads.zzifv zzifvVar, com.google.android.gms.internal.ads.zzifb zzifbVar, com.google.android.gms.internal.ads.zzigt zzigtVar, com.google.android.gms.internal.ads.zzidp zzidpVar, com.google.android.gms.internal.ads.zzifk zzifkVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char charAt3;
        int i8;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        int i16;
        int i17;
        int i18;
        com.google.android.gms.internal.ads.zzigb zzigbVar;
        java.lang.String str;
        int objectFieldOffset;
        java.lang.Class<?> cls2;
        int i19;
        int i20;
        java.lang.reflect.Field zzn;
        int i21;
        char charAt10;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.Object obj;
        java.lang.reflect.Field zzn2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzn3;
        int i26;
        char charAt11;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        if (!(zzifmVar instanceof com.google.android.gms.internal.ads.zzigb)) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzigb zzigbVar2 = (com.google.android.gms.internal.ads.zzigb) zzifmVar;
        java.lang.String zzd = zzigbVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (zzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i32 = charAt15 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt14 = zzd.charAt(i31);
                if (charAt14 < 55296) {
                    break;
                }
                i32 |= (charAt14 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt15 = i32 | (charAt14 << i33);
            i31 = i29;
        }
        if (charAt15 == 0) {
            iArr = zza;
            i4 = 0;
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt16 = zzd.charAt(i31);
            if (charAt16 >= 55296) {
                int i35 = charAt16 & 8191;
                int i36 = 13;
                while (true) {
                    i14 = i34 + 1;
                    charAt9 = zzd.charAt(i34);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i35 |= (charAt9 & 8191) << i36;
                    i36 += 13;
                    i34 = i14;
                }
                charAt16 = i35 | (charAt9 << i36);
                i34 = i14;
            }
            int i37 = i34 + 1;
            int charAt17 = zzd.charAt(i34);
            if (charAt17 >= 55296) {
                int i38 = charAt17 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt8 = zzd.charAt(i37);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i38 |= (charAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt17 = i38 | (charAt8 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt18 = zzd.charAt(i37);
            if (charAt18 >= 55296) {
                int i41 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt7 = zzd.charAt(i40);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i41 |= (charAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt18 = i41 | (charAt7 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int charAt19 = zzd.charAt(i40);
            if (charAt19 >= 55296) {
                int i44 = charAt19 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt6 = zzd.charAt(i43);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i44 |= (charAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt19 = i44 | (charAt6 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            charAt = zzd.charAt(i43);
            if (charAt >= 55296) {
                int i47 = charAt & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt5 = zzd.charAt(i46);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i47 |= (charAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt = i47 | (charAt5 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt2 = zzd.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt4 = zzd.charAt(i49);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i50 |= (charAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt2 = i50 | (charAt4 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            if (zzd.charAt(i49) >= 55296) {
                while (true) {
                    i8 = i52 + 1;
                    if (zzd.charAt(i52) < 55296) {
                        break;
                    }
                    i52 = i8;
                }
                i52 = i8;
            }
            int i53 = i52 + 1;
            int charAt20 = zzd.charAt(i52);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt3 = zzd.charAt(i53);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i54 |= (charAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt20 = i54 | (charAt3 << i55);
                i53 = i7;
            }
            int i56 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt20 + charAt2 + charAt16];
            i2 = charAt20;
            i3 = charAt19;
            i4 = charAt16;
            i31 = i53;
            i5 = charAt18;
            i6 = i56;
            iArr = iArr2;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zzigbVar2.zze();
        java.lang.Class<?> cls3 = zzigbVar2.zzb().getClass();
        int i57 = i2 + charAt2;
        int i58 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[i58];
        int i59 = i2;
        int i60 = i57;
        int i61 = 0;
        int i62 = 0;
        while (i31 < length) {
            int i63 = i31 + 1;
            int charAt21 = zzd.charAt(i31);
            if (charAt21 >= c) {
                int i64 = charAt21 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i28 = i65 + 1;
                    charAt13 = zzd.charAt(i65);
                    if (charAt13 < c) {
                        break;
                    }
                    i64 |= (charAt13 & 8191) << i66;
                    i66 += 13;
                    i65 = i28;
                }
                charAt21 = i64 | (charAt13 << i66);
                i15 = i28;
            } else {
                i15 = i63;
            }
            int i67 = i15 + 1;
            int charAt22 = zzd.charAt(i15);
            if (charAt22 >= c) {
                int i68 = charAt22 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    charAt12 = zzd.charAt(i69);
                    if (charAt12 < c) {
                        break;
                    }
                    i68 |= (charAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                }
                charAt22 = i68 | (charAt12 << i70);
                i16 = i27;
            } else {
                i16 = i67;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i61] = i62;
                i61++;
            }
            int i71 = charAt22 & 255;
            int i72 = length;
            int i73 = charAt22 & 2048;
            int i74 = i3;
            if (i71 >= 51) {
                int i75 = i16 + 1;
                int charAt23 = zzd.charAt(i16);
                if (charAt23 >= 55296) {
                    int i76 = charAt23 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i26 = i77 + 1;
                        charAt11 = zzd.charAt(i77);
                        i17 = i5;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i76 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i77 = i26;
                        i5 = i17;
                    }
                    charAt23 = i76 | (charAt11 << i78);
                    i24 = i26;
                } else {
                    i17 = i5;
                    i24 = i75;
                }
                int i79 = i71 - 51;
                int i80 = i24;
                if (i79 == 9 || i79 == 17) {
                    i25 = i6 + 1;
                    int i81 = i62 / 3;
                    objArr[i81 + i81 + 1] = zze[i6];
                } else {
                    if (i79 == 12) {
                        if (zzigbVar2.zzc() == 1 || i73 != 0) {
                            i25 = i6 + 1;
                            int i82 = i62 / 3;
                            objArr[i82 + i82 + 1] = zze[i6];
                        } else {
                            i73 = 0;
                        }
                    }
                    int i83 = charAt23 + charAt23;
                    obj = zze[i83];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzn2 = zzn(cls3, (java.lang.String) obj);
                        zze[i83] = zzn2;
                        iArr[i60] = i62;
                        i60++;
                    } else {
                        zzn2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn2);
                    int i84 = i83 + 1;
                    obj2 = zze[i84];
                    int i85 = i73;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzn3 = zzn(cls3, (java.lang.String) obj2);
                        zze[i84] = zzn3;
                    } else {
                        zzn3 = (java.lang.reflect.Field) obj2;
                    }
                    objectFieldOffset = objectFieldOffset2;
                    i73 = i85;
                    zzigbVar = zzigbVar2;
                    cls2 = cls3;
                    i20 = (int) unsafe.objectFieldOffset(zzn3);
                    i16 = i80;
                    i18 = charAt21;
                    str = zzd;
                    i19 = 0;
                }
                i6 = i25;
                int i832 = charAt23 + charAt23;
                obj = zze[i832];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzn2);
                int i842 = i832 + 1;
                obj2 = zze[i842];
                int i852 = i73;
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                objectFieldOffset = objectFieldOffset22;
                i73 = i852;
                zzigbVar = zzigbVar2;
                cls2 = cls3;
                i20 = (int) unsafe.objectFieldOffset(zzn3);
                i16 = i80;
                i18 = charAt21;
                str = zzd;
                i19 = 0;
            } else {
                i17 = i5;
                int i86 = i6 + 1;
                java.lang.reflect.Field zzn4 = zzn(cls3, (java.lang.String) zze[i6]);
                i18 = charAt21;
                if (i71 == 9 || i71 == 17) {
                    zzigbVar = zzigbVar2;
                    int i87 = i62 / 3;
                    objArr[i87 + i87 + 1] = zzn4.getType();
                } else {
                    if (i71 == 27) {
                        zzigbVar = zzigbVar2;
                        i22 = 1;
                        i23 = i6 + 2;
                    } else if (i71 == 49) {
                        i23 = i6 + 2;
                        zzigbVar = zzigbVar2;
                        i22 = 1;
                    } else {
                        if (i71 == 12 || i71 == 30 || i71 == 44) {
                            zzigbVar = zzigbVar2;
                            if (zzigbVar2.zzc() == 1 || i73 != 0) {
                                i23 = i6 + 2;
                                int i88 = i62 / 3;
                                objArr[i88 + i88 + 1] = zze[i86];
                                str = zzd;
                                i86 = i23;
                            } else {
                                str = zzd;
                                i73 = 0;
                            }
                        } else if (i71 == 50) {
                            int i89 = i6 + 2;
                            int i90 = i59 + 1;
                            iArr[i59] = i62;
                            int i91 = i62 / 3;
                            int i92 = i91 + i91;
                            objArr[i92] = zze[i86];
                            if (i73 != 0) {
                                i86 = i6 + 3;
                                objArr[i92 + 1] = zze[i89];
                                str = zzd;
                                i59 = i90;
                                zzigbVar = zzigbVar2;
                            } else {
                                i86 = i89;
                                i59 = i90;
                                i73 = 0;
                                zzigbVar = zzigbVar2;
                            }
                        } else {
                            zzigbVar = zzigbVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                        if ((charAt22 & 4096) != 0 || i71 > 17) {
                            cls2 = cls3;
                            i6 = i86;
                            i19 = 0;
                            i20 = 1048575;
                        } else {
                            int i93 = i16 + 1;
                            int charAt24 = str.charAt(i16);
                            if (charAt24 >= 55296) {
                                int i94 = charAt24 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i21 = i93 + 1;
                                    charAt10 = str.charAt(i93);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i94 |= (charAt10 & 8191) << i95;
                                    i95 += 13;
                                    i93 = i21;
                                }
                                charAt24 = i94 | (charAt10 << i95);
                                i93 = i21;
                            }
                            int i96 = i4 + i4 + (charAt24 / 32);
                            java.lang.Object obj3 = zze[i96];
                            int i97 = i93;
                            if (obj3 instanceof java.lang.reflect.Field) {
                                zzn = (java.lang.reflect.Field) obj3;
                            } else {
                                zzn = zzn(cls3, (java.lang.String) obj3);
                                zze[i96] = zzn;
                            }
                            cls2 = cls3;
                            i19 = charAt24 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzn);
                            i6 = i86;
                            i16 = i97;
                            i73 = i73;
                        }
                    }
                    int i98 = i62 / 3;
                    objArr[i98 + i98 + i22] = zze[i86];
                    str = zzd;
                    i86 = i23;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                    if ((charAt22 & 4096) != 0) {
                    }
                    cls2 = cls3;
                    i6 = i86;
                    i19 = 0;
                    i20 = 1048575;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                if ((charAt22 & 4096) != 0) {
                }
                cls2 = cls3;
                i6 = i86;
                i19 = 0;
                i20 = 1048575;
            }
            int i99 = i62 + 1;
            iArr3[i62] = i18;
            int i100 = i62 + 2;
            java.lang.Class<?> cls4 = cls2;
            iArr3[i99] = ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i73 != 0 ? Integer.MIN_VALUE : 0) | (i71 << 20) | objectFieldOffset;
            i62 += 3;
            iArr3[i100] = (i19 << 20) | i20;
            zzd = str;
            i31 = i16;
            length = i72;
            i3 = i74;
            zzigbVar2 = zzigbVar;
            cls3 = cls4;
            i5 = i17;
            c = 55296;
        }
        return new com.google.android.gms.internal.ads.zzifs(iArr3, objArr, i5, i3, zzigbVar2.zzb(), false, iArr, i2, i57, zzifvVar, zzifbVar, zzigtVar, zzidpVar, zzifkVar);
    }

    private static java.lang.reflect.Field zzn(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String arrays = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 11 + java.lang.String.valueOf(name).length() + 29 + java.lang.String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    private final void zzo(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzK(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzA;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                java.lang.String obj3 = obj2.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.google.android.gms.internal.ads.zzigh zzq = zzq(i);
            if (!zzK(obj, i)) {
                if (zzE(object)) {
                    java.lang.Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                java.lang.Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(java.lang.Object obj, java.lang.Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzA;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                java.lang.String obj3 = obj2.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.google.android.gms.internal.ads.zzigh zzq = zzq(i);
            if (!zzM(obj, i2, i)) {
                if (zzE(object)) {
                    java.lang.Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                java.lang.Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final com.google.android.gms.internal.ads.zzigh zzq(int i) {
        java.lang.Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.ads.zzigh zzighVar = (com.google.android.gms.internal.ads.zzigh) objArr[i3];
        if (zzighVar != null) {
            return zzighVar;
        }
        com.google.android.gms.internal.ads.zzigh zzb2 = com.google.android.gms.internal.ads.zzifz.zza().zzb((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final com.google.android.gms.internal.ads.zziek zzs(int i) {
        int i2 = i / 3;
        return (com.google.android.gms.internal.ads.zziek) this.zzd[i2 + i2 + 1];
    }

    private final java.lang.Object zzt(java.lang.Object obj, int i) {
        com.google.android.gms.internal.ads.zzigh zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzK(obj, i)) {
            return zzq.zza();
        }
        java.lang.Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        java.lang.Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(java.lang.Object obj, int i, java.lang.Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzL(obj, i);
    }

    private final java.lang.Object zzv(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.ads.zzigh zzq = zzq(i2);
        if (!zzM(obj, i, i2)) {
            return zzq.zza();
        }
        java.lang.Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        java.lang.Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(obj, i, i2);
    }

    private final java.lang.Object zzx(java.lang.Object obj, int i, java.lang.Object obj2, com.google.android.gms.internal.ads.zzigt zzigtVar, java.lang.Object obj3) {
        com.google.android.gms.internal.ads.zziek zzs;
        int i2 = this.zzc[i];
        java.lang.Object zzm = com.google.android.gms.internal.ads.zziha.zzm(obj, zzA(i) & 1048575);
        if (zzm == null || (zzs = zzs(i)) == null) {
            return obj2;
        }
        com.google.android.gms.internal.ads.zzifh zze = ((com.google.android.gms.internal.ads.zzifi) zzr(i)).zze();
        java.util.Iterator it = ((com.google.android.gms.internal.ads.zzifj) zzm).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!zzs.zza(((java.lang.Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzigtVar.zzh(obj3);
                }
                int zzc = com.google.android.gms.internal.ads.zzifi.zzc(zze, entry.getKey(), entry.getValue());
                com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
                byte[] bArr = new byte[zzc];
                int i3 = com.google.android.gms.internal.ads.zzidj.zzb;
                com.google.android.gms.internal.ads.zzidg zzidgVar = new com.google.android.gms.internal.ads.zzidg(bArr, 0, zzc);
                try {
                    com.google.android.gms.internal.ads.zzifi.zzb(zzidgVar, zze, entry.getKey(), entry.getValue());
                    zzigtVar.zzd(obj2, i2, com.google.android.gms.internal.ads.zzicw.zza(zzidgVar, bArr));
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzigh zzighVar) {
        return zzighVar.zzl(com.google.android.gms.internal.ads.zziha.zzm(obj, i & 1048575));
    }

    private final void zzz(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzigc zzigcVar) throws java.io.IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            com.google.android.gms.internal.ads.zziha.zzn(obj, j, zzigcVar.zzn());
        } else if (this.zzi) {
            com.google.android.gms.internal.ads.zziha.zzn(obj, j, zzigcVar.zzm());
        } else {
            com.google.android.gms.internal.ads.zziha.zzn(obj, j, zzigcVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final java.lang.Object zza() {
        return ((com.google.android.gms.internal.ads.zziee) this.zzg).zzbg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c2, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.ads.zzigh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        boolean zzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                switch (zzC) {
                    case 0:
                        if (zzI(obj, obj2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zziha.zzk(obj, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zziha.zzk(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 1:
                        if (zzI(obj, obj2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zziha.zzi(obj, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zziha.zzi(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 2:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zze(obj, j) == com.google.android.gms.internal.ads.zziha.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 3:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zze(obj, j) == com.google.android.gms.internal.ads.zziha.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 4:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzc(obj, j) == com.google.android.gms.internal.ads.zziha.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 5:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zze(obj, j) == com.google.android.gms.internal.ads.zziha.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 6:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzc(obj, j) == com.google.android.gms.internal.ads.zziha.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 7:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzg(obj, j) == com.google.android.gms.internal.ads.zziha.zzg(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 8:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 9:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 10:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 11:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzc(obj, j) == com.google.android.gms.internal.ads.zziha.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 12:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzc(obj, j) == com.google.android.gms.internal.ads.zziha.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 13:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzc(obj, j) == com.google.android.gms.internal.ads.zziha.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 14:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zze(obj, j) == com.google.android.gms.internal.ads.zziha.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 15:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zzc(obj, j) == com.google.android.gms.internal.ads.zziha.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 16:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zziha.zze(obj, j) == com.google.android.gms.internal.ads.zziha.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 17:
                        if (zzI(obj, obj2, i) && com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zzG = com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j));
                        break;
                    case 50:
                        zzG = com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        if (zzN(obj, obj2, i) && com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                }
                if (!zzG) {
                    return false;
                }
            }
        }
        int i2 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i2 >= iArr.length) {
                if (!((com.google.android.gms.internal.ads.zziee) obj).zzt.equals(((com.google.android.gms.internal.ads.zziee) obj2).zzt)) {
                    return false;
                }
                if (this.zzh) {
                    return ((com.google.android.gms.internal.ads.zziea) obj).zza.equals(((com.google.android.gms.internal.ads.zziea) obj2).zza);
                }
                return true;
            }
            int i3 = iArr[i2];
            if (!zzN(obj, obj2, i3)) {
                return false;
            }
            if (!zzM(obj, 0, i3)) {
                long zzA2 = zzA(i3) & 1048575;
                if (!com.google.android.gms.internal.ads.zzigi.zzG(com.google.android.gms.internal.ads.zziha.zzm(obj, zzA2), com.google.android.gms.internal.ads.zziha.zzm(obj2, zzA2))) {
                    return false;
                }
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zzc(java.lang.Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzA = zzA(i5);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                int i6 = 37;
                switch (zzC) {
                    case 0:
                        i = i4 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zziha.zzk(obj, j));
                        byte[] bArr = com.google.android.gms.internal.ads.zzier.zza;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i2 = i4 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zziha.zzi(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i4 * 53;
                        doubleToLongBits = com.google.android.gms.internal.ads.zziha.zze(obj, j);
                        byte[] bArr2 = com.google.android.gms.internal.ads.zzier.zza;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = i4 * 53;
                        doubleToLongBits = com.google.android.gms.internal.ads.zziha.zze(obj, j);
                        byte[] bArr3 = com.google.android.gms.internal.ads.zzier.zza;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzc(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i4 * 53;
                        doubleToLongBits = com.google.android.gms.internal.ads.zziha.zze(obj, j);
                        byte[] bArr4 = com.google.android.gms.internal.ads.zzier.zza;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzc(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zzier.zza(com.google.android.gms.internal.ads.zziha.zzg(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    case 8:
                        i2 = i4 * 53;
                        floatToIntBits = ((java.lang.String) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i3 = i4 * 53;
                        java.lang.Object zzm = com.google.android.gms.internal.ads.zziha.zzm(obj, j);
                        if (zzm != null) {
                            i6 = zzm.hashCode();
                        }
                        i4 = i3 + i6;
                        break;
                    case 10:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzm(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzc(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzc(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzc(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i4 * 53;
                        doubleToLongBits = com.google.android.gms.internal.ads.zziha.zze(obj, j);
                        byte[] bArr5 = com.google.android.gms.internal.ads.zzier.zza;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzc(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i4 * 53;
                        doubleToLongBits = com.google.android.gms.internal.ads.zziha.zze(obj, j);
                        byte[] bArr6 = com.google.android.gms.internal.ads.zzier.zza;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i3 = i4 * 53;
                        java.lang.Object zzm2 = com.google.android.gms.internal.ads.zziha.zzm(obj, j);
                        if (zzm2 != null) {
                            i6 = zzm2.hashCode();
                        }
                        i4 = i3 + i6;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzm(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i4 * 53;
                        floatToIntBits = com.google.android.gms.internal.ads.zziha.zzm(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i7 >= iArr.length) {
                int hashCode = (i4 * 53) + ((com.google.android.gms.internal.ads.zziee) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((com.google.android.gms.internal.ads.zziea) obj).zza.zza.hashCode() : hashCode;
            }
            if (!zzM(obj, 0, iArr[i7])) {
                i4 = (i4 * 53) + com.google.android.gms.internal.ads.zziha.zzm(obj, zzA(r3) & 1048575).hashCode();
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzd(java.lang.Object obj, java.lang.Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                com.google.android.gms.internal.ads.zzigi.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    com.google.android.gms.internal.ads.zzigi.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzl(obj, j, com.google.android.gms.internal.ads.zziha.zzk(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 1:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzj(obj, j, com.google.android.gms.internal.ads.zziha.zzi(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 2:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzf(obj, j, com.google.android.gms.internal.ads.zziha.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 3:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzf(obj, j, com.google.android.gms.internal.ads.zziha.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 4:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzd(obj, j, com.google.android.gms.internal.ads.zziha.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 5:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzf(obj, j, com.google.android.gms.internal.ads.zziha.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 6:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzd(obj, j, com.google.android.gms.internal.ads.zziha.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 7:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzh(obj, j, com.google.android.gms.internal.ads.zziha.zzg(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 8:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzn(obj, j, com.google.android.gms.internal.ads.zziha.zzm(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzn(obj, j, com.google.android.gms.internal.ads.zziha.zzm(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 11:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzd(obj, j, com.google.android.gms.internal.ads.zziha.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 12:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzd(obj, j, com.google.android.gms.internal.ads.zziha.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 13:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzd(obj, j, com.google.android.gms.internal.ads.zziha.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 14:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzf(obj, j, com.google.android.gms.internal.ads.zziha.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 15:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzd(obj, j, com.google.android.gms.internal.ads.zziha.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 16:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzf(obj, j, com.google.android.gms.internal.ads.zziha.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    com.google.android.gms.internal.ads.zzieq zzieqVar = (com.google.android.gms.internal.ads.zzieq) com.google.android.gms.internal.ads.zziha.zzm(obj, j);
                    com.google.android.gms.internal.ads.zzieq zzieqVar2 = (com.google.android.gms.internal.ads.zzieq) com.google.android.gms.internal.ads.zziha.zzm(obj2, j);
                    int size = zzieqVar.size();
                    int size2 = zzieqVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzieqVar.zza()) {
                            zzieqVar = zzieqVar.zzh(size2 + size);
                        }
                        zzieqVar.addAll(zzieqVar2);
                    }
                    if (size > 0) {
                        zzieqVar2 = zzieqVar;
                    }
                    com.google.android.gms.internal.ads.zziha.zzn(obj, j, zzieqVar2);
                    break;
                case 50:
                    int i4 = com.google.android.gms.internal.ads.zzigi.zza;
                    com.google.android.gms.internal.ads.zziha.zzn(obj, j, com.google.android.gms.internal.ads.zzifk.zzb(com.google.android.gms.internal.ads.zziha.zzm(obj, j), com.google.android.gms.internal.ads.zziha.zzm(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzn(obj, j, com.google.android.gms.internal.ads.zziha.zzm(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zziha.zzn(obj, j, com.google.android.gms.internal.ads.zziha.zzm(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zze(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        int zzF;
        int zzF2;
        int zzF3;
        int zzG;
        int zzF4;
        int zzF5;
        int zzc;
        int zzF6;
        int zzD;
        int zzs;
        int size;
        int zzF7;
        int zzc2;
        int zzF8;
        int zzc3;
        int zzF9;
        int zzF10;
        int zzaT;
        int zzF11;
        int zzF12;
        int zzB;
        int zzF13;
        int zzF14;
        int i4;
        sun.misc.Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i8 >= iArr.length) {
                int zzi = i9 + ((com.google.android.gms.internal.ads.zziee) obj).zzt.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                com.google.android.gms.internal.ads.zzign zzignVar = ((com.google.android.gms.internal.ads.zziea) obj).zza.zza;
                int zzc4 = zzignVar.zzc();
                int i10 = 0;
                for (int i11 = 0; i11 < zzc4; i11++) {
                    java.util.Map.Entry zzd = zzignVar.zzd(i11);
                    i10 += com.google.android.gms.internal.ads.zzidt.zzj((com.google.android.gms.internal.ads.zzids) ((com.google.android.gms.internal.ads.zzigk) zzd).zza(), zzd.getValue());
                }
                for (java.util.Map.Entry entry : zzignVar.zze()) {
                    i10 += com.google.android.gms.internal.ads.zzidt.zzj((com.google.android.gms.internal.ads.zzids) entry.getKey(), entry.getValue());
                }
                return zzi + i10;
            }
            int zzA = zzA(i8);
            int zzC = zzC(zzA);
            int i12 = iArr[i8];
            int i13 = iArr[i8 + 2];
            int i14 = i13 & i5;
            if (zzC <= 17) {
                if (i14 != i6) {
                    i7 = i14 == i5 ? 0 : unsafe.getInt(obj, i14);
                    i6 = i14;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i13 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i15 = zzA & i5;
            if (zzC >= com.google.android.gms.internal.ads.zzidu.DOUBLE_LIST_PACKED.zza()) {
                com.google.android.gms.internal.ads.zzidu.SINT64_LIST_PACKED.zza();
            }
            long j = i15;
            switch (zzC) {
                case 0:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF + 8;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF2 + 4;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(j2);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(j3);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(j4);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF + 8;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF2 + 4;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF4 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF4 + 1;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i16 = i12 << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.gms.internal.ads.zzida) {
                            zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(i16);
                            zzc = ((com.google.android.gms.internal.ads.zzida) object).zzb();
                            zzF6 = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                        } else {
                            zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(i16);
                            zzc = com.google.android.gms.internal.ads.zzihf.zzc((java.lang.String) object);
                            zzF6 = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                        }
                        zzD = zzF5 + zzF6 + zzc;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzD = com.google.android.gms.internal.ads.zzigi.zzD(i12, unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        com.google.android.gms.internal.ads.zzida zzidaVar = (com.google.android.gms.internal.ads.zzida) unsafe.getObject(obj, j);
                        zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzc = zzidaVar.zzb();
                        zzF6 = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                        zzD = zzF5 + zzF6 + zzc;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzF(i17);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(j5);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF2 + 4;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzF = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF + 8;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i18 = unsafe.getInt(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzF((i18 >> 31) ^ (i18 + i18));
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG((j6 >> 63) ^ (j6 + j6));
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzD = com.google.android.gms.internal.ads.zzigi.zzE(i12, (com.google.android.gms.internal.ads.zzifp) unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzD = com.google.android.gms.internal.ads.zzigi.zzC(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzD;
                    break;
                case 19:
                    zzD = com.google.android.gms.internal.ads.zzigi.zzA(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzD;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    int i19 = com.google.android.gms.internal.ads.zzigi.zza;
                    if (list.size() != 0) {
                        zzs = com.google.android.gms.internal.ads.zzigi.zzs(list) + (list.size() * com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3));
                        i9 += zzs;
                        break;
                    }
                    zzs = 0;
                    i9 += zzs;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    int i20 = com.google.android.gms.internal.ads.zzigi.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzF3 = com.google.android.gms.internal.ads.zzigi.zzt(list2);
                        zzF7 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = size * zzF7;
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    int i21 = com.google.android.gms.internal.ads.zzigi.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzF3 = com.google.android.gms.internal.ads.zzigi.zzw(list3);
                        zzF7 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = size * zzF7;
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 23:
                    zzD = com.google.android.gms.internal.ads.zzigi.zzC(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzD;
                    break;
                case 24:
                    zzD = com.google.android.gms.internal.ads.zzigi.zzA(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzD;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    int i22 = com.google.android.gms.internal.ads.zzigi.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzD = size2 * (com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3) + 1);
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 26:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    int i23 = com.google.android.gms.internal.ads.zzigi.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzs = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3) * size3;
                        if (list5 instanceof com.google.android.gms.internal.ads.zzifa) {
                            com.google.android.gms.internal.ads.zzifa zzifaVar = (com.google.android.gms.internal.ads.zzifa) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                java.lang.Object zzc5 = zzifaVar.zzc();
                                if (zzc5 instanceof com.google.android.gms.internal.ads.zzida) {
                                    zzc3 = ((com.google.android.gms.internal.ads.zzida) zzc5).zzb();
                                    zzF9 = com.google.android.gms.internal.ads.zzidj.zzF(zzc3);
                                } else {
                                    zzc3 = com.google.android.gms.internal.ads.zzihf.zzc((java.lang.String) zzc5);
                                    zzF9 = com.google.android.gms.internal.ads.zzidj.zzF(zzc3);
                                }
                                zzs += zzF9 + zzc3;
                            }
                        } else {
                            for (int i25 = 0; i25 < size3; i25++) {
                                java.lang.Object obj2 = list5.get(i25);
                                if (obj2 instanceof com.google.android.gms.internal.ads.zzida) {
                                    zzc2 = ((com.google.android.gms.internal.ads.zzida) obj2).zzb();
                                    zzF8 = com.google.android.gms.internal.ads.zzidj.zzF(zzc2);
                                } else {
                                    zzc2 = com.google.android.gms.internal.ads.zzihf.zzc((java.lang.String) obj2);
                                    zzF8 = com.google.android.gms.internal.ads.zzidj.zzF(zzc2);
                                }
                                zzs += zzF8 + zzc2;
                            }
                        }
                        i9 += zzs;
                        break;
                    }
                    zzs = 0;
                    i9 += zzs;
                case 27:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.ads.zzigh zzq = zzq(i8);
                    int i26 = com.google.android.gms.internal.ads.zzigi.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzF10 = 0;
                    } else {
                        zzF10 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            java.lang.Object obj3 = list6.get(i27);
                            if (obj3 instanceof com.google.android.gms.internal.ads.zziez) {
                                zzaT = ((com.google.android.gms.internal.ads.zziez) obj3).zzb();
                                zzF11 = com.google.android.gms.internal.ads.zzidj.zzF(zzaT);
                            } else {
                                zzaT = ((com.google.android.gms.internal.ads.zzicj) obj3).zzaT(zzq);
                                zzF11 = com.google.android.gms.internal.ads.zzidj.zzF(zzaT);
                            }
                            zzF10 += zzF11 + zzaT;
                        }
                    }
                    i9 += zzF10;
                    break;
                case 28:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    int i28 = com.google.android.gms.internal.ads.zzigi.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzF12 = 0;
                    } else {
                        zzF12 = size5 * com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int zzb2 = ((com.google.android.gms.internal.ads.zzida) list7.get(i29)).zzb();
                            zzF12 += com.google.android.gms.internal.ads.zzidj.zzF(zzb2) + zzb2;
                        }
                    }
                    i9 += zzF12;
                    break;
                case 29:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    int i30 = com.google.android.gms.internal.ads.zzigi.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzF3 = com.google.android.gms.internal.ads.zzigi.zzx(list8);
                        zzF7 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = size * zzF7;
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 30:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    int i31 = com.google.android.gms.internal.ads.zzigi.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzF3 = com.google.android.gms.internal.ads.zzigi.zzv(list9);
                        zzF7 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = size * zzF7;
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 31:
                    zzD = com.google.android.gms.internal.ads.zzigi.zzA(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzD;
                    break;
                case 32:
                    zzD = com.google.android.gms.internal.ads.zzigi.zzC(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzD;
                    break;
                case 33:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj, j);
                    int i32 = com.google.android.gms.internal.ads.zzigi.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzF3 = com.google.android.gms.internal.ads.zzigi.zzy(list10);
                        zzF7 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = size * zzF7;
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 34:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj, j);
                    int i33 = com.google.android.gms.internal.ads.zzigi.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzF3 = com.google.android.gms.internal.ads.zzigi.zzu(list11);
                        zzF7 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = size * zzF7;
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    }
                    zzD = 0;
                    i9 += zzD;
                case 35:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzB((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzz((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzs((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzt((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzw((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzB((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzz((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj, j);
                    int i34 = com.google.android.gms.internal.ads.zzigi.zza;
                    zzB = list12.size();
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzz((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzB((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzy((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzB = com.google.android.gms.internal.ads.zzigi.zzu((java.util.List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF13 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzF14 = com.google.android.gms.internal.ads.zzidj.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i9 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.ads.zzigh zzq2 = zzq(i8);
                    int i35 = com.google.android.gms.internal.ads.zzigi.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i36 = 0; i36 < size6; i36++) {
                            i4 += com.google.android.gms.internal.ads.zzigi.zzE(i12, (com.google.android.gms.internal.ads.zzifp) list13.get(i36), zzq2);
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    com.google.android.gms.internal.ads.zzifj zzifjVar = (com.google.android.gms.internal.ads.zzifj) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.ads.zzifi zzifiVar = (com.google.android.gms.internal.ads.zzifi) zzr(i8);
                    if (!zzifjVar.isEmpty()) {
                        zzs = 0;
                        for (java.util.Map.Entry entry2 : zzifjVar.entrySet()) {
                            zzs += zzifiVar.zzd(i12, entry2.getKey(), entry2.getValue());
                        }
                        i9 += zzs;
                        break;
                    }
                    zzs = 0;
                    i9 += zzs;
                case 51:
                    if (zzM(obj, i12, i8)) {
                        zzF = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF + 8;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i12, i8)) {
                        zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF2 + 4;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i12, i8)) {
                        long zzH = zzH(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(zzH);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i12, i8)) {
                        long zzH2 = zzH(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(zzH2);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i12, i8)) {
                        long zzG2 = zzG(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(zzG2);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i12, i8)) {
                        zzF = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF + 8;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i12, i8)) {
                        zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF2 + 4;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i12, i8)) {
                        zzF4 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF4 + 1;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i12, i8)) {
                        int i37 = i12 << 3;
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.gms.internal.ads.zzida) {
                            zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(i37);
                            zzc = ((com.google.android.gms.internal.ads.zzida) object2).zzb();
                            zzF6 = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                        } else {
                            zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(i37);
                            zzc = com.google.android.gms.internal.ads.zzihf.zzc((java.lang.String) object2);
                            zzF6 = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                        }
                        zzD = zzF5 + zzF6 + zzc;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i12, i8)) {
                        zzD = com.google.android.gms.internal.ads.zzigi.zzD(i12, unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i12, i8)) {
                        com.google.android.gms.internal.ads.zzida zzidaVar2 = (com.google.android.gms.internal.ads.zzida) unsafe.getObject(obj, j);
                        zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzc = zzidaVar2.zzb();
                        zzF6 = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                        zzD = zzF5 + zzF6 + zzc;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i12, i8)) {
                        int zzG3 = zzG(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzF(zzG3);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i12, i8)) {
                        long zzG4 = zzG(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG(zzG4);
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i12, i8)) {
                        zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF2 + 4;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i12, i8)) {
                        zzF = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzD = zzF + 8;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i12, i8)) {
                        int zzG5 = zzG(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzF((zzG5 >> 31) ^ (zzG5 + zzG5));
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i12, i8)) {
                        long zzH3 = zzH(obj, j);
                        zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i12 << 3);
                        zzG = com.google.android.gms.internal.ads.zzidj.zzG((zzH3 >> 63) ^ (zzH3 + zzH3));
                        zzD = zzF3 + zzG;
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i12, i8)) {
                        zzD = com.google.android.gms.internal.ads.zzigi.zzE(i12, (com.google.android.gms.internal.ads.zzifp) unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzD;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = i;
            i7 = i2;
            z = false;
            i5 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzigh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(java.lang.Object obj, com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        java.util.Iterator it;
        int[] iArr;
        int i;
        int i2;
        java.util.Map.Entry entry2;
        int i3;
        int[] iArr2;
        java.util.Map.Entry entry3;
        java.util.Map.Entry entry4;
        if (this.zzh) {
            com.google.android.gms.internal.ads.zzidt zzidtVar = ((com.google.android.gms.internal.ads.zziea) obj).zza;
            if (!zzidtVar.zza.isEmpty()) {
                java.util.Iterator zzc = zzidtVar.zzc();
                entry = (java.util.Map.Entry) zzc.next();
                it = zzc;
                iArr = this.zzc;
                sun.misc.Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                int i6 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzA = zzA(i);
                    int zzC = zzC(zzA);
                    int i7 = iArr[i];
                    if (zzC <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            if (i9 == i4) {
                                entry4 = entry;
                                i6 = 0;
                            } else {
                                entry4 = entry;
                                i6 = unsafe.getInt(obj, i9);
                            }
                            i5 = i9;
                        } else {
                            entry4 = entry;
                        }
                        int i10 = 1 << (i8 >>> 20);
                        i2 = i5;
                        i3 = i10;
                        entry2 = entry4;
                    } else {
                        i2 = i5;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i11 = i6;
                    while (entry2 != null) {
                        com.google.android.gms.internal.ads.zzidp zzidpVar = this.zzn;
                        if (((com.google.android.gms.internal.ads.zzieb) entry2.getKey()).zza <= i7) {
                            zzidpVar.zzb(zzihiVar, entry2);
                            entry2 = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                        } else {
                            long j = zzA & i4;
                            switch (zzC) {
                                case 0:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (!zzJ(obj, i, i2, i11, i3)) {
                                        break;
                                    } else {
                                        zzihiVar.zzf(i7, com.google.android.gms.internal.ads.zziha.zzk(obj, j));
                                        continue;
                                        continue;
                                    }
                                case 1:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zze(i7, com.google.android.gms.internal.ads.zziha.zzi(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 2:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzc(i7, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 3:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzh(i7, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 4:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzi(i7, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 5:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzj(i7, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 6:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzk(i7, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 7:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzl(i7, com.google.android.gms.internal.ads.zziha.zzg(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 8:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzS(i7, unsafe.getObject(obj, j), zzihiVar);
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 9:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzr(i7, unsafe.getObject(obj, j), zzq(i));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 10:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzn(i7, (com.google.android.gms.internal.ads.zzida) unsafe.getObject(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 11:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzo(i7, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 12:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzg(i7, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 13:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzb(i7, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 14:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzd(i7, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 15:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzp(i7, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 16:
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzq(i7, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 17:
                                    entry3 = entry2;
                                    iArr2 = iArr;
                                    if (zzJ(obj, i, i2, i11, i3)) {
                                        zzihiVar.zzs(i7, unsafe.getObject(obj, j), zzq(i));
                                        break;
                                    } else {
                                        continue;
                                        continue;
                                    }
                                case 18:
                                    com.google.android.gms.internal.ads.zzigi.zza(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 19:
                                    com.google.android.gms.internal.ads.zzigi.zzb(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 20:
                                    com.google.android.gms.internal.ads.zzigi.zzc(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 21:
                                    com.google.android.gms.internal.ads.zzigi.zzd(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 22:
                                    com.google.android.gms.internal.ads.zzigi.zzh(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 23:
                                    com.google.android.gms.internal.ads.zzigi.zzf(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 24:
                                    com.google.android.gms.internal.ads.zzigi.zzk(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 25:
                                    com.google.android.gms.internal.ads.zzigi.zzn(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 26:
                                    com.google.android.gms.internal.ads.zzigi.zzo(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar);
                                    break;
                                case 27:
                                    com.google.android.gms.internal.ads.zzigi.zzq(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, zzq(i));
                                    break;
                                case 28:
                                    com.google.android.gms.internal.ads.zzigi.zzp(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar);
                                    break;
                                case 29:
                                    com.google.android.gms.internal.ads.zzigi.zzi(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 30:
                                    com.google.android.gms.internal.ads.zzigi.zzm(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 31:
                                    com.google.android.gms.internal.ads.zzigi.zzl(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 32:
                                    com.google.android.gms.internal.ads.zzigi.zzg(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 33:
                                    com.google.android.gms.internal.ads.zzigi.zzj(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 34:
                                    com.google.android.gms.internal.ads.zzigi.zze(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, false);
                                    break;
                                case 35:
                                    com.google.android.gms.internal.ads.zzigi.zza(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 36:
                                    com.google.android.gms.internal.ads.zzigi.zzb(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 37:
                                    com.google.android.gms.internal.ads.zzigi.zzc(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 38:
                                    com.google.android.gms.internal.ads.zzigi.zzd(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 39:
                                    com.google.android.gms.internal.ads.zzigi.zzh(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 40:
                                    com.google.android.gms.internal.ads.zzigi.zzf(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 41:
                                    com.google.android.gms.internal.ads.zzigi.zzk(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 42:
                                    com.google.android.gms.internal.ads.zzigi.zzn(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 43:
                                    com.google.android.gms.internal.ads.zzigi.zzi(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 44:
                                    com.google.android.gms.internal.ads.zzigi.zzm(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 45:
                                    com.google.android.gms.internal.ads.zzigi.zzl(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 46:
                                    com.google.android.gms.internal.ads.zzigi.zzg(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 47:
                                    com.google.android.gms.internal.ads.zzigi.zzj(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 48:
                                    com.google.android.gms.internal.ads.zzigi.zze(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, true);
                                    break;
                                case 49:
                                    com.google.android.gms.internal.ads.zzigi.zzr(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzihiVar, zzq(i));
                                    break;
                                case 50:
                                    java.lang.Object object = unsafe.getObject(obj, j);
                                    if (object != null) {
                                        zzihiVar.zzM(i7, ((com.google.android.gms.internal.ads.zzifi) zzr(i)).zze(), (com.google.android.gms.internal.ads.zzifj) object);
                                        break;
                                    }
                                    break;
                                case 51:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzf(i7, ((java.lang.Double) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).doubleValue());
                                        break;
                                    }
                                    break;
                                case 52:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zze(i7, ((java.lang.Float) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).floatValue());
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzc(i7, zzH(obj, j));
                                        break;
                                    }
                                    break;
                                case 54:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzh(i7, zzH(obj, j));
                                        break;
                                    }
                                    break;
                                case 55:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzi(i7, zzG(obj, j));
                                        break;
                                    }
                                    break;
                                case 56:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzj(i7, zzH(obj, j));
                                        break;
                                    }
                                    break;
                                case 57:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzk(i7, zzG(obj, j));
                                        break;
                                    }
                                    break;
                                case 58:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzl(i7, ((java.lang.Boolean) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).booleanValue());
                                        break;
                                    }
                                    break;
                                case 59:
                                    if (zzM(obj, i7, i)) {
                                        zzS(i7, unsafe.getObject(obj, j), zzihiVar);
                                        break;
                                    }
                                    break;
                                case 60:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzr(i7, unsafe.getObject(obj, j), zzq(i));
                                        break;
                                    }
                                    break;
                                case 61:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzn(i7, (com.google.android.gms.internal.ads.zzida) unsafe.getObject(obj, j));
                                        break;
                                    }
                                    break;
                                case 62:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzo(i7, zzG(obj, j));
                                        break;
                                    }
                                    break;
                                case 63:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzg(i7, zzG(obj, j));
                                        break;
                                    }
                                    break;
                                case 64:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzb(i7, zzG(obj, j));
                                        break;
                                    }
                                    break;
                                case 65:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzd(i7, zzH(obj, j));
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzp(i7, zzG(obj, j));
                                        break;
                                    }
                                    break;
                                case 67:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzq(i7, zzH(obj, j));
                                        break;
                                    }
                                    break;
                                case 68:
                                    if (zzM(obj, i7, i)) {
                                        zzihiVar.zzs(i7, unsafe.getObject(obj, j), zzq(i));
                                        break;
                                    }
                                    break;
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            i += 3;
                            i5 = i2;
                            entry = entry3;
                            i6 = i11;
                            iArr = iArr2;
                            i4 = 1048575;
                        }
                    }
                    long j2 = zzA & i4;
                    switch (zzC) {
                    }
                    iArr2 = iArr;
                    entry3 = entry2;
                    i += 3;
                    i5 = i2;
                    entry = entry3;
                    i6 = i11;
                    iArr = iArr2;
                    i4 = 1048575;
                }
                while (entry != null) {
                    this.zzn.zzb(zzihiVar, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                ((com.google.android.gms.internal.ads.zziee) obj).zzt.zzg(zzihiVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        sun.misc.Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 1048575;
        int i62 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((com.google.android.gms.internal.ads.zziee) obj).zzt.zzg(zzihiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:315:0x0526 A[LOOP:5: B:313:0x0522->B:315:0x0526, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0537  */
    @Override // com.google.android.gms.internal.ads.zzigh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(java.lang.Object obj, com.google.android.gms.internal.ads.zzigc zzigcVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        int i;
        java.lang.Object obj2;
        java.lang.Object obj3;
        zzidoVar.getClass();
        zzF(obj);
        com.google.android.gms.internal.ads.zzigt zzigtVar = this.zzm;
        java.lang.Object obj4 = null;
        while (true) {
            try {
                int zzb2 = zzigcVar.zzb();
                int zzP = zzP(zzb2);
                if (zzP >= 0) {
                    int zzA = zzA(zzP);
                    try {
                    } catch (com.google.android.gms.internal.ads.zzies unused) {
                        if (obj4 == null) {
                            obj4 = zzigtVar.zzh(obj);
                        }
                        if (!zzigtVar.zzk(obj4, zzigcVar, 0)) {
                            obj3 = obj4;
                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                obj3 = zzx(obj, this.zzj[i2], obj3, zzigtVar, obj);
                            }
                        }
                    }
                    switch (zzC(zzA)) {
                        case 0:
                            com.google.android.gms.internal.ads.zziha.zzl(obj, zzA & 1048575, zzigcVar.zze());
                            zzL(obj, zzP);
                        case 1:
                            com.google.android.gms.internal.ads.zziha.zzj(obj, zzA & 1048575, zzigcVar.zzf());
                            zzL(obj, zzP);
                        case 2:
                            com.google.android.gms.internal.ads.zziha.zzf(obj, zzA & 1048575, zzigcVar.zzh());
                            zzL(obj, zzP);
                        case 3:
                            com.google.android.gms.internal.ads.zziha.zzf(obj, zzA & 1048575, zzigcVar.zzg());
                            zzL(obj, zzP);
                        case 4:
                            com.google.android.gms.internal.ads.zziha.zzd(obj, zzA & 1048575, zzigcVar.zzi());
                            zzL(obj, zzP);
                        case 5:
                            com.google.android.gms.internal.ads.zziha.zzf(obj, zzA & 1048575, zzigcVar.zzj());
                            zzL(obj, zzP);
                        case 6:
                            com.google.android.gms.internal.ads.zziha.zzd(obj, zzA & 1048575, zzigcVar.zzk());
                            zzL(obj, zzP);
                        case 7:
                            com.google.android.gms.internal.ads.zziha.zzh(obj, zzA & 1048575, zzigcVar.zzl());
                            zzL(obj, zzP);
                        case 8:
                            zzz(obj, zzA, zzigcVar);
                            zzL(obj, zzP);
                        case 9:
                            com.google.android.gms.internal.ads.zzifp zzifpVar = (com.google.android.gms.internal.ads.zzifp) zzt(obj, zzP);
                            zzigcVar.zzo(zzifpVar, zzq(zzP), zzidoVar);
                            zzu(obj, zzP, zzifpVar);
                        case 10:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, zzigcVar.zzq());
                            zzL(obj, zzP);
                        case 11:
                            com.google.android.gms.internal.ads.zziha.zzd(obj, zzA & 1048575, zzigcVar.zzr());
                            zzL(obj, zzP);
                        case 12:
                            int zzs = zzigcVar.zzs();
                            com.google.android.gms.internal.ads.zziek zzs2 = zzs(zzP);
                            if (zzs2 != null && !zzs2.zza(zzs)) {
                                obj4 = com.google.android.gms.internal.ads.zzigi.zzK(obj, zzb2, zzs, obj4, zzigtVar);
                            }
                            com.google.android.gms.internal.ads.zziha.zzd(obj, zzA & 1048575, zzs);
                            zzL(obj, zzP);
                            break;
                        case 13:
                            com.google.android.gms.internal.ads.zziha.zzd(obj, zzA & 1048575, zzigcVar.zzt());
                            zzL(obj, zzP);
                        case 14:
                            com.google.android.gms.internal.ads.zziha.zzf(obj, zzA & 1048575, zzigcVar.zzu());
                            zzL(obj, zzP);
                        case 15:
                            com.google.android.gms.internal.ads.zziha.zzd(obj, zzA & 1048575, zzigcVar.zzv());
                            zzL(obj, zzP);
                        case 16:
                            com.google.android.gms.internal.ads.zziha.zzf(obj, zzA & 1048575, zzigcVar.zzw());
                            zzL(obj, zzP);
                        case 17:
                            com.google.android.gms.internal.ads.zzifp zzifpVar2 = (com.google.android.gms.internal.ads.zzifp) zzt(obj, zzP);
                            zzigcVar.zzp(zzifpVar2, zzq(zzP), zzidoVar);
                            zzu(obj, zzP, zzifpVar2);
                        case 18:
                            zzigcVar.zzx(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 19:
                            zzigcVar.zzy(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 20:
                            zzigcVar.zzA(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 21:
                            zzigcVar.zzz(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 22:
                            zzigcVar.zzB(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 23:
                            zzigcVar.zzC(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 24:
                            zzigcVar.zzD(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 25:
                            zzigcVar.zzE(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 26:
                            if (zzD(zzA)) {
                                ((com.google.android.gms.internal.ads.zzidf) zzigcVar).zzF(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575), true);
                            } else {
                                ((com.google.android.gms.internal.ads.zzidf) zzigcVar).zzF(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575), false);
                            }
                        case 27:
                            zzigcVar.zzG(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575), zzq(zzP), zzidoVar);
                        case 28:
                            zzigcVar.zzI(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 29:
                            zzigcVar.zzJ(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 30:
                            java.util.List zza2 = com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575);
                            zzigcVar.zzK(zza2);
                            obj4 = com.google.android.gms.internal.ads.zzigi.zzJ(obj, zzb2, zza2, zzs(zzP), obj4, zzigtVar);
                        case 31:
                            zzigcVar.zzL(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 32:
                            zzigcVar.zzM(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 33:
                            zzigcVar.zzN(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 34:
                            zzigcVar.zzO(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 35:
                            zzigcVar.zzx(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 36:
                            zzigcVar.zzy(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 37:
                            zzigcVar.zzA(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 38:
                            zzigcVar.zzz(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 39:
                            zzigcVar.zzB(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 40:
                            zzigcVar.zzC(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 41:
                            zzigcVar.zzD(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 42:
                            zzigcVar.zzE(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 43:
                            zzigcVar.zzJ(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 44:
                            java.util.List zza3 = com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575);
                            zzigcVar.zzK(zza3);
                            obj4 = com.google.android.gms.internal.ads.zzigi.zzJ(obj, zzb2, zza3, zzs(zzP), obj4, zzigtVar);
                        case 45:
                            zzigcVar.zzL(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 46:
                            zzigcVar.zzM(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 47:
                            zzigcVar.zzN(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 48:
                            zzigcVar.zzO(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575));
                        case 49:
                            zzigcVar.zzH(com.google.android.gms.internal.ads.zzifb.zza(obj, zzA & 1048575), zzq(zzP), zzidoVar);
                        case 50:
                            java.lang.Object zzr = zzr(zzP);
                            long zzA2 = zzA(zzP) & 1048575;
                            java.lang.Object zzm = com.google.android.gms.internal.ads.zziha.zzm(obj, zzA2);
                            if (zzm == null) {
                                zzm = com.google.android.gms.internal.ads.zzifj.zza().zzc();
                                com.google.android.gms.internal.ads.zziha.zzn(obj, zzA2, zzm);
                            } else if (com.google.android.gms.internal.ads.zzifk.zza(zzm)) {
                                java.lang.Object zzc = com.google.android.gms.internal.ads.zzifj.zza().zzc();
                                com.google.android.gms.internal.ads.zzifk.zzb(zzc, zzm);
                                com.google.android.gms.internal.ads.zziha.zzn(obj, zzA2, zzc);
                                zzm = zzc;
                            }
                            zzigcVar.zzP((com.google.android.gms.internal.ads.zzifj) zzm, ((com.google.android.gms.internal.ads.zzifi) zzr).zze(), zzidoVar);
                        case 51:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Double.valueOf(zzigcVar.zze()));
                            zzO(obj, zzb2, zzP);
                        case 52:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Float.valueOf(zzigcVar.zzf()));
                            zzO(obj, zzb2, zzP);
                        case 53:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Long.valueOf(zzigcVar.zzh()));
                            zzO(obj, zzb2, zzP);
                        case 54:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Long.valueOf(zzigcVar.zzg()));
                            zzO(obj, zzb2, zzP);
                        case 55:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Integer.valueOf(zzigcVar.zzi()));
                            zzO(obj, zzb2, zzP);
                        case 56:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Long.valueOf(zzigcVar.zzj()));
                            zzO(obj, zzb2, zzP);
                        case 57:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Integer.valueOf(zzigcVar.zzk()));
                            zzO(obj, zzb2, zzP);
                        case 58:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Boolean.valueOf(zzigcVar.zzl()));
                            zzO(obj, zzb2, zzP);
                        case 59:
                            zzz(obj, zzA, zzigcVar);
                            zzO(obj, zzb2, zzP);
                        case 60:
                            com.google.android.gms.internal.ads.zzifp zzifpVar3 = (com.google.android.gms.internal.ads.zzifp) zzv(obj, zzb2, zzP);
                            zzigcVar.zzo(zzifpVar3, zzq(zzP), zzidoVar);
                            zzw(obj, zzb2, zzP, zzifpVar3);
                        case 61:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, zzigcVar.zzq());
                            zzO(obj, zzb2, zzP);
                        case 62:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Integer.valueOf(zzigcVar.zzr()));
                            zzO(obj, zzb2, zzP);
                        case 63:
                            int zzs3 = zzigcVar.zzs();
                            com.google.android.gms.internal.ads.zziek zzs4 = zzs(zzP);
                            if (zzs4 != null && !zzs4.zza(zzs3)) {
                                obj4 = com.google.android.gms.internal.ads.zzigi.zzK(obj, zzb2, zzs3, obj4, zzigtVar);
                            }
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Integer.valueOf(zzs3));
                            zzO(obj, zzb2, zzP);
                            break;
                        case 64:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Integer.valueOf(zzigcVar.zzt()));
                            zzO(obj, zzb2, zzP);
                        case 65:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Long.valueOf(zzigcVar.zzu()));
                            zzO(obj, zzb2, zzP);
                        case 66:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Integer.valueOf(zzigcVar.zzv()));
                            zzO(obj, zzb2, zzP);
                        case 67:
                            com.google.android.gms.internal.ads.zziha.zzn(obj, zzA & 1048575, java.lang.Long.valueOf(zzigcVar.zzw()));
                            zzO(obj, zzb2, zzP);
                        case 68:
                            com.google.android.gms.internal.ads.zzifp zzifpVar4 = (com.google.android.gms.internal.ads.zzifp) zzv(obj, zzb2, zzP);
                            zzigcVar.zzp(zzifpVar4, zzq(zzP), zzidoVar);
                            zzw(obj, zzb2, zzP, zzifpVar4);
                        default:
                            if (obj4 == null) {
                                obj4 = zzigtVar.zzh(obj);
                            }
                            if (!zzigtVar.zzk(obj4, zzigcVar, 0)) {
                                obj3 = obj4;
                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                    obj3 = zzx(obj, this.zzj[i3], obj3, zzigtVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj3 = obj4;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        obj3 = zzx(obj, this.zzj[i4], obj3, zzigtVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzidoVar.zzc(this.zzg, zzb2)) != null) {
                        throw null;
                    }
                    if (obj4 == null) {
                        obj4 = zzigtVar.zzh(obj);
                    }
                    if (!zzigtVar.zzk(obj4, zzigcVar, 0)) {
                        obj3 = obj4;
                        for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                            obj3 = zzx(obj, this.zzj[i5], obj3, zzigtVar, obj);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                obj2 = obj4;
                while (i < this.zzl) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
            obj2 = obj4;
            for (i = this.zzk; i < this.zzl; i++) {
                obj2 = zzx(obj, this.zzj[i], obj2, zzigtVar, obj);
            }
            if (obj2 != null) {
                zzigtVar.zzi(obj, obj2);
            }
            throw th;
        }
        if (obj3 != null) {
            zzigtVar.zzi(obj, obj3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0af9, code lost:
    
        throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0e3b, code lost:
    
        if (r5 == 1048575) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0e3d, code lost:
    
        r10.putInt(r11, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0e41, code lost:
    
        r8 = r14.zzk;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0e48, code lost:
    
        if (r8 >= r14.zzl) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0e4a, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzigu) zzx(r35, r14.zzj[r8], r3, r14.zzm, r35);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0e60, code lost:
    
        if (r3 == null) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0e62, code lost:
    
        r14.zzm.zzi(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0e67, code lost:
    
        if (r6 != 0) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0e69, code lost:
    
        if (r7 != r12) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0e73, code lost:
    
        throw new com.google.android.gms.internal.ads.zziet(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0e7a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0e74, code lost:
    
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0e76, code lost:
    
        if (r7 > r12) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0e78, code lost:
    
        if (r9 != r6) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0e80, code lost:
    
        throw new com.google.android.gms.internal.ads.zziet(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x09aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x09bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzi(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        java.lang.String str;
        sun.misc.Unsafe unsafe;
        int i4;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar;
        java.lang.Object obj2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int zzP;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        com.google.android.gms.internal.ads.zzico zzicoVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar2;
        int i19;
        int zzc;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar3;
        sun.misc.Unsafe unsafe2;
        com.google.android.gms.internal.ads.zzico zzicoVar3;
        int i20;
        int i21;
        com.google.android.gms.internal.ads.zzico zzicoVar4;
        int i22;
        int i23;
        sun.misc.Unsafe unsafe3;
        java.lang.String str2;
        int i24;
        long j;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar4;
        int i25;
        int i26;
        sun.misc.Unsafe unsafe4;
        java.lang.String str3;
        int i27;
        java.lang.String str4;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        com.google.android.gms.internal.ads.zzico zzicoVar5;
        int i35;
        int i36;
        sun.misc.Unsafe unsafe5;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar5;
        int zzl;
        int zza2;
        int i37;
        int i38;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar6;
        java.lang.Object obj3;
        int i39;
        int i40;
        int i41;
        int i42;
        java.lang.Object obj4;
        int i43;
        sun.misc.Unsafe unsafe6;
        java.lang.Object obj5;
        int i44;
        com.google.android.gms.internal.ads.zzifs<T> zzifsVar7 = this;
        java.lang.Object obj6 = obj;
        int i45 = i2;
        int i46 = i3;
        com.google.android.gms.internal.ads.zzico zzicoVar6 = zzicoVar;
        zzF(obj);
        sun.misc.Unsafe unsafe7 = zzb;
        int i47 = i;
        int i48 = -1;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 1048575;
        while (true) {
            if (i47 < i45) {
                int i53 = i47 + 1;
                int i54 = bArr[i47];
                if (i54 < 0) {
                    i9 = com.google.android.gms.internal.ads.zzicp.zzb(i54, bArr, i53, zzicoVar6);
                    i8 = zzicoVar6.zza;
                } else {
                    i8 = i54;
                    i9 = i53;
                }
                int i55 = i8 >>> 3;
                if (i55 > i48) {
                    zzP = (i55 < zzifsVar7.zze || i55 > zzifsVar7.zzf) ? -1 : zzifsVar7.zzQ(i55, i49 / 3);
                } else {
                    zzP = zzifsVar7.zzP(i55);
                }
                int i56 = zzP;
                if (i56 == -1) {
                    i10 = i9;
                    i11 = i51;
                    i12 = i52;
                    zzifsVar = zzifsVar7;
                    str = "Failed to parse the message.";
                    i13 = i55;
                    unsafe = unsafe7;
                    i5 = i46;
                    i14 = 0;
                    i7 = i8;
                    obj2 = obj6;
                    zzicoVar2 = zzicoVar6;
                } else {
                    int i57 = i8 & 7;
                    int[] iArr = zzifsVar7.zzc;
                    int i58 = i8;
                    int i59 = iArr[i56 + 1];
                    str = "Failed to parse the message.";
                    int zzC = zzC(i59);
                    long j2 = i59 & 1048575;
                    if (zzC <= 17) {
                        int i60 = iArr[i56 + 2];
                        int i61 = 1 << (i60 >>> 20);
                        int i62 = i60 & 1048575;
                        if (i62 != i52) {
                            if (i52 != 1048575) {
                                unsafe7.putInt(obj6, i52, i51);
                            }
                            i51 = i62 == 1048575 ? 0 : unsafe7.getInt(obj6, i62);
                            i12 = i62;
                        } else {
                            i12 = i52;
                        }
                        switch (zzC) {
                            case 0:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 1) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i47 = i16 + 8;
                                    i51 |= i61;
                                    com.google.android.gms.internal.ads.zziha.zzl(obj6, j2, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzicp.zze(bArr, i16)));
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 1:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 5) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i47 = i16 + 4;
                                    i51 |= i61;
                                    com.google.android.gms.internal.ads.zziha.zzj(obj6, j2, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i16)));
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 0) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i19 = i61 | i51;
                                    zzc = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i16, zzicoVar6);
                                    unsafe7.putLong(obj, j2, zzicoVar6.zzb);
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i51 = i19;
                                    i47 = zzc;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 0) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i51 |= i61;
                                    i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i16, zzicoVar6);
                                    unsafe7.putInt(obj6, j2, zzicoVar6.zza);
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 1) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    zzc = i16 + 8;
                                    i19 = i61 | i51;
                                    unsafe7.putLong(obj, j2, com.google.android.gms.internal.ads.zzicp.zze(bArr, i16));
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i51 = i19;
                                    i47 = zzc;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 5) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i47 = i16 + 4;
                                    i51 |= i61;
                                    unsafe7.putInt(obj6, j2, com.google.android.gms.internal.ads.zzicp.zzd(bArr, i16));
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 7:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 0) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i51 |= i61;
                                    i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i16, zzicoVar6);
                                    com.google.android.gms.internal.ads.zziha.zzh(obj6, j2, zzicoVar6.zzb != 0);
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 8:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 2) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i51 |= i61;
                                    if (zzD(i59)) {
                                        i47 = com.google.android.gms.internal.ads.zzicp.zzf(bArr, i16, zzicoVar6);
                                    } else {
                                        i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i16, zzicoVar6);
                                        int i63 = zzicoVar6.zza;
                                        if (i63 < 0) {
                                            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i63 == 0) {
                                            zzicoVar6.zzc = "";
                                        } else {
                                            zzicoVar6.zzc = new java.lang.String(bArr, i47, i63, java.nio.charset.StandardCharsets.UTF_8);
                                            i47 += i63;
                                        }
                                    }
                                    unsafe7.putObject(obj6, j2, zzicoVar6.zzc);
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 9:
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 2) {
                                    i16 = i9;
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    java.lang.Object zzt = zzifsVar2.zzt(obj6, i17);
                                    i47 = com.google.android.gms.internal.ads.zzicp.zzj(zzt, zzifsVar2.zzq(i17), bArr, i9, i2, zzicoVar);
                                    zzifsVar2.zzu(obj6, i17, zzt);
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i51 = i61 | i51;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 10:
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 2) {
                                    i16 = i9;
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i51 |= i61;
                                    i47 = com.google.android.gms.internal.ads.zzicp.zzg(bArr, i9, zzicoVar6);
                                    unsafe7.putObject(obj6, j2, zzicoVar6.zzc);
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 12:
                                i17 = i56;
                                i18 = i58;
                                if (i57 != 0) {
                                    zzifsVar3 = this;
                                    i16 = i9;
                                    i20 = i51;
                                    i21 = i17;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i9, zzicoVar6);
                                    int i64 = zzicoVar6.zza;
                                    zzifsVar2 = this;
                                    com.google.android.gms.internal.ads.zziek zzs = zzifsVar2.zzs(i17);
                                    if ((i59 & Integer.MIN_VALUE) == 0 || zzs == null || zzs.zza(i64)) {
                                        i51 |= i61;
                                        unsafe7.putInt(obj6, j2, i64);
                                    } else {
                                        zzh(obj).zzk(i18, java.lang.Long.valueOf(i64));
                                    }
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    break;
                                }
                            case 15:
                                i17 = i56;
                                i18 = i58;
                                if (i57 != 0) {
                                    zzifsVar3 = this;
                                    i16 = i9;
                                    i20 = i51;
                                    i21 = i17;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    i51 |= i61;
                                    i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i9, zzicoVar6);
                                    unsafe7.putInt(obj6, j2, com.google.android.gms.internal.ads.zzide.zzM(zzicoVar6.zza));
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i18;
                                    i49 = i17;
                                    i48 = i55;
                                    i52 = i12;
                                    zzifsVar7 = this;
                                    break;
                                }
                            case 16:
                                if (i57 != 0) {
                                    i18 = i58;
                                    zzifsVar3 = this;
                                    i16 = i9;
                                    i20 = i51;
                                    i21 = i56;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    int zzc2 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i9, zzicoVar6);
                                    unsafe7.putLong(obj, j2, com.google.android.gms.internal.ads.zzide.zzN(zzicoVar6.zzb));
                                    i45 = i2;
                                    i46 = i3;
                                    i50 = i58;
                                    i51 |= i61;
                                    i47 = zzc2;
                                    i49 = i56;
                                    i48 = i55;
                                    i52 = i12;
                                    zzifsVar7 = this;
                                    break;
                                }
                            default:
                                i16 = i9;
                                i17 = i56;
                                i18 = i58;
                                zzifsVar2 = this;
                                if (i57 != 3) {
                                    zzifsVar3 = zzifsVar2;
                                    unsafe2 = unsafe7;
                                    zzicoVar3 = zzicoVar6;
                                    i20 = i51;
                                    i21 = i17;
                                    zzifsVar = zzifsVar3;
                                    i10 = i16;
                                    i14 = i21;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    obj2 = obj6;
                                    i11 = i20;
                                    i13 = i55;
                                    i5 = i3;
                                    zzicoVar2 = zzicoVar3;
                                    break;
                                } else {
                                    java.lang.Object zzt2 = zzifsVar2.zzt(obj6, i17);
                                    int zzk = com.google.android.gms.internal.ads.zzicp.zzk(zzt2, zzifsVar2.zzq(i17), bArr, i16, i2, (i55 << 3) | 4, zzicoVar);
                                    zzifsVar2.zzu(obj6, i17, zzt2);
                                    i45 = i2;
                                    i46 = i3;
                                    zzicoVar6 = zzicoVar6;
                                    unsafe7 = unsafe7;
                                    i50 = i18;
                                    i47 = zzk;
                                    i48 = i55;
                                    i52 = i12;
                                    zzifsVar7 = zzifsVar2;
                                    i49 = i17;
                                    i51 |= i61;
                                    break;
                                }
                        }
                    } else {
                        i11 = i51;
                        i12 = i52;
                        sun.misc.Unsafe unsafe8 = unsafe7;
                        int i65 = i9;
                        com.google.android.gms.internal.ads.zzico zzicoVar7 = zzicoVar6;
                        com.google.android.gms.internal.ads.zzifs<T> zzifsVar8 = zzifsVar7;
                        if (zzC != 27) {
                            if (zzC > 49) {
                                int i66 = i65;
                                sun.misc.Unsafe unsafe9 = unsafe8;
                                int i67 = i2;
                                i24 = i55;
                                i23 = i56;
                                if (zzC != 50) {
                                    zzicoVar2 = zzicoVar;
                                    int i68 = i58;
                                    long j3 = iArr[i23 + 2] & 1048575;
                                    switch (zzC) {
                                        case 51:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 1) {
                                                i38 = i37 + 8;
                                                unsafe.putObject(obj2, j2, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzicp.zze(bArr, i37))));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                    i5 = i3;
                                                    i10 = i38;
                                                    i7 = i68;
                                                    break;
                                                } else {
                                                    i46 = i3;
                                                    i47 = i38;
                                                    zzicoVar6 = zzicoVar2;
                                                    i48 = i13;
                                                    obj6 = obj2;
                                                    zzifsVar7 = zzifsVar;
                                                    i51 = i11;
                                                    i50 = i68;
                                                    i52 = i12;
                                                    i49 = i14;
                                                    i45 = i2;
                                                    unsafe7 = unsafe;
                                                    break;
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                        case 52:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 5) {
                                                i38 = i37 + 4;
                                                unsafe.putObject(obj2, j2, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i37))));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 0) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i37, zzicoVar2);
                                                unsafe.putObject(obj2, j2, java.lang.Long.valueOf(zzicoVar2.zzb));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 0) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i37, zzicoVar2);
                                                unsafe.putObject(obj2, j2, java.lang.Integer.valueOf(zzicoVar2.zza));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 1) {
                                                i38 = i37 + 8;
                                                unsafe.putObject(obj2, j2, java.lang.Long.valueOf(com.google.android.gms.internal.ads.zzicp.zze(bArr, i37)));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 5) {
                                                i38 = i37 + 4;
                                                unsafe.putObject(obj2, j2, java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i37)));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 58:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 0) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i37, zzicoVar2);
                                                unsafe.putObject(obj2, j2, java.lang.Boolean.valueOf(zzicoVar2.zzb != 0));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 59:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            if (i57 == 2) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i37, zzicoVar2);
                                                int i69 = zzicoVar2.zza;
                                                if (i69 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i70 = i38 + i69;
                                                    if ((i59 & 536870912) != 0 && !com.google.android.gms.internal.ads.zzihf.zzb(bArr, i38, i70)) {
                                                        throw new com.google.android.gms.internal.ads.zziet("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j2, new java.lang.String(bArr, i38, i69, java.nio.charset.StandardCharsets.UTF_8));
                                                    i38 = i70;
                                                }
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i38 == i37) {
                                                }
                                            }
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 60:
                                            str = str;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            if (i57 == 2) {
                                                java.lang.Object zzv = zzv(obj, i13, i23);
                                                com.google.android.gms.internal.ads.zzigh zzq = zzq(i23);
                                                zzifsVar = this;
                                                i68 = i68;
                                                obj2 = obj;
                                                int zzj = com.google.android.gms.internal.ads.zzicp.zzj(zzv, zzq, bArr, i66, i2, zzicoVar);
                                                zzifsVar.zzw(obj2, i13, i23, zzv);
                                                i38 = zzj;
                                                i37 = i66;
                                                i14 = i23;
                                                if (i38 == i37) {
                                                }
                                            } else {
                                                zzifsVar = this;
                                                i68 = i68;
                                                obj2 = obj;
                                                i37 = i66;
                                                i14 = i23;
                                                i38 = i37;
                                                if (i38 == i37) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            zzifsVar6 = this;
                                            obj3 = obj;
                                            str = str;
                                            i39 = i23;
                                            i40 = i66;
                                            i41 = i68;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            if (i57 == 2) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zzg(bArr, i40, zzicoVar2);
                                                unsafe.putObject(obj3, j2, zzicoVar2.zzc);
                                                unsafe.putInt(obj3, j3, i13);
                                                zzifsVar = zzifsVar6;
                                                i37 = i40;
                                                i14 = i39;
                                                i68 = i41;
                                                obj2 = obj3;
                                                if (i38 == i37) {
                                                }
                                            } else {
                                                zzifsVar = zzifsVar6;
                                                i37 = i40;
                                                i14 = i39;
                                                i68 = i41;
                                                obj2 = obj3;
                                                i38 = i37;
                                                if (i38 == i37) {
                                                }
                                            }
                                            break;
                                        case 63:
                                            zzifsVar6 = this;
                                            obj3 = obj;
                                            str = str;
                                            i39 = i23;
                                            i40 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            if (i57 == 0) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i40, zzicoVar2);
                                                int i71 = zzicoVar2.zza;
                                                com.google.android.gms.internal.ads.zziek zzs2 = zzifsVar6.zzs(i39);
                                                if (zzs2 == null || zzs2.zza(i71)) {
                                                    i41 = i68;
                                                    unsafe.putObject(obj3, j2, java.lang.Integer.valueOf(i71));
                                                    unsafe.putInt(obj3, j3, i13);
                                                } else {
                                                    i41 = i68;
                                                    zzh(obj).zzk(i41, java.lang.Long.valueOf(i71));
                                                }
                                                zzifsVar = zzifsVar6;
                                                i37 = i40;
                                                i14 = i39;
                                                i68 = i41;
                                                obj2 = obj3;
                                                if (i38 == i37) {
                                                }
                                            }
                                            zzifsVar = zzifsVar6;
                                            i37 = i40;
                                            i14 = i39;
                                            obj2 = obj3;
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 66:
                                            zzifsVar6 = this;
                                            obj3 = obj;
                                            str = str;
                                            i39 = i23;
                                            i40 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            if (i57 == 0) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i40, zzicoVar2);
                                                unsafe.putObject(obj3, j2, java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzide.zzM(zzicoVar2.zza)));
                                                unsafe.putInt(obj3, j3, i13);
                                                zzifsVar = zzifsVar6;
                                                i37 = i40;
                                                i14 = i39;
                                                obj2 = obj3;
                                                if (i38 == i37) {
                                                }
                                            }
                                            zzifsVar = zzifsVar6;
                                            i37 = i40;
                                            i14 = i39;
                                            obj2 = obj3;
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                        case 67:
                                            zzifsVar6 = this;
                                            obj3 = obj;
                                            i39 = i23;
                                            i40 = i66;
                                            i13 = i24;
                                            if (i57 == 0) {
                                                i38 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i40, zzicoVar2);
                                                str = str;
                                                unsafe = unsafe9;
                                                unsafe.putObject(obj3, j2, java.lang.Long.valueOf(com.google.android.gms.internal.ads.zzide.zzN(zzicoVar2.zzb)));
                                                unsafe.putInt(obj3, j3, i13);
                                                zzifsVar = zzifsVar6;
                                                i37 = i40;
                                                i14 = i39;
                                                obj2 = obj3;
                                                if (i38 == i37) {
                                                }
                                            } else {
                                                str = str;
                                                unsafe = unsafe9;
                                                zzifsVar = zzifsVar6;
                                                i37 = i40;
                                                i14 = i39;
                                                obj2 = obj3;
                                                i38 = i37;
                                                if (i38 == i37) {
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i57 == 3) {
                                                java.lang.Object zzv2 = zzv(obj, i24, i23);
                                                int zzk2 = com.google.android.gms.internal.ads.zzicp.zzk(zzv2, zzq(i23), bArr, i66, i2, (i68 & (-8)) | 4, zzicoVar);
                                                zzw(obj, i24, i23, zzv2);
                                                zzifsVar = this;
                                                i37 = i66;
                                                i14 = i23;
                                                obj2 = obj;
                                                str = str;
                                                unsafe = unsafe9;
                                                i13 = i24;
                                                i38 = zzk2;
                                                if (i38 == i37) {
                                                }
                                            } else {
                                                str = str;
                                                i14 = i23;
                                                i37 = i66;
                                                i13 = i24;
                                                unsafe = unsafe9;
                                                zzifsVar = this;
                                                obj2 = obj;
                                                i38 = i37;
                                                if (i38 == i37) {
                                                }
                                            }
                                            break;
                                        default:
                                            str = str;
                                            i14 = i23;
                                            i37 = i66;
                                            i13 = i24;
                                            unsafe = unsafe9;
                                            zzifsVar = this;
                                            obj2 = obj;
                                            i38 = i37;
                                            if (i38 == i37) {
                                            }
                                            break;
                                    }
                                } else if (i57 == 2) {
                                    java.lang.Object zzr = zzifsVar8.zzr(i23);
                                    java.lang.Object object = unsafe9.getObject(obj, j2);
                                    if (com.google.android.gms.internal.ads.zzifk.zza(object)) {
                                        com.google.android.gms.internal.ads.zzifj zzc3 = com.google.android.gms.internal.ads.zzifj.zza().zzc();
                                        com.google.android.gms.internal.ads.zzifk.zzb(zzc3, object);
                                        unsafe9.putObject(obj, j2, zzc3);
                                        object = zzc3;
                                    }
                                    com.google.android.gms.internal.ads.zzifh zze = ((com.google.android.gms.internal.ads.zzifi) zzr).zze();
                                    com.google.android.gms.internal.ads.zzifj zzifjVar = (com.google.android.gms.internal.ads.zzifj) object;
                                    int zza3 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i66, zzicoVar);
                                    int i72 = zzicoVar.zza;
                                    if (i72 >= 0 && i72 <= i67 - zza3) {
                                        int i73 = zza3 + i72;
                                        java.lang.Object obj7 = zze.zzb;
                                        java.lang.Object obj8 = zze.zzd;
                                        java.lang.Object obj9 = obj7;
                                        java.lang.Object obj10 = obj8;
                                        while (zza3 < i73) {
                                            int i74 = i66;
                                            int i75 = zza3 + 1;
                                            int i76 = bArr[zza3];
                                            if (i76 < 0) {
                                                i75 = com.google.android.gms.internal.ads.zzicp.zzb(i76, bArr, i75, zzicoVar);
                                                i76 = zzicoVar.zza;
                                            }
                                            int i77 = i75;
                                            int i78 = i76 >>> 3;
                                            java.lang.Object obj11 = obj10;
                                            int i79 = i76 & 7;
                                            sun.misc.Unsafe unsafe10 = unsafe9;
                                            if (i78 == 1) {
                                                i42 = i77;
                                                obj4 = obj9;
                                                i43 = i67;
                                                unsafe6 = unsafe10;
                                                obj5 = obj8;
                                                i44 = i74;
                                                com.google.android.gms.internal.ads.zzihg zzihgVar = zze.zza;
                                                if (i79 == zzihgVar.zzb()) {
                                                    zza3 = zzR(bArr, i42, i2, zzihgVar, null, zzicoVar);
                                                    obj9 = zzicoVar.zzc;
                                                    obj10 = obj11;
                                                    i67 = i43;
                                                    i66 = i44;
                                                    obj8 = obj5;
                                                    unsafe9 = unsafe6;
                                                }
                                            } else if (i78 != 2) {
                                                i42 = i77;
                                                obj4 = obj9;
                                                i43 = i67;
                                                obj10 = obj11;
                                                unsafe6 = unsafe10;
                                                obj5 = obj8;
                                                i44 = i74;
                                                zza3 = com.google.android.gms.internal.ads.zzicp.zzp(i76, bArr, i42, i43, zzicoVar);
                                                obj9 = obj4;
                                                i67 = i43;
                                                i66 = i44;
                                                obj8 = obj5;
                                                unsafe9 = unsafe6;
                                            } else {
                                                com.google.android.gms.internal.ads.zzihg zzihgVar2 = zze.zzc;
                                                if (i79 == zzihgVar2.zzb()) {
                                                    java.lang.Class<?> cls = obj8.getClass();
                                                    obj5 = obj8;
                                                    i44 = i74;
                                                    unsafe6 = unsafe10;
                                                    obj4 = obj9;
                                                    i43 = i67;
                                                    zza3 = zzR(bArr, i77, i2, zzihgVar2, cls, zzicoVar);
                                                    obj10 = zzicoVar.zzc;
                                                    obj9 = obj4;
                                                    i67 = i43;
                                                    i66 = i44;
                                                    obj8 = obj5;
                                                    unsafe9 = unsafe6;
                                                } else {
                                                    i42 = i77;
                                                    obj4 = obj9;
                                                    i43 = i67;
                                                    unsafe6 = unsafe10;
                                                    obj5 = obj8;
                                                    i44 = i74;
                                                }
                                            }
                                            obj10 = obj11;
                                            zza3 = com.google.android.gms.internal.ads.zzicp.zzp(i76, bArr, i42, i43, zzicoVar);
                                            obj9 = obj4;
                                            i67 = i43;
                                            i66 = i44;
                                            obj8 = obj5;
                                            unsafe9 = unsafe6;
                                        }
                                        int i80 = i66;
                                        sun.misc.Unsafe unsafe11 = unsafe9;
                                        java.lang.Object obj12 = obj9;
                                        int i81 = i67;
                                        if (zza3 != i73) {
                                            throw new com.google.android.gms.internal.ads.zziet(str);
                                        }
                                        zzifjVar.put(obj12, obj10);
                                        if (i73 != i80) {
                                            obj6 = obj;
                                            i46 = i3;
                                            i50 = i58;
                                            i47 = i73;
                                            i49 = i23;
                                            i45 = i81;
                                            i51 = i11;
                                            i48 = i24;
                                            i52 = i12;
                                            unsafe7 = unsafe11;
                                            zzifsVar7 = this;
                                            zzicoVar6 = zzicoVar;
                                        } else {
                                            zzifsVar = this;
                                            i7 = i58;
                                            zzicoVar2 = zzicoVar;
                                            i10 = i73;
                                            i14 = i23;
                                            str = str;
                                            i13 = i24;
                                            unsafe = unsafe11;
                                        }
                                    }
                                } else {
                                    zzicoVar4 = zzicoVar;
                                    i22 = i66;
                                    unsafe3 = unsafe9;
                                    str2 = str;
                                    str = str2;
                                    i7 = i58;
                                    zzicoVar2 = zzicoVar4;
                                    i14 = i23;
                                    i10 = i22;
                                    i13 = i24;
                                    unsafe = unsafe3;
                                    zzifsVar = this;
                                }
                            } else {
                                int i82 = i55;
                                long j4 = i59;
                                com.google.android.gms.internal.ads.zzieq zzieqVar = (com.google.android.gms.internal.ads.zzieq) unsafe8.getObject(obj6, j2);
                                if (zzieqVar.zza()) {
                                    j = j4;
                                } else {
                                    int size = zzieqVar.size();
                                    j = j4;
                                    zzieqVar = zzieqVar.zzh(size + size);
                                    unsafe8.putObject(obj6, j2, zzieqVar);
                                }
                                com.google.android.gms.internal.ads.zzieq zzieqVar2 = zzieqVar;
                                switch (zzC) {
                                    case 18:
                                    case 35:
                                        zzifsVar4 = this;
                                        i25 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        unsafe4 = unsafe8;
                                        str3 = str;
                                        i27 = i56;
                                        if (i57 != 2) {
                                            if (i57 == 1) {
                                                i47 = i26 + 8;
                                                int i83 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzidl zzidlVar = (com.google.android.gms.internal.ads.zzidl) zzieqVar2;
                                                zzidlVar.zzg(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzicp.zze(bArr, i26)));
                                                while (i47 < i25) {
                                                    int zza4 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                    if (i58 == zzicoVar2.zza) {
                                                        zzidlVar.zzg(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzicp.zze(bArr, zza4)));
                                                        i47 = zza4 + 8;
                                                    }
                                                }
                                            }
                                            str4 = str3;
                                            i29 = i27;
                                            i47 = i26;
                                            if (i47 != i26) {
                                                i10 = i47;
                                                i7 = i58;
                                                i14 = i29;
                                                unsafe = unsafe4;
                                                str = str4;
                                                i13 = i82;
                                                obj2 = obj;
                                                i5 = i3;
                                                zzifsVar = zzifsVar4;
                                                break;
                                            } else {
                                                i46 = i3;
                                                i50 = i58;
                                                i49 = i29;
                                                zzifsVar7 = zzifsVar4;
                                                unsafe7 = unsafe4;
                                                i51 = i11;
                                                i48 = i82;
                                                i52 = i12;
                                                zzicoVar6 = zzicoVar2;
                                                i45 = i25;
                                                obj6 = obj;
                                                break;
                                            }
                                        } else {
                                            int i84 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzidl zzidlVar2 = (com.google.android.gms.internal.ads.zzidl) zzieqVar2;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i85 = zzicoVar2.zza;
                                            int i86 = i47 + i85;
                                            if (i86 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzidlVar2.zzi(zzidlVar2.size() + (i85 / 8));
                                            while (i47 < i86) {
                                                zzidlVar2.zzg(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzicp.zze(bArr, i47)));
                                                i47 += 8;
                                            }
                                            if (i47 != i86) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str4 = str3;
                                        i29 = i27;
                                        if (i47 != i26) {
                                        }
                                    case 19:
                                    case 36:
                                        zzifsVar4 = this;
                                        i25 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        unsafe4 = unsafe8;
                                        str3 = str;
                                        i27 = i56;
                                        if (i57 == 2) {
                                            int i87 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzidv zzidvVar = (com.google.android.gms.internal.ads.zzidv) zzieqVar2;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i88 = zzicoVar2.zza;
                                            int i89 = i47 + i88;
                                            if (i89 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzidvVar.zzi(zzidvVar.size() + (i88 / 4));
                                            while (i47 < i89) {
                                                zzidvVar.zzg(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i47)));
                                                i47 += 4;
                                            }
                                            if (i47 != i89) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i57 == 5) {
                                                i47 = i26 + 4;
                                                int i90 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzidv zzidvVar2 = (com.google.android.gms.internal.ads.zzidv) zzieqVar2;
                                                zzidvVar2.zzg(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i26)));
                                                while (i47 < i25) {
                                                    int zza5 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                    if (i58 == zzicoVar2.zza) {
                                                        zzidvVar2.zzg(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzicp.zzd(bArr, zza5)));
                                                        i47 = zza5 + 4;
                                                    }
                                                }
                                            }
                                            str4 = str3;
                                            i29 = i27;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        str4 = str3;
                                        i29 = i27;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzifsVar4 = this;
                                        i25 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        unsafe4 = unsafe8;
                                        str3 = str;
                                        i27 = i56;
                                        if (i57 == 2) {
                                            int i91 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) zzieqVar2;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i92 = zzicoVar2.zza + i47;
                                            while (i47 < i92) {
                                                i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i47, zzicoVar2);
                                                zzifdVar.zzd(zzicoVar2.zzb);
                                            }
                                            if (i47 != i92) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                int i93 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzifd zzifdVar2 = (com.google.android.gms.internal.ads.zzifd) zzieqVar2;
                                                i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i26, zzicoVar2);
                                                zzifdVar2.zzd(zzicoVar2.zzb);
                                                while (i47 < i25) {
                                                    int zza6 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                    if (i58 == zzicoVar2.zza) {
                                                        i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, zza6, zzicoVar2);
                                                        zzifdVar2.zzd(zzicoVar2.zzb);
                                                    }
                                                }
                                            }
                                            str4 = str3;
                                            i29 = i27;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        str4 = str3;
                                        i29 = i27;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i28 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        i27 = i56;
                                        if (i57 == 2) {
                                            i47 = com.google.android.gms.internal.ads.zzicp.zzm(bArr, i26, zzieqVar2, zzicoVar2);
                                            zzifsVar4 = this;
                                            i25 = i28;
                                            unsafe4 = unsafe8;
                                            str4 = str;
                                            i29 = i27;
                                            if (i47 != i26) {
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                zzifsVar4 = this;
                                                str3 = str;
                                                i25 = i28;
                                                unsafe4 = unsafe8;
                                                i47 = com.google.android.gms.internal.ads.zzicp.zzl(i58, bArr, i26, i2, zzieqVar2, zzicoVar);
                                                str4 = str3;
                                                i29 = i27;
                                                if (i47 != i26) {
                                                }
                                            }
                                            zzifsVar4 = this;
                                            i25 = i28;
                                            unsafe4 = unsafe8;
                                            str4 = str;
                                            i29 = i27;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i28 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        i27 = i56;
                                        int i94 = i82;
                                        if (i57 == 2) {
                                            int i95 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzifd zzifdVar3 = (com.google.android.gms.internal.ads.zzifd) zzieqVar2;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i96 = zzicoVar2.zza;
                                            int i97 = i47 + i96;
                                            if (i97 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzifdVar3.zzi(zzifdVar3.size() + (i96 / 8));
                                            while (i47 < i97) {
                                                zzifdVar3.zzd(com.google.android.gms.internal.ads.zzicp.zze(bArr, i47));
                                                i47 += 8;
                                                i94 = i94;
                                            }
                                            i82 = i94;
                                            if (i47 != i97) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            i82 = i94;
                                            if (i57 == 1) {
                                                i47 = i26 + 8;
                                                int i98 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzifd zzifdVar4 = (com.google.android.gms.internal.ads.zzifd) zzieqVar2;
                                                zzifdVar4.zzd(com.google.android.gms.internal.ads.zzicp.zze(bArr, i26));
                                                while (i47 < i28) {
                                                    int zza7 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                    if (i58 == zzicoVar2.zza) {
                                                        zzifdVar4.zzd(com.google.android.gms.internal.ads.zzicp.zze(bArr, zza7));
                                                        i47 = zza7 + 8;
                                                    }
                                                }
                                            }
                                            zzifsVar4 = this;
                                            i25 = i28;
                                            unsafe4 = unsafe8;
                                            str4 = str;
                                            i29 = i27;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        zzifsVar4 = this;
                                        i25 = i28;
                                        unsafe4 = unsafe8;
                                        str4 = str;
                                        i29 = i27;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i30 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        i31 = i56;
                                        i32 = i82;
                                        if (i57 == 2) {
                                            int i99 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) zzieqVar2;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i100 = zzicoVar2.zza;
                                            int i101 = i47 + i100;
                                            if (i101 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zziefVar.zzj(zziefVar.size() + (i100 / 4));
                                            while (i47 < i101) {
                                                zziefVar.zzi(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i47));
                                                i47 += 4;
                                            }
                                            if (i47 != i101) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i57 == 5) {
                                                i47 = i26 + 4;
                                                int i102 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzief zziefVar2 = (com.google.android.gms.internal.ads.zzief) zzieqVar2;
                                                zziefVar2.zzi(com.google.android.gms.internal.ads.zzicp.zzd(bArr, i26));
                                                while (i47 < i30) {
                                                    int zza8 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                    if (i58 == zzicoVar2.zza) {
                                                        zziefVar2.zzi(com.google.android.gms.internal.ads.zzicp.zzd(bArr, zza8));
                                                        i47 = zza8 + 4;
                                                    }
                                                }
                                            }
                                            i25 = i30;
                                            unsafe4 = unsafe8;
                                            i82 = i32;
                                            str4 = str;
                                            i29 = i31;
                                            zzifsVar4 = this;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        i25 = i30;
                                        unsafe4 = unsafe8;
                                        i82 = i32;
                                        str4 = str;
                                        i29 = i31;
                                        zzifsVar4 = this;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i30 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        java.lang.String str5 = str;
                                        i31 = i56;
                                        i32 = i82;
                                        if (i57 == 2) {
                                            int i103 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzicq zzicqVar = (com.google.android.gms.internal.ads.zzicq) zzieqVar2;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i104 = zzicoVar2.zza + i47;
                                            while (i47 < i104) {
                                                i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i47, zzicoVar2);
                                                java.lang.String str6 = str5;
                                                zzicqVar.zzg(zzicoVar2.zzb != 0);
                                                str5 = str6;
                                            }
                                            str = str5;
                                            if (i47 != i104) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            str = str5;
                                            if (i57 == 0) {
                                                int i105 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzicq zzicqVar2 = (com.google.android.gms.internal.ads.zzicq) zzieqVar2;
                                                i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i26, zzicoVar2);
                                                zzicqVar2.zzg(zzicoVar2.zzb != 0);
                                                while (i47 < i30) {
                                                    int zza9 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                    if (i58 == zzicoVar2.zza) {
                                                        i47 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, zza9, zzicoVar2);
                                                        zzicqVar2.zzg(zzicoVar2.zzb != 0);
                                                    }
                                                }
                                            }
                                            i25 = i30;
                                            unsafe4 = unsafe8;
                                            i82 = i32;
                                            str4 = str;
                                            i29 = i31;
                                            zzifsVar4 = this;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        i25 = i30;
                                        unsafe4 = unsafe8;
                                        i82 = i32;
                                        str4 = str;
                                        i29 = i31;
                                        zzifsVar4 = this;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 26:
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        i31 = i56;
                                        long j5 = j;
                                        if (i57 != 2) {
                                            str4 = str;
                                            i25 = i2;
                                            unsafe4 = unsafe8;
                                            i82 = i82;
                                            i29 = i31;
                                            zzifsVar4 = this;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        } else if ((j5 & 536870912) == 0) {
                                            int zza10 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i106 = zzicoVar2.zza;
                                            if (i106 < 0) {
                                                throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i106 == 0) {
                                                zzieqVar2.add("");
                                            } else {
                                                zzieqVar2.add(new java.lang.String(bArr, zza10, i106, java.nio.charset.StandardCharsets.UTF_8));
                                                zza10 += i106;
                                            }
                                            while (zza10 < i2) {
                                                int zza11 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza10, zzicoVar2);
                                                if (i58 == zzicoVar2.zza) {
                                                    zza10 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza11, zzicoVar2);
                                                    int i107 = zzicoVar2.zza;
                                                    if (i107 < 0) {
                                                        throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i107 == 0) {
                                                        zzieqVar2.add("");
                                                    } else {
                                                        zzieqVar2.add(new java.lang.String(bArr, zza10, i107, java.nio.charset.StandardCharsets.UTF_8));
                                                        zza10 += i107;
                                                    }
                                                } else {
                                                    str4 = str;
                                                    i25 = i2;
                                                    unsafe4 = unsafe8;
                                                    i82 = i82;
                                                    i29 = i31;
                                                    zzifsVar4 = this;
                                                    i47 = zza10;
                                                    if (i47 != i26) {
                                                    }
                                                }
                                            }
                                            str4 = str;
                                            i25 = i2;
                                            unsafe4 = unsafe8;
                                            i82 = i82;
                                            i29 = i31;
                                            zzifsVar4 = this;
                                            i47 = zza10;
                                            if (i47 != i26) {
                                            }
                                        } else {
                                            int zza12 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i26, zzicoVar2);
                                            int i108 = zzicoVar2.zza;
                                            if (i108 < 0) {
                                                throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i108 == 0) {
                                                zzieqVar2.add("");
                                            } else {
                                                int i109 = zza12 + i108;
                                                if (!com.google.android.gms.internal.ads.zzihf.zzb(bArr, zza12, i109)) {
                                                    throw new com.google.android.gms.internal.ads.zziet("Protocol message had invalid UTF-8.");
                                                }
                                                zzieqVar2.add(new java.lang.String(bArr, zza12, i108, java.nio.charset.StandardCharsets.UTF_8));
                                                zza12 = i109;
                                            }
                                            while (zza12 < i2) {
                                                int zza13 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza12, zzicoVar2);
                                                if (i58 == zzicoVar2.zza) {
                                                    zza12 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza13, zzicoVar2);
                                                    int i110 = zzicoVar2.zza;
                                                    if (i110 < 0) {
                                                        throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i110 == 0) {
                                                        zzieqVar2.add("");
                                                    } else {
                                                        int i111 = zza12 + i110;
                                                        if (!com.google.android.gms.internal.ads.zzihf.zzb(bArr, zza12, i111)) {
                                                            throw new com.google.android.gms.internal.ads.zziet("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzieqVar2.add(new java.lang.String(bArr, zza12, i110, java.nio.charset.StandardCharsets.UTF_8));
                                                        zza12 = i111;
                                                    }
                                                } else {
                                                    i47 = zza12;
                                                    str4 = str;
                                                    i25 = i2;
                                                    unsafe4 = unsafe8;
                                                    i82 = i82;
                                                    i29 = i31;
                                                    zzifsVar4 = this;
                                                    if (i47 != i26) {
                                                    }
                                                }
                                            }
                                            i47 = zza12;
                                            str4 = str;
                                            i25 = i2;
                                            unsafe4 = unsafe8;
                                            i82 = i82;
                                            i29 = i31;
                                            zzifsVar4 = this;
                                            if (i47 != i26) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        i33 = i56;
                                        if (i57 == 2) {
                                            zzicoVar2 = zzicoVar7;
                                            int zzn = com.google.android.gms.internal.ads.zzicp.zzn(zzq(i33), i58, bArr, i65, i2, zzieqVar2, zzicoVar);
                                            zzifsVar4 = this;
                                            str4 = str;
                                            i25 = i2;
                                            unsafe4 = unsafe8;
                                            i47 = zzn;
                                            i29 = i33;
                                            i26 = i65;
                                            if (i47 != i26) {
                                            }
                                        } else {
                                            zzicoVar2 = zzicoVar7;
                                            zzifsVar4 = this;
                                            i25 = i2;
                                            i26 = i65;
                                            i29 = i33;
                                            str4 = str;
                                            unsafe4 = unsafe8;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        if (i57 == 2) {
                                            int zza14 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i65, zzicoVar7);
                                            int i112 = zzicoVar7.zza;
                                            if (i112 < 0) {
                                                throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i112 > bArr.length - zza14) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i112 == 0) {
                                                zzieqVar2.add(com.google.android.gms.internal.ads.zzida.zza);
                                            } else {
                                                zzieqVar2.add(com.google.android.gms.internal.ads.zzida.zzt(bArr, zza14, i112));
                                                zza14 += i112;
                                            }
                                            while (zza14 < i2) {
                                                int zza15 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza14, zzicoVar7);
                                                if (i58 == zzicoVar7.zza) {
                                                    zza14 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza15, zzicoVar7);
                                                    int i113 = zzicoVar7.zza;
                                                    if (i113 < 0) {
                                                        throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i113 > bArr.length - zza14) {
                                                        throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i113 == 0) {
                                                        zzieqVar2.add(com.google.android.gms.internal.ads.zzida.zza);
                                                    } else {
                                                        zzieqVar2.add(com.google.android.gms.internal.ads.zzida.zzt(bArr, zza14, i113));
                                                        zza14 += i113;
                                                    }
                                                } else {
                                                    i25 = i2;
                                                    i26 = i65;
                                                    zzicoVar2 = zzicoVar7;
                                                    i29 = i56;
                                                    str4 = str;
                                                    zzifsVar4 = this;
                                                    i47 = zza14;
                                                    unsafe4 = unsafe8;
                                                    if (i47 != i26) {
                                                    }
                                                }
                                            }
                                            i25 = i2;
                                            i26 = i65;
                                            zzicoVar2 = zzicoVar7;
                                            i29 = i56;
                                            str4 = str;
                                            zzifsVar4 = this;
                                            i47 = zza14;
                                            unsafe4 = unsafe8;
                                            if (i47 != i26) {
                                            }
                                        } else {
                                            i25 = i2;
                                            i26 = i65;
                                            zzicoVar2 = zzicoVar7;
                                            i29 = i56;
                                            str4 = str;
                                            zzifsVar4 = this;
                                            unsafe4 = unsafe8;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i34 = i2;
                                        i33 = i56;
                                        if (i57 == 2) {
                                            zzicoVar5 = zzicoVar7;
                                            zzl = com.google.android.gms.internal.ads.zzicp.zzm(bArr, i65, zzieqVar2, zzicoVar7);
                                            i35 = i65;
                                            i36 = i34;
                                            unsafe5 = unsafe8;
                                            zzifsVar5 = this;
                                        } else {
                                            if (i57 == 0) {
                                                zzicoVar5 = zzicoVar7;
                                                i35 = i65;
                                                i36 = i34;
                                                unsafe5 = unsafe8;
                                                zzifsVar5 = this;
                                                zzl = com.google.android.gms.internal.ads.zzicp.zzl(i58, bArr, i65, i2, zzieqVar2, zzicoVar);
                                            }
                                            zzifsVar4 = this;
                                            zzicoVar2 = zzicoVar7;
                                            i26 = i65;
                                            i25 = i34;
                                            i29 = i33;
                                            str4 = str;
                                            unsafe4 = unsafe8;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        com.google.android.gms.internal.ads.zzigi.zzJ(obj, i82, zzieqVar2, zzifsVar5.zzs(i33), null, zzifsVar5.zzm);
                                        i47 = zzl;
                                        zzicoVar2 = zzicoVar5;
                                        zzifsVar4 = zzifsVar5;
                                        str4 = str;
                                        sun.misc.Unsafe unsafe12 = unsafe5;
                                        i25 = i36;
                                        i26 = i35;
                                        i29 = i33;
                                        unsafe4 = unsafe12;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i34 = i2;
                                        i33 = i56;
                                        if (i57 == 2) {
                                            int i114 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzief zziefVar3 = (com.google.android.gms.internal.ads.zzief) zzieqVar2;
                                            zza2 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i65, zzicoVar7);
                                            int i115 = zzicoVar7.zza + zza2;
                                            while (zza2 < i115) {
                                                zza2 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza2, zzicoVar7);
                                                zziefVar3.zzi(com.google.android.gms.internal.ads.zzide.zzM(zzicoVar7.zza));
                                            }
                                            if (zza2 != i115) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                int i116 = com.google.android.gms.internal.ads.zzicp.zza;
                                                com.google.android.gms.internal.ads.zzief zziefVar4 = (com.google.android.gms.internal.ads.zzief) zzieqVar2;
                                                zza2 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i65, zzicoVar7);
                                                zziefVar4.zzi(com.google.android.gms.internal.ads.zzide.zzM(zzicoVar7.zza));
                                                while (zza2 < i34) {
                                                    int zza16 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza2, zzicoVar7);
                                                    if (i58 == zzicoVar7.zza) {
                                                        zza2 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza16, zzicoVar7);
                                                        zziefVar4.zzi(com.google.android.gms.internal.ads.zzide.zzM(zzicoVar7.zza));
                                                    }
                                                }
                                            }
                                            zzifsVar4 = this;
                                            zzicoVar2 = zzicoVar7;
                                            i26 = i65;
                                            i25 = i34;
                                            i29 = i33;
                                            str4 = str;
                                            unsafe4 = unsafe8;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        zzifsVar4 = this;
                                        zzicoVar2 = zzicoVar7;
                                        i47 = zza2;
                                        i26 = i65;
                                        i25 = i34;
                                        i29 = i33;
                                        str4 = str;
                                        unsafe4 = unsafe8;
                                        if (i47 != i26) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i57 == 2) {
                                            int i117 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzifd zzifdVar5 = (com.google.android.gms.internal.ads.zzifd) zzieqVar2;
                                            int zza17 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i65, zzicoVar7);
                                            int i118 = zzicoVar7.zza + zza17;
                                            while (zza17 < i118) {
                                                zza17 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, zza17, zzicoVar7);
                                                zzifdVar5.zzd(com.google.android.gms.internal.ads.zzide.zzN(zzicoVar7.zzb));
                                            }
                                            if (zza17 != i118) {
                                                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzifsVar4 = this;
                                            i25 = i2;
                                            zzicoVar2 = zzicoVar7;
                                            i47 = zza17;
                                            i26 = i65;
                                            unsafe4 = unsafe8;
                                            i29 = i56;
                                            str4 = str;
                                            if (i47 != i26) {
                                            }
                                        } else if (i57 == 0) {
                                            int i119 = com.google.android.gms.internal.ads.zzicp.zza;
                                            com.google.android.gms.internal.ads.zzifd zzifdVar6 = (com.google.android.gms.internal.ads.zzifd) zzieqVar2;
                                            zza2 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, i65, zzicoVar7);
                                            zzifdVar6.zzd(com.google.android.gms.internal.ads.zzide.zzN(zzicoVar7.zzb));
                                            i34 = i2;
                                            i33 = i56;
                                            while (zza2 < i34) {
                                                int zza18 = com.google.android.gms.internal.ads.zzicp.zza(bArr, zza2, zzicoVar7);
                                                if (i58 == zzicoVar7.zza) {
                                                    zza2 = com.google.android.gms.internal.ads.zzicp.zzc(bArr, zza18, zzicoVar7);
                                                    zzifdVar6.zzd(com.google.android.gms.internal.ads.zzide.zzN(zzicoVar7.zzb));
                                                } else {
                                                    zzifsVar4 = this;
                                                    zzicoVar2 = zzicoVar7;
                                                    i47 = zza2;
                                                    i26 = i65;
                                                    i25 = i34;
                                                    i29 = i33;
                                                    str4 = str;
                                                    unsafe4 = unsafe8;
                                                    if (i47 != i26) {
                                                    }
                                                }
                                            }
                                            zzifsVar4 = this;
                                            zzicoVar2 = zzicoVar7;
                                            i47 = zza2;
                                            i26 = i65;
                                            i25 = i34;
                                            i29 = i33;
                                            str4 = str;
                                            unsafe4 = unsafe8;
                                            if (i47 != i26) {
                                            }
                                        } else {
                                            zzifsVar4 = this;
                                            i25 = i2;
                                            zzicoVar2 = zzicoVar7;
                                            i26 = i65;
                                            unsafe4 = unsafe8;
                                            i29 = i56;
                                            str4 = str;
                                            i47 = i26;
                                            if (i47 != i26) {
                                            }
                                        }
                                        break;
                                    default:
                                        zzifsVar4 = this;
                                        i25 = i2;
                                        zzicoVar2 = zzicoVar7;
                                        i26 = i65;
                                        unsafe4 = unsafe8;
                                        str3 = str;
                                        i27 = i56;
                                        if (i57 == 3) {
                                            int i120 = (i58 & (-8)) | 4;
                                            com.google.android.gms.internal.ads.zzigh zzq2 = zzifsVar4.zzq(i27);
                                            str4 = str3;
                                            i29 = i27;
                                            i47 = com.google.android.gms.internal.ads.zzicp.zzi(zzq2, bArr, i26, i2, i120, zzicoVar);
                                            zzieqVar2.add(zzicoVar2.zzc);
                                            while (i47 < i25) {
                                                int zza19 = com.google.android.gms.internal.ads.zzicp.zza(bArr, i47, zzicoVar2);
                                                if (i58 == zzicoVar2.zza) {
                                                    i47 = com.google.android.gms.internal.ads.zzicp.zzi(zzq2, bArr, zza19, i2, i120, zzicoVar);
                                                    zzieqVar2.add(zzicoVar2.zzc);
                                                } else if (i47 != i26) {
                                                }
                                            }
                                            if (i47 != i26) {
                                            }
                                        }
                                        str4 = str3;
                                        i29 = i27;
                                        i47 = i26;
                                        if (i47 != i26) {
                                        }
                                        break;
                                }
                            }
                        } else if (i57 == 2) {
                            com.google.android.gms.internal.ads.zzieq zzieqVar3 = (com.google.android.gms.internal.ads.zzieq) unsafe8.getObject(obj6, j2);
                            if (!zzieqVar3.zza()) {
                                int size2 = zzieqVar3.size();
                                zzieqVar3 = zzieqVar3.zzh(size2 == 0 ? 10 : size2 + size2);
                                unsafe8.putObject(obj6, j2, zzieqVar3);
                            }
                            com.google.android.gms.internal.ads.zzieq zzieqVar4 = zzieqVar3;
                            i48 = i55;
                            int zzn2 = com.google.android.gms.internal.ads.zzicp.zzn(zzifsVar8.zzq(i56), i58, bArr, i65, i2, zzieqVar4, zzicoVar);
                            i45 = i2;
                            i46 = i3;
                            zzicoVar6 = zzicoVar7;
                            i47 = zzn2;
                            unsafe7 = unsafe8;
                            i50 = i58;
                            i52 = i12;
                            zzifsVar7 = zzifsVar8;
                            i49 = i56;
                            i51 = i11;
                        } else {
                            zzicoVar4 = zzicoVar7;
                            i22 = i65;
                            i23 = i56;
                            unsafe3 = unsafe8;
                            str2 = str;
                            i24 = i55;
                            str = str2;
                            i7 = i58;
                            zzicoVar2 = zzicoVar4;
                            i14 = i23;
                            i10 = i22;
                            i13 = i24;
                            unsafe = unsafe3;
                            zzifsVar = this;
                        }
                        obj2 = obj;
                        i5 = i3;
                    }
                }
                if (i7 != i5 || i5 == 0) {
                    if (zzifsVar.zzh) {
                        com.google.android.gms.internal.ads.zzido zzidoVar = zzicoVar2.zzd;
                        int i121 = com.google.android.gms.internal.ads.zzido.zzb;
                        int i122 = com.google.android.gms.internal.ads.zzicn.zza;
                        if (zzidoVar != com.google.android.gms.internal.ads.zzido.zza) {
                            com.google.android.gms.internal.ads.zzifp zzifpVar = zzifsVar.zzg;
                            int i123 = com.google.android.gms.internal.ads.zzicp.zza;
                            if (zzidoVar.zzc(zzifpVar, i13) != null) {
                                throw null;
                            }
                            i15 = i2;
                            i47 = com.google.android.gms.internal.ads.zzicp.zzo(i7, bArr, i10, i2, zzh(obj), zzicoVar);
                            i46 = i5;
                            i48 = i13;
                            i50 = i7;
                            zzifsVar7 = zzifsVar;
                            i51 = i11;
                            i52 = i12;
                            i49 = i14;
                            i45 = i15;
                            zzicoVar6 = zzicoVar2;
                            obj6 = obj2;
                            unsafe7 = unsafe;
                        }
                    }
                    i15 = i2;
                    i47 = com.google.android.gms.internal.ads.zzicp.zzo(i7, bArr, i10, i2, zzh(obj), zzicoVar);
                    i46 = i5;
                    i48 = i13;
                    i50 = i7;
                    zzifsVar7 = zzifsVar;
                    i51 = i11;
                    i52 = i12;
                    i49 = i14;
                    i45 = i15;
                    zzicoVar6 = zzicoVar2;
                    obj6 = obj2;
                    unsafe7 = unsafe;
                } else {
                    i4 = i2;
                    i6 = i10;
                    i51 = i11;
                    i52 = i12;
                }
            } else {
                str = "Failed to parse the message.";
                unsafe = unsafe7;
                i4 = i45;
                zzifsVar = zzifsVar7;
                obj2 = obj6;
                i5 = i46;
                i6 = i47;
                i7 = i50;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzj(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        zzi(obj, bArr, i, i2, 0, zzicoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzk(java.lang.Object obj) {
        if (zzE(obj)) {
            if (obj instanceof com.google.android.gms.internal.ads.zziee) {
                com.google.android.gms.internal.ads.zziee zzieeVar = (com.google.android.gms.internal.ads.zziee) obj;
                zzieeVar.zzbq();
                zzieeVar.zzbb();
                zzieeVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzA = zzA(i);
                int i2 = 1048575 & zzA;
                int zzC = zzC(zzA);
                long j = i2;
                if (zzC != 9) {
                    if (zzC != 60 && zzC != 68) {
                        switch (zzC) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((com.google.android.gms.internal.ads.zzieq) com.google.android.gms.internal.ads.zziha.zzm(obj, j)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.gms.internal.ads.zzifj) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                }
                if (zzK(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzl(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int zzA = zzA(i6);
            int[] iArr = this.zzc;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = zzb.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzA) != 0 && !zzJ(obj, i6, i, i2, i9)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzM(obj, iArr[i6], i6) && !zzy(obj, zzA, zzq(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC != 50) {
                            continue;
                        } else {
                            com.google.android.gms.internal.ads.zzifj zzifjVar = (com.google.android.gms.internal.ads.zzifj) com.google.android.gms.internal.ads.zziha.zzm(obj, zzA & 1048575);
                            if (!zzifjVar.isEmpty() && ((com.google.android.gms.internal.ads.zzifi) zzr(i6)).zze().zzc.zza() == com.google.android.gms.internal.ads.zzihh.MESSAGE) {
                                com.google.android.gms.internal.ads.zzigh zzighVar = null;
                                for (java.lang.Object obj2 : zzifjVar.values()) {
                                    if (zzighVar == null) {
                                        zzighVar = com.google.android.gms.internal.ads.zzifz.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzighVar.zzl(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.ads.zziha.zzm(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.gms.internal.ads.zzigh zzq = zzq(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzq.zzl(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i9) && !zzy(obj, zzA, zzq(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || ((com.google.android.gms.internal.ads.zziea) obj).zza.zze();
    }
}
