package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzwt extends com.google.android.libraries.places.internal.zzwr {
    private static final java.util.Map zza;
    private final com.google.android.libraries.places.internal.zzuj zzb;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.libraries.places.internal.zzuj.class);
        for (com.google.android.libraries.places.internal.zzuj zzujVar : com.google.android.libraries.places.internal.zzuj.values()) {
            com.google.android.libraries.places.internal.zzwt[] zzwtVarArr = new com.google.android.libraries.places.internal.zzwt[10];
            for (int i = 0; i < 10; i++) {
                zzwtVarArr[i] = new com.google.android.libraries.places.internal.zzwt(i, zzujVar, com.google.android.libraries.places.internal.zzuk.zza());
            }
            enumMap.put((java.util.EnumMap) zzujVar, (com.google.android.libraries.places.internal.zzuj) zzwtVarArr);
        }
        zza = java.util.Collections.unmodifiableMap(enumMap);
    }

    private zzwt(int i, com.google.android.libraries.places.internal.zzuj zzujVar, com.google.android.libraries.places.internal.zzuk zzukVar) {
        super(zzukVar, i);
        com.google.android.libraries.places.internal.zzxb.zza(zzujVar, "format char");
        this.zzb = zzujVar;
        if (zzukVar.zze()) {
            zzujVar.zze();
            return;
        }
        int zzb = zzujVar.zzb();
        zzb = zzukVar.zzk() ? zzb & 65503 : zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        zzukVar.zzl(sb);
        sb.append((char) zzb);
    }

    public static com.google.android.libraries.places.internal.zzwt zza(int i, com.google.android.libraries.places.internal.zzuj zzujVar, com.google.android.libraries.places.internal.zzuk zzukVar) {
        if (i >= 10 || !zzukVar.zze()) {
            return new com.google.android.libraries.places.internal.zzwt(i, zzujVar, zzukVar);
        }
        com.google.android.libraries.places.internal.zzwt[] zzwtVarArr = (com.google.android.libraries.places.internal.zzwt[]) zza.get(zzujVar);
        com.google.android.libraries.places.internal.zzxb.zza(zzwtVarArr, "default parameter");
        return zzwtVarArr[i];
    }

    @Override // com.google.android.libraries.places.internal.zzwr
    protected final void zzb(com.google.android.libraries.places.internal.zzws zzwsVar, java.lang.Object obj) {
        zzwsVar.zzc(obj, this.zzb, zzd());
    }
}
