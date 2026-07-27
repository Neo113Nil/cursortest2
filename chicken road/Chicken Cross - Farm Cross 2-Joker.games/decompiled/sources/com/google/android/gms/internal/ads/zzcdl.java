package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzcdl implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzcdl zza = new zzcdl();

    private /* synthetic */ zzcdl() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof zzcde ? (zzcde) queryLocalInterface : new zzcde(iBinder);
    }
}
