package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v2.t;

/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a(11);

    /* renamed from: b, reason: collision with root package name */
    public final int f10629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10631d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f10632e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f10633f;

    public MlltFrame(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f10629b = i7;
        this.f10630c = i8;
        this.f10631d = i9;
        this.f10632e = iArr;
        this.f10633f = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f10629b == mlltFrame.f10629b && this.f10630c == mlltFrame.f10630c && this.f10631d == mlltFrame.f10631d && Arrays.equals(this.f10632e, mlltFrame.f10632e) && Arrays.equals(this.f10633f, mlltFrame.f10633f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10633f) + ((Arrays.hashCode(this.f10632e) + ((((((527 + this.f10629b) * 31) + this.f10630c) * 31) + this.f10631d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10629b);
        parcel.writeInt(this.f10630c);
        parcel.writeInt(this.f10631d);
        parcel.writeIntArray(this.f10632e);
        parcel.writeIntArray(this.f10633f);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f10629b = parcel.readInt();
        this.f10630c = parcel.readInt();
        this.f10631d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i7 = t.f17153a;
        this.f10632e = createIntArray;
        this.f10633f = parcel.createIntArray();
    }
}
