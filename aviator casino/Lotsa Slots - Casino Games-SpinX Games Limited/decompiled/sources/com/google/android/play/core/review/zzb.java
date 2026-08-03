package com.google.android.play.core.review;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
final class zzb implements android.os.Parcelable.Creator {
    zzb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.play.core.review.zza((android.app.PendingIntent) parcel.readParcelable(com.google.android.play.core.review.ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.play.core.review.ReviewInfo[i];
    }
}
