package com.google.android.recaptcha.internal;

import D6.C;
import android.app.Application;
import android.webkit.WebView;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzcg extends i implements Function2 {
    final /* synthetic */ WebView zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ zzbv zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ zzbo zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcg(WebView webView, Application application, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar, d dVar) {
        super(2, dVar);
        this.zza = webView;
        this.zzb = application;
        this.zzc = zzbvVar;
        this.zzd = zzdcVar;
        this.zzf = zzboVar;
        this.zze = zzdqVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzcg(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcg) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        WebView webView = this.zza;
        return new zzgv(webView == null ? new WebView(this.zzb) : webView, this.zzb, this.zzc, this.zzd, this.zzf, this.zze);
    }
}
