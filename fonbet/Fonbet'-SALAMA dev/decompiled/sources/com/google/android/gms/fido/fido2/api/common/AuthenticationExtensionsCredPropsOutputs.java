package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new C1338c(28);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11424a;

    public AuthenticationExtensionsCredPropsOutputs(boolean z4) {
        this.f11424a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f11424a == ((AuthenticationExtensionsCredPropsOutputs) obj).f11424a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11424a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11424a ? 1 : 0);
        D.z0(x02, parcel);
    }
}
