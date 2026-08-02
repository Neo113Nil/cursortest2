package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import android.app.Application;
import android.os.Build;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzcj extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzbl zze;
    final /* synthetic */ zzdq zzf;
    final /* synthetic */ zzbv zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcj(Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = application;
        this.zzc = str;
        this.zzd = zzdcVar;
        this.zze = zzblVar;
        this.zzf = zzdqVar;
        this.zzg = zzbvVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzcj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 == 0) {
            Application application = this.zzb;
            int i8 = zzbz.zza;
            String str = this.zzc;
            zzdc zzdcVar = this.zzd;
            zzbl zzblVar = this.zze;
            int zza = zzbz.zza(application);
            String packageName = application.getPackageName();
            String zzd = zzdcVar.zzd();
            int i9 = Build.VERSION.SDK_INT;
            String zza2 = zzblVar.zza();
            zzqs zzf = zzqt.zzf();
            zzf.zzs(str);
            zzf.zzp(packageName);
            zzf.zzt(zza);
            zzf.zzq("18.5.1");
            zzf.zzr(zzd);
            zzf.zze(String.valueOf(i9));
            zzf.zzd(zza2);
            zzqt zzqtVar = (zzqt) zzf.zzj();
            zzdq zzdqVar = this.zzf;
            zzbv zzbvVar = this.zzg;
            zzdc zzdcVar2 = this.zzd;
            String zzb = zzbvVar.zzb();
            this.zza = 1;
            obj = zzdqVar.zza(zzb, zzqtVar, zzdcVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
