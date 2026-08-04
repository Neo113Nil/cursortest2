package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new c(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11451a;

    public GoogleThirdPartyPaymentExtension(boolean z4) {
        this.f11451a = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GoogleThirdPartyPaymentExtension) {
            return this.f11451a == ((GoogleThirdPartyPaymentExtension) obj).f11451a;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11451a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11451a ? 1 : 0);
        D.z0(iX0, parcel);
    }
}
