package com.google.android.exoplayer2.metadata.flac;

import A1.C0024i0;
import B2.e;
import C1.C0095a;
import D3.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p150v0.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new e(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10588f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final byte[] f10590y;

    public PictureFrame(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f10583a = i7;
        this.f10584b = str;
        this.f10585c = str2;
        this.f10586d = i8;
        this.f10587e = i9;
        this.f10588f = i10;
        this.f10589x = i11;
        this.f10590y = bArr;
    }

    public static PictureFrame a(C0095a c0095a) {
        int iG = c0095a.g();
        String strR = c0095a.r(c0095a.g(), f.f1717a);
        String strR2 = c0095a.r(c0095a.g(), f.f1719c);
        int iG2 = c0095a.g();
        int iG3 = c0095a.g();
        int iG4 = c0095a.g();
        int iG5 = c0095a.g();
        int iG6 = c0095a.g();
        byte[] bArr = new byte[iG6];
        c0095a.f(bArr, 0, iG6);
        return new PictureFrame(iG, strR, strR2, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f10583a == pictureFrame.f10583a && this.f10584b.equals(pictureFrame.f10584b) && this.f10585c.equals(pictureFrame.f10585c) && this.f10586d == pictureFrame.f10586d && this.f10587e == pictureFrame.f10587e && this.f10588f == pictureFrame.f10588f && this.f10589x == pictureFrame.f10589x && Arrays.equals(this.f10590y, pictureFrame.f10590y);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        c0024i0.a(this.f10583a, this.f10590y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10590y) + ((((((((a.d(a.d((527 + this.f10583a) * 31, 31, this.f10584b), 31, this.f10585c) + this.f10586d) * 31) + this.f10587e) * 31) + this.f10588f) * 31) + this.f10589x) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f10584b + ", description=" + this.f10585c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10583a);
        parcel.writeString(this.f10584b);
        parcel.writeString(this.f10585c);
        parcel.writeInt(this.f10586d);
        parcel.writeInt(this.f10587e);
        parcel.writeInt(this.f10588f);
        parcel.writeInt(this.f10589x);
        parcel.writeByteArray(this.f10590y);
    }

    public PictureFrame(Parcel parcel) {
        this.f10583a = parcel.readInt();
        String string = parcel.readString();
        int i7 = t.f17159a;
        this.f10584b = string;
        this.f10585c = parcel.readString();
        this.f10586d = parcel.readInt();
        this.f10587e = parcel.readInt();
        this.f10588f = parcel.readInt();
        this.f10589x = parcel.readInt();
        this.f10590y = parcel.createByteArray();
    }
}
