package com.google.android.gms.auth;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10877b;

    public AccountChangeEventsResponse(ArrayList arrayList, int i7) {
        this.f10876a = i7;
        D.i(arrayList);
        this.f10877b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10876a);
        Y4.D.w0(parcel, 2, this.f10877b, false);
        Y4.D.z0(iX0, parcel);
    }
}
