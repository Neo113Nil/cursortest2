package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new Z2.a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f10975a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        D.i(pendingIntent);
        this.f10975a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f10975a, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
