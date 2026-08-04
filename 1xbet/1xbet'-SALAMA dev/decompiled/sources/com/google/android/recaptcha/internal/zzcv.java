package com.google.android.recaptcha.internal;

import D6.C;
import D6.D0;
import D6.E;
import com.google.android.recaptcha.RecaptchaAction;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzcv extends i implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdc zzc;
    final /* synthetic */ zzcx zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzpw zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(long j, zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, d dVar) {
        super(2, dVar);
        this.zzb = j;
        this.zzc = zzdcVar;
        this.zzd = zzcxVar;
        this.zze = recaptchaAction;
        this.zzf = zzpwVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzcv(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        try {
            if (this.zza != 0) {
                p003a.a.p0(obj);
            } else {
                p003a.a.p0(obj);
                long j = this.zzb;
                zzcu zzcuVar = new zzcu(this.zzc, this.zzd, this.zze, this.zzf, null);
                this.zza = 1;
                obj = E.y(j, zzcuVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzqf) obj;
        } catch (D0 unused) {
            throw new zzbj(zzbh.zzc, zzbg.zzb, null);
        } catch (zzbj e7) {
            throw e7;
        } catch (Exception unused2) {
            throw new zzbj(zzbh.zzb, zzbg.zza, null);
        }
    }
}
