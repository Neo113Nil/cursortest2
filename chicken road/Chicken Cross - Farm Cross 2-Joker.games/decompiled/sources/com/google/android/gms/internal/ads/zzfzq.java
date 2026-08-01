package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.C4658ta;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfzq implements zzfyl {
    private final Object zza;
    private final zzfzr zzb;
    private final zzgac zzc;
    private final zzfyi zzd;
    private final boolean zze;

    zzfzq(Object obj, zzfzr zzfzrVar, zzgac zzgacVar, zzfyi zzfyiVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfzrVar;
        this.zzc = zzgacVar;
        this.zzd = zzfyiVar;
        this.zze = z;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzazs zza = zzazt.zza();
        zza.zzd(5);
        zza.zza(zziei.zzt(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzazt) zza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final synchronized String zza(Context context, String str) {
        byte[] zzj;
        Map zzb = this.zzc.zzb();
        zzb.put("f", CampaignEx.JSON_KEY_AD_Q);
        zzb.put("ctx", context);
        zzb.put(C4658ta.b, null);
        zzj = zzj(null, zzb);
        if (this.zze) {
            zzb.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] zzj;
        Map zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put(C4658ta.b, null);
        zzc.put("view", view);
        zzc.put("act", activity);
        zzj = zzj(null, zzc);
        if (this.zze) {
            zzc.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] zzj;
        Map zzd = this.zzc.zzd();
        zzd.put("f", "c");
        zzd.put("ctx", context);
        zzd.put("cs", str2);
        zzd.put(C4658ta.b, null);
        zzd.put("view", view);
        zzd.put("act", activity);
        zzj = zzj(null, zzd);
        if (this.zze) {
            zzd.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzgaa {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map zze = this.zzc.zze();
            zze.put(C4658ta.b, null);
            zze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, zze);
            this.zzd.zzb(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzgaa(2005, e);
        }
    }

    final zzfzr zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws zzgaa {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzgaa(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzgaa {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzgaa(2003, e);
        }
    }

    public final synchronized int zzh() throws zzgaa {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzgaa(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, new Class[0]).invoke(obj, new Object[0])).intValue();
    }
}
