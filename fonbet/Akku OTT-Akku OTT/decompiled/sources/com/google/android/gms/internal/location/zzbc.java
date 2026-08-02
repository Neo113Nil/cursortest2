package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.AbstractBinderC0939s;
import com.google.android.gms.location.InterfaceC0941u;
import com.google.android.gms.location.w;
import com.google.android.gms.location.x;

/* loaded from: classes4.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;

    @Nullable
    final zzba zzb;

    @Nullable
    final x zzc;

    @Nullable
    final PendingIntent zzd;

    @Nullable
    final InterfaceC0941u zze;

    @Nullable
    final zzai zzf;

    public zzbc(int i, @Nullable zzba zzbaVar, @Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent, @Nullable IBinder iBinder2, @Nullable IBinder iBinder3) {
        this.zza = i;
        this.zzb = zzbaVar;
        zzai zzaiVar = null;
        this.zzc = iBinder == null ? null : w.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : AbstractBinderC0939s.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof zzai ? (zzai) queryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.x] */
    public static zzbc zza(x xVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, xVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, @Nullable zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.u] */
    public static zzbc zzc(InterfaceC0941u interfaceC0941u, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, interfaceC0941u, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        c.k(parcel, 2, this.zzb, i, false);
        x xVar = this.zzc;
        c.f(parcel, 3, xVar == null ? null : xVar.asBinder());
        c.k(parcel, 4, this.zzd, i, false);
        InterfaceC0941u interfaceC0941u = this.zze;
        c.f(parcel, 5, interfaceC0941u == null ? null : interfaceC0941u.asBinder());
        zzai zzaiVar = this.zzf;
        c.f(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null);
        c.r(parcel, q);
    }
}
