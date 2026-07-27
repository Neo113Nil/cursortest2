package com.google.android.gms.common.api;

import F2.b;
import H.j;
import T0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new j(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f2565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2566b;

    public Scope(int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f2565a = i3;
        this.f2566b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2566b.equals(((Scope) obj).f2566b);
    }

    public final int hashCode() {
        return this.f2566b.hashCode();
    }

    public final String toString() {
        return this.f2566b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = b.Q(parcel, 20293);
        b.S(parcel, 1, 4);
        parcel.writeInt(this.f2565a);
        b.N(parcel, 2, this.f2566b);
        b.R(parcel, Q2);
    }
}
