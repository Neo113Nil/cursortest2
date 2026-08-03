package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

/* loaded from: classes3.dex */
public final class b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.metadata.b> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] f4040a;

    public b(java.util.ArrayList arrayList) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[arrayList.size()];
        this.f4040a = oVarArr;
        arrayList.toArray(oVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f4040a, ((com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) obj).f4040a);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f4040a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.f4040a.length);
        for (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar : this.f4040a) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public b(android.os.Parcel parcel) {
        this.f4040a = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[parcel.readInt()];
        int i = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = this.f4040a;
            if (i >= oVarArr.length) {
                return;
            }
            oVarArr[i] = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o.class.getClassLoader());
            i++;
        }
    }
}
