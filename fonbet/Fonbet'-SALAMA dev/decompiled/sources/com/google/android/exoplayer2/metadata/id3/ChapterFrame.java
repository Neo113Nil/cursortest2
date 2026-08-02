package com.google.android.exoplayer2.metadata.id3;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v2.t;

/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a(6);

    /* renamed from: b, reason: collision with root package name */
    public final String f10607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10608c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10609d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10610e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10611f;

    /* renamed from: x, reason: collision with root package name */
    public final Id3Frame[] f10612x;

    public ChapterFrame(String str, int i7, int i8, long j, long j3, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f10607b = str;
        this.f10608c = i7;
        this.f10609d = i8;
        this.f10610e = j;
        this.f10611f = j3;
        this.f10612x = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f10608c == chapterFrame.f10608c && this.f10609d == chapterFrame.f10609d && this.f10610e == chapterFrame.f10610e && this.f10611f == chapterFrame.f10611f && t.a(this.f10607b, chapterFrame.f10607b) && Arrays.equals(this.f10612x, chapterFrame.f10612x);
    }

    public final int hashCode() {
        int i7 = (((((((527 + this.f10608c) * 31) + this.f10609d) * 31) + ((int) this.f10610e)) * 31) + ((int) this.f10611f)) * 31;
        String str = this.f10607b;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10607b);
        parcel.writeInt(this.f10608c);
        parcel.writeInt(this.f10609d);
        parcel.writeLong(this.f10610e);
        parcel.writeLong(this.f10611f);
        Id3Frame[] id3FrameArr = this.f10612x;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10607b = readString;
        this.f10608c = parcel.readInt();
        this.f10609d = parcel.readInt();
        this.f10610e = parcel.readLong();
        this.f10611f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f10612x = new Id3Frame[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f10612x[i8] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
