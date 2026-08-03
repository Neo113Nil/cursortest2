package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

/* loaded from: assets/audience_network/classes2.dex */
public final class SpliceScheduleCommand extends com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand> CREATOR = new com.facebook.ads.redexgen.core.IZ();
    public final java.util.List<com.facebook.ads.redexgen.core.C0767Ib> A00;

    public SpliceScheduleCommand(android.os.Parcel parcel) {
        com.facebook.ads.redexgen.core.C0767Ib A00;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = com.facebook.ads.redexgen.core.C0767Ib.A00(parcel);
            arrayList.add(A00);
        }
        this.A00 = java.util.Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(android.os.Parcel parcel, com.facebook.ads.redexgen.core.IZ iz) {
        this(parcel);
    }

    public SpliceScheduleCommand(java.util.List<com.facebook.ads.redexgen.core.C0767Ib> list) {
        this.A00 = java.util.Collections.unmodifiableList(list);
    }

    public static com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand A00(com.facebook.ads.redexgen.core.C04434v c04434v) {
        com.facebook.ads.redexgen.core.C0767Ib A02;
        int A0I = c04434v.A0I();
        java.util.ArrayList arrayList = new java.util.ArrayList(A0I);
        for (int i = 0; i < A0I; i++) {
            A02 = com.facebook.ads.redexgen.core.C0767Ib.A02(c04434v);
            arrayList.add(A02);
        }
        return new com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A00.get(i2).A04(parcel);
        }
    }
}
