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
final class zzh extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, interfaceC1287d);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzdf zzdfVar;
        a aVar = a.f14642a;
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            AbstractC0603a.p0(obj);
        } else {
            AbstractC0603a.p0(obj);
            C c3 = (C) this.zze;
            zzl zzlVar = this.zzb;
            String str = this.zzc;
            zzdc zza = zzlVar.zza();
            zza.zzc(str);
            zzdf zzf = zza.zzf(31);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(E.c(c3, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
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
        String str2 = this.zzc;
        zzpv zzf2 = zzpw.zzf();
        zzf2.zzd(str2);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((C1113f) it.next()).f13003a;
            if (!(obj2 instanceof C1112e)) {
                zzf2.zzg((zzpw) obj2);
            }
        }
        zzpw zzpwVar = (zzpw) zzf2.zzj();
        zzdfVar.zza();
        return zzpwVar;
    }
}
