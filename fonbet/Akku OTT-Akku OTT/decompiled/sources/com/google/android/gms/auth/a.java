package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public a(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        C0875q.g(str);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && C0874p.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && C0874p.a(this.f, aVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    @NonNull
    public final String toString() {
        int i = this.d;
        StringBuilder a = androidx.datastore.preferences.protobuf.c.a("AccountChangeEvent {accountName = ", this.c, ", changeType = ", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED", ", changeData = ");
        a.append(this.f);
        a.append(", eventIndex = ");
        a.append(this.e);
        a.append("}");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
