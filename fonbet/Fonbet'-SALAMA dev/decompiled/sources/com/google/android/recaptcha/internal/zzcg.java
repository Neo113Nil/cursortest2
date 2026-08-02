package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import android.app.Application;
import android.webkit.WebView;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzcg extends AbstractC1362i implements Function2 {
    final /* synthetic */ WebView zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ zzbv zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ zzbo zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcg(WebView webView, Application application, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = webView;
        this.zzb = application;
        this.zzc = zzbvVar;
        this.zzd = zzdcVar;
        this.zzf = zzboVar;
        this.zze = zzdqVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzcg(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcg) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        WebView webView = this.zza;
        return new zzgv(webView == null ? new WebView(this.zzb) : webView, this.zzb, this.zzc, this.zzd, this.zzf, this.zze);
    }
}
