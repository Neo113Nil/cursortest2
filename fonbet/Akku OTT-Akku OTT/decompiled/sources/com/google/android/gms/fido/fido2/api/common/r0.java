package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        r rVar = null;
        G0 g0 = null;
        F f = null;
        M0 m0 = null;
        L l = null;
        N n = null;
        I0 i0 = null;
        Q q = null;
        C0914s c0914s = null;
        V v = null;
        C0897g0 c0897g0 = null;
        T t = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    rVar = (r) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, r.CREATOR);
                    break;
                case 3:
                    g0 = (G0) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, G0.CREATOR);
                    break;
                case 4:
                    f = (F) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, F.CREATOR);
                    break;
                case 5:
                    m0 = (M0) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, M0.CREATOR);
                    break;
                case 6:
                    l = (L) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, L.CREATOR);
                    break;
                case 7:
                    n = (N) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, N.CREATOR);
                    break;
                case '\b':
                    i0 = (I0) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, I0.CREATOR);
                    break;
                case '\t':
                    q = (Q) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Q.CREATOR);
                    break;
                case '\n':
                    c0914s = (C0914s) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0914s.CREATOR);
                    break;
                case 11:
                    v = (V) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, V.CREATOR);
                    break;
                case '\f':
                    c0897g0 = (C0897g0) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0897g0.CREATOR);
                    break;
                case '\r':
                    t = (T) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, T.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0890d(rVar, g0, f, m0, l, n, i0, q, c0914s, v, c0897g0, t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0890d[i];
    }
}
