package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import D6.H;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p044f6.e;
import p044f6.f;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends i implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzpq zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, long j, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = j;
        this.zzd = zzpqVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, dVar);
        zzkVar.zze = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        zzdf zzdfVar;
        Object objH;
        a aVar = a.f14648a;
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            p003a.a.p0(obj);
        } else {
            p003a.a.p0(obj);
            C c3 = (C) this.zze;
            zzl zzlVar = this.zzb;
            zzdc zzdcVarZza = zzlVar.zza();
            zzdcVarZza.zzc(zzlVar.zza().zzd());
            zzdf zzdfVarZzf = zzdcVarZza.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(E.c(c3, new zzj((zze) it.next(), this.zzc, this.zzd, null)));
            }
            H[] hArr = (H[]) arrayList.toArray(new H[0]);
            H[] hArr2 = (H[]) Arrays.copyOf(hArr, hArr.length);
            this.zze = zzdfVarZzf;
            this.zza = 1;
            obj = E.d(hArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzdfVar = zzdfVarZzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((f) it2.next()).f13009a instanceof e)) {
                    zzdfVar.zza();
                    objH = p044f6.i.f13014a;
                }
            }
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzY, null);
            zzdfVar.zzb(zzbjVar);
            objH = p003a.a.h(zzbjVar);
        } else {
            zzbj zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zzY, null);
            zzdfVar.zzb(zzbjVar2);
            objH = p003a.a.h(zzbjVar2);
        }
        return new f(objH);
    }
}
