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
final class zzh extends i implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        zzdf zzdfVar;
        a aVar = a.f14648a;
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            p003a.a.p0(obj);
        } else {
            p003a.a.p0(obj);
            C c3 = (C) this.zze;
            zzl zzlVar = this.zzb;
            String str = this.zzc;
            zzdc zzdcVarZza = zzlVar.zza();
            zzdcVarZza.zzc(str);
            zzdf zzdfVarZzf = zzdcVarZza.zzf(31);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(E.c(c3, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
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
        String str2 = this.zzc;
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str2);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((f) it.next()).f13009a;
            if (!(obj2 instanceof e)) {
                zzpvVarZzf.zzg((zzpw) obj2);
            }
        }
        zzpw zzpwVar = (zzpw) zzpvVarZzf.zzj();
        zzdfVar.zza();
        return zzpwVar;
    }
}
