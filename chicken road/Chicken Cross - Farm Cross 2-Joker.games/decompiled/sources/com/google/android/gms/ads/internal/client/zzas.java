package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzas implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzas zza = new zzas();

    private /* synthetic */ zzas() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzcz ? (zzcz) queryLocalInterface : new zzcz(iBinder);
    }
}
