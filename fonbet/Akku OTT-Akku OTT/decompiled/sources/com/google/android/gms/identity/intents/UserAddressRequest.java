package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class UserAddressRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new a();
    public ArrayList a;

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.p(parcel, 2, this.a, false);
        c.r(parcel, q);
    }
}
