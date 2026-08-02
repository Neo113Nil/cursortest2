package androidx.media3.common;

/* loaded from: classes7.dex */
public final class DrmInitData implements java.util.Comparator<androidx.media3.common.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.common.DrmInitData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.DrmInitData>() { // from class: androidx.media3.common.DrmInitData.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ androidx.media3.common.DrmInitData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.media3.common.DrmInitData[] newArray(int i) {
            return new androidx.media3.common.DrmInitData[i];
        }
    };
    private int Camera2StreamConfigurationMap;
    private final androidx.media3.common.DrmInitData.SchemeData[] getHighSpeedVideoFpsRangesFor;
    public final int schemeDataCount;
    public final java.lang.String schemeType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static androidx.media3.common.DrmInitData createSessionCreationData(androidx.media3.common.DrmInitData drmInitData, androidx.media3.common.DrmInitData drmInitData2) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (androidx.media3.common.DrmInitData.SchemeData schemeData : drmInitData.getHighSpeedVideoFpsRangesFor) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            int size = arrayList.size();
            for (androidx.media3.common.DrmInitData.SchemeData schemeData2 : drmInitData2.getHighSpeedVideoFpsRangesFor) {
                if (schemeData2.hasData()) {
                    java.util.UUID uuid = schemeData2.uuid;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(schemeData2);
                            break;
                        }
                        if (((androidx.media3.common.DrmInitData.SchemeData) arrayList.get(i)).uuid.equals(uuid)) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.DrmInitData(str, arrayList);
    }

    public DrmInitData(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        this(null, false, (androidx.media3.common.DrmInitData.SchemeData[]) list.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    public DrmInitData(java.lang.String str, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        this(str, false, (androidx.media3.common.DrmInitData.SchemeData[]) list.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    public DrmInitData(androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this((java.lang.String) null, schemeDataArr);
    }

    public DrmInitData(java.lang.String str, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(java.lang.String str, boolean z, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this.schemeType = str;
        schemeDataArr = z ? (androidx.media3.common.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.getHighSpeedVideoFpsRangesFor = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
        java.util.Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(android.os.Parcel parcel) {
        this.schemeType = parcel.readString();
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = (androidx.media3.common.DrmInitData.SchemeData[]) androidx.media3.common.util.Util.castNonNull((androidx.media3.common.DrmInitData.SchemeData[]) parcel.createTypedArray(androidx.media3.common.DrmInitData.SchemeData.CREATOR));
        this.getHighSpeedVideoFpsRangesFor = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }

    public final androidx.media3.common.DrmInitData.SchemeData get(int i) {
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    public final androidx.media3.common.DrmInitData copyWithSchemeType(java.lang.String str) {
        return java.util.Objects.equals(this.schemeType, str) ? this : new androidx.media3.common.DrmInitData(str, false, this.getHighSpeedVideoFpsRangesFor);
    }

    public final androidx.media3.common.DrmInitData merge(androidx.media3.common.DrmInitData drmInitData) {
        java.lang.String str;
        java.lang.String str2 = this.schemeType;
        com.google.common.base.Preconditions.checkState(str2 == null || (str = drmInitData.schemeType) == null || android.text.TextUtils.equals(str2, str));
        java.lang.String str3 = this.schemeType;
        if (str3 == null) {
            str3 = drmInitData.schemeType;
        }
        return new androidx.media3.common.DrmInitData(str3, (androidx.media3.common.DrmInitData.SchemeData[]) androidx.media3.common.util.Util.nullSafeArrayConcatenation(this.getHighSpeedVideoFpsRangesFor, drmInitData.getHighSpeedVideoFpsRangesFor));
    }

    public final int hashCode() {
        if (this.Camera2StreamConfigurationMap == 0) {
            java.lang.String str = this.schemeType;
            this.Camera2StreamConfigurationMap = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.DrmInitData drmInitData = (androidx.media3.common.DrmInitData) obj;
        return java.util.Objects.equals(this.schemeType, drmInitData.schemeType) && java.util.Arrays.equals(this.getHighSpeedVideoFpsRangesFor, drmInitData.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.util.Comparator
    public final int compare(androidx.media3.common.DrmInitData.SchemeData schemeData, androidx.media3.common.DrmInitData.SchemeData schemeData2) {
        if (androidx.media3.common.C.UUID_NIL.equals(schemeData.uuid)) {
            return androidx.media3.common.C.UUID_NIL.equals(schemeData2.uuid) ? 0 : 1;
        }
        return schemeData.uuid.compareTo(schemeData2.uuid);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.getHighSpeedVideoFpsRangesFor, 0);
    }

    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.common.DrmInitData.SchemeData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.DrmInitData.SchemeData>() { // from class: androidx.media3.common.DrmInitData.SchemeData.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.media3.common.DrmInitData.SchemeData createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.common.DrmInitData.SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.media3.common.DrmInitData.SchemeData[] newArray(int i) {
                return new androidx.media3.common.DrmInitData.SchemeData[i];
            }
        };
        public final byte[] data;
        private int getHighSpeedVideoSizes;
        public final java.lang.String licenseServerUrl;
        public final java.lang.String mimeType;
        public final java.util.UUID uuid;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            this.uuid = (java.util.UUID) com.google.common.base.Preconditions.checkNotNull(uuid);
            this.licenseServerUrl = str;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str2));
            this.data = bArr;
        }

        SchemeData(android.os.Parcel parcel) {
            this.uuid = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            this.mimeType = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
            this.data = parcel.createByteArray();
        }

        public final boolean matches(java.util.UUID uuid) {
            return androidx.media3.common.C.UUID_NIL.equals(this.uuid) || uuid.equals(this.uuid);
        }

        public final boolean canReplace(androidx.media3.common.DrmInitData.SchemeData schemeData) {
            return hasData() && !schemeData.hasData() && matches(schemeData.uuid);
        }

        public final boolean hasData() {
            return this.data != null;
        }

        public final androidx.media3.common.DrmInitData.SchemeData copyWithData(byte[] bArr) {
            return new androidx.media3.common.DrmInitData.SchemeData(this.uuid, this.licenseServerUrl, this.mimeType, bArr);
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.common.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            androidx.media3.common.DrmInitData.SchemeData schemeData = (androidx.media3.common.DrmInitData.SchemeData) obj;
            return java.util.Objects.equals(this.licenseServerUrl, schemeData.licenseServerUrl) && java.util.Objects.equals(this.mimeType, schemeData.mimeType) && java.util.Objects.equals(this.uuid, schemeData.uuid) && java.util.Arrays.equals(this.data, schemeData.data);
        }

        public final int hashCode() {
            if (this.getHighSpeedVideoSizes == 0) {
                int hashCode = this.uuid.hashCode();
                java.lang.String str = this.licenseServerUrl;
                this.getHighSpeedVideoSizes = (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.mimeType.hashCode()) * 31) + java.util.Arrays.hashCode(this.data);
            }
            return this.getHighSpeedVideoSizes;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }
    }
}
