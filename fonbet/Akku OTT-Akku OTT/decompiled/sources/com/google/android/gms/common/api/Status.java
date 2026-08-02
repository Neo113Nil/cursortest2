package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.a implements l, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR;

    @NonNull
    public static final Status e;

    @NonNull
    public static final Status f;

    @NonNull
    public static final Status i;

    @NonNull
    public static final Status j;

    @NonNull
    public static final Status k;
    public final int a;

    @Nullable
    public final String b;

    @Nullable
    public final PendingIntent c;

    @Nullable
    public final C0852b d;

    static {
        new Status(-1, null, null, null);
        e = new Status(0, null, null, null);
        f = new Status(14, null, null, null);
        i = new Status(8, null, null, null);
        j = new Status(15, null, null, null);
        k = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new v();
    }

    public Status(int i2, @Nullable String str, @Nullable PendingIntent pendingIntent, @Nullable C0852b c0852b) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = c0852b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && C0874p.a(this.b, status.b) && C0874p.a(this.c, status.c) && C0874p.a(this.d, status.d);
    }

    @Override // com.google.android.gms.common.api.l
    @NonNull
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final boolean l() {
        return this.a <= 0;
    }

    @NonNull
    public final String toString() {
        C0874p.a aVar = new C0874p.a(this);
        String str = this.b;
        if (str == null) {
            str = d.a(this.a);
        }
        aVar.a(str, "statusCode");
        aVar.a(this.c, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i2, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.d, i2, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
