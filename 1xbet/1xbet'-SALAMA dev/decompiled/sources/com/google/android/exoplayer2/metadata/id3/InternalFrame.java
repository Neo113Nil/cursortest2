package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10628d;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f10626b = str;
        this.f10627c = str2;
        this.f10628d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return t.a(this.f10627c, internalFrame.f10627c) && t.a(this.f10626b, internalFrame.f10626b) && t.a(this.f10628d, internalFrame.f10628d);
    }

    public final int hashCode() {
        String str = this.f10626b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10627c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10628d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": domain=" + this.f10626b + ", description=" + this.f10627c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10625a);
        parcel.writeString(this.f10626b);
        parcel.writeString(this.f10628d);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i7 = t.f17159a;
        this.f10626b = string;
        this.f10627c = parcel.readString();
        this.f10628d = parcel.readString();
    }
}
