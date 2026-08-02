package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new V2.a(17);

    /* renamed from: a, reason: collision with root package name */
    public final float f10653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10654b;

    public SmtaMetadataEntry(float f7, int i7) {
        this.f10653a = f7;
        this.f10654b = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f10653a == smtaMetadataEntry.f10653a && this.f10654b == smtaMetadataEntry.f10654b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f10653a).hashCode() + 527) * 31) + this.f10654b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f10653a + ", svcTemporalLayerCount=" + this.f10654b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f10653a);
        parcel.writeInt(this.f10654b);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f10653a = parcel.readFloat();
        this.f10654b = parcel.readInt();
    }
}
