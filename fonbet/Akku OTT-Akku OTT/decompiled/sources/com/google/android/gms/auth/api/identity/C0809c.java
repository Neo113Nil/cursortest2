package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.identity.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0809c extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0809c> CREATOR = new s();

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;
    public final List d;

    @Nullable
    public final GoogleSignInAccount e;

    @Nullable
    public final PendingIntent f;

    public C0809c(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull ArrayList arrayList, @Nullable GoogleSignInAccount googleSignInAccount, @Nullable PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        C0875q.g(arrayList);
        this.d = arrayList;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0809c)) {
            return false;
        }
        C0809c c0809c = (C0809c) obj;
        return C0874p.a(this.a, c0809c.a) && C0874p.a(this.b, c0809c.b) && C0874p.a(this.c, c0809c.c) && C0874p.a(this.d, c0809c.d) && C0874p.a(this.f, c0809c.f) && C0874p.a(this.e, c0809c.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 4, this.d);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 6, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
