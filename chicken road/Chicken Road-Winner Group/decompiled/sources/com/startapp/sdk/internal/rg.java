package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class rg extends t6 {
    public static final Parcelable.Creator<rg> CREATOR = new qg();
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4303g;

    public rg() {
        this.f = 0.9f;
        this.f4303g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.sdk.internal.t6, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.f4303g);
    }

    public rg(Parcel parcel) {
        super(parcel);
        this.f = parcel.readFloat();
        this.f4303g = parcel.readFloat();
    }
}
