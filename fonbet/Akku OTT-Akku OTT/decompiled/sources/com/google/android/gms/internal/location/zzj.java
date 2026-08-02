package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.e;
import androidx.fragment.app.v;
import com.google.android.gms.common.internal.C0862d;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.T;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzj extends a {
    final T zzc;
    final List<C0862d> zzd;

    @Nullable
    final String zze;

    @VisibleForTesting
    static final List<C0862d> zza = Collections.EMPTY_LIST;
    static final T zzb = new T();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(T t, List<C0862d> list, String str) {
        this.zzc = t;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return C0874p.a(this.zzc, zzjVar.zzc) && C0874p.a(this.zzd, zzjVar.zzd) && C0874p.a(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        e.d(sb, "DeviceOrientationRequestInternal{deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return v.a(sb, ", tag='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 1, this.zzc, i, false);
        c.p(parcel, 2, this.zzd, false);
        c.l(parcel, 3, this.zze, false);
        c.r(parcel, q);
    }
}
