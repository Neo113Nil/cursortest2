package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a(14);

    /* renamed from: b, reason: collision with root package name */
    public final String f10638b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10639c;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f10638b = str2;
        this.f10639c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f10625a.equals(urlLinkFrame.f10625a) && t.a(this.f10638b, urlLinkFrame.f10638b) && t.a(this.f10639c, urlLinkFrame.f10639c);
    }

    public final int hashCode() {
        int d7 = AbstractC1663a.d(527, 31, this.f10625a);
        String str = this.f10638b;
        int hashCode = (d7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10639c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": url=" + this.f10639c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10625a);
        parcel.writeString(this.f10638b);
        parcel.writeString(this.f10639c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UrlLinkFrame(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10638b = parcel.readString();
        this.f10639c = parcel.readString();
    }
}
