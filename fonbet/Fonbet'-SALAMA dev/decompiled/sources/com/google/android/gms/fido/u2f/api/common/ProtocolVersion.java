package com.google.android.gms.fido.u2f.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import t3.l;
import u3.b;

@Deprecated
/* loaded from: classes.dex */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator<ProtocolVersion> CREATOR = new l(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f11534a;

    ProtocolVersion(String str) {
        this.f11534a = str;
    }

    public static ProtocolVersion a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.f11534a)) {
                return protocolVersion;
            }
        }
        throw new b(AbstractC0486a1.h("Protocol version ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11534a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11534a);
    }
}
