package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@zzadh
/* loaded from: classes.dex */
public final class zzajv implements zzgj {
    private final Object lock;

    @VisibleForTesting
    private final zzajr zzcqn;

    @VisibleForTesting
    private final HashSet<zzajj> zzcqo;

    @VisibleForTesting
    private final HashSet<zzaju> zzcqp;

    public zzajv() {
        this(zzkb.zzih());
    }

    private zzajv(String str) {
        this.lock = new Object();
        this.zzcqo = new HashSet<>();
        this.zzcqp = new HashSet<>();
        this.zzcqn = new zzajr(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final Bundle zza(Context context, zzajs zzajsVar, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putBundle("app", this.zzcqn.zzk(context, str));
            Bundle bundle2 = new Bundle();
            Iterator<zzaju> it = this.zzcqp.iterator();
            while (it.hasNext()) {
                zzaju next = it.next();
                bundle2.putBundle(next.zzqm(), next.toBundle());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzajj> it2 = this.zzcqo.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toBundle());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzajsVar.zza(this.zzcqo);
            this.zzcqo.clear();
        }
        return bundle;
    }

    public final void zza(zzajj zzajjVar) {
        synchronized (this.lock) {
            this.zzcqo.add(zzajjVar);
        }
    }

    public final void zza(zzaju zzajuVar) {
        synchronized (this.lock) {
            this.zzcqp.add(zzajuVar);
        }
    }

    public final void zzb(zzjj zzjjVar, long j) {
        synchronized (this.lock) {
            this.zzcqn.zzb(zzjjVar, j);
        }
    }

    public final void zzb(HashSet<zzajj> hashSet) {
        synchronized (this.lock) {
            this.zzcqo.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzh(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
        if (!z) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzj(currentTimeMillis);
            com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzaf(this.zzcqn.zzcqg);
            return;
        }
        if (currentTimeMillis - com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzrb() > ((Long) zzkb.zzik().zzd(zznk.zzayi)).longValue()) {
            this.zzcqn.zzcqg = -1;
        } else {
            this.zzcqn.zzcqg = com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzrc();
        }
    }

    public final void zzpm() {
        synchronized (this.lock) {
            this.zzcqn.zzpm();
        }
    }

    public final void zzpn() {
        synchronized (this.lock) {
            this.zzcqn.zzpn();
        }
    }
}
