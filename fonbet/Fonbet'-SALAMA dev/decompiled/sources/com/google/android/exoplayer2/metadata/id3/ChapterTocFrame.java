package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v2.t;

/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a(7);

    /* renamed from: b, reason: collision with root package name */
    public final String f10613b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10614c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10615d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f10616e;

    /* renamed from: f, reason: collision with root package name */
    public final Id3Frame[] f10617f;

    public ChapterTocFrame(String str, boolean z4, boolean z7, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f10613b = str;
        this.f10614c = z4;
        this.f10615d = z7;
        this.f10616e = strArr;
        this.f10617f = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f10614c == chapterTocFrame.f10614c && this.f10615d == chapterTocFrame.f10615d && t.a(this.f10613b, chapterTocFrame.f10613b) && Arrays.equals(this.f10616e, chapterTocFrame.f10616e) && Arrays.equals(this.f10617f, chapterTocFrame.f10617f);
    }

    public final int hashCode() {
        int i7 = (((527 + (this.f10614c ? 1 : 0)) * 31) + (this.f10615d ? 1 : 0)) * 31;
        String str = this.f10613b;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10613b);
        parcel.writeByte(this.f10614c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10615d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f10616e);
        Id3Frame[] id3FrameArr = this.f10617f;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10613b = readString;
        this.f10614c = parcel.readByte() != 0;
        this.f10615d = parcel.readByte() != 0;
        this.f10616e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f10617f = new Id3Frame[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f10617f[i8] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
