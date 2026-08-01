package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzftu {
    private final Map zza;
    private final zzfve zzb;
    private final zzfuf zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;
    private final zzftp zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;

    zzftu(zzfve zzfveVar, zzfuf zzfufVar, Context context, Clock clock, zzftp zzftpVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put(AdFormat.APP_OPEN_AD, new HashMap());
        hashMap.put(AdFormat.INTERSTITIAL, new HashMap());
        hashMap.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfveVar;
        this.zzc = zzfufVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzftpVar;
        this.zzj = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzl(boolean z) {
        ArrayList arrayList = new ArrayList();
        Map map = this.zza;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(((Map) it.next()).values());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzfvd zzfvdVar = (zzfvd) arrayList.get(i);
            if (z) {
                zzfvdVar.zzj();
            } else {
                zzfvdVar.zzi();
            }
        }
    }

    private final Object zzn(Class cls, AdFormat adFormat, String str) {
        zzfuf zzfufVar = this.zzc;
        Clock clock = this.zzg;
        zzfufVar.zze(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return null;
            }
            zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
            if (zzfvdVar != null && adFormat.equals(zzfvdVar.zzq())) {
                zzful zzfulVar = new zzful(zzfvdVar.zzr(), zzfvdVar.zzq());
                zzfulVar.zza(str);
                zzfum zzfumVar = new zzfum(zzfulVar, null);
                zzfufVar.zzf(clock.currentTimeMillis(), zzfumVar, zzfvdVar.zzs(), zzfvdVar.zzt(), "2");
                try {
                    String zzl = zzfvdVar.zzl();
                    Object zzg = zzfvdVar.zzg();
                    Object cast = zzg == null ? null : cls.cast(zzg);
                    if (cast != null) {
                        zzfufVar.zzh(clock.currentTimeMillis(), zzfvdVar.zzs(), zzfvdVar.zzt(), zzl, zzfumVar, "2");
                    }
                    return cast;
                } catch (ClassCastException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PreloadAdManager.pollAd");
                    String name = cls.getName();
                    String.valueOf(name);
                    com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(name)), e);
                }
            }
            return null;
        }
    }

    private final boolean zzo(AdFormat adFormat) {
        Map map = this.zza;
        int size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int ordinal = adFormat.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfD)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfC)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfB)).intValue(), 1));
    }

    public final boolean zza(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        int zzT;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfts(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzftt(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return false;
        }
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                if (!((Map) map.get(adFormat)).containsKey(str)) {
                    if (zzo(adFormat)) {
                        if (zzfpVar.zze) {
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzT)).booleanValue() && (zzT = this.zzj.zzT()) > 0) {
                                zzfpVar = zzfpVar.zza(zzT);
                            }
                        }
                        zzfvd zzb = this.zzb.zzb(str, zzfpVar, zzceVar);
                        if (zzb != null) {
                            AtomicInteger atomicInteger = this.zzh;
                            if (atomicInteger != null) {
                                zzb.zzn(atomicInteger.get());
                            }
                            zzfuf zzfufVar = this.zzc;
                            zzb.zzm(zzfufVar);
                            synchronized (map) {
                                if (!((Map) map.get(adFormat)).containsKey(str) && zzo(adFormat)) {
                                    ((Map) map.get(adFormat)).put(str, zzb);
                                    zzftp zzftpVar = this.zzi;
                                    if (zzftpVar != null) {
                                        zzftpVar.zze(str, adFormat, zzb);
                                    } else {
                                        zzb.zzd();
                                    }
                                    zzful zzfulVar = new zzful(zzfpVar.zza, adFormat);
                                    zzfulVar.zza(str);
                                    zzfufVar.zza(zzfpVar.zzd, this.zzg.currentTimeMillis(), new zzfum(zzfulVar, null), "2");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb(AdFormat adFormat, String str) {
        zzfum zzfumVar;
        Clock clock = this.zzg;
        long currentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
            String zzl = zzfvdVar == null ? null : zzfvdVar.zzl();
            boolean z = zzl != null && adFormat.equals(zzfvdVar.zzq());
            Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfvdVar == null) {
                zzfumVar = null;
            } else {
                zzful zzfulVar = new zzful(zzfvdVar.zzr(), adFormat);
                zzfulVar.zza(str);
                zzfumVar = new zzfum(zzfulVar, null);
            }
            this.zzc.zzd(zzfvdVar == null ? 0 : zzfvdVar.zzs(), zzfvdVar != null ? zzfvdVar.zzt() : 0, currentTimeMillis, valueOf, zzl, zzfumVar, "2");
            return z;
        }
    }

    public final zzcda zzc(String str) {
        return (zzcda) zzn(zzcda.class, AdFormat.REWARDED, str);
    }

    public final zzbgz zzd(String str) {
        return (zzbgz) zzn(zzbgz.class, AdFormat.APP_OPEN_AD, str);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzn(com.google.android.gms.ads.internal.client.zzbu.class, AdFormat.INTERSTITIAL, str);
    }

    public final com.google.android.gms.ads.internal.client.zzfp zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
                this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfvdVar == null ? null : zzfvdVar.zzr(), adFormat, zzfvdVar == null ? -1 : zzfvdVar.zzs(), zzfvdVar != null ? zzfvdVar.zzt() : -1);
                if (zzfvdVar != null) {
                    return zzfvdVar.zzo();
                }
            }
        }
        return null;
    }

    public final int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return 0;
            }
            zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
            int zzt = zzfvdVar != null ? zzfvdVar.zzt() : 0;
            this.zzc.zzp(zzt, this.zzg.currentTimeMillis(), str, zzfvdVar == null ? null : zzfvdVar.zzr(), adFormat, zzfvdVar == null ? -1 : zzfvdVar.zzs());
            return zzt;
        }
    }

    public final Map zzh(int i) {
        HashMap hashMap = new HashMap();
        Map map = this.zza;
        AdFormat adFormat = AdFormat.getAdFormat(i);
        synchronized (map) {
            if (adFormat != null) {
                if (map.containsKey(adFormat)) {
                    for (zzfvd zzfvdVar : ((Map) map.get(adFormat)).values()) {
                        hashMap.put(zzfvdVar.zzp(), zzfvdVar.zzo());
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), hashMap.size());
                    return hashMap;
                }
            }
            return hashMap;
        }
    }

    public final boolean zzi(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).remove(str);
            if (zzfvdVar == null) {
                return false;
            }
            zzfvdVar.zzh();
            zzftp zzftpVar = this.zzi;
            if (zzftpVar != null) {
                zzftpVar.zzf(zzfvdVar);
            }
            int zzt = zzfvdVar.zzt();
            zzfvdVar.zzv();
            this.zzc.zzm(this.zzg.currentTimeMillis(), str, zzfvdVar.zzr(), adFormat, zzfvdVar.zzs(), zzt);
            return true;
        }
    }

    public final void zzj(int i) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return;
        }
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                Map map2 = (Map) map.get(adFormat);
                int size = map2.size();
                if (size == 0) {
                    return;
                }
                zzgxm zzq = zzgxm.zzq(map2.values());
                map2.clear();
                int size2 = zzq.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zzfvd zzfvdVar = (zzfvd) zzq.get(i2);
                    if (zzfvdVar != null) {
                        zzfvdVar.zzh();
                        zzftp zzftpVar = this.zzi;
                        if (zzftpVar != null) {
                            zzftpVar.zzf(zzfvdVar);
                        }
                        zzfvdVar.zzv();
                        String zzp = zzfvdVar.zzp();
                        String.valueOf(zzp);
                        String valueOf = String.valueOf(zzp);
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(valueOf));
                    }
                }
                String concat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
                this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
            }
        }
    }

    final /* synthetic */ void zzk(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzC)).booleanValue()) {
            zzl(z);
        }
    }
}
