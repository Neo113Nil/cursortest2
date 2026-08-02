package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t3.l;

/* loaded from: classes.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new l(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f11450a;

    public FidoAppIdExtension(String str) {
        D.i(str);
        this.f11450a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f11450a.equals(((FidoAppIdExtension) obj).f11450a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11450a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 2, this.f11450a, false);
        Y4.D.z0(x02, parcel);
    }
}
