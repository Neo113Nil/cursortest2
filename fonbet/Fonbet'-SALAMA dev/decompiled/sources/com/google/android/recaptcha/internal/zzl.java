package com.google.android.recaptcha.internal;

import D6.E;
import a.AbstractC0603a;
import f6.C1113f;
import g6.AbstractC1158g;
import g6.C1167p;
import i6.InterfaceC1287d;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t6.e;
import t6.h;

/* loaded from: classes.dex */
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
        list.addAll(AbstractC1158g.p0(zzeVarArr));
    }

    public final zzdc zza() {
        zzdc zzdcVar = this.zza;
        if (zzdcVar != null) {
            return zzdcVar;
        }
        return null;
    }

    public final Object zzb(String str, long j, InterfaceC1287d interfaceC1287d) {
        return E.e(new zzh(this, str, j, null), interfaceC1287d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j, zzpq zzpqVar, InterfaceC1287d interfaceC1287d) {
        zzi zziVar;
        int i7;
        if (interfaceC1287d instanceof zzi) {
            zziVar = (zzi) interfaceC1287d;
            int i8 = zziVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zziVar.zza;
                a aVar = a.f14642a;
                i7 = zziVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzk zzkVar = new zzk(this, j, zzpqVar, null);
                    zziVar.zzc = 1;
                    obj = E.e(zzkVar, zziVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                }
                return ((C1113f) obj).f13003a;
            }
        }
        zziVar = new zzi(this, interfaceC1287d);
        Object obj2 = zziVar.zza;
        a aVar2 = a.f14642a;
        i7 = zziVar.zzc;
        if (i7 != 0) {
        }
        return ((C1113f) obj2).f13003a;
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
        C1167p c1167p = C1167p.f13302a;
        this.zzb = new ArrayList();
        zze[] zzeVarArr = (zze[]) c1167p.toArray(new zze[0]);
        zzg((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
