package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p.AbstractC1520g;
import p.AbstractServiceConnectionC1527n;

/* loaded from: classes.dex */
public final class zzhex extends AbstractServiceConnectionC1527n {
    private final WeakReference zza;

    public zzhex(zzbcz zzbczVar) {
        this.zza = new WeakReference(zzbczVar);
    }

    @Override // p.AbstractServiceConnectionC1527n
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC1520g abstractC1520g) {
        zzbcz zzbczVar = (zzbcz) this.zza.get();
        if (zzbczVar != null) {
            zzbczVar.zzc(abstractC1520g);
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
