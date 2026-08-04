package com.google.android.recaptcha.internal;

import D6.C;
import android.content.ContentValues;
import j6.a;
import kotlin.jvm.functions.Function2;
import p050g6.h;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzdj extends i implements Function2 {
    final /* synthetic */ zzdk zza;
    final /* synthetic */ zzre zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdk zzdkVar, zzre zzreVar, d dVar) {
        super(2, dVar);
        this.zza = zzdkVar;
        this.zzb = zzreVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzdj(this.zza, this.zzb, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        zzre zzreVar = this.zzb;
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            try {
                if (zzdkVar.zze != null) {
                    byte[] bArrZzd = zzreVar.zzd();
                    zzdb zzdbVar = new zzdb(zzhz.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzda zzdaVar = zzdkVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzdbVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzdbVar.zzb()));
                    zzdaVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzdkVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzdkVar.zze.zza(h.W0(iZzb, zzdkVar.zze.zzd()));
                    }
                    if (zzdkVar.zze.zzb() >= 20) {
                        zzdkVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p044f6.i.f13014a;
    }
}
