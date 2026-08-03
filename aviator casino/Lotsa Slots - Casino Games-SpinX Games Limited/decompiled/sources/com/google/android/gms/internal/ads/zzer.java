package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzer {
    private static com.google.android.gms.internal.ads.zzer zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;
    private final java.lang.Object zzd;
    private int zze;
    private boolean zzf;

    private zzer(final android.content.Context context) {
        java.util.concurrent.Executor zza2 = com.google.android.gms.internal.ads.zzdh.zza();
        this.zzb = zza2;
        this.zzc = new java.util.concurrent.CopyOnWriteArrayList();
        this.zzd = new java.lang.Object();
        this.zze = 0;
        zza2.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new com.google.android.gms.internal.ads.zzeq(com.google.android.gms.internal.ads.zzer.this, null), intentFilter);
            }
        });
    }

    public static synchronized com.google.android.gms.internal.ads.zzer zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzer zzerVar;
        synchronized (com.google.android.gms.internal.ads.zzer.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.ads.zzer(context);
            }
            zzerVar = zza;
        }
        return zzerVar;
    }

    private final void zzg() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzen zzenVar = (com.google.android.gms.internal.ads.zzen) it.next();
            if (zzenVar.zza()) {
                copyOnWriteArrayList.remove(zzenVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i) {
        zzg();
        synchronized (this.zzd) {
            if (this.zzf && this.zze == i) {
                return;
            }
            this.zzf = true;
            this.zze = i;
            java.util.Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzen) it.next()).zzb();
            }
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzel zzelVar, java.util.concurrent.Executor executor) {
        boolean z;
        zzg();
        com.google.android.gms.internal.ads.zzen zzenVar = new com.google.android.gms.internal.ads.zzen(this, zzelVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzenVar);
            z = this.zzf;
        }
        if (z) {
            zzenVar.zzb();
        }
    }

    public final int zzc() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    final /* synthetic */ void zzd(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (android.os.Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (java.lang.SecurityException unused) {
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || i != 5) {
            zze(i);
            return;
        }
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            telephonyManager.getClass();
            android.telephony.TelephonyManager telephonyManager2 = telephonyManager;
            com.google.android.gms.internal.ads.zzek zzekVar = new com.google.android.gms.internal.ads.zzek(this);
            telephonyManager.registerTelephonyCallback(this.zzb, zzekVar);
            telephonyManager.unregisterTelephonyCallback(zzekVar);
        } catch (java.lang.RuntimeException unused2) {
            zze(5);
        }
    }

    final /* synthetic */ java.util.concurrent.Executor zzf() {
        return this.zzb;
    }
}
