package com.google.android.exoplayer2.metadata.emsg;

/* loaded from: classes3.dex */
public final class EventMessage implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final java.lang.String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final java.lang.String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    public static final java.lang.String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;
    private static final com.google.android.exoplayer2.Format ID3_FORMAT = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType("application/id3").build();
    private static final com.google.android.exoplayer2.Format SCTE35_FORMAT = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType("application/x-scte35").build();
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.emsg.EventMessage> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.emsg.EventMessage>() { // from class: com.google.android.exoplayer2.metadata.emsg.EventMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.emsg.EventMessage createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.exoplayer2.metadata.emsg.EventMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.emsg.EventMessage[] newArray(int i) {
            return new com.google.android.exoplayer2.metadata.emsg.EventMessage[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder) {
        com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(this, builder);
    }

    public EventMessage(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.id = j2;
        this.messageData = bArr;
    }

    EventMessage(android.os.Parcel parcel) {
        this.schemeIdUri = (java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(parcel.readString());
        this.value = (java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(parcel.readString());
        this.durationMs = parcel.readLong();
        this.id = parcel.readLong();
        this.messageData = (byte[]) com.google.android.exoplayer2.util.Util.castNonNull(parcel.createByteArray());
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
        java.lang.String str = this.schemeIdUri;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.schemeIdUri;
            int hashCode = (com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.value;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.durationMs;
            int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.id;
            this.hashCode = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.messageData);
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.emsg.EventMessage eventMessage = (com.google.android.exoplayer2.metadata.emsg.EventMessage) obj;
        return this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && com.google.android.exoplayer2.util.Util.areEqual(this.schemeIdUri, eventMessage.schemeIdUri) && com.google.android.exoplayer2.util.Util.areEqual(this.value, eventMessage.value) && java.util.Arrays.equals(this.messageData, eventMessage.messageData);
    }

    public java.lang.String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.id);
        parcel.writeByteArray(this.messageData);
    }
}
