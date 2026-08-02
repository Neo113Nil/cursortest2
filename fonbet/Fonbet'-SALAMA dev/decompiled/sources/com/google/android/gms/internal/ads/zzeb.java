package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeb {
    private static zzeb zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;
    private boolean zzf;

    private zzeb(final Context context) {
        Executor zza2 = zzcw.zza();
        this.zzb = zza2;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        zza2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdu
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzdz(zzeb.this, null), intentFilter);
            }
        });
    }

    public static synchronized zzeb zzb(Context context) {
        zzeb zzebVar;
        synchronized (zzeb.class) {
            try {
                if (zza == null) {
                    zza = new zzeb(context);
                }
                zzebVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzebVar;
    }

    public static /* synthetic */ void zzd(zzeb zzebVar, Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i7 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i7 = type != 9 ? 8 : 7;
                                }
                                i7 = 5;
                            }
                        }
                        i7 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i7 = 3;
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
                            i7 = 4;
                            break;
                        case 13:
                            i7 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i7 = 6;
                            break;
                        case 18:
                            i7 = 2;
                            break;
                        case 20:
                            if (zzen.zza >= 29) {
                                i7 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i7 = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzen.zza < 31 || i7 != 5) {
            zzebVar.zzh(i7);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            zzdv zzdvVar = new zzdv(zzebVar);
            telephonyManager.registerTelephonyCallback(zzebVar.zzb, zzdvVar);
            telephonyManager.unregisterTelephonyCallback(zzdvVar);
        } catch (RuntimeException unused2) {
            zzebVar.zzh(5);
        }
    }

    private final void zzg() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzdx zzdxVar = (zzdx) it.next();
            if (zzdxVar.zzc()) {
                this.zzc.remove(zzdxVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(int i7) {
        zzg();
        synchronized (this.zzd) {
            try {
                if (this.zzf && this.zze == i7) {
                    return;
                }
                this.zzf = true;
                this.zze = i7;
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((zzdx) it.next()).zzb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        int i7;
        synchronized (this.zzd) {
            i7 = this.zze;
        }
        return i7;
    }

    public final void zzf(zzyx zzyxVar, Executor executor) {
        boolean z4;
        zzg();
        zzdx zzdxVar = new zzdx(this, zzyxVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzdxVar);
            z4 = this.zzf;
        }
        if (z4) {
            zzdxVar.zzb();
        }
    }
}
