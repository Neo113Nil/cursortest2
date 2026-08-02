package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class FaceTecSessionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facetec.sdk.FaceTecSessionResult> CREATOR = new android.os.Parcelable.Creator<com.facetec.sdk.FaceTecSessionResult>() { // from class: com.facetec.sdk.FaceTecSessionResult.2
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.facetec.sdk.FaceTecSessionResult[] newArray(int i) {
            return new com.facetec.sdk.FaceTecSessionResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.facetec.sdk.FaceTecSessionResult createFromParcel(android.os.Parcel parcel) {
            return new com.facetec.sdk.FaceTecSessionResult(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f3370a;
    private final com.facetec.sdk.FaceTecSessionStatus b;
    private java.lang.String c;
    private final byte[] d;
    private final byte[][] e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        com.facetec.sdk.ch.d(this.e, parcel);
        com.facetec.sdk.ch.d(this.f3370a, parcel);
        com.facetec.sdk.ch.d(this.d, parcel);
    }

    protected FaceTecSessionResult(android.os.Parcel parcel) {
        this.b = com.facetec.sdk.FaceTecSessionStatus.valueOf(parcel.readString());
        this.c = parcel.readString();
        this.e = (byte[][]) com.facetec.sdk.ch.e(parcel);
        this.f3370a = (byte[][]) com.facetec.sdk.ch.e(parcel);
        this.d = (byte[]) com.facetec.sdk.ch.e(parcel);
    }

    FaceTecSessionResult(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus, byte[][] bArr, byte[][] bArr2, byte[] bArr3) {
        this.b = faceTecSessionStatus;
        this.e = bArr;
        this.f3370a = bArr2;
        this.d = bArr3;
    }

    public final byte[] getFaceScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.d;
        return bArr2 != null ? bArr2 : bArr;
    }

    public final java.lang.String getFaceScanBase64() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return android.util.Base64.encodeToString(bArr, 2);
    }

    public final java.lang.String[] getLowQualityAuditTrailCompressedBase64() {
        byte[][] bArr = this.f3370a;
        int i = 0;
        if (bArr != null) {
            java.lang.String[] strArr = new java.lang.String[bArr.length];
            while (true) {
                byte[][] bArr2 = this.f3370a;
                if (i >= bArr2.length) {
                    return strArr;
                }
                strArr[i] = android.util.Base64.encodeToString(bArr2[i], 2);
                i++;
            }
        } else {
            return new java.lang.String[0];
        }
    }

    public final java.lang.String[] getAuditTrailCompressedBase64() {
        byte[][] bArr = this.e;
        int i = 0;
        if (bArr != null) {
            java.lang.String[] strArr = new java.lang.String[bArr.length];
            while (true) {
                byte[][] bArr2 = this.e;
                if (i >= bArr2.length) {
                    return strArr;
                }
                strArr[i] = android.util.Base64.encodeToString(bArr2[i], 2);
                i++;
            }
        } else {
            return new java.lang.String[0];
        }
    }

    public final com.facetec.sdk.FaceTecSessionStatus getStatus() {
        return this.b;
    }

    public final java.lang.String getSessionId() {
        return this.c;
    }

    final void e(java.lang.String str) {
        this.c = str;
    }
}
