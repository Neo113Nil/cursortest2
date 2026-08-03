package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

/* loaded from: assets/audience_network/classes2.dex */
public final class PrivateCommand extends com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand> CREATOR = new com.facebook.ads.redexgen.core.IV();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public PrivateCommand(android.os.Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = (byte[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(android.os.Parcel parcel, com.facebook.ads.redexgen.core.IV iv) {
        this(parcel);
    }

    public static com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand A00(com.facebook.ads.redexgen.core.C04434v c04434v, int i, long j) {
        long A0Q = c04434v.A0Q();
        byte[] bArr = new byte[i - 4];
        c04434v.A0k(bArr, 0, bArr.length);
        return new com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand(A0Q, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }
}
