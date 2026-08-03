package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class l extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.l> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k();
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final byte[] e;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.l.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.l) obj;
        return com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, lVar.b) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.c, lVar.c) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.d, lVar.d) && java.util.Arrays.equals(this.e, lVar.e);
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        int hashCode = ((str != null ? str.hashCode() : 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.d;
        return java.util.Arrays.hashCode(this.e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public l(android.os.Parcel parcel) {
        super("GEOB");
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.createByteArray();
    }
}
