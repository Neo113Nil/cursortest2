package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10620d;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f10618b = str;
        this.f10619c = str2;
        this.f10620d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return t.a(this.f10619c, commentFrame.f10619c) && t.a(this.f10618b, commentFrame.f10618b) && t.a(this.f10620d, commentFrame.f10620d);
    }

    public final int hashCode() {
        String str = this.f10618b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10619c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10620d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": language=" + this.f10618b + ", description=" + this.f10619c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10625a);
        parcel.writeString(this.f10618b);
        parcel.writeString(this.f10620d);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i7 = t.f17159a;
        this.f10618b = string;
        this.f10619c = parcel.readString();
        this.f10620d = parcel.readString();
    }
}
