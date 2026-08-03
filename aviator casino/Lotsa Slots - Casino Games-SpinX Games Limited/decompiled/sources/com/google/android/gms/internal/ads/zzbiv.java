package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzbiv {
    java.lang.String zzd;
    android.content.Context zze;
    java.lang.String zzf;
    private java.util.concurrent.atomic.AtomicBoolean zzh;
    private java.io.File zzi;
    final java.util.concurrent.BlockingQueue zza = new java.util.concurrent.ArrayBlockingQueue(100);
    final java.util.LinkedHashMap zzb = new java.util.LinkedHashMap();
    final java.util.Map zzc = new java.util.HashMap();
    private final java.util.HashSet zzg = new java.util.HashSet(java.util.Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void zzg(java.util.Map map, com.google.android.gms.internal.ads.zzbje zzbjeVar) {
        java.io.FileOutputStream fileOutputStream;
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(this.zzd).buildUpon();
        for (java.util.Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String uri = buildUpon.build().toString();
        if (zzbjeVar != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(uri);
            if (!android.text.TextUtils.isEmpty(zzbjeVar.zza())) {
                sb.append("&it=");
                sb.append(zzbjeVar.zza());
            }
            if (!android.text.TextUtils.isEmpty(zzbjeVar.zzb())) {
                sb.append("&blat=");
                sb.append(zzbjeVar.zzb());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzO(this.zze, this.zzf, uri);
            return;
        }
        java.io.File file = this.zzi;
        if (file == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, true);
            } catch (java.io.IOException e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (java.io.IOException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (java.io.IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (java.io.IOException e4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (java.io.IOException e5) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }

    public final void zza(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.io.File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkl.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = android.os.Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new java.io.File(com.google.android.gms.internal.ads.zzfzk.zza().zza(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.zzb.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbiu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbiv.this.zzf();
            }
        });
        java.util.Map map2 = this.zzc;
        com.google.android.gms.internal.ads.zzbjb zzbjbVar = com.google.android.gms.internal.ads.zzbjb.zzb;
        map2.put("action", zzbjbVar);
        map2.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzbjbVar);
        map2.put("e", com.google.android.gms.internal.ads.zzbjb.zzc);
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzbjf zzbjfVar) {
        return this.zza.offer(zzbjfVar);
    }

    final java.util.Map zzc(java.util.Map map, java.util.Map map2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            linkedHashMap.put(str, zzd(str).zza((java.lang.String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final com.google.android.gms.internal.ads.zzbjb zzd(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbjb zzbjbVar = (com.google.android.gms.internal.ads.zzbjb) this.zzc.get(str);
        return zzbjbVar != null ? zzbjbVar : com.google.android.gms.internal.ads.zzbjb.zza;
    }

    public final void zze(java.lang.String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzc(this.zzb, linkedHashMap), null);
    }

    final /* synthetic */ void zzf() {
        while (true) {
            try {
                com.google.android.gms.internal.ads.zzbjf zzbjfVar = (com.google.android.gms.internal.ads.zzbjf) this.zza.take();
                com.google.android.gms.internal.ads.zzbje zzc = zzbjfVar.zzc();
                if (!android.text.TextUtils.isEmpty(zzc.zza())) {
                    zzg(zzc(this.zzb, zzbjfVar.zze()), zzc);
                }
            } catch (java.lang.InterruptedException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
