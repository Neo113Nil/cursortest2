package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.EnumC0888c;

/* renamed from: com.google.android.gms.fido.fido2.api.common.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0905k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return EnumC0888c.h(parcel.readString());
        } catch (EnumC0888c.a e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EnumC0888c[i];
    }
}
