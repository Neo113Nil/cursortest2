package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzeuv implements zzheg {
    public static zzesk zza(Context context, zzbye zzbyeVar, zzbyf zzbyfVar, Object obj, zzetn zzetnVar, zzeuh zzeuhVar, zzhea zzheaVar, zzhea zzheaVar2, zzhea zzheaVar3, zzhea zzheaVar4, zzhea zzheaVar5, zzhea zzheaVar6, zzhea zzheaVar7, Executor executor, zzffy zzffyVar, zzdqq zzdqqVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeua) obj);
        hashSet.add(zzetnVar);
        hashSet.add(zzeuhVar);
        zzbbp zzbbpVar = zzbby.zzfM;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            hashSet.add((zzesh) zzheaVar.zzb());
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfN)).booleanValue()) {
            hashSet.add((zzesh) zzheaVar2.zzb());
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfP)).booleanValue()) {
            hashSet.add((zzesh) zzheaVar4.zzb());
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfQ)).booleanValue()) {
            hashSet.add((zzesh) zzheaVar5.zzb());
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdi)).booleanValue()) {
            hashSet.add((zzesh) zzheaVar7.zzb());
        }
        return new zzesk(context, executor, hashSet, zzffyVar, zzdqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
