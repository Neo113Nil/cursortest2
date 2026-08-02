package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0926e extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0926e> CREATOR = new C0935n();
    public final List<zzbe> a;
    public final int b;
    public final String c;

    @Nullable
    public final String d;

    public C0926e(ArrayList arrayList, int i, String str, @Nullable String str2) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.a);
        sb.append(", initialTrigger=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", attributionTag=");
        return androidx.concurrent.futures.a.a(sb, this.d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
