package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new c(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11500a;

    public UserVerificationMethodExtension(boolean z4) {
        this.f11500a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.f11500a == ((UserVerificationMethodExtension) obj).f11500a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11500a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11500a ? 1 : 0);
        D.z0(iX0, parcel);
    }
}
