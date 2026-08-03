package com.facebook.ads.androidx.media3.common;

/* loaded from: assets/audience_network/classes2.dex */
public final class Metadata implements android.os.Parcelable {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"mhtWLLrhhof2c3oNGAikQ02zY04FWWhb", "D7PA5y5JB7lzm0w5G", "zJXPfo0gMr3Jucw9cJGyuGk1ctIsyJh8", "Rs3TDnOYdqPS5YfXoagNS3YNrnFCycs6", "xjaJofD0dPUcmVvb8BJkqUvajzMbPe01", "BOBSub5c7lfBtbfZCMGuub2gKHyTzLoC", "LM9W6", "jYsNszMUFrPRtUIi9AiskAAH1nkqNQHo"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.Metadata> CREATOR;
    public final long A00;
    public final com.facebook.ads.androidx.media3.common.Metadata.Entry[] A01;

    public interface Entry extends android.os.Parcelable {
        byte[] A9a();

        com.facebook.ads.redexgen.core.C2196qI A9b();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[0].charAt(19) != strArr[4].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[2] = "jJYb5XESnreQmnafz5VJdwPxqQSxn5xg";
            strArr2[7] = "kTpneR3tTrjWo9SwHImypXlm89YhFqkJ";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
            i4++;
        }
    }

    public static void A01() {
        java.lang.String[] strArr = A03;
        if (strArr[6].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[0] = "FHzPVNHLMxLnXBjwMdKkWWwrPs5hsjYz";
        strArr2[4] = "XDjvnqVH9aBEFffbIwnkls2Q80ahFTsl";
        A02 = new byte[]{56, 52, 100, 102, 113, 103, 113, 122, 96, 117, 96, 125, 123, 122, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 125, 121, 113, 65, 103, 41, 92, 87, 77, 75, 80, 92, 74, 4};
    }

    static {
        A01();
        CREATOR = new android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.Metadata>() { // from class: com.facebook.ads.redexgen.X.3D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.androidx.media3.common.Metadata createFromParcel(android.os.Parcel parcel) {
                return new com.facebook.ads.androidx.media3.common.Metadata(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.androidx.media3.common.Metadata[] newArray(int i) {
                return new com.facebook.ads.androidx.media3.common.Metadata[i];
            }
        };
    }

    public Metadata(long j, com.facebook.ads.androidx.media3.common.Metadata.Entry... entryArr) {
        this.A00 = j;
        this.A01 = entryArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Metadata(android.os.Parcel parcel) {
        this.A01 = new com.facebook.ads.androidx.media3.common.Metadata.Entry[parcel.readInt()];
        for (int i = 0; i < i; i++) {
            this.A01[i] = (com.facebook.ads.androidx.media3.common.Metadata.Entry) parcel.readParcelable(com.facebook.ads.androidx.media3.common.Metadata.Entry.class.getClassLoader());
        }
        this.A00 = parcel.readLong();
    }

    public Metadata(java.util.List<? extends com.facebook.ads.androidx.media3.common.Metadata.Entry> entries) {
        this((com.facebook.ads.androidx.media3.common.Metadata.Entry[]) entries.toArray(new com.facebook.ads.androidx.media3.common.Metadata.Entry[0]));
    }

    public Metadata(com.facebook.ads.androidx.media3.common.Metadata.Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final int A02() {
        return this.A01.length;
    }

    public final com.facebook.ads.androidx.media3.common.Metadata.Entry A03(int i) {
        return this.A01[i];
    }

    public final com.facebook.ads.androidx.media3.common.Metadata A04(com.facebook.ads.androidx.media3.common.Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        return A05(metadata.A01);
    }

    public final com.facebook.ads.androidx.media3.common.Metadata A05(com.facebook.ads.androidx.media3.common.Metadata.Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new com.facebook.ads.androidx.media3.common.Metadata(this.A00, (com.facebook.ads.androidx.media3.common.Metadata.Entry[]) com.facebook.ads.redexgen.core.C5C.A1K(this.A01, entryArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.androidx.media3.common.Metadata metadata = (com.facebook.ads.androidx.media3.common.Metadata) obj;
        return java.util.Arrays.equals(this.A01, metadata.A01) && this.A00 == metadata.A00;
    }

    public final int hashCode() {
        int result = java.util.Arrays.hashCode(this.A01);
        int i = result * 31;
        int result2 = com.facebook.ads.redexgen.core.AbstractC2255rd.A00(this.A00);
        return i + result2;
    }

    public final java.lang.String toString() {
        return A00(21, 8, 95) + java.util.Arrays.toString(this.A01) + (this.A00 == -9223372036854775807L ? A00(0, 0, 66) : A00(0, 21, 114) + this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A01.length);
        for (com.facebook.ads.androidx.media3.common.Metadata.Entry entry : this.A01) {
            java.lang.String[] strArr = A03;
            if (strArr[6].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[0] = "Y2eKphX3uEoYAY6qefSk2brdpzOum5mA";
            strArr2[4] = "2ZL0aXTB42gyCwKS7w8k2h86pmsl1x45";
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.A00);
    }
}
