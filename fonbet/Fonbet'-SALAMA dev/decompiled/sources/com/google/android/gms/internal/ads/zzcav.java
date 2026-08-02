package com.google.android.gms.internal.ads;

import F2.C0254t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcav {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcav(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbby.zzX);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbby.zzi);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbby.zzs);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbby.zze);
        zzbbp zzbbpVar = zzbby.zzd;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbby.zzf);
            this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbby.zzg);
            this.zzg = zzb(jSONObject, "player_precache_limit", zzbby.zzh);
            this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbby.zzj);
            this.zzi = zza(jSONObject, "use_cache_data_source", zzbby.zzeu);
            zzb(jSONObject, "min_retry_count", zzbby.zzk);
            this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbby.zzm);
            this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbby.zzcc);
            this.zzl = zza(jSONObject, "use_range_http_data_source", zzbby.zzce);
            this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbby.zzcf);
            this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbby.zzcg);
        }
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbby.zzf);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbby.zzg);
        this.zzg = zzb(jSONObject, "player_precache_limit", zzbby.zzh);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbby.zzj);
        this.zzi = zza(jSONObject, "use_cache_data_source", zzbby.zzeu);
        zzb(jSONObject, "min_retry_count", zzbby.zzk);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbby.zzm);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbby.zzcc);
        this.zzl = zza(jSONObject, "use_range_http_data_source", zzbby.zzce);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbby.zzcf);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbby.zzcg);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbbp zzbbpVar) {
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbbpVar)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbbp zzbbpVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C0254t.f2723d.f2726c.zzb(zzbbpVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbbp zzbbpVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) C0254t.f2723d.f2726c.zzb(zzbbpVar)).longValue();
    }
}
