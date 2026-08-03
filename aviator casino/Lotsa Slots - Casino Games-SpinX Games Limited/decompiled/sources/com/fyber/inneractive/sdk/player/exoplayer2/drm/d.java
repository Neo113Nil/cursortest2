package com.fyber.inneractive.sdk.player.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class d implements java.util.Comparator, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> CREATOR = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.c[] f3923a;
    public int b;
    public final int c;

    public d(boolean z, com.fyber.inneractive.sdk.player.exoplayer2.drm.c... cVarArr) {
        cVarArr = z ? (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) cVarArr.clone() : cVarArr;
        java.util.Arrays.sort(cVarArr, this);
        for (int i = 1; i < cVarArr.length; i++) {
            if (cVarArr[i - 1].b.equals(cVarArr[i].b)) {
                throw new java.lang.IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i].b);
            }
        }
        this.f3923a = cVarArr;
        this.c = cVarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.player.exoplayer2.drm.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.drm.c) obj;
        com.fyber.inneractive.sdk.player.exoplayer2.drm.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.c) obj2;
        java.util.UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.b;
        return uuid.equals(cVar.b) ? uuid.equals(cVar2.b) ? 0 : 1 : cVar.b.compareTo(cVar2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f3923a, ((com.fyber.inneractive.sdk.player.exoplayer2.drm.d) obj).f3923a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = java.util.Arrays.hashCode(this.f3923a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedArray(this.f3923a, 0);
    }

    public d(android.os.Parcel parcel) {
        com.fyber.inneractive.sdk.player.exoplayer2.drm.c[] cVarArr = (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) parcel.createTypedArray(com.fyber.inneractive.sdk.player.exoplayer2.drm.c.CREATOR);
        this.f3923a = cVarArr;
        this.c = cVarArr.length;
    }
}
