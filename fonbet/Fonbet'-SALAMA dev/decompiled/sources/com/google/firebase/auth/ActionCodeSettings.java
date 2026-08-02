package com.google.firebase.auth;

import I2.C0306n;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new E(9);

    /* renamed from: A, reason: collision with root package name */
    public final String f11830A;

    /* renamed from: B, reason: collision with root package name */
    public final String f11831B;

    /* renamed from: a, reason: collision with root package name */
    public final String f11832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11833b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11834c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11835d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11836e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11837f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11838x;

    /* renamed from: y, reason: collision with root package name */
    public String f11839y;

    /* renamed from: z, reason: collision with root package name */
    public int f11840z;

    public ActionCodeSettings(C0306n c0306n) {
        this.f11832a = c0306n.f3631a;
        this.f11833b = c0306n.f3632b;
        this.f11834c = null;
        this.f11835d = c0306n.f3633c;
        this.f11836e = c0306n.f3634d;
        this.f11837f = (String) c0306n.f3636f;
        this.f11838x = c0306n.f3635e;
        this.f11830A = (String) c0306n.f3637g;
        this.f11831B = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11832a, false);
        D.s0(parcel, 2, this.f11833b, false);
        D.s0(parcel, 3, this.f11834c, false);
        D.s0(parcel, 4, this.f11835d, false);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11836e ? 1 : 0);
        D.s0(parcel, 6, this.f11837f, false);
        D.B0(parcel, 7, 4);
        parcel.writeInt(this.f11838x ? 1 : 0);
        D.s0(parcel, 8, this.f11839y, false);
        int i8 = this.f11840z;
        D.B0(parcel, 9, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 10, this.f11830A, false);
        D.s0(parcel, 11, this.f11831B, false);
        D.z0(x02, parcel);
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z4, String str5, boolean z7, String str6, int i7, String str7, String str8) {
        this.f11832a = str;
        this.f11833b = str2;
        this.f11834c = str3;
        this.f11835d = str4;
        this.f11836e = z4;
        this.f11837f = str5;
        this.f11838x = z7;
        this.f11839y = str6;
        this.f11840z = i7;
        this.f11830A = str7;
        this.f11831B = str8;
    }
}
