package com.google.android.recaptcha.internal;

import D6.B;
import D6.C;
import D6.InterfaceC0118e0;
import a.AbstractC0603a;
import f6.C1116i;
import g6.AbstractC1159h;
import i6.InterfaceC1287d;
import j6.a;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzdx extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzea zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzek zzekVar, List list, zzea zzeaVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzekVar;
        this.zzc = list;
        this.zzd = zzeaVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        zzdx zzdxVar = new zzdx(this.zzb, this.zzc, this.zzd, interfaceC1287d);
        zzdxVar.zze = obj;
        return zzdxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.f14642a;
        int i7 = this.zza;
        C1116i c1116i = C1116i.f13008a;
        AbstractC0603a.p0(obj);
        if (i7 == 0) {
            C c3 = (C) this.zze;
            while (true) {
                zzek zzekVar = this.zzb;
                if (zzekVar.zza() < 0) {
                    break;
                }
                if (zzekVar.zza() < this.zzc.size()) {
                    InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c3.c().get(B.f1775b);
                    if (!(interfaceC0118e0 != null ? interfaceC0118e0.isActive() : true)) {
                        break;
                    }
                    zzrs zzrsVar = (zzrs) this.zzc.get(this.zzb.zza());
                    try {
                        zzea.zzf(this.zzd, zzrsVar, this.zzb);
                    } catch (Exception e7) {
                        zzrsVar.zzk();
                        new Integer(zzrsVar.zzg());
                        AbstractC1159h.T0(zzrsVar.zzj(), null, null, null, new zzdw(this.zzd), 31);
                        zzea zzeaVar = this.zzd;
                        zzek zzekVar2 = this.zzb;
                        this.zza = 1;
                        zzh = zzeaVar.zzh(e7, zzekVar2, this);
                        if (zzh == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return c1116i;
    }
}
