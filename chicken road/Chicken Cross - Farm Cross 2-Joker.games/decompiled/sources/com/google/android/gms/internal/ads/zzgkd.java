package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgkd extends zzgka {
    private final Map zza;
    private final zzgiw zzb;
    private final DisplayMetrics zzc;

    zzgkd(zzaya zzayaVar, zzgiw zzgiwVar, Map map, DisplayMetrics displayMetrics, zzgrh zzgrhVar) {
        super("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", zzayaVar, zzgiwVar, zzgrhVar.zza(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        this.zzb = zzgiwVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr.getClass();
        Object[] objArr2 = objArr;
        zzayw zza = zzayx.zza();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            zza.zza(((Long) obj).longValue());
            zza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            zza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            zza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            zza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            zza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            zza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            zza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            zza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzayaVar) {
            Method zzc = this.zzb.zzc("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=");
            if (zzc == null) {
                throw null;
            }
            Method method2 = zzc;
            Object[] objArr3 = (Object[]) zzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
            if (objArr3 == null) {
                throw null;
            }
            Object[] objArr4 = objArr3;
            Object obj9 = objArr4[0];
            if (obj9 != null) {
                zzayaVar.zzh(((Long) obj9).longValue());
            }
            Object obj10 = objArr4[1];
            if (obj10 != null) {
                zzayaVar.zzi(((Long) obj10).longValue());
            }
            Object obj11 = objArr4[2];
            if (obj11 != null) {
                zzayaVar.zzj(((Long) obj11).longValue());
            }
            Object obj12 = objArr4[3];
            if (obj12 != null) {
                zzayaVar.zzv(((Long) obj12).longValue());
            }
            Object obj13 = objArr4[4];
            if (obj13 != null) {
                zzayaVar.zzw(((Long) obj13).longValue());
            }
            zzghq zzghqVar = (zzghq) map.get("oe");
            if (zzghqVar != null) {
                long j = zzghqVar.zza;
                if (j > 0) {
                    zzayaVar.zzz(j);
                }
                long j2 = zzghqVar.zzb;
                if (j2 > 0) {
                    zzayaVar.zzy(j2);
                }
                long j3 = zzghqVar.zzc;
                if (j3 > 0) {
                    zzayaVar.zzx(j3);
                }
                long j4 = zzghqVar.zzd;
                if (j4 > 0) {
                    zzayaVar.zzA(j4);
                }
            }
            zzghq zzghqVar2 = (zzghq) map.get("oe");
            if (zzghqVar2 != null && zzghqVar2.zza != 0 && zzc(displayMetrics)) {
                double d = zzghqVar2.zze;
                if (displayMetrics == null) {
                    throw null;
                }
                DisplayMetrics displayMetrics2 = displayMetrics;
                zza.zzl(zzb(d, displayMetrics));
                zza.zzm(zzb(zzghqVar2.zzh - zzghqVar2.zzf, displayMetrics));
                zza.zzn(zzb(zzghqVar2.zzi - zzghqVar2.zzg, displayMetrics));
                zza.zzq(zzb(zzghqVar2.zzf, displayMetrics));
                zza.zzr(zzb(zzghqVar2.zzg, displayMetrics));
                if (((MotionEvent) map.get("nv")) != null) {
                    long zzb = zzb(((zzghqVar2.zzf - zzghqVar2.zzh) + r4.getRawX()) - r4.getX(), displayMetrics);
                    if (zzb != 0) {
                        zza.zzo(zzb);
                    }
                    long zzb2 = zzb(((zzghqVar2.zzg - zzghqVar2.zzi) + r4.getRawY()) - r4.getY(), displayMetrics);
                    if (zzb2 != 0) {
                        zza.zzp(zzb2);
                    }
                }
            }
            zzayaVar.zzJ(zza);
            zzghr[] zzghrVarArr = (zzghr[]) map.get("ro");
            if (zzghrVarArr != null && zzc(displayMetrics)) {
                for (int i = 0; i <= zzghrVarArr.length - 2; i++) {
                    zzghr zzghrVar = zzghrVarArr[i];
                    zzayw zza2 = zzayx.zza();
                    double d2 = zzghrVar.zza;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    DisplayMetrics displayMetrics3 = displayMetrics;
                    zza2.zza(zzb(d2, displayMetrics));
                    zza2.zzb(zzb(zzghrVar.zzb, displayMetrics));
                    zzayaVar.zzK((zzayx) zza2.zzbu());
                }
            }
        }
    }
}
