package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import m3.c;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzeeg implements zzeea {
    private final zzdfn zza;
    private final zzgbn zzb;
    private final zzdju zzc;
    private final zzfbz zzd;
    private final zzdml zze;
    private final zzdqk zzf;

    public zzeeg(zzdfn zzdfnVar, zzgbn zzgbnVar, zzdju zzdjuVar, zzfbz zzfbzVar, zzdml zzdmlVar, zzdqk zzdqkVar) {
        this.zza = zzdfnVar;
        this.zzb = zzgbnVar;
        this.zzc = zzdjuVar;
        this.zzd = zzfbzVar;
        this.zze = zzdmlVar;
        this.zzf = zzdqkVar;
    }

    public static zzdgx zzc(zzeeg zzeegVar, I3.b bVar, I3.b bVar2, zzfar zzfarVar, zzfaf zzfafVar, JSONObject jSONObject) {
        zzdhc zzdhcVar = (zzdhc) bVar.get();
        zzdmf zzdmfVar = (zzdmf) bVar2.get();
        zzbbp zzbbpVar = zzbby.zzcq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzeegVar.zzf.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdhd zzd = zzeegVar.zza.zzd(new zzcqm(zzfarVar, zzfafVar, null), new zzdho(zzdhcVar), new zzdga(jSONObject, zzdmfVar));
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            o.f1952C.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzeegVar.zzf.zza().putLong(zzdpy.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            zzeegVar.zzf.zza().putLong(zzdpy.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd.zzh().zzb();
        zzd.zzi().zza(zzdmfVar);
        zzd.zzg().zzc(zzdhcVar.zzs());
        zzd.zzl().zza(zzeegVar.zze, zzdhcVar.zzq());
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzeegVar.zzf.zza(), zzdpy.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzd.zza();
    }

    public static I3.b zzd(zzeeg zzeegVar, zzfar zzfarVar, zzfaf zzfafVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgbc.zzg(new zzdus(3));
        }
        if (zzfarVar.zza.zza.zzk <= 1) {
            return zzgbc.zzm(zzeegVar.zzg(zzfarVar, zzfafVar, jSONArray.getJSONObject(0)), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzeef
                @Override // com.google.android.gms.internal.ads.zzfsw
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgbc.zzh((zzdgx) obj));
                }
            }, zzeegVar.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcr)).booleanValue()) {
            zzeegVar.zzf.zzd("nsl", String.valueOf(length));
        }
        zzeegVar.zzd.zzc(Math.min(length, zzfarVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfarVar.zza.zza.zzk);
        for (int i7 = 0; i7 < zzfarVar.zza.zza.zzk; i7++) {
            if (i7 < length) {
                arrayList.add(zzeegVar.zzg(zzfarVar, zzfafVar, jSONArray.getJSONObject(i7)));
            } else {
                arrayList.add(zzgbc.zzg(new zzdus(3)));
            }
        }
        return zzgbc.zzh(arrayList);
    }

    public static I3.b zze(final zzeeg zzeegVar, zzfaf zzfafVar, final zzdmf zzdmfVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziH)).booleanValue() && c.i()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Response.TYPE, zzfafVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgbc.zzn(zzdmfVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzeeg.zzf(zzeeg.this, zzdmfVar, (JSONObject) obj);
            }
        }, zzeegVar.zzb);
    }

    public static /* synthetic */ I3.b zzf(zzeeg zzeegVar, zzdmf zzdmfVar, JSONObject jSONObject) {
        zzeegVar.zzd.zzb(zzgbc.zzh(zzdmfVar));
        if (jSONObject.optBoolean("success")) {
            return zzgbc.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnf("process json failed");
    }

    private final I3.b zzg(final zzfar zzfarVar, final zzfaf zzfafVar, final JSONObject jSONObject) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcq)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, this.zzf.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzfbz zzfbzVar = this.zzd;
        zzdju zzdjuVar = this.zzc;
        final I3.b zza = zzfbzVar.zza();
        final I3.b zzb = zzdjuVar.zzb(zzfarVar, zzfafVar, jSONObject);
        return zzgbc.zzc(zza, zzb).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeeg.zzc(zzeeg.this, zzb, zza, zzfarVar, zzfafVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        return zzgbc.zzn(zzgbc.zzn(this.zzd.zza(), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzeeg.zze(zzeeg.this, zzfafVar, (zzdmf) obj);
            }
        }, this.zzb), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzeeg.zzd(zzeeg.this, zzfarVar, zzfafVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        zzfak zzfakVar = zzfafVar.zzs;
        return (zzfakVar == null || zzfakVar.zzc == null) ? false : true;
    }
}
