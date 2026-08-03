package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

/* loaded from: assets/audience_network/classes2.dex */
public final class TimeSignalCommand extends com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static java.lang.String[] A02 = {"fBCCr7VwDgvhDxdGkzRiY2TvWvmZmARS", "lBD0fDkRFVdGPYWDbMcaGx4cyXv4WEJh", "6y4HJXgmtxqVkaNMzYZBmSXA6CGxm4DJ", "vpsLDrGqE5zherZQZMMLL6G3cLRsG8Dm", "qp0fDGr3Nzl8ahCuvet6k2311zos", "c5cBfT4Hj52dvZvyRqGaKhWxL68ft04u", "OtVyWYxYdMxR9geYu5t1Sc80NPuk", "8DkmlbSWSEaEI0nee1I51BPAFd"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand> CREATOR = new com.facebook.ads.redexgen.core.C0768Ic();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, com.facebook.ads.redexgen.core.C0768Ic c0768Ic) {
        this(j, j2);
    }

    public static long A00(com.facebook.ads.redexgen.core.C04434v c04434v, long j) {
        long A0I = c04434v.A0I();
        if ((128 & A0I) == 0) {
            return -9223372036854775807L;
        }
        long firstByte = c04434v.A0Q();
        long j2 = (((1 & A0I) << 32) | firstByte) + j;
        if (A02[7].length() == 21) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[5] = "5vtaLYhnTEc2lUg08l0YEv2QqnnKhzp8";
        strArr[0] = "gGhCeZV4kOFdoFbuN1d60dh6MMvStMtQ";
        return j2 & 8589934591L;
    }

    public static com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand A01(com.facebook.ads.redexgen.core.C04434v c04434v, long j, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        long A00 = A00(c04434v, j);
        return new com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand(A00, anonymousClass53.A06(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
