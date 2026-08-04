package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10635c;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f10634b = str;
        this.f10635c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return t.a(this.f10634b, privFrame.f10634b) && Arrays.equals(this.f10635c, privFrame.f10635c);
    }

    public final int hashCode() {
        String str = this.f10634b;
        return Arrays.hashCode(this.f10635c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": owner=" + this.f10634b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10634b);
        parcel.writeByteArray(this.f10635c);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i7 = t.f17159a;
        this.f10634b = string;
        this.f10635c = parcel.createByteArray();
    }
}
