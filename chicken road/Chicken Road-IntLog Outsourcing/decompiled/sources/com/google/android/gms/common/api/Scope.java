package com.google.android.gms.common.api;

import B1.c;
import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o1.u;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC1380a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new c(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f4972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4973b;

    public Scope(int i2, String str) {
        u.d(str, "scopeUri must not be null or empty");
        this.f4972a = i2;
        this.f4973b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4973b.equals(((Scope) obj).f4973b);
    }

    public final int hashCode() {
        return this.f4973b.hashCode();
    }

    public final String toString() {
        return this.f4973b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f4972a);
        AbstractC0169a.O(parcel, 2, this.f4973b);
        AbstractC0169a.S(parcel, R5);
    }
}
