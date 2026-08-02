package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes4.dex */
public final class i0 implements Parcelable.Creator {
    public static void a(C0865g c0865g, Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        int i2 = c0865g.a;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = c0865g.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = c0865g.c;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(i4);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, c0865g.d, false);
        com.google.android.gms.common.internal.safeparcel.c.f(parcel, 5, c0865g.e);
        com.google.android.gms.common.internal.safeparcel.c.o(parcel, 6, c0865g.f, i);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 7, c0865g.i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 8, c0865g.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.o(parcel, 10, c0865g.k, i);
        com.google.android.gms.common.internal.safeparcel.c.o(parcel, 11, c0865g.l, i);
        boolean z = c0865g.m;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = c0865g.n;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = c0865g.o;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 15, c0865g.p, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = C0865g.q;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        C0854d[] c0854dArr = C0865g.r;
        C0854d[] c0854dArr2 = c0854dArr;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 5:
                    iBinder = com.google.android.gms.common.internal.safeparcel.b.s(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.safeparcel.b.j(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
                case '\n':
                    c0854dArr = (C0854d[]) com.google.android.gms.common.internal.safeparcel.b.j(parcel, readInt, C0854d.CREATOR);
                    break;
                case 11:
                    c0854dArr2 = (C0854d[]) com.google.android.gms.common.internal.safeparcel.b.j(parcel, readInt, C0854d.CREATOR);
                    break;
                case '\f':
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case '\r':
                    i4 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 14:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 15:
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0865g(i, i2, i3, str, iBinder, scopeArr, bundle, account, c0854dArr, c0854dArr2, z2, i4, z3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0865g[i];
    }
}
