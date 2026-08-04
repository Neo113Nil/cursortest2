package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.DebugMeta;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    public final I3.b zzb(final zzfar zzfarVar, final zzfaf zzfafVar, final JSONObject jSONObject) {
        final I3.b bVarZzh;
        JSONObject jSONObjectOptJSONObject;
        I3.b bVarZzh2;
        JSONArray jSONArrayOptJSONArray;
        final I3.b bVarZzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzefk {
                zzdhc zzdhcVar = new zzdhc();
                JSONObject jSONObject2 = jSONObject;
                zzdhcVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdhcVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                zzfar zzfarVar2 = zzfarVar;
                zzdhcVar.zzV(strOptString);
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
                String strOptString2 = jSONObject2.optString("headline", null);
                if (zzfafVar2.zzM) {
                    o oVar = o.f1952C;
                    P p5 = oVar.f1957c;
                    Resources resourcesZze = oVar.f1961g.zze();
                    strOptString2 = k.f(resourcesZze != null ? resourcesZze.getString(R.string.s7) : "Test Ad", " : ", strOptString2);
                }
                zzdhcVar.zzZ("headline", strOptString2);
                zzdhcVar.zzZ(SentryLogEvent.JsonKeys.BODY, jSONObject2.optString(SentryLogEvent.JsonKeys.BODY, null));
                zzdhcVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdhcVar.zzZ("store", jSONObject2.optString("store", null));
                zzdhcVar.zzZ("price", jSONObject2.optString("price", null));
                zzdhcVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdhcVar;
            }
        });
        final I3.b bVarZzf = this.zzb.zzf(jSONObject, DebugMeta.JsonKeys.IMAGES);
        zzfai zzfaiVar = zzfarVar.zzb.zzb;
        zzdkj zzdkjVar = this.zzb;
        final I3.b bVarZzg = zzdkjVar.zzg(jSONObject, DebugMeta.JsonKeys.IMAGES, zzfafVar, zzfaiVar);
        final I3.b bVarZze = zzdkjVar.zze(jSONObject, "secondary_image");
        final I3.b bVarZze2 = zzdkjVar.zze(jSONObject, "app_icon");
        final I3.b bVarZzd = zzdkjVar.zzd(jSONObject, "attribution");
        final I3.b bVarZzh3 = this.zzb.zzh(jSONObject, zzfafVar, zzfarVar.zzb.zzb);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmT)).booleanValue() || !jSONObject.has(RRWebVideoEvent.EVENT_TAG)) {
            bVarZzh = zzgbc.zzh(new Bundle());
            break;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(RRWebVideoEvent.EVENT_TAG);
        if (jSONObjectOptJSONObject2.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("flags")) != null) {
            int i7 = 0;
            while (true) {
                if (i7 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i7);
                    if (jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject3.optString("key").equals("afma_video_player_type")) {
                        i7++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject3.optString("value")) == 3) {
                                zzdkj zzdkjVar2 = this.zzb;
                                zzbzf zzbzfVar = new zzbzf();
                                zzgbc.zzr(bVarZzh3, new zzdki(zzdkjVar2, zzbzfVar), zzbza.zzf);
                                bVarZzh = zzbzfVar;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                bVarZzh = zzgbc.zzh(new Bundle());
                break;
            }
        }
        bVarZzh = zzgbc.zzh(new Bundle());
        break;
        final I3.b bVarZza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdkj zzdkjVar3 = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            bVarZzh2 = TextUtils.isEmpty(strOptString) ? zzgbc.zzh(null) : zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdjy
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    return zzdkj.zzc(zzdkjVar3, strOptString, obj);
                }
            }, zzbza.zzf);
        } else {
            bVarZzh2 = zzgbc.zzh(null);
        }
        final I3.b bVar = bVarZzh2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVarZzb);
        arrayList.add(bVarZzf);
        arrayList.add(bVarZzg);
        arrayList.add(bVarZze);
        arrayList.add(bVarZze2);
        arrayList.add(bVarZzd);
        arrayList.add(bVarZzh3);
        arrayList.add(bVarZzh);
        arrayList.add(bVarZza);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue() || zzc(jSONObject)) {
            arrayList.add(bVar);
        }
        return zzgbc.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdju.zza(this.zza, bVarZzb, bVarZzf, bVarZze2, bVarZze, bVarZzd, jSONObject, bVarZzh3, bVarZzh, bVarZzg, bVar, bVarZza);
            }
        }, this.zza);
    }
}
