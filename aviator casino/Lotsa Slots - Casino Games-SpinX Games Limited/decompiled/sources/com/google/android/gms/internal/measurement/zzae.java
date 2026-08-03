package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzae implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzao, com.google.android.gms.internal.measurement.zzak {
    final java.util.SortedMap zza;
    final java.util.Map zzb;

    public zzae() {
        this.zza = new java.util.TreeMap();
        this.zzb = new java.util.TreeMap();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzae)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzae zzaeVar = (com.google.android.gms.internal.measurement.zzae) obj;
        if (zzh() != zzaeVar.zzh()) {
            return false;
        }
        java.util.SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int intValue = ((java.lang.Integer) sortedMap.firstKey()).intValue(); intValue <= ((java.lang.Integer) sortedMap.lastKey()).intValue(); intValue++) {
            if (!zzl(intValue).equals(zzaeVar.zzl(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzad(this);
    }

    public final java.lang.String toString() {
        return zzs(",");
    }

    public final java.util.List zzb() {
        java.util.ArrayList arrayList = new java.util.ArrayList(zzh());
        for (int i = 0; i < zzh(); i++) {
            arrayList.add(zzl(i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        return zzs(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || com.adjust.sdk.Constants.PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? com.google.android.gms.internal.measurement.zzba.zza(str, this, zzgVar, list) : com.google.android.gms.internal.measurement.zzak.CC.zzu(this, new com.google.android.gms.internal.measurement.zzas(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        java.util.SortedMap sortedMap = this.zza;
        return sortedMap.size() == 1 ? zzl(0).zzd() : sortedMap.size() <= 0 ? java.lang.Double.valueOf(0.0d) : java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return new com.google.android.gms.internal.measurement.zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final java.util.Iterator zzg() {
        return this.zza.keySet().iterator();
    }

    public final int zzh() {
        java.util.SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((java.lang.Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int zzi() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(java.lang.String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final com.google.android.gms.internal.measurement.zzao zzk(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzao zzaoVar;
        return "length".equals(str) ? new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzh())) : (!zzj(str) || (zzaoVar = (com.google.android.gms.internal.measurement.zzao) this.zzb.get(str)) == null) ? zzf : zzaoVar;
    }

    public final com.google.android.gms.internal.measurement.zzao zzl(int i) {
        com.google.android.gms.internal.measurement.zzao zzaoVar;
        if (i < zzh()) {
            return (!zzo(i) || (zzaoVar = (com.google.android.gms.internal.measurement.zzao) this.zza.get(java.lang.Integer.valueOf(i))) == null) ? zzf : zzaoVar;
        }
        throw new java.lang.IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (zzaoVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzaoVar);
        }
    }

    public final boolean zzo(int i) {
        if (i >= 0) {
            java.util.SortedMap sortedMap = this.zza;
            if (i <= ((java.lang.Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(java.lang.Integer.valueOf(i));
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final void zzp() {
        this.zza.clear();
    }

    public final void zzr(int i) {
        java.util.SortedMap sortedMap = this.zza;
        int intValue = ((java.lang.Integer) sortedMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        sortedMap.remove(java.lang.Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            sortedMap.put(valueOf, com.google.android.gms.internal.measurement.zzao.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > ((java.lang.Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i);
            com.google.android.gms.internal.measurement.zzao zzaoVar = (com.google.android.gms.internal.measurement.zzao) sortedMap.get(valueOf2);
            if (zzaoVar != null) {
                sortedMap.put(java.lang.Integer.valueOf(i - 1), zzaoVar);
                sortedMap.remove(valueOf2);
            }
        }
    }

    public final java.lang.String zzs(java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.zza.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= zzh()) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzao zzl = zzl(i);
                sb.append(str2);
                if (!(zzl instanceof com.google.android.gms.internal.measurement.zzat) && !(zzl instanceof com.google.android.gms.internal.measurement.zzam)) {
                    sb.append(zzl.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        com.google.android.gms.internal.measurement.zzae zzaeVar = new com.google.android.gms.internal.measurement.zzae();
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof com.google.android.gms.internal.measurement.zzak) {
                zzaeVar.zza.put((java.lang.Integer) entry.getKey(), (com.google.android.gms.internal.measurement.zzao) entry.getValue());
            } else {
                zzaeVar.zza.put((java.lang.Integer) entry.getKey(), ((com.google.android.gms.internal.measurement.zzao) entry.getValue()).zzt());
            }
        }
        return zzaeVar;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"elements"})
    public final void zzn(int i, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (i > 32468) {
            throw new java.lang.IllegalStateException("Array too large");
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (zzaoVar == null) {
            this.zza.remove(java.lang.Integer.valueOf(i));
        } else {
            this.zza.put(java.lang.Integer.valueOf(i), zzaoVar);
        }
    }

    public final void zzq(int i, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 21);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i >= zzh()) {
            zzn(i, zzaoVar);
            return;
        }
        java.util.SortedMap sortedMap = this.zza;
        for (int intValue = ((java.lang.Integer) sortedMap.lastKey()).intValue(); intValue >= i; intValue--) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            com.google.android.gms.internal.measurement.zzao zzaoVar2 = (com.google.android.gms.internal.measurement.zzao) sortedMap.get(valueOf);
            if (zzaoVar2 != null) {
                zzn(intValue + 1, zzaoVar2);
                sortedMap.remove(valueOf);
            }
        }
        zzn(i, zzaoVar);
    }

    public zzae(java.util.List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzn(i, (com.google.android.gms.internal.measurement.zzao) list.get(i));
            }
        }
    }
}
