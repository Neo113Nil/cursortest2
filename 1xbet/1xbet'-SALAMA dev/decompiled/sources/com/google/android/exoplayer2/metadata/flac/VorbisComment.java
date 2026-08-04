package com.google.android.exoplayer2.metadata.flac;

import A1.C0024i0;
import B2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import p150v0.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new e(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        String str = this.f10591a;
        str.getClass();
        String str2 = this.f10592b;
        switch (str) {
            case "ALBUM":
                c0024i0.f391c = str2;
                break;
            case "TITLE":
                c0024i0.f389a = str2;
                break;
            case "DESCRIPTION":
                c0024i0.f395g = str2;
                break;
            case "ALBUMARTIST":
                c0024i0.f392d = str2;
                break;
            case "ARTIST":
                c0024i0.f390b = str2;
                break;
        }
    }

    public final int hashCode() {
        return this.f10592b.hashCode() + a.d(527, 31, this.f10591a);
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
        String string = parcel.readString();
        int i7 = t.f17159a;
        this.f10591a = string;
        this.f10592b = parcel.readString();
    }
}
