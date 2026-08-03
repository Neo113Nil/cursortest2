package com.google.android.exoplayer2.metadata.vorbis;

/* loaded from: classes3.dex */
public final class VorbisComment extends com.google.android.exoplayer2.metadata.flac.VorbisComment {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.vorbis.VorbisComment> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.vorbis.VorbisComment>() { // from class: com.google.android.exoplayer2.metadata.vorbis.VorbisComment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.vorbis.VorbisComment createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.exoplayer2.metadata.vorbis.VorbisComment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.vorbis.VorbisComment[] newArray(int i) {
            return new com.google.android.exoplayer2.metadata.vorbis.VorbisComment[i];
        }
    };

    public VorbisComment(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    VorbisComment(android.os.Parcel parcel) {
        super(parcel);
    }
}
