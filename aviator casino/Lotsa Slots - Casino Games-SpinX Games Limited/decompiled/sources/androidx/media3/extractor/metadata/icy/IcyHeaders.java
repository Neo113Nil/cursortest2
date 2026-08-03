package androidx.media3.extractor.metadata.icy;

/* loaded from: classes2.dex */
public final class IcyHeaders implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.icy.IcyHeaders> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.icy.IcyHeaders>() { // from class: androidx.media3.extractor.metadata.icy.IcyHeaders.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.icy.IcyHeaders createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.icy.IcyHeaders(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.icy.IcyHeaders[] newArray(int i) {
            return new androidx.media3.extractor.metadata.icy.IcyHeaders[i];
        }
    };
    public static final java.lang.String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final java.lang.String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final java.lang.String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final java.lang.String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final java.lang.String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final java.lang.String RESPONSE_HEADER_NAME = "icy-name";
    private static final java.lang.String RESPONSE_HEADER_PUB = "icy-pub";
    private static final java.lang.String RESPONSE_HEADER_URL = "icy-url";
    private static final java.lang.String TAG = "IcyHeaders";
    public final int bitrate;
    public final java.lang.String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final java.lang.String name;
    public final java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return androidx.media3.common.Metadata.Entry.CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ androidx.media3.common.Format getWrappedMetadataFormat() {
        return androidx.media3.common.Metadata.Entry.CC.$default$getWrappedMetadataFormat(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.media3.extractor.metadata.icy.IcyHeaders parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        boolean z;
        int i;
        java.util.List<java.lang.String> list;
        java.lang.String str;
        java.util.List<java.lang.String> list2;
        java.lang.String str2;
        java.util.List<java.lang.String> list3;
        java.lang.String str3;
        java.util.List<java.lang.String> list4;
        boolean z2;
        java.util.List<java.lang.String> list5;
        int i2;
        int i3;
        java.util.List<java.lang.String> list6 = map.get(RESPONSE_HEADER_BITRATE);
        boolean z3 = true;
        int i4 = -1;
        if (list6 != null) {
            java.lang.String str4 = list6.get(0);
            try {
                i3 = java.lang.Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        androidx.media3.common.util.Log.w(TAG, "Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (java.lang.NumberFormatException unused) {
                        androidx.media3.common.util.Log.w(TAG, "Invalid bitrate header: " + str4);
                        i = i3;
                        z = false;
                        list = map.get(RESPONSE_HEADER_GENRE);
                        if (list == null) {
                        }
                        list2 = map.get(RESPONSE_HEADER_NAME);
                        if (list2 == null) {
                        }
                        list3 = map.get(RESPONSE_HEADER_URL);
                        if (list3 == null) {
                        }
                        list4 = map.get(RESPONSE_HEADER_PUB);
                        if (list4 == null) {
                        }
                        list5 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
                        if (list5 == null) {
                        }
                        if (z) {
                        }
                    }
                }
                i = i3;
            } catch (java.lang.NumberFormatException unused2) {
                i3 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        list = map.get(RESPONSE_HEADER_GENRE);
        if (list == null) {
            str = list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = map.get(RESPONSE_HEADER_NAME);
        if (list2 == null) {
            str2 = list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = map.get(RESPONSE_HEADER_URL);
        if (list3 == null) {
            str3 = list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = map.get(RESPONSE_HEADER_PUB);
        if (list4 == null) {
            z2 = list4.get(0).equals("1");
            z = true;
        } else {
            z2 = false;
        }
        list5 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list5 == null) {
            java.lang.String str5 = list5.get(0);
            try {
                int parseInt = java.lang.Integer.parseInt(str5);
                if (parseInt > 0) {
                    i4 = parseInt;
                } else {
                    try {
                        androidx.media3.common.util.Log.w(TAG, "Invalid metadata interval: " + str5);
                        z3 = z;
                    } catch (java.lang.NumberFormatException unused3) {
                        i4 = parseInt;
                        androidx.media3.common.util.Log.w(TAG, "Invalid metadata interval: " + str5);
                        i2 = i4;
                        if (z) {
                        }
                    }
                }
                z = z3;
            } catch (java.lang.NumberFormatException unused4) {
            }
            i2 = i4;
        } else {
            i2 = -1;
        }
        if (z) {
            return new androidx.media3.extractor.metadata.icy.IcyHeaders(i, str, str2, str3, z2, i2);
        }
        return null;
    }

    public IcyHeaders(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i2 == -1 || i2 > 0);
        this.bitrate = i;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i2;
    }

    IcyHeaders(android.os.Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = androidx.media3.common.util.Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.name;
        if (str != null) {
            builder.setStation(str);
        }
        java.lang.String str2 = this.genre;
        if (str2 != null) {
            builder.setGenre(str2);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.icy.IcyHeaders icyHeaders = (androidx.media3.extractor.metadata.icy.IcyHeaders) obj;
        return this.bitrate == icyHeaders.bitrate && androidx.media3.common.util.Util.areEqual(this.genre, icyHeaders.genre) && androidx.media3.common.util.Util.areEqual(this.name, icyHeaders.name) && androidx.media3.common.util.Util.areEqual(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval;
    }

    public int hashCode() {
        int i = (com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.bitrate) * 31;
        java.lang.String str = this.genre;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.url;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    public java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        androidx.media3.common.util.Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
    }
}
