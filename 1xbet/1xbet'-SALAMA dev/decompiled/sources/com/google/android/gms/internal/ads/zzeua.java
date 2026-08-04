package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzeua implements zzesh {
    private final JSONObject zza;

    public zzeua(Context context) {
        this.zza = zzbuk.zzc(context, VersionInfoParcel.j());
    }

    public static /* synthetic */ void zzc(zzeua zzeuaVar, JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", zzeuaVar.zza);
        } catch (JSONException unused) {
            J.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlV)).booleanValue() ? zzgbc.zzh(new zzesg() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // com.google.android.gms.internal.ads.zzesg
            public final /* synthetic */ void zza(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzesg
            public final void zzb(Object obj) {
            }
        }) : zzgbc.zzh(new zzesg() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // com.google.android.gms.internal.ads.zzesg
            public final /* synthetic */ void zza(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzesg
            public final void zzb(Object obj) {
                zzeua.zzc(this.zza, (JSONObject) obj);
            }
        });
    }
}
