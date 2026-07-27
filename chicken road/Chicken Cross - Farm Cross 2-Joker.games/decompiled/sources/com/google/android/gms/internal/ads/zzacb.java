package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzacb implements zzdu {
    static final /* synthetic */ zzacb zza = new zzacb();

    private /* synthetic */ zzacb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
