package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a(5);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10606b;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f10606b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f10625a.equals(binaryFrame.f10625a) && Arrays.equals(this.f10606b, binaryFrame.f10606b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10606b) + AbstractC1663a.d(527, 31, this.f10625a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10625a);
        parcel.writeByteArray(this.f10606b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinaryFrame(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10606b = parcel.createByteArray();
    }
}
