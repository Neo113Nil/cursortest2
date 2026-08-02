package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public class zzbdm extends com.google.android.libraries.places.internal.zzbdk implements com.google.android.libraries.places.internal.zzbey {
    protected zzbdm(com.google.android.libraries.places.internal.zzbdn zzbdnVar) {
        super(zzbdnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbdk, com.google.android.libraries.places.internal.zzbew
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzbdn zzF() {
        if (!((com.google.android.libraries.places.internal.zzbdn) this.zza).zzbp()) {
            return (com.google.android.libraries.places.internal.zzbdn) this.zza;
        }
        ((com.google.android.libraries.places.internal.zzbdn) this.zza).zzb.zzb();
        return (com.google.android.libraries.places.internal.zzbdn) super.zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzbdk
    protected final void zzz() {
        super.zzz();
        if (((com.google.android.libraries.places.internal.zzbdn) this.zza).zzb != com.google.android.libraries.places.internal.zzbdg.zza()) {
            com.google.android.libraries.places.internal.zzbdn zzbdnVar = (com.google.android.libraries.places.internal.zzbdn) this.zza;
            zzbdnVar.zzb = zzbdnVar.zzb.clone();
        }
    }
}
