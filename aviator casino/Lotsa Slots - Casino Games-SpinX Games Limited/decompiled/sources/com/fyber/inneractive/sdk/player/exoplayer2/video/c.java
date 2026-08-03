package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.video.c> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.video.b();

    /* renamed from: a, reason: collision with root package name */
    public final int f4123a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    public c(int i, int i2, int i3, byte[] bArr) {
        this.f4123a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.fyber.inneractive.sdk.player.exoplayer2.video.c.class == obj.getClass()) {
            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) obj;
            if (this.f4123a == cVar.f4123a && this.b == cVar.b && this.c == cVar.c && java.util.Arrays.equals(this.d, cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = java.util.Arrays.hashCode(this.d) + ((((((this.f4123a + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorInfo(");
        sb.append(this.f4123a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.f4123a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d != null ? 1 : 0);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public c(android.os.Parcel parcel) {
        this.f4123a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
