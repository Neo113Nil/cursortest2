package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbca implements com.google.android.libraries.places.internal.zzbff {
    @Override // com.google.android.libraries.places.internal.zzbff
    public final /* synthetic */ java.lang.Object zza(com.google.android.libraries.places.internal.zzbco zzbcoVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws com.google.android.libraries.places.internal.zzbed {
        com.google.android.libraries.places.internal.zzbfx zzbfxVar;
        com.google.android.libraries.places.internal.zzbex zzbexVar = (com.google.android.libraries.places.internal.zzbex) zzb(zzbcoVar, zzbdbVar);
        if (zzbexVar == null || zzbexVar.zzbM()) {
            return zzbexVar;
        }
        if (zzbexVar instanceof com.google.android.libraries.places.internal.zzbby) {
            zzbfxVar = new com.google.android.libraries.places.internal.zzbfx((com.google.android.libraries.places.internal.zzbby) zzbexVar);
        } else {
            if (zzbexVar instanceof com.google.android.libraries.places.internal.zzbbz) {
                throw null;
            }
            zzbfxVar = new com.google.android.libraries.places.internal.zzbfx(zzbexVar);
        }
        throw zzbfxVar.zza();
    }
}
