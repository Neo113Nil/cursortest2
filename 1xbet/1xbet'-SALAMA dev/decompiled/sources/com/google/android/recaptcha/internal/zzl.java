package com.google.android.recaptcha.internal;

import D6.E;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p044f6.f;
import p050g6.g;
import p050g6.p;
import p065i6.d;
import t6.e;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {
    public zzdc zza;
    private final List zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzg(zze... zzeVarArr) {
        List list = this.zzb;
        h.e(list, "<this>");
        h.e(zzeVarArr, "elements");
        list.addAll(g.p0(zzeVarArr));
    }

    public final zzdc zza() {
        zzdc zzdcVar = this.zza;
        if (zzdcVar != null) {
            return zzdcVar;
        }
        return null;
    }

    public final Object zzb(String str, long j, d dVar) {
        return E.e(new zzh(this, str, j, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(long j, zzpq zzpqVar, d dVar) {
        zzi zziVar;
        if (dVar instanceof zzi) {
            zziVar = (zzi) dVar;
            int i7 = zziVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, dVar);
            }
        } else {
            zziVar = new zzi(this, dVar);
        }
        Object objE = zziVar.zza;
        a aVar = a.f14648a;
        int i8 = zziVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objE);
            zzk zzkVar = new zzk(this, j, zzpqVar, null);
            zziVar.zzc = 1;
            objE = E.e(zzkVar, zziVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(objE);
        }
        return ((f) objE).f13009a;
    }

    public final List zzd() {
        return this.zzb;
    }

    public final void zze(zze... zzeVarArr) {
        zzg((zze[]) Arrays.copyOf(zzeVarArr, 2));
    }

    public final void zzf(zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzqfVar);
        }
    }

    public /* synthetic */ zzl(List list, int i7, e eVar) {
        p pVar = p.f13308a;
        this.zzb = new ArrayList();
        zze[] zzeVarArr = (zze[]) pVar.toArray(new zze[0]);
        zzg((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
