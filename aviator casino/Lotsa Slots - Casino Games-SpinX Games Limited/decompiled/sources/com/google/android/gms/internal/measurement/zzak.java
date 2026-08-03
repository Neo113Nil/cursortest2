package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public interface zzak {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzak$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static com.google.android.gms.internal.measurement.zzao zzu(com.google.android.gms.internal.measurement.zzak zzakVar, com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
            if (zzakVar.zzj(zzaoVar.zzc())) {
                com.google.android.gms.internal.measurement.zzao zzk = zzakVar.zzk(zzaoVar.zzc());
                if (zzk instanceof com.google.android.gms.internal.measurement.zzai) {
                    return ((com.google.android.gms.internal.measurement.zzai) zzk).zza(zzgVar, list);
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a function", zzaoVar.zzc()));
            }
            if (!"hasOwnProperty".equals(zzaoVar.zzc())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Object has no function %s", zzaoVar.zzc()));
            }
            com.google.android.gms.internal.measurement.zzh.zza("hasOwnProperty", 1, list);
            return zzakVar.zzj(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc()) ? com.google.android.gms.internal.measurement.zzao.zzk : com.google.android.gms.internal.measurement.zzao.zzl;
        }

        public static java.util.Iterator zzv(java.util.Map map) {
            return new com.google.android.gms.internal.measurement.zzaj(map.keySet().iterator());
        }
    }

    boolean zzj(java.lang.String str);

    com.google.android.gms.internal.measurement.zzao zzk(java.lang.String str);

    void zzm(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar);
}
