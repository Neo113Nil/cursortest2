package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class q extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.p();
    public final java.lang.String b;
    public final byte[] c;

    public q(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q qVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q) obj;
        return com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, qVar.b) && java.util.Arrays.equals(this.c, qVar.c);
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        return java.util.Arrays.hashCode(this.c) + (((str != null ? str.hashCode() : 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public q(android.os.Parcel parcel) {
        super("PRIV");
        this.b = parcel.readString();
        this.c = parcel.createByteArray();
    }
}
