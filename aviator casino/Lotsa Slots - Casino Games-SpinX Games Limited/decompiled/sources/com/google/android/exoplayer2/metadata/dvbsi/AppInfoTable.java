package com.google.android.exoplayer2.metadata.dvbsi;

/* loaded from: classes3.dex */
public final class AppInfoTable implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable>() { // from class: com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable(parcel.readInt(), (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable[] newArray(int i) {
            return new com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable[i];
        }
    };
    public final int controlCode;
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

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder) {
        com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(this, builder);
    }

    public AppInfoTable(int i, java.lang.String str) {
        this.controlCode = i;
        this.url = str;
    }

    public java.lang.String toString() {
        return "Ait(controlCode=" + this.controlCode + ",url=" + this.url + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.controlCode);
    }
}
