package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class f extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e();
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] g;

    public f(java.lang.String str, int i, int i2, long j, long j2, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f fVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f) obj;
        return this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, fVar.b) && java.util.Arrays.equals(this.g, fVar.g);
    }

    public final int hashCode() {
        int i = (((((((this.c + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        java.lang.String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar : this.g) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public f(android.os.Parcel parcel) {
        super("CHAP");
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o.class.getClassLoader());
        }
    }
}
