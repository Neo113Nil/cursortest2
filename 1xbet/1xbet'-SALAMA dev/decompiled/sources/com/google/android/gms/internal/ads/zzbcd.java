package com.google.android.gms.internal.ads;

import E2.o;
import I2.A;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbcd {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbcd zzbcdVar) throws Throwable {
        while (true) {
            try {
                zzbcn zzbcnVar = (zzbcn) zzbcdVar.zza.take();
                zzbcm zzbcmVarZza = zzbcnVar.zza();
                if (!TextUtils.isEmpty(zzbcmVarZza.zzb())) {
                    zzbcdVar.zzg(zzbcdVar.zzb(zzbcdVar.zzb, zzbcnVar.zzb()), zzbcmVarZza);
                }
            } catch (InterruptedException e7) {
                int i7 = J.f3546b;
                j.h("CsiReporter:reporter interrupted", e7);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbcm zzbcmVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbcmVar != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbcmVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbcmVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbcmVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbcmVar.zza());
            }
            string = sb.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!this.zzh.get()) {
            P p5 = o.f1952C.f1957c;
            new A(this.zze, this.zzf, string, null).zzb();
            return;
        }
        File file = this.zzi;
        try {
            if (file == null) {
                int i7 = J.f3546b;
                j.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (IOException e7) {
                        int i8 = J.f3546b;
                        j.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e7);
                        return;
                    }
                } catch (IOException e8) {
                    e = e8;
                    fileOutputStream = fileOutputStream2;
                    int i9 = J.f3546b;
                    j.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e9) {
                            j.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e9);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e11) {
                int i10 = J.f3546b;
                j.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
            }
        }
        throw th;
    }

    public final zzbcj zza(String str) {
        zzbcj zzbcjVar = (zzbcj) this.zzc.get(str);
        return zzbcjVar != null ? zzbcjVar : zzbcj.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbdt.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfon.zza(zzfom.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcc
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzbcd.zzc(this.zza);
            }
        });
        Map map2 = this.zzc;
        zzbcj zzbcjVar = zzbcj.zzb;
        map2.put("action", zzbcjVar);
        this.zzc.put("ad_format", zzbcjVar);
        this.zzc.put("e", zzbcj.zzc);
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbcn zzbcnVar) {
        return this.zza.offer(zzbcnVar);
    }
}
