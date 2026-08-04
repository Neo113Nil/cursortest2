package com.google.android.recaptcha.internal;

import D6.B;
import D6.C;
import D6.InterfaceC0118e0;
import j6.a;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p050g6.h;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzdx extends i implements Function2 {
    int zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzea zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzek zzekVar, List list, zzea zzeaVar, d dVar) {
        super(2, dVar);
        this.zzb = zzekVar;
        this.zzc = list;
        this.zzd = zzeaVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        zzdx zzdxVar = new zzdx(this.zzb, this.zzc, this.zzd, dVar);
        zzdxVar.zze = obj;
        return zzdxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p044f6.i iVar = p044f6.i.f13014a;
        p003a.a.p0(obj);
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
                        h.T0(zzrsVar.zzj(), null, null, null, new zzdw(this.zzd), 31);
                        zzea zzeaVar = this.zzd;
                        zzek zzekVar2 = this.zzb;
                        this.zza = 1;
                        if (zzeaVar.zzh(e7, zzekVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return iVar;
    }
}
