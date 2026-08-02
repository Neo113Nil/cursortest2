package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import io.sentry.Session;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
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
        zzata zza = zzatb.zza();
        zza.zzc(5);
        zza.zza(zzgvy.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzatb) zza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e7) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e7);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
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
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", null).invoke(this.zza, null);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
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
