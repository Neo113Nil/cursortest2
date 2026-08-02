package com.google.android.exoplayer2.metadata.dvbsi;

import B2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import e1.k;

/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new e(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f10573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10574b;

    public AppInfoTable(int i7, String str) {
        this.f10573a = i7;
        this.f10574b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f10573a);
        sb.append(",url=");
        return k.i(sb, this.f10574b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10574b);
        parcel.writeInt(this.f10573a);
    }
}
