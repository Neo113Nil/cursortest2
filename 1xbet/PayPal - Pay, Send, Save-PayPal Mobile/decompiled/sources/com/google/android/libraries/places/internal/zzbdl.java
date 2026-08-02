package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdl extends com.google.android.libraries.places.internal.zzbca {
    private final com.google.android.libraries.places.internal.zzbdq zza;

    @Override // com.google.android.libraries.places.internal.zzbff
    public final /* synthetic */ java.lang.Object zzb(com.google.android.libraries.places.internal.zzbco zzbcoVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws com.google.android.libraries.places.internal.zzbed {
        com.google.android.libraries.places.internal.zzbdq zzbs = this.zza.zzbs();
        try {
            com.google.android.libraries.places.internal.zzbfl zzb = com.google.android.libraries.places.internal.zzbfh.zza().zzb(zzbs.getClass());
            zzb.zzg(zzbs, com.google.android.libraries.places.internal.zzbcp.zza(zzbcoVar), zzbdbVar);
            zzb.zzh(zzbs);
            return zzbs;
        } catch (com.google.android.libraries.places.internal.zzbed e) {
            if (e.zzb()) {
                throw new com.google.android.libraries.places.internal.zzbed(e);
            }
            throw e;
        } catch (com.google.android.libraries.places.internal.zzbfx e2) {
            throw e2.zza();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.libraries.places.internal.zzbed) {
                throw ((com.google.android.libraries.places.internal.zzbed) e3.getCause());
            }
            throw new com.google.android.libraries.places.internal.zzbed(e3);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof com.google.android.libraries.places.internal.zzbed) {
                throw ((com.google.android.libraries.places.internal.zzbed) e4.getCause());
            }
            throw e4;
        }
    }

    public zzbdl(com.google.android.libraries.places.internal.zzbdq zzbdqVar) {
        this.zza = zzbdqVar;
    }
}
