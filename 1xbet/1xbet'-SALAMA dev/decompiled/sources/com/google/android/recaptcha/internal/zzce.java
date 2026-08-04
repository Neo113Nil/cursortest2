package com.google.android.recaptcha.internal;

import G.h;
import android.app.Application;
import android.webkit.WebView;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzce extends i implements Function2 {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Application zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzbv zzf;
    final /* synthetic */ zzbo zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzce(String str, Application application, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, d dVar) {
        super(2, dVar);
        this.zzc = str;
        this.zzd = application;
        this.zze = j;
        this.zzf = zzbvVar;
        this.zzg = zzboVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        zzce zzceVar = new zzce(this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, dVar);
        zzceVar.zzb = obj;
        return zzceVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzdc) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 == 0) {
            zzdc zzdcVar = (zzdc) this.zzb;
            String str = this.zzc;
            zzco zzcoVar = zzco.zza;
            zzcx zzcxVarZza = zzco.zza(zzcoVar, str);
            if (zzcxVarZza != null) {
                return zzcxVarZza;
            }
            Application application = this.zzd;
            if (this.zze < 5000) {
                throw new zzbj(zzbh.zzj, zzbg.zzI, null);
            }
            if (h.checkSelfPermission(application, "android.permission.INTERNET") != 0) {
                throw new zzbj(zzbh.zzc, zzbg.zzap, null);
            }
            Application application2 = this.zzd;
            String str2 = this.zzc;
            long j = this.zze;
            zzbv zzbvVar = this.zzf;
            zzbo zzboVar = this.zzg;
            this.zza = 1;
            obj = zzcoVar.zzm(application2, str2, j, zzbvVar, null, null, zzboVar, zzdcVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
