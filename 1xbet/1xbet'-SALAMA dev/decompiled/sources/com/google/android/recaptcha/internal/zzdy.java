package com.google.android.recaptcha.internal;

import D6.B;
import D6.C;
import D6.InterfaceC0118e0;
import j6.a;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.q;

/* JADX INFO: loaded from: classes.dex */
final class zzdy extends i implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ zzea zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Exception exc, zzek zzekVar, zzea zzeaVar, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzekVar;
        this.zzc = zzeaVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        zzdy zzdyVar = new zzdy(this.zza, this.zzb, this.zzc, dVar);
        zzdyVar.zzd = obj;
        return zzdyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        zzrh zzrhVarZza;
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        C c3 = (C) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzby) {
            zzrhVarZza = ((zzby) exc).zza();
            zzrhVarZza.zzd(this.zzb.zza());
        } else {
            zzek zzekVar = this.zzb;
            zzrh zzrhVarZzf = zzri.zzf();
            zzrhVarZzf.zzd(zzekVar.zza());
            zzrhVarZzf.zzq(2);
            zzrhVarZzf.zzp(2);
            zzrhVarZza = zzrhVarZzf;
        }
        zzri zzriVar = (zzri) zzrhVarZza.zzj();
        zzriVar.zzJ();
        zzriVar.zzk();
        q.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzek zzekVar2 = this.zzb;
        zzbt zzbtVarZzb = zzekVar2.zzb();
        zzbt zzbtVar = zzekVar2.zza;
        if (zzbtVar == null) {
            zzbtVar = null;
        }
        zzoy zzoyVarZza = zzdn.zza(zzbtVarZzb, zzbtVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c3.c().get(B.f1775b);
        if (interfaceC0118e0 != null ? interfaceC0118e0.isActive() : true) {
            zzea zzeaVar = this.zzc;
            zzhz zzhzVarZzh = zzhz.zzh();
            byte[] bArrZzd = zzriVar.zzd();
            String strZzi = zzhzVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzhz zzhzVarZzh2 = zzhz.zzh();
            byte[] bArrZzd2 = zzoyVarZza.zzd();
            zzeaVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzhzVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return p044f6.i.f13014a;
    }
}
