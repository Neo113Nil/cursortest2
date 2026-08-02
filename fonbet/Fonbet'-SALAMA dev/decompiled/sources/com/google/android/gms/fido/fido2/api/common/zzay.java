package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import k3.C1338c;
import t3.k;

/* loaded from: classes.dex */
public enum zzay implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<zzay> CREATOR = new C1338c(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f11510a;

    zzay(String str) {
        this.f11510a = str;
    }

    public static zzay a(String str) {
        for (zzay zzayVar : values()) {
            if (str.equals(zzayVar.f11510a)) {
                return zzayVar;
            }
        }
        throw new k(AbstractC0486a1.h("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11510a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11510a);
    }
}
