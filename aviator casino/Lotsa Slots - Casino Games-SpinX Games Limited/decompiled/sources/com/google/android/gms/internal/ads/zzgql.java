package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgql extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzgqm {
    public static com.google.android.gms.internal.ads.zzgqm zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzgqm ? (com.google.android.gms.internal.ads.zzgqm) queryLocalInterface : new com.google.android.gms.internal.ads.zzgqk(iBinder);
    }
}
