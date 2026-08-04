package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzdz extends i implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzek zzd;
    final /* synthetic */ zzea zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzek zzekVar, zzea zzeaVar, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzekVar;
        this.zze = zzeaVar;
        this.zzf = str;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzdz(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdz) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r1.zzh(r7, r2, r6) == r0) goto L19;
     */
    @Override // p077k6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        a aVar = a.f14648a;
        int i7 = this.zzc;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    p003a.a.p0(obj);
                } else {
                    obj3 = this.zzb;
                    obj2 = this.zza;
                    p003a.a.p0(obj);
                }
                return p044f6.i.f13014a;
            }
            p003a.a.p0(obj);
            this.zzd.zza = new zzbt();
            zzro zzroVarZzi = zzro.zzi(zzhz.zzh().zzj(this.zzf));
            zzroVarZzi.zzf();
            zzrg zzrgVarZza = this.zze.zzc.zza(zzroVarZzi);
            zzgz zzgzVarZzb = zzgz.zzb();
            zzea zzeaVar = this.zze;
            List listZzi = zzrgVarZza.zzi();
            zzek zzekVar = this.zzd;
            this.zza = zzroVarZzi;
            this.zzb = zzgzVarZzb;
            this.zzc = 1;
            if (zzeaVar.zzg(listZzi, zzekVar, this) != aVar) {
                obj2 = zzroVarZzi;
                obj3 = zzgzVarZzb;
            }
            return aVar;
            ((zzgz) obj3).zzf();
            new Long(((zzgz) obj3).zza(TimeUnit.MICROSECONDS));
            ((zzro) obj2).zzf();
        } catch (Exception e7) {
            zzea zzeaVar2 = this.zze;
            zzek zzekVar2 = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
        }
        return p044f6.i.f13014a;
    }
}
