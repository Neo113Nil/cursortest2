package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import android.content.ContentValues;
import f6.C1116i;
import g6.AbstractC1159h;
import i6.InterfaceC1287d;
import j6.a;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzdj extends AbstractC1362i implements Function2 {
    final /* synthetic */ zzdk zza;
    final /* synthetic */ zzre zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdk zzdkVar, zzre zzreVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = zzdkVar;
        this.zzb = zzreVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzdj(this.zza, this.zzb, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzda zzdaVar;
        zzda zzdaVar2;
        zzda zzdaVar3;
        zzda zzdaVar4;
        zzda zzdaVar5;
        zzda zzdaVar6;
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        zzre zzreVar = this.zzb;
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            try {
                zzdaVar = zzdkVar.zze;
                if (zzdaVar != null) {
                    byte[] zzd = zzreVar.zzd();
                    zzdb zzdbVar = new zzdb(zzhz.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzdaVar2 = zzdkVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzdbVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzdbVar.zzb()));
                    zzdaVar2.getWritableDatabase().insert("ce", null, contentValues);
                    zzdaVar3 = zzdkVar.zze;
                    int zzb = zzdaVar3.zzb() - 500;
                    if (zzb > 0) {
                        zzdaVar5 = zzdkVar.zze;
                        List W0 = AbstractC1159h.W0(zzb, zzdaVar5.zzd());
                        zzdaVar6 = zzdkVar.zze;
                        zzdaVar6.zza(W0);
                    }
                    zzdaVar4 = zzdkVar.zze;
                    if (zzdaVar4.zzb() >= 20) {
                        zzdkVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C1116i.f13008a;
    }
}
