package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IO implements android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.class.getClassLoader());
        return new com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData[] newArray(int i) {
        return new com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData[i];
    }
}
