package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.EnumC0921z;

/* renamed from: com.google.android.gms.fido.fido2.api.common.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0891d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return EnumC0921z.h(parcel.readString());
        } catch (EnumC0921z.a e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EnumC0921z[i];
    }
}
