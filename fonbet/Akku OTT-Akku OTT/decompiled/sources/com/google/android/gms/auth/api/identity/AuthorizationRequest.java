package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class AuthorizationRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new r();
    public final List a;

    @Nullable
    public final String b;
    public final boolean c;
    public final boolean d;

    @Nullable
    public final Account e;

    @Nullable
    public final String f;

    @Nullable
    public final String i;
    public final boolean j;

    @Nullable
    public final Bundle k;
    public final boolean l;

    public AuthorizationRequest(List list, @Nullable String str, boolean z, boolean z2, @Nullable Account account, @Nullable String str2, @Nullable String str3, boolean z3, @Nullable Bundle bundle, boolean z4) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        C0875q.b(z5, "requestedScopes cannot be null or empty");
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.i = str3;
        this.j = z3;
        this.k = bundle;
        this.l = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.a;
        int size = list.size();
        List list2 = authorizationRequest.a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.k;
            Bundle bundle2 = this.k;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!C0874p.a(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.c == authorizationRequest.c && this.j == authorizationRequest.j && this.d == authorizationRequest.d && this.l == authorizationRequest.l && C0874p.a(this.b, authorizationRequest.b) && C0874p.a(this.e, authorizationRequest.e) && C0874p.a(this.f, authorizationRequest.f) && C0874p.a(this.i, authorizationRequest.i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.j), Boolean.valueOf(this.d), this.e, this.f, this.i, this.k, Boolean.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 8, 4);
        parcel.writeInt(this.j ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 9, this.k, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 10, 4);
        parcel.writeInt(this.l ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
