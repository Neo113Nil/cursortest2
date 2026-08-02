package com.google.android.recaptcha.internal;

import D6.C;
import D6.D0;
import D6.E;
import a.AbstractC0603a;
import com.google.android.recaptcha.RecaptchaAction;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzcv extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdc zzc;
    final /* synthetic */ zzcx zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzpw zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(long j, zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = j;
        this.zzc = zzdcVar;
        this.zzd = zzcxVar;
        this.zze = recaptchaAction;
        this.zzf = zzpwVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzcv(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        try {
            if (this.zza != 0) {
                AbstractC0603a.p0(obj);
            } else {
                AbstractC0603a.p0(obj);
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
