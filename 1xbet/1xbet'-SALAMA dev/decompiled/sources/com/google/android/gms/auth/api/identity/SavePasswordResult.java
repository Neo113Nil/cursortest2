package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new Z2.a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f10993a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        D.i(pendingIntent);
        this.f10993a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return D.m(this.f10993a, ((SavePasswordResult) obj).f10993a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10993a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f10993a, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
