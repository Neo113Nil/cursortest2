package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import u3.C1646a;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ChannelIdValue.j(parcel.readInt());
        } catch (C1646a e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new ChannelIdValue.ChannelIdValueType[i7];
    }
}
