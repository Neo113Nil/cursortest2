package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p109p.g;
import p109p.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzhex extends n {
    private final WeakReference zza;

    public zzhex(zzbcz zzbczVar) {
        this.zza = new WeakReference(zzbczVar);
    }

    @Override // p109p.n
    public final void onCustomTabsServiceConnected(ComponentName componentName, g gVar) {
        zzbcz zzbczVar = (zzbcz) this.zza.get();
        if (zzbczVar != null) {
            zzbczVar.zzc(gVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbcz zzbczVar = (zzbcz) this.zza.get();
        if (zzbczVar != null) {
            zzbczVar.zzd();
        }
    }
}
