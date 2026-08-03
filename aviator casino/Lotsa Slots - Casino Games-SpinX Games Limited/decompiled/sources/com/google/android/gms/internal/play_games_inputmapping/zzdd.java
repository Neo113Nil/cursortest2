package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzdd extends java.util.AbstractMap {
    private static final java.util.Comparator zza = new com.google.android.gms.internal.play_games_inputmapping.zzda();
    private final java.lang.Object[] zzb;
    private final int[] zzc;
    private final java.util.Set zzd = new com.google.android.gms.internal.play_games_inputmapping.zzdc(this, -1);
    private java.lang.Integer zze = null;
    private java.lang.String zzf = null;

    zzdd(com.google.android.gms.internal.play_games_inputmapping.zzdd zzddVar, com.google.android.gms.internal.play_games_inputmapping.zzdd zzddVar2) {
        int i;
        int i2;
        java.lang.Object obj;
        java.util.Comparator comparator;
        java.lang.Object[] objArr;
        int size = zzddVar.size() + zzddVar2.size();
        int i3 = zzddVar.zzc[zzddVar.size()] + zzddVar2.zzc[zzddVar2.size()];
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        int i4 = size + 1;
        int[] iArr = new int[i4];
        int i5 = 0;
        iArr[0] = size;
        int i6 = size;
        java.util.Map.Entry zzg = zzddVar.zzg(0);
        java.util.Map.Entry zzg2 = zzddVar2.zzg(0);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (zzg == null && zzg2 == null) {
                break;
            }
            int i10 = zzg == null ? 1 : zzg2 == null ? -1 : 0;
            if (i10 == 0 && (i10 = ((java.lang.String) zzg.getKey()).compareTo((java.lang.String) zzg2.getKey())) == 0) {
                objArr2[i7] = zzf((java.lang.String) zzg.getKey(), i7);
                int i11 = i7 + 1;
                com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar = (com.google.android.gms.internal.play_games_inputmapping.zzdc) zzg.getValue();
                com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzdc) zzg2.getValue();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= zzdcVar.zzc() - zzdcVar.zzb() && i13 >= zzdcVar2.zzc() - zzdcVar2.zzb()) {
                        break;
                    }
                    int i14 = i12 == zzdcVar.zzc() - zzdcVar.zzb() ? 1 : i13 == zzdcVar2.zzc() - zzdcVar2.zzb() ? -1 : 0;
                    if (i14 == 0) {
                        comparator = com.google.android.gms.internal.play_games_inputmapping.zzdf.zza;
                        i14 = comparator.compare(zzdcVar.zza(i12), zzdcVar2.zza(i13));
                    }
                    if (i14 < 0) {
                        i2 = i12 + 1;
                        obj = zzdcVar.zza(i12);
                    } else {
                        int i15 = i13 + 1;
                        java.lang.Object zza2 = zzdcVar2.zza(i13);
                        i2 = i14 == 0 ? i12 + 1 : i12;
                        i13 = i15;
                        obj = zza2;
                    }
                    objArr2[i6] = obj;
                    i12 = i2;
                    i6++;
                    i5 = 0;
                }
                iArr[i11] = i6;
                int i16 = i8 + 1;
                zzg = zzddVar.zzg(i16);
                int i17 = i9 + 1;
                zzg2 = zzddVar2.zzg(i17);
                i8 = i16;
                i9 = i17;
                i7 = i11;
            } else {
                if (i10 < 0) {
                    i = i7 + 1;
                    int zzd = zzd(zzg, i7, i6, objArr2, iArr);
                    int i18 = i8 + 1;
                    zzg = zzddVar.zzg(i18);
                    i6 = zzd;
                    i8 = i18;
                } else {
                    i = i7 + 1;
                    int zzd2 = zzd(zzg2, i7, i6, objArr2, iArr);
                    int i19 = i9 + 1;
                    zzg2 = zzddVar2.zzg(i19);
                    i6 = zzd2;
                    i9 = i19;
                }
                i7 = i;
                i5 = 0;
            }
        }
        int i20 = iArr[i5];
        int i21 = i20 - i7;
        if (i21 != 0) {
            for (int i22 = 0; i22 <= i7; i22++) {
                iArr[i22] = iArr[i22] - i21;
            }
            int i23 = iArr[i7];
            int i24 = i23 - i7;
            if (zze(i3, i23)) {
                objArr = new java.lang.Object[i23];
                java.lang.System.arraycopy(objArr2, i5, objArr, i5, i7);
            } else {
                objArr = objArr2;
            }
            java.lang.System.arraycopy(objArr2, i20, objArr, i7, i24);
            objArr2 = objArr;
        }
        this.zzb = objArr2;
        int i25 = iArr[i5] + 1;
        this.zzc = zze(i4, i25) ? java.util.Arrays.copyOf(iArr, i25) : iArr;
    }

    private final int zzd(java.util.Map.Entry entry, int i, int i2, java.lang.Object[] objArr, int[] iArr) {
        com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar = (com.google.android.gms.internal.play_games_inputmapping.zzdc) entry.getValue();
        int zzc = zzdcVar.zzc() - zzdcVar.zzb();
        java.lang.System.arraycopy(zzdcVar.zzb.zzb, zzdcVar.zzb(), objArr, i2, zzc);
        objArr[i] = zzf((java.lang.String) entry.getKey(), i);
        int i3 = i2 + zzc;
        iArr[i + 1] = i3;
        return i3;
    }

    private static boolean zze(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    private final java.util.Map.Entry zzf(java.lang.String str, int i) {
        return new java.util.AbstractMap.SimpleImmutableEntry(str, new com.google.android.gms.internal.play_games_inputmapping.zzdc(this, i));
    }

    private final java.util.Map.Entry zzg(int i) {
        if (i < this.zzc[0]) {
            return (java.util.Map.Entry) this.zzb[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = java.lang.Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    zzdd(java.util.List list) {
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            java.lang.Object[] objArr = new java.lang.Object[size];
            int[] iArr = new int[1];
            java.util.Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                iArr[0] = 0;
                this.zzb = zze(size, 0) ? java.util.Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            com.google.android.gms.internal.play_games_inputmapping.zzcz.zza((com.google.android.gms.internal.play_games_inputmapping.zzcz) it2.next());
            throw null;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzcz.zza((com.google.android.gms.internal.play_games_inputmapping.zzcz) it.next());
        throw null;
    }
}
