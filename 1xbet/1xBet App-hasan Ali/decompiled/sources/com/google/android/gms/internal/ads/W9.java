package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class W9 extends AbstractC2187a {
    public static final Parcelable.Creator<W9> CREATOR = new C1812y0(27);

    /* renamed from: k, reason: collision with root package name */
    public final String f12025k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f12026l;

    public W9(String str, Bundle bundle) {
        this.f12025k = str;
        this.f12026l = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f12025k);
        AbstractC2036a.b0(parcel, 2, this.f12026l);
        AbstractC2036a.m0(parcel, k02);
    }
}
