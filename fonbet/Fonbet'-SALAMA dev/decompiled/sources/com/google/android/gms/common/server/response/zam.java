package com.google.android.gms.common.server.response;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new E(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f11397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11398b;

    /* renamed from: c, reason: collision with root package name */
    public final FastJsonResponse$Field f11399c;

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str) {
        this.f11397a = 1;
        this.f11398b = str;
        this.f11399c = fastJsonResponse$Field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11397a);
        D.s0(parcel, 2, this.f11398b, false);
        D.r0(parcel, 3, this.f11399c, i7, false);
        D.z0(x02, parcel);
    }

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str, int i7) {
        this.f11397a = i7;
        this.f11398b = str;
        this.f11399c = fastJsonResponse$Field;
    }
}
