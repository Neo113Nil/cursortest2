package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class H implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri i;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<H> CREATOR = new a();

    public static final class a implements Parcelable.Creator<H> {
        @Override // android.os.Parcelable.Creator
        public final H createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new H(source);
        }

        @Override // android.os.Parcelable.Creator
        public final H[] newArray(int i) {
            return new H[i];
        }
    }

    public static final class b {
    }

    @JvmOverloads
    public H(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        com.facebook.internal.F.e(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        String str5 = this.a;
        return ((str5 == null && ((H) obj).a == null) || Intrinsics.areEqual(str5, ((H) obj).a)) && (((str = this.b) == null && ((H) obj).b == null) || Intrinsics.areEqual(str, ((H) obj).b)) && ((((str2 = this.c) == null && ((H) obj).c == null) || Intrinsics.areEqual(str2, ((H) obj).c)) && ((((str3 = this.d) == null && ((H) obj).d == null) || Intrinsics.areEqual(str3, ((H) obj).d)) && ((((str4 = this.e) == null && ((H) obj).e == null) || Intrinsics.areEqual(str4, ((H) obj).e)) && ((((uri = this.f) == null && ((H) obj).f == null) || Intrinsics.areEqual(uri, ((H) obj).f)) && (((uri2 = this.i) == null && ((H) obj).i == null) || Intrinsics.areEqual(uri2, ((H) obj).i))))));
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.i;
        if (uri2 != null) {
            return uri2.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Uri uri = this.f;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.i;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public H(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.a = jsonObject.optString("id", null);
        this.b = jsonObject.optString("first_name", null);
        this.c = jsonObject.optString("middle_name", null);
        this.d = jsonObject.optString("last_name", null);
        this.e = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.i = optString2 != null ? Uri.parse(optString2) : null;
    }

    public H(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        String readString = parcel.readString();
        this.f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.i = readString2 != null ? Uri.parse(readString2) : null;
    }
}
