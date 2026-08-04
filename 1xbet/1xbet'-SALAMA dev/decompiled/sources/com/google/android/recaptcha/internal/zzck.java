package com.google.android.recaptcha.internal;

import D6.C;
import D6.D0;
import D6.E;
import android.app.Application;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzck extends i implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzdc zze;
    final /* synthetic */ zzbl zzf;
    final /* synthetic */ zzdq zzg;
    final /* synthetic */ zzbv zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzck(long j, Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, d dVar) {
        super(2, dVar);
        this.zzb = j;
        this.zzc = application;
        this.zzd = str;
        this.zze = zzdcVar;
        this.zzf = zzblVar;
        this.zzg = zzdqVar;
        this.zzh = zzbvVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzck(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzbj zzbjVar;
        a aVar = a.f14648a;
        try {
            if (this.zza != 0) {
                p003a.a.p0(obj);
            } else {
                p003a.a.p0(obj);
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
