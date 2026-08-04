package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import io.sentry.Session;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzfnn implements zzfmf {
    private final Object zza;
    private final zzfno zzb;
    private final zzfnz zzc;
    private final zzfmc zzd;

    public zzfnn(Object obj, zzfno zzfnoVar, zzfnz zzfnzVar, zzfmc zzfmcVar) {
        this.zza = obj;
        this.zzb = zzfnoVar;
        this.zzc = zzfnzVar;
        this.zzd = zzfmcVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzata zzataVarZza = zzatb.zza();
        zzataVarZza.zzc(5);
        zzataVarZza.zza(zzgvy.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzatb) zzataVarZza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e7) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e7);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.zzc.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return zzi(zzj(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, map);
            this.zzd.zzd(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e7) {
            throw new zzfnx(2005, e7);
        }
    }

    public final synchronized int zze() {
        try {
        } catch (Exception e7) {
            throw new zzfnx(2006, e7);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", null).invoke(this.zza, null)).intValue();
    }

    public final zzfno zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", null).invoke(this.zza, null);
            this.zzd.zzd(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e7) {
            throw new zzfnx(2003, e7);
        }
    }

    public final synchronized boolean zzh() {
        try {
        } catch (Exception e7) {
            throw new zzfnx(2001, e7);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod(Session.JsonKeys.INIT, null).invoke(this.zza, null)).booleanValue();
    }
}
