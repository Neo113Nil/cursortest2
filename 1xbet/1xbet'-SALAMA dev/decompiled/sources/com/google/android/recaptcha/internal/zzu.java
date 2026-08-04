package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import D6.InterfaceC0118e0;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p044f6.f;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends i implements Function2 {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzx zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(String str, zzx zzxVar, d dVar) {
        super(2, dVar);
        this.zzb = str;
        this.zzc = zzxVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        zzu zzuVar = new zzu(this.zzb, this.zzc, dVar);
        zzuVar.zzd = obj;
        return zzuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 == 0) {
            C c3 = (C) this.zzd;
            String str = this.zzb;
            zzqm zzqmVarZzf = zzqn.zzf();
            zzqmVarZzf.zze(str);
            zzx zzxVar = this.zzc;
            zzxVar.zzr().put(this.zzb, zzqmVarZzf);
            ArrayList arrayList = new ArrayList();
            List list = this.zzc.zzb;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzaa) obj2).zzf()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(E.p(c3, new zzt(this.zzc, this.zzb, (zzaa) it.next(), zzqmVarZzf, null)));
            }
            InterfaceC0118e0[] interfaceC0118e0Arr = (InterfaceC0118e0[]) arrayList.toArray(new InterfaceC0118e0[0]);
            InterfaceC0118e0[] interfaceC0118e0Arr2 = (InterfaceC0118e0[]) Arrays.copyOf(interfaceC0118e0Arr, interfaceC0118e0Arr.length);
            this.zza = 1;
            if (E.o(interfaceC0118e0Arr2, this) == aVar) {
                return aVar;
            }
        }
        return new f(this.zzc.zzt(this.zzb));
    }
}
