package com.google.android.recaptcha.internal;

import D6.C;
import D6.D0;
import D6.E;
import a.AbstractC0603a;
import android.app.Application;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzck extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzdc zze;
    final /* synthetic */ zzbl zzf;
    final /* synthetic */ zzdq zzg;
    final /* synthetic */ zzbv zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzck(long j, Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = j;
        this.zzc = application;
        this.zzd = str;
        this.zze = zzdcVar;
        this.zzf = zzblVar;
        this.zzg = zzdqVar;
        this.zzh = zzbvVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzck(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzbj zzbjVar;
        a aVar = a.f14642a;
        try {
            if (this.zza != 0) {
                AbstractC0603a.p0(obj);
            } else {
                AbstractC0603a.p0(obj);
                long j = this.zzb;
                zzcj zzcjVar = new zzcj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null);
                this.zza = 1;
                obj = E.y(j, zzcjVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzpq) obj;
        } catch (Exception e7) {
            zzco zzcoVar = zzco.zza;
            if (e7 instanceof D0) {
                zzbjVar = new zzbj(zzbh.zzc, zzbg.zzb, e7.getMessage());
            } else {
                if (e7 instanceof zzbj) {
                    throw ((zzbj) e7);
                }
                zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e7.getMessage());
            }
            throw zzbjVar;
        }
    }
}
