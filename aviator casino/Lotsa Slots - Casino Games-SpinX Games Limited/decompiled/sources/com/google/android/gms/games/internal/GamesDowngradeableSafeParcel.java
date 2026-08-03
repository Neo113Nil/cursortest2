package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public abstract class GamesDowngradeableSafeParcel extends com.google.android.gms.common.internal.DowngradeableSafeParcel {
    protected static boolean zzp(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        return com.google.android.gms.common.util.GmsVersion.isAtLeastFenacho(num.intValue());
    }

    @Override // com.google.android.gms.common.internal.DowngradeableSafeParcel
    public final boolean prepareForClientVersion(int i) {
        setShouldDowngrade(!zzp(java.lang.Integer.valueOf(i)));
        return true;
    }
}
