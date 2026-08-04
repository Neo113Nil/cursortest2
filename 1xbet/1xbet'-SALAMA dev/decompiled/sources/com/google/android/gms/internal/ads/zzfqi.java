package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzfqi extends zzaxo implements zzfqj {
    public zzfqi() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
        zzaxp.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
