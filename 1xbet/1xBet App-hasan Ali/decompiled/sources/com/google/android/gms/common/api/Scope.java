package com.google.android.gms.common.api;

import C2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC2187a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a(19);

    /* renamed from: k, reason: collision with root package name */
    public final int f7481k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7482l;

    public Scope(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f7481k = i;
        this.f7482l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f7482l.equals(((Scope) obj).f7482l);
    }

    public final int hashCode() {
        return this.f7482l.hashCode();
    }

    public final String toString() {
        return this.f7482l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f7481k);
        AbstractC2036a.f0(parcel, 2, this.f7482l);
        AbstractC2036a.m0(parcel, k02);
    }
}
