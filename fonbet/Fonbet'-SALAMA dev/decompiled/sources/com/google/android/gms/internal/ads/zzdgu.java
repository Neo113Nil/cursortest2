package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdgu implements zzaxx {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgx zzb;

    public zzdgu(zzdgx zzdgxVar, String str) {
        this.zza = str;
        this.zzb = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        zzdja zzdjaVar;
        Map map;
        zzdja zzdjaVar2;
        zzdja zzdjaVar3;
        zzdja zzdjaVar4;
        zzdja zzdjaVar5;
        zzdja zzdjaVar6;
        Map map2;
        zzdja zzdjaVar7;
        zzdja zzdjaVar8;
        zzdja zzdjaVar9;
        zzdja zzdjaVar10;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbU)).booleanValue()) {
            if (zzaxwVar.zzj) {
                zzdgx zzdgxVar = this.zzb;
                zzdjaVar = zzdgxVar.zzo;
                if (zzdjaVar != null) {
                    map = zzdgxVar.zzy;
                    map.put(this.zza, Boolean.TRUE);
                    zzdgx zzdgxVar2 = this.zzb;
                    zzdjaVar2 = zzdgxVar2.zzo;
                    if (zzdjaVar2 == null) {
                        return;
                    }
                    zzdjaVar3 = zzdgxVar2.zzo;
                    View zzf = zzdjaVar3.zzf();
                    zzdjaVar4 = this.zzb.zzo;
                    Map zzl = zzdjaVar4.zzl();
                    zzdjaVar5 = this.zzb.zzo;
                    zzdgxVar2.zzB(zzf, zzl, zzdjaVar5.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzaxwVar.zzj) {
                    zzdgx zzdgxVar3 = this.zzb;
                    zzdjaVar6 = zzdgxVar3.zzo;
                    if (zzdjaVar6 != null) {
                        map2 = zzdgxVar3.zzy;
                        map2.put(this.zza, Boolean.TRUE);
                        zzdgx zzdgxVar4 = this.zzb;
                        zzdjaVar7 = zzdgxVar4.zzo;
                        if (zzdjaVar7 == null) {
                            return;
                        }
                        zzdjaVar8 = zzdgxVar4.zzo;
                        View zzf2 = zzdjaVar8.zzf();
                        zzdjaVar9 = this.zzb.zzo;
                        Map zzl2 = zzdjaVar9.zzl();
                        zzdjaVar10 = this.zzb.zzo;
                        zzdgxVar4.zzB(zzf2, zzl2, zzdjaVar10.zzm(), true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
