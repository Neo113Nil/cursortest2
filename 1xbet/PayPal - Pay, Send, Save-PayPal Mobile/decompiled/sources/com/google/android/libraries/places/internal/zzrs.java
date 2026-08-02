package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzrs {
    private final int[] zza;
    private final com.google.android.libraries.places.internal.zzrq zzb;
    private com.google.android.libraries.places.internal.zzrq zzc;
    private int zzd;
    private int zze;
    private int zzf;

    private zzrs(int[] iArr) {
        this.zza = iArr;
        com.google.android.libraries.places.internal.zzrq zzrqVar = new com.google.android.libraries.places.internal.zzrq(-1, -1, null);
        this.zzb = zzrqVar;
        this.zzc = zzrqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001f, code lost:
    
        r6 = r0.zzc.zzd;
        r8 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        if (r6.containsKey(r8) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r0.zzc.zzd.put(r8, new com.google.android.libraries.places.internal.zzrq(r1, 1073741824, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
    
        r5.zzc = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        r5.zzc = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        r0.zzd = r1;
        r0.zze++;
        r0.zzb();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.libraries.places.internal.zzrs zza(int[] iArr) {
        com.google.android.libraries.places.internal.zzrs zzrsVar = new com.google.android.libraries.places.internal.zzrs(iArr);
        int i = 0;
        while (i < iArr.length) {
            zzrsVar.zzf++;
            int[] iArr2 = zzrsVar.zza;
            int i2 = iArr2[i];
            while (true) {
                com.google.android.libraries.places.internal.zzrq zzrqVar = null;
                while (true) {
                    if (zzrsVar.zzf <= 0) {
                        break;
                    }
                    if (zzrsVar.zze == 0) {
                        break;
                    }
                    int i3 = ((com.google.android.libraries.places.internal.zzrq) zzrsVar.zzc.zzd.get(java.lang.Integer.valueOf(iArr2[zzrsVar.zzd]))).zza;
                    int i4 = zzrsVar.zze;
                    if (iArr2[i3 + i4] == i2) {
                        if (zzrqVar != null) {
                            zzrqVar.zzc = zzrsVar.zzc;
                        }
                        zzrsVar.zze = i4 + 1;
                        zzrsVar.zzb();
                    } else {
                        com.google.android.libraries.places.internal.zzrq zzrqVar2 = (com.google.android.libraries.places.internal.zzrq) zzrsVar.zzc.zzd.get(java.lang.Integer.valueOf(iArr2[zzrsVar.zzd]));
                        com.google.android.libraries.places.internal.zzrq zzrqVar3 = new com.google.android.libraries.places.internal.zzrq(zzrqVar2.zza, (zzrsVar.zze + r8) - 1, null);
                        zzrsVar.zzc.zzd.put(java.lang.Integer.valueOf(iArr2[zzrsVar.zzd]), zzrqVar3);
                        java.util.Map map = zzrqVar3.zzd;
                        int i5 = zzrqVar3.zzb + 1;
                        map.put(java.lang.Integer.valueOf(iArr2[i5]), zzrqVar2);
                        zzrqVar2.zza = i5;
                        if (zzrqVar != null) {
                            zzrqVar.zzc = zzrqVar3;
                        }
                        map.put(java.lang.Integer.valueOf(i2), new com.google.android.libraries.places.internal.zzrq(i, 1073741824, null));
                        zzrsVar.zzf--;
                        zzrsVar.zzc();
                        zzrqVar = zzrqVar3;
                    }
                }
                zzrsVar.zzf--;
                zzrsVar.zzc();
            }
            i++;
        }
        return zzrsVar;
    }

    private final void zze(com.google.android.libraries.places.internal.zzrq zzrqVar, java.lang.StringBuilder sb) {
        for (com.google.android.libraries.places.internal.zzrq zzrqVar2 : zzrqVar.zzd.values()) {
            sb.append("  ");
            sb.append(zzrqVar);
            sb.append(" -> ");
            sb.append(zzrqVar2);
            sb.append(" [label=\"");
            int[] iArr = this.zza;
            sb.append(java.util.Arrays.toString(java.util.Arrays.copyOfRange(iArr, zzrqVar2.zza, java.lang.Math.min(iArr.length, zzrqVar2.zzb + 1))));
            sb.append("\"]\n");
            zze(zzrqVar2, sb);
        }
    }

    private final boolean zzf(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.zza;
            int length = iArr.length;
            int min = java.lang.Math.min(length, i2);
            if (min - i == java.lang.Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("digraph {\n");
        zze(this.zzb, sb);
        sb.append("}");
        return sb.toString();
    }

    final void zzb() {
        if (this.zze == 0) {
            return;
        }
        java.util.Map map = this.zzc.zzd;
        int[] iArr = this.zza;
        com.google.android.libraries.places.internal.zzrq zzrqVar = (com.google.android.libraries.places.internal.zzrq) map.get(java.lang.Integer.valueOf(iArr[this.zzd]));
        while (true) {
            int i = (zzrqVar.zzb - zzrqVar.zza) + 1;
            int i2 = this.zze;
            if (i > i2) {
                return;
            }
            int i3 = this.zzd + i;
            this.zzd = i3;
            this.zzc = zzrqVar;
            int i4 = i2 - i;
            this.zze = i4;
            if (i4 > 0) {
                zzrqVar = (com.google.android.libraries.places.internal.zzrq) zzrqVar.zzd.get(java.lang.Integer.valueOf(iArr[i3]));
            }
        }
    }

    final void zzc() {
        com.google.android.libraries.places.internal.zzrq zzrqVar = this.zzc.zzc;
        if (zzrqVar != null) {
            this.zzc = zzrqVar;
        } else {
            this.zzc = this.zzb;
            int i = this.zze;
            if (i > 0) {
                this.zze = i - 1;
            }
            if (this.zzf > 0) {
                this.zzd++;
            }
        }
        zzb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (zzf(r12, r13, r3, (r3 + r13) - r12) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.libraries.places.internal.zzrr zzd() {
        int i;
        int i2;
        com.google.android.libraries.places.internal.zzrp zzrpVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        com.google.android.libraries.places.internal.zzrq zzrqVar = this.zzb;
        com.google.android.libraries.places.internal.zzrp zzrpVar2 = new com.google.android.libraries.places.internal.zzrp(zzrqVar, 0, -1, -1, null);
        arrayDeque.push(zzrpVar2);
        while (!arrayDeque.isEmpty()) {
            com.google.android.libraries.places.internal.zzrp zzrpVar3 = (com.google.android.libraries.places.internal.zzrp) arrayDeque.pop();
            for (com.google.android.libraries.places.internal.zzrq zzrqVar2 : zzrpVar3.zzd.zzd.values()) {
                int i3 = zzrpVar3.zzb;
                int i4 = zzrpVar3.zzc;
                int i5 = zzrqVar2.zza;
                int i6 = zzrqVar2.zzb;
                if (!zzf(i3, i4, i5, i6)) {
                    if (zzrqVar2.zzd.isEmpty()) {
                        int i7 = zzrqVar2.zza;
                    }
                    zzrpVar = new com.google.android.libraries.places.internal.zzrp(zzrqVar2, 1, zzrqVar2.zza, i6, null);
                    if (zzrpVar2.zza >= zzrpVar.zza) {
                        zzrpVar2 = zzrpVar;
                    }
                    arrayDeque.push(zzrpVar);
                }
                zzrpVar = new com.google.android.libraries.places.internal.zzrp(zzrqVar2, zzrpVar3.zza + 1, i3, i4, null);
                if (zzrpVar2.zza >= zzrpVar.zza) {
                }
                arrayDeque.push(zzrpVar);
            }
        }
        int[] iArr = this.zza;
        int min = java.lang.Math.min(iArr.length, zzrpVar2.zzc + 1);
        int i8 = 0;
        loop2: while (true) {
            i = zzrpVar2.zzb;
            i2 = min - i;
            zzrqVar = (com.google.android.libraries.places.internal.zzrq) zzrqVar.zzd.get(java.lang.Integer.valueOf(iArr[(i8 % i2) + i]));
            if (zzrqVar == null) {
                break;
            }
            for (int i9 = zzrqVar.zza; i9 < zzrqVar.zzb + 1 && i9 < iArr.length; i9++) {
                if (iArr[(i8 % i2) + i] != iArr[i9]) {
                    break loop2;
                }
                i8++;
            }
        }
        return new com.google.android.libraries.places.internal.zzrr(i, min, i8 / i2);
    }
}
