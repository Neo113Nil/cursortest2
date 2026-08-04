package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.E0;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.SentryLockReason;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzcuj extends E0 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzebw zzh;
    private final Bundle zzi;
    private final double zzj;

    public zzcuj(zzfaf zzfafVar, String str, zzebw zzebwVar, zzfai zzfaiVar, String str2) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String string = null;
        this.zzb = zzfafVar == null ? null : zzfafVar.zzab;
        this.zzc = str2;
        this.zzd = zzfaiVar == null ? null : zzfaiVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfafVar != null) {
            try {
                string = zzfafVar.zzv.getString(SentryLockReason.JsonKeys.CLASS_NAME);
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzebwVar.zzc();
        this.zzh = zzebwVar;
        this.zzj = zzfafVar == null ? 0.0d : zzfafVar.zzaz;
        o.f1952C.j.getClass();
        this.zzf = System.currentTimeMillis() / 1000;
        zzbbp zzbbpVar = zzbby.zzgJ;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || zzfaiVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfaiVar.zzk;
        }
        this.zzg = (!((Boolean) c0254t.f2726c.zzb(zzbby.zzjl)).booleanValue() || zzfaiVar == null || TextUtils.isEmpty(zzfaiVar.zzi)) ? "" : zzfaiVar.zzi;
    }

    public final double zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzf;
    }

    @Override // F2.F0
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // F2.F0
    public final com.google.android.gms.ads.internal.client.zzv zzf() {
        zzebw zzebwVar = this.zzh;
        if (zzebwVar != null) {
            return zzebwVar.zza();
        }
        return null;
    }

    @Override // F2.F0
    public final String zzg() {
        return this.zza;
    }

    @Override // F2.F0
    public final String zzh() {
        return this.zzc;
    }

    @Override // F2.F0
    public final String zzi() {
        return this.zzb;
    }

    @Override // F2.F0
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzg;
    }

    public final String zzl() {
        return this.zzd;
    }
}
