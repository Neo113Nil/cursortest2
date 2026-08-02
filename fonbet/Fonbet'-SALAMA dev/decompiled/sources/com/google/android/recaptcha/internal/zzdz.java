package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzdz extends AbstractC1362i implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzek zzd;
    final /* synthetic */ zzea zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzek zzekVar, zzea zzeaVar, String str, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzd = zzekVar;
        this.zze = zzeaVar;
        this.zzf = str;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzdz(this.zzd, this.zze, this.zzf, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdz) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzge zzgeVar;
        Object zzg;
        Object obj2;
        Object obj3;
        a aVar = a.f14642a;
        int i7 = this.zzc;
        try {
        } catch (Exception e7) {
            zzea zzeaVar = this.zze;
            zzek zzekVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzeaVar.zzh(e7, zzekVar, this);
        }
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.zzd.zza = new zzbt();
            zzro zzi = zzro.zzi(zzhz.zzh().zzj(this.zzf));
            zzi.zzf();
            zzgeVar = this.zze.zzc;
            zzrg zza = zzgeVar.zza(zzi);
            zzgz zzb = zzgz.zzb();
            zzea zzeaVar2 = this.zze;
            List zzi2 = zza.zzi();
            zzek zzekVar2 = this.zzd;
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzeaVar2.zzg(zzi2, zzekVar2, this);
            if (zzg != aVar) {
                obj2 = zzi;
                obj3 = zzb;
            }
            return aVar;
        }
        if (i7 != 1) {
            AbstractC0603a.p0(obj);
            return C1116i.f13008a;
        }
        obj3 = this.zzb;
        obj2 = this.zza;
        AbstractC0603a.p0(obj);
        ((zzgz) obj3).zzf();
        new Long(((zzgz) obj3).zza(TimeUnit.MICROSECONDS));
        ((zzro) obj2).zzf();
        return C1116i.f13008a;
    }
}
