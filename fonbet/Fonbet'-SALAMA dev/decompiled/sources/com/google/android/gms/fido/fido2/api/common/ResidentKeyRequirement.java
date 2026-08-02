package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import k3.C1338c;
import t3.i;

/* loaded from: classes.dex */
public enum ResidentKeyRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new C1338c(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f11495a;

    ResidentKeyRequirement(String str) {
        this.f11495a = str;
    }

    public static ResidentKeyRequirement a(String str) {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.f11495a)) {
                return residentKeyRequirement;
            }
        }
        throw new i(AbstractC0486a1.h("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11495a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11495a);
    }
}
