package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new Z2.a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11076b;

    public Scope(int i7, String str) {
        D.f(str, "scopeUri must not be null or empty");
        this.f11075a = i7;
        this.f11076b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f11076b.equals(((Scope) obj).f11076b);
    }

    public final int hashCode() {
        return this.f11076b.hashCode();
    }

    public final String toString() {
        return this.f11076b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11075a);
        Y4.D.s0(parcel, 2, this.f11076b, false);
        Y4.D.z0(iX0, parcel);
    }
}
