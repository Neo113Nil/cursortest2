package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class s extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.r();
    public final java.lang.String b;
    public final java.lang.String c;

    public s(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s) obj;
        return this.f4043a.equals(sVar.f4043a) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, sVar.b) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.c, sVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.f4043a.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f4043a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public s(android.os.Parcel parcel) {
        super(parcel.readString());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
