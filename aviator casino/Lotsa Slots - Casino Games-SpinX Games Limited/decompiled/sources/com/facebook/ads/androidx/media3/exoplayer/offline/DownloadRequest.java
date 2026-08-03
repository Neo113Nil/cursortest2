package com.facebook.ads.androidx.media3.exoplayer.offline;

/* loaded from: assets/audience_network/classes2.dex */
public final class DownloadRequest implements android.os.Parcelable {
    public static byte[] A07;
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest> CREATOR;
    public final android.net.Uri A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;
    public final java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> A04;
    public final byte[] A05;
    public final byte[] A06;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-37, 36, 54, 52, 53, 48, 46, 4, 34, 36, 41, 38, com.google.common.base.Ascii.FF, 38, 58, -31, 46, 54, 52, 53, -31, 35, 38, -31, 47, 54, 45, 45, -31, 39, 48, 51, -31, 53, 58, 49, 38, -5, -31};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.C7();
    }

    public DownloadRequest(android.os.Parcel parcel) {
        this.A02 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
        this.A00 = android.net.Uri.parse((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString()));
        this.A03 = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((com.facebook.ads.androidx.media3.common.StreamKey) parcel.readParcelable(com.facebook.ads.androidx.media3.common.StreamKey.class.getClassLoader()));
        }
        this.A04 = java.util.Collections.unmodifiableList(arrayList);
        this.A06 = parcel.createByteArray();
        this.A01 = parcel.readString();
        this.A05 = (byte[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createByteArray());
    }

    public DownloadRequest(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> list, byte[] bArr, java.lang.String str3, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        int A0B = com.facebook.ads.redexgen.core.C5C.A0B(uri, str2);
        if (A0B == 0 || A0B == 2 || A0B == 1) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A09(str3 == null, A00(1, 38, 126) + A0B);
        }
        this.A02 = str;
        this.A00 = uri;
        this.A03 = str2;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList);
        this.A04 = java.util.Collections.unmodifiableList(arrayList);
        if (bArr != null) {
            int contentType = bArr.length;
            bArr3 = java.util.Arrays.copyOf(bArr, contentType);
        } else {
            bArr3 = null;
        }
        this.A06 = bArr3;
        this.A01 = str3;
        if (bArr2 != null) {
            int contentType2 = bArr2.length;
            bArr4 = java.util.Arrays.copyOf(bArr2, contentType2);
        } else {
            bArr4 = com.facebook.ads.redexgen.core.C5C.A07;
        }
        this.A05 = bArr4;
    }

    public /* synthetic */ DownloadRequest(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.util.List list, byte[] bArr, java.lang.String str3, byte[] bArr2, com.facebook.ads.redexgen.core.C7 c7) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x003f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A02(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        java.util.List emptyList;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A02.equals(downloadRequest.A02));
        if (this.A04.isEmpty() || downloadRequest.A04.isEmpty()) {
            emptyList = java.util.Collections.emptyList();
        } else {
            emptyList = new java.util.ArrayList(this.A04);
            for (int i = 0; i < mergedKeys.size(); i++) {
                java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> mergedKeys = downloadRequest.A04;
                com.facebook.ads.androidx.media3.common.StreamKey streamKey = mergedKeys.get(i);
                if (!emptyList.contains(streamKey)) {
                    emptyList.add(streamKey);
                }
            }
        }
        return new com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest(this.A02, downloadRequest.A00, downloadRequest.A03, emptyList, downloadRequest.A06, downloadRequest.A01, downloadRequest.A05);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest)) {
            return false;
        }
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest = (com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest) obj;
        return this.A02.equals(downloadRequest.A02) && this.A00.equals(downloadRequest.A00) && com.facebook.ads.redexgen.core.C5C.A1E(this.A03, downloadRequest.A03) && this.A04.equals(downloadRequest.A04) && java.util.Arrays.equals(this.A06, downloadRequest.A06) && com.facebook.ads.redexgen.core.C5C.A1E(this.A01, downloadRequest.A01) && java.util.Arrays.equals(this.A05, downloadRequest.A05);
    }

    public final int hashCode() {
        int result = this.A02.hashCode() * 31;
        int i = result * 31;
        int result2 = this.A00.hashCode();
        int result3 = (i + result2) * 31;
        int result4 = this.A03 != null ? this.A03.hashCode() : 0;
        int result5 = (result3 + result4) * 31;
        int result6 = this.A04.hashCode();
        return ((((((result5 + result6) * 31) + java.util.Arrays.hashCode(this.A06)) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.A05);
    }

    public final java.lang.String toString() {
        return this.A03 + A00(0, 1, 94) + this.A02;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0023 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04.size());
        for (int i2 = 0; i2 < i; i2++) {
            parcel.writeParcelable(this.A04.get(i2), 0);
        }
        parcel.writeByteArray(this.A06);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A05);
    }
}
