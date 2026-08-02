package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new Z2.a(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10943c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10944d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f10945e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10946f;

    /* renamed from: x, reason: collision with root package name */
    public final String f10947x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10948y;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z4, boolean z7, Account account, String str2, String str3, boolean z8) {
        boolean z9 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z9 = true;
        }
        D.a("requestedScopes cannot be null or empty", z9);
        this.f10941a = arrayList;
        this.f10942b = str;
        this.f10943c = z4;
        this.f10944d = z7;
        this.f10945e = account;
        this.f10946f = str2;
        this.f10947x = str3;
        this.f10948y = z8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f10941a;
        return arrayList.size() == authorizationRequest.f10941a.size() && arrayList.containsAll(authorizationRequest.f10941a) && this.f10943c == authorizationRequest.f10943c && this.f10948y == authorizationRequest.f10948y && this.f10944d == authorizationRequest.f10944d && D.m(this.f10942b, authorizationRequest.f10942b) && D.m(this.f10945e, authorizationRequest.f10945e) && D.m(this.f10946f, authorizationRequest.f10946f) && D.m(this.f10947x, authorizationRequest.f10947x);
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f10943c);
        Boolean valueOf2 = Boolean.valueOf(this.f10948y);
        Boolean valueOf3 = Boolean.valueOf(this.f10944d);
        return Arrays.hashCode(new Object[]{this.f10941a, this.f10942b, valueOf, valueOf2, valueOf3, this.f10945e, this.f10946f, this.f10947x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.w0(parcel, 1, this.f10941a, false);
        Y4.D.s0(parcel, 2, this.f10942b, false);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10943c ? 1 : 0);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10944d ? 1 : 0);
        Y4.D.r0(parcel, 5, this.f10945e, i7, false);
        Y4.D.s0(parcel, 6, this.f10946f, false);
        Y4.D.s0(parcel, 7, this.f10947x, false);
        Y4.D.B0(parcel, 8, 4);
        parcel.writeInt(this.f10948y ? 1 : 0);
        Y4.D.z0(x02, parcel);
    }
}
