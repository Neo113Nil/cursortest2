package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import D6.H;
import a.AbstractC0603a;
import f6.C1112e;
import f6.C1113f;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzk extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzpq zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, long j, zzpq zzpqVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzlVar;
        this.zzc = j;
        this.zzd = zzpqVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, interfaceC1287d);
        zzkVar.zze = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzdf zzdfVar;
        Object obj2;
        a aVar = a.f14642a;
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            AbstractC0603a.p0(obj);
        } else {
            AbstractC0603a.p0(obj);
            C c3 = (C) this.zze;
            zzl zzlVar = this.zzb;
            zzdc zza = zzlVar.zza();
            zza.zzc(zzlVar.zza().zzd());
            zzdf zzf = zza.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(E.c(c3, new zzj((zze) it.next(), this.zzc, this.zzd, null)));
            }
            H[] hArr = (H[]) arrayList.toArray(new H[0]);
            H[] hArr2 = (H[]) Arrays.copyOf(hArr, hArr.length);
            this.zze = zzf;
            this.zza = 1;
            obj = E.d(hArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzdfVar = zzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((C1113f) it2.next()).f13003a instanceof C1112e)) {
                    zzdfVar.zza();
                    obj2 = C1116i.f13008a;
                    break;
                }
            }
        }
        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzY, null);
        zzdfVar.zzb(zzbjVar);
        obj2 = AbstractC0603a.h(zzbjVar);
        return new C1113f(obj2);
    }
}
