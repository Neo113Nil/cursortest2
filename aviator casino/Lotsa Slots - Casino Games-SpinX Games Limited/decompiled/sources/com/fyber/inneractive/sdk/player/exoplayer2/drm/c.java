package com.fyber.inneractive.sdk.player.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.drm.c> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.drm.b();

    /* renamed from: a, reason: collision with root package name */
    public int f3922a;
    public final java.util.UUID b;
    public final java.lang.String c;
    public final byte[] d;
    public final boolean e;

    public c(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        bArr.getClass();
        this.d = bArr;
        this.e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.fyber.inneractive.sdk.player.exoplayer2.drm.c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.drm.c) obj;
        return this.c.equals(cVar.c) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, cVar.b) && java.util.Arrays.equals(this.d, cVar.d);
    }

    public final int hashCode() {
        if (this.f3922a == 0) {
            this.f3922a = java.util.Arrays.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }
        return this.f3922a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.b.getMostSignificantBits());
        parcel.writeLong(this.b.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public c(android.os.Parcel parcel) {
        this.b = new java.util.UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        this.d = parcel.createByteArray();
        this.e = parcel.readByte() != 0;
    }
}
