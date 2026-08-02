package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;
import J2.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzbyr {
    final String zzf;
    private final L zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzbyr(String str, L l7) {
        this.zzf = str;
        this.zzk = l7;
    }

    private final void zzi() {
        if (((Boolean) zzbef.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i7;
        synchronized (this.zzj) {
            i7 = this.zzi;
        }
        return i7;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!((M) this.zzk).k()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context zza = zzbuy.zza(context);
                int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z4 = false;
                if (identifier == 0) {
                    int i7 = J.f3546b;
                    j.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z4 = true;
                        } else {
                            int i8 = J.f3546b;
                            j.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i9 = J.f3546b;
                        j.g("Fail to fetch AdActivity theme");
                        j.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z4);
                bundle.putInt("consent_form_action_identifier", zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        long j3;
        long j7;
        Bundle bundle;
        int i7;
        synchronized (this.zzj) {
            try {
                M m7 = (M) this.zzk;
                m7.l();
                synchronized (m7.f3551a) {
                    j3 = m7.f3564o;
                }
                o.f1952C.j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.zzb == -1) {
                    if (currentTimeMillis - j3 > ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzbg)).longValue()) {
                        this.zzd = -1;
                    } else {
                        M m8 = (M) this.zzk;
                        m8.l();
                        synchronized (m8.f3551a) {
                            i7 = m8.f3566q;
                        }
                        this.zzd = i7;
                    }
                    this.zzb = j;
                    this.zza = j;
                } else {
                    this.zza = j;
                }
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdN)).booleanValue() || (bundle = zzmVar.f10758c) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i8 = this.zzd + 1;
                    this.zzd = i8;
                    if (i8 == 0) {
                        this.zze = 0L;
                        ((M) this.zzk).t(currentTimeMillis);
                    } else {
                        M m9 = (M) this.zzk;
                        m9.l();
                        synchronized (m9.f3551a) {
                            j7 = m9.f3565p;
                        }
                        this.zze = currentTimeMillis - j7;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
