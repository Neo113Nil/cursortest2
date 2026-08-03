package com.google.android.exoplayer2.metadata.icy;

/* loaded from: classes3.dex */
public final class IcyInfo implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.icy.IcyInfo> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.icy.IcyInfo>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.icy.IcyInfo createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.exoplayer2.metadata.icy.IcyInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.icy.IcyInfo[] newArray(int i) {
            return new com.google.android.exoplayer2.metadata.icy.IcyInfo[i];
        }
    };
    public final byte[] rawMetadata;
    public final java.lang.String title;
    public final java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
        return com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataFormat(this);
    }

    public IcyInfo(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    IcyInfo(android.os.Parcel parcel) {
        this.rawMetadata = (byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(parcel.createByteArray());
        this.title = parcel.readString();
        this.url = parcel.readString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder) {
        java.lang.String str = this.title;
        if (str != null) {
            builder.setTitle(str);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.rawMetadata, ((com.google.android.exoplayer2.metadata.icy.IcyInfo) obj).rawMetadata);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.rawMetadata);
    }

    public java.lang.String toString() {
        return java.lang.String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.title, this.url, java.lang.Integer.valueOf(this.rawMetadata.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByteArray(this.rawMetadata);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }
}
