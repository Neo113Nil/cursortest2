package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import D6.InterfaceC0118e0;
import a.AbstractC0603a;
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
final class zzu extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzx zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(String str, zzx zzxVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = str;
        this.zzc = zzxVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        zzu zzuVar = new zzu(this.zzb, this.zzc, interfaceC1287d);
        zzuVar.zzd = obj;
        return zzuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzpw zzt;
        List list;
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 == 0) {
            C c3 = (C) this.zzd;
            String str = this.zzb;
            zzqm zzf = zzqn.zzf();
            zzf.zze(str);
            zzx zzxVar = this.zzc;
            zzxVar.zzr().put(this.zzb, zzf);
            ArrayList arrayList = new ArrayList();
            list = this.zzc.zzb;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzaa) obj2).zzf()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(E.p(c3, new zzt(this.zzc, this.zzb, (zzaa) it.next(), zzf, null)));
            }
            InterfaceC0118e0[] interfaceC0118e0Arr = (InterfaceC0118e0[]) arrayList.toArray(new InterfaceC0118e0[0]);
            InterfaceC0118e0[] interfaceC0118e0Arr2 = (InterfaceC0118e0[]) Arrays.copyOf(interfaceC0118e0Arr, interfaceC0118e0Arr.length);
            this.zza = 1;
            if (E.o(interfaceC0118e0Arr2, this) == aVar) {
                return aVar;
            }
        }
        zzt = this.zzc.zzt(this.zzb);
        return new C1113f(zzt);
    }
}
