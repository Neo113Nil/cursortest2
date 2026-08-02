package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new Z2.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f10949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10950b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10951c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10952d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f10953e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f10954f;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f10949a = str;
        this.f10950b = str2;
        this.f10951c = str3;
        D.i(arrayList);
        this.f10952d = arrayList;
        this.f10954f = pendingIntent;
        this.f10953e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return D.m(this.f10949a, authorizationResult.f10949a) && D.m(this.f10950b, authorizationResult.f10950b) && D.m(this.f10951c, authorizationResult.f10951c) && D.m(this.f10952d, authorizationResult.f10952d) && D.m(this.f10954f, authorizationResult.f10954f) && D.m(this.f10953e, authorizationResult.f10953e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10949a, this.f10950b, this.f10951c, this.f10952d, this.f10954f, this.f10953e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f10949a, false);
        Y4.D.s0(parcel, 2, this.f10950b, false);
        Y4.D.s0(parcel, 3, this.f10951c, false);
        Y4.D.u0(parcel, 4, this.f10952d);
        Y4.D.r0(parcel, 5, this.f10953e, i7, false);
        Y4.D.r0(parcel, 6, this.f10954f, i7, false);
        Y4.D.z0(x02, parcel);
    }
}
