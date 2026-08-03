package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0768Ic implements android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand createFromParcel(android.os.Parcel parcel) {
        return new com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand[] newArray(int i) {
        return new com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand[i];
    }
}
