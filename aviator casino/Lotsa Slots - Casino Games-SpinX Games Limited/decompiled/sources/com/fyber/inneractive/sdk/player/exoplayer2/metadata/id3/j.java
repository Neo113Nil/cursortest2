package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class j extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i();
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) obj;
        return com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.c, jVar.c) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, jVar.b) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.d, jVar.d);
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        int hashCode = ((str != null ? str.hashCode() : 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f4043a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public j(android.os.Parcel parcel) {
        super("COMM");
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
