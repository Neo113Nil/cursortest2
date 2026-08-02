package com.google.android.exoplayer2.metadata.icy;

import A1.C0024i0;
import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10601c;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f10599a = bArr;
        this.f10600b = str;
        this.f10601c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10599a, ((IcyInfo) obj).f10599a);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        String str = this.f10600b;
        if (str != null) {
            c0024i0.f389a = str;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10599a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f10600b + "\", url=\"" + this.f10601c + "\", rawMetadata.length=\"" + this.f10599a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f10599a);
        parcel.writeString(this.f10600b);
        parcel.writeString(this.f10601c);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f10599a = createByteArray;
        this.f10600b = parcel.readString();
        this.f10601c = parcel.readString();
    }
}
