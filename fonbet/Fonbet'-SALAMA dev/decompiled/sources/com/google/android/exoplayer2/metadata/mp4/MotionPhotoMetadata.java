package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new V2.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final long f10644a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10645b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10646c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10647d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10648e;

    public MotionPhotoMetadata(long j, long j3, long j7, long j8, long j9) {
        this.f10644a = j;
        this.f10645b = j3;
        this.f10646c = j7;
        this.f10647d = j8;
        this.f10648e = j9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f10644a == motionPhotoMetadata.f10644a && this.f10645b == motionPhotoMetadata.f10645b && this.f10646c == motionPhotoMetadata.f10646c && this.f10647d == motionPhotoMetadata.f10647d && this.f10648e == motionPhotoMetadata.f10648e;
    }

    public final int hashCode() {
        long j = this.f10644a;
        long j3 = this.f10645b;
        int i7 = (((int) (j3 ^ (j3 >>> 32))) + ((((int) (j ^ (j >>> 32))) + 527) * 31)) * 31;
        long j7 = this.f10646c;
        int i8 = (((int) (j7 ^ (j7 >>> 32))) + i7) * 31;
        long j8 = this.f10647d;
        int i9 = (((int) (j8 ^ (j8 >>> 32))) + i8) * 31;
        long j9 = this.f10648e;
        return ((int) (j9 ^ (j9 >>> 32))) + i9;
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f10644a + ", photoSize=" + this.f10645b + ", photoPresentationTimestampUs=" + this.f10646c + ", videoStartPosition=" + this.f10647d + ", videoSize=" + this.f10648e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10644a);
        parcel.writeLong(this.f10645b);
        parcel.writeLong(this.f10646c);
        parcel.writeLong(this.f10647d);
        parcel.writeLong(this.f10648e);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f10644a = parcel.readLong();
        this.f10645b = parcel.readLong();
        this.f10646c = parcel.readLong();
        this.f10647d = parcel.readLong();
        this.f10648e = parcel.readLong();
    }
}
