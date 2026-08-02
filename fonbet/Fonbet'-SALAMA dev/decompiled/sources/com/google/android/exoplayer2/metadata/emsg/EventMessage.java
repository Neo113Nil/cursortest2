package com.google.android.exoplayer2.metadata.emsg;

import A1.X;
import B2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import v2.t;

/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* renamed from: x, reason: collision with root package name */
    public static final X f10575x;

    /* renamed from: y, reason: collision with root package name */
    public static final X f10576y;

    /* renamed from: a, reason: collision with root package name */
    public final String f10577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10579c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10580d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10581e;

    /* renamed from: f, reason: collision with root package name */
    public int f10582f;

    static {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "application/id3";
        f10575x = new X(format$Builder);
        Format$Builder format$Builder2 = new Format$Builder();
        format$Builder2.f10537k = "application/x-scte35";
        f10576y = new X(format$Builder2);
        CREATOR = new e(24);
    }

    public EventMessage(String str, String str2, long j, long j3, byte[] bArr) {
        this.f10577a = str;
        this.f10578b = str2;
        this.f10579c = j;
        this.f10580d = j3;
        this.f10581e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f10579c == eventMessage.f10579c && this.f10580d == eventMessage.f10580d && t.a(this.f10577a, eventMessage.f10577a) && t.a(this.f10578b, eventMessage.f10578b) && Arrays.equals(this.f10581e, eventMessage.f10581e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final X f() {
        String str = this.f10577a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f10576y;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f10575x;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f10582f == 0) {
            String str = this.f10577a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10578b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f10579c;
            int i7 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j3 = this.f10580d;
            this.f10582f = Arrays.hashCode(this.f10581e) + ((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f10582f;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] l() {
        if (f() != null) {
            return this.f10581e;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f10577a + ", id=" + this.f10580d + ", durationMs=" + this.f10579c + ", value=" + this.f10578b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10577a);
        parcel.writeString(this.f10578b);
        parcel.writeLong(this.f10579c);
        parcel.writeLong(this.f10580d);
        parcel.writeByteArray(this.f10581e);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10577a = readString;
        this.f10578b = parcel.readString();
        this.f10579c = parcel.readLong();
        this.f10580d = parcel.readLong();
        this.f10581e = parcel.createByteArray();
    }
}
