package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.p000authapi.zbbi;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class RevokeAccessRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new E();
    public final zbbi a;
    public final Account b;

    @Nullable
    public final String c;

    public RevokeAccessRequest(@NonNull List list, @NonNull Account account, @Nullable String str) {
        this.a = zbbi.zbi(list);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbi zbbiVar = this.a;
            int size = zbbiVar.size();
            zbbi zbbiVar2 = revokeAccessRequest.a;
            if (size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && C0874p.a(this.b, revokeAccessRequest.b) && C0874p.a(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
