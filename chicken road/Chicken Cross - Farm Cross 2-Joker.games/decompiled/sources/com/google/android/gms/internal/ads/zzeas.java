package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzeas {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzu zzd;
    protected final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final AtomicBoolean zzh;
    private final AtomicReference zzi;

    protected zzeas(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.zza = new HashMap();
        this.zzh = new AtomicBoolean();
        this.zzi = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = zzuVar;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcN)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzia)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map) {
        if (map == null || map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null paramMap.");
            return;
        }
        if (!this.zzh.getAndSet(true)) {
            final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmg);
            this.zzi.set(com.google.android.gms.ads.internal.util.zzac.zzc(this.zzb, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzeaq
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    zzeas.this.zzg(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.zzi.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void zzb(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zza(map);
        final String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!parseBoolean || this.zzg) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzear
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeas.this.zzd.zzc(generateUrl, null);
                    }
                });
            }
        }
    }

    protected final String zzc(Map map) {
        return this.zzf.generateUrl(map);
    }

    public final ConcurrentHashMap zzd() {
        return new ConcurrentHashMap(this.zza);
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        return this.zzd.zzc(generateUrl, null);
    }

    public final void zzf(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zza(map);
        final String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoX)).booleanValue() || this.zze) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeap
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeas.this.zzd.zzc(generateUrl, null);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzi.set(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, str));
    }
}
