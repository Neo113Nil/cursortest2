package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980fc extends AbstractC2187a {
    public static final Parcelable.Creator<C0980fc> CREATOR = new C0730Zb(2);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13471k;

    /* renamed from: l, reason: collision with root package name */
    public final List f13472l;

    public C0980fc(boolean z3, List list) {
        this.f13471k = z3;
        this.f13472l = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f13471k ? 1 : 0);
        AbstractC2036a.h0(parcel, 3, this.f13472l);
        AbstractC2036a.m0(parcel, k02);
    }
}
