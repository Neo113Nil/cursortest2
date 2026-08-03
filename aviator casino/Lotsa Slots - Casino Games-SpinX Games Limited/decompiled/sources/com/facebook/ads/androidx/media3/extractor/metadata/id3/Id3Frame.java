package com.facebook.ads.androidx.media3.extractor.metadata.id3;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Id3Frame implements com.facebook.ads.androidx.media3.common.Metadata.Entry {
    public final java.lang.String A00;

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return com.facebook.ads.redexgen.core.C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2196qI A9b() {
        return com.facebook.ads.redexgen.core.C3E.A00(this);
    }

    public Id3Frame(java.lang.String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.A00;
    }
}
