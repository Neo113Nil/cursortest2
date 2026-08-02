package com.google.android.gms.internal.p000authapi;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbp> CREATOR = new zbq();
    private final Credential zba;

    public zbp(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.r0(parcel, 1, this.zba, i7, false);
        D.z0(x02, parcel);
    }
}
