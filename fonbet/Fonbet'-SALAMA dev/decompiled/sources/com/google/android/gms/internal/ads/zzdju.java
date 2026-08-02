package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e1.k;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.DebugMeta;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdju {
    private final zzgbn zza;
    private final zzdkj zzb;
    private final zzdko zzc;

    public zzdju(zzgbn zzgbnVar, zzdkj zzdkjVar, zzdko zzdkoVar) {
        this.zza = zzgbnVar;
        this.zzb = zzdkjVar;
        this.zzc = zzdkoVar;
    }

    public static zzdhc zza(zzdju zzdjuVar, I3.b bVar, I3.b bVar2, I3.b bVar3, I3.b bVar4, I3.b bVar5, JSONObject jSONObject, I3.b bVar6, I3.b bVar7, I3.b bVar8, I3.b bVar9, I3.b bVar10) {
        zzdhc zzdhcVar = (zzdhc) bVar.get();
        zzdhcVar.zzP((List) bVar2.get());
        zzdhcVar.zzM((zzbfj) bVar3.get());
        zzdhcVar.zzQ((zzbfj) bVar4.get());
        zzdhcVar.zzJ((zzbfc) bVar5.get());
        zzdhcVar.zzS(zzdkj.zzj(jSONObject));
        zzdhcVar.zzL(zzdkj.zzi(jSONObject));
        zzceb zzcebVar = (zzceb) bVar6.get();
        if (zzcebVar != null) {
            zzdhcVar.zzad(zzcebVar);
            zzdhcVar.zzac(zzcebVar.zzF());
            zzdhcVar.zzab(zzcebVar.zzq());
        }
        zzdhcVar.zzd().putAll((Bundle) bVar7.get());
        zzceb zzcebVar2 = (zzceb) bVar8.get();
        if (zzcebVar2 != null) {
            zzdhcVar.zzO(zzcebVar2);
            zzdhcVar.zzae(zzcebVar2.zzF());
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue() || zzc(jSONObject)) {
            zzceb zzcebVar3 = (zzceb) bVar9.get();
            if (zzcebVar3 != null) {
                zzdhcVar.zzT(zzcebVar3);
            }
        } else {
            zzdhcVar.zzU(bVar9);
            zzdhcVar.zzX(new zzbzf());
        }
        for (zzdkn zzdknVar : (List) bVar10.get()) {
            if (zzdknVar.zza != 1) {
                zzdhcVar.zzN(zzdknVar.zzb, zzdknVar.zzd);
            } else {
                zzdhcVar.zzZ(zzdknVar.zzb, zzdknVar.zzc);
            }
        }
        return zzdhcVar;
    }

    private static final boolean zzc(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final I3.b zzb(final zzfar zzfarVar, final zzfaf zzfafVar, final JSONObject jSONObject) {
        final I3.b zzh;
        I3.b zzh2;
        JSONArray optJSONArray;
        final I3.b zzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdhc zzdhcVar = new zzdhc();
                JSONObject jSONObject2 = jSONObject;
                zzdhcVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdhcVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                zzfar zzfarVar2 = zzfarVar;
                zzdhcVar.zzV(optString);
                zzfba zzfbaVar = zzfarVar2.zza.zza;
                if (!zzfbaVar.zzg.contains(Integer.toString(zzdhcVar.zzc()))) {
                    throw new zzefk(1, k.d(zzdhcVar.zzc(), "Invalid template ID: "));
                }
                if (zzdhcVar.zzc() == 3) {
                    if (zzdhcVar.zzA() == null) {
                        throw new zzefk(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfbaVar.zzh.contains(zzdhcVar.zzA())) {
                        throw new zzefk(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfaf zzfafVar2 = zzfafVar;
                zzdhcVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String optString2 = jSONObject2.optString("headline", null);
                if (zzfafVar2.zzM) {
                    o oVar = o.f1952C;
                    P p5 = oVar.f1957c;
                    Resources zze = oVar.f1961g.zze();
                    optString2 = k.f(zze != null ? zze.getString(R.string.s7) : "Test Ad", " : ", optString2);
                }
                zzdhcVar.zzZ("headline", optString2);
                zzdhcVar.zzZ(SentryLogEvent.JsonKeys.BODY, jSONObject2.optString(SentryLogEvent.JsonKeys.BODY, null));
                zzdhcVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdhcVar.zzZ("store", jSONObject2.optString("store", null));
                zzdhcVar.zzZ("price", jSONObject2.optString("price", null));
                zzdhcVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdhcVar;
            }
        });
        final I3.b zzf = this.zzb.zzf(jSONObject, DebugMeta.JsonKeys.IMAGES);
        zzfai zzfaiVar = zzfarVar.zzb.zzb;
        zzdkj zzdkjVar = this.zzb;
        final I3.b zzg = zzdkjVar.zzg(jSONObject, DebugMeta.JsonKeys.IMAGES, zzfafVar, zzfaiVar);
        final I3.b zze = zzdkjVar.zze(jSONObject, "secondary_image");
        final I3.b zze2 = zzdkjVar.zze(jSONObject, "app_icon");
        final I3.b zzd = zzdkjVar.zzd(jSONObject, "attribution");
        final I3.b zzh3 = this.zzb.zzh(jSONObject, zzfafVar, zzfarVar.zzb.zzb);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmT)).booleanValue() && jSONObject.has(RRWebVideoEvent.EVENT_TAG)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(RRWebVideoEvent.EVENT_TAG);
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i7);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i7++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                zzdkj zzdkjVar2 = this.zzb;
                                zzbzf zzbzfVar = new zzbzf();
                                zzgbc.zzr(zzh3, new zzdki(zzdkjVar2, zzbzfVar), zzbza.zzf);
                                zzh = zzbzfVar;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zzh = zzgbc.zzh(new Bundle());
        final I3.b zza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdkj zzdkjVar3 = this.zzb;
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject3 == null) {
                zzh2 = zzgbc.zzh(null);
            } else {
                final String optString = optJSONObject3.optString("omid_html");
                zzh2 = TextUtils.isEmpty(optString) ? zzgbc.zzh(null) : zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdjy
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return zzdkj.zzc(zzdkj.this, optString, obj);
                    }
                }, zzbza.zzf);
            }
        } else {
            zzh2 = zzgbc.zzh(null);
        }
        final I3.b bVar = zzh2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh3);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue() || zzc(jSONObject)) {
            arrayList.add(bVar);
        }
        return zzgbc.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdju.zza(zzdju.this, zzb, zzf, zze2, zze, zzd, jSONObject, zzh3, zzh, zzg, bVar, zza);
            }
        }, this.zza);
    }
}
