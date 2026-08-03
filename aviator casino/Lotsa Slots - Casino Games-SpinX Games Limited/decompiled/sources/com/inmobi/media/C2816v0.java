package com.inmobi.media;

/* renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2816v0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.inmobi.media.C2816v0> CREATOR = new com.inmobi.media.C2790u0();

    /* renamed from: a, reason: collision with root package name */
    public final long f5497a;
    public final java.lang.String b;
    public java.util.Map c;
    public java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public boolean j;
    public java.lang.String k;

    public C2816v0(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.h = "";
        this.i = "activity";
        this.f5497a = j;
        this.e = str2;
        this.b = str;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2816v0)) {
            return false;
        }
        com.inmobi.media.C2816v0 c2816v0 = (com.inmobi.media.C2816v0) obj;
        return this.f5497a == c2816v0.f5497a && kotlin.jvm.internal.Intrinsics.areEqual(this.i, c2816v0.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2816v0.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c2816v0.e);
    }

    public final int hashCode() {
        long j = this.f5497a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        java.lang.String str = this.e;
        return this.i.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.f5497a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f5497a);
        dest.writeString(this.i);
        dest.writeString(this.e);
    }

    public C2816v0(android.os.Parcel parcel) {
        this.h = "";
        java.lang.String str = "activity";
        this.i = "activity";
        this.f5497a = parcel.readLong();
        java.lang.String readString = parcel.readString();
        if (readString != null && !kotlin.jvm.internal.Intrinsics.areEqual(readString, "activity") && kotlin.jvm.internal.Intrinsics.areEqual(readString, "others")) {
            str = "others";
        }
        this.i = str;
        this.e = parcel.readString();
    }
}
