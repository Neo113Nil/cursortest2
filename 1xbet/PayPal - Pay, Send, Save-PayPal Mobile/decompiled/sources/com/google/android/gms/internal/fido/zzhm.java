package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhm extends com.google.android.gms.internal.fido.zzhp {
    private final int zza;
    private final com.google.android.gms.internal.fido.zzcj zzb;

    zzhm(com.google.android.gms.internal.fido.zzcj zzcjVar) throws com.google.android.gms.internal.fido.zzhf {
        zzcjVar.getClass();
        this.zzb = zzcjVar;
        com.google.android.gms.internal.fido.zzdc it = zzcjVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            int zzb = ((com.google.android.gms.internal.fido.zzhp) entry.getKey()).zzb();
            i = i < zzb ? zzb : i;
            int zzb2 = ((com.google.android.gms.internal.fido.zzhp) entry.getValue()).zzb();
            if (i < zzb2) {
                i = zzb2;
            }
        }
        int i2 = i + 1;
        this.zza = i2;
        if (i2 > 8) {
            throw new com.google.android.gms.internal.fido.zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        int compareTo;
        int size;
        int size2;
        com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) obj;
        if (zzd(com.visa.cbp.getEncExpo.IResultReceiver2StubProxy) != zzhpVar.zza()) {
            size2 = zzhpVar.zza();
            size = zzd(com.visa.cbp.getEncExpo.IResultReceiver2StubProxy);
        } else {
            com.google.android.gms.internal.fido.zzhm zzhmVar = (com.google.android.gms.internal.fido.zzhm) zzhpVar;
            if (this.zzb.size() == zzhmVar.zzb.size()) {
                com.google.android.gms.internal.fido.zzdc it = this.zzb.entrySet().iterator();
                com.google.android.gms.internal.fido.zzdc it2 = zzhmVar.zzb.entrySet().iterator();
                do {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return 0;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                    int compareTo2 = ((com.google.android.gms.internal.fido.zzhp) entry.getKey()).compareTo((com.google.android.gms.internal.fido.zzhp) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((com.google.android.gms.internal.fido.zzhp) entry.getValue()).compareTo((com.google.android.gms.internal.fido.zzhp) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
            size = this.zzb.size();
            size2 = zzhmVar.zzb.size();
        }
        return size - size2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zzb.equals(((com.google.android.gms.internal.fido.zzhm) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        int zzd = zzd(com.visa.cbp.getEncExpo.IResultReceiver2StubProxy);
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(zzd), this.zzb});
    }

    public final java.lang.String toString() {
        if (this.zzb.isEmpty()) {
            return "{}";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.google.android.gms.internal.fido.zzdc it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(((com.google.android.gms.internal.fido.zzhp) entry.getKey()).toString().replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\n  "), ((com.google.android.gms.internal.fido.zzhp) entry.getValue()).toString().replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\n  "));
        }
        com.google.android.gms.internal.fido.zzbd zza = com.google.android.gms.internal.fido.zzbd.zza(",\n  ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\n  ");
        try {
            com.google.android.gms.internal.fido.zzbc.zza(sb, linkedHashMap.entrySet().iterator(), zza, " : ");
            sb.append("\n}");
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final com.google.android.gms.internal.fido.zzcj zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(com.visa.cbp.getEncExpo.IResultReceiver2StubProxy);
    }
}
