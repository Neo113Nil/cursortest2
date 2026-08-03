package com.inmobi.media;

/* renamed from: com.inmobi.media.gb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2431gb implements android.os.Parcelable {
    public static final com.inmobi.media.C2404fb CREATOR = new com.inmobi.media.C2404fb();

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2457hb f5216a;
    public final java.lang.String b;
    public final int c;
    public final long d;
    public int e;
    public java.lang.String f;

    public C2431gb(com.inmobi.media.C2457hb landingPageTelemetryMetaData, java.lang.String urlType, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlType, "urlType");
        this.f5216a = landingPageTelemetryMetaData;
        this.b = urlType;
        this.c = i;
        this.d = j;
        this.e = -1;
    }

    public static com.inmobi.media.C2431gb a(com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.C2457hb landingPageTelemetryMetaData = c2431gb.f5216a;
        java.lang.String urlType = c2431gb.b;
        int i = c2431gb.c;
        long j = c2431gb.d;
        c2431gb.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlType, "urlType");
        return new com.inmobi.media.C2431gb(landingPageTelemetryMetaData, urlType, i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2431gb)) {
            return false;
        }
        com.inmobi.media.C2431gb c2431gb = (com.inmobi.media.C2431gb) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5216a, c2431gb.f5216a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2431gb.b) && this.c == c2431gb.c && this.d == c2431gb.d;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + com.inmobi.media.AbstractC2755si.a(this.c, (this.b.hashCode() + (this.f5216a.hashCode() * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f5216a + ", urlType=" + this.b + ", counter=" + this.c + ", startTime=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.f5216a.f5239a);
        parcel.writeString(this.f5216a.b);
        parcel.writeString(this.f5216a.c);
        parcel.writeString(this.f5216a.d);
        parcel.writeString(this.f5216a.e);
        parcel.writeString(this.f5216a.f);
        parcel.writeString(this.f5216a.g);
        parcel.writeByte(this.f5216a.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5216a.i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
