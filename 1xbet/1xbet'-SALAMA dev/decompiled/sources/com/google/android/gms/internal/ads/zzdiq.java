package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzdiq {
    private final zzdnq zza;
    private final zzdmf zzb;
    private final zzcmu zzc;
    private final zzdhk zzd;

    public zzdiq(zzdnq zzdnqVar, zzdmf zzdmfVar, zzcmu zzcmuVar, zzdhk zzdhkVar) {
        this.zza = zzdnqVar;
        this.zzb = zzdmfVar;
        this.zzc = zzcmuVar;
        this.zzd = zzdhkVar;
    }

    public static /* synthetic */ void zzb(zzdiq zzdiqVar, zzceb zzcebVar, Map map) {
        int i7 = J.f3546b;
        j.f("Hiding native ads overlay.");
        zzcebVar.zzF().setVisibility(8);
        zzdiqVar.zzc.zze(false);
    }

    public static /* synthetic */ void zzd(zzdiq zzdiqVar, zzceb zzcebVar, Map map) {
        int i7 = J.f3546b;
        j.f("Showing native ads overlay.");
        zzcebVar.zzF().setVisibility(0);
        zzdiqVar.zzc.zze(true);
    }

    public static /* synthetic */ void zze(zzdiq zzdiqVar, Map map, boolean z4, int i7, String str, String str2) {
        HashMap mapM = k.m("messageType", "htmlLoaded");
        mapM.put("id", (String) map.get("id"));
        zzdiqVar.zzb.zzj("sendMessageToNativeJs", mapM);
    }

    public final View zza() {
        zzceb zzcebVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.k(), null, null);
        zzcebVarZza.zzF().setVisibility(8);
        zzcebVarZza.zzag("/sendMessageToSdk", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zzcebVarZza.zzag("/adMuted", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdil
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                this.zza.zzd.zzh();
            }
        });
        this.zzb.zzm(new WeakReference(zzcebVarZza), "/loadHtml", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdim
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, final Map map) {
                zzceb zzcebVar = (zzceb) obj;
                zzcft zzcftVarZzN = zzcebVar.zzN();
                final zzdiq zzdiqVar = this.zza;
                zzcftVarZzN.zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdip
                    @Override // com.google.android.gms.internal.ads.zzcfr
                    public final void zza(boolean z4, int i7, String str, String str2) {
                        zzdiq.zze(zzdiqVar, map, z4, i7, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcebVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcebVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zzcebVarZza), "/showOverlay", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdin
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdiq.zzd(this.zza, (zzceb) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcebVarZza), "/hideOverlay", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdio
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdiq.zzb(this.zza, (zzceb) obj, map);
            }
        });
        return zzcebVarZza.zzF();
    }
}
