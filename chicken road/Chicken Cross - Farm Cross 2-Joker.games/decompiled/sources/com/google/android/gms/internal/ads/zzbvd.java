package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbvd implements zzbqy {
    final /* synthetic */ zzbve zza;
    private final zzbug zzb;
    private final zzcgo zzc;

    public zzbvd(zzbve zzbveVar, zzbug zzbugVar, zzcgo zzcgoVar) {
        Objects.requireNonNull(zzbveVar);
        this.zza = zzbveVar;
        this.zzb = zzbugVar;
        this.zzc = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbup());
            } else {
                this.zzc.zzd(new zzbup(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
        this.zzb.zza();
    }
}
