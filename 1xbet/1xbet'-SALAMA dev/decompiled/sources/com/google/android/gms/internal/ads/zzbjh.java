package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbjh implements zzgay {
    final /* synthetic */ Map zza;
    final /* synthetic */ InterfaceC0217a zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbjl zzd;

    public zzbjh(zzbjl zzbjlVar, Map map, InterfaceC0217a interfaceC0217a, String str) {
        this.zza = map;
        this.zzb = interfaceC0217a;
        this.zzc = str;
        this.zzd = zzbjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        o.f1952C.f1961g.zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkb)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}
