package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfna implements zzinw {
    private zzfna(zzfmz zzfmzVar) {
    }

    public static zzfna zza(zzfmz zzfmzVar) {
        return new zzfna(zzfmzVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzioe.zzb(defaultClock);
        return defaultClock;
    }
}
