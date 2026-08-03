package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a();
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final byte[] e;

    public b(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b) obj;
        return this.d == bVar.d && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, bVar.b) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.c, bVar.c) && java.util.Arrays.equals(this.e, bVar.e);
    }

    public final int hashCode() {
        int i = (this.d + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        return java.util.Arrays.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public b(android.os.Parcel parcel) {
        super("APIC");
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
