package com.google.firebase.auth.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.MultiFactorSession;
import f4.C1092d;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzao extends MultiFactorSession {
    public static final Parcelable.Creator<zzao> CREATOR = new C1092d(5);

    /* renamed from: a, reason: collision with root package name */
    public String f11925a;

    /* renamed from: b, reason: collision with root package name */
    public String f11926b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f11927c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f11928d;

    /* renamed from: e, reason: collision with root package name */
    public zzad f11929e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11925a, false);
        D.s0(parcel, 2, this.f11926b, false);
        D.w0(parcel, 3, this.f11927c, false);
        D.w0(parcel, 4, this.f11928d, false);
        D.r0(parcel, 5, this.f11929e, i7, false);
        D.z0(x02, parcel);
    }
}
