package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.MeasurementUnit;
import k3.C1338c;
import t3.c;

/* loaded from: classes.dex */
public enum AttestationConveyancePreference implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(MeasurementUnit.NONE),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new C1338c(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f11409a;

    AttestationConveyancePreference(String str) {
        this.f11409a = str;
    }

    public static AttestationConveyancePreference a(String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.f11409a)) {
                return attestationConveyancePreference;
            }
        }
        throw new c(AbstractC0486a1.h("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11409a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11409a);
    }
}
