package com.google.android.recaptcha.internal;

import D6.B;
import D6.C;
import D6.InterfaceC0118e0;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.Arrays;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import t6.q;

/* loaded from: classes.dex */
final class zzdy extends AbstractC1362i implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ zzea zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Exception exc, zzek zzekVar, zzea zzeaVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = exc;
        this.zzb = zzekVar;
        this.zzc = zzeaVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        zzdy zzdyVar = new zzdy(this.zza, this.zzb, this.zzc, interfaceC1287d);
        zzdyVar.zzd = obj;
        return zzdyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzrh zzrhVar;
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        C c3 = (C) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzby) {
            zzrhVar = ((zzby) exc).zza();
            zzrhVar.zzd(this.zzb.zza());
        } else {
            zzek zzekVar = this.zzb;
            zzrh zzf = zzri.zzf();
            zzf.zzd(zzekVar.zza());
            zzf.zzq(2);
            zzf.zzp(2);
            zzrhVar = zzf;
        }
        zzri zzriVar = (zzri) zzrhVar.zzj();
        zzriVar.zzJ();
        zzriVar.zzk();
        q.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzek zzekVar2 = this.zzb;
        zzbt zzb = zzekVar2.zzb();
        zzbt zzbtVar = zzekVar2.zza;
        if (zzbtVar == null) {
            zzbtVar = null;
        }
        zzoy zza = zzdn.zza(zzb, zzbtVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c3.c().get(B.f1775b);
        if (interfaceC0118e0 != null ? interfaceC0118e0.isActive() : true) {
            zzea zzeaVar = this.zzc;
            zzhz zzh = zzhz.zzh();
            byte[] zzd2 = zzriVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzhz zzh2 = zzhz.zzh();
            byte[] zzd3 = zza.zzd();
            zzeaVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return C1116i.f13008a;
    }
}
