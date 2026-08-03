package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g();
    public final java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final java.lang.String[] e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] f;

    public h(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = oVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h) obj;
        return this.c == hVar.c && this.d == hVar.d && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, hVar.b) && java.util.Arrays.equals(this.e, hVar.e) && java.util.Arrays.equals(this.f, hVar.f);
    }

    public final int hashCode() {
        int i = ((((this.c ? 1 : 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.d ? 1 : 0)) * 31;
        java.lang.String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        int i2 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = this.f;
            if (i2 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i2], 0);
            i2++;
        }
    }

    public h(android.os.Parcel parcel) {
        super("CTOC");
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o.class.getClassLoader());
        }
    }
}
