package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.E;

/* renamed from: com.google.android.gms.fido.fido2.api.common.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0901i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return E.a.h(parcel.readString());
        } catch (E.b e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E.a[i];
    }
}
