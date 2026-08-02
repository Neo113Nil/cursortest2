package com.google.android.exoplayer2.metadata.flac;

import A1.C0024i0;
import B2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import v0.AbstractC1663a;
import v2.t;

@Deprecated
/* loaded from: classes.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new e(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f10591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10592b;

    public VorbisComment(String str, String str2) {
        this.f10591a = str;
        this.f10592b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f10591a.equals(vorbisComment.f10591a) && this.f10592b.equals(vorbisComment.f10592b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        String str;
        String str2 = this.f10591a;
        str2.getClass();
        str = this.f10592b;
        switch (str2) {
            case "ALBUM":
                c0024i0.f391c = str;
                break;
            case "TITLE":
                c0024i0.f389a = str;
                break;
            case "DESCRIPTION":
                c0024i0.f395g = str;
                break;
            case "ALBUMARTIST":
                c0024i0.f392d = str;
                break;
            case "ARTIST":
                c0024i0.f390b = str;
                break;
        }
    }

    public final int hashCode() {
        return this.f10592b.hashCode() + AbstractC1663a.d(527, 31, this.f10591a);
    }

    public final String toString() {
        return "VC: " + this.f10591a + "=" + this.f10592b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10591a);
        parcel.writeString(this.f10592b);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10591a = readString;
        this.f10592b = parcel.readString();
    }
}
