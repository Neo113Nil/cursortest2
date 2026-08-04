package com.google.android.recaptcha.internal;

import D6.C;
import android.app.Application;
import android.os.Build;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzcj extends i implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzbl zze;
    final /* synthetic */ zzdq zzf;
    final /* synthetic */ zzbv zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcj(Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = zzdcVar;
        this.zze = zzblVar;
        this.zzf = zzdqVar;
        this.zzg = zzbvVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzcj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 == 0) {
            Application application = this.zzb;
            int i8 = zzbz.zza;
            String str = this.zzc;
            zzdc zzdcVar = this.zzd;
            zzbl zzblVar = this.zze;
            int iZza = zzbz.zza(application);
            String packageName = application.getPackageName();
            String strZzd = zzdcVar.zzd();
            int i9 = Build.VERSION.SDK_INT;
            String strZza = zzblVar.zza();
            zzqs zzqsVarZzf = zzqt.zzf();
            zzqsVarZzf.zzs(str);
            zzqsVarZzf.zzp(packageName);
            zzqsVarZzf.zzt(iZza);
            zzqsVarZzf.zzq("18.5.1");
            zzqsVarZzf.zzr(strZzd);
            zzqsVarZzf.zze(String.valueOf(i9));
            zzqsVarZzf.zzd(strZza);
            zzqt zzqtVar = (zzqt) zzqsVarZzf.zzj();
            zzdq zzdqVar = this.zzf;
            zzbv zzbvVar = this.zzg;
            zzdc zzdcVar2 = this.zzd;
            String strZzb = zzbvVar.zzb();
            this.zza = 1;
            obj = zzdqVar.zza(strZzb, zzqtVar, zzdcVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
