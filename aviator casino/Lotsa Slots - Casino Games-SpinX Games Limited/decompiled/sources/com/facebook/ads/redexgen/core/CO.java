package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class CO implements android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements createFromParcel(android.os.Parcel parcel) {
        return new com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements(parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements[] newArray(int i) {
        return new com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements[i];
    }
}
