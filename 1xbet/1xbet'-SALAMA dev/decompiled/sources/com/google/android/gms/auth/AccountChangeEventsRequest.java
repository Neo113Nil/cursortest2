package com.google.android.gms.auth;

import V2.a;
import Y4.D;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f10875d;

    public AccountChangeEventsRequest(int i7, int i8, String str, Account account) {
        this.f10872a = i7;
        this.f10873b = i8;
        this.f10874c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f10875d = account;
        } else {
            this.f10875d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10872a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10873b);
        D.s0(parcel, 3, this.f10874c, false);
        D.r0(parcel, 4, this.f10875d, i7, false);
        D.z0(iX0, parcel);
    }
}
