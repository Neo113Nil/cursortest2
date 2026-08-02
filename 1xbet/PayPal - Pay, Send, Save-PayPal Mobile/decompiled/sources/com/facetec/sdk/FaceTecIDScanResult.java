package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class FaceTecIDScanResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facetec.sdk.FaceTecIDScanResult> CREATOR = new android.os.Parcelable.Creator<com.facetec.sdk.FaceTecIDScanResult>() { // from class: com.facetec.sdk.FaceTecIDScanResult.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.facetec.sdk.FaceTecIDScanResult[] newArray(int i) {
            return new com.facetec.sdk.FaceTecIDScanResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.facetec.sdk.FaceTecIDScanResult createFromParcel(android.os.Parcel parcel) {
            return new com.facetec.sdk.FaceTecIDScanResult(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    byte[] f3364a;
    java.lang.String b;
    private final com.facetec.sdk.FaceTecIDScanStatus c;
    java.util.ArrayList<java.lang.String> d;
    java.util.ArrayList<java.lang.String> e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeSerializable(this.c);
        com.facetec.sdk.ch.d(this.d, parcel);
        com.facetec.sdk.ch.d(this.e, parcel);
        com.facetec.sdk.ch.d(this.f3364a, parcel);
        com.facetec.sdk.ch.d(this.b, parcel);
    }

    protected FaceTecIDScanResult(android.os.Parcel parcel) {
        this.d = new java.util.ArrayList<>();
        this.e = new java.util.ArrayList<>();
        this.c = (com.facetec.sdk.FaceTecIDScanStatus) parcel.readSerializable();
        this.d = (java.util.ArrayList) com.facetec.sdk.ch.e(parcel);
        this.e = (java.util.ArrayList) com.facetec.sdk.ch.e(parcel);
        this.f3364a = (byte[]) com.facetec.sdk.ch.e(parcel);
        this.b = (java.lang.String) com.facetec.sdk.ch.e(parcel);
    }

    FaceTecIDScanResult(com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus) {
        this.d = new java.util.ArrayList<>();
        this.e = new java.util.ArrayList<>();
        this.c = faceTecIDScanStatus;
    }

    public final com.facetec.sdk.FaceTecIDScanStatus getStatus() {
        return this.c;
    }

    public final java.util.ArrayList<java.lang.String> getFrontImagesCompressedBase64() {
        return this.d;
    }

    public final java.util.ArrayList<java.lang.String> getBackImagesCompressedBase64() {
        return this.e;
    }

    public final byte[] getIDScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f3364a;
        return bArr2 != null ? bArr2 : bArr;
    }

    public final java.lang.String getIDScanBase64() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f3364a;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return android.util.Base64.encodeToString(bArr, 2);
    }

    public final java.lang.String getSessionId() {
        return this.b;
    }
}
