package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0766Ia {
    public final int A00;
    public final long A01;

    public C0766Ia(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0766Ia(int i, long j, com.facebook.ads.redexgen.core.IZ iz) {
        this(i, j);
    }

    public static com.facebook.ads.redexgen.core.C0766Ia A00(android.os.Parcel parcel) {
        return new com.facebook.ads.redexgen.core.C0766Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(android.os.Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
