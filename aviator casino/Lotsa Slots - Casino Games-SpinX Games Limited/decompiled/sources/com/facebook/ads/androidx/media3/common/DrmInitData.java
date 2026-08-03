package com.facebook.ads.androidx.media3.common;

/* loaded from: assets/audience_network/classes2.dex */
public final class DrmInitData implements java.util.Comparator<com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.DrmInitData> CREATOR = new android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.DrmInitData>() { // from class: com.facebook.ads.redexgen.X.2e
        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final com.facebook.ads.androidx.media3.common.DrmInitData createFromParcel(android.os.Parcel parcel) {
            return new com.facebook.ads.androidx.media3.common.DrmInitData(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* renamed from: A01, reason: merged with bridge method [inline-methods] */
        public final com.facebook.ads.androidx.media3.common.DrmInitData[] newArray(int i) {
            return new com.facebook.ads.androidx.media3.common.DrmInitData[i];
        }
    };
    public int A00;
    public final int A01;
    public final java.lang.String A02;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Making the schemeDatas public")
    public final com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[] A03;

    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData> CREATOR = new android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData>() { // from class: com.facebook.ads.redexgen.X.2f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData createFromParcel(android.os.Parcel parcel) {
                return new com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[] newArray(int i) {
                return new com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[i];
            }
        };
        public int A00;
        public final java.lang.String A01;
        public final java.lang.String A02;
        public final java.util.UUID A03;
        public final byte[] A04;

        public SchemeData(android.os.Parcel parcel) {
            this.A03 = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
            this.A04 = parcel.createByteArray();
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            this.A03 = (java.util.UUID) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uuid);
            this.A01 = str;
            this.A02 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(str2);
            this.A04 = bArr;
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData schemeData = (com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData) obj;
            return com.facebook.ads.redexgen.core.C5C.A1E(this.A01, schemeData.A01) && com.facebook.ads.redexgen.core.C5C.A1E(this.A02, schemeData.A02) && com.facebook.ads.redexgen.core.C5C.A1E(this.A03, schemeData.A03) && java.util.Arrays.equals(this.A04, schemeData.A04);
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                int result = this.A03.hashCode();
                int i = result * 31;
                int result2 = this.A01 == null ? 0 : this.A01.hashCode();
                int result3 = (((i + result2) * 31) + this.A02.hashCode()) * 31;
                int result4 = java.util.Arrays.hashCode(this.A04);
                this.A00 = result3 + result4;
            }
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.A03.getMostSignificantBits());
            parcel.writeLong(this.A03.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
        }
    }

    public DrmInitData(android.os.Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[]) com.facebook.ads.redexgen.core.C5C.A0f((com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[]) parcel.createTypedArray(com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData.CREATOR));
        this.A01 = this.A03.length;
    }

    public DrmInitData(java.lang.String str, boolean z, com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
        java.util.Arrays.sort(this.A03, this);
    }

    public DrmInitData(java.lang.String str, com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(java.util.List<com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData> schemeDatas) {
        this(null, false, (com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[]) schemeDatas.toArray(new com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    public DrmInitData(com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData schemeData, com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData schemeData2) {
        if (com.facebook.ads.redexgen.core.C2Y.A03.equals(schemeData.A03)) {
            return com.facebook.ads.redexgen.core.C2Y.A03.equals(schemeData2.A03) ? 0 : 1;
        }
        return schemeData.A03.compareTo(schemeData2.A03);
    }

    public final com.facebook.ads.androidx.media3.common.DrmInitData A01(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A1E(this.A02, str)) {
            return this;
        }
        return new com.facebook.ads.androidx.media3.common.DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.androidx.media3.common.DrmInitData drmInitData = (com.facebook.ads.androidx.media3.common.DrmInitData) obj;
        if (com.facebook.ads.redexgen.core.C5C.A1E(this.A02, drmInitData.A02) && java.util.Arrays.equals(this.A03, drmInitData.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02 == null ? 0 : this.A02.hashCode();
            int i = result * 31;
            int result2 = java.util.Arrays.hashCode(this.A03);
            this.A00 = i + result2;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
