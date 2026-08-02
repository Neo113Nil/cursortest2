package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.L;
import I2.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzbyu implements zzayq {
    final zzbyr zza;
    private final L zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzbys zzf = new zzbys();

    public zzbyu(String str, L l7) {
        this.zza = new zzbyr(str, l7);
        this.zze = l7;
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zza(boolean z4) {
        long j;
        int i7;
        o.f1952C.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z4) {
            M m7 = (M) this.zze;
            m7.l();
            synchronized (m7.f3551a) {
                j = m7.f3564o;
            }
            if (currentTimeMillis - j > ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzbg)).longValue()) {
                this.zza.zzd = -1;
            } else {
                zzbyr zzbyrVar = this.zza;
                M m8 = (M) this.zze;
                m8.l();
                synchronized (m8.f3551a) {
                    i7 = m8.f3566q;
                }
                zzbyrVar.zzd = i7;
            }
            this.zzg = true;
            return;
        }
        M m9 = (M) this.zze;
        m9.l();
        synchronized (m9.f3551a) {
            try {
                if (m9.f3564o != currentTimeMillis) {
                    m9.f3564o = currentTimeMillis;
                    SharedPreferences.Editor editor = m9.f3557g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        m9.f3557g.apply();
                    }
                    m9.m();
                }
            } finally {
            }
        }
        L l7 = this.zze;
        int i8 = this.zza.zzd;
        M m10 = (M) l7;
        m10.l();
        synchronized (m10.f3551a) {
            try {
                if (m10.f3566q == i8) {
                    return;
                }
                m10.f3566q = i8;
                SharedPreferences.Editor editor2 = m10.f3557g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i8);
                    m10.f3557g.apply();
                }
                m10.m();
            } finally {
            }
        }
    }

    public final int zzb() {
        int zza;
        synchronized (this.zzd) {
            zza = this.zza.zza();
        }
        return zza;
    }

    public final zzbyj zzc(InterfaceC1436a interfaceC1436a, String str) {
        return new zzbyj(interfaceC1436a, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzbyj zzbyjVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbyjVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        synchronized (this.zzd) {
            this.zza.zzg(zzmVar, j);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfch zzfchVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(App.TYPE, this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbyj) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfchVar.zzc(hashSet);
        return bundle;
    }
}
