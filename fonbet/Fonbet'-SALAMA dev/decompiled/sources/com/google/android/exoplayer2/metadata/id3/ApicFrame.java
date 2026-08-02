package com.google.android.exoplayer2.metadata.id3;

import A1.C0024i0;
import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v2.t;

/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a(4);

    /* renamed from: b, reason: collision with root package name */
    public final String f10602b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10604d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10605e;

    public ApicFrame(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f10602b = str;
        this.f10603c = str2;
        this.f10604d = i7;
        this.f10605e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f10604d == apicFrame.f10604d && t.a(this.f10602b, apicFrame.f10602b) && t.a(this.f10603c, apicFrame.f10603c) && Arrays.equals(this.f10605e, apicFrame.f10605e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        c0024i0.a(this.f10604d, this.f10605e);
    }

    public final int hashCode() {
        int i7 = (527 + this.f10604d) * 31;
        String str = this.f10602b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10603c;
        return Arrays.hashCode(this.f10605e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": mimeType=" + this.f10602b + ", description=" + this.f10603c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10602b);
        parcel.writeString(this.f10603c);
        parcel.writeInt(this.f10604d);
        parcel.writeByteArray(this.f10605e);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10602b = readString;
        this.f10603c = parcel.readString();
        this.f10604d = parcel.readInt();
        this.f10605e = parcel.createByteArray();
    }
}
