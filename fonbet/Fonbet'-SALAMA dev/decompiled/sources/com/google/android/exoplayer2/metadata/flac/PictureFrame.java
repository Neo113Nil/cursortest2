package com.google.android.exoplayer2.metadata.flac;

import A1.C0024i0;
import B2.e;
import C1.C0095a;
import D3.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new e(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f10583a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10584b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10585c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10586d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10587e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10588f;

    /* renamed from: x, reason: collision with root package name */
    public final int f10589x;

    /* renamed from: y, reason: collision with root package name */
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
        int g3 = c0095a.g();
        String r7 = c0095a.r(c0095a.g(), f.f1717a);
        String r8 = c0095a.r(c0095a.g(), f.f1719c);
        int g7 = c0095a.g();
        int g8 = c0095a.g();
        int g9 = c0095a.g();
        int g10 = c0095a.g();
        int g11 = c0095a.g();
        byte[] bArr = new byte[g11];
        c0095a.f(bArr, 0, g11);
        return new PictureFrame(g3, r7, r8, g7, g8, g9, g10, bArr);
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
        return Arrays.hashCode(this.f10590y) + ((((((((AbstractC1663a.d(AbstractC1663a.d((527 + this.f10583a) * 31, 31, this.f10584b), 31, this.f10585c) + this.f10586d) * 31) + this.f10587e) * 31) + this.f10588f) * 31) + this.f10589x) * 31);
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
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10584b = readString;
        this.f10585c = parcel.readString();
        this.f10586d = parcel.readInt();
        this.f10587e = parcel.readInt();
        this.f10588f = parcel.readInt();
        this.f10589x = parcel.readInt();
        this.f10590y = parcel.createByteArray();
    }
}
