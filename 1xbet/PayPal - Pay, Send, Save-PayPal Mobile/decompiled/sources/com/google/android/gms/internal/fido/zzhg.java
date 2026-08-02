package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhg extends com.google.android.gms.internal.fido.zzhp {
    private final com.google.android.gms.internal.fido.zzcc zza;
    private final int zzb;

    zzhg(com.google.android.gms.internal.fido.zzcc zzccVar) throws com.google.android.gms.internal.fido.zzhf {
        zzccVar.getClass();
        this.zza = zzccVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            com.google.android.gms.internal.fido.zzcc zzccVar2 = this.zza;
            if (i >= zzccVar2.size()) {
                break;
            }
            int zzb = ((com.google.android.gms.internal.fido.zzhp) zzccVar2.get(i)).zzb();
            if (i2 < zzb) {
                i2 = zzb;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.zzb = i3;
        if (i3 > 8) {
            throw new com.google.android.gms.internal.fido.zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) obj;
        if (zzd(Byte.MIN_VALUE) != zzhpVar.zza()) {
            return zzd(Byte.MIN_VALUE) - zzhpVar.zza();
        }
        com.google.android.gms.internal.fido.zzhg zzhgVar = (com.google.android.gms.internal.fido.zzhg) zzhpVar;
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        com.google.android.gms.internal.fido.zzcc zzccVar2 = zzhgVar.zza;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        int i = 0;
        while (true) {
            com.google.android.gms.internal.fido.zzcc zzccVar3 = this.zza;
            if (i >= zzccVar3.size()) {
                return 0;
            }
            int compareTo = ((com.google.android.gms.internal.fido.zzhp) zzccVar3.get(i)).compareTo((com.google.android.gms.internal.fido.zzhp) zzhgVar.zza.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((com.google.android.gms.internal.fido.zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        int zzd = zzd(Byte.MIN_VALUE);
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(zzd), this.zza});
    }

    public final java.lang.String toString() {
        if (this.zza.isEmpty()) {
            return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((com.google.android.gms.internal.fido.zzhp) zzccVar.get(i)).toString().replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\n  "));
        }
        com.google.android.gms.internal.fido.zzbd zza = com.google.android.gms.internal.fido.zzbd.zza(",\n  ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[\n  ");
        zza.zzc(sb, arrayList.iterator());
        sb.append("\n]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(Byte.MIN_VALUE);
    }
}
