package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public final class o implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.o> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.n();
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4044a;
    public final int b;
    public final java.lang.String c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final int g;
    public final java.util.List h;
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    public final int o;
    public final byte[] p;
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public final int x;
    public final java.lang.String y;
    public final int z;

    public o(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i7, int i8, int i9, int i10, int i11, int i12, java.lang.String str5, int i13, long j, java.util.List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f4044a = str;
        this.e = str2;
        this.f = str3;
        this.c = str4;
        this.b = i;
        this.g = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = i5;
        this.n = f2;
        this.p = bArr;
        this.o = i6;
        this.q = cVar;
        this.r = i7;
        this.s = i8;
        this.t = i9;
        this.u = i10;
        this.v = i11;
        this.x = i12;
        this.y = str5;
        this.z = i13;
        this.w = j;
        this.h = list == null ? java.util.Collections.emptyList() : list;
        this.i = dVar;
        this.d = bVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.util.List list, int i4, float f, byte[] bArr, int i5, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(str, null, str2, null, -1, i, i2, i3, -1.0f, i4, f, bArr, i5, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    public final int b() {
        int i;
        int i2 = this.j;
        if (i2 == -1 || (i = this.k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.fyber.inneractive.sdk.player.exoplayer2.o.class == obj.getClass()) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) obj;
            if (this.b == oVar.b && this.g == oVar.g && this.j == oVar.j && this.k == oVar.k && this.l == oVar.l && this.m == oVar.m && this.n == oVar.n && this.o == oVar.o && this.r == oVar.r && this.s == oVar.s && this.t == oVar.t && this.u == oVar.u && this.v == oVar.v && this.w == oVar.w && this.x == oVar.x && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f4044a, oVar.f4044a) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.y, oVar.y) && this.z == oVar.z && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.e, oVar.e) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f, oVar.f) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.c, oVar.c) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.i, oVar.i) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.d, oVar.d) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.q, oVar.q) && java.util.Arrays.equals(this.p, oVar.p) && this.h.size() == oVar.h.size()) {
                for (int i = 0; i < this.h.size(); i++) {
                    if (!java.util.Arrays.equals((byte[]) this.h.get(i), (byte[]) oVar.h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            java.lang.String str = this.f4044a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            java.lang.String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.b) * 31) + this.j) * 31) + this.k) * 31) + this.r) * 31) + this.s) * 31;
            java.lang.String str5 = this.y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.i;
            int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.d;
            this.A = hashCode6 + (bVar != null ? java.util.Arrays.hashCode(bVar.f4040a) : 0);
        }
        return this.A;
    }

    public final java.lang.String toString() {
        return "Format(" + this.f4044a + ", " + this.e + ", " + this.f + ", " + this.b + ", " + this.y + ", [" + this.j + ", " + this.k + ", " + this.l + "], [" + this.r + ", " + this.s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f4044a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.p != null ? 1 : 0);
        byte[] bArr = this.p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.q, i);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.w);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.h.get(i2));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, java.util.List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, java.lang.String str3) {
        return a(str, str2, i, i2, i3, i4, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, java.util.List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i8, java.lang.String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(str, null, str2, null, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j, java.util.List list) {
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str3, i2, j, list, dVar, null);
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(java.lang.String str, java.lang.String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public final android.media.MediaFormat a() {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", this.f);
        java.lang.String str = this.y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.g);
        a(mediaFormat, "width", this.j);
        a(mediaFormat, "height", this.k);
        float f = this.l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        a(mediaFormat, "rotation-degrees", this.m);
        a(mediaFormat, "channel-count", this.r);
        a(mediaFormat, "sample-rate", this.s);
        a(mediaFormat, "encoder-delay", this.u);
        a(mediaFormat, "encoder-padding", this.v);
        for (int i = 0; i < this.h.size(); i++) {
            mediaFormat.setByteBuffer(com.fyber.inneractive.sdk.player.exoplayer2.m.a("csd-", i), java.nio.ByteBuffer.wrap((byte[]) this.h.get(i)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.c);
            a(mediaFormat, "color-standard", cVar.f4123a);
            a(mediaFormat, "color-range", cVar.b);
            byte[] bArr = cVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public o(android.os.Parcel parcel) {
        this.f4044a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readInt();
        this.g = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.o = parcel.readInt();
        this.q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new java.util.ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public static void a(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
