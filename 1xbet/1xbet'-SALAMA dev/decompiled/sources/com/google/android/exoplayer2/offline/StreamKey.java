package com.google.android.exoplayer2.offline;

import Z2.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10676c;

    public StreamKey() {
        this.f10674a = -1;
        this.f10675b = -1;
        this.f10676c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i7 = this.f10674a - streamKey2.f10674a;
        if (i7 != 0) {
            return i7;
        }
        int i8 = this.f10675b - streamKey2.f10675b;
        return i8 == 0 ? this.f10676c - streamKey2.f10676c : i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f10674a == streamKey.f10674a && this.f10675b == streamKey.f10675b && this.f10676c == streamKey.f10676c;
    }

    public final int hashCode() {
        return (((this.f10674a * 31) + this.f10675b) * 31) + this.f10676c;
    }

    public final String toString() {
        return this.f10674a + "." + this.f10675b + "." + this.f10676c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10674a);
        parcel.writeInt(this.f10675b);
        parcel.writeInt(this.f10676c);
    }

    public StreamKey(Parcel parcel) {
        this.f10674a = parcel.readInt();
        this.f10675b = parcel.readInt();
        this.f10676c = parcel.readInt();
    }
}
