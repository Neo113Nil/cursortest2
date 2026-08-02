package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new Z2.a(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f10976a;

    public GetPhoneNumberHintIntentRequest(int i7) {
        this.f10976a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return D.m(Integer.valueOf(this.f10976a), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f10976a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10976a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10976a);
        Y4.D.z0(x02, parcel);
    }
}
