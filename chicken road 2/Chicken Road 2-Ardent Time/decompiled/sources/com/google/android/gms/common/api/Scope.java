package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class Scope extends q0.AbstractC0980a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new C.l(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f2592a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2593b;

    public Scope(int i2, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f2592a = i2;
        this.f2593b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.Scope)) {
            return false;
        }
        return this.f2593b.equals(((com.google.android.gms.common.api.Scope) obj).f2593b);
    }

    public final int hashCode() {
        return this.f2593b.hashCode();
    }

    public final java.lang.String toString() {
        return this.f2593b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f2592a);
        a.AbstractC0059a.D(parcel, 2, this.f2593b);
        a.AbstractC0059a.H(parcel, G);
    }
}
