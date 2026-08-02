package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import I2.M;
import J2.j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzayn {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzaym zzaymVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc.size() >= 10) {
                    String str = "Queue is full, current size = " + this.zzc.size();
                    int i7 = J.f3546b;
                    j.b(str);
                    this.zzc.remove(0);
                }
                int i8 = this.zza;
                this.zza = i8 + 1;
                zzaymVar.zzg(i8);
                zzaymVar.zzk();
                this.zzc.add(zzaymVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzaym zzaymVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzaym zzaymVar2 = (zzaym) it.next();
                    o oVar = o.f1952C;
                    if (((M) oVar.f1961g.zzi()).i()) {
                        if (!((M) oVar.f1961g.zzi()).j() && !zzaymVar.equals(zzaymVar2) && zzaymVar2.zzd().equals(zzaymVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzaymVar.equals(zzaymVar2) && zzaymVar2.zzc().equals(zzaymVar.zzc())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzaym zzaymVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzaymVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
