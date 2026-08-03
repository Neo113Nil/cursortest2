package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public final class zzd extends com.google.android.play.core.review.internal.zza implements com.google.android.play.core.review.internal.zzf {
    zzd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // com.google.android.play.core.review.internal.zzf
    public final void zzc(java.lang.String str, android.os.Bundle bundle, com.google.android.play.core.review.internal.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.play.core.review.internal.zzc.zzc(zza, bundle);
        com.google.android.play.core.review.internal.zzc.zzd(zza, zzhVar);
        zzb(2, zza);
    }
}
