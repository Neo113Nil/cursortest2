package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public abstract class zze extends com.google.android.play.core.review.internal.zzb implements com.google.android.play.core.review.internal.zzf {
    public static com.google.android.play.core.review.internal.zzf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof com.google.android.play.core.review.internal.zzf ? (com.google.android.play.core.review.internal.zzf) queryLocalInterface : new com.google.android.play.core.review.internal.zzd(iBinder);
    }
}
