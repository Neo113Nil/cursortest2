package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v2.t;

/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a(9);

    /* renamed from: b, reason: collision with root package name */
    public final String f10621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10622c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10623d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10624e;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f10621b = str;
        this.f10622c = str2;
        this.f10623d = str3;
        this.f10624e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return t.a(this.f10621b, geobFrame.f10621b) && t.a(this.f10622c, geobFrame.f10622c) && t.a(this.f10623d, geobFrame.f10623d) && Arrays.equals(this.f10624e, geobFrame.f10624e);
    }

    public final int hashCode() {
        String str = this.f10621b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10622c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10623d;
        return Arrays.hashCode(this.f10624e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": mimeType=" + this.f10621b + ", filename=" + this.f10622c + ", description=" + this.f10623d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10621b);
        parcel.writeString(this.f10622c);
        parcel.writeString(this.f10623d);
        parcel.writeByteArray(this.f10624e);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10621b = readString;
        this.f10622c = parcel.readString();
        this.f10623d = parcel.readString();
        this.f10624e = parcel.createByteArray();
    }
}
