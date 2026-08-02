package com.google.android.recaptcha.internal;

import G.h;
import a.AbstractC0603a;
import android.app.Application;
import android.webkit.WebView;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzce extends AbstractC1362i implements Function2 {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Application zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzbv zzf;
    final /* synthetic */ zzbo zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzce(String str, Application application, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzc = str;
        this.zzd = application;
        this.zze = j;
        this.zzf = zzbvVar;
        this.zzg = zzboVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        zzce zzceVar = new zzce(this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, interfaceC1287d);
        zzceVar.zzb = obj;
        return zzceVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzdc) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 == 0) {
            zzdc zzdcVar = (zzdc) this.zzb;
            String str = this.zzc;
            zzco zzcoVar = zzco.zza;
            zzcx zza = zzco.zza(zzcoVar, str);
            if (zza != null) {
                return zza;
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
