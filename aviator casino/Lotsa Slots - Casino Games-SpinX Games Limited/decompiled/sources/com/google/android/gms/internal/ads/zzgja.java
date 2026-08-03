package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgja extends com.google.android.gms.internal.ads.zzgix {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzght zzb;
    private final android.util.DisplayMetrics zzc;

    zzgja(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, java.util.Map map, android.util.DisplayMetrics displayMetrics, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("g8Hou5USbHgGLmPw1BkH9QPyVyp2SXRCRzY3yGPbL7sxfyxqHR6KXwoo/P2bI6wU", "utPmmlJBn3DsRsjWpEfYOH8JhF0hoTbnHHSBi5azvE0=", zzaxmVar, zzghtVar, zzgqhVar.zza(123));
        this.zzb = zzghtVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, android.util.DisplayMetrics displayMetrics) {
        return java.lang.Math.round(d / displayMetrics.density);
    }

    private static boolean zzc(android.util.DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.util.Map map = this.zza;
        java.lang.Object obj = (android.view.MotionEvent) map.get("nv");
        android.util.DisplayMetrics displayMetrics = this.zzc;
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", obj, displayMetrics);
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        com.google.android.gms.internal.ads.zzayi zza = com.google.android.gms.internal.ads.zzayj.zza();
        java.lang.Object obj2 = objArr2[0];
        if (obj2 != null && objArr2[1] != null) {
            zza.zza(((java.lang.Long) obj2).longValue());
            zza.zzb(((java.lang.Long) objArr2[1]).longValue());
        }
        java.lang.Object obj3 = objArr2[2];
        if (obj3 != null) {
            zza.zzh(((java.lang.Long) obj3).longValue());
        }
        java.lang.Object obj4 = objArr2[3];
        if (obj4 != null) {
            zza.zzf(((java.lang.Long) obj4).longValue());
        }
        java.lang.Object obj5 = objArr2[4];
        if (obj5 != null) {
            zza.zzc(((java.lang.Long) obj5).longValue());
        }
        java.lang.Object obj6 = objArr2[5];
        if (obj6 != null) {
            zza.zzs(((java.lang.Long) obj6).longValue() != 0 ? 2 : 1);
        }
        java.lang.Object obj7 = objArr2[6];
        if (obj7 != null) {
            zza.zzj(((java.lang.Long) obj7).longValue());
        }
        java.lang.Object obj8 = objArr2[7];
        if (obj8 != null) {
            zza.zzi(((java.lang.Long) obj8).longValue());
        }
        java.lang.Object obj9 = objArr2[8];
        if (obj9 != null) {
            zza.zzt(((java.lang.Long) obj9).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzaxmVar) {
            java.lang.reflect.Method zzc = this.zzb.zzc("RYti6RI2h2/Y2PXof3Gp1AbX+o/wefouwN7AnDg2eTa2HyxUpoBLBymHRKB/R/xV", "RPcTI+OBxtVdwgZKiN6UGH5Wjl+q93TfecmKmwPvnok=");
            zzc.getClass();
            java.lang.reflect.Method method2 = zzc;
            java.lang.Object[] objArr3 = (java.lang.Object[]) zzc.invoke("", (android.view.MotionEvent) map.get("nv"), displayMetrics);
            objArr3.getClass();
            java.lang.Object[] objArr4 = objArr3;
            java.lang.Object obj10 = objArr4[0];
            if (obj10 != null) {
                zzaxmVar.zzh(((java.lang.Long) obj10).longValue());
            }
            java.lang.Object obj11 = objArr4[1];
            if (obj11 != null) {
                zzaxmVar.zzi(((java.lang.Long) obj11).longValue());
            }
            java.lang.Object obj12 = objArr4[2];
            if (obj12 != null) {
                zzaxmVar.zzj(((java.lang.Long) obj12).longValue());
            }
            java.lang.Object obj13 = objArr4[3];
            if (obj13 != null) {
                zzaxmVar.zzv(((java.lang.Long) obj13).longValue());
            }
            java.lang.Object obj14 = objArr4[4];
            if (obj14 != null) {
                zzaxmVar.zzw(((java.lang.Long) obj14).longValue());
            }
            com.google.android.gms.internal.ads.zzggn zzggnVar = (com.google.android.gms.internal.ads.zzggn) map.get("oe");
            if (zzggnVar != null) {
                long j = zzggnVar.zza;
                if (j > 0) {
                    zzaxmVar.zzz(j);
                }
                long j2 = zzggnVar.zzb;
                if (j2 > 0) {
                    zzaxmVar.zzy(j2);
                }
                long j3 = zzggnVar.zzc;
                if (j3 > 0) {
                    zzaxmVar.zzx(j3);
                }
                long j4 = zzggnVar.zzd;
                if (j4 > 0) {
                    zzaxmVar.zzA(j4);
                }
            }
            com.google.android.gms.internal.ads.zzggn zzggnVar2 = (com.google.android.gms.internal.ads.zzggn) map.get("oe");
            if (zzggnVar2 != null && zzggnVar2.zza != 0 && zzc(displayMetrics)) {
                double d = zzggnVar2.zze;
                displayMetrics.getClass();
                android.util.DisplayMetrics displayMetrics2 = displayMetrics;
                zza.zzl(zzb(d, displayMetrics));
                zza.zzm(zzb(zzggnVar2.zzh - zzggnVar2.zzf, displayMetrics));
                zza.zzn(zzb(zzggnVar2.zzi - zzggnVar2.zzg, displayMetrics));
                zza.zzq(zzb(zzggnVar2.zzf, displayMetrics));
                zza.zzr(zzb(zzggnVar2.zzg, displayMetrics));
                if (((android.view.MotionEvent) map.get("nv")) != null) {
                    long zzb = zzb(((zzggnVar2.zzf - zzggnVar2.zzh) + r1.getRawX()) - r1.getX(), displayMetrics);
                    if (zzb != 0) {
                        zza.zzo(zzb);
                    }
                    long zzb2 = zzb(((zzggnVar2.zzg - zzggnVar2.zzi) + r1.getRawY()) - r1.getY(), displayMetrics);
                    if (zzb2 != 0) {
                        zza.zzp(zzb2);
                    }
                }
            }
            zzaxmVar.zzJ(zza);
            com.google.android.gms.internal.ads.zzggo[] zzggoVarArr = (com.google.android.gms.internal.ads.zzggo[]) map.get("ro");
            if (zzggoVarArr != null && zzc(displayMetrics)) {
                for (int i = 0; i <= zzggoVarArr.length - 2; i++) {
                    com.google.android.gms.internal.ads.zzggo zzggoVar = zzggoVarArr[i];
                    com.google.android.gms.internal.ads.zzayi zza2 = com.google.android.gms.internal.ads.zzayj.zza();
                    double d2 = zzggoVar.zza;
                    displayMetrics.getClass();
                    android.util.DisplayMetrics displayMetrics3 = displayMetrics;
                    zza2.zza(zzb(d2, displayMetrics));
                    zza2.zzb(zzb(zzggoVar.zzb, displayMetrics));
                    zzaxmVar.zzK((com.google.android.gms.internal.ads.zzayj) zza2.zzbu());
                }
            }
        }
    }
}
