package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class Tile extends a {

    @NonNull
    public static final Parcelable.Creator<Tile> CREATOR = new zzs();

    @Nullable
    public final byte[] data;
    public final int height;
    public final int width;

    public Tile(int i, int i2, @Nullable byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.width;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.height;
        c.s(parcel, 3, 4);
        parcel.writeInt(i3);
        c.c(parcel, 4, this.data, false);
        c.r(parcel, q);
    }
}
