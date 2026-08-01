package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4201x0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final long f7470a;
    public final String b;
    public Map c;
    public String d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public boolean l;
    public String m;
    public static final Set n = SetsKt.setOf((Object[]) new String[]{"c_applovin", "c_applovincustom"});
    public static final Parcelable.Creator<C4201x0> CREATOR = new C4174w0();

    public C4201x0(long j, String str, String str2, String str3) {
        this.h = "";
        this.i = "";
        this.k = "activity";
        this.f7470a = j;
        this.e = str2;
        this.b = str;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4201x0)) {
            return false;
        }
        C4201x0 c4201x0 = (C4201x0) obj;
        return this.f7470a == c4201x0.f7470a && Intrinsics.areEqual(this.k, c4201x0.k) && Intrinsics.areEqual(this.b, c4201x0.b) && Intrinsics.areEqual(this.e, c4201x0.e);
    }

    public final int hashCode() {
        long j = this.f7470a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.e;
        return this.k.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.f7470a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f7470a);
        dest.writeString(this.k);
        dest.writeString(this.e);
    }

    public C4201x0(Parcel parcel) {
        this.h = "";
        this.i = "";
        String str = "activity";
        this.k = "activity";
        this.f7470a = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null && !Intrinsics.areEqual(readString, "activity") && Intrinsics.areEqual(readString, "others")) {
            str = "others";
        }
        this.k = str;
        this.e = parcel.readString();
    }
}
