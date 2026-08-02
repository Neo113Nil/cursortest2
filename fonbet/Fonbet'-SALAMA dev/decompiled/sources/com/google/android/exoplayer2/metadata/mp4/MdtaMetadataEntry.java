package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new V2.a(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f10640a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10641b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10642c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10643d;

    public MdtaMetadataEntry(String str, byte[] bArr, int i7, int i8) {
        this.f10640a = str;
        this.f10641b = bArr;
        this.f10642c = i7;
        this.f10643d = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f10640a.equals(mdtaMetadataEntry.f10640a) && Arrays.equals(this.f10641b, mdtaMetadataEntry.f10641b) && this.f10642c == mdtaMetadataEntry.f10642c && this.f10643d == mdtaMetadataEntry.f10643d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10641b) + AbstractC1663a.d(527, 31, this.f10640a)) * 31) + this.f10642c) * 31) + this.f10643d;
    }

    public final String toString() {
        return "mdta: key=" + this.f10640a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10640a);
        parcel.writeByteArray(this.f10641b);
        parcel.writeInt(this.f10642c);
        parcel.writeInt(this.f10643d);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10640a = readString;
        this.f10641b = parcel.createByteArray();
        this.f10642c = parcel.readInt();
        this.f10643d = parcel.readInt();
    }
}
