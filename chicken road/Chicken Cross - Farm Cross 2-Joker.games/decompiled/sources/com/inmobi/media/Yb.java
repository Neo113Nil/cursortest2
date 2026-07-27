package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yb implements Parcelable {
    public static final Xb CREATOR = new Xb();

    /* renamed from: a, reason: collision with root package name */
    public final Zb f6970a;
    public final String b;
    public final int c;
    public final long d;
    public int e;
    public String f;

    public Yb(Zb landingPageTelemetryMetaData, String urlType, int i, long j) {
        Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        this.f6970a = landingPageTelemetryMetaData;
        this.b = urlType;
        this.c = i;
        this.d = j;
        this.e = -1;
    }

    public static Yb a(Yb yb) {
        Zb landingPageTelemetryMetaData = yb.f6970a;
        String urlType = yb.b;
        int i = yb.c;
        long j = yb.d;
        yb.getClass();
        Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        return new Yb(landingPageTelemetryMetaData, urlType, i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yb)) {
            return false;
        }
        Yb yb = (Yb) obj;
        return Intrinsics.areEqual(this.f6970a, yb.f6970a) && Intrinsics.areEqual(this.b, yb.b) && this.c == yb.c && this.d == yb.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + Hj.a(this.c, (this.b.hashCode() + (this.f6970a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f6970a + ", urlType=" + this.b + ", counter=" + this.c + ", startTime=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.f6970a.f6990a);
        parcel.writeString(this.f6970a.b);
        parcel.writeString(this.f6970a.c);
        parcel.writeString(this.f6970a.d);
        parcel.writeString(this.f6970a.e);
        parcel.writeString(this.f6970a.f);
        parcel.writeString(this.f6970a.g);
        parcel.writeByte(this.f6970a.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f6970a.i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
