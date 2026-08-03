package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class IX {
    public final int A00;
    public final long A01;
    public final long A02;

    public IX(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ IX(int i, long j, long j2, com.facebook.ads.redexgen.core.IW iw) {
        this(i, j, j2);
    }

    public static com.facebook.ads.redexgen.core.IX A00(android.os.Parcel parcel) {
        return new com.facebook.ads.redexgen.core.IX(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(android.os.Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
