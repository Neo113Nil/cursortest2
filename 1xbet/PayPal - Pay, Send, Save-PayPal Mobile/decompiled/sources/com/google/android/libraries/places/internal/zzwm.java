package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzwm extends java.util.AbstractMap {
    private static final java.util.Comparator zza = new com.google.android.libraries.places.internal.zzwj();
    private final java.lang.Object[] zzb;
    private final int[] zzc;
    private final java.util.Set zzd = new com.google.android.libraries.places.internal.zzwl(this, -1);
    private java.lang.Integer zze = null;
    private java.lang.String zzf = null;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013c, code lost:
    
        if (r1 < 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzwm(com.google.android.libraries.places.internal.zzwm zzwmVar, com.google.android.libraries.places.internal.zzwm zzwmVar2) {
        int i;
        java.lang.Object obj;
        java.util.Comparator comparator;
        java.lang.Object[] objArr;
        int size = zzwmVar.size() + zzwmVar2.size();
        int i2 = zzwmVar.zzc[zzwmVar.size()] + zzwmVar2.zzc[zzwmVar2.size()];
        int i3 = size + 1;
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        int i5 = size;
        java.util.Map.Entry zzg = zzwmVar.zzg(0);
        java.util.Map.Entry zzg2 = zzwmVar2.zzg(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (zzg == null && zzg2 == null) {
                break;
            }
            int i9 = i6 + 1;
            if (zzg != null) {
                if (zzg2 != null) {
                    int compareTo = ((java.lang.String) zzg.getKey()).compareTo((java.lang.String) zzg2.getKey());
                    if (compareTo == 0) {
                        int i10 = i7 + 1;
                        int i11 = i8 + 1;
                        objArr2[i6] = zzf((java.lang.String) zzg.getKey(), i6);
                        com.google.android.libraries.places.internal.zzwl zzwlVar = (com.google.android.libraries.places.internal.zzwl) zzg.getValue();
                        com.google.android.libraries.places.internal.zzwl zzwlVar2 = (com.google.android.libraries.places.internal.zzwl) zzg2.getValue();
                        int i12 = i4;
                        int i13 = i12;
                        while (true) {
                            if (i13 >= zzwlVar.zzc() - zzwlVar.zzb() && i12 >= zzwlVar2.zzc() - zzwlVar2.zzb()) {
                                break;
                            }
                            int i14 = i13 == zzwlVar.zzc() - zzwlVar.zzb() ? 1 : i12 == zzwlVar2.zzc() - zzwlVar2.zzb() ? -1 : i4;
                            if (i14 == 0) {
                                java.lang.Object zza2 = zzwlVar.zza(i13);
                                java.lang.Object zza3 = zzwlVar2.zza(i12);
                                i = i10;
                                comparator = com.google.android.libraries.places.internal.zzwo.zzb;
                                i14 = comparator.compare(zza2, zza3);
                            } else {
                                i = i10;
                            }
                            if (i14 < 0) {
                                obj = zzwlVar.zza(i13);
                                i13++;
                            } else {
                                java.lang.Object zza4 = zzwlVar2.zza(i12);
                                i13 = i14 == 0 ? i13 + 1 : i13;
                                i12++;
                                obj = zza4;
                            }
                            objArr2[i5] = obj;
                            i5++;
                            i10 = i;
                            i4 = 0;
                        }
                        iArr[i9] = i5;
                        zzg = zzwmVar.zzg(i11);
                        zzg2 = zzwmVar2.zzg(i10);
                        i7 = i10;
                        i8 = i11;
                        i6 = i9;
                    }
                }
                int i15 = i8 + 1;
                int zzd = zzd(zzg, i6, i5, objArr2, iArr);
                zzg = zzwmVar.zzg(i15);
                i5 = zzd;
                i8 = i15;
                i6 = i9;
                i4 = 0;
            }
            int i16 = i7 + 1;
            int zzd2 = zzd(zzg2, i6, i5, objArr2, iArr);
            zzg2 = zzwmVar2.zzg(i16);
            i5 = zzd2;
            i7 = i16;
            i6 = i9;
            i4 = 0;
        }
        int i17 = iArr[i4];
        int i18 = i17 - i6;
        if (i18 != 0) {
            for (int i19 = i4; i19 <= i6; i19++) {
                iArr[i19] = iArr[i19] - i18;
            }
            int i20 = iArr[i6];
            if (zze(i2, i20)) {
                objArr = new java.lang.Object[i20];
                java.lang.System.arraycopy(objArr2, i4, objArr, i4, i6);
            } else {
                objArr = objArr2;
            }
            java.lang.System.arraycopy(objArr2, i17, objArr, i6, i20 - i6);
            objArr2 = objArr;
        }
        this.zzb = objArr2;
        int i21 = iArr[i4] + 1;
        this.zzc = zze(i3, i21) ? java.util.Arrays.copyOf(iArr, i21) : iArr;
    }

    private final int zzd(java.util.Map.Entry entry, int i, int i2, java.lang.Object[] objArr, int[] iArr) {
        com.google.android.libraries.places.internal.zzwl zzwlVar = (com.google.android.libraries.places.internal.zzwl) entry.getValue();
        int zzc = zzwlVar.zzc() - zzwlVar.zzb();
        java.lang.System.arraycopy(zzwlVar.zzb.zzb, zzwlVar.zzb(), objArr, i2, zzc);
        objArr[i] = zzf((java.lang.String) entry.getKey(), i);
        int i3 = i2 + zzc;
        iArr[i + 1] = i3;
        return i3;
    }

    private static boolean zze(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    private final java.util.Map.Entry zzf(java.lang.String str, int i) {
        return new java.util.AbstractMap.SimpleImmutableEntry(str, new com.google.android.libraries.places.internal.zzwl(this, i));
    }

    private final java.util.Map.Entry zzg(int i) {
        if (i < this.zzc[0]) {
            return (java.util.Map.Entry) this.zzb[i];
        }
        return null;
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

    zzwm(java.util.List list) {
        java.util.Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        int size = list.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        java.util.Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        int[] iArr = {0};
        this.zzb = zze(size, 0) ? java.util.Arrays.copyOf(objArr, 0) : objArr;
        this.zzc = iArr;
    }

    final /* synthetic */ int[] zzc() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Object[] zzb() {
        return this.zzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return this.zzd;
    }
}
