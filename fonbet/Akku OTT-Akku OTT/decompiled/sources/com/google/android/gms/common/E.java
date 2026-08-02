package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.P;
import com.google.android.gms.common.internal.r0;

/* loaded from: classes4.dex */
public final class E extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<E> CREATOR = new F();
    public final String a;
    public final w b;
    public final boolean c;
    public final boolean d;

    public E(String str, w wVar, boolean z, boolean z2) {
        this.a = str;
        this.b = wVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        w wVar = this.b;
        if (wVar == null) {
            wVar = null;
        }
        com.google.android.gms.common.internal.safeparcel.c.f(parcel, 2, wVar);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public E(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                int i = v.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                com.google.android.gms.dynamic.a zzd = (queryLocalInterface instanceof P ? (P) queryLocalInterface : new r0(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.google.android.gms.dynamic.b.D(zzd);
                if (bArr != null) {
                    wVar = new w(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.b = wVar;
        this.c = z;
        this.d = z2;
    }
}
