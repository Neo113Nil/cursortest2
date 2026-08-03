package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c();
    public final byte[] b;

    public d(java.lang.String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d dVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d) obj;
        return this.f4043a.equals(dVar.f4043a) && java.util.Arrays.equals(this.b, dVar.b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b) + ((this.f4043a.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f4043a);
        parcel.writeByteArray(this.b);
    }

    public d(android.os.Parcel parcel) {
        super(parcel.readString());
        this.b = parcel.createByteArray();
    }
}
