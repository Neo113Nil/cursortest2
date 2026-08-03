package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzno<T> implements com.google.android.gms.internal.measurement.zznw<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.measurement.zzoo.zzq();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.measurement.zznl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final com.google.android.gms.internal.measurement.zzoh zzl;
    private final com.google.android.gms.internal.measurement.zzlr zzm;

    private zzno(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.measurement.zznl zznlVar, boolean z, int[] iArr2, int i3, int i4, com.google.android.gms.internal.measurement.zznq zznqVar, com.google.android.gms.internal.measurement.zzmx zzmxVar, com.google.android.gms.internal.measurement.zzoh zzohVar, com.google.android.gms.internal.measurement.zzlr zzlrVar, com.google.android.gms.internal.measurement.zzng zzngVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlrVar != null && (zznlVar instanceof com.google.android.gms.internal.measurement.zzmb)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzohVar;
        this.zzm = zzlrVar;
        this.zzg = zznlVar;
    }

    private static boolean zzA(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzme) {
            return ((com.google.android.gms.internal.measurement.zzme) obj).zzcf();
        }
        return true;
    }

    private static void zzB(java.lang.Object obj) {
        if (zzA(obj)) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        java.lang.String.valueOf(valueOf);
        throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static double zzC(java.lang.Object obj, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).doubleValue();
    }

    private static float zzD(java.lang.Object obj, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).floatValue();
    }

    private static int zzE(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).intValue();
    }

    private static long zzF(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).longValue();
    }

    private static boolean zzG(java.lang.Object obj, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzJ(obj, i) == zzJ(obj2, i);
    }

    private final boolean zzI(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzJ(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzJ(java.lang.Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzx = zzx(i);
        long j2 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.measurement.zzoo.zzl(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.measurement.zzoo.zzj(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.measurement.zzoo.zzf(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.measurement.zzoo.zzf(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.measurement.zzoo.zzd(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.measurement.zzoo.zzf(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.measurement.zzoo.zzd(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.measurement.zzoo.zzh(obj, j2);
            case 8:
                java.lang.Object zzn = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j2);
                if (zzn instanceof java.lang.String) {
                    return !((java.lang.String) zzn).isEmpty();
                }
                if (zzn instanceof com.google.android.gms.internal.measurement.zzlg) {
                    return !com.google.android.gms.internal.measurement.zzlg.zzb.equals(zzn);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.measurement.zzoo.zzn(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.measurement.zzlg.zzb.equals(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j2));
            case 11:
                return com.google.android.gms.internal.measurement.zzoo.zzd(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.measurement.zzoo.zzd(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.measurement.zzoo.zzd(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.measurement.zzoo.zzf(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.measurement.zzoo.zzd(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.measurement.zzoo.zzf(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.measurement.zzoo.zzn(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final void zzK(java.lang.Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, (1 << (zzy >>> 20)) | com.google.android.gms.internal.measurement.zzoo.zzd(obj, j));
    }

    private final boolean zzL(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.measurement.zzoo.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzM(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.measurement.zzoo.zze(obj, zzy(i2) & 1048575, i);
    }

    private final int zzN(int i, int i2) {
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

    private static final int zzO(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzos zzosVar, java.lang.Class cls, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        int i3;
        com.google.android.gms.internal.measurement.zzos zzosVar2 = com.google.android.gms.internal.measurement.zzos.DOUBLE;
        switch (zzosVar) {
            case DOUBLE:
                i3 = i + 8;
                zzkvVar.zzc = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i)));
                break;
            case FLOAT:
                i3 = i + 4;
                zzkvVar.zzc = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i)));
                break;
            case INT64:
            case UINT64:
                int zzc = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i, zzkvVar);
                zzkvVar.zzc = java.lang.Long.valueOf(zzkvVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i, zzkvVar);
                zzkvVar.zzc = java.lang.Integer.valueOf(zzkvVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                zzkvVar.zzc = java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                zzkvVar.zzc = java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i));
                break;
            case BOOL:
                int zzc2 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i, zzkvVar);
                zzkvVar.zzc = java.lang.Boolean.valueOf(zzkvVar.zzb != 0);
                return zzc2;
            case STRING:
                return com.google.android.gms.internal.measurement.zzkw.zzf(bArr, i, zzkvVar);
            case GROUP:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case MESSAGE:
                return com.google.android.gms.internal.measurement.zzkw.zzh(com.google.android.gms.internal.measurement.zznt.zza().zzb(cls), bArr, i, i2, zzkvVar);
            case BYTES:
                return com.google.android.gms.internal.measurement.zzkw.zzg(bArr, i, zzkvVar);
            case SINT32:
                int zza3 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i, zzkvVar);
                zzkvVar.zzc = java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzli.zzb(zzkvVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i, zzkvVar);
                zzkvVar.zzc = java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzli.zzc(zzkvVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzP(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzou zzouVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzouVar.zzm(i, (java.lang.String) obj);
        } else {
            zzouVar.zzn(i, (com.google.android.gms.internal.measurement.zzlg) obj);
        }
    }

    static com.google.android.gms.internal.measurement.zzoi zzg(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) obj;
        com.google.android.gms.internal.measurement.zzoi zzoiVar = zzmeVar.zzc;
        if (zzoiVar != com.google.android.gms.internal.measurement.zzoi.zza()) {
            return zzoiVar;
        }
        com.google.android.gms.internal.measurement.zzoi zzb2 = com.google.android.gms.internal.measurement.zzoi.zzb();
        zzmeVar.zzc = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.measurement.zzno zzl(java.lang.Class cls, com.google.android.gms.internal.measurement.zzni zzniVar, com.google.android.gms.internal.measurement.zznq zznqVar, com.google.android.gms.internal.measurement.zzmx zzmxVar, com.google.android.gms.internal.measurement.zzoh zzohVar, com.google.android.gms.internal.measurement.zzlr zzlrVar, com.google.android.gms.internal.measurement.zzng zzngVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        com.google.android.gms.internal.measurement.zznv zznvVar;
        java.lang.String str;
        int objectFieldOffset;
        int i19;
        java.lang.Class<?> cls2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.reflect.Field zzm;
        int i26;
        char charAt11;
        int i27;
        int i28;
        int i29;
        int i30;
        java.lang.Object obj;
        java.lang.reflect.Field zzm2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzm3;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        if (!(zzniVar instanceof com.google.android.gms.internal.measurement.zznv)) {
            throw null;
        }
        com.google.android.gms.internal.measurement.zznv zznvVar2 = (com.google.android.gms.internal.measurement.zznv) zzniVar;
        java.lang.String zzd = zznvVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (zzd.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i37 = charAt16 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt15 = zzd.charAt(i36);
                if (charAt15 < 55296) {
                    break;
                }
                i37 |= (charAt15 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt16 = i37 | (charAt15 << i38);
            i36 = i34;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i6 = 0;
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt17 = zzd.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt10 = zzd.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt10 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt9 = zzd.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt9 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt8 = zzd.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt8 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            int charAt20 = zzd.charAt(i45);
            if (charAt20 >= 55296) {
                int i49 = charAt20 & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt7 = zzd.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt20 = i49 | (charAt7 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            charAt = zzd.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt6 = zzd.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt = i52 | (charAt6 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            charAt2 = zzd.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt5 = zzd.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt2 = i55 | (charAt5 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt21 = zzd.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt4 = zzd.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt21 = i58 | (charAt4 << i59);
                i57 = i8;
            }
            int i60 = i57 + 1;
            int charAt22 = zzd.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i7 = i60 + 1;
                    charAt3 = zzd.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i7;
                }
                charAt22 = i61 | (charAt3 << i62);
                i60 = i7;
            }
            int i63 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i2 = charAt19;
            i3 = charAt22;
            i4 = i63;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt17;
            i36 = i60;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zznvVar2.zze();
        java.lang.Class<?> cls3 = zznvVar2.zzb().getClass();
        int i64 = i3 + charAt2;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[i65];
        int i66 = i3;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = zzd.charAt(i36);
            if (charAt23 >= c) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt14 = zzd.charAt(i72);
                    if (charAt14 < c) {
                        break;
                    }
                    i71 |= (charAt14 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                charAt23 = i71 | (charAt14 << i73);
                i15 = i33;
            } else {
                i15 = i70;
            }
            int i74 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    charAt13 = zzd.charAt(i76);
                    if (charAt13 < c) {
                        break;
                    }
                    i75 |= (charAt13 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                }
                charAt24 = i75 | (charAt13 << i77);
                i16 = i32;
            } else {
                i16 = i74;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt24 & 255;
            int i79 = length;
            int i80 = charAt24 & 2048;
            int i81 = i5;
            if (i78 >= 51) {
                int i82 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i31 = i84 + 1;
                        charAt12 = zzd.charAt(i84);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i83 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i84 = i31;
                        i2 = i17;
                    }
                    charAt25 = i83 | (charAt12 << i85);
                    i29 = i31;
                } else {
                    i17 = i2;
                    i29 = i82;
                }
                int i86 = i78 - 51;
                int i87 = i29;
                if (i86 == 9 || i86 == 17) {
                    i30 = i4 + 1;
                    int i88 = i69 / 3;
                    objArr[i88 + i88 + 1] = zze[i4];
                } else {
                    if (i86 == 12) {
                        if (zznvVar2.zzc() == 1 || i80 != 0) {
                            i30 = i4 + 1;
                            int i89 = i69 / 3;
                            objArr[i89 + i89 + 1] = zze[i4];
                        } else {
                            i80 = 0;
                        }
                    }
                    int i90 = charAt25 + charAt25;
                    obj = zze[i90];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzm2 = zzm(cls3, (java.lang.String) obj);
                        zze[i90] = zzm2;
                    } else {
                        zzm2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzm2);
                    int i91 = i90 + 1;
                    obj2 = zze[i91];
                    int i92 = i80;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzm3 = zzm(cls3, (java.lang.String) obj2);
                        zze[i91] = zzm3;
                    } else {
                        zzm3 = (java.lang.reflect.Field) obj2;
                    }
                    i22 = (int) unsafe.objectFieldOffset(zzm3);
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i92;
                    zznvVar = zznvVar2;
                    cls2 = cls3;
                    i23 = i87;
                    i18 = charAt23;
                    str = zzd;
                    i21 = 0;
                }
                i4 = i30;
                int i902 = charAt25 + charAt25;
                obj = zze[i902];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzm2);
                int i912 = i902 + 1;
                obj2 = zze[i912];
                int i922 = i80;
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                i22 = (int) unsafe.objectFieldOffset(zzm3);
                objectFieldOffset = objectFieldOffset22;
                i24 = i922;
                zznvVar = zznvVar2;
                cls2 = cls3;
                i23 = i87;
                i18 = charAt23;
                str = zzd;
                i21 = 0;
            } else {
                i17 = i2;
                int i93 = i4 + 1;
                java.lang.reflect.Field zzm4 = zzm(cls3, (java.lang.String) zze[i4]);
                i18 = charAt23;
                if (i78 == 9 || i78 == 17) {
                    zznvVar = zznvVar2;
                    int i94 = i69 / 3;
                    objArr[i94 + i94 + 1] = zzm4.getType();
                } else {
                    if (i78 == 27) {
                        zznvVar = zznvVar2;
                        i27 = 1;
                        i28 = i4 + 2;
                    } else if (i78 == 49) {
                        i28 = i4 + 2;
                        zznvVar = zznvVar2;
                        i27 = 1;
                    } else {
                        if (i78 == 12 || i78 == 30 || i78 == 44) {
                            zznvVar = zznvVar2;
                            if (zznvVar2.zzc() == 1 || i80 != 0) {
                                i28 = i4 + 2;
                                int i95 = i69 / 3;
                                objArr[i95 + i95 + 1] = zze[i93];
                                str = zzd;
                                i93 = i28;
                            } else {
                                str = zzd;
                                i80 = 0;
                            }
                        } else if (i78 == 50) {
                            int i96 = i4 + 2;
                            int i97 = i66 + 1;
                            iArr[i66] = i69;
                            int i98 = i69 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = zze[i93];
                            if (i80 != 0) {
                                i93 = i4 + 3;
                                objArr[i99 + 1] = zze[i96];
                                str = zzd;
                                i66 = i97;
                                zznvVar = zznvVar2;
                            } else {
                                i93 = i96;
                                i66 = i97;
                                i80 = 0;
                                zznvVar = zznvVar2;
                            }
                        } else {
                            zznvVar = zznvVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            i19 = i80;
                            cls2 = cls3;
                            i20 = i16;
                            i21 = 0;
                            i22 = 1048575;
                        } else {
                            int i100 = i16 + 1;
                            int charAt26 = str.charAt(i16);
                            if (charAt26 >= 55296) {
                                int i101 = charAt26 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i26 = i100 + 1;
                                    charAt11 = str.charAt(i100);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i101 |= (charAt11 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i26;
                                }
                                charAt26 = i101 | (charAt11 << i102);
                                i25 = i26;
                            } else {
                                i25 = i100;
                            }
                            int i103 = i6 + i6 + (charAt26 / 32);
                            java.lang.Object obj3 = zze[i103];
                            i19 = i80;
                            if (obj3 instanceof java.lang.reflect.Field) {
                                zzm = (java.lang.reflect.Field) obj3;
                            } else {
                                zzm = zzm(cls3, (java.lang.String) obj3);
                                zze[i103] = zzm;
                            }
                            cls2 = cls3;
                            i21 = charAt26 % 32;
                            i20 = i25;
                            i22 = (int) unsafe.objectFieldOffset(zzm);
                        }
                        if (i78 >= 18 || i78 > 49) {
                            i23 = i20;
                            i4 = i93;
                        } else {
                            iArr[i67] = objectFieldOffset;
                            i67++;
                            i4 = i93;
                            i23 = i20;
                        }
                        i24 = i19;
                    }
                    int i104 = i69 / 3;
                    objArr[i104 + i104 + i27] = zze[i93];
                    str = zzd;
                    i93 = i28;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i19 = i80;
                    cls2 = cls3;
                    i20 = i16;
                    i21 = 0;
                    i22 = 1048575;
                    if (i78 >= 18) {
                    }
                    i23 = i20;
                    i4 = i93;
                    i24 = i19;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                if ((charAt24 & 4096) != 0) {
                }
                i19 = i80;
                cls2 = cls3;
                i20 = i16;
                i21 = 0;
                i22 = 1048575;
                if (i78 >= 18) {
                }
                i23 = i20;
                i4 = i93;
                i24 = i19;
            }
            int i105 = i69 + 1;
            iArr3[i69] = i18;
            int i106 = i69 + 2;
            java.lang.Class<?> cls4 = cls2;
            iArr3[i105] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i24 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i106] = (i21 << 20) | i22;
            zzd = str;
            length = i79;
            i5 = i81;
            zznvVar2 = zznvVar;
            i2 = i17;
            c = 55296;
            i36 = i23;
            cls3 = cls4;
        }
        return new com.google.android.gms.internal.measurement.zzno(iArr3, objArr, i2, i5, zznvVar2.zzb(), false, iArr, i3, i64, zznqVar, zzmxVar, zzohVar, zzlrVar, zzngVar);
    }

    private static java.lang.reflect.Field zzm(java.lang.Class cls, java.lang.String str) {
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

    private final void zzn(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzJ(obj2, i)) {
            int zzx = zzx(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzx;
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
            com.google.android.gms.internal.measurement.zznw zzp = zzp(i);
            if (!zzJ(obj, i)) {
                if (zzA(object)) {
                    java.lang.Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                java.lang.Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final void zzo(java.lang.Object obj, java.lang.Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzL(obj2, i2, i)) {
            int zzx = zzx(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzx;
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
            com.google.android.gms.internal.measurement.zznw zzp = zzp(i);
            if (!zzL(obj, i2, i)) {
                if (zzA(object)) {
                    java.lang.Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                java.lang.Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final com.google.android.gms.internal.measurement.zznw zzp(int i) {
        java.lang.Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.measurement.zznw zznwVar = (com.google.android.gms.internal.measurement.zznw) objArr[i3];
        if (zznwVar != null) {
            return zznwVar;
        }
        com.google.android.gms.internal.measurement.zznw zzb2 = com.google.android.gms.internal.measurement.zznt.zza().zzb((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzq(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final com.google.android.gms.internal.measurement.zzmj zzr(int i) {
        int i2 = i / 3;
        return (com.google.android.gms.internal.measurement.zzmj) this.zzd[i2 + i2 + 1];
    }

    private final java.lang.Object zzs(java.lang.Object obj, int i) {
        com.google.android.gms.internal.measurement.zznw zzp = zzp(i);
        int zzx = zzx(i) & 1048575;
        if (!zzJ(obj, i)) {
            return zzp.zza();
        }
        java.lang.Object object = zzb.getObject(obj, zzx);
        if (zzA(object)) {
            return object;
        }
        java.lang.Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(java.lang.Object obj, int i, java.lang.Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzK(obj, i);
    }

    private final java.lang.Object zzu(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.measurement.zznw zzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            return zzp.zza();
        }
        java.lang.Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            return object;
        }
        java.lang.Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzv(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
    }

    private static boolean zzw(java.lang.Object obj, int i, com.google.android.gms.internal.measurement.zznw zznwVar) {
        return zznwVar.zzk(com.google.android.gms.internal.measurement.zzoo.zzn(obj, i & 1048575));
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final java.lang.Object zza() {
        return ((com.google.android.gms.internal.measurement.zzme) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        boolean zzB;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzx = zzx(i);
            long j = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    if (zzH(obj, obj2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzoo.zzl(obj, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzoo.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzoo.zzj(obj, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzoo.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzf(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzf(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzf(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzh(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzf(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzd(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzoo.zzf(obj, j) == com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j))) {
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
                    zzB = com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j));
                    break;
                case 50:
                    zzB = com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (com.google.android.gms.internal.measurement.zzoo.zzd(obj, zzy) == com.google.android.gms.internal.measurement.zzoo.zzd(obj2, zzy) && com.google.android.gms.internal.measurement.zzny.zzB(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzB) {
                return false;
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzme) obj).zzc.equals(((com.google.android.gms.internal.measurement.zzme) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.equals(((com.google.android.gms.internal.measurement.zzmb) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zzc(java.lang.Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int hashCode = (i5 * 53) + ((com.google.android.gms.internal.measurement.zzme) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i4);
            int i6 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i7 = iArr[i4];
            long j = i6;
            int i8 = 37;
            switch (zzz) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzoo.zzl(obj, j));
                    byte[] bArr = com.google.android.gms.internal.measurement.zzmo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzoo.zzj(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.measurement.zzoo.zzf(obj, j);
                    byte[] bArr2 = com.google.android.gms.internal.measurement.zzmo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.measurement.zzoo.zzf(obj, j);
                    byte[] bArr3 = com.google.android.gms.internal.measurement.zzmo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzd(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.measurement.zzoo.zzf(obj, j);
                    byte[] bArr4 = com.google.android.gms.internal.measurement.zzmo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzd(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzmo.zzb(com.google.android.gms.internal.measurement.zzoo.zzh(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((java.lang.String) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i5 * 53;
                    java.lang.Object zzn = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j);
                    if (zzn != null) {
                        i8 = zzn.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzd(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzd(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzd(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.measurement.zzoo.zzf(obj, j);
                    byte[] bArr5 = com.google.android.gms.internal.measurement.zzmo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzd(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.measurement.zzoo.zzf(obj, j);
                    byte[] bArr6 = com.google.android.gms.internal.measurement.zzmo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i5 * 53;
                    java.lang.Object zzn2 = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j);
                    if (zzn2 != null) {
                        i8 = zzn2.hashCode();
                    }
                    i5 = i3 + i8;
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
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = com.google.android.gms.internal.measurement.zzmo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(zzD(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = com.google.android.gms.internal.measurement.zzmo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = com.google.android.gms.internal.measurement.zzmo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzE(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = com.google.android.gms.internal.measurement.zzmo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzE(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.measurement.zzmo.zzb(zzG(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.String) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzE(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzE(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzE(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = com.google.android.gms.internal.measurement.zzmo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzE(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = com.google.android.gms.internal.measurement.zzmo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.measurement.zzoo.zzn(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzd(java.lang.Object obj, java.lang.Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                com.google.android.gms.internal.measurement.zzny.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    com.google.android.gms.internal.measurement.zzny.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int i2 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i3 = iArr[i];
            long j = i2;
            switch (zzz) {
                case 0:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzm(obj, j, com.google.android.gms.internal.measurement.zzoo.zzl(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzk(obj, j, com.google.android.gms.internal.measurement.zzoo.zzj(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzg(obj, j, com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzg(obj, j, com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzg(obj, j, com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzi(obj, j, com.google.android.gms.internal.measurement.zzoo.zzh(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 8:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzo(obj, j, com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i);
                    break;
                case 10:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzo(obj, j, com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 11:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzg(obj, j, com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zze(obj, j, com.google.android.gms.internal.measurement.zzoo.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzg(obj, j, com.google.android.gms.internal.measurement.zzoo.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i);
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
                    com.google.android.gms.internal.measurement.zzmn zzmnVar = (com.google.android.gms.internal.measurement.zzmn) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j);
                    com.google.android.gms.internal.measurement.zzmn zzmnVar2 = (com.google.android.gms.internal.measurement.zzmn) com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j);
                    int size = zzmnVar.size();
                    int size2 = zzmnVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmnVar.zza()) {
                            zzmnVar = zzmnVar.zzg(size2 + size);
                        }
                        zzmnVar.addAll(zzmnVar2);
                    }
                    if (size > 0) {
                        zzmnVar2 = zzmnVar;
                    }
                    com.google.android.gms.internal.measurement.zzoo.zzo(obj, j, zzmnVar2);
                    break;
                case 50:
                    int i4 = com.google.android.gms.internal.measurement.zzny.zza;
                    com.google.android.gms.internal.measurement.zzoo.zzo(obj, j, com.google.android.gms.internal.measurement.zzng.zza(com.google.android.gms.internal.measurement.zzoo.zzn(obj, j), com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j)));
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
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzo(obj, j, com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 60:
                    zzo(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.measurement.zzoo.zzo(obj, j, com.google.android.gms.internal.measurement.zzoo.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zze(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int zzz4;
        int zzz5;
        int zzc;
        int zzz6;
        int zzz7;
        int zzo;
        int size;
        int zzz8;
        int zzz9;
        int zzz10;
        int zzx;
        int zzz11;
        int zzz12;
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
                int zzi = i9 + ((com.google.android.gms.internal.measurement.zzme) obj).zzc.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                com.google.android.gms.internal.measurement.zzod zzodVar = ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zza;
                int zzc2 = zzodVar.zzc();
                int i10 = 0;
                for (int i11 = 0; i11 < zzc2; i11++) {
                    java.util.Map.Entry zzd = zzodVar.zzd(i11);
                    i10 += com.google.android.gms.internal.measurement.zzlv.zzj((com.google.android.gms.internal.measurement.zzlu) ((com.google.android.gms.internal.measurement.zzoa) zzd).zza(), zzd.getValue());
                }
                for (java.util.Map.Entry entry : zzodVar.zze()) {
                    i10 += com.google.android.gms.internal.measurement.zzlv.zzj((com.google.android.gms.internal.measurement.zzlu) entry.getKey(), entry.getValue());
                }
                return zzi + i10;
            }
            int zzx2 = zzx(i8);
            int zzz13 = zzz(zzx2);
            int i12 = iArr[i8];
            int i13 = iArr[i8 + 2];
            int i14 = i13 & i5;
            if (zzz13 <= 17) {
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
            int i15 = zzx2 & i5;
            if (zzz13 >= com.google.android.gms.internal.measurement.zzlw.DOUBLE_LIST_PACKED.zza()) {
                com.google.android.gms.internal.measurement.zzlw.SINT64_LIST_PACKED.zza();
            }
            long j = i15;
            switch (zzz13) {
                case 0:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz + 8;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz2 + 4;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(j2);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(j3);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(j4);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz + 8;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz2 + 4;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz4 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz4 + 1;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzI(obj, i8, i, i2, i3)) {
                        break;
                    } else {
                        int i16 = i12 << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.gms.internal.measurement.zzlg) {
                            zzz5 = com.google.android.gms.internal.measurement.zzll.zzz(i16);
                            zzc = ((com.google.android.gms.internal.measurement.zzlg) object).zzc();
                            zzz6 = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                            zzz7 = zzz5 + zzz6 + zzc;
                            i9 += zzz7;
                            break;
                        } else {
                            zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i16);
                            zzA = com.google.android.gms.internal.measurement.zzll.zzB((java.lang.String) object);
                            zzz7 = zzz3 + zzA;
                            i9 += zzz7;
                        }
                    }
                case 9:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz7 = com.google.android.gms.internal.measurement.zzny.zzz(i12, unsafe.getObject(obj, j), zzp(i8));
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzI(obj, i8, i, i2, i3)) {
                        com.google.android.gms.internal.measurement.zzlg zzlgVar = (com.google.android.gms.internal.measurement.zzlg) unsafe.getObject(obj, j);
                        zzz5 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzc = zzlgVar.zzc();
                        zzz6 = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                        zzz7 = zzz5 + zzz6 + zzc;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj, i8, i, i2, i3)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzz(i17);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj, i8, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(j5);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz2 + 4;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz + 8;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj, i8, i, i2, i3)) {
                        int i18 = unsafe.getInt(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzz((i18 >> 31) ^ (i18 + i18));
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj, i8, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA((j6 >> 63) ^ (j6 + j6));
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzI(obj, i8, i, i2, i3)) {
                        zzz7 = com.google.android.gms.internal.measurement.zzll.zzG(i12, (com.google.android.gms.internal.measurement.zznl) unsafe.getObject(obj, j), zzp(i8));
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzz7 = com.google.android.gms.internal.measurement.zzny.zzy(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzz7;
                    break;
                case 19:
                    zzz7 = com.google.android.gms.internal.measurement.zzny.zzw(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzz7;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    int i19 = com.google.android.gms.internal.measurement.zzny.zza;
                    if (list.size() != 0) {
                        zzo = com.google.android.gms.internal.measurement.zzny.zzo(list) + (list.size() * com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3));
                        i9 += zzo;
                        break;
                    }
                    zzo = 0;
                    i9 += zzo;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    int i20 = com.google.android.gms.internal.measurement.zzny.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = com.google.android.gms.internal.measurement.zzny.zzp(list2);
                        zzz8 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = size * zzz8;
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    int i21 = com.google.android.gms.internal.measurement.zzny.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = com.google.android.gms.internal.measurement.zzny.zzs(list3);
                        zzz8 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = size * zzz8;
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 23:
                    zzz7 = com.google.android.gms.internal.measurement.zzny.zzy(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzz7;
                    break;
                case 24:
                    zzz7 = com.google.android.gms.internal.measurement.zzny.zzw(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzz7;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    int i22 = com.google.android.gms.internal.measurement.zzny.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzz7 = size2 * (com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3) + 1);
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 26:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    int i23 = com.google.android.gms.internal.measurement.zzny.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzo = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3) * size3;
                        if (list5 instanceof com.google.android.gms.internal.measurement.zzmw) {
                            com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                java.lang.Object zzc3 = zzmwVar.zzc();
                                if (zzc3 instanceof com.google.android.gms.internal.measurement.zzlg) {
                                    int zzc4 = ((com.google.android.gms.internal.measurement.zzlg) zzc3).zzc();
                                    zzo += com.google.android.gms.internal.measurement.zzll.zzz(zzc4) + zzc4;
                                } else {
                                    zzo += com.google.android.gms.internal.measurement.zzll.zzB((java.lang.String) zzc3);
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size3; i25++) {
                                java.lang.Object obj2 = list5.get(i25);
                                if (obj2 instanceof com.google.android.gms.internal.measurement.zzlg) {
                                    int zzc5 = ((com.google.android.gms.internal.measurement.zzlg) obj2).zzc();
                                    zzo += com.google.android.gms.internal.measurement.zzll.zzz(zzc5) + zzc5;
                                } else {
                                    zzo += com.google.android.gms.internal.measurement.zzll.zzB((java.lang.String) obj2);
                                }
                            }
                        }
                        i9 += zzo;
                        break;
                    }
                    zzo = 0;
                    i9 += zzo;
                case 27:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zznw zzp = zzp(i8);
                    int i26 = com.google.android.gms.internal.measurement.zzny.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzz9 = 0;
                    } else {
                        zzz9 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            java.lang.Object obj3 = list6.get(i27);
                            if (obj3 instanceof com.google.android.gms.internal.measurement.zzmv) {
                                int zzb2 = ((com.google.android.gms.internal.measurement.zzmv) obj3).zzb();
                                zzz9 += com.google.android.gms.internal.measurement.zzll.zzz(zzb2) + zzb2;
                            } else {
                                zzz9 += com.google.android.gms.internal.measurement.zzll.zzD((com.google.android.gms.internal.measurement.zznl) obj3, zzp);
                            }
                        }
                    }
                    i9 += zzz9;
                    break;
                case 28:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    int i28 = com.google.android.gms.internal.measurement.zzny.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzz10 = 0;
                    } else {
                        zzz10 = size5 * com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int zzc6 = ((com.google.android.gms.internal.measurement.zzlg) list7.get(i29)).zzc();
                            zzz10 += com.google.android.gms.internal.measurement.zzll.zzz(zzc6) + zzc6;
                        }
                    }
                    i9 += zzz10;
                    break;
                case 29:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    int i30 = com.google.android.gms.internal.measurement.zzny.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = com.google.android.gms.internal.measurement.zzny.zzt(list8);
                        zzz8 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = size * zzz8;
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 30:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    int i31 = com.google.android.gms.internal.measurement.zzny.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzz3 = com.google.android.gms.internal.measurement.zzny.zzr(list9);
                        zzz8 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = size * zzz8;
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 31:
                    zzz7 = com.google.android.gms.internal.measurement.zzny.zzw(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzz7;
                    break;
                case 32:
                    zzz7 = com.google.android.gms.internal.measurement.zzny.zzy(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzz7;
                    break;
                case 33:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj, j);
                    int i32 = com.google.android.gms.internal.measurement.zzny.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzz3 = com.google.android.gms.internal.measurement.zzny.zzu(list10);
                        zzz8 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = size * zzz8;
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 34:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj, j);
                    int i33 = com.google.android.gms.internal.measurement.zzny.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzz3 = com.google.android.gms.internal.measurement.zzny.zzq(list11);
                        zzz8 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = size * zzz8;
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i9 += zzz7;
                case 35:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzo((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzp((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzs((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj, j);
                    int i34 = com.google.android.gms.internal.measurement.zzny.zza;
                    zzx = list12.size();
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzt((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzr((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzu((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzx = com.google.android.gms.internal.measurement.zzny.zzq((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz11 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz12 = com.google.android.gms.internal.measurement.zzll.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i9 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zznw zzp2 = zzp(i8);
                    int i35 = com.google.android.gms.internal.measurement.zzny.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i36 = 0; i36 < size6; i36++) {
                            i4 += com.google.android.gms.internal.measurement.zzll.zzG(i12, (com.google.android.gms.internal.measurement.zznl) list13.get(i36), zzp2);
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    com.google.android.gms.internal.measurement.zznf zznfVar = (com.google.android.gms.internal.measurement.zznf) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zzne zzneVar = (com.google.android.gms.internal.measurement.zzne) zzq(i8);
                    if (!zznfVar.isEmpty()) {
                        zzo = 0;
                        for (java.util.Map.Entry entry2 : zznfVar.entrySet()) {
                            zzo += zzneVar.zzd(i12, entry2.getKey(), entry2.getValue());
                        }
                        i9 += zzo;
                        break;
                    }
                    zzo = 0;
                    i9 += zzo;
                case 51:
                    if (zzL(obj, i12, i8)) {
                        zzz = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz + 8;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzL(obj, i12, i8)) {
                        zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz2 + 4;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzL(obj, i12, i8)) {
                        long zzF = zzF(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(zzF);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzL(obj, i12, i8)) {
                        long zzF2 = zzF(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(zzF2);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzL(obj, i12, i8)) {
                        long zzE = zzE(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(zzE);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzL(obj, i12, i8)) {
                        zzz = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz + 8;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzL(obj, i12, i8)) {
                        zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz2 + 4;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzL(obj, i12, i8)) {
                        zzz4 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz4 + 1;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzL(obj, i12, i8)) {
                        break;
                    } else {
                        int i37 = i12 << 3;
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.gms.internal.measurement.zzlg) {
                            zzz5 = com.google.android.gms.internal.measurement.zzll.zzz(i37);
                            zzc = ((com.google.android.gms.internal.measurement.zzlg) object2).zzc();
                            zzz6 = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                            zzz7 = zzz5 + zzz6 + zzc;
                            i9 += zzz7;
                            break;
                        } else {
                            zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i37);
                            zzA = com.google.android.gms.internal.measurement.zzll.zzB((java.lang.String) object2);
                            zzz7 = zzz3 + zzA;
                            i9 += zzz7;
                        }
                    }
                case 60:
                    if (zzL(obj, i12, i8)) {
                        zzz7 = com.google.android.gms.internal.measurement.zzny.zzz(i12, unsafe.getObject(obj, j), zzp(i8));
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzL(obj, i12, i8)) {
                        com.google.android.gms.internal.measurement.zzlg zzlgVar2 = (com.google.android.gms.internal.measurement.zzlg) unsafe.getObject(obj, j);
                        zzz5 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzc = zzlgVar2.zzc();
                        zzz6 = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                        zzz7 = zzz5 + zzz6 + zzc;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzL(obj, i12, i8)) {
                        int zzE2 = zzE(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzz(zzE2);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzL(obj, i12, i8)) {
                        long zzE3 = zzE(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA(zzE3);
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzL(obj, i12, i8)) {
                        zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz2 + 4;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzL(obj, i12, i8)) {
                        zzz = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzz7 = zzz + 8;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzL(obj, i12, i8)) {
                        int zzE4 = zzE(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzz((zzE4 >> 31) ^ (zzE4 + zzE4));
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzL(obj, i12, i8)) {
                        long zzF3 = zzF(obj, j);
                        zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i12 << 3);
                        zzA = com.google.android.gms.internal.measurement.zzll.zzA((zzF3 >> 63) ^ (zzF3 + zzF3));
                        zzz7 = zzz3 + zzA;
                        i9 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzL(obj, i12, i8)) {
                        zzz7 = com.google.android.gms.internal.measurement.zzll.zzG(i12, (com.google.android.gms.internal.measurement.zznl) unsafe.getObject(obj, j), zzp(i8));
                        i9 += zzz7;
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

    /* JADX WARN: Removed duplicated region for block: B:235:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // com.google.android.gms.internal.measurement.zznw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(java.lang.Object obj, com.google.android.gms.internal.measurement.zzou zzouVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        int[] iArr;
        int i;
        java.util.Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        java.util.Map.Entry entry3;
        if (this.zzh) {
            com.google.android.gms.internal.measurement.zzlv zzlvVar = ((com.google.android.gms.internal.measurement.zzmb) obj).zzb;
            if (!zzlvVar.zza.isEmpty()) {
                entry = (java.util.Map.Entry) zzlvVar.zzc().next();
                iArr = this.zzc;
                sun.misc.Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzx = zzx(i);
                    int zzz = zzz(zzx);
                    int i8 = iArr[i];
                    if (zzz <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        i2 = i6;
                        i3 = i7;
                        i4 = 1 << (i9 >>> 20);
                    } else {
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzx & i5;
                    switch (zzz) {
                        case 0:
                            entry3 = entry;
                            if (!zzI(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzouVar.zzf(i8, com.google.android.gms.internal.measurement.zzoo.zzl(obj, j));
                                continue;
                            }
                        case 1:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zze(i8, com.google.android.gms.internal.measurement.zzoo.zzj(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzc(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzh(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzi(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzj(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzk(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzl(i8, com.google.android.gms.internal.measurement.zzoo.zzh(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzP(i8, unsafe.getObject(obj, j), zzouVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzr(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzn(i8, (com.google.android.gms.internal.measurement.zzlg) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzo(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzg(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzb(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzd(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzp(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzq(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzouVar.zzs(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            com.google.android.gms.internal.measurement.zzny.zza(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 19:
                            com.google.android.gms.internal.measurement.zzny.zzb(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 20:
                            com.google.android.gms.internal.measurement.zzny.zzc(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 21:
                            com.google.android.gms.internal.measurement.zzny.zzd(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 22:
                            com.google.android.gms.internal.measurement.zzny.zzh(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 23:
                            com.google.android.gms.internal.measurement.zzny.zzf(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 24:
                            com.google.android.gms.internal.measurement.zzny.zzk(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 25:
                            com.google.android.gms.internal.measurement.zzny.zzn(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 26:
                            int i11 = iArr[i];
                            java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                            int i12 = com.google.android.gms.internal.measurement.zzny.zza;
                            if (list != null && !list.isEmpty()) {
                                zzouVar.zzF(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = iArr[i];
                            java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                            com.google.android.gms.internal.measurement.zznw zzp = zzp(i);
                            int i14 = com.google.android.gms.internal.measurement.zzny.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((com.google.android.gms.internal.measurement.zzlm) zzouVar).zzr(i13, list2.get(i15), zzp);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = iArr[i];
                            java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                            int i17 = com.google.android.gms.internal.measurement.zzny.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzouVar.zzG(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            com.google.android.gms.internal.measurement.zzny.zzi(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 30:
                            com.google.android.gms.internal.measurement.zzny.zzm(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 31:
                            com.google.android.gms.internal.measurement.zzny.zzl(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 32:
                            com.google.android.gms.internal.measurement.zzny.zzg(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 33:
                            com.google.android.gms.internal.measurement.zzny.zzj(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 34:
                            com.google.android.gms.internal.measurement.zzny.zze(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, false);
                            break;
                        case 35:
                            com.google.android.gms.internal.measurement.zzny.zza(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 36:
                            com.google.android.gms.internal.measurement.zzny.zzb(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 37:
                            com.google.android.gms.internal.measurement.zzny.zzc(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 38:
                            com.google.android.gms.internal.measurement.zzny.zzd(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 39:
                            com.google.android.gms.internal.measurement.zzny.zzh(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 40:
                            com.google.android.gms.internal.measurement.zzny.zzf(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 41:
                            com.google.android.gms.internal.measurement.zzny.zzk(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 42:
                            com.google.android.gms.internal.measurement.zzny.zzn(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 43:
                            com.google.android.gms.internal.measurement.zzny.zzi(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 44:
                            com.google.android.gms.internal.measurement.zzny.zzm(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 45:
                            com.google.android.gms.internal.measurement.zzny.zzl(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 46:
                            com.google.android.gms.internal.measurement.zzny.zzg(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 47:
                            com.google.android.gms.internal.measurement.zzny.zzj(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 48:
                            com.google.android.gms.internal.measurement.zzny.zze(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzouVar, true);
                            break;
                        case 49:
                            int i18 = iArr[i];
                            java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                            com.google.android.gms.internal.measurement.zznw zzp2 = zzp(i);
                            int i19 = com.google.android.gms.internal.measurement.zzny.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((com.google.android.gms.internal.measurement.zzlm) zzouVar).zzs(i18, list4.get(i20), zzp2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            java.lang.Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzouVar.zzM(i8, ((com.google.android.gms.internal.measurement.zzne) zzq(i)).zze(), (com.google.android.gms.internal.measurement.zznf) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzf(i8, zzC(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zze(i8, zzD(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzc(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzh(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzi(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzj(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzk(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzl(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzL(obj, i8, i)) {
                                zzP(i8, unsafe.getObject(obj, j), zzouVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzr(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzn(i8, (com.google.android.gms.internal.measurement.zzlg) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzo(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzg(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzb(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzd(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzp(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzq(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzL(obj, i8, i)) {
                                zzouVar.zzs(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            }
                            break;
                    }
                    entry3 = entry;
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i3;
                    i5 = 1048575;
                }
                entry2 = entry;
                if (entry2 != null) {
                    ((com.google.android.gms.internal.measurement.zzme) obj).zzc.zzg(zzouVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        sun.misc.Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0db0, code lost:
    
        if (r7 == 1048575) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0db2, code lost:
    
        r0.putInt(r10, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0db6, code lost:
    
        r0 = r1.zzj;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0ad7, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dbc, code lost:
    
        if (r0 >= r1.zzk) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0dbe, code lost:
    
        r4 = r1.zzi;
        r6 = r1.zzl;
        r7 = r1.zzc;
        r4 = r4[r0];
        r7 = r7[r4];
        r8 = com.google.android.gms.internal.measurement.zzoo.zzn(r10, r1.zzx(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0dd5, code lost:
    
        if (r8 == null) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0dd7, code lost:
    
        r12 = r1.zzr(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ddb, code lost:
    
        if (r12 == null) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ddd, code lost:
    
        r4 = ((com.google.android.gms.internal.measurement.zzne) r1.zzq(r4)).zze();
        r8 = ((com.google.android.gms.internal.measurement.zznf) r8).entrySet().iterator();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0df5, code lost:
    
        if (r8.hasNext() == false) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0df7, code lost:
    
        r13 = (java.util.Map.Entry) r8.next();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e0b, code lost:
    
        if (r12.zza(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e0d, code lost:
    
        if (r3 != null) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e0f, code lost:
    
        r3 = r6.zza(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e13, code lost:
    
        r14 = com.google.android.gms.internal.measurement.zzne.zzc(r4, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.measurement.zzlg.zzb;
        r15 = new byte[r14];
        r16 = com.google.android.gms.internal.measurement.zzll.zzb;
        r9 = new com.google.android.gms.internal.measurement.zzlj(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e2b, code lost:
    
        com.google.android.gms.internal.measurement.zzne.zzb(r9, r4, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e36, code lost:
    
        r3.zzk((r7 << 3) | 2, com.google.android.gms.internal.measurement.zzld.zza(r9, r15));
        r8.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0e55, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0e4e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0e54, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0e58, code lost:
    
        r0 = r0 + 1;
        r1 = r33;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e64, code lost:
    
        if (r3 == null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0e66, code lost:
    
        ((com.google.android.gms.internal.measurement.zzme) r10).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0e6e, code lost:
    
        if (r11 != 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0e72, code lost:
    
        if (r2 != r37) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0e7c, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmq(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0e85, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0e7d, code lost:
    
        r1 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0e81, code lost:
    
        if (r2 > r37) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0e83, code lost:
    
        if (r5 != r11) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0e8b, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmq(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x09aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0d63  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v101, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzh(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        java.lang.Object obj2;
        java.lang.String str;
        sun.misc.Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        com.google.android.gms.internal.measurement.zzno<T> zznoVar;
        int i18;
        int zzc;
        int i19;
        com.google.android.gms.internal.measurement.zzno<T> zznoVar2;
        sun.misc.Unsafe unsafe2;
        int i20;
        java.lang.String str2;
        int i21;
        int i22;
        int i23;
        com.google.android.gms.internal.measurement.zznd zzndVar;
        java.lang.Object obj3;
        com.google.android.gms.internal.measurement.zznf zznfVar;
        java.lang.Object obj4;
        java.lang.Object obj5;
        com.google.android.gms.internal.measurement.zzmn zzmnVar;
        int i24;
        sun.misc.Unsafe unsafe3;
        int i25;
        int i26;
        com.google.android.gms.internal.measurement.zzno<T> zznoVar3;
        int i27;
        int i28;
        int zza2;
        java.lang.Object obj6;
        com.google.android.gms.internal.measurement.zzno<T> zznoVar4;
        int zzl;
        int i29;
        int i30;
        int i31;
        com.google.android.gms.internal.measurement.zzno<T> zznoVar5 = this;
        java.lang.Object obj7 = obj;
        int i32 = i2;
        int i33 = i3;
        zzB(obj);
        sun.misc.Unsafe unsafe4 = zzb;
        int i34 = i;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 1048575;
        while (true) {
            if (i34 < i32) {
                int i40 = i34 + 1;
                int i41 = bArr[i34];
                if (i41 < 0) {
                    i5 = com.google.android.gms.internal.measurement.zzkw.zzb(i41, bArr, i40, zzkvVar);
                    i4 = zzkvVar.zza;
                } else {
                    i4 = i41;
                    i5 = i40;
                }
                int i42 = i4 >>> 3;
                if (i42 > i35) {
                    i7 = (i42 < zznoVar5.zze || i42 > zznoVar5.zzf) ? -1 : zznoVar5.zzN(i42, i36 / 3);
                } else if (i42 < zznoVar5.zze || i42 > zznoVar5.zzf) {
                    i6 = -1;
                    i7 = -1;
                    if (i7 != i6) {
                        obj2 = obj7;
                        i8 = i5;
                        i9 = i38;
                        i10 = i39;
                        str = "Failed to parse the message.";
                        unsafe = unsafe4;
                        i11 = i42;
                        i12 = 0;
                        i13 = i4;
                    } else {
                        int i43 = i4 & 7;
                        int[] iArr = zznoVar5.zzc;
                        int i44 = i4;
                        int i45 = iArr[i7 + 1];
                        int zzz = zzz(i45);
                        long j = i45 & 1048575;
                        int i46 = i42;
                        if (zzz <= 17) {
                            int i47 = iArr[i7 + 2];
                            int i48 = 1 << (i47 >>> 20);
                            int i49 = 1048575;
                            int i50 = i47 & 1048575;
                            int i51 = i5;
                            if (i50 != i39) {
                                if (i39 != 1048575) {
                                    unsafe4.putInt(obj7, i39, i38);
                                    i49 = 1048575;
                                }
                                i38 = i50 == i49 ? 0 : unsafe4.getInt(obj7, i50);
                            } else {
                                i50 = i39;
                            }
                            switch (zzz) {
                                case 0:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 1) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i34 = i17 + 8;
                                        i38 |= i48;
                                        com.google.android.gms.internal.measurement.zzoo.zzm(obj7, j, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i17)));
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 1:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 5) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i34 = i17 + 4;
                                        i38 |= i48;
                                        com.google.android.gms.internal.measurement.zzoo.zzk(obj7, j, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i17)));
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 2:
                                case 3:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 0) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i18 = i48 | i38;
                                        zzc = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i17, zzkvVar);
                                        unsafe4.putLong(obj, j, zzkvVar.zzb);
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i38 = i18;
                                        i34 = zzc;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 4:
                                case 11:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 0) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i38 |= i48;
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i17, zzkvVar);
                                        unsafe4.putInt(obj7, j, zzkvVar.zza);
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 5:
                                case 14:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 1) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        zzc = i17 + 8;
                                        i18 = i48 | i38;
                                        unsafe4.putLong(obj, j, com.google.android.gms.internal.measurement.zzkw.zze(bArr, i17));
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i38 = i18;
                                        i34 = zzc;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 6:
                                case 13:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 5) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i34 = i17 + 4;
                                        i38 |= i48;
                                        unsafe4.putInt(obj7, j, com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i17));
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 7:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 0) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i38 |= i48;
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i17, zzkvVar);
                                        com.google.android.gms.internal.measurement.zzoo.zzi(obj7, j, zzkvVar.zzb != 0);
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 8:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 2) {
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        if ((i45 & 536870912) != 0) {
                                            i38 |= i48;
                                            i34 = com.google.android.gms.internal.measurement.zzkw.zzf(bArr, i17, zzkvVar);
                                        } else {
                                            i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i17, zzkvVar);
                                            int i52 = zzkvVar.zza;
                                            if (i52 < 0) {
                                                throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i53 = i38 | i48;
                                            if (i52 == 0) {
                                                zzkvVar.zzc = "";
                                            } else {
                                                zzkvVar.zzc = new java.lang.String(bArr, i34, i52, com.google.android.gms.internal.measurement.zzmo.zza);
                                                i34 += i52;
                                            }
                                            i38 = i53;
                                        }
                                        unsafe4.putObject(obj7, j, zzkvVar.zzc);
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 9:
                                    i14 = i50;
                                    i19 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 == 2) {
                                        java.lang.Object zzs = zznoVar.zzs(obj7, i12);
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zzj(zzs, zznoVar.zzp(i12), bArr, i19, i2, zzkvVar);
                                        zznoVar.zzt(obj7, i12, zzs);
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i38 |= i48;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                        break;
                                    }
                                    i17 = i19;
                                    zznoVar2 = zznoVar;
                                    i33 = i3;
                                    obj2 = obj7;
                                    i13 = i16;
                                    i9 = i38;
                                    i8 = i17;
                                    unsafe = unsafe4;
                                    zznoVar5 = zznoVar2;
                                    i10 = i14;
                                    str = "Failed to parse the message.";
                                    i11 = i46;
                                    break;
                                case 10:
                                    i14 = i50;
                                    i19 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 != 2) {
                                        i17 = i19;
                                        zznoVar2 = zznoVar;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i38 |= i48;
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zzg(bArr, i19, zzkvVar);
                                        unsafe4.putObject(obj7, j, zzkvVar.zzc);
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 12:
                                    i14 = i50;
                                    i15 = i51;
                                    i16 = i44;
                                    i12 = i7;
                                    if (i43 != 0) {
                                        zznoVar2 = this;
                                        i17 = i15;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i15, zzkvVar);
                                        int i54 = zzkvVar.zza;
                                        zznoVar = this;
                                        com.google.android.gms.internal.measurement.zzmj zzr = zznoVar.zzr(i12);
                                        if ((i45 & Integer.MIN_VALUE) == 0 || zzr == null || zzr.zza(i54)) {
                                            i38 |= i48;
                                            unsafe4.putInt(obj7, j, i54);
                                        } else {
                                            zzg(obj).zzk(i16, java.lang.Long.valueOf(i54));
                                        }
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        zznoVar5 = zznoVar;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                    }
                                case 15:
                                    i14 = i50;
                                    i15 = i51;
                                    i16 = i44;
                                    i12 = i7;
                                    if (i43 != 0) {
                                        zznoVar2 = this;
                                        i17 = i15;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        i38 |= i48;
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i15, zzkvVar);
                                        unsafe4.putInt(obj7, j, com.google.android.gms.internal.measurement.zzli.zzb(zzkvVar.zza));
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i16;
                                        i36 = i12;
                                        i39 = i14;
                                        i35 = i46;
                                        zznoVar5 = this;
                                    }
                                case 16:
                                    if (i43 != 0) {
                                        i14 = i50;
                                        i15 = i51;
                                        i16 = i44;
                                        i12 = i7;
                                        zznoVar2 = this;
                                        i17 = i15;
                                        i33 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i38;
                                        i8 = i17;
                                        unsafe = unsafe4;
                                        zznoVar5 = zznoVar2;
                                        i10 = i14;
                                        str = "Failed to parse the message.";
                                        i11 = i46;
                                        break;
                                    } else {
                                        int i55 = i38 | i48;
                                        int zzc2 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i51, zzkvVar);
                                        i14 = i50;
                                        unsafe4.putLong(obj, j, com.google.android.gms.internal.measurement.zzli.zzc(zzkvVar.zzb));
                                        i32 = i2;
                                        i33 = i3;
                                        i37 = i44;
                                        i38 = i55;
                                        i36 = i7;
                                        i34 = zzc2;
                                        i39 = i14;
                                        i35 = i46;
                                        zznoVar5 = this;
                                    }
                                default:
                                    i14 = i50;
                                    i17 = i51;
                                    i16 = i44;
                                    zznoVar = this;
                                    i12 = i7;
                                    if (i43 == 3) {
                                        java.lang.Object zzs2 = zznoVar.zzs(obj7, i12);
                                        i34 = com.google.android.gms.internal.measurement.zzkw.zzk(zzs2, zznoVar.zzp(i12), bArr, i17, i2, (i46 << 3) | 4, zzkvVar);
                                        zznoVar.zzt(obj7, i12, zzs2);
                                        i33 = i3;
                                        i37 = i16;
                                        i38 |= i48;
                                        i36 = i12;
                                        zznoVar5 = zznoVar;
                                        i39 = i14;
                                        i35 = i46;
                                        break;
                                    }
                                    zznoVar2 = zznoVar;
                                    i33 = i3;
                                    obj2 = obj7;
                                    i13 = i16;
                                    i9 = i38;
                                    i8 = i17;
                                    unsafe = unsafe4;
                                    zznoVar5 = zznoVar2;
                                    i10 = i14;
                                    str = "Failed to parse the message.";
                                    i11 = i46;
                                    break;
                            }
                        } else {
                            int i56 = i5;
                            i12 = i7;
                            i10 = i39;
                            com.google.android.gms.internal.measurement.zzno<T> zznoVar6 = zznoVar5;
                            i9 = i38;
                            if (zzz != 27) {
                                if (zzz > 49) {
                                    unsafe2 = unsafe4;
                                    str = "Failed to parse the message.";
                                    i21 = i46;
                                    i20 = i56;
                                    i32 = i2;
                                    if (zzz != 50) {
                                        unsafe = unsafe2;
                                        long j2 = iArr[i12 + 2] & 1048575;
                                        switch (zzz) {
                                            case 51:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 1) {
                                                    i34 = i20 + 8;
                                                    unsafe.putObject(obj2, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i20))));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                        i33 = i3;
                                                        i8 = i34;
                                                        i12 = i22;
                                                        break;
                                                    } else {
                                                        i33 = i3;
                                                        i37 = i13;
                                                        i35 = i11;
                                                        i36 = i22;
                                                        i38 = i9;
                                                        i39 = i10;
                                                        unsafe4 = unsafe;
                                                        obj7 = obj2;
                                                        break;
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                            case 52:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 5) {
                                                    i34 = i20 + 4;
                                                    unsafe.putObject(obj2, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i20))));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 0) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i20, zzkvVar);
                                                    unsafe.putObject(obj2, j, java.lang.Long.valueOf(zzkvVar.zzb));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 0) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i20, zzkvVar);
                                                    unsafe.putObject(obj2, j, java.lang.Integer.valueOf(zzkvVar.zza));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 1) {
                                                    i34 = i20 + 8;
                                                    unsafe.putObject(obj2, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i20)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 5) {
                                                    i34 = i20 + 4;
                                                    unsafe.putObject(obj2, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i20)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 58:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 0) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i20, zzkvVar);
                                                    unsafe.putObject(obj2, j, java.lang.Boolean.valueOf(zzkvVar.zzb != 0));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 59:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 2) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i20, zzkvVar);
                                                    int i57 = zzkvVar.zza;
                                                    if (i57 == 0) {
                                                        unsafe.putObject(obj2, j, "");
                                                        i22 = i12;
                                                    } else {
                                                        i22 = i12;
                                                        int i58 = i34 + i57;
                                                        if ((i45 & 536870912) != 0 && !com.google.android.gms.internal.measurement.zzor.zza(bArr, i34, i58)) {
                                                            throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j, new java.lang.String(bArr, i34, i57, com.google.android.gms.internal.measurement.zzmo.zza));
                                                        i34 = i58;
                                                    }
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i22 = i12;
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 60:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 2) {
                                                    java.lang.Object zzu = zznoVar5.zzu(obj2, i11, i12);
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzj(zzu, zznoVar5.zzp(i12), bArr, i20, i2, zzkvVar);
                                                    zznoVar5.zzv(obj2, i11, i12, zzu);
                                                    i22 = i12;
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i22 = i12;
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 61:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 2) {
                                                    int zzg = com.google.android.gms.internal.measurement.zzkw.zzg(bArr, i20, zzkvVar);
                                                    unsafe.putObject(obj2, j, zzkvVar.zzc);
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i34 = zzg;
                                                    i22 = i12;
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i22 = i12;
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 63:
                                                obj2 = obj;
                                                str = str;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 0) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i20, zzkvVar);
                                                    int i59 = zzkvVar.zza;
                                                    com.google.android.gms.internal.measurement.zzmj zzr2 = zznoVar5.zzr(i12);
                                                    if (zzr2 == null || zzr2.zza(i59)) {
                                                        i13 = i44;
                                                        unsafe.putObject(obj2, j, java.lang.Integer.valueOf(i59));
                                                        unsafe.putInt(obj2, j2, i11);
                                                    } else {
                                                        i13 = i44;
                                                        zzg(obj).zzk(i13, java.lang.Long.valueOf(i59));
                                                    }
                                                    i22 = i12;
                                                    if (i34 == i20) {
                                                    }
                                                } else {
                                                    i13 = i44;
                                                    i22 = i12;
                                                    i34 = i20;
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                break;
                                            case 66:
                                                obj2 = obj;
                                                i23 = i44;
                                                str = str;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 0) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i20, zzkvVar);
                                                    unsafe.putObject(obj2, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzli.zzb(zzkvVar.zza)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i22 = i12;
                                                    i13 = i23;
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i22 = i12;
                                                i13 = i23;
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 67:
                                                obj2 = obj;
                                                i23 = i44;
                                                str = str;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                if (i43 == 0) {
                                                    int zzc3 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i20, zzkvVar);
                                                    unsafe.putObject(obj2, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzli.zzc(zzkvVar.zzb)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i34 = zzc3;
                                                    i22 = i12;
                                                    i13 = i23;
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                i22 = i12;
                                                i13 = i23;
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                            case 68:
                                                if (i43 == 3) {
                                                    java.lang.Object zzu2 = zzu(obj, i21, i12);
                                                    str = str;
                                                    i11 = i21;
                                                    obj2 = obj;
                                                    i23 = i44;
                                                    zznoVar5 = this;
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzk(zzu2, zzp(i12), bArr, i20, i2, (i44 & (-8)) | 4, zzkvVar);
                                                    zznoVar5.zzv(obj2, i11, i12, zzu2);
                                                    i22 = i12;
                                                    i13 = i23;
                                                    if (i34 == i20) {
                                                    }
                                                } else {
                                                    obj2 = obj;
                                                    i23 = i44;
                                                    str = str;
                                                    i11 = i21;
                                                    zznoVar5 = this;
                                                    i22 = i12;
                                                    i13 = i23;
                                                    i34 = i20;
                                                    if (i34 == i20) {
                                                    }
                                                }
                                                break;
                                            default:
                                                obj2 = obj;
                                                i13 = i44;
                                                str = str;
                                                i22 = i12;
                                                i11 = i21;
                                                zznoVar5 = this;
                                                i34 = i20;
                                                if (i34 == i20) {
                                                }
                                                break;
                                        }
                                    } else if (i43 == 2) {
                                        java.lang.Object zzq = zzq(i12);
                                        sun.misc.Unsafe unsafe5 = unsafe2;
                                        java.lang.Object object = unsafe5.getObject(obj7, j);
                                        if (!((com.google.android.gms.internal.measurement.zznf) object).zze()) {
                                            com.google.android.gms.internal.measurement.zznf zzc4 = com.google.android.gms.internal.measurement.zznf.zza().zzc();
                                            com.google.android.gms.internal.measurement.zzng.zza(zzc4, object);
                                            unsafe5.putObject(obj7, j, zzc4);
                                            object = zzc4;
                                        }
                                        com.google.android.gms.internal.measurement.zznd zze = ((com.google.android.gms.internal.measurement.zzne) zzq).zze();
                                        com.google.android.gms.internal.measurement.zznf zznfVar2 = (com.google.android.gms.internal.measurement.zznf) object;
                                        int zza3 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i20, zzkvVar);
                                        int i60 = zzkvVar.zza;
                                        if (i60 >= 0 && i60 <= i32 - zza3) {
                                            int i61 = zza3 + i60;
                                            java.lang.Object obj8 = zze.zzb;
                                            java.lang.Object obj9 = zze.zzd;
                                            java.lang.Object obj10 = obj8;
                                            java.lang.Object obj11 = obj9;
                                            while (zza3 < i61) {
                                                java.lang.Object obj12 = obj11;
                                                int i62 = zza3 + 1;
                                                byte b = bArr[zza3];
                                                if (b < 0) {
                                                    i62 = com.google.android.gms.internal.measurement.zzkw.zzb(b, bArr, i62, zzkvVar);
                                                    b = zzkvVar.zza;
                                                }
                                                java.lang.Object obj13 = obj10;
                                                int i63 = b >>> 3;
                                                com.google.android.gms.internal.measurement.zznf zznfVar3 = zznfVar2;
                                                int i64 = b & 7;
                                                sun.misc.Unsafe unsafe6 = unsafe5;
                                                if (i63 != 1) {
                                                    if (i63 == 2) {
                                                        com.google.android.gms.internal.measurement.zzos zzosVar = zze.zzc;
                                                        if (i64 == zzosVar.zzb()) {
                                                            obj4 = obj9;
                                                            zznfVar = zznfVar3;
                                                            zzndVar = zze;
                                                            zza3 = zzO(bArr, i62, i2, zzosVar, obj9.getClass(), zzkvVar);
                                                            obj11 = zzkvVar.zzc;
                                                            obj10 = obj13;
                                                            zznfVar2 = zznfVar;
                                                            zze = zzndVar;
                                                            obj9 = obj4;
                                                            unsafe5 = unsafe6;
                                                        }
                                                    }
                                                    zzndVar = zze;
                                                    obj3 = obj13;
                                                    zznfVar = zznfVar3;
                                                    obj4 = obj9;
                                                    zza3 = com.google.android.gms.internal.measurement.zzkw.zzp(b, bArr, i62, i32, zzkvVar);
                                                    obj10 = obj3;
                                                    obj11 = obj12;
                                                    zznfVar2 = zznfVar;
                                                    zze = zzndVar;
                                                    obj9 = obj4;
                                                    unsafe5 = unsafe6;
                                                } else {
                                                    zzndVar = zze;
                                                    obj3 = obj13;
                                                    zznfVar = zznfVar3;
                                                    obj4 = obj9;
                                                    com.google.android.gms.internal.measurement.zzos zzosVar2 = zzndVar.zza;
                                                    if (i64 == zzosVar2.zzb()) {
                                                        zza3 = zzO(bArr, i62, i2, zzosVar2, null, zzkvVar);
                                                        obj10 = zzkvVar.zzc;
                                                        obj11 = obj12;
                                                        zznfVar2 = zznfVar;
                                                        zze = zzndVar;
                                                        obj9 = obj4;
                                                        unsafe5 = unsafe6;
                                                    }
                                                    zza3 = com.google.android.gms.internal.measurement.zzkw.zzp(b, bArr, i62, i32, zzkvVar);
                                                    obj10 = obj3;
                                                    obj11 = obj12;
                                                    zznfVar2 = zznfVar;
                                                    zze = zzndVar;
                                                    obj9 = obj4;
                                                    unsafe5 = unsafe6;
                                                }
                                            }
                                            java.lang.Object obj14 = obj11;
                                            java.lang.Object obj15 = obj10;
                                            sun.misc.Unsafe unsafe7 = unsafe5;
                                            com.google.android.gms.internal.measurement.zznf zznfVar4 = zznfVar2;
                                            if (zza3 != i61) {
                                                throw new com.google.android.gms.internal.measurement.zzmq(str);
                                            }
                                            zznfVar4.put(obj15, obj14);
                                            if (i61 != i20) {
                                                obj7 = obj;
                                                i33 = i3;
                                                i37 = i44;
                                                i36 = i12;
                                                i34 = i61;
                                                i38 = i9;
                                                i39 = i10;
                                                unsafe4 = unsafe7;
                                                i35 = i21;
                                                zznoVar5 = this;
                                            } else {
                                                obj2 = obj;
                                                i33 = i3;
                                                i13 = i44;
                                                i8 = i61;
                                                unsafe = unsafe7;
                                                i11 = i21;
                                                zznoVar5 = this;
                                            }
                                        }
                                    } else {
                                        str2 = str;
                                    }
                                } else {
                                    long j3 = i45;
                                    com.google.android.gms.internal.measurement.zzmn zzmnVar2 = (com.google.android.gms.internal.measurement.zzmn) unsafe4.getObject(obj7, j);
                                    if (zzmnVar2.zza()) {
                                        obj5 = "";
                                        zzmnVar = zzmnVar2;
                                    } else {
                                        int size = zzmnVar2.size();
                                        obj5 = "";
                                        com.google.android.gms.internal.measurement.zzmn zzg2 = zzmnVar2.zzg(size + size);
                                        unsafe4.putObject(obj7, j, zzg2);
                                        zzmnVar = zzg2;
                                    }
                                    switch (zzz) {
                                        case 18:
                                        case 35:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 != 2) {
                                                if (i43 == 1) {
                                                    i34 = i25 + 8;
                                                    int i65 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzln zzlnVar = (com.google.android.gms.internal.measurement.zzln) zzmnVar;
                                                    zzlnVar.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i25)));
                                                    while (i34 < i24) {
                                                        int zza4 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            zzlnVar.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkw.zze(bArr, zza4)));
                                                            i34 = zza4 + 8;
                                                        }
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                    i33 = i3;
                                                    obj2 = obj7;
                                                    i13 = i44;
                                                    i8 = i34;
                                                    zznoVar5 = zznoVar3;
                                                    unsafe = unsafe3;
                                                    i11 = i27;
                                                    break;
                                                } else {
                                                    i33 = i3;
                                                    i37 = i44;
                                                    i32 = i24;
                                                    zznoVar5 = zznoVar3;
                                                    i36 = i12;
                                                    i38 = i9;
                                                    i39 = i10;
                                                    unsafe4 = unsafe3;
                                                    i35 = i27;
                                                }
                                            } else {
                                                int i66 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzln zzlnVar2 = (com.google.android.gms.internal.measurement.zzln) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i67 = zzkvVar.zza;
                                                int i68 = i34 + i67;
                                                if (i68 > bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlnVar2.zzh(zzlnVar2.size() + (i67 / 8));
                                                while (i34 < i68) {
                                                    zzlnVar2.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i34)));
                                                    i34 += 8;
                                                }
                                                if (i34 != i68) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i27 = i26;
                                            if (i34 == i25) {
                                            }
                                        case 19:
                                        case 36:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                int i69 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzlx zzlxVar = (com.google.android.gms.internal.measurement.zzlx) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i70 = zzkvVar.zza;
                                                int i71 = i34 + i70;
                                                if (i71 > bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlxVar.zzh(zzlxVar.size() + (i70 / 4));
                                                while (i34 < i71) {
                                                    zzlxVar.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i34)));
                                                    i34 += 4;
                                                }
                                                if (i34 != i71) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i43 == 5) {
                                                    i34 = i25 + 4;
                                                    int i72 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzlx zzlxVar2 = (com.google.android.gms.internal.measurement.zzlx) zzmnVar;
                                                    zzlxVar2.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i25)));
                                                    while (i34 < i24) {
                                                        int zza5 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            zzlxVar2.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, zza5)));
                                                            i34 = zza5 + 4;
                                                        }
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            i27 = i26;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                int i73 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzmz zzmzVar = (com.google.android.gms.internal.measurement.zzmz) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i74 = zzkvVar.zza + i34;
                                                while (i34 < i74) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i34, zzkvVar);
                                                    zzmzVar.zzf(zzkvVar.zzb);
                                                }
                                                if (i34 != i74) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i43 == 0) {
                                                    int i75 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzmz zzmzVar2 = (com.google.android.gms.internal.measurement.zzmz) zzmnVar;
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i25, zzkvVar);
                                                    zzmzVar2.zzf(zzkvVar.zzb);
                                                    while (i34 < i24) {
                                                        int zza6 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, zza6, zzkvVar);
                                                            zzmzVar2.zzf(zzkvVar.zzb);
                                                        }
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            i27 = i26;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zzm(bArr, i25, zzmnVar, zzkvVar);
                                                i27 = i26;
                                                if (i34 == i25) {
                                                }
                                            } else {
                                                if (i43 == 0) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzl(i44, bArr, i25, i2, zzmnVar, zzkvVar);
                                                    i27 = i26;
                                                    if (i34 == i25) {
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                int i76 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzmz zzmzVar3 = (com.google.android.gms.internal.measurement.zzmz) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i77 = zzkvVar.zza;
                                                int i78 = i34 + i77;
                                                if (i78 > bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmzVar3.zzh(zzmzVar3.size() + (i77 / 8));
                                                while (i34 < i78) {
                                                    zzmzVar3.zzf(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i34));
                                                    i34 += 8;
                                                }
                                                if (i34 != i78) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i43 == 1) {
                                                    i34 = i25 + 8;
                                                    int i79 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzmz zzmzVar4 = (com.google.android.gms.internal.measurement.zzmz) zzmnVar;
                                                    zzmzVar4.zzf(com.google.android.gms.internal.measurement.zzkw.zze(bArr, i25));
                                                    while (i34 < i24) {
                                                        int zza7 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            zzmzVar4.zzf(com.google.android.gms.internal.measurement.zzkw.zze(bArr, zza7));
                                                            i34 = zza7 + 8;
                                                        }
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            i27 = i26;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                int i80 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i81 = zzkvVar.zza;
                                                int i82 = i34 + i81;
                                                if (i82 > bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmfVar.zzi(zzmfVar.size() + (i81 / 4));
                                                while (i34 < i82) {
                                                    zzmfVar.zzh(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i34));
                                                    i34 += 4;
                                                }
                                                if (i34 != i82) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i43 == 5) {
                                                    i34 = i25 + 4;
                                                    int i83 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzmf zzmfVar2 = (com.google.android.gms.internal.measurement.zzmf) zzmnVar;
                                                    zzmfVar2.zzh(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, i25));
                                                    while (i34 < i24) {
                                                        int zza8 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            zzmfVar2.zzh(com.google.android.gms.internal.measurement.zzkw.zzd(bArr, zza8));
                                                            i34 = zza8 + 4;
                                                        }
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            i27 = i26;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                int i84 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzkx zzkxVar = (com.google.android.gms.internal.measurement.zzkx) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i85 = zzkvVar.zza + i34;
                                                while (i34 < i85) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i34, zzkvVar);
                                                    zzkxVar.zzf(zzkvVar.zzb != 0);
                                                }
                                                if (i34 != i85) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i43 == 0) {
                                                    int i86 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzkx zzkxVar2 = (com.google.android.gms.internal.measurement.zzkx) zzmnVar;
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i25, zzkvVar);
                                                    zzkxVar2.zzf(zzkvVar.zzb != 0);
                                                    while (i34 < i24) {
                                                        int zza9 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, zza9, zzkvVar);
                                                            zzkxVar2.zzf(zzkvVar.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            i27 = i26;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 26:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i28 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    zza2 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                    int i87 = zzkvVar.zza;
                                                    if (i87 < 0) {
                                                        throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i87 == 0) {
                                                        obj6 = obj5;
                                                        zzmnVar.add(obj6);
                                                    } else {
                                                        obj6 = obj5;
                                                        zzmnVar.add(new java.lang.String(bArr, zza2, i87, com.google.android.gms.internal.measurement.zzmo.zza));
                                                        zza2 += i87;
                                                    }
                                                    while (zza2 < i24) {
                                                        int zza10 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza2, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            zza2 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza10, zzkvVar);
                                                            int i88 = zzkvVar.zza;
                                                            if (i88 < 0) {
                                                                throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i88 == 0) {
                                                                zzmnVar.add(obj6);
                                                            } else {
                                                                zzmnVar.add(new java.lang.String(bArr, zza2, i88, com.google.android.gms.internal.measurement.zzmo.zza));
                                                                zza2 += i88;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    java.lang.Object obj16 = obj5;
                                                    zza2 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                    int i89 = zzkvVar.zza;
                                                    if (i89 < 0) {
                                                        throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i89 == 0) {
                                                        zzmnVar.add(obj16);
                                                    } else {
                                                        int i90 = zza2 + i89;
                                                        if (!com.google.android.gms.internal.measurement.zzor.zza(bArr, zza2, i90)) {
                                                            throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzmnVar.add(new java.lang.String(bArr, zza2, i89, com.google.android.gms.internal.measurement.zzmo.zza));
                                                        zza2 = i90;
                                                    }
                                                    while (zza2 < i24) {
                                                        int zza11 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza2, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            zza2 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza11, zzkvVar);
                                                            int i91 = zzkvVar.zza;
                                                            if (i91 < 0) {
                                                                throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i91 == 0) {
                                                                zzmnVar.add(obj16);
                                                            } else {
                                                                int i92 = zza2 + i91;
                                                                if (!com.google.android.gms.internal.measurement.zzor.zza(bArr, zza2, i92)) {
                                                                    throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzmnVar.add(new java.lang.String(bArr, zza2, i91, com.google.android.gms.internal.measurement.zzmo.zza));
                                                                zza2 = i92;
                                                            }
                                                        }
                                                    }
                                                }
                                                i34 = zza2;
                                                i27 = i28;
                                                if (i34 == i25) {
                                                }
                                            } else {
                                                i27 = i28;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                i28 = i26;
                                                str = "Failed to parse the message.";
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zzn(zznoVar3.zzp(i12), i44, bArr, i25, i2, zzmnVar, zzkvVar);
                                                i24 = i24;
                                                i27 = i28;
                                                if (i34 == i25) {
                                                }
                                            } else {
                                                str = "Failed to parse the message.";
                                                i27 = i26;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            zznoVar3 = this;
                                            if (i43 == 2) {
                                                int zza12 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i93 = zzkvVar.zza;
                                                if (i93 < 0) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i93 > bArr.length - zza12) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i93 == 0) {
                                                    zzmnVar.add(com.google.android.gms.internal.measurement.zzlg.zzb);
                                                } else {
                                                    zzmnVar.add(com.google.android.gms.internal.measurement.zzlg.zzh(bArr, zza12, i93));
                                                    zza12 += i93;
                                                }
                                                while (zza12 < i24) {
                                                    int zza13 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza12, zzkvVar);
                                                    if (i44 == zzkvVar.zza) {
                                                        zza12 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza13, zzkvVar);
                                                        int i94 = zzkvVar.zza;
                                                        if (i94 < 0) {
                                                            throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i94 > bArr.length - zza12) {
                                                            throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i94 == 0) {
                                                            zzmnVar.add(com.google.android.gms.internal.measurement.zzlg.zzb);
                                                        } else {
                                                            zzmnVar.add(com.google.android.gms.internal.measurement.zzlg.zzh(bArr, zza12, i94));
                                                            zza12 += i94;
                                                        }
                                                    } else {
                                                        i34 = zza12;
                                                        i27 = i46;
                                                        str = "Failed to parse the message.";
                                                        if (i34 == i25) {
                                                        }
                                                    }
                                                }
                                                i34 = zza12;
                                                i27 = i46;
                                                str = "Failed to parse the message.";
                                                if (i34 == i25) {
                                                }
                                            } else {
                                                i27 = i46;
                                                str = "Failed to parse the message.";
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i24 = i2;
                                            i25 = i56;
                                            if (i43 == 2) {
                                                zzl = com.google.android.gms.internal.measurement.zzkw.zzm(bArr, i25, zzmnVar, zzkvVar);
                                                zznoVar4 = this;
                                            } else if (i43 == 0) {
                                                zznoVar4 = this;
                                                zzl = com.google.android.gms.internal.measurement.zzkw.zzl(i44, bArr, i25, i2, zzmnVar, zzkvVar);
                                            } else {
                                                unsafe3 = unsafe4;
                                                zznoVar3 = this;
                                                str = "Failed to parse the message.";
                                                i27 = i46;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            com.google.android.gms.internal.measurement.zzmj zzr3 = zznoVar4.zzr(i12);
                                            com.google.android.gms.internal.measurement.zzoh zzohVar = zznoVar4.zzl;
                                            int i95 = com.google.android.gms.internal.measurement.zzny.zza;
                                            if (zzr3 == null) {
                                                i29 = zzl;
                                                unsafe3 = unsafe4;
                                                i30 = i46;
                                            } else if (zzmnVar instanceof java.util.RandomAccess) {
                                                int size2 = zzmnVar.size();
                                                i29 = zzl;
                                                java.lang.Object obj17 = null;
                                                int i96 = 0;
                                                int i97 = 0;
                                                while (i96 < size2) {
                                                    java.lang.Integer num = (java.lang.Integer) zzmnVar.get(i96);
                                                    sun.misc.Unsafe unsafe8 = unsafe4;
                                                    int intValue = num.intValue();
                                                    if (zzr3.zza(intValue)) {
                                                        if (i96 != i97) {
                                                            zzmnVar.set(i97, num);
                                                        }
                                                        i97++;
                                                        i31 = i46;
                                                    } else {
                                                        i31 = i46;
                                                        obj17 = com.google.android.gms.internal.measurement.zzny.zzE(obj7, i31, intValue, obj17, zzohVar);
                                                    }
                                                    i96++;
                                                    i46 = i31;
                                                    unsafe4 = unsafe8;
                                                }
                                                unsafe3 = unsafe4;
                                                i30 = i46;
                                                if (i97 != size2) {
                                                    zzmnVar.subList(i97, size2).clear();
                                                }
                                            } else {
                                                i29 = zzl;
                                                unsafe3 = unsafe4;
                                                i30 = i46;
                                                java.util.Iterator it = zzmnVar.iterator();
                                                java.lang.Object obj18 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((java.lang.Integer) it.next()).intValue();
                                                    if (!zzr3.zza(intValue2)) {
                                                        obj18 = com.google.android.gms.internal.measurement.zzny.zzE(obj7, i30, intValue2, obj18, zzohVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            zznoVar3 = this;
                                            i27 = i30;
                                            i34 = i29;
                                            str = "Failed to parse the message.";
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i24 = i2;
                                            i25 = i56;
                                            if (i43 == 2) {
                                                int i98 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzmf zzmfVar3 = (com.google.android.gms.internal.measurement.zzmf) zzmnVar;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i99 = zzkvVar.zza + i34;
                                                while (i34 < i99) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                    zzmfVar3.zzh(com.google.android.gms.internal.measurement.zzli.zzb(zzkvVar.zza));
                                                }
                                                if (i34 != i99) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i43 == 0) {
                                                    int i100 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzmf zzmfVar4 = (com.google.android.gms.internal.measurement.zzmf) zzmnVar;
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                    zzmfVar4.zzh(com.google.android.gms.internal.measurement.zzli.zzb(zzkvVar.zza));
                                                    while (i34 < i24) {
                                                        int zza14 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, zza14, zzkvVar);
                                                            zzmfVar4.zzh(com.google.android.gms.internal.measurement.zzli.zzb(zzkvVar.zza));
                                                        }
                                                    }
                                                }
                                                unsafe3 = unsafe4;
                                                str = "Failed to parse the message.";
                                                i27 = i46;
                                                zznoVar3 = this;
                                                i34 = i25;
                                                if (i34 == i25) {
                                                }
                                            }
                                            unsafe3 = unsafe4;
                                            str = "Failed to parse the message.";
                                            i27 = i46;
                                            zznoVar3 = this;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i43 == 2) {
                                                int i101 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                com.google.android.gms.internal.measurement.zzmz zzmzVar5 = (com.google.android.gms.internal.measurement.zzmz) zzmnVar;
                                                i25 = i56;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i25, zzkvVar);
                                                int i102 = zzkvVar.zza + i34;
                                                while (i34 < i102) {
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i34, zzkvVar);
                                                    zzmzVar5.zzf(com.google.android.gms.internal.measurement.zzli.zzc(zzkvVar.zzb));
                                                }
                                                if (i34 != i102) {
                                                    throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i24 = i2;
                                            } else {
                                                i25 = i56;
                                                if (i43 == 0) {
                                                    int i103 = com.google.android.gms.internal.measurement.zzkw.zza;
                                                    com.google.android.gms.internal.measurement.zzmz zzmzVar6 = (com.google.android.gms.internal.measurement.zzmz) zzmnVar;
                                                    i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, i25, zzkvVar);
                                                    zzmzVar6.zzf(com.google.android.gms.internal.measurement.zzli.zzc(zzkvVar.zzb));
                                                    i24 = i2;
                                                    while (i34 < i24) {
                                                        int zza15 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                        if (i44 == zzkvVar.zza) {
                                                            i34 = com.google.android.gms.internal.measurement.zzkw.zzc(bArr, zza15, zzkvVar);
                                                            zzmzVar6.zzf(com.google.android.gms.internal.measurement.zzli.zzc(zzkvVar.zzb));
                                                        }
                                                    }
                                                } else {
                                                    i24 = i2;
                                                    unsafe3 = unsafe4;
                                                    str = "Failed to parse the message.";
                                                    i27 = i46;
                                                    zznoVar3 = this;
                                                    i34 = i25;
                                                    if (i34 == i25) {
                                                    }
                                                }
                                            }
                                            unsafe3 = unsafe4;
                                            str = "Failed to parse the message.";
                                            i27 = i46;
                                            zznoVar3 = this;
                                            if (i34 == i25) {
                                            }
                                            break;
                                        default:
                                            i24 = i2;
                                            unsafe3 = unsafe4;
                                            i25 = i56;
                                            str = "Failed to parse the message.";
                                            i26 = i46;
                                            zznoVar3 = this;
                                            if (i43 == 3) {
                                                int i104 = (i44 & (-8)) | 4;
                                                com.google.android.gms.internal.measurement.zznw zzp = zznoVar3.zzp(i12);
                                                i27 = i26;
                                                i34 = com.google.android.gms.internal.measurement.zzkw.zzi(zzp, bArr, i25, i2, i104, zzkvVar);
                                                zzmnVar.add(zzkvVar.zzc);
                                                while (i34 < i24) {
                                                    int zza16 = com.google.android.gms.internal.measurement.zzkw.zza(bArr, i34, zzkvVar);
                                                    if (i44 == zzkvVar.zza) {
                                                        i34 = com.google.android.gms.internal.measurement.zzkw.zzi(zzp, bArr, zza16, i2, i104, zzkvVar);
                                                        zzmnVar.add(zzkvVar.zzc);
                                                    } else if (i34 == i25) {
                                                    }
                                                }
                                                if (i34 == i25) {
                                                }
                                            }
                                            i27 = i26;
                                            i34 = i25;
                                            if (i34 == i25) {
                                            }
                                            break;
                                    }
                                }
                            } else if (i43 == 2) {
                                com.google.android.gms.internal.measurement.zzmn zzmnVar3 = (com.google.android.gms.internal.measurement.zzmn) unsafe4.getObject(obj7, j);
                                if (!zzmnVar3.zza()) {
                                    int size3 = zzmnVar3.size();
                                    zzmnVar3 = zzmnVar3.zzg(size3 == 0 ? 10 : size3 + size3);
                                    unsafe4.putObject(obj7, j, zzmnVar3);
                                }
                                i34 = com.google.android.gms.internal.measurement.zzkw.zzn(zznoVar6.zzp(i12), i44, bArr, i56, i2, zzmnVar3, zzkvVar);
                                i33 = i3;
                                i37 = i44;
                                zznoVar5 = zznoVar6;
                                i36 = i12;
                                i38 = i9;
                                i35 = i46;
                                i39 = i10;
                            } else {
                                unsafe2 = unsafe4;
                                i20 = i56;
                                str2 = "Failed to parse the message.";
                                i21 = i46;
                            }
                            obj2 = obj;
                            i13 = i44;
                            i8 = i20;
                            str = str2;
                            unsafe = unsafe2;
                            i11 = i21;
                            zznoVar5 = this;
                            i33 = i3;
                        }
                        i32 = i2;
                    }
                    if (i13 == i33 || i33 == 0) {
                        if (zznoVar5.zzh) {
                            com.google.android.gms.internal.measurement.zzlq zzlqVar = zzkvVar.zzd;
                            int i105 = com.google.android.gms.internal.measurement.zzlq.zzb;
                            int i106 = com.google.android.gms.internal.measurement.zznt.zza;
                            if (zzlqVar != com.google.android.gms.internal.measurement.zzlq.zza) {
                                com.google.android.gms.internal.measurement.zznl zznlVar = zznoVar5.zzg;
                                int i107 = com.google.android.gms.internal.measurement.zzkw.zza;
                                if (zzlqVar.zzb(zznlVar, i11) != null) {
                                    throw null;
                                }
                                i34 = com.google.android.gms.internal.measurement.zzkw.zzo(i13, bArr, i8, i2, zzg(obj), zzkvVar);
                                i37 = i13;
                                i35 = i11;
                                i36 = i12;
                                i38 = i9;
                                i39 = i10;
                                unsafe4 = unsafe;
                                obj7 = obj2;
                                i32 = i2;
                            }
                        }
                        i34 = com.google.android.gms.internal.measurement.zzkw.zzo(i13, bArr, i8, i2, zzg(obj), zzkvVar);
                        i37 = i13;
                        i35 = i11;
                        i36 = i12;
                        i38 = i9;
                        i39 = i10;
                        unsafe4 = unsafe;
                        obj7 = obj2;
                        i32 = i2;
                    } else {
                        i34 = i8;
                        i37 = i13;
                        i38 = i9;
                        i39 = i10;
                    }
                } else {
                    i7 = zznoVar5.zzN(i42, 0);
                }
                i6 = -1;
                if (i7 != i6) {
                }
                if (i13 == i33) {
                }
                if (zznoVar5.zzh) {
                }
                i34 = com.google.android.gms.internal.measurement.zzkw.zzo(i13, bArr, i8, i2, zzg(obj), zzkvVar);
                i37 = i13;
                i35 = i11;
                i36 = i12;
                i38 = i9;
                i39 = i10;
                unsafe4 = unsafe;
                obj7 = obj2;
                i32 = i2;
            } else {
                obj2 = obj7;
                str = "Failed to parse the message.";
                unsafe = unsafe4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzi(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        zzh(obj, bArr, i, i2, 0, zzkvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzj(java.lang.Object obj) {
        if (zzA(obj)) {
            if (obj instanceof com.google.android.gms.internal.measurement.zzme) {
                com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) obj;
                zzmeVar.zzcm(Integer.MAX_VALUE);
                zzmeVar.zza = 0;
                zzmeVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzx = zzx(i);
                int i2 = 1048575 & zzx;
                int zzz = zzz(zzx);
                long j = i2;
                if (zzz != 9) {
                    if (zzz != 60 && zzz != 68) {
                        switch (zzz) {
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
                                ((com.google.android.gms.internal.measurement.zzmn) com.google.android.gms.internal.measurement.zzoo.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.gms.internal.measurement.zznf) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzL(obj, iArr[i], i)) {
                        zzp(i).zzj(zzb.getObject(obj, j));
                    }
                }
                if (zzJ(obj, i)) {
                    zzp(i).zzj(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzk(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzx = zzx(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzx) != 0 && !zzI(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzL(obj, i7, i6) && !zzw(obj, zzx, zzp(i6))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz != 50) {
                            continue;
                        } else {
                            com.google.android.gms.internal.measurement.zznf zznfVar = (com.google.android.gms.internal.measurement.zznf) com.google.android.gms.internal.measurement.zzoo.zzn(obj, zzx & 1048575);
                            if (!zznfVar.isEmpty() && ((com.google.android.gms.internal.measurement.zzne) zzq(i6)).zze().zzc.zza() == com.google.android.gms.internal.measurement.zzot.MESSAGE) {
                                com.google.android.gms.internal.measurement.zznw zznwVar = null;
                                for (java.lang.Object obj2 : zznfVar.values()) {
                                    if (zznwVar == null) {
                                        zznwVar = com.google.android.gms.internal.measurement.zznt.zza().zzb(obj2.getClass());
                                    }
                                    if (!zznwVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.measurement.zzoo.zzn(obj, zzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.gms.internal.measurement.zznw zzp = zzp(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzp.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i6, i, i2, i10) && !zzw(obj, zzx, zzp(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zze();
    }
}
