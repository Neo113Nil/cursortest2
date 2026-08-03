package com.google.android.exoplayer2.metadata;

/* loaded from: classes3.dex */
public final class Metadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.Metadata> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.Metadata>() { // from class: com.google.android.exoplayer2.metadata.Metadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.Metadata createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.exoplayer2.metadata.Metadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.Metadata[] newArray(int i) {
            return new com.google.android.exoplayer2.metadata.Metadata[i];
        }
    };
    private final com.google.android.exoplayer2.metadata.Metadata.Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry extends android.os.Parcelable {

        /* renamed from: com.google.android.exoplayer2.metadata.Metadata$Entry$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static byte[] $default$getWrappedMetadataBytes(com.google.android.exoplayer2.metadata.Metadata.Entry _this) {
                return null;
            }

            public static com.google.android.exoplayer2.Format $default$getWrappedMetadataFormat(com.google.android.exoplayer2.metadata.Metadata.Entry _this) {
                return null;
            }

            public static void $default$populateMediaMetadata(com.google.android.exoplayer2.metadata.Metadata.Entry _this, com.google.android.exoplayer2.MediaMetadata.Builder builder) {
            }
        }

        byte[] getWrappedMetadataBytes();

        com.google.android.exoplayer2.Format getWrappedMetadataFormat();

        void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Metadata(com.google.android.exoplayer2.metadata.Metadata.Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public Metadata(long j, com.google.android.exoplayer2.metadata.Metadata.Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry> list) {
        this((com.google.android.exoplayer2.metadata.Metadata.Entry[]) list.toArray(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]));
    }

    public Metadata(long j, java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry> list) {
        this(j, (com.google.android.exoplayer2.metadata.Metadata.Entry[]) list.toArray(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]));
    }

    Metadata(android.os.Parcel parcel) {
        this.entries = new com.google.android.exoplayer2.metadata.Metadata.Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.metadata.Metadata.Entry[] entryArr = this.entries;
            if (i < entryArr.length) {
                entryArr[i] = (com.google.android.exoplayer2.metadata.Metadata.Entry) parcel.readParcelable(com.google.android.exoplayer2.metadata.Metadata.Entry.class.getClassLoader());
                i++;
            } else {
                this.presentationTimeUs = parcel.readLong();
                return;
            }
        }
    }

    public int length() {
        return this.entries.length;
    }

    public com.google.android.exoplayer2.metadata.Metadata.Entry get(int i) {
        return this.entries[i];
    }

    public com.google.android.exoplayer2.metadata.Metadata copyWithAppendedEntriesFrom(com.google.android.exoplayer2.metadata.Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public com.google.android.exoplayer2.metadata.Metadata copyWithAppendedEntries(com.google.android.exoplayer2.metadata.Metadata.Entry... entryArr) {
        return entryArr.length == 0 ? this : new com.google.android.exoplayer2.metadata.Metadata(this.presentationTimeUs, (com.google.android.exoplayer2.metadata.Metadata.Entry[]) com.google.android.exoplayer2.util.Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public com.google.android.exoplayer2.metadata.Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new com.google.android.exoplayer2.metadata.Metadata(j, this.entries);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.Metadata metadata = (com.google.android.exoplayer2.metadata.Metadata) obj;
        return java.util.Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs;
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.entries) * 31) + com.google.common.primitives.Longs.hashCode(this.presentationTimeUs);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("entries=");
        sb.append(java.util.Arrays.toString(this.entries));
        if (this.presentationTimeUs == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.entries.length);
        for (com.google.android.exoplayer2.metadata.Metadata.Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.presentationTimeUs);
    }
}
